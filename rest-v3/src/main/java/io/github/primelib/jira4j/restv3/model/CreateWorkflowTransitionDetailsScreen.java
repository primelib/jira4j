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
 * CreateWorkflowTransitionDetailsScreen
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id"
})
@JsonTypeName("CreateWorkflowTransitionDetails_screen")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateWorkflowTransitionDetailsScreen {

    /**
     * Constructs a validated implementation of {@link CreateWorkflowTransitionDetailsScreen}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateWorkflowTransitionDetailsScreen(Consumer<CreateWorkflowTransitionDetailsScreen> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the screen.
     */
    @JsonProperty("id")
    protected String id;


}
