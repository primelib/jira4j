package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SecuritySchemes
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "issueSecuritySchemes"
})
@JsonTypeName("SecuritySchemes")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SecuritySchemes {

    /**
     * Constructs a validated implementation of {@link SecuritySchemes}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SecuritySchemes(Consumer<SecuritySchemes> spec) {
        spec.accept(this);
    }

    /**
     * List of security schemes.
     */
    @JsonProperty("issueSecuritySchemes")
    protected List<SecurityScheme> issueSecuritySchemes;


}
