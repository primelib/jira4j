package io.github.primelib.jira4j.restv3.model;

import java.util.List;
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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueFilterForBulkPropertySet
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
    "currentValue",
    "entityIds",
    "hasProperty"
})
@JsonTypeName("IssueFilterForBulkPropertySet")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueFilterForBulkPropertySet {

    /**
     * The value of properties to perform the bulk operation on.
     */
    @JsonProperty("currentValue")
    protected Object currentValue;

    /**
     * List of issues to perform the bulk operation on.
     */
    @JsonProperty("entityIds")
    protected Set<Long> entityIds;

    /**
     * Whether the bulk operation occurs only when the property is present on or absent from an issue.
     */
    @JsonProperty("hasProperty")
    protected Boolean hasProperty;

    /**
     * Constructs a validated instance of {@link IssueFilterForBulkPropertySet}.
     *
     * @param spec the specification to process
     */
    public IssueFilterForBulkPropertySet(Consumer<IssueFilterForBulkPropertySet> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueFilterForBulkPropertySet}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueFilterForBulkPropertySet(Consumer)} instead.
     * @param currentValue The value of properties to perform the bulk operation on.
     * @param entityIds List of issues to perform the bulk operation on.
     * @param hasProperty Whether the bulk operation occurs only when the property is present on or absent from an issue.
     */
    @ApiStatus.Internal
    public IssueFilterForBulkPropertySet(Object currentValue, Set<Long> entityIds, Boolean hasProperty) {
        this.currentValue = currentValue;
        this.entityIds = entityIds;
        this.hasProperty = hasProperty;
    }

}
