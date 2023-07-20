package io.github.primelib.jira4j.restv2.model;

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
 * IssueTypeScreenSchemeProjectAssociation
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "issueTypeScreenSchemeId",
    "projectId"
})
@JsonTypeName("IssueTypeScreenSchemeProjectAssociation")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeScreenSchemeProjectAssociation {

    /**
     * Constructs a validated implementation of {@link IssueTypeScreenSchemeProjectAssociation}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueTypeScreenSchemeProjectAssociation(Consumer<IssueTypeScreenSchemeProjectAssociation> spec) {
        spec.accept(this);
    }

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


}
