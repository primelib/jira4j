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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FieldReferenceData
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
     * for system fields, the field name. For example, {@code Summary}.
     * *
     * for collapsed custom fields, the field name followed by a hyphen and then the field name and field type. For example, {@code Component - Component[Dropdown]}.
     * *
     * for other custom fields, the field name followed by a hyphen and then the custom field ID. For example, {@code Component - cf[10061]}.
     */
    @JsonProperty("displayName")
    protected String displayName;

    /**
     * The valid search operators for the field.
     */
    @JsonProperty("operators")
    protected List<String> operators;

    /**
     * Whether the field can be used in a query's {@code ORDER BY} clause.
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
     * Constructs a validated instance of {@link FieldReferenceData}.
     *
     * @param spec the specification to process
     */
    public FieldReferenceData(Consumer<FieldReferenceData> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FieldReferenceData}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FieldReferenceData(Consumer)} instead.
     * @param auto Whether the field provide auto-complete suggestions.
     * @param cfid If the item is a custom field, the ID of the custom field.
     * @param deprecated Whether this field has been deprecated.
     * @param deprecatedSearcherKey The searcher key of the field, only passed when the field is deprecated.
     * @param displayName The display name contains the following:   *  for system fields, the field name. For example, {@code Summary}.  *  for collapsed custom fields, the field name followed by a hyphen and then the field name and field type. For example, {@code Component - Component[Dropdown]}.  *  for other custom fields, the field name followed by a hyphen and then the custom field ID. For example, {@code Component - cf[10061]}.
     * @param operators The valid search operators for the field.
     * @param orderable Whether the field can be used in a query's {@code ORDER BY} clause.
     * @param searchable Whether the content of this field can be searched.
     * @param types The data types of items in the field.
     * @param value The field identifier.
     */
    @ApiStatus.Internal
    public FieldReferenceData(AutoEnum auto, String cfid, DeprecatedEnum deprecated, String deprecatedSearcherKey, String displayName, List<String> operators, OrderableEnum orderable, SearchableEnum searchable, List<String> types, String value) {
        this.auto = auto;
        this.cfid = cfid;
        this.deprecated = deprecated;
        this.deprecatedSearcherKey = deprecatedSearcherKey;
        this.displayName = displayName;
        this.operators = operators;
        this.orderable = orderable;
        this.searchable = searchable;
        this.types = types;
        this.value = value;
    }

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
     * Whether the field can be used in a query's {@code ORDER BY} clause.
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
