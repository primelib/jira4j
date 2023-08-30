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
 * WorkflowStatusUpdate
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
    "description",
    "id",
    "name",
    "statusCategory",
    "statusReference"
})
@JsonTypeName("WorkflowStatusUpdate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkflowStatusUpdate {

    /**
     * The description of the status.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of the status.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The name of the status.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The category of the status.
     */
    @JsonProperty("statusCategory")
    protected StatusCategoryEnum statusCategory;

    /**
     * The reference of the status.
     */
    @JsonProperty("statusReference")
    protected String statusReference;

    /**
     * Constructs a validated instance of {@link WorkflowStatusUpdate}.
     *
     * @param spec the specification to process
     */
    public WorkflowStatusUpdate(Consumer<WorkflowStatusUpdate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkflowStatusUpdate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkflowStatusUpdate(Consumer)} instead.
     * @param description The description of the status.
     * @param id The ID of the status.
     * @param name The name of the status.
     * @param statusCategory The category of the status.
     * @param statusReference The reference of the status.
     */
    @ApiStatus.Internal
    public WorkflowStatusUpdate(String description, String id, String name, StatusCategoryEnum statusCategory, String statusReference) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.statusCategory = statusCategory;
        this.statusReference = statusReference;
    }

    /**
     * The category of the status.
     */
    @AllArgsConstructor
    public enum StatusCategoryEnum {
        TODO("TODO"),
        IN_PROGRESS("IN_PROGRESS"),
        DONE("DONE");

        private static final StatusCategoryEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static StatusCategoryEnum of(String input) {
            if (input != null) {
                for (StatusCategoryEnum v : VALUES) {
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
