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
 * CustomFieldContextDefaultValueReadOnly
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
    "text",
    "type"
})
@JsonTypeName("CustomFieldContextDefaultValueReadOnly")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValueReadOnly {

    /**
     * The default text. The maximum length is 255 characters.
     */
    @JsonProperty("text")
    protected String text;

    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueReadOnly}.
     *
     * @param spec the specification to process
     */
    public CustomFieldContextDefaultValueReadOnly(Consumer<CustomFieldContextDefaultValueReadOnly> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueReadOnly}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldContextDefaultValueReadOnly(Consumer)} instead.
     * @param text The default text. The maximum length is 255 characters.
     * @param type type
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValueReadOnly(String text, String type) {
        this.text = text;
        this.type = type;
    }

}
