package io.github.primelib.jira4j.restv2.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.util.Set;
import io.github.primelib.jira4j.restv2.model.User;
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
 * BulkGetUsersMigrationSpec
 * <p>
 * Specification for the BulkGetUsersMigration operation.
 * <p>
 * Get account IDs for users
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
    private Long startAt;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults;

    /**
     * Username of a user. To specify multiple users, pass multiple copies of this parameter. For example, {@code username=fred&amp;username=barney}. Required if {@code key} isn't provided. Cannot be provided if {@code key} is present.
     */
    @Nullable 
    private List<String> username;

    /**
     * Key of a user. To specify multiple users, pass multiple copies of this parameter. For example, {@code key=fred&amp;key=barney}. Required if {@code username} isn't provided. Cannot be provided if {@code username} is present.
     */
    @Nullable 
    private List<String> key;

    /**
     * Constructs a validated instance of {@link BulkGetUsersMigrationOperationSpec}.
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
     * Constructs a validated instance of {@link BulkGetUsersMigrationOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     * @param username             Username of a user. To specify multiple users, pass multiple copies of this parameter. For example, {@code username=fred&amp;username=barney}. Required if {@code key} isn't provided. Cannot be provided if {@code key} is present.
     * @param key                  Key of a user. To specify multiple users, pass multiple copies of this parameter. For example, {@code key=fred&amp;key=barney}. Required if {@code username} isn't provided. Cannot be provided if {@code username} is present.
     */
    @ApiStatus.Internal
    public BulkGetUsersMigrationOperationSpec(Long startAt, Integer maxResults, List<String> username, List<String> key) {
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.username = username;
        this.key = key;

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
