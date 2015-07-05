package de.mxro.client;

import delight.async.Operation;
import delight.functional.Success;

import de.mxro.async.properties.PropertyNode;
import de.mxro.concurrency.Concurrency;
import de.mxro.factories.FactoryCollection;
import de.mxro.promise.Promise;
import de.mxro.promise.helper.PromiseFactory;
import de.mxro.service.ServiceRegistry;

public interface Client extends PromiseFactory {

    public FactoryCollection factories();

    public ServiceRegistry services();

    public PropertyNode metrics();

    public PropertyNode state();

    public PropertyNode logs();

    public Promise<Success> stop();

    public Concurrency concurrency();

    @Override
    public <R> Promise<R> promise(Operation<R> operation);

}
