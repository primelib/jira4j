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

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomFieldOption
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
    "self",
    "value"
})
@JsonTypeName("CustomFieldOption")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldOption {

    /**
     * The URL of these custom field option details.
     */
    @JsonProperty("self")
    protected URI self;

    /**
     * The value of the custom field option.
     */
    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link CustomFieldOption}.
     *
     * @param spec the specification to process
     */
    public CustomFieldOption(Consumer<CustomFieldOption> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldOption}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldOption(Consumer)} instead.
     * @param self The URL of these custom field option details.
     * @param value The value of the custom field option.
     */
    @ApiStatus.Internal
    public CustomFieldOption(URI self, String value) {
        this.self = self;
        this.value = value;
    }

}
