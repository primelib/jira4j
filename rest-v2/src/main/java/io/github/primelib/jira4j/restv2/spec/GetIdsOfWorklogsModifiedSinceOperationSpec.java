package io.github.primelib.jira4j.restv2.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Worklog;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetIdsOfWorklogsModifiedSinceSpec
 * <p>
 * Specification for the GetIdsOfWorklogsModifiedSince operation.
 * <p>
 * Get IDs of updated worklogs
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetIdsOfWorklogsModifiedSinceOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The date and time, as a UNIX timestamp in milliseconds, after which updated worklogs are returned.
     */
    @Nullable 
    private Long since = 0L;

    /**
     * Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts `properties` that returns the properties of each worklog.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated implementation of {@link GetIdsOfWorklogsModifiedSinceOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetIdsOfWorklogsModifiedSinceOperationSpec(Consumer<GetIdsOfWorklogsModifiedSinceOperationSpec> spec) {
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
