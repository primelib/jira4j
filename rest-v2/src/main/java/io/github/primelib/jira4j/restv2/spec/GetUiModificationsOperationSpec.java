package io.github.primelib.jira4j.restv2.spec;

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
 * GetUiModificationsSpec
 * <p>
 * Specification for the GetUiModifications operation.
 * <p>
 * Get UI modifications
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetUiModificationsOperationSpec {
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
     * Use expand to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:
     *  *
     * {@code data} Returns UI modification data.
     * *
     * {@code contexts} Returns UI modification contexts.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated instance of {@link GetUiModificationsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetUiModificationsOperationSpec(Consumer<GetUiModificationsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetUiModificationsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     * @param expand               Use expand to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code data} Returns UI modification data.  *  {@code contexts} Returns UI modification contexts.
     */
    @ApiStatus.Internal
    public GetUiModificationsOperationSpec(Long startAt, Integer maxResults, String expand) {
        this.startAt = startAt;
        this.maxResults = maxResults;
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
