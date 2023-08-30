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
 * AutoCompleteSuggestion
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
    "displayName",
    "value"
})
@JsonTypeName("AutoCompleteSuggestion")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutoCompleteSuggestion {

    /**
     * The display name of a suggested item. If {@code fieldValue} or {@code predicateValue} are provided, the matching text is highlighted with the HTML bold tag.
     */
    @JsonProperty("displayName")
    protected String displayName;

    /**
     * The value of a suggested item.
     */
    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link AutoCompleteSuggestion}.
     *
     * @param spec the specification to process
     */
    public AutoCompleteSuggestion(Consumer<AutoCompleteSuggestion> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AutoCompleteSuggestion}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AutoCompleteSuggestion(Consumer)} instead.
     * @param displayName The display name of a suggested item. If {@code fieldValue} or {@code predicateValue} are provided, the matching text is highlighted with the HTML bold tag.
     * @param value The value of a suggested item.
     */
    @ApiStatus.Internal
    public AutoCompleteSuggestion(String displayName, String value) {
        this.displayName = displayName;
        this.value = value;
    }

}
