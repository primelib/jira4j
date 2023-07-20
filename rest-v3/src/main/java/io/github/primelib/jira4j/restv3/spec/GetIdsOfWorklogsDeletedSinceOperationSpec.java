package io.github.primelib.jira4j.restv3.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Worklog;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetIdsOfWorklogsDeletedSinceSpec
 * <p>
 * Specification for the GetIdsOfWorklogsDeletedSince operation.
 * <p>
 * Get IDs of deleted worklogs
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetIdsOfWorklogsDeletedSinceOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The date and time, as a UNIX timestamp in milliseconds, after which deleted worklogs are returned.
     */
    @Nullable 
    private Long since = 0L;

    /**
     * Constructs a validated implementation of {@link GetIdsOfWorklogsDeletedSinceOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetIdsOfWorklogsDeletedSinceOperationSpec(Consumer<GetIdsOfWorklogsDeletedSinceOperationSpec> spec) {
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
    }

}
