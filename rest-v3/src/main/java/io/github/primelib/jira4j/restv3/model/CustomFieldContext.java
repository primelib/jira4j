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
 * CustomFieldContext
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link CustomFieldContext}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomFieldContext(Consumer<CustomFieldContext> spec) {
        spec.accept(this);
    }

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


}
