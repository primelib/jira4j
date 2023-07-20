package io.github.primelib.jira4j.restv3.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import lombok.AccessLevel;
import lombok.Data;
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
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
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
     * Forge: `ari:cloud:ecosystem::extension/[App ID]/[Environment ID]/static/[Function key from manifest]`.
     * *
     * Connect: `[App key]__[Module key]`.
     */
    @Nullable 
    private List<String> functionKey;

    /**
     * The index of the first item to return in a page of results (page offset).
     */
    @Nullable 
    private Long startAt = 0L;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults = 100;

    /**
     * Not supported yet.
     */
    @Nullable 
    private String orderBy;

    /**
     * Not supported yet.
     */
    @Nullable 
    private String filter;

    /**
     * Constructs a validated implementation of {@link GetPrecomputationsOperationSpec}.
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
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
    }

}
