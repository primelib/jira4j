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
 * ResolutionId
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
@JsonTypeName("ResolutionId")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ResolutionId {

    /**
     * The ID of the issue resolution.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Constructs a validated instance of {@link ResolutionId}.
     *
     * @param spec the specification to process
     */
    public ResolutionId(Consumer<ResolutionId> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ResolutionId}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ResolutionId(Consumer)} instead.
     * @param id The ID of the issue resolution.
     */
    @ApiStatus.Internal
    public ResolutionId(String id) {
        this.id = id;
    }

}
