package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "changelog",
    "editmeta",
    "expand",
    "fields",
    "fieldsToInclude",
    "id",
    "key",
    "names",
    "operations",
    "properties",
    "renderedFields",
    "schema",
    "self",
    "transitions",
    "versionedRepresentations"
})
@JsonTypeName("IssueBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueBean {

    /**
     * Constructs a validated implementation of {@link IssueBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueBean(Consumer<IssueBean> spec) {
        spec.accept(this);
    }

    @JsonProperty("changelog")
    protected IssueBeanChangelog changelog;

    @JsonProperty("editmeta")
    protected IssueBeanEditmeta editmeta;

    /**
     * Expand options that include additional issue details in the response.
     */
    @JsonProperty("expand")
    protected String expand;

    @JsonProperty("fields")
    protected Map<String, Object> fields = new HashMap<>();

    @JsonProperty("fieldsToInclude")
    protected IncludedFields fieldsToInclude;

    /**
     * The ID of the issue.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The key of the issue.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * The ID and name of each field present on the issue.
     */
    @JsonProperty("names")
    protected Map<String, String> names = new HashMap<>();

    @JsonProperty("operations")
    protected IssueBeanOperations operations;

    /**
     * Details of the issue properties identified in the request.
     */
    @JsonProperty("properties")
    protected Map<String, Object> properties = new HashMap<>();

    /**
     * The rendered value of each field present on the issue.
     */
    @JsonProperty("renderedFields")
    protected Map<String, Object> renderedFields = new HashMap<>();

    /**
     * The schema describing each field present on the issue.
     */
    @JsonProperty("schema")
    protected Map<String, JsonTypeBean> schema = new HashMap<>();

    /**
     * The URL of the issue details.
     */
    @JsonProperty("self")
    protected URI self;

    /**
     * The transitions that can be performed on the issue.
     */
    @JsonProperty("transitions")
    protected List<IssueTransition> transitions;

    /**
     * The versions of each field on the issue.
     */
    @JsonProperty("versionedRepresentations")
    protected Map<String, Map<String, Object>> versionedRepresentations = new HashMap<>();


}
