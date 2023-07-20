package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SecuritySchemeId
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "id"
})
@JsonTypeName("SecuritySchemeId")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SecuritySchemeId extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link SecuritySchemeId}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SecuritySchemeId(Consumer<SecuritySchemeId> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the issue security scheme.
     */
    @JsonProperty("id")
    protected String id;


}
