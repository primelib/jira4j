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
 * NotificationSchemeId
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
@JsonTypeName("NotificationSchemeId")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotificationSchemeId {

    /**
     * The ID of a notification scheme.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Constructs a validated instance of {@link NotificationSchemeId}.
     *
     * @param spec the specification to process
     */
    public NotificationSchemeId(Consumer<NotificationSchemeId> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link NotificationSchemeId}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #NotificationSchemeId(Consumer)} instead.
     * @param id The ID of a notification scheme.
     */
    @ApiStatus.Internal
    public NotificationSchemeId(String id) {
        this.id = id;
    }

}
