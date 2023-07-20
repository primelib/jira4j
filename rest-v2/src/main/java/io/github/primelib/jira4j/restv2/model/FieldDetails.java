package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FieldDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "clauseNames",
    "custom",
    "id",
    "key",
    "name",
    "navigable",
    "orderable",
    "schema",
    "scope",
    "searchable"
})
@JsonTypeName("FieldDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldDetails {

    /**
     * Constructs a validated implementation of {@link FieldDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FieldDetails(Consumer<FieldDetails> spec) {
        spec.accept(this);
    }

    /**
     * The names that can be used to reference the field in an advanced search. For more information, see [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ).
     */
    @JsonProperty("clauseNames")
    protected Set<String> clauseNames;

    /**
     * Whether the field is a custom field.
     */
    @JsonProperty("custom")
    protected Boolean custom;

    /**
     * The ID of the field.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The key of the field.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * The name of the field.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Whether the field can be used as a column on the issue navigator.
     */
    @JsonProperty("navigable")
    protected Boolean navigable;

    /**
     * Whether the content of the field can be used to order lists.
     */
    @JsonProperty("orderable")
    protected Boolean orderable;

    @JsonProperty("schema")
    protected FieldDetailsSchema schema;

    @JsonProperty("scope")
    protected FieldDetailsScope scope;

    /**
     * Whether the content of the field can be searched.
     */
    @JsonProperty("searchable")
    protected Boolean searchable;


}
