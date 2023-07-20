package io.github.primelib.jira4j.restv2.model;

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
 * AutoCompleteSuggestion
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "displayName",
    "value"
})
@JsonTypeName("AutoCompleteSuggestion")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutoCompleteSuggestion {

    /**
     * Constructs a validated implementation of {@link AutoCompleteSuggestion}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AutoCompleteSuggestion(Consumer<AutoCompleteSuggestion> spec) {
        spec.accept(this);
    }

    /**
     * The display name of a suggested item. If `fieldValue` or `predicateValue` are provided, the matching text is highlighted with the HTML bold tag.
     */
    @JsonProperty("displayName")
    protected String displayName;

    /**
     * The value of a suggested item.
     */
    @JsonProperty("value")
    protected String value;


}
