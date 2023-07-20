package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueUpdateDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "fields",
    "historyMetadata",
    "properties",
    "transition",
    "update"
})
@JsonTypeName("IssueUpdateDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueUpdateDetails extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link IssueUpdateDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueUpdateDetails(Consumer<IssueUpdateDetails> spec) {
        spec.accept(this);
    }

    /**
     * List of issue screen fields to update, specifying the sub-field to update and its value for each field. This field provides a straightforward option when setting a sub-field. When multiple sub-fields or other operations are required, use `update`. Fields included in here cannot be included in `update`.
     */
    @JsonProperty("fields")
    protected Map<String, Object> fields = new HashMap<>();

    @JsonProperty("historyMetadata")
    protected IssueUpdateDetailsHistoryMetadata historyMetadata;

    /**
     * Details of issue properties to be add or update.
     */
    @JsonProperty("properties")
    protected List<EntityProperty> properties;

    @JsonProperty("transition")
    protected IssueUpdateDetailsTransition transition;

    /**
     * A Map containing the field field name and a list of operations to perform on the issue screen field. Note that fields included in here cannot be included in `fields`.
     */
    @JsonProperty("update")
    protected Map<String, List<FieldUpdateOperation>> update = new HashMap<>();


}
