package de.mxro.client.internal;

import de.mxro.async.Operation;
import de.mxro.async.properties.PropertyNode;
import de.mxro.client.Client;
import de.mxro.factories.Factories;
import de.mxro.factories.FactoryCollection;
import de.mxro.fn.Success;
import de.mxro.metrics.MetricsConfiguration;
import de.mxro.promise.Promise;
import de.mxro.service.ServiceRegistry;
import de.mxro.service.Services;

public class ClientImpl implements Client {

    private FactoryCollection factories;
    private ServiceRegistry services;
    private PropertyNode metrics;

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
        if (this.metrics == null) {
            this.metrics = (PropertyNode) factories().create(new MetricsConfiguration(), Factories.noDependencies());
        }
        return this.metrics;
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

    @Override
    public Promise<Success> stop() {
        final Operation[] toShutdown = new Operation[3];

        if (this. {
            return null;
        }
    }
}
