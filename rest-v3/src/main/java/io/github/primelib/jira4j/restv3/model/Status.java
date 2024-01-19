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
 * Status
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
    "icon",
    "resolved"
})
@JsonTypeName("Status")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Status {

    @JsonProperty("icon")
    protected Icon icon;

    /**
     * Whether the item is resolved. If set to "true", the link to the issue is displayed in a strikethrough font, otherwise the link displays in normal font.
     */
    @JsonProperty("resolved")
    protected Boolean resolved;

    /**
     * Constructs a validated instance of {@link Status}.
     *
     * @param spec the specification to process
     */
    public Status(Consumer<Status> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Status}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Status(Consumer)} instead.
     * @param icon icon
     * @param resolved Whether the item is resolved. If set to "true", the link to the issue is displayed in a strikethrough font, otherwise the link displays in normal font.
     */
    @ApiStatus.Internal
    public Status(Icon icon, Boolean resolved) {
        this.icon = icon;
        this.resolved = resolved;
    }

}
