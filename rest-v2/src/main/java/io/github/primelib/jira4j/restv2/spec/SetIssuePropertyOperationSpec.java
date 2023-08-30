package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
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
 * SetIssuePropertySpec
 * <p>
 * Specification for the SetIssueProperty operation.
 * <p>
 * Set issue property
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SetIssuePropertyOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID or key of the issue.
     */
    @NotNull 
    private String issueIdOrKey;

    /**
     * The key of the issue property. The maximum length is 255 characters.
     */
    @NotNull 
    private String propertyKey;

    /**
     */
    @NotNull 
    private Object body;

    /**
     * Constructs a validated instance of {@link SetIssuePropertyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SetIssuePropertyOperationSpec(Consumer<SetIssuePropertyOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link SetIssuePropertyOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param issueIdOrKey         The ID or key of the issue.
     * @param propertyKey          The key of the issue property. The maximum length is 255 characters.
     * @param body                 
     */
    @ApiStatus.Internal
    public SetIssuePropertyOperationSpec(String issueIdOrKey, String propertyKey, Object body) {
        this.issueIdOrKey = issueIdOrKey;
        this.propertyKey = propertyKey;
        this.body = body;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(issueIdOrKey, "issueIdOrKey is a required parameter!");
        Objects.requireNonNull(propertyKey, "propertyKey is a required parameter!");
        Objects.requireNonNull(body, "body is a required parameter!");
    }
}
