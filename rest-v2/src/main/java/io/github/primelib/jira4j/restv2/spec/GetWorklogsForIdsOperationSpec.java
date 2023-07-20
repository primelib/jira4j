package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Worklog;
import io.github.primelib.jira4j.restv2.model.WorklogIdsRequestBean;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetWorklogsForIdsSpec
 * <p>
 * Specification for the GetWorklogsForIds operation.
 * <p>
 * Get worklogs
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetWorklogsForIdsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * A JSON object containing a list of worklog IDs.
     */
    @NotNull 
    private WorklogIdsRequestBean worklogIdsRequestBean;

    /**
     * Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts `properties` that returns the properties of each worklog.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated implementation of {@link GetWorklogsForIdsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetWorklogsForIdsOperationSpec(Consumer<GetWorklogsForIdsOperationSpec> spec) {
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
        Objects.requireNonNull(worklogIdsRequestBean, "worklogIdsRequestBean is a required parameter!");
    }

}
