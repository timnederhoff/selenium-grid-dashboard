package org.selenium.tools.dashboard.services.services;

import org.selenium.tools.dashboard.DashboardConfig;
import org.selenium.tools.dashboard.model.GridStatus;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Future;

@Service
public class GridStatusLookupServiceASync {
    private RestTemplate restTemplate;

    public GridStatusLookupServiceASync() {
        restTemplate = new RestTemplate();
        ((SimpleClientHttpRequestFactory)restTemplate.getRequestFactory()).setConnectTimeout(DashboardConfig.config.getInt("grid_status.connectTimeout"));
        ((SimpleClientHttpRequestFactory)restTemplate.getRequestFactory()).setReadTimeout(DashboardConfig.config.getInt("grid_status.readTimeout"));
    }

    @Async
    public Future<GridStatus> getGridStatus(String baseUrl){
        GridStatus gridStatus;
        try {
            gridStatus = restTemplate.getForObject(
                    baseUrl + ":" +
                    DashboardConfig.config.getString("port") +
                    DashboardConfig.config.getString("grid_status.endpoint"), GridStatus.class);
            gridStatus.setLoadedSuccessfully(true);
        } catch (RestClientException e) {
            e.printStackTrace();
            gridStatus = new GridStatus();
            gridStatus.setLoadedSuccessfully(false);
            gridStatus.setErrorMessage(e.getMessage());
        }
        return new AsyncResult<GridStatus>(gridStatus);
    }
}
