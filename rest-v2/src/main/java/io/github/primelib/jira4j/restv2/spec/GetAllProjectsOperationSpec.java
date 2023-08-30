package io.github.primelib.jira4j.restv2.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Project;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetAllProjectsSpec
 * <p>
 * Specification for the GetAllProjects operation.
 * <p>
 * Get all projects
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAllProjectsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expanded options include:
     *  *
     * {@code description} Returns the project description.
     * *
     * {@code issueTypes} Returns all issue types associated with the project.
     * *
     * {@code lead} Returns information about the project lead.
     * *
     * {@code projectKeys} Returns all project keys associated with the project.
     */
    @Nullable 
    private String expand;

    /**
     * Returns the user's most recently accessed projects. You may specify the number of results to return up to a maximum of 20. If access is anonymous, then the recently accessed projects are based on the current HTTP session.
     */
    @Nullable 
    private Integer recent;

    /**
     * A list of project properties to return for the project. This parameter accepts a comma-separated list.
     */
    @Nullable 
    private List<String> properties;

    /**
     * Constructs a validated instance of {@link GetAllProjectsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAllProjectsOperationSpec(Consumer<GetAllProjectsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetAllProjectsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expanded options include:   *  {@code description} Returns the project description.  *  {@code issueTypes} Returns all issue types associated with the project.  *  {@code lead} Returns information about the project lead.  *  {@code projectKeys} Returns all project keys associated with the project.
     * @param recent               Returns the user's most recently accessed projects. You may specify the number of results to return up to a maximum of 20. If access is anonymous, then the recently accessed projects are based on the current HTTP session.
     * @param properties           A list of project properties to return for the project. This parameter accepts a comma-separated list.
     */
    @ApiStatus.Internal
    public GetAllProjectsOperationSpec(String expand, Integer recent, List<String> properties) {
        this.expand = expand;
        this.recent = recent;
        this.properties = properties;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
    }
}
