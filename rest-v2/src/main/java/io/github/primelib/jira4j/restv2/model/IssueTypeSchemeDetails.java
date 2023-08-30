package io.github.primelib.jira4j.restv2.model;

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
 * IssueTypeSchemeDetails
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
    "defaultIssueTypeId",
    "description",
    "issueTypeIds",
    "name"
})
@JsonTypeName("IssueTypeSchemeDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeSchemeDetails {

    /**
     * The ID of the default issue type of the issue type scheme. This ID must be included in {@code issueTypeIds}.
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
    protected List<String> issueTypeIds;

    /**
     * The name of the issue type scheme. The name must be unique. The maximum length is 255 characters.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link IssueTypeSchemeDetails}.
     *
     * @param spec the specification to process
     */
    public IssueTypeSchemeDetails(Consumer<IssueTypeSchemeDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueTypeSchemeDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueTypeSchemeDetails(Consumer)} instead.
     * @param defaultIssueTypeId The ID of the default issue type of the issue type scheme. This ID must be included in {@code issueTypeIds}.
     * @param description The description of the issue type scheme. The maximum length is 4000 characters.
     * @param issueTypeIds The list of issue types IDs of the issue type scheme. At least one standard issue type ID is required.
     * @param name The name of the issue type scheme. The name must be unique. The maximum length is 255 characters.
     */
    @ApiStatus.Internal
    public IssueTypeSchemeDetails(String defaultIssueTypeId, String description, List<String> issueTypeIds, String name) {
        this.defaultIssueTypeId = defaultIssueTypeId;
        this.description = description;
        this.issueTypeIds = issueTypeIds;
        this.name = name;
    }

}
