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
 * ProjectScopeBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "attributes",
    "id"
})
@JsonTypeName("ProjectScopeBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectScopeBean {

    /**
     * Constructs a validated implementation of {@link ProjectScopeBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ProjectScopeBean(Consumer<ProjectScopeBean> spec) {
        spec.accept(this);
    }

    /**
     * Defines the behavior of the option in the project.If notSelectable is set, the option cannot be set as the field's value. This is useful for archiving an option that has previously been selected but shouldn't be used anymore.If defaultValue is set, the option is selected by default.
     */
    @JsonProperty("attributes")
    protected Set<AttributesEnum> attributes;

    /**
     * The ID of the project that the option's behavior applies to.
     */
    @JsonProperty("id")
    protected Long id;


    /**
     * Defines the behavior of the option in the project.If notSelectable is set, the option cannot be set as the field's value. This is useful for archiving an option that has previously been selected but shouldn't be used anymore.If defaultValue is set, the option is selected by default.
     */
    @AllArgsConstructor
    public enum AttributesEnum {
        NOTSELECTABLE("notSelectable"),
        DEFAULTVALUE("defaultValue");

        private final String value;
    }

}
