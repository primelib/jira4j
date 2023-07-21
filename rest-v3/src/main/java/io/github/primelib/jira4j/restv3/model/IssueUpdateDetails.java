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
import lombok.experimental.Accessors;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueUpdateDetails
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
    "fields",
    "historyMetadata",
    "properties",
    "transition",
    "update"
})
@JsonTypeName("IssueUpdateDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueUpdateDetails {

    /**
     * List of issue screen fields to update, specifying the sub-field to update and its value for each field. This field provides a straightforward option when setting a sub-field. When multiple sub-fields or other operations are required, use {@code update}. Fields included in here cannot be included in {@code update}.
     */
    @JsonProperty("fields")
    protected Map<String, Object> fields;

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
     * A Map containing the field field name and a list of operations to perform on the issue screen field. Note that fields included in here cannot be included in {@code fields}.
     */
    @JsonProperty("update")
    protected Map<String, List<FieldUpdateOperation>> update;

    /**
     * Constructs a validated instance of {@link IssueUpdateDetails}.
     *
     * @param spec the specification to process
     */
    public IssueUpdateDetails(Consumer<IssueUpdateDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueUpdateDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueUpdateDetails(Consumer)} instead.
     * @param fields List of issue screen fields to update, specifying the sub-field to update and its value for each field. This field provides a straightforward option when setting a sub-field. When multiple sub-fields or other operations are required, use {@code update}. Fields included in here cannot be included in {@code update}.
     * @param historyMetadata var.name
     * @param properties Details of issue properties to be add or update.
     * @param transition var.name
     * @param update A Map containing the field field name and a list of operations to perform on the issue screen field. Note that fields included in here cannot be included in {@code fields}.
     */
    @ApiStatus.Internal
    public IssueUpdateDetails(Map<String, Object> fields, IssueUpdateDetailsHistoryMetadata historyMetadata, List<EntityProperty> properties, IssueUpdateDetailsTransition transition, Map<String, List<FieldUpdateOperation>> update) {
        this.fields = fields;
        this.historyMetadata = historyMetadata;
        this.properties = properties;
        this.transition = transition;
        this.update = update;
    }

}
