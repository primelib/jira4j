package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.util.Set;
import io.github.primelib.jira4j.restv3.model.Worklog;
import io.github.primelib.jira4j.restv3.model.WorklogIdsRequestBean;
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
 * GetWorklogsForIdsSpec
 * <p>
 * Specification for the GetWorklogsForIds operation.
 * <p>
 * Get worklogs
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts {@code properties} that returns the properties of each worklog.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated instance of {@link GetWorklogsForIdsOperationSpec}.
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
     * Constructs a validated instance of {@link GetWorklogsForIdsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param worklogIdsRequestBean A JSON object containing a list of worklog IDs.
     * @param expand               Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts {@code properties} that returns the properties of each worklog.
     */
    @ApiStatus.Internal
    public GetWorklogsForIdsOperationSpec(WorklogIdsRequestBean worklogIdsRequestBean, String expand) {
        this.worklogIdsRequestBean = worklogIdsRequestBean;
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
        Objects.requireNonNull(worklogIdsRequestBean, "worklogIdsRequestBean is a required parameter!");
    }
}
