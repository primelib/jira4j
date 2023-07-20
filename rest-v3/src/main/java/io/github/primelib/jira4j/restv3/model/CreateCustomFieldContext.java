package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateCustomFieldContext
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "id",
    "issueTypeIds",
    "name",
    "projectIds"
})
@JsonTypeName("CreateCustomFieldContext")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateCustomFieldContext {

    /**
     * Constructs a validated implementation of {@link CreateCustomFieldContext}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateCustomFieldContext(Consumer<CreateCustomFieldContext> spec) {
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
     * The list of issue types IDs for the context. If the list is empty, the context refers to all issue types.
     */
    @JsonProperty("issueTypeIds")
    protected List<String> issueTypeIds;

    /**
     * The name of the context.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The list of project IDs associated with the context. If the list is empty, the context is global.
     */
    @JsonProperty("projectIds")
    protected List<String> projectIds;


}
