package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueFieldOptionConfiguration
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "attributes",
    "scope"
})
@JsonTypeName("IssueFieldOptionConfiguration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueFieldOptionConfiguration {

    /**
     * Constructs a validated implementation of {@link IssueFieldOptionConfiguration}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueFieldOptionConfiguration(Consumer<IssueFieldOptionConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * DEPRECATED
     */
    @JsonProperty("attributes")
    protected Set<AttributesEnum> attributes;

    @JsonProperty("scope")
    protected IssueFieldOptionConfigurationScope scope;


    /**
     * DEPRECATED
     */
    @AllArgsConstructor
    public enum AttributesEnum {
        NOTSELECTABLE("notSelectable"),
        DEFAULTVALUE("defaultValue");

        private final String value;
    }

}
