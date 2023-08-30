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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateWorkflowStatusDetails
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
    "properties"
})
@JsonTypeName("CreateWorkflowStatusDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateWorkflowStatusDetails {

    /**
     * The ID of the status.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The properties of the status.
     */
    @JsonProperty("properties")
    protected Map<String, String> properties;

    /**
     * Constructs a validated instance of {@link CreateWorkflowStatusDetails}.
     *
     * @param spec the specification to process
     */
    public CreateWorkflowStatusDetails(Consumer<CreateWorkflowStatusDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateWorkflowStatusDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateWorkflowStatusDetails(Consumer)} instead.
     * @param id The ID of the status.
     * @param properties The properties of the status.
     */
    @ApiStatus.Internal
    public CreateWorkflowStatusDetails(String id, Map<String, String> properties) {
        this.id = id;
        this.properties = properties;
    }

}
