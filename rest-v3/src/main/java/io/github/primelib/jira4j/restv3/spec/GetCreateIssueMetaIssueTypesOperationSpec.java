package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
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
 * GetCreateIssueMetaIssueTypesSpec
 * <p>
 * Specification for the GetCreateIssueMetaIssueTypes operation.
 * <p>
 * Get create metadata issue types for a project
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetCreateIssueMetaIssueTypesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID or key of the project.
     */
    @NotNull 
    private String projectIdOrKey;

    /**
     * The index of the first item to return in a page of results (page offset).
     */
    @Nullable 
    private Integer startAt;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults;

    /**
     * Constructs a validated instance of {@link GetCreateIssueMetaIssueTypesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetCreateIssueMetaIssueTypesOperationSpec(Consumer<GetCreateIssueMetaIssueTypesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetCreateIssueMetaIssueTypesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param projectIdOrKey       The ID or key of the project.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     */
    @ApiStatus.Internal
    public GetCreateIssueMetaIssueTypesOperationSpec(String projectIdOrKey, Integer startAt, Integer maxResults) {
        this.projectIdOrKey = projectIdOrKey;
        this.startAt = startAt;
        this.maxResults = maxResults;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(projectIdOrKey, "projectIdOrKey is a required parameter!");
    }
}
