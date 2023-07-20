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
 * Locale
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "locale"
})
@JsonTypeName("Locale")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Locale {

    /**
     * Constructs a validated implementation of {@link Locale}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Locale(Consumer<Locale> spec) {
        spec.accept(this);
    }

    /**
     * The locale code. The Java the locale format is used: a two character language code (ISO 639), an underscore, and two letter country code (ISO 3166). For example, en\\_US represents a locale of English (United States). Required on create.
     */
    @JsonProperty("locale")
    protected String locale;


}
