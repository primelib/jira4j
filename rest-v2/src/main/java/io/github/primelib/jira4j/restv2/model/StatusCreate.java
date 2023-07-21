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

/**
 * StatusCreate
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
    "name",
    "statusCategory"
})
@JsonTypeName("StatusCreate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusCreate {

    /**
     * The description of the status.
     */
    @JsonProperty("description")
    protected String description;

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
     * Constructs a validated instance of {@link StatusCreate}.
     *
     * @param spec the specification to process
     */
    public StatusCreate(Consumer<StatusCreate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StatusCreate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StatusCreate(Consumer)} instead.
     * @param description The description of the status.
     * @param name The name of the status.
     * @param statusCategory The category of the status.
     */
    @ApiStatus.Internal
    public StatusCreate(String description, String name, StatusCategoryEnum statusCategory) {
        this.description = description;
        this.name = name;
        this.statusCategory = statusCategory;
    }

    /**
     * The category of the status.
     */
    @AllArgsConstructor
    public enum StatusCategoryEnum {
        TODO("TODO"),
        IN_PROGRESS("IN_PROGRESS"),
        DONE("DONE");

        private final String value;
    }

}
