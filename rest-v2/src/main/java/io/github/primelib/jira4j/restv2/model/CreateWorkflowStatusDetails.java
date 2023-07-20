package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateWorkflowStatusDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "properties"
})
@JsonTypeName("CreateWorkflowStatusDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateWorkflowStatusDetails {

    /**
     * Constructs a validated implementation of {@link CreateWorkflowStatusDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateWorkflowStatusDetails(Consumer<CreateWorkflowStatusDetails> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the status.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The properties of the status.
     */
    @JsonProperty("properties")
    protected Map<String, String> properties = new HashMap<>();


}
