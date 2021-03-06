package de.mxro.client;

import delight.async.Operation;
import delight.async.properties.PropertyNode;
import delight.concurrency.Concurrency;
import delight.factories.FactoryCollection;
import delight.functional.Success;
import delight.promise.Promise;
import delight.promise.helper.PromiseFactory;

import de.mxro.service.ServiceRegistry;

public interface BasicClient extends PromiseFactory {

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
