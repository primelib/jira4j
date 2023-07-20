package io.github.primelib.jira4j.restv3.model;

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
 * StatusUpdateRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "statuses"
})
@JsonTypeName("StatusUpdateRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusUpdateRequest {

    /**
     * Constructs a validated implementation of {@link StatusUpdateRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public StatusUpdateRequest(Consumer<StatusUpdateRequest> spec) {
        spec.accept(this);
    }

    /**
     * The list of statuses that will be updated.
     */
    @JsonProperty("statuses")
    protected List<StatusUpdate> statuses;


}
