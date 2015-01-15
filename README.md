# Java Client API

A good way to start developing any client application in Java. 

Also see the sister project [Java Server API](https://github.com/mxro/server-api).

## Usage

### Instantiating Clients

One application can have one or more clients. These clients embed within them common features useful for application development.

A client can be created as follows:

```java
Client client = Clients.create();
```

### Logs

Clients come with capability to store and retrieve multiple logs.

A log can be created and accessed as follows:

```java
client.logs().record(Logs.string("log1", "Just a Message!"));

String allEntries = client.logs().retrieve("log1", String.class).get();
```

More details can be found in the documentation of the [Async Log](https://github.com/mxro/async-log) project.

### Metrics

Metrics such as counters and throughput are natively supported by this API.

Values for a metric can be stored as follows:

```java
client.metrics().record(Metrics.value("stat1", 100));
client.metrics().record(Metrics.value("stat1", 200));
client.metrics().record(Metrics.value("stat1", 300));

String metric = client.metrics().retrieve("stat1").render().get();
```

Metrics are based on the [Lightweight Java Metrics](https://github.com/mxro/lightweight-java-metrics) project.

### 

