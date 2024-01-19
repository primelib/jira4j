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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * WorkflowValidationError
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
     * Constructs a validated instance of {@link WorkflowValidationError}.
     *
     * @param spec the specification to process
     */
    public WorkflowValidationError(Consumer<WorkflowValidationError> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowValidationError}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowValidationError(Consumer)} instead.
     * @param code An error code.
     * @param elementReference elementReference
     * @param level The validation error level.
     * @param message An error message.
     * @param type The type of element the error or warning references.
     */
    @ApiStatus.Internal
    public WorkflowValidationError(String code, WorkflowElementReference elementReference, LevelEnum level, String message, TypeEnum type) {
        this.code = code;
        this.elementReference = elementReference;
        this.level = level;
        this.message = message;
        this.type = type;
    }

    /**
     * The validation error level.
     */
    @AllArgsConstructor
    public enum LevelEnum {
        WARNING("WARNING"),
        ERROR("ERROR");

        private static final LevelEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static LevelEnum of(String input) {
            if (input != null) {
                for (LevelEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
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

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
