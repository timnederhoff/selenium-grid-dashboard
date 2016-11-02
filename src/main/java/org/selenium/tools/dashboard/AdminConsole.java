package org.selenium.tools.dashboard;

import org.selenium.tools.dashboard.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Map;

@Controller
@EnableAsync
@SpringBootApplication
public class AdminConsole {

    @Autowired
    private ShowData showData;

    private final String port = DashboardConfig.config.getString("port");

    private Map<String, AllInfo> allMachineInfo;

    @RequestMapping("/")
    String index(Model model) throws Exception{
        allMachineInfo = showData.allData();
        model.addAttribute("dangermessages", showData.getMessages());
        model.addAttribute("info", allMachineInfo);
        model.addAttribute("extrasport", port);
        return "index";
    }

    @RequestMapping("reboot")
    String reboot(@RequestParam(value = "machinename", required = true) String machineName, Model model) throws Exception {
        ExtrasResponse response = extrasAction(allMachineInfo.get(machineName).getBaseUrl() + ":" + port + "/reboot");
        System.out.println(response);
        allMachineInfo = showData.allData();
        model.addAttribute("info", allMachineInfo);
        passResultToModel("Reboot machine", model, response);
        return "index";
    }

    @RequestMapping("stop_grid")
    String stopGrid(@RequestParam(value = "machinename", required = true) String machineName, Model model) throws Exception {
        ExtrasResponse response = extrasAction(allMachineInfo.get(machineName).getBaseUrl()
                + ":" + port
                + "/stop_grid?port="
                + allMachineInfo.get(machineName).getConfig().getConfig_runtime().getGridNodeList()[0].getConfiguration().getPort());
        System.out.println(response);
        allMachineInfo = showData.allData();
        model.addAttribute("info", allMachineInfo);
        passResultToModel("Stop grid", model, response);
        return "index";
    }

    @RequestMapping("start_grid")
    String startGrid(@RequestParam(value = "machinename", required = true) String machineName, Model model) throws Exception {
        ExtrasResponse response = extrasAction(allMachineInfo.get(machineName).getBaseUrl() + ":" + port + "/start_grid");
        System.out.println(response);
        allMachineInfo = showData.allData();
        model.addAttribute("info", allMachineInfo);
        passResultToModel("Start grid", model, response);
        return "index";
    }

    @RequestMapping("stop_extras")
    String stopExtras(@RequestParam(value = "machinename", required = true) String machineName) throws Exception {
        System.out.println(extrasAction(allMachineInfo.get(machineName).getBaseUrl() + ":" + port + "/stop_extras?confirm=true"));
        return "index";
    }

    @RequestMapping("/nodedetails")
    String nodeDetails(Model model) throws Exception {
        model.addAttribute("info", allMachineInfo);
        return "nodedetails";
    }

    @RequestMapping("/gridconsole")
    String gridConsole(Model model) throws Exception {
        model.addAttribute("info", allMachineInfo);
        return "gridconsole";
    }

    public static void main(String[] args) throws Exception {
        if (args != null && args.length > 0) {
            DashboardConfig.loadConfig(args[0]);
        } else {
            DashboardConfig.loadConfig();
        }
        SpringApplication.run(AdminConsole.class, args);
    }

    private ExtrasResponse extrasAction(String url) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, ExtrasResponse.class);
    }

    private void passResultToModel(String task, Model model, ExtrasResponse response) {
        String message = task + ":";
        String optionalComma;
        if (response.getOut() != null && response.getOut().length > 0) {
            message += " Out: " + Arrays.toString(response.getOut());
        }
        if (response.getError() != null && response.getError().length > 0) {
            optionalComma = message.endsWith(":") ? "" : ",";
            message += optionalComma + " Error: " + Arrays.toString(response.getError());
        }
        if (response.getCommand() != null && response.getCommand().length > 0) {
            optionalComma = message.endsWith(":") ? "" : ",";
            message += optionalComma + " Command: " + Arrays.toString(response.getCommand());
        }
        switch (response.getExitCode()) {
            case 0 : model.addAttribute("successmessages", message); break;
            case 1 : model.addAttribute("dangermessages", message); break;
        }

    }

}
