package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.JQLPersonalDataMigrationRequest;
import java.util.Set;
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
 * MigrateQueriesSpec
 * <p>
 * Specification for the MigrateQueries operation.
 * <p>
 * Convert user identifiers to account IDs in JQL queries
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MigrateQueriesOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     */
    @NotNull 
    private JQLPersonalDataMigrationRequest jqLPersonalDataMigrationRequest;

    /**
     * Constructs a validated instance of {@link MigrateQueriesOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MigrateQueriesOperationSpec(Consumer<MigrateQueriesOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link MigrateQueriesOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param jqLPersonalDataMigrationRequest 
     */
    @ApiStatus.Internal
    public MigrateQueriesOperationSpec(JQLPersonalDataMigrationRequest jqLPersonalDataMigrationRequest) {
        this.jqLPersonalDataMigrationRequest = jqLPersonalDataMigrationRequest;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(jqLPersonalDataMigrationRequest, "jqLPersonalDataMigrationRequest is a required parameter!");
    }
}
