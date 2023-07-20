package io.github.primelib.jira4j.restv2.model;

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
 * WorkflowValidationError
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "code",
    "elementReference",
    "level",
    "message",
    "type"
})
@JsonTypeName("WorkflowValidationError")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowValidationError {

    /**
     * Constructs a validated implementation of {@link WorkflowValidationError}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorkflowValidationError(Consumer<WorkflowValidationError> spec) {
        spec.accept(this);
    }

    /**
     * An error code.
     */
    @JsonProperty("code")
    protected String code;

    @JsonProperty("elementReference")
    protected WorkflowElementReference elementReference;

    /**
     * The validation error level.
     */
    @JsonProperty("level")
    protected LevelEnum level;

    /**
     * An error message.
     */
    @JsonProperty("message")
    protected String message;

    /**
     * The type of element the error or warning references.
     */
    @JsonProperty("type")
    protected TypeEnum type;


    /**
     * The validation error level.
     */
    @AllArgsConstructor
    public enum LevelEnum {
        WARNING("WARNING"),
        ERROR("ERROR");

        private final String value;
    }

    /**
     * The type of element the error or warning references.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        RULE("RULE"),
        STATUS("STATUS"),
        STATUS_LAYOUT("STATUS_LAYOUT"),
        STATUS_PROPERTY("STATUS_PROPERTY"),
        WORKFLOW("WORKFLOW"),
        TRANSITION("TRANSITION"),
        TRANSITION_PROPERTY("TRANSITION_PROPERTY"),
        SCOPE("SCOPE"),
        STATUS_MAPPING("STATUS_MAPPING"),
        TRIGGER("TRIGGER");

        private final String value;
    }

}
