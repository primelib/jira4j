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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Avatars
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
    "custom",
    "system"
})
@JsonTypeName("Avatars")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Avatars {

    /**
     * Custom avatars list.
     */
    @JsonProperty("custom")
    protected List<Avatar> custom;

    /**
     * System avatars list.
     */
    @JsonProperty("system")
    protected List<Avatar> system;

    /**
     * Constructs a validated instance of {@link Avatars}.
     *
     * @param spec the specification to process
     */
    public Avatars(Consumer<Avatars> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Avatars}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Avatars(Consumer)} instead.
     * @param custom Custom avatars list.
     * @param system System avatars list.
     */
    @ApiStatus.Internal
    public Avatars(List<Avatar> custom, List<Avatar> system) {
        this.custom = custom;
        this.system = system;
    }

}
