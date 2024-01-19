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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateCustomFieldContext
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
    "issueTypeIds",
    "name",
    "projectIds"
})
@JsonTypeName("CreateCustomFieldContext")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateCustomFieldContext {

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

    /**
     * Constructs a validated instance of {@link CreateCustomFieldContext}.
     *
     * @param spec the specification to process
     */
    public CreateCustomFieldContext(Consumer<CreateCustomFieldContext> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateCustomFieldContext}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateCustomFieldContext(Consumer)} instead.
     * @param description The description of the context.
     * @param id The ID of the context.
     * @param issueTypeIds The list of issue types IDs for the context. If the list is empty, the context refers to all issue types.
     * @param name The name of the context.
     * @param projectIds The list of project IDs associated with the context. If the list is empty, the context is global.
     */
    @ApiStatus.Internal
    public CreateCustomFieldContext(String description, String id, List<String> issueTypeIds, String name, List<String> projectIds) {
        this.description = description;
        this.id = id;
        this.issueTypeIds = issueTypeIds;
        this.name = name;
        this.projectIds = projectIds;
    }

}
