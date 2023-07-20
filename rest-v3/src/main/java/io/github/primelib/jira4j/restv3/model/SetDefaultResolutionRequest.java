package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SetDefaultResolutionRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id"
})
@JsonTypeName("SetDefaultResolutionRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SetDefaultResolutionRequest {

    /**
     * Constructs a validated implementation of {@link SetDefaultResolutionRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SetDefaultResolutionRequest(Consumer<SetDefaultResolutionRequest> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the new default issue resolution. Must be an existing ID or null. Setting this to null erases the default resolution setting.
     */
    @JsonProperty("id")
    protected String id;


}
