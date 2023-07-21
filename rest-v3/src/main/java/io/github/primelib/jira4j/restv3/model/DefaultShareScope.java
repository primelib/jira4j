package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DefaultShareScope
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@JsonPropertyOrder({
    "scope"
})
@JsonTypeName("DefaultShareScope")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DefaultShareScope {

    /**
     * The scope of the default sharing for new filters and dashboards:
     *  *
     * {@code AUTHENTICATED} Shared with all logged-in users.
     * *
     * {@code GLOBAL} Shared with all logged-in users. This shows as {@code AUTHENTICATED} in the response.
     * *
     * {@code PRIVATE} Not shared with any users.
     */
    @JsonProperty("scope")
    protected ScopeEnum scope;

    /**
     * Constructs a validated instance of {@link DefaultShareScope}.
     *
     * @param spec the specification to process
     */
    public DefaultShareScope(Consumer<DefaultShareScope> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link DefaultShareScope}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #DefaultShareScope(Consumer)} instead.
     * @param scope The scope of the default sharing for new filters and dashboards:   *  {@code AUTHENTICATED} Shared with all logged-in users.  *  {@code GLOBAL} Shared with all logged-in users. This shows as {@code AUTHENTICATED} in the response.  *  {@code PRIVATE} Not shared with any users.
     */
    @ApiStatus.Internal
    public DefaultShareScope(ScopeEnum scope) {
        this.scope = scope;
    }

    /**
     * The scope of the default sharing for new filters and dashboards:
     *  *
     * {@code AUTHENTICATED} Shared with all logged-in users.
     * *
     * {@code GLOBAL} Shared with all logged-in users. This shows as {@code AUTHENTICATED} in the response.
     * *
     * {@code PRIVATE} Not shared with any users.
     */
    @AllArgsConstructor
    public enum ScopeEnum {
        GLOBAL("GLOBAL"),
        AUTHENTICATED("AUTHENTICATED"),
        PRIVATE("PRIVATE");

        private final String value;
    }

}
