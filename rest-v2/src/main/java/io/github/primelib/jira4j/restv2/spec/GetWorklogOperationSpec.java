package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.util.Set;
import io.github.primelib.jira4j.restv2.model.Worklog;
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
 * GetWorklogSpec
 * <p>
 * Specification for the GetWorklog operation.
 * <p>
 * Get worklog
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetWorklogOperationSpec {
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
     * The ID of the worklog.
     */
    @NotNull 
    private String id;

    /**
     * Use [expand](#expansion) to include additional information about work logs in the response. This parameter accepts
     * {@code properties}, which returns worklog properties.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated instance of {@link GetWorklogOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetWorklogOperationSpec(Consumer<GetWorklogOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetWorklogOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param issueIdOrKey         The ID or key of the issue.
     * @param id                   The ID of the worklog.
     * @param expand               Use [expand](#expansion) to include additional information about work logs in the response. This parameter accepts  {@code properties}, which returns worklog properties.
     */
    @ApiStatus.Internal
    public GetWorklogOperationSpec(String issueIdOrKey, String id, String expand) {
        this.issueIdOrKey = issueIdOrKey;
        this.id = id;
        this.expand = expand;

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
        Objects.requireNonNull(id, "id is a required parameter!");
    }
}
