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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChangeDetails
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
    "field",
    "fieldId",
    "fieldtype",
    "from",
    "fromString",
    "to",
    "toString"
})
@JsonTypeName("ChangeDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ChangeDetails {

    /**
     * The name of the field changed.
     */
    @JsonProperty("field")
    protected String field;

    /**
     * The ID of the field changed.
     */
    @JsonProperty("fieldId")
    protected String fieldId;

    /**
     * The type of the field changed.
     */
    @JsonProperty("fieldtype")
    protected String fieldtype;

    /**
     * The details of the original value.
     */
    @JsonProperty("from")
    protected String from;

    /**
     * The details of the original value as a string.
     */
    @JsonProperty("fromString")
    protected String fromString;

    /**
     * The details of the new value.
     */
    @JsonProperty("to")
    protected String to;

    /**
     * The details of the new value as a string.
     */
    @JsonProperty("toString")
    protected String toString;

    /**
     * Constructs a validated instance of {@link ChangeDetails}.
     *
     * @param spec the specification to process
     */
    public ChangeDetails(Consumer<ChangeDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ChangeDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ChangeDetails(Consumer)} instead.
     * @param field The name of the field changed.
     * @param fieldId The ID of the field changed.
     * @param fieldtype The type of the field changed.
     * @param from The details of the original value.
     * @param fromString The details of the original value as a string.
     * @param to The details of the new value.
     * @param toString The details of the new value as a string.
     */
    @ApiStatus.Internal
    public ChangeDetails(String field, String fieldId, String fieldtype, String from, String fromString, String to, String toString) {
        this.field = field;
        this.fieldId = fieldId;
        this.fieldtype = fieldtype;
        this.from = from;
        this.fromString = fromString;
        this.to = to;
        this.toString = toString;
    }

}
