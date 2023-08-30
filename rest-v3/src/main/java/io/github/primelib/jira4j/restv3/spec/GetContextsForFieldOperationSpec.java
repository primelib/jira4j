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
 * GetContextsForFieldSpec
 * <p>
 * Specification for the GetContextsForField operation.
 * <p>
 * Get custom field contexts
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetContextsForFieldOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the custom field.
     */
    @NotNull 
    private String fieldId;

    /**
     * Whether to return contexts that apply to all issue types.
     */
    @Nullable 
    private Boolean isAnyIssueType;

    /**
     * Whether to return contexts that apply to all projects.
     */
    @Nullable 
    private Boolean isGlobalContext;

    /**
     * The list of context IDs. To include multiple contexts, separate IDs with ampersand: {@code contextId=10000&amp;contextId=10001}.
     */
    @Nullable 
    private Set<Long> contextId;

    /**
     * The index of the first item to return in a page of results (page offset).
     */
    @Nullable 
    private Long startAt;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults;

    /**
     * Constructs a validated instance of {@link GetContextsForFieldOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetContextsForFieldOperationSpec(Consumer<GetContextsForFieldOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetContextsForFieldOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param fieldId              The ID of the custom field.
     * @param isAnyIssueType       Whether to return contexts that apply to all issue types.
     * @param isGlobalContext      Whether to return contexts that apply to all projects.
     * @param contextId            The list of context IDs. To include multiple contexts, separate IDs with ampersand: {@code contextId=10000&amp;contextId=10001}.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     */
    @ApiStatus.Internal
    public GetContextsForFieldOperationSpec(String fieldId, Boolean isAnyIssueType, Boolean isGlobalContext, Set<Long> contextId, Long startAt, Integer maxResults) {
        this.fieldId = fieldId;
        this.isAnyIssueType = isAnyIssueType;
        this.isGlobalContext = isGlobalContext;
        this.contextId = contextId;
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
        Objects.requireNonNull(fieldId, "fieldId is a required parameter!");
    }
}
