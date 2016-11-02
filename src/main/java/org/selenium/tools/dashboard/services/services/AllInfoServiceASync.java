package org.selenium.tools.dashboard.services.services;

import org.selenium.tools.dashboard.AllInfo;
import org.selenium.tools.dashboard.model.Configuration;
import org.selenium.tools.dashboard.model.GridStatus;
import org.selenium.tools.dashboard.model.SystemInfo;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

@Service
public class AllInfoServiceASync {

    public AllInfoServiceASync(){

    }

    @Async
    public Future<AllInfo> getAllInfoFuture(String machineName, String baseUrl) throws Exception {
        Future<Configuration> config = (new ConfigLookupServiceASync()).getConfig(baseUrl);
        Future<SystemInfo> systemInfo = (new SystemInfoLookupServiceASync()).getSystemInfo(baseUrl);
        Future<GridStatus> gridStatus = (new GridStatusLookupServiceASync()).getGridStatus(baseUrl);

        return new AsyncResult<AllInfo>(new AllInfo(machineName, baseUrl, config.get(), systemInfo.get(), gridStatus.get()));
    }
}
