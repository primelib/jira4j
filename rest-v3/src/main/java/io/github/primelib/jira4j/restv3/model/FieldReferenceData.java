package io.github.primelib.jira4j.restv3.model;

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
 * FieldReferenceData
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "auto",
    "cfid",
    "deprecated",
    "deprecatedSearcherKey",
    "displayName",
    "operators",
    "orderable",
    "searchable",
    "types",
    "value"
})
@JsonTypeName("FieldReferenceData")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldReferenceData {

    /**
     * Constructs a validated implementation of {@link FieldReferenceData}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FieldReferenceData(Consumer<FieldReferenceData> spec) {
        spec.accept(this);
    }

    /**
     * Whether the field provide auto-complete suggestions.
     */
    @JsonProperty("auto")
    protected AutoEnum auto;

    /**
     * If the item is a custom field, the ID of the custom field.
     */
    @JsonProperty("cfid")
    protected String cfid;

    /**
     * Whether this field has been deprecated.
     */
    @JsonProperty("deprecated")
    protected DeprecatedEnum deprecated;

    /**
     * The searcher key of the field, only passed when the field is deprecated.
     */
    @JsonProperty("deprecatedSearcherKey")
    protected String deprecatedSearcherKey;

    /**
     * The display name contains the following:
     *  *
     * for system fields, the field name. For example, `Summary`.
     * *
     * for collapsed custom fields, the field name followed by a hyphen and then the field name and field type. For example, `Component - Component[Dropdown]`.
     * *
     * for other custom fields, the field name followed by a hyphen and then the custom field ID. For example, `Component - cf[10061]`.
     */
    @JsonProperty("displayName")
    protected String displayName;

    /**
     * The valid search operators for the field.
     */
    @JsonProperty("operators")
    protected List<String> operators;

    /**
     * Whether the field can be used in a query's `ORDER BY` clause.
     */
    @JsonProperty("orderable")
    protected OrderableEnum orderable;

    /**
     * Whether the content of this field can be searched.
     */
    @JsonProperty("searchable")
    protected SearchableEnum searchable;

    /**
     * The data types of items in the field.
     */
    @JsonProperty("types")
    protected List<String> types;

    /**
     * The field identifier.
     */
    @JsonProperty("value")
    protected String value;


    /**
     * Whether the field provide auto-complete suggestions.
     */
    @AllArgsConstructor
    public enum AutoEnum {
        TRUE("true"),
        FALSE("false");

        private final String value;
    }

    /**
     * Whether this field has been deprecated.
     */
    @AllArgsConstructor
    public enum DeprecatedEnum {
        TRUE("true"),
        FALSE("false");

        private final String value;
    }

    /**
     * Whether the field can be used in a query's `ORDER BY` clause.
     */
    @AllArgsConstructor
    public enum OrderableEnum {
        TRUE("true"),
        FALSE("false");

        private final String value;
    }

    /**
     * Whether the content of this field can be searched.
     */
    @AllArgsConstructor
    public enum SearchableEnum {
        TRUE("true"),
        FALSE("false");

        private final String value;
    }

}
