package io.github.primelib.jira4j.restv2.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

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
 * GetPrecomputationsSpec
 * <p>
 * Specification for the GetPrecomputations operation.
 * <p>
 * Get precomputations (apps)
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetPrecomputationsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The function key in format:
     *  *
     * Forge: {@code ari:cloud:ecosystem::extension/[App ID]/[Environment ID]/static/[Function key from manifest]}
     * *
     * Connect: {@code [App key]__[Module key]}
     */
    @Nullable 
    private List<String> functionKey;

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
     * [Order](#ordering) the results by a field:
     *  *
     * {@code functionKey} Sorts by the functionKey.
     * *
     * {@code used} Sorts by the used timestamp.
     * *
     * {@code created} Sorts by the created timestamp.
     * *
     * {@code updated} Sorts by the updated timestamp.
     */
    @Nullable 
    private String orderBy;

    /**
     * Constructs a validated instance of {@link GetPrecomputationsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetPrecomputationsOperationSpec(Consumer<GetPrecomputationsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetPrecomputationsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param functionKey          The function key in format:   *  Forge: {@code ari:cloud:ecosystem::extension/[App ID]/[Environment ID]/static/[Function key from manifest]}  *  Connect: {@code [App key]__[Module key]}
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     * @param orderBy              [Order](#ordering) the results by a field:   *  {@code functionKey} Sorts by the functionKey.  *  {@code used} Sorts by the used timestamp.  *  {@code created} Sorts by the created timestamp.  *  {@code updated} Sorts by the updated timestamp.
     */
    @ApiStatus.Internal
    public GetPrecomputationsOperationSpec(List<String> functionKey, Long startAt, Integer maxResults, String orderBy) {
        this.functionKey = functionKey;
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.orderBy = orderBy;

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
