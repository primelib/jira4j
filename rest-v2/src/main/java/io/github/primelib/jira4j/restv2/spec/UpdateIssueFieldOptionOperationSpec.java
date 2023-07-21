package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.IssueFieldOption;
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
 * UpdateIssueFieldOptionSpec
 * <p>
 * Specification for the UpdateIssueFieldOption operation.
 * <p>
 * Update issue field option
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateIssueFieldOptionOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the {@code fieldKey} value, do one of the following:
     *  *
     * open the app's plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the {@code jiraIssueFields} module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.
     * *
     * run [Get fields](#api-rest-api-2-field-get) and in the field details the value is returned in {@code key}. For example, {@code "key": "teams-add-on__team-issue-field"}
     */
    @NotNull 
    private String fieldKey;

    /**
     * The ID of the option to be updated.
     */
    @NotNull 
    private Long optionId;

    /**
     */
    @NotNull 
    private IssueFieldOption issueFieldOption;

    /**
     * Constructs a validated instance of {@link UpdateIssueFieldOptionOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateIssueFieldOptionOperationSpec(Consumer<UpdateIssueFieldOptionOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateIssueFieldOptionOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param fieldKey             The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the {@code fieldKey} value, do one of the following:   *  open the app's plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the {@code jiraIssueFields} module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-2-field-get) and in the field details the value is returned in {@code key}. For example, {@code "key": "teams-add-on__team-issue-field"}
     * @param optionId             The ID of the option to be updated.
     * @param issueFieldOption     
     */
    @ApiStatus.Internal
    public UpdateIssueFieldOptionOperationSpec(String fieldKey, Long optionId, IssueFieldOption issueFieldOption) {
        this.fieldKey = fieldKey;
        this.optionId = optionId;
        this.issueFieldOption = issueFieldOption;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(fieldKey, "fieldKey is a required parameter!");
        Objects.requireNonNull(optionId, "optionId is a required parameter!");
        Objects.requireNonNull(issueFieldOption, "issueFieldOption is a required parameter!");
    }
}
