package io.github.primelib.jira4j.restv2.spec;

import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.IssueTypeScreenSchemeMappingDetails;
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
 * AppendMappingsForIssueTypeScreenSchemeSpec
 * <p>
 * Specification for the AppendMappingsForIssueTypeScreenScheme operation.
 * <p>
 * Append mappings to issue type screen scheme
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AppendMappingsForIssueTypeScreenSchemeOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the issue type screen scheme.
     */
    @NotNull 
    private String issueTypeScreenSchemeId;

    /**
     */
    @NotNull 
    private IssueTypeScreenSchemeMappingDetails issueTypeScreenSchemeMappingDetails;

    /**
     * Constructs a validated instance of {@link AppendMappingsForIssueTypeScreenSchemeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AppendMappingsForIssueTypeScreenSchemeOperationSpec(Consumer<AppendMappingsForIssueTypeScreenSchemeOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link AppendMappingsForIssueTypeScreenSchemeOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param issueTypeScreenSchemeId The ID of the issue type screen scheme.
     * @param issueTypeScreenSchemeMappingDetails 
     */
    @ApiStatus.Internal
    public AppendMappingsForIssueTypeScreenSchemeOperationSpec(String issueTypeScreenSchemeId, IssueTypeScreenSchemeMappingDetails issueTypeScreenSchemeMappingDetails) {
        this.issueTypeScreenSchemeId = issueTypeScreenSchemeId;
        this.issueTypeScreenSchemeMappingDetails = issueTypeScreenSchemeMappingDetails;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(issueTypeScreenSchemeId, "issueTypeScreenSchemeId is a required parameter!");
        Objects.requireNonNull(issueTypeScreenSchemeMappingDetails, "issueTypeScreenSchemeMappingDetails is a required parameter!");
    }
}
