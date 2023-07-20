package io.github.primelib.jira4j.restv2.auth;

import java.util.Map;

public interface AuthMethod {
    Map<String, String> headerMap();
    Map<String, String> queryMap();
    Map<String, String> cookieMap();
}
