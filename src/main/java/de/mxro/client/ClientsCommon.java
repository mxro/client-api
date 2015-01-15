package de.mxro.client;

import de.mxro.client.internal.ClientImpl;
import de.mxro.promise.PromisesCommon;

/**
 * Entry-point for creating cross-platform clients.
 * 
 * @author <a href="http://www.mxro.de">Max Rohde</a>
 *
 */
public class ClientsCommon {

    public Client create() {
        return new ClientImpl();

    }

    public Client registerPortableFactories(final Client forClient) {
        forClient.factories().register(PromisesCommon.createUnsafePromiseFactory());

        return forClient;
    }

}
