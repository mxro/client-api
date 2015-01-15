package de.mxro.client.internal;

import de.mxro.async.properties.PropertyNode;
import de.mxro.client.Client;
import de.mxro.factories.Factories;
import de.mxro.factories.FactoryCollection;
import de.mxro.service.ServiceRegistry;
import de.mxro.service.Services;

public class ClientImpl implements Client {

    private FactoryCollection factories;
    private ServiceRegistry services;

    @Override
    public FactoryCollection factories() {
        if (this.factories != null) {
            return this.factories;
        }

        this.factories = Factories.create();

        return this.factories;
    }

    @Override
    public ServiceRegistry services() {
        if (this.services != null) {
            return this.services;
        }

        this.services = Services.create();

        return this.services;
    }

    @Override
    public PropertyNode metrics() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PropertyNode state() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PropertyNode logs() {
        // TODO Auto-generated method stub
        return null;
    }

}
