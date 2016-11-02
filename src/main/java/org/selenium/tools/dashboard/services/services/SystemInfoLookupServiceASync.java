package org.selenium.tools.dashboard.services.services;

import org.selenium.tools.dashboard.DashboardConfig;
import org.selenium.tools.dashboard.model.SystemInfo;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Future;

@Service
public class SystemInfoLookupServiceASync {
    private RestTemplate restTemplate;

    public SystemInfoLookupServiceASync() {
        restTemplate = new RestTemplate();
        ((SimpleClientHttpRequestFactory)restTemplate.getRequestFactory()).setConnectTimeout(DashboardConfig.config.getInt("system.connectTimeout"));
        ((SimpleClientHttpRequestFactory)restTemplate.getRequestFactory()).setReadTimeout(DashboardConfig.config.getInt("system.readTimeout"));
    }

    @Async
    public Future<SystemInfo> getSystemInfo(String baseUrl){
        SystemInfo systemInfo;
        try {
            systemInfo = restTemplate.getForObject(
                    baseUrl + ":" +
                            DashboardConfig.config.getString("port") +
                            DashboardConfig.config.getString("system.endpoint"), SystemInfo.class);
            systemInfo.setLoadedSuccessfully(true);
        } catch (RestClientException e) {
            e.printStackTrace();
            systemInfo = new SystemInfo();
            systemInfo.setLoadedSuccessfully(false);
            systemInfo.setErrorMessage(e.getMessage());
        }
        return new AsyncResult<SystemInfo>(systemInfo);
    }
}
