package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChangeDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link ChangeDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ChangeDetails(Consumer<ChangeDetails> spec) {
        spec.accept(this);
    }

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


}
