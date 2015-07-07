package de.mxro.client.jre;

import delight.async.properties.jre.Properties;
import delight.concurrency.jre.ConcurrencyJre;
import delight.promise.jre.Promises;

import de.mxro.async.log.jre.Logs;
import de.mxro.client.BasicClient;
import de.mxro.client.ClientsCommon;
import de.mxro.client.internal.ClientImpl;
import de.mxro.metrics.jre.Metrics;

public class Clients extends ClientsCommon {

    public static BasicClient create() {
        final BasicClient client = new ClientImpl();

        registerFactories(client);

        return client;
    }

    private static BasicClient registerFactories(final BasicClient forClient) {
        forClient.factories().register(Promises.createPromiseFactory());

        forClient.factories().register(Properties.createPropertiesFactory());

        forClient.factories().register(Metrics.createMetricsFactory());

        forClient.factories().register(Logs.createLogsFactory());

        forClient.factories().register(ConcurrencyJre.createFactory());

        return forClient;
    }

}
