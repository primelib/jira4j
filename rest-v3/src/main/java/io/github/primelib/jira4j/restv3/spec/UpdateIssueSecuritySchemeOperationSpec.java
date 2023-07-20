package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.SecurityScheme;
import io.github.primelib.jira4j.restv3.model.UpdateIssueSecuritySchemeRequestBean;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * UpdateIssueSecuritySchemeSpec
 * <p>
 * Specification for the UpdateIssueSecurityScheme operation.
 * <p>
 * Update issue security scheme
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateIssueSecuritySchemeOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the issue security scheme.
     */
    @NotNull 
    private String id;

    /**
     */
    @NotNull 
    private UpdateIssueSecuritySchemeRequestBean updateIssueSecuritySchemeRequestBean;

    /**
     * Constructs a validated implementation of {@link UpdateIssueSecuritySchemeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateIssueSecuritySchemeOperationSpec(Consumer<UpdateIssueSecuritySchemeOperationSpec> spec) {
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
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(updateIssueSecuritySchemeRequestBean, "updateIssueSecuritySchemeRequestBean is a required parameter!");
    }

}
