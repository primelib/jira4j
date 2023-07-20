package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateWorkflowTransitionRulesDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "conditions",
    "postFunctions",
    "validators"
})
@JsonTypeName("CreateWorkflowTransitionRulesDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateWorkflowTransitionRulesDetails {

    /**
     * Constructs a validated implementation of {@link CreateWorkflowTransitionRulesDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateWorkflowTransitionRulesDetails(Consumer<CreateWorkflowTransitionRulesDetails> spec) {
        spec.accept(this);
    }

    @JsonProperty("conditions")
    protected CreateWorkflowTransitionRulesDetailsConditions conditions;

    /**
     * The workflow post functions.
     * **Note:** The default post functions are always added to the *initial* transition, as in:
     * 
     * 
     * "postFunctions": [
     * 
     * 
     * 
     *  {
     * 
     * 
     * 
     * 
     * 
     *  "type": "IssueCreateFunction"
     * 
     * 
     * 
     *  },
     * 
     * 
     * 
     *  {
     * 
     * 
     * 
     * 
     * 
     *  "type": "IssueReindexFunction"
     * 
     * 
     * 
     *  },
     * 
     * 
     * 
     *  {
     * 
     * 
     * 
     * 
     * 
     *  "type": "FireIssueEventFunction",
     * 
     * 
     * 
     * 
     * 
     *  "configuration": {
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     *  "event": {
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     *  "id": "1",
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     *  "name": "issue_created"
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     *  }
     * 
     * 
     * 
     * 
     * 
     *  }
     * 
     * 
     * 
     *  }
     * 
     *  ]
     * **Note:** The default post functions are always added to the *global* and *directed* transitions, as in:
     * 
     * 
     * "postFunctions": [
     * 
     * 
     * 
     *  {
     * 
     * 
     * 
     * 
     * 
     *  "type": "UpdateIssueStatusFunction"
     * 
     * 
     * 
     *  },
     * 
     * 
     * 
     *  {
     * 
     * 
     * 
     * 
     * 
     *  "type": "CreateCommentFunction"
     * 
     * 
     * 
     *  },
     * 
     * 
     * 
     *  {
     * 
     * 
     * 
     * 
     * 
     *  "type": "GenerateChangeHistoryFunction"
     * 
     * 
     * 
     *  },
     * 
     * 
     * 
     *  {
     * 
     * 
     * 
     * 
     * 
     *  "type": "IssueReindexFunction"
     * 
     * 
     * 
     *  },
     * 
     * 
     * 
     *  {
     * 
     * 
     * 
     * 
     * 
     *  "type": "FireIssueEventFunction",
     * 
     * 
     * 
     * 
     * 
     *  "configuration": {
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     *  "event": {
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     *  "id": "13",
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     *  "name": "issue_generic"
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     *  }
     * 
     * 
     * 
     * 
     * 
     *  }
     * 
     * 
     * 
     *  }
     * 
     *  ]
     */
    @JsonProperty("postFunctions")
    protected List<CreateWorkflowTransitionRule> postFunctions;

    /**
     * The workflow validators.
     * **Note:** The default permission validator is always added to the *initial* transition, as in:
     * 
     * 
     * "validators": [
     * 
     * 
     * 
     *  {
     * 
     * 
     * 
     * 
     * 
     *  "type": "PermissionValidator",
     * 
     * 
     * 
     * 
     * 
     *  "configuration": {
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     *  "permissionKey": "CREATE_ISSUES"
     * 
     * 
     * 
     * 
     * 
     *  }
     * 
     * 
     * 
     *  }
     * 
     *  ]
     */
    @JsonProperty("validators")
    protected List<CreateWorkflowTransitionRule> validators;


}
