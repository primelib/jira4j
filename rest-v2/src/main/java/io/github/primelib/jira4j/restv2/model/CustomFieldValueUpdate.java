package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomFieldValueUpdate
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "issueIds",
    "value"
})
@JsonTypeName("CustomFieldValueUpdate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldValueUpdate {

    /**
     * Constructs a validated implementation of {@link CustomFieldValueUpdate}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomFieldValueUpdate(Consumer<CustomFieldValueUpdate> spec) {
        spec.accept(this);
    }

    /**
     * The list of issue IDs.
     */
    @JsonProperty("issueIds")
    protected List<Long> issueIds = new ArrayList<>();

    /**
     * The value for the custom field. The value must be compatible with the [custom field type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field/#data-types) as follows:
     *  *
     * `string` the value must be a string.
     * *
     * `number` the value must be a number.
     * *
     * `datetime` the value must be a string that represents a date in the ISO format or the simplified extended ISO format. For example, `"2023-01-18T12:00:00-03:00"` or `"2023-01-18T12:00:00.000Z"`. However, the milliseconds part is ignored.
     * *
     * `user` the value must be an object that contains the `accountId` field.
     * *
     * `group` the value must be an object that contains the group `name` or `groupId` field. Because group names can change, we recommend using `groupId`.
     * A list of appropriate values must be provided if the field is of the `list` [collection type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field/#collection-types).
     */
    @JsonProperty("value")
    protected Object value = null;


}
