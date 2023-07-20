package io.github.primelib.jira4j.restv2.model;

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
 * GlobalScopeBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "attributes"
})
@JsonTypeName("GlobalScopeBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GlobalScopeBean {

    /**
     * Constructs a validated implementation of {@link GlobalScopeBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GlobalScopeBean(Consumer<GlobalScopeBean> spec) {
        spec.accept(this);
    }

    /**
     * Defines the behavior of the option in the global context.If notSelectable is set, the option cannot be set as the field's value. This is useful for archiving an option that has previously been selected but shouldn't be used anymore.If defaultValue is set, the option is selected by default.
     */
    @JsonProperty("attributes")
    protected Set<AttributesEnum> attributes;


    /**
     * Defines the behavior of the option in the global context.If notSelectable is set, the option cannot be set as the field's value. This is useful for archiving an option that has previously been selected but shouldn't be used anymore.If defaultValue is set, the option is selected by default.
     */
    @AllArgsConstructor
    public enum AttributesEnum {
        NOTSELECTABLE("notSelectable"),
        DEFAULTVALUE("defaultValue");

        private final String value;
    }

}
