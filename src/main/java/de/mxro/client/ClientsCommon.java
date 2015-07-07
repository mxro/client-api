package de.mxro.client;

import delight.async.properties.PropertiesCommon;
import delight.promise.PromisesCommon;

import de.mxro.async.log.LogsCommon;
import de.mxro.client.internal.ClientImpl;
import de.mxro.metrics.MetricsCommon;

/**
 * Entry-point for creating cross-platform clients.
 * 
 * @author <a href="http://www.mxro.de">Max Rohde</a>
 *
 */
public class ClientsCommon {

    public static BasicClient createPortable() {
        final BasicClient client = new ClientImpl();

        client.factories().register(PromisesCommon.createUnsafePromiseFactory());

        client.factories().register(PropertiesCommon.createUnsafePropertiesFactory());

        client.factories().register(MetricsCommon.createUnsafeFactory());

        client.factories().register(LogsCommon.createUnsafeLogsFactory());

        return client;

    }

}
