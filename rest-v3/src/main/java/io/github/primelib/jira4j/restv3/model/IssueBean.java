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

import java.net.URI;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueBean
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
    protected Map<String, Object> fields;

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
    protected Map<String, String> names;

    @JsonProperty("operations")
    protected IssueBeanOperations operations;

    /**
     * Details of the issue properties identified in the request.
     */
    @JsonProperty("properties")
    protected Map<String, Object> properties;

    /**
     * The rendered value of each field present on the issue.
     */
    @JsonProperty("renderedFields")
    protected Map<String, Object> renderedFields;

    /**
     * The schema describing each field present on the issue.
     */
    @JsonProperty("schema")
    protected Map<String, JsonTypeBean> schema;

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
    protected Map<String, Map<String, Object>> versionedRepresentations;

    /**
     * Constructs a validated instance of {@link IssueBean}.
     *
     * @param spec the specification to process
     */
    public IssueBean(Consumer<IssueBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueBean(Consumer)} instead.
     * @param changelog changelog
     * @param editmeta editmeta
     * @param expand Expand options that include additional issue details in the response.
     * @param fields fields
     * @param fieldsToInclude fieldsToInclude
     * @param id The ID of the issue.
     * @param key The key of the issue.
     * @param names The ID and name of each field present on the issue.
     * @param operations operations
     * @param properties Details of the issue properties identified in the request.
     * @param renderedFields The rendered value of each field present on the issue.
     * @param schema The schema describing each field present on the issue.
     * @param self The URL of the issue details.
     * @param transitions The transitions that can be performed on the issue.
     * @param versionedRepresentations The versions of each field on the issue.
     */
    @ApiStatus.Internal
    public IssueBean(IssueBeanChangelog changelog, IssueBeanEditmeta editmeta, String expand, Map<String, Object> fields, IncludedFields fieldsToInclude, String id, String key, Map<String, String> names, IssueBeanOperations operations, Map<String, Object> properties, Map<String, Object> renderedFields, Map<String, JsonTypeBean> schema, URI self, List<IssueTransition> transitions, Map<String, Map<String, Object>> versionedRepresentations) {
        this.changelog = changelog;
        this.editmeta = editmeta;
        this.expand = expand;
        this.fields = fields;
        this.fieldsToInclude = fieldsToInclude;
        this.id = id;
        this.key = key;
        this.names = names;
        this.operations = operations;
        this.properties = properties;
        this.renderedFields = renderedFields;
        this.schema = schema;
        this.self = self;
        this.transitions = transitions;
        this.versionedRepresentations = versionedRepresentations;
    }

}
