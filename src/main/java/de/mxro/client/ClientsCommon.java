package de.mxro.client;

import de.mxro.async.log.LogsCommon;
import de.mxro.async.properties.PropertiesCommon;
import de.mxro.client.internal.ClientImpl;
import de.mxro.metrics.MetricsCommon;
import de.mxro.promise.PromisesCommon;

/**
 * Entry-point for creating cross-platform clients.
 * 
 * @author <a href="http://www.mxro.de">Max Rohde</a>
 *
 */
public class ClientsCommon {

    public static Client create() {
        return new ClientImpl();

    }

    public static Client registerPortableFactories(final Client forClient) {
        forClient.factories().register(PromisesCommon.createUnsafePromiseFactory());

        forClient.factories().register(PropertiesCommon.createUnsafePropertiesFactory());

        forClient.factories().register(MetricsCommon.createUnsafeFactory());

        forClient.factories().register(LogsCommon.createUnsafeLogsFactory());

        return forClient;
    }

}
