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
 * SecuritySchemeId
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
    "id"
})
@JsonTypeName("SecuritySchemeId")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SecuritySchemeId {

    /**
     * The ID of the issue security scheme.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Constructs a validated instance of {@link SecuritySchemeId}.
     *
     * @param spec the specification to process
     */
    public SecuritySchemeId(Consumer<SecuritySchemeId> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SecuritySchemeId}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SecuritySchemeId(Consumer)} instead.
     * @param id The ID of the issue security scheme.
     */
    @ApiStatus.Internal
    public SecuritySchemeId(String id) {
        this.id = id;
    }

}
