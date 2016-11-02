package org.selenium.tools.dashboard.services.services;

import org.selenium.tools.dashboard.DashboardConfig;
import org.selenium.tools.dashboard.model.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Future;

@Service
public class ConfigLookupServiceASync {
    private RestTemplate restTemplate;

    public ConfigLookupServiceASync() {
        restTemplate = new RestTemplate();
        ((SimpleClientHttpRequestFactory)restTemplate.getRequestFactory()).setConnectTimeout(DashboardConfig.config.getInt("config.connectTimeout"));
        ((SimpleClientHttpRequestFactory)restTemplate.getRequestFactory()).setReadTimeout(DashboardConfig.config.getInt("config.readTimeout"));
    }

    @Async
    public Future<Configuration> getConfig(String baseUrl) {
        Configuration config;
        try {
            config = restTemplate.getForObject(
                    baseUrl + ":" + DashboardConfig.config.getString("port") +
                    DashboardConfig.config.getString("config.endpoint"), Configuration.class);
            config.setLoadedSuccessfully(true);
        } catch (RestClientException e) {
            e.printStackTrace();
            config = new Configuration();
            config.setLoadedSuccessfully(false);
            config.setErrorMessage(e.getMessage());
        }
        return new AsyncResult<Configuration>(config);
    }
}
