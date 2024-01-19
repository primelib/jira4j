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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueTypeSchemeProjectAssociation
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
    "issueTypeSchemeId",
    "projectId"
})
@JsonTypeName("IssueTypeSchemeProjectAssociation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeSchemeProjectAssociation {

    /**
     * The ID of the issue type scheme.
     */
    @JsonProperty("issueTypeSchemeId")
    protected String issueTypeSchemeId;

    /**
     * The ID of the project.
     */
    @JsonProperty("projectId")
    protected String projectId;

    /**
     * Constructs a validated instance of {@link IssueTypeSchemeProjectAssociation}.
     *
     * @param spec the specification to process
     */
    public IssueTypeSchemeProjectAssociation(Consumer<IssueTypeSchemeProjectAssociation> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueTypeSchemeProjectAssociation}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueTypeSchemeProjectAssociation(Consumer)} instead.
     * @param issueTypeSchemeId The ID of the issue type scheme.
     * @param projectId The ID of the project.
     */
    @ApiStatus.Internal
    public IssueTypeSchemeProjectAssociation(String issueTypeSchemeId, String projectId) {
        this.issueTypeSchemeId = issueTypeSchemeId;
        this.projectId = projectId;
    }

}
