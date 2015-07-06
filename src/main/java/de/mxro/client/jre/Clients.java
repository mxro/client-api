package de.mxro.client.jre;

import delight.async.properties.jre.Properties;
import delight.concurrency.jre.ConcurrencyJre;
import delight.promise.jre.Promises;

import de.mxro.async.log.jre.Logs;
import de.mxro.client.Client;
import de.mxro.client.ClientsCommon;
import de.mxro.client.internal.ClientImpl;
import de.mxro.metrics.jre.Metrics;

public class Clients extends ClientsCommon {

    public static Client create() {
        final Client client = new ClientImpl();

        registerFactories(client);

        return client;
    }

    private static Client registerFactories(final Client forClient) {
        forClient.factories().register(Promises.createPromiseFactory());

        forClient.factories().register(Properties.createPropertiesFactory());

        forClient.factories().register(Metrics.createMetricsFactory());

        forClient.factories().register(Logs.createLogsFactory());

        forClient.factories().register(ConcurrencyJre.createFactory());

        return forClient;
    }

}
