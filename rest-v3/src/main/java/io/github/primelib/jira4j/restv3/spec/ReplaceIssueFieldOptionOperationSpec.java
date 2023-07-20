package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.IssueFieldOption;
import io.github.primelib.jira4j.restv3.model.Screen;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * ReplaceIssueFieldOptionSpec
 * <p>
 * Specification for the ReplaceIssueFieldOption operation.
 * <p>
 * Replace issue field option
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ReplaceIssueFieldOptionOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the `fieldKey` value, do one of the following:
     *  *
     * open the app's plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the `jiraIssueFields` module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.
     * *
     * run [Get fields](#api-rest-api-3-field-get) and in the field details the value is returned in `key`. For example, `"key": "teams-add-on__team-issue-field"`
     */
    @NotNull 
    private String fieldKey;

    /**
     * The ID of the option to be deselected.
     */
    @NotNull 
    private Long optionId;

    /**
     * The ID of the option that will replace the currently selected option.
     */
    @Nullable 
    private Long replaceWith;

    /**
     * A JQL query that specifies the issues to be updated. For example, *project=10000*.
     */
    @Nullable 
    private String jql;

    /**
     * Whether screen security is overridden to enable hidden fields to be edited. Available to Connect and Forge app users with admin permission.
     */
    @Nullable 
    private Boolean overrideScreenSecurity = false;

    /**
     * Whether screen security is overridden to enable uneditable fields to be edited. Available to Connect and Forge app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     */
    @Nullable 
    private Boolean overrideEditableFlag = false;

    /**
     * Constructs a validated implementation of {@link ReplaceIssueFieldOptionOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ReplaceIssueFieldOptionOperationSpec(Consumer<ReplaceIssueFieldOptionOperationSpec> spec) {
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
        Objects.requireNonNull(fieldKey, "fieldKey is a required parameter!");
        Objects.requireNonNull(optionId, "optionId is a required parameter!");
    }

}
