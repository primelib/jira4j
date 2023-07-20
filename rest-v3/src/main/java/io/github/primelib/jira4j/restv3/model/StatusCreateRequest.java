package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StatusCreateRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "scope",
    "statuses"
})
@JsonTypeName("StatusCreateRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusCreateRequest {

    /**
     * Constructs a validated implementation of {@link StatusCreateRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public StatusCreateRequest(Consumer<StatusCreateRequest> spec) {
        spec.accept(this);
    }

    @JsonProperty("scope")
    protected StatusScope scope;

    /**
     * Details of the statuses being created.
     */
    @JsonProperty("statuses")
    protected List<StatusCreate> statuses = new ArrayList<>();


}
