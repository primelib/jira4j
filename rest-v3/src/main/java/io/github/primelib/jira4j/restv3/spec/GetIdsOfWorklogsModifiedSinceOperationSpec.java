package io.github.primelib.jira4j.restv3.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.util.Set;
import io.github.primelib.jira4j.restv3.model.Worklog;
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
 * GetIdsOfWorklogsModifiedSinceSpec
 * <p>
 * Specification for the GetIdsOfWorklogsModifiedSince operation.
 * <p>
 * Get IDs of updated worklogs
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
    private Long since;

    /**
     * Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts {@code properties} that returns the properties of each worklog.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated instance of {@link GetIdsOfWorklogsModifiedSinceOperationSpec}.
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
     * Constructs a validated instance of {@link GetIdsOfWorklogsModifiedSinceOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param since                The date and time, as a UNIX timestamp in milliseconds, after which updated worklogs are returned.
     * @param expand               Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts {@code properties} that returns the properties of each worklog.
     */
    @ApiStatus.Internal
    public GetIdsOfWorklogsModifiedSinceOperationSpec(Long since, String expand) {
        this.since = since;
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
    }
}
