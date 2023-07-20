package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DeprecatedWorkflow
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "default",
    "description",
    "lastModifiedDate",
    "lastModifiedUser",
    "lastModifiedUserAccountId",
    "name",
    "scope",
    "steps"
})
@JsonTypeName("DeprecatedWorkflow")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeprecatedWorkflow {

    /**
     * Constructs a validated implementation of {@link DeprecatedWorkflow}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeprecatedWorkflow(Consumer<DeprecatedWorkflow> spec) {
        spec.accept(this);
    }

    @JsonProperty("default")
    protected Boolean _default;

    /**
     * The description of the workflow.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The datetime the workflow was last modified.
     */
    @JsonProperty("lastModifiedDate")
    protected String lastModifiedDate;

    /**
     * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @JsonProperty("lastModifiedUser")
    protected String lastModifiedUser;

    /**
     * The account ID of the user that last modified the workflow.
     */
    @JsonProperty("lastModifiedUserAccountId")
    protected String lastModifiedUserAccountId;

    /**
     * The name of the workflow.
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("scope")
    protected DeprecatedWorkflowScope scope;

    /**
     * The number of steps included in the workflow.
     */
    @JsonProperty("steps")
    protected Integer steps;


}
