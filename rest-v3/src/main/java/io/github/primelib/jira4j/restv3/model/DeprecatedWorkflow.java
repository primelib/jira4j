package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DeprecatedWorkflow
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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

    /**
     * Constructs a validated instance of {@link DeprecatedWorkflow}.
     *
     * @param spec the specification to process
     */
    public DeprecatedWorkflow(Consumer<DeprecatedWorkflow> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link DeprecatedWorkflow}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #DeprecatedWorkflow(Consumer)} instead.
     * @param _default var.name
     * @param description The description of the workflow.
     * @param lastModifiedDate The datetime the workflow was last modified.
     * @param lastModifiedUser This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     * @param lastModifiedUserAccountId The account ID of the user that last modified the workflow.
     * @param name The name of the workflow.
     * @param scope var.name
     * @param steps The number of steps included in the workflow.
     */
    @ApiStatus.Internal
    public DeprecatedWorkflow(Boolean _default, String description, String lastModifiedDate, String lastModifiedUser, String lastModifiedUserAccountId, String name, DeprecatedWorkflowScope scope, Integer steps) {
        this._default = _default;
        this.description = description;
        this.lastModifiedDate = lastModifiedDate;
        this.lastModifiedUser = lastModifiedUser;
        this.lastModifiedUserAccountId = lastModifiedUserAccountId;
        this.name = name;
        this.scope = scope;
        this.steps = steps;
    }

}
