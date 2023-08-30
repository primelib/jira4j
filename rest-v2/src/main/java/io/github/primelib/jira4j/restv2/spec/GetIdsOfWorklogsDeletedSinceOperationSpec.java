package io.github.primelib.jira4j.restv2.spec;

import org.jetbrains.annotations.ApiStatus;
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
 * GetIdsOfWorklogsDeletedSinceSpec
 * <p>
 * Specification for the GetIdsOfWorklogsDeletedSince operation.
 * <p>
 * Get IDs of deleted worklogs
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
    private Long since;

    /**
     * Constructs a validated instance of {@link GetIdsOfWorklogsDeletedSinceOperationSpec}.
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
     * Constructs a validated instance of {@link GetIdsOfWorklogsDeletedSinceOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param since                The date and time, as a UNIX timestamp in milliseconds, after which deleted worklogs are returned.
     */
    @ApiStatus.Internal
    public GetIdsOfWorklogsDeletedSinceOperationSpec(Long since) {
        this.since = since;

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
