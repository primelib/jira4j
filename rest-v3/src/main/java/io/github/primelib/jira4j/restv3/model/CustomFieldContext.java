package io.github.primelib.jira4j.restv3.model;

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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomFieldContext
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
    "isAnyIssueType",
    "isGlobalContext",
    "name"
})
@JsonTypeName("CustomFieldContext")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContext {

    /**
     * The description of the context.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of the context.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Whether the context apply to all issue types.
     */
    @JsonProperty("isAnyIssueType")
    protected Boolean isAnyIssueType;

    /**
     * Whether the context is global.
     */
    @JsonProperty("isGlobalContext")
    protected Boolean isGlobalContext;

    /**
     * The name of the context.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link CustomFieldContext}.
     *
     * @param spec the specification to process
     */
    public CustomFieldContext(Consumer<CustomFieldContext> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldContext}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldContext(Consumer)} instead.
     * @param description The description of the context.
     * @param id The ID of the context.
     * @param isAnyIssueType Whether the context apply to all issue types.
     * @param isGlobalContext Whether the context is global.
     * @param name The name of the context.
     */
    @ApiStatus.Internal
    public CustomFieldContext(String description, String id, Boolean isAnyIssueType, Boolean isGlobalContext, String name) {
        this.description = description;
        this.id = id;
        this.isAnyIssueType = isAnyIssueType;
        this.isGlobalContext = isGlobalContext;
        this.name = name;
    }

}
