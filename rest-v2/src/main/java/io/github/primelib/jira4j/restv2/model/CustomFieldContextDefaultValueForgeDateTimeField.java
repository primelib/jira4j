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
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomFieldContextDefaultValueForgeDateTimeField
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
    "contextId",
    "dateTime",
    "type",
    "useCurrent"
})
@JsonTypeName("CustomFieldContextDefaultValueForgeDateTimeField")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValueForgeDateTimeField {

    /**
     * The ID of the context.
     */
    @JsonProperty("contextId")
    protected String contextId;

    /**
     * The default date-time in ISO format. Ignored if {@code useCurrent} is true.
     */
    @JsonProperty("dateTime")
    protected String dateTime;

    @JsonProperty("type")
    protected String type;

    /**
     * Whether to use the current date.
     */
    @JsonProperty("useCurrent")
    protected Boolean useCurrent;

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueForgeDateTimeField}.
     *
     * @param spec the specification to process
     */
    public CustomFieldContextDefaultValueForgeDateTimeField(Consumer<CustomFieldContextDefaultValueForgeDateTimeField> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueForgeDateTimeField}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldContextDefaultValueForgeDateTimeField(Consumer)} instead.
     * @param contextId The ID of the context.
     * @param dateTime The default date-time in ISO format. Ignored if {@code useCurrent} is true.
     * @param type type
     * @param useCurrent Whether to use the current date.
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValueForgeDateTimeField(String contextId, String dateTime, String type, Boolean useCurrent) {
        this.contextId = contextId;
        this.dateTime = dateTime;
        this.type = type;
        this.useCurrent = useCurrent;
    }

}
