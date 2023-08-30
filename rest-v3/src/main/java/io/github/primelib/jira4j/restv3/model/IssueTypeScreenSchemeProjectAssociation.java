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
 * IssueTypeScreenSchemeProjectAssociation
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
    "issueTypeScreenSchemeId",
    "projectId"
})
@JsonTypeName("IssueTypeScreenSchemeProjectAssociation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeScreenSchemeProjectAssociation {

    /**
     * The ID of the issue type screen scheme.
     */
    @JsonProperty("issueTypeScreenSchemeId")
    protected String issueTypeScreenSchemeId;

    /**
     * The ID of the project.
     */
    @JsonProperty("projectId")
    protected String projectId;

    /**
     * Constructs a validated instance of {@link IssueTypeScreenSchemeProjectAssociation}.
     *
     * @param spec the specification to process
     */
    public IssueTypeScreenSchemeProjectAssociation(Consumer<IssueTypeScreenSchemeProjectAssociation> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueTypeScreenSchemeProjectAssociation}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueTypeScreenSchemeProjectAssociation(Consumer)} instead.
     * @param issueTypeScreenSchemeId The ID of the issue type screen scheme.
     * @param projectId The ID of the project.
     */
    @ApiStatus.Internal
    public IssueTypeScreenSchemeProjectAssociation(String issueTypeScreenSchemeId, String projectId) {
        this.issueTypeScreenSchemeId = issueTypeScreenSchemeId;
        this.projectId = projectId;
    }

}
