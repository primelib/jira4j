package io.github.primelib.jira4j.restv2.model;

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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateWorkflowTransitionRulesDetails
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
    "conditions",
    "postFunctions",
    "validators"
})
@JsonTypeName("CreateWorkflowTransitionRulesDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateWorkflowTransitionRulesDetails {

    @JsonProperty("conditions")
    protected CreateWorkflowCondition conditions;

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

    /**
     * Constructs a validated instance of {@link CreateWorkflowTransitionRulesDetails}.
     *
     * @param spec the specification to process
     */
    public CreateWorkflowTransitionRulesDetails(Consumer<CreateWorkflowTransitionRulesDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateWorkflowTransitionRulesDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateWorkflowTransitionRulesDetails(Consumer)} instead.
     * @param conditions conditions
     * @param postFunctions The workflow post functions.  **Note:** The default post functions are always added to the *initial* transition, as in:      "postFunctions": [         {             "type": "IssueCreateFunction"         },         {             "type": "IssueReindexFunction"         },         {             "type": "FireIssueEventFunction",             "configuration": {                 "event": {                     "id": "1",                     "name": "issue_created"                 }             }         }     ]  **Note:** The default post functions are always added to the *global* and *directed* transitions, as in:      "postFunctions": [         {             "type": "UpdateIssueStatusFunction"         },         {             "type": "CreateCommentFunction"         },         {             "type": "GenerateChangeHistoryFunction"         },         {             "type": "IssueReindexFunction"         },         {             "type": "FireIssueEventFunction",             "configuration": {                 "event": {                     "id": "13",                     "name": "issue_generic"                 }             }         }     ]
     * @param validators The workflow validators.  **Note:** The default permission validator is always added to the *initial* transition, as in:      "validators": [         {             "type": "PermissionValidator",             "configuration": {                 "permissionKey": "CREATE_ISSUES"             }         }     ]
     */
    @ApiStatus.Internal
    public CreateWorkflowTransitionRulesDetails(CreateWorkflowCondition conditions, List<CreateWorkflowTransitionRule> postFunctions, List<CreateWorkflowTransitionRule> validators) {
        this.conditions = conditions;
        this.postFunctions = postFunctions;
        this.validators = validators;
    }

}
