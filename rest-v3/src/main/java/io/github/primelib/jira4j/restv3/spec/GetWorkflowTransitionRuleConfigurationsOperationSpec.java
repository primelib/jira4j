package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Configuration;
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
 * GetWorkflowTransitionRuleConfigurationsSpec
 * <p>
 * Specification for the GetWorkflowTransitionRuleConfigurations operation.
 * <p>
 * Get workflow transition rule configurations
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
    private Long startAt;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults;

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
     * EXPERIMENTAL: The list of {@code tags} to filter by.
     */
    @Nullable 
    private Set<String> withTags;

    /**
     * EXPERIMENTAL: Whether draft or published workflows are returned. If not provided, both workflow types are returned.
     */
    @Nullable 
    private Boolean draft;

    /**
     * Use [expand](#expansion) to include additional information in the response. This parameter accepts {@code transition}, which, for each rule, returns information about the transition the rule is assigned to.
     */
    @Nullable 
    private String expand;

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsOperationSpec}.
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
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param types                The types of the transition rules to return.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     * @param keys                 The transition rule class keys, as defined in the Connect or the Forge app descriptor, of the transition rules to return.
     * @param workflowNames        EXPERIMENTAL: The list of workflow names to filter by.
     * @param withTags             EXPERIMENTAL: The list of {@code tags} to filter by.
     * @param draft                EXPERIMENTAL: Whether draft or published workflows are returned. If not provided, both workflow types are returned.
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts {@code transition}, which, for each rule, returns information about the transition the rule is assigned to.
     */
    @ApiStatus.Internal
    public GetWorkflowTransitionRuleConfigurationsOperationSpec(Set<String> types, Long startAt, Integer maxResults, Set<String> keys, Set<String> workflowNames, Set<String> withTags, Boolean draft, String expand) {
        this.types = types;
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.keys = keys;
        this.workflowNames = workflowNames;
        this.withTags = withTags;
        this.draft = draft;
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
        Objects.requireNonNull(types, "types is a required parameter!");
    }
}
