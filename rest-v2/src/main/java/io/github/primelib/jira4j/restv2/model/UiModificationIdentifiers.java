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
 * UiModificationIdentifiers
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
    "id",
    "self"
})
@JsonTypeName("UiModificationIdentifiers")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UiModificationIdentifiers {

    /**
     * The ID of the UI modification.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The URL of the UI modification.
     */
    @JsonProperty("self")
    protected String self;

    /**
     * Constructs a validated instance of {@link UiModificationIdentifiers}.
     *
     * @param spec the specification to process
     */
    public UiModificationIdentifiers(Consumer<UiModificationIdentifiers> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UiModificationIdentifiers}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UiModificationIdentifiers(Consumer)} instead.
     * @param id The ID of the UI modification.
     * @param self The URL of the UI modification.
     */
    @ApiStatus.Internal
    public UiModificationIdentifiers(String id, String self) {
        this.id = id;
        this.self = self;
    }

}
