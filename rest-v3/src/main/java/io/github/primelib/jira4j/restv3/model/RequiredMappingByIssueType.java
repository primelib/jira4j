package io.github.primelib.jira4j.restv3.model;

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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RequiredMappingByIssueType
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
    "statusIds"
})
@JsonTypeName("RequiredMappingByIssueType")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RequiredMappingByIssueType {

    /**
     * The ID of the issue type.
     */
    @JsonProperty("issueTypeId")
    protected String issueTypeId;

    /**
     * The status IDs requiring mapping.
     */
    @JsonProperty("statusIds")
    protected Set<String> statusIds;

    /**
     * Constructs a validated instance of {@link RequiredMappingByIssueType}.
     *
     * @param spec the specification to process
     */
    public RequiredMappingByIssueType(Consumer<RequiredMappingByIssueType> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RequiredMappingByIssueType}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RequiredMappingByIssueType(Consumer)} instead.
     * @param issueTypeId The ID of the issue type.
     * @param statusIds The status IDs requiring mapping.
     */
    @ApiStatus.Internal
    public RequiredMappingByIssueType(String issueTypeId, Set<String> statusIds) {
        this.issueTypeId = issueTypeId;
        this.statusIds = statusIds;
    }

}
