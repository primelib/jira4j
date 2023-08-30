package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.CreateIssueSecuritySchemeDetails;
import io.github.primelib.jira4j.restv3.model.SecurityScheme;
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
 * CreateIssueSecuritySchemeSpec
 * <p>
 * Specification for the CreateIssueSecurityScheme operation.
 * <p>
 * Create issue security scheme
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateIssueSecuritySchemeOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private CreateIssueSecuritySchemeDetails createIssueSecuritySchemeDetails;

    /**
     * Constructs a validated instance of {@link CreateIssueSecuritySchemeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateIssueSecuritySchemeOperationSpec(Consumer<CreateIssueSecuritySchemeOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link CreateIssueSecuritySchemeOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param createIssueSecuritySchemeDetails 
     */
    @ApiStatus.Internal
    public CreateIssueSecuritySchemeOperationSpec(CreateIssueSecuritySchemeDetails createIssueSecuritySchemeDetails) {
        this.createIssueSecuritySchemeDetails = createIssueSecuritySchemeDetails;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(createIssueSecuritySchemeDetails, "createIssueSecuritySchemeDetails is a required parameter!");
    }
}
