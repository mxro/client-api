package de.mxro.client;

import de.mxro.async.properties.PropertyNode;
import de.mxro.factories.FactoryCollection;
import de.mxro.service.ServiceRegistry;

public interface Client {

    public FactoryCollection factories();

    public ServiceRegistry services();

    public PropertyNode metrics();

    public PropertyNode state();

    public PropertyNode logs();

}
