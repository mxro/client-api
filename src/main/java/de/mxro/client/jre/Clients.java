package de.mxro.client.jre;

import de.mxro.async.log.jre.Logs;
import de.mxro.async.properties.jre.Properties;
import de.mxro.client.Client;
import de.mxro.client.ClientsCommon;
import de.mxro.concurrency.jre.ConcurrencyJre;
import de.mxro.metrics.jre.Metrics;
import de.mxro.promise.jre.Promises;

public class Clients extends ClientsCommon {

    public static Client registerFactories(final Client forClient) {
        forClient.factories().register(Promises.createPromiseFactory());

        forClient.factories().register(Properties.createPropertiesFactory());

        forClient.factories().register(Metrics.createMetricsFactory());

        forClient.factories().register(Logs.createLogsFactory());

        forClient.factories().register(ConcurrencyJre.createFactory());

        return forClient;
    }

}
