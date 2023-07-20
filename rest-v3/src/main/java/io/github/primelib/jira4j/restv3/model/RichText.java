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
 * RichText
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "empty",
    "emptyAdf",
    "finalised",
    "valueSet"
})
@JsonTypeName("RichText")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RichText {

    /**
     * Constructs a validated implementation of {@link RichText}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RichText(Consumer<RichText> spec) {
        spec.accept(this);
    }

    @JsonProperty("empty")
    protected Boolean empty;

    @JsonProperty("emptyAdf")
    protected Boolean emptyAdf;

    @JsonProperty("finalised")
    protected Boolean finalised;

    @JsonProperty("valueSet")
    protected Boolean valueSet;


}
