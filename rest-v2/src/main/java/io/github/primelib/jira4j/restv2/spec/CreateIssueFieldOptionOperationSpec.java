package io.github.primelib.jira4j.restv2.spec;

import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.IssueFieldOption;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * CreateIssueFieldOptionSpec
 * <p>
 * Specification for the CreateIssueFieldOption operation.
 * <p>
 * Create issue field option
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateIssueFieldOptionOperationSpec {
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
     * run [Get fields](#api-rest-api-2-field-get) and in the field details the value is returned in `key`. For example, `"key": "teams-add-on__team-issue-field"`
     */
    @NotNull 
    private String fieldKey;

    /**
     */
    @NotNull 
    private Map<String, Object> requestBody;

    /**
     * Constructs a validated implementation of {@link CreateIssueFieldOptionOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateIssueFieldOptionOperationSpec(Consumer<CreateIssueFieldOptionOperationSpec> spec) {
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
        Objects.requireNonNull(requestBody, "requestBody is a required parameter!");
    }

}
