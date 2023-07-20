package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Worklog;
import lombok.AccessLevel;
import lombok.Data;
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
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
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
     * `properties`, which returns worklog properties.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated implementation of {@link GetWorklogOperationSpec}.
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
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(issueIdOrKey, "issueIdOrKey is a required parameter!");
        Objects.requireNonNull(id, "id is a required parameter!");
    }

}
