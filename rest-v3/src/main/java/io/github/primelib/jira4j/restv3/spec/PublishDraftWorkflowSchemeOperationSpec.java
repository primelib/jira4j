package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.PublishDraftWorkflowScheme;
import java.util.Set;
import io.github.primelib.jira4j.restv3.model.WorkflowScheme;
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
 * PublishDraftWorkflowSchemeSpec
 * <p>
 * Specification for the PublishDraftWorkflowScheme operation.
 * <p>
 * Publish draft workflow scheme
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PublishDraftWorkflowSchemeOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the workflow scheme that the draft belongs to.
     */
    @NotNull 
    private Long id;

    /**
     * Details of the status mappings.
     */
    @NotNull 
    private PublishDraftWorkflowScheme publishDraftWorkflowScheme;

    /**
     * Whether the request only performs a validation.
     */
    @Nullable 
    private Boolean validateOnly;

    /**
     * Constructs a validated instance of {@link PublishDraftWorkflowSchemeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public PublishDraftWorkflowSchemeOperationSpec(Consumer<PublishDraftWorkflowSchemeOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link PublishDraftWorkflowSchemeOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the workflow scheme that the draft belongs to.
     * @param publishDraftWorkflowScheme Details of the status mappings.
     * @param validateOnly         Whether the request only performs a validation.
     */
    @ApiStatus.Internal
    public PublishDraftWorkflowSchemeOperationSpec(Long id, PublishDraftWorkflowScheme publishDraftWorkflowScheme, Boolean validateOnly) {
        this.id = id;
        this.publishDraftWorkflowScheme = publishDraftWorkflowScheme;
        this.validateOnly = validateOnly;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(publishDraftWorkflowScheme, "publishDraftWorkflowScheme is a required parameter!");
    }
}
