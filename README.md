# *Jira4J*

> A java client for the JIRA REST APIs.

## Module: REST-V3

[![Maven Central](https://img.shields.io/maven-central/v/io.github.primelib/jira4j-rest-v3)](https://central.sonatype.com/artifact/io.github.primelib/jira4j-rest-v3)
[![javadoc](https://javadoc.io/badge2/io.github.primelib/jira4j-rest-v3/javadoc.svg)](https://javadoc.io/doc/io.github.primelib/jira4j-rest-v3)

### Installation

```gradle
implementation("io.github.primelib:jira4j-rest-v3:<latestVersion>")
```

[Click to view instructions for other build tools](https://central.sonatype.com/artifact/io.github.primelib/jira4j-rest-v3).

### Usage

*Consumer Specification Approach*

```java
JiraRESTV3ConsumerApi client = JiraRESTV3Factory.create(spec -> {
    spec.baseUrl("https://your-domain.atlassian.net");
    spec.api(JiraRESTV3ConsumerApi.class);
    spec.bearerAuth(authSpec -> {
        authSpec.token("<your-personal-access-token>");
    });
});

client.getIssue(spec -> {
    spec.issueIdOrKey("TEST-1");
});
```

*Parameter Approach*

```java
JiraRESTV3Api client = JiraRESTV3Factory.create(spec -> {
    spec.baseUrl("https://your-domain.atlassian.net");
    spec.api(JiraRESTV3Api.class);
    spec.bearerAuth(authSpec -> {
        authSpec.token("<your-personal-access-token>");
    });
});

client.getIssue("TEST-1", null, null, null, null, null);
```

**_NOTE:_** The `Parameter Approach` can break if the API changes. The `Consumer Specification Approach` is more resilient to API changes.

## Module: REST-V2

[![Maven Central](https://img.shields.io/maven-central/v/io.github.primelib/jira4j-rest-v2)](https://central.sonatype.com/artifact/io.github.primelib/jira4j-rest-v2)
[![javadoc](https://javadoc.io/badge2/io.github.primelib/jira4j-rest-v2/javadoc.svg)](https://javadoc.io/doc/io.github.primelib/jira4j-rest-v2)

### Installation

```gradle
implementation("io.github.primelib:jira4j-rest-v2:<latestVersion>")
```

[Click to view instructions for other build tools](https://central.sonatype.com/artifact/io.github.primelib/jira4j-rest-v2).

### Usage

*Consumer Specification Approach*

```java
JiraRESTV2ConsumerApi client = JiraRESTV2Factory.create(spec -> {
    spec.baseUrl("https://your-domain.atlassian.net");
    spec.api(JiraRESTV2ConsumerApi.class);
    spec.bearerAuth(authSpec -> {
        authSpec.token("<your-personal-access-token>");
    });
});

client.getIssue(spec -> {
    spec.issueIdOrKey("TEST-1");
});
```

*Parameter Approach*

```java
JiraRESTV2Api client = JiraRESTV2Factory.create(spec -> {
    spec.baseUrl("https://your-domain.atlassian.net");
    spec.api(JiraRESTV2Api.class);
    spec.bearerAuth(authSpec -> {
        authSpec.token("<your-personal-access-token>");
    });
});

client.getIssue("TEST-1", null, null, null, null, null);
```

**_NOTE:_** The `Parameter Approach` can break if the API changes. The `Consumer Specification Approach` is more resilient to API changes.

## Links

- [Documentation](https://primelib.github.io)
- [Contribute](https://primelib.github.io/contribution/)

## License

Released under the [MIT License](./LICENSE).
