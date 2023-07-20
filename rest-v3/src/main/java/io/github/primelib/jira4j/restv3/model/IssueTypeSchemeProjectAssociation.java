package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueTypeSchemeProjectAssociation
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "issueTypeSchemeId",
    "projectId"
})
@JsonTypeName("IssueTypeSchemeProjectAssociation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeSchemeProjectAssociation {

    /**
     * Constructs a validated implementation of {@link IssueTypeSchemeProjectAssociation}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueTypeSchemeProjectAssociation(Consumer<IssueTypeSchemeProjectAssociation> spec) {
        spec.accept(this);
    }

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


}
