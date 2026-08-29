# Jira DataCenter Client

A java http client library for Jira DataCenter Client.

> Requires Java 17+.

## Core Library

**Coordinates**

```
implementation("io.github.primelib:jira-datacenter-client:<version>")
```

**Create a consumer-first client instance using the factory.**

```java
JiraDataCenterClientApi client = JiraDataCenterClientFactory.create(spec -> {
    spec.api(JiraDataCenterClientApi.class);
    spec.baseUrl("https://{your-domain}");
    spec.apiKeyAuth(auth -> {
        auth.propertyKey("x-api-key");
        auth.apiKey("<apiKey>");
    });
    spec.basicAuth(auth -> {
        auth.username("<admin>");
        auth.password("<password>");
    });
    spec.bearerAuth(auth -> {
        auth.valueTemplate("Bearer {token}"); // optional, default is "Bearer {token}"
        auth.token("<token>");
    });
    spec.oauth2ClientAuth(auth -> {
        auth.tokenEndpoint("<tokenEndpoint>");
        auth.clientId("<clientId>");
        auth.clientSecret("<clientSecret>");
    });
    spec.oauth2UserAuth(auth -> {
        auth.tokenEndpoint("<tokenEndpoint>");
        auth.clientId("<clientId>");
        auth.clientSecret("<clientSecret>");
        auth.username("<username>");
        auth.password("<password>");
    });
    //spec.logLevel(JiraDataCenterClientFactorySpec.LogLevel.FULL);
    //spec.userAgent("custom-user-agent");
    //spec.requestTimeoutMillis(60_000);
});

client.someOperation(op -> op
    // operation params ...
    .extraHeader("X-Correlation-Id", "req-123")
    .extraQueryParam("debug", "true")
    .overrideAuthMethod(new BearerAuthMethod(auth -> auth.token("per-request-token")))
);
```

## Spring Boot Starter

**Coordinates**

```
implementation("io.github.primelib:jira-datacenter-client-spring-boot-starter:<version>")
```

**Auto Configuration**

| Property                                                   | Description                      | Default Value    | Allowed Values                     |
|------------------------------------------------------------|----------------------------------|------------------|------------------------------------|
| jira-data-center-client.url                       | Base URL of the API              | ""               |                                    |
| jira-data-center-client.insecure                  | Disable SSL verification         | false            | false, true                        |
| jira-data-center-client.user-agent                | User agent header value          | generated value  |                                    |
| jira-data-center-client.log-level                 | HTTP log level                   | ""               | none, basic, headers, full         |
| jira-data-center-client.connect-timeout-millis    | TCP connect timeout              | 10000            | > 0                                |
| jira-data-center-client.request-timeout-millis    | Full request timeout             | 30000            | > 0                                |
| jira-data-center-client.auth.type                 | Type of authentication           | ""               | apikey, basic, bearer, oauth2-client, oauth2-user |
| jira-data-center-client.auth.token-endpoint       | Full token endpoint URL          | ""               | oauth2 token endpoint              |
| jira-data-center-client.auth.client-id            | Client ID for authentication     | ""               | oauth2 client id                   |
| jira-data-center-client.auth.client-secret        | Client secret for authentication | ""               | oauth2 client secret               |
| jira-data-center-client.auth.username             | Username for authentication      | ""               | oauth2 username (oauth2-user)      |
| jira-data-center-client.auth.password             | Password for authentication      | ""               | oauth2 password (oauth2-password)  |
| jira-data-center-client.auth.token                | Token / API Key                  | ""               |                                    |
| jira-data-center-client.auth.token-property-location | API key placement              | "header"         | header, query, cookie              |
| jira-data-center-client.auth.token-property-key   | Header key to pass the token in  | "Authorization"  |                                    |
| jira-data-center-client.auth.token-value-template | Template to generate token value | "Bearer {token}" |                                    |


## License

This project is licensed under the [MIT](https://github.com/primelib/jira-client/blob/main/LICENSE) license.
