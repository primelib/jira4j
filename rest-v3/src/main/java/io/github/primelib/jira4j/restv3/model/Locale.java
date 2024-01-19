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
 * Locale
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
    "locale"
})
@JsonTypeName("Locale")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Locale {

    /**
     * The locale code. The Java the locale format is used: a two character language code (ISO 639), an underscore, and two letter country code (ISO 3166). For example, en\\_US represents a locale of English (United States). Required on create.
     */
    @JsonProperty("locale")
    protected String locale;

    /**
     * Constructs a validated instance of {@link Locale}.
     *
     * @param spec the specification to process
     */
    public Locale(Consumer<Locale> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Locale}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Locale(Consumer)} instead.
     * @param locale The locale code. The Java the locale format is used: a two character language code (ISO 639), an underscore, and two letter country code (ISO 3166). For example, en\\_US represents a locale of English (United States). Required on create.
     */
    @ApiStatus.Internal
    public Locale(String locale) {
        this.locale = locale;
    }

}
