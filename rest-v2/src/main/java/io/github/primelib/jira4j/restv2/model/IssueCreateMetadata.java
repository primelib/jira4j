package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueCreateMetadata
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "expand",
    "projects"
})
@JsonTypeName("IssueCreateMetadata")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueCreateMetadata {

    /**
     * Constructs a validated implementation of {@link IssueCreateMetadata}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueCreateMetadata(Consumer<IssueCreateMetadata> spec) {
        spec.accept(this);
    }

    /**
     * Expand options that include additional project details in the response.
     */
    @JsonProperty("expand")
    protected String expand;

    /**
     * List of projects and their issue creation metadata.
     */
    @JsonProperty("projects")
    protected List<ProjectIssueCreateMetadata> projects;


}
