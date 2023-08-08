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
 * CustomFieldContextDefaultValueTextArea
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
@JsonTypeName("CustomFieldContextDefaultValueTextArea")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValueTextArea {

    /**
     * The default text. The maximum length is 32767 characters.
     */
    @JsonProperty("text")
    protected String text;

    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueTextArea}.
     *
     * @param spec the specification to process
     */
    public CustomFieldContextDefaultValueTextArea(Consumer<CustomFieldContextDefaultValueTextArea> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueTextArea}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldContextDefaultValueTextArea(Consumer)} instead.
     * @param text The default text. The maximum length is 32767 characters.
     * @param type type
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValueTextArea(String text, String type) {
        this.text = text;
        this.type = type;
    }

}
