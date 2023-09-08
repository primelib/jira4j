package io.github.primelib.jira4j.restv2.model;

import java.util.Map;
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
 * MappingsByIssueTypeOverride
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
    "issueTypeId",
    "statusMappings"
})
@JsonTypeName("MappingsByIssueTypeOverride")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MappingsByIssueTypeOverride {

    /**
     * The ID of the issue type for this mapping.
     */
    @JsonProperty("issueTypeId")
    protected String issueTypeId;

    /**
     * The list of status mappings.
     */
    @JsonProperty("statusMappings")
    protected List<WorkflowAssociationStatusMapping> statusMappings;

    /**
     * Constructs a validated instance of {@link MappingsByIssueTypeOverride}.
     *
     * @param spec the specification to process
     */
    public MappingsByIssueTypeOverride(Consumer<MappingsByIssueTypeOverride> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MappingsByIssueTypeOverride}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MappingsByIssueTypeOverride(Consumer)} instead.
     * @param issueTypeId The ID of the issue type for this mapping.
     * @param statusMappings The list of status mappings.
     */
    @ApiStatus.Internal
    public MappingsByIssueTypeOverride(String issueTypeId, List<WorkflowAssociationStatusMapping> statusMappings) {
        this.issueTypeId = issueTypeId;
        this.statusMappings = statusMappings;
    }

}
