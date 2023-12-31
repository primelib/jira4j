package io.github.primelib.jira4j.restv2.auth;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

import io.github.primelib.primecodegenlib.java.feign.common.api.AuthMethod;

@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class BearerAuthSpec implements AuthMethod {
    @NotNull
    private String propertyKey = "Authorization";

    /**
     * template for the property value, use {token} as placeholder
     */
    private String valueTemplate = "Bearer {token}";

    /**
     * the token
     */
    @NotNull
    private String token;

    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.PUBLIC)
    private Map<String, String> headerMap = null;

    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.PUBLIC)
    private Map<String, String> queryMap = null;

    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.PUBLIC)
    private Map<String, String> cookieMap = null;

    /**
     * Constructs a validated implementation of {@link BearerAuthSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public BearerAuthSpec(Consumer<BearerAuthSpec> spec) {
        spec.accept(this);
        validate();
        update(token);
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException if a required parameter is missing
     * @throws IllegalArgumentException if a parameter has an invalid value
     */
    public void validate() {
        Objects.requireNonNull(token, "token is a required parameter!");
        Objects.requireNonNull(valueTemplate, "valueTemplate is required");
    }

    private void update(String value) {
        value = valueTemplate.replace("{token}", value);
        headerMap = Map.of(propertyKey, value);
    }
}
