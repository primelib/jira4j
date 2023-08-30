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
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MultipleCustomFieldValuesUpdate
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
    "customField",
    "issueIds",
    "value"
})
@JsonTypeName("MultipleCustomFieldValuesUpdate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MultipleCustomFieldValuesUpdate {

    /**
     * The ID or key of the custom field. For example, {@code customfield_10010}.
     */
    @JsonProperty("customField")
    protected String customField;

    /**
     * The list of issue IDs.
     */
    @JsonProperty("issueIds")
    protected List<Long> issueIds;

    /**
     * The value for the custom field. The value must be compatible with the [custom field type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field/#data-types) as follows:
     *  *
     * {@code string} the value must be a string.
     * *
     * {@code number} the value must be a number.
     * *
     * {@code datetime} the value must be a string that represents a date in the ISO format or the simplified extended ISO format. For example, {@code "2023-01-18T12:00:00-03:00"} or {@code "2023-01-18T12:00:00.000Z"}. However, the milliseconds part is ignored.
     * *
     * {@code user} the value must be an object that contains the {@code accountId} field.
     * *
     * {@code group} the value must be an object that contains the group {@code name} or {@code groupId} field. Because group names can change, we recommend using {@code groupId}.
     * A list of appropriate values must be provided if the field is of the {@code list} [collection type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field/#collection-types).
     */
    @JsonProperty("value")
    protected Object value;

    /**
     * Constructs a validated instance of {@link MultipleCustomFieldValuesUpdate}.
     *
     * @param spec the specification to process
     */
    public MultipleCustomFieldValuesUpdate(Consumer<MultipleCustomFieldValuesUpdate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MultipleCustomFieldValuesUpdate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MultipleCustomFieldValuesUpdate(Consumer)} instead.
     * @param customField The ID or key of the custom field. For example, {@code customfield_10010}.
     * @param issueIds The list of issue IDs.
     * @param value The value for the custom field. The value must be compatible with the [custom field type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field/#data-types) as follows:   *  {@code string} the value must be a string.  *  {@code number} the value must be a number.  *  {@code datetime} the value must be a string that represents a date in the ISO format or the simplified extended ISO format. For example, {@code "2023-01-18T12:00:00-03:00"} or {@code "2023-01-18T12:00:00.000Z"}. However, the milliseconds part is ignored.  *  {@code user} the value must be an object that contains the {@code accountId} field.  *  {@code group} the value must be an object that contains the group {@code name} or {@code groupId} field. Because group names can change, we recommend using {@code groupId}.  A list of appropriate values must be provided if the field is of the {@code list} [collection type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field/#collection-types).
     */
    @ApiStatus.Internal
    public MultipleCustomFieldValuesUpdate(String customField, List<Long> issueIds, Object value) {
        this.customField = customField;
        this.issueIds = issueIds;
        this.value = value;
    }

}
