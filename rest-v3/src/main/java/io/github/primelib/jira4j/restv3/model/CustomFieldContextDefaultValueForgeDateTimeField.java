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
 * CustomFieldContextDefaultValueForgeDateTimeField
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "contextId",
    "dateTime",
    "type",
    "useCurrent"
})
@JsonTypeName("CustomFieldContextDefaultValueForgeDateTimeField")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValueForgeDateTimeField {

    /**
     * Constructs a validated implementation of {@link CustomFieldContextDefaultValueForgeDateTimeField}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValueForgeDateTimeField(Consumer<CustomFieldContextDefaultValueForgeDateTimeField> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the context.
     */
    @JsonProperty("contextId")
    protected String contextId;

    /**
     * The default date-time in ISO format. Ignored if `useCurrent` is true.
     */
    @JsonProperty("dateTime")
    protected String dateTime;

    @JsonProperty("type")
    protected String type;

    /**
     * Whether to use the current date.
     */
    @JsonProperty("useCurrent")
    protected Boolean useCurrent = false;


}
