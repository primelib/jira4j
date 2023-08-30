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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * IssueTypeCreateBean
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
    "description",
    "hierarchyLevel",
    "name",
    "type"
})
@JsonTypeName("IssueTypeCreateBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeCreateBean {

    /**
     * The description of the issue type.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The hierarchy level of the issue type. Use:
     *  *
     * {@code -1} for Subtask.
     * *
     * {@code 0} for Base.
     * Defaults to {@code 0}.
     */
    @JsonProperty("hierarchyLevel")
    protected Integer hierarchyLevel;

    /**
     * The unique name for the issue type. The maximum length is 60 characters.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Deprecated. Use {@code hierarchyLevel} instead. See the [deprecation notice](https://community.developer.atlassian.com/t/deprecation-of-the-epic-link-parent-link-and-other-related-fields-in-rest-apis-and-webhooks/54048) for details.
     * Whether the issue type is {@code subtype} or {@code standard}. Defaults to {@code standard}.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * Constructs a validated instance of {@link IssueTypeCreateBean}.
     *
     * @param spec the specification to process
     */
    public IssueTypeCreateBean(Consumer<IssueTypeCreateBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueTypeCreateBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueTypeCreateBean(Consumer)} instead.
     * @param description The description of the issue type.
     * @param hierarchyLevel The hierarchy level of the issue type. Use:   *  {@code -1} for Subtask.  *  {@code 0} for Base.  Defaults to {@code 0}.
     * @param name The unique name for the issue type. The maximum length is 60 characters.
     * @param type Deprecated. Use {@code hierarchyLevel} instead. See the [deprecation notice](https://community.developer.atlassian.com/t/deprecation-of-the-epic-link-parent-link-and-other-related-fields-in-rest-apis-and-webhooks/54048) for details.  Whether the issue type is {@code subtype} or {@code standard}. Defaults to {@code standard}.
     */
    @ApiStatus.Internal
    public IssueTypeCreateBean(String description, Integer hierarchyLevel, String name, TypeEnum type) {
        this.description = description;
        this.hierarchyLevel = hierarchyLevel;
        this.name = name;
        this.type = type;
    }

    /**
     * Deprecated. Use {@code hierarchyLevel} instead. See the [deprecation notice](https://community.developer.atlassian.com/t/deprecation-of-the-epic-link-parent-link-and-other-related-fields-in-rest-apis-and-webhooks/54048) for details.
     * Whether the issue type is {@code subtype} or {@code standard}. Defaults to {@code standard}.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        SUBTASK("subtask"),
        STANDARD("standard");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
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
