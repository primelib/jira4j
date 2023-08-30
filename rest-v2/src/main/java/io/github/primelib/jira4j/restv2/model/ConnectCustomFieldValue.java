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

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ConnectCustomFieldValue
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
     * The type of custom field.
     */
    @JsonProperty("_type")
    protected TypeEnum _type;

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
     * The value of number type custom field when {@code _type} is {@code NumberIssueField}.
     */
    @JsonProperty("number")
    protected BigDecimal number;

    /**
     * The value of single select and multiselect custom field type when {@code _type} is {@code SingleSelectIssueField} or {@code MultiSelectIssueField}.
     */
    @JsonProperty("optionID")
    protected String optionID;

    /**
     * The value of richText type custom field when {@code _type} is {@code RichTextIssueField}.
     */
    @JsonProperty("richText")
    protected String richText;

    /**
     * The value of string type custom field when {@code _type} is {@code StringIssueField}.
     */
    @JsonProperty("string")
    protected String string;

    /**
     * The value of of text custom field type when {@code _type} is {@code TextIssueField}.
     */
    @JsonProperty("text")
    protected String text;

    /**
     * Constructs a validated instance of {@link ConnectCustomFieldValue}.
     *
     * @param spec the specification to process
     */
    public ConnectCustomFieldValue(Consumer<ConnectCustomFieldValue> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ConnectCustomFieldValue}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ConnectCustomFieldValue(Consumer)} instead.
     * @param _type The type of custom field.
     * @param fieldID The custom field ID.
     * @param issueID The issue ID.
     * @param number The value of number type custom field when {@code _type} is {@code NumberIssueField}.
     * @param optionID The value of single select and multiselect custom field type when {@code _type} is {@code SingleSelectIssueField} or {@code MultiSelectIssueField}.
     * @param richText The value of richText type custom field when {@code _type} is {@code RichTextIssueField}.
     * @param string The value of string type custom field when {@code _type} is {@code StringIssueField}.
     * @param text The value of of text custom field type when {@code _type} is {@code TextIssueField}.
     */
    @ApiStatus.Internal
    public ConnectCustomFieldValue(TypeEnum _type, Integer fieldID, Integer issueID, BigDecimal number, String optionID, String richText, String string, String text) {
        this._type = _type;
        this.fieldID = fieldID;
        this.issueID = issueID;
        this.number = number;
        this.optionID = optionID;
        this.richText = richText;
        this.string = string;
        this.text = text;
    }

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

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
