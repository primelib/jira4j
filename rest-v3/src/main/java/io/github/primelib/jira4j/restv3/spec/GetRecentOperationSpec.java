package io.github.primelib.jira4j.restv3.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

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
 * GetRecentSpec
 * <p>
 * Specification for the GetRecent operation.
 * <p>
 * Get recent projects
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetRecentOperationSpec {
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
     * {@code projectKeys} Returns all project keys associated with a project.
     * *
     * {@code lead} Returns information about the project lead.
     * *
     * {@code issueTypes} Returns all issue types associated with the project.
     * *
     * {@code url} Returns the URL associated with the project.
     * *
     * {@code permissions} Returns the permissions associated with the project.
     * *
     * {@code insight} EXPERIMENTAL. Returns the insight details of total issue count and last issue update time for the project.
     * *
     * {@code *} Returns the project with all available expand options.
     */
    @Nullable 
    private String expand;

    /**
     * EXPERIMENTAL. A list of project properties to return for the project. This parameter accepts a comma-separated list. Invalid property names are ignored.
     */
    @Nullable 
    private List<Object> properties;

    /**
     * Constructs a validated instance of {@link GetRecentOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetRecentOperationSpec(Consumer<GetRecentOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetRecentOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expanded options include:   *  {@code description} Returns the project description.  *  {@code projectKeys} Returns all project keys associated with a project.  *  {@code lead} Returns information about the project lead.  *  {@code issueTypes} Returns all issue types associated with the project.  *  {@code url} Returns the URL associated with the project.  *  {@code permissions} Returns the permissions associated with the project.  *  {@code insight} EXPERIMENTAL. Returns the insight details of total issue count and last issue update time for the project.  *  {@code *} Returns the project with all available expand options.
     * @param properties           EXPERIMENTAL. A list of project properties to return for the project. This parameter accepts a comma-separated list. Invalid property names are ignored.
     */
    @ApiStatus.Internal
    public GetRecentOperationSpec(String expand, List<Object> properties) {
        this.expand = expand;
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
