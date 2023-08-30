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
 * CustomFieldReplacement
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
    "customFieldId",
    "moveTo"
})
@JsonTypeName("CustomFieldReplacement")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldReplacement {

    /**
     * The ID of the custom field in which to replace the version number.
     */
    @JsonProperty("customFieldId")
    protected Long customFieldId;

    /**
     * The version number to use as a replacement for the deleted version.
     */
    @JsonProperty("moveTo")
    protected Long moveTo;

    /**
     * Constructs a validated instance of {@link CustomFieldReplacement}.
     *
     * @param spec the specification to process
     */
    public CustomFieldReplacement(Consumer<CustomFieldReplacement> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldReplacement}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldReplacement(Consumer)} instead.
     * @param customFieldId The ID of the custom field in which to replace the version number.
     * @param moveTo The version number to use as a replacement for the deleted version.
     */
    @ApiStatus.Internal
    public CustomFieldReplacement(Long customFieldId, Long moveTo) {
        this.customFieldId = customFieldId;
        this.moveTo = moveTo;
    }

}
