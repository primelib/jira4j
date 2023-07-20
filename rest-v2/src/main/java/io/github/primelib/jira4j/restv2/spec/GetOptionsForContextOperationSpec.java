package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetOptionsForContextSpec
 * <p>
 * Specification for the GetOptionsForContext operation.
 * <p>
 * Get custom field options (context)
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetOptionsForContextOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the custom field.
     */
    @NotNull 
    private String fieldId;

    /**
     * The ID of the context.
     */
    @NotNull 
    private Long contextId;

    /**
     * The ID of the option.
     */
    @Nullable 
    private Long optionId;

    /**
     * Whether only options are returned.
     */
    @Nullable 
    private Boolean onlyOptions = false;

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
     * Constructs a validated implementation of {@link GetOptionsForContextOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetOptionsForContextOperationSpec(Consumer<GetOptionsForContextOperationSpec> spec) {
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
        Objects.requireNonNull(fieldId, "fieldId is a required parameter!");
        Objects.requireNonNull(contextId, "contextId is a required parameter!");
    }

}
