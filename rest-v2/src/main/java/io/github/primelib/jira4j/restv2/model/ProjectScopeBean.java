package io.github.primelib.jira4j.restv2.model;

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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ProjectScopeBean
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
    "attributes",
    "id"
})
@JsonTypeName("ProjectScopeBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectScopeBean {

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
     * Constructs a validated instance of {@link ProjectScopeBean}.
     *
     * @param spec the specification to process
     */
    public ProjectScopeBean(Consumer<ProjectScopeBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ProjectScopeBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ProjectScopeBean(Consumer)} instead.
     * @param attributes Defines the behavior of the option in the project.If notSelectable is set, the option cannot be set as the field's value. This is useful for archiving an option that has previously been selected but shouldn't be used anymore.If defaultValue is set, the option is selected by default.
     * @param id The ID of the project that the option's behavior applies to.
     */
    @ApiStatus.Internal
    public ProjectScopeBean(Set<AttributesEnum> attributes, Long id) {
        this.attributes = attributes;
        this.id = id;
    }

    /**
     * Defines the behavior of the option in the project.If notSelectable is set, the option cannot be set as the field's value. This is useful for archiving an option that has previously been selected but shouldn't be used anymore.If defaultValue is set, the option is selected by default.
     */
    @AllArgsConstructor
    public enum AttributesEnum {
        NOTSELECTABLE("notSelectable"),
        DEFAULTVALUE("defaultValue");

        private static final AttributesEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static AttributesEnum of(String input) {
            if (input != null) {
                for (AttributesEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
