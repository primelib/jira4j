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
 * IssueFieldOptionScopeBeanGlobal
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "attributes"
})
@JsonTypeName("IssueFieldOptionScopeBean_global")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueFieldOptionScopeBeanGlobal {

    /**
     * Constructs a validated implementation of {@link IssueFieldOptionScopeBeanGlobal}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueFieldOptionScopeBeanGlobal(Consumer<IssueFieldOptionScopeBeanGlobal> spec) {
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
