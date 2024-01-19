package io.github.primelib.jira4j.restv2.spec;

import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Screen;
import io.github.primelib.jira4j.restv2.model.ScreenSchemeId;
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
 * GetIssueTypeScreenSchemeMappingsSpec
 * <p>
 * Specification for the GetIssueTypeScreenSchemeMappings operation.
 * <p>
 * Get issue type screen scheme items
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetIssueTypeScreenSchemeMappingsOperationSpec {
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
     * The list of issue type screen scheme IDs. To include multiple issue type screen schemes, separate IDs with ampersand: {@code issueTypeScreenSchemeId=10000&amp;issueTypeScreenSchemeId=10001}.
     */
    @Nullable 
    private Set<Long> issueTypeScreenSchemeId;

    /**
     * Constructs a validated instance of {@link GetIssueTypeScreenSchemeMappingsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetIssueTypeScreenSchemeMappingsOperationSpec(Consumer<GetIssueTypeScreenSchemeMappingsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetIssueTypeScreenSchemeMappingsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     * @param issueTypeScreenSchemeId The list of issue type screen scheme IDs. To include multiple issue type screen schemes, separate IDs with ampersand: {@code issueTypeScreenSchemeId=10000&amp;issueTypeScreenSchemeId=10001}.
     */
    @ApiStatus.Internal
    public GetIssueTypeScreenSchemeMappingsOperationSpec(Long startAt, Integer maxResults, Set<Long> issueTypeScreenSchemeId) {
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.issueTypeScreenSchemeId = issueTypeScreenSchemeId;

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
