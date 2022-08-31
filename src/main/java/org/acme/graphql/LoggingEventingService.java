package org.acme.graphql;

import io.smallrye.graphql.spi.EventingService;

public class LoggingEventingService implements EventingService {
    @Override
    public String getConfigKey() {
        return "org.acme.graphql.LoggingEventingService.enabled";
    }

    @Override
    public void errorDataFetch(String executionId, Throwable t) {
        System.out.println("errorDataFetch " + executionId + " " + t.getMessage());
    }
}
