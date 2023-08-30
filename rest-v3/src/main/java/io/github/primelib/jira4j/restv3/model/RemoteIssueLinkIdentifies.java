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
 * RemoteIssueLinkIdentifies
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
@JsonTypeName("RemoteIssueLinkIdentifies")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoteIssueLinkIdentifies {

    /**
     * The ID of the remote issue link, such as the ID of the item on the remote system.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The URL of the remote issue link.
     */
    @JsonProperty("self")
    protected String self;

    /**
     * Constructs a validated instance of {@link RemoteIssueLinkIdentifies}.
     *
     * @param spec the specification to process
     */
    public RemoteIssueLinkIdentifies(Consumer<RemoteIssueLinkIdentifies> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RemoteIssueLinkIdentifies}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RemoteIssueLinkIdentifies(Consumer)} instead.
     * @param id The ID of the remote issue link, such as the ID of the item on the remote system.
     * @param self The URL of the remote issue link.
     */
    @ApiStatus.Internal
    public RemoteIssueLinkIdentifies(Long id, String self) {
        this.id = id;
        this.self = self;
    }

}
