package io.github.primelib.jira4j.restv3.spec;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetIssueTypeMappingsForContextsSpec
 * <p>
 * Specification for the GetIssueTypeMappingsForContexts operation.
 * <p>
 * Get issue types for custom field context
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetIssueTypeMappingsForContextsOperationSpec {
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
     * The ID of the context. To include multiple contexts, provide an ampersand-separated list. For example, `contextId=10001&amp;contextId=10002`.
     */
    @Nullable 
    private List<Long> contextId;

    /**
     * The index of the first item to return in a page of results (page offset).
     */
    @Nullable 
    private Long startAt = 0L;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults = 50;

    /**
     * Constructs a validated implementation of {@link GetIssueTypeMappingsForContextsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetIssueTypeMappingsForContextsOperationSpec(Consumer<GetIssueTypeMappingsForContextsOperationSpec> spec) {
        spec.accept(this);
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
