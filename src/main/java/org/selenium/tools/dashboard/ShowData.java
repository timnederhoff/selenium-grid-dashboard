package org.selenium.tools.dashboard;

import com.typesafe.config.Config;
import org.selenium.tools.dashboard.services.services.AllInfoServiceASync;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


@Component
public class ShowData {

    @Autowired
    private AllInfoServiceASync allInfoServiceASync;

    private List<String> messages;

    public ShowData() {
    }

    public Map<String, AllInfo> allData() throws Exception {

        messages = new ArrayList<>();
        List<? extends Config> machinesList= DashboardConfig.config.getConfigList("machines");
        List<Future> allInfos = new ArrayList<>();
        for (Config machine : machinesList) {
            allInfos.add(allInfoServiceASync.getAllInfoFuture(machine.getString("name"), machine.getString("url")));
        }

        Map<String, AllInfo> allMachineInfo = new LinkedHashMap<String, AllInfo>();
        for (Future<AllInfo> machine : allInfos ) {
            if (
                    !machine.get().getConfig().isLoadedSuccessfully() ||
                    !machine.get().getGridStatus().isLoadedSuccessfully() ||
                    !machine.get().getSystemInfo().isLoadedSuccessfully()
                    ) {
                messages.add("Couldn't load " + machine.get().getMachineName() + ", error: " + machine.get().getConfig().getErrorMessage());
            } else {
                AllInfo allInfo = machine.get();
                allMachineInfo.put(allInfo.getMachineName(), allInfo);
            }
        }

        return allMachineInfo;
    }

    public List<String> getMessages() {
        return messages;
    }

}
