package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.util.Set;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetWorkflowTransitionRuleConfigurationsSpec
 * <p>
 * Specification for the GetWorkflowTransitionRuleConfigurations operation.
 * <p>
 * Get workflow transition rule configurations
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetWorkflowTransitionRuleConfigurationsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The types of the transition rules to return.
     */
    @NotNull 
    private Set<String> types;

    /**
     * The index of the first item to return in a page of results (page offset).
     */
    @Nullable 
    private Long startAt = 0L;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults = 10;

    /**
     * The transition rule class keys, as defined in the Connect or the Forge app descriptor, of the transition rules to return.
     */
    @Nullable 
    private Set<String> keys;

    /**
     * EXPERIMENTAL: The list of workflow names to filter by.
     */
    @Nullable 
    private Set<String> workflowNames;

    /**
     * EXPERIMENTAL: The list of `tags` to filter by.
     */
    @Nullable 
    private Set<String> withTags;

    /**
     * EXPERIMENTAL: Whether draft or published workflows are returned. If not provided, both workflow types are returned.
     */
    @Nullable 
    private Boolean draft;

    /**
     * Use [expand](#expansion) to include additional information in the response. This parameter accepts `transition`, which, for each rule, returns information about the transition the rule is assigned to.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated implementation of {@link GetWorkflowTransitionRuleConfigurationsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetWorkflowTransitionRuleConfigurationsOperationSpec(Consumer<GetWorkflowTransitionRuleConfigurationsOperationSpec> spec) {
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
        Objects.requireNonNull(types, "types is a required parameter!");
    }

}
