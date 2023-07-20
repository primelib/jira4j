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
 * SetDefaultPriorityRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id"
})
@JsonTypeName("SetDefaultPriorityRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SetDefaultPriorityRequest {

    /**
     * Constructs a validated implementation of {@link SetDefaultPriorityRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SetDefaultPriorityRequest(Consumer<SetDefaultPriorityRequest> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the new default issue priority. Must be an existing ID or null. Setting this to null erases the default priority setting.
     */
    @JsonProperty("id")
    protected String id;


}
