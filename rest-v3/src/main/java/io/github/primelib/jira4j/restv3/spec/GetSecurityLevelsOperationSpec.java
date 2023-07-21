package io.github.primelib.jira4j.restv3.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.SecurityLevel;
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
 * GetSecurityLevelsSpec
 * <p>
 * Specification for the GetSecurityLevels operation.
 * <p>
 * Get issue security levels
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetSecurityLevelsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The index of the first item to return in a page of results (page offset).
     */
    @Nullable 
    private String startAt;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private String maxResults;

    /**
     * The list of issue security scheme level IDs. To include multiple issue security levels, separate IDs with an ampersand: {@code id=10000&amp;id=10001}.
     */
    @Nullable 
    private Set<String> id;

    /**
     * The list of issue security scheme IDs. To include multiple issue security schemes, separate IDs with an ampersand: {@code schemeId=10000&amp;schemeId=10001}.
     */
    @Nullable 
    private Set<String> schemeId;

    /**
     * When set to true, returns multiple default levels for each security scheme containing a default. If you provide scheme and level IDs not associated with the default, returns an empty page. The default value is false.
     */
    @Nullable 
    private Boolean onlyDefault;

    /**
     * Constructs a validated instance of {@link GetSecurityLevelsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetSecurityLevelsOperationSpec(Consumer<GetSecurityLevelsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetSecurityLevelsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     * @param id                   The list of issue security scheme level IDs. To include multiple issue security levels, separate IDs with an ampersand: {@code id=10000&amp;id=10001}.
     * @param schemeId             The list of issue security scheme IDs. To include multiple issue security schemes, separate IDs with an ampersand: {@code schemeId=10000&amp;schemeId=10001}.
     * @param onlyDefault          When set to true, returns multiple default levels for each security scheme containing a default. If you provide scheme and level IDs not associated with the default, returns an empty page. The default value is false.
     */
    @ApiStatus.Internal
    public GetSecurityLevelsOperationSpec(String startAt, String maxResults, Set<String> id, Set<String> schemeId, Boolean onlyDefault) {
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.id = id;
        this.schemeId = schemeId;
        this.onlyDefault = onlyDefault;

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
