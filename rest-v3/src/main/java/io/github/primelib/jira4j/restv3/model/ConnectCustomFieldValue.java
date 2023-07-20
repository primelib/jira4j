package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConnectCustomFieldValue
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "_type",
    "fieldID",
    "issueID",
    "number",
    "optionID",
    "richText",
    "string",
    "text"
})
@JsonTypeName("ConnectCustomFieldValue")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ConnectCustomFieldValue {

    /**
     * Constructs a validated implementation of {@link ConnectCustomFieldValue}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ConnectCustomFieldValue(Consumer<ConnectCustomFieldValue> spec) {
        spec.accept(this);
    }

    /**
     * The type of custom field.
     */
    @JsonProperty("_type")
    protected TypeEnum type;

    /**
     * The custom field ID.
     */
    @JsonProperty("fieldID")
    protected Integer fieldID;

    /**
     * The issue ID.
     */
    @JsonProperty("issueID")
    protected Integer issueID;

    /**
     * The value of number type custom field when `_type` is `NumberIssueField`.
     */
    @JsonProperty("number")
    protected BigDecimal number;

    /**
     * The value of single select and multiselect custom field type when `_type` is `SingleSelectIssueField` or `MultiSelectIssueField`.
     */
    @JsonProperty("optionID")
    protected String optionID;

    /**
     * The value of richText type custom field when `_type` is `RichTextIssueField`.
     */
    @JsonProperty("richText")
    protected String richText;

    /**
     * The value of string type custom field when `_type` is `StringIssueField`.
     */
    @JsonProperty("string")
    protected String string;

    /**
     * The value of of text custom field type when `_type` is `TextIssueField`.
     */
    @JsonProperty("text")
    protected String text;


    /**
     * The type of custom field.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        STRINGISSUEFIELD("StringIssueField"),
        NUMBERISSUEFIELD("NumberIssueField"),
        RICHTEXTISSUEFIELD("RichTextIssueField"),
        SINGLESELECTISSUEFIELD("SingleSelectIssueField"),
        MULTISELECTISSUEFIELD("MultiSelectIssueField"),
        TEXTISSUEFIELD("TextIssueField");

        private final String value;
    }

}
