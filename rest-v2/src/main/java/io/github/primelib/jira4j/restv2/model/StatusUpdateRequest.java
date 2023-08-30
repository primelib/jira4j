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
 * StatusUpdateRequest
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
    "statuses"
})
@JsonTypeName("StatusUpdateRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusUpdateRequest {

    /**
     * The list of statuses that will be updated.
     */
    @JsonProperty("statuses")
    protected List<StatusUpdate> statuses;

    /**
     * Constructs a validated instance of {@link StatusUpdateRequest}.
     *
     * @param spec the specification to process
     */
    public StatusUpdateRequest(Consumer<StatusUpdateRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StatusUpdateRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StatusUpdateRequest(Consumer)} instead.
     * @param statuses The list of statuses that will be updated.
     */
    @ApiStatus.Internal
    public StatusUpdateRequest(List<StatusUpdate> statuses) {
        this.statuses = statuses;
    }

}
