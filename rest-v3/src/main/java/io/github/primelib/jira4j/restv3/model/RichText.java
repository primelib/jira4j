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
 * RichText
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
    "empty",
    "emptyAdf",
    "finalised",
    "valueSet"
})
@JsonTypeName("RichText")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RichText {

    @JsonProperty("empty")
    protected Boolean empty;

    @JsonProperty("emptyAdf")
    protected Boolean emptyAdf;

    @JsonProperty("finalised")
    protected Boolean finalised;

    @JsonProperty("valueSet")
    protected Boolean valueSet;

    /**
     * Constructs a validated instance of {@link RichText}.
     *
     * @param spec the specification to process
     */
    public RichText(Consumer<RichText> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RichText}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RichText(Consumer)} instead.
     * @param empty empty
     * @param emptyAdf emptyAdf
     * @param finalised finalised
     * @param valueSet valueSet
     */
    @ApiStatus.Internal
    public RichText(Boolean empty, Boolean emptyAdf, Boolean finalised, Boolean valueSet) {
        this.empty = empty;
        this.emptyAdf = emptyAdf;
        this.finalised = finalised;
        this.valueSet = valueSet;
    }

}
