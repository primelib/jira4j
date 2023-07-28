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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * IssueFieldOptionConfiguration
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
    "scope"
})
@JsonTypeName("IssueFieldOptionConfiguration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueFieldOptionConfiguration {

    /**
     * DEPRECATED
     */
    @JsonProperty("attributes")
    protected Set<AttributesEnum> attributes;

    @JsonProperty("scope")
    protected IssueFieldOptionConfigurationScope scope;

    /**
     * Constructs a validated instance of {@link IssueFieldOptionConfiguration}.
     *
     * @param spec the specification to process
     */
    public IssueFieldOptionConfiguration(Consumer<IssueFieldOptionConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueFieldOptionConfiguration}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueFieldOptionConfiguration(Consumer)} instead.
     * @param attributes DEPRECATED
     * @param scope var.name
     */
    @ApiStatus.Internal
    public IssueFieldOptionConfiguration(Set<AttributesEnum> attributes, IssueFieldOptionConfigurationScope scope) {
        this.attributes = attributes;
        this.scope = scope;
    }

    /**
     * DEPRECATED
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
