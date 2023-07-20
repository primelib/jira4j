package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueTypeSchemeDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "defaultIssueTypeId",
    "description",
    "issueTypeIds",
    "name"
})
@JsonTypeName("IssueTypeSchemeDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeSchemeDetails {

    /**
     * Constructs a validated implementation of {@link IssueTypeSchemeDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueTypeSchemeDetails(Consumer<IssueTypeSchemeDetails> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the default issue type of the issue type scheme. This ID must be included in `issueTypeIds`.
     */
    @JsonProperty("defaultIssueTypeId")
    protected String defaultIssueTypeId;

    /**
     * The description of the issue type scheme. The maximum length is 4000 characters.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The list of issue types IDs of the issue type scheme. At least one standard issue type ID is required.
     */
    @JsonProperty("issueTypeIds")
    protected List<String> issueTypeIds = new ArrayList<>();

    /**
     * The name of the issue type scheme. The name must be unique. The maximum length is 255 characters.
     */
    @JsonProperty("name")
    protected String name;


}
