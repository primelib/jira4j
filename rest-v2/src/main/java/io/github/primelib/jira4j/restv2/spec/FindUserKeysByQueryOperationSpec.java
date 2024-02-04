package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
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
 * FindUserKeysByQuerySpec
 * <p>
 * Specification for the FindUserKeysByQuery operation.
 * <p>
 * Find user keys by query
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FindUserKeysByQueryOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The search query.
     */
    @NotNull 
    private String query;

    /**
     * The index of the first item to return in a page of results (page offset).
     */
    @Nullable 
    private Long startAt;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResult;

    /**
     * Constructs a validated instance of {@link FindUserKeysByQueryOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FindUserKeysByQueryOperationSpec(Consumer<FindUserKeysByQueryOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link FindUserKeysByQueryOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param query                The search query.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResult            The maximum number of items to return per page.
     */
    @ApiStatus.Internal
    public FindUserKeysByQueryOperationSpec(String query, Long startAt, Integer maxResult) {
        this.query = query;
        this.startAt = startAt;
        this.maxResult = maxResult;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(query, "query is a required parameter!");
    }
}
