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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SecuritySchemes
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
    "issueSecuritySchemes"
})
@JsonTypeName("SecuritySchemes")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SecuritySchemes {

    /**
     * List of security schemes.
     */
    @JsonProperty("issueSecuritySchemes")
    protected List<SecurityScheme> issueSecuritySchemes;

    /**
     * Constructs a validated instance of {@link SecuritySchemes}.
     *
     * @param spec the specification to process
     */
    public SecuritySchemes(Consumer<SecuritySchemes> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SecuritySchemes}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SecuritySchemes(Consumer)} instead.
     * @param issueSecuritySchemes List of security schemes.
     */
    @ApiStatus.Internal
    public SecuritySchemes(List<SecurityScheme> issueSecuritySchemes) {
        this.issueSecuritySchemes = issueSecuritySchemes;
    }

}
