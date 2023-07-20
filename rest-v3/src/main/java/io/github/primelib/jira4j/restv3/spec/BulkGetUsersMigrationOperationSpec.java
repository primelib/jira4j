package io.github.primelib.jira4j.restv3.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.User;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * BulkGetUsersMigrationSpec
 * <p>
 * Specification for the BulkGetUsersMigration operation.
 * <p>
 * Get account IDs for users
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BulkGetUsersMigrationOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The index of the first item to return in a page of results (page offset).
     */
    @Nullable 
    private Long startAt = 0L;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults = 10;

    /**
     * Username of a user. To specify multiple users, pass multiple copies of this parameter. For example, `username=fred&amp;username=barney`. Required if `key` isn't provided. Cannot be provided if `key` is present.
     */
    @Nullable 
    private List<String> username;

    /**
     * Key of a user. To specify multiple users, pass multiple copies of this parameter. For example, `key=fred&amp;key=barney`. Required if `username` isn't provided. Cannot be provided if `username` is present.
     */
    @Nullable 
    private List<String> key;

    /**
     * Constructs a validated implementation of {@link BulkGetUsersMigrationOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public BulkGetUsersMigrationOperationSpec(Consumer<BulkGetUsersMigrationOperationSpec> spec) {
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
