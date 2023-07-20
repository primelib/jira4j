package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DefaultShareScope
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "scope"
})
@JsonTypeName("DefaultShareScope")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DefaultShareScope {

    /**
     * Constructs a validated implementation of {@link DefaultShareScope}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DefaultShareScope(Consumer<DefaultShareScope> spec) {
        spec.accept(this);
    }

    /**
     * The scope of the default sharing for new filters and dashboards:
     *  *
     * `AUTHENTICATED` Shared with all logged-in users.
     * *
     * `GLOBAL` Shared with all logged-in users. This shows as `AUTHENTICATED` in the response.
     * *
     * `PRIVATE` Not shared with any users.
     */
    @JsonProperty("scope")
    protected ScopeEnum scope;


    /**
     * The scope of the default sharing for new filters and dashboards:
     *  *
     * `AUTHENTICATED` Shared with all logged-in users.
     * *
     * `GLOBAL` Shared with all logged-in users. This shows as `AUTHENTICATED` in the response.
     * *
     * `PRIVATE` Not shared with any users.
     */
    @AllArgsConstructor
    public enum ScopeEnum {
        GLOBAL("GLOBAL"),
        AUTHENTICATED("AUTHENTICATED"),
        PRIVATE("PRIVATE");

        private final String value;
    }

}
