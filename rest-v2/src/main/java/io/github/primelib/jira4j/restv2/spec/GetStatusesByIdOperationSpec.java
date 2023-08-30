package io.github.primelib.jira4j.restv2.spec;

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
 * GetStatusesByIdSpec
 * <p>
 * Specification for the GetStatusesById operation.
 * <p>
 * Bulk get statuses
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetStatusesByIdOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * {@code usages} Returns the project and issue types that use the status in their workflow.
     * *
     * {@code workflowUsages} Returns the workflows that use the status.
     */
    @Nullable 
    private String expand;

    /**
     * The list of status IDs. To include multiple IDs, provide an ampersand-separated list. For example, id=10000&amp;id=10001.
     * Min items {@code 1}, Max items {@code 50}
     */
    @Nullable 
    private List<String> id;

    /**
     * Constructs a validated instance of {@link GetStatusesByIdOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetStatusesByIdOperationSpec(Consumer<GetStatusesByIdOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetStatusesByIdOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code usages} Returns the project and issue types that use the status in their workflow.  *  {@code workflowUsages} Returns the workflows that use the status.
     * @param id                   The list of status IDs. To include multiple IDs, provide an ampersand-separated list. For example, id=10000&amp;id=10001.  Min items {@code 1}, Max items {@code 50}
     */
    @ApiStatus.Internal
    public GetStatusesByIdOperationSpec(String expand, List<String> id) {
        this.expand = expand;
        this.id = id;

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
