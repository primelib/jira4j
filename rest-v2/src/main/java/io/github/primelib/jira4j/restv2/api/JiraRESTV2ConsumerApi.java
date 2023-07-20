package io.github.primelib.jira4j.restv2.api;

import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import lombok.Data;

import io.github.primelib.jira4j.restv2.model.AnnouncementBannerConfiguration;
import io.github.primelib.jira4j.restv2.model.ApplicationProperty;
import io.github.primelib.jira4j.restv2.model.ApplicationRole;
import io.github.primelib.jira4j.restv2.model.Attachment;
import io.github.primelib.jira4j.restv2.model.AttachmentArchiveImpl;
import io.github.primelib.jira4j.restv2.model.AttachmentArchiveMetadataReadable;
import io.github.primelib.jira4j.restv2.model.AttachmentMetadata;
import io.github.primelib.jira4j.restv2.model.AttachmentSettings;
import io.github.primelib.jira4j.restv2.model.AuditRecords;
import io.github.primelib.jira4j.restv2.model.AutoCompleteSuggestions;
import io.github.primelib.jira4j.restv2.model.AvailableDashboardGadgetsResponse;
import io.github.primelib.jira4j.restv2.model.Avatar;
import io.github.primelib.jira4j.restv2.model.Avatars;
import io.github.primelib.jira4j.restv2.model.BulkIssueIsWatching;
import io.github.primelib.jira4j.restv2.model.BulkPermissionGrants;
import io.github.primelib.jira4j.restv2.model.ChangeFilterOwner;
import io.github.primelib.jira4j.restv2.model.ChangedWorklogs;
import io.github.primelib.jira4j.restv2.model.ColumnItem;
import io.github.primelib.jira4j.restv2.model.Comment;
import io.github.primelib.jira4j.restv2.model.ComponentIssuesCount;
import io.github.primelib.jira4j.restv2.model.ConnectModules;
import io.github.primelib.jira4j.restv2.model.ContainerForProjectFeatures;
import io.github.primelib.jira4j.restv2.model.ContainerForRegisteredWebhooks;
import io.github.primelib.jira4j.restv2.model.ContainerOfWorkflowSchemeAssociations;
import io.github.primelib.jira4j.restv2.model.ConvertedJQLQueries;
import io.github.primelib.jira4j.restv2.model.CreateCustomFieldContext;
import io.github.primelib.jira4j.restv2.model.CreatedIssue;
import io.github.primelib.jira4j.restv2.model.CreatedIssues;
import io.github.primelib.jira4j.restv2.model.CustomFieldCreatedContextOptionsList;
import io.github.primelib.jira4j.restv2.model.CustomFieldOption;
import io.github.primelib.jira4j.restv2.model.CustomFieldUpdatedContextOptionsList;
import io.github.primelib.jira4j.restv2.model.Dashboard;
import io.github.primelib.jira4j.restv2.model.DashboardGadget;
import io.github.primelib.jira4j.restv2.model.DashboardGadgetResponse;
import io.github.primelib.jira4j.restv2.model.DefaultShareScope;
import io.github.primelib.jira4j.restv2.model.DefaultWorkflow;
import io.github.primelib.jira4j.restv2.model.DeprecatedWorkflow;
import io.github.primelib.jira4j.restv2.model.EntityProperty;
import io.github.primelib.jira4j.restv2.model.ErrorCollection;
import io.github.primelib.jira4j.restv2.model.FailedWebhooks;
import io.github.primelib.jira4j.restv2.model.FieldConfiguration;
import io.github.primelib.jira4j.restv2.model.FieldConfigurationDetails;
import io.github.primelib.jira4j.restv2.model.FieldConfigurationScheme;
import io.github.primelib.jira4j.restv2.model.FieldDetails;
import io.github.primelib.jira4j.restv2.model.Filter;
import io.github.primelib.jira4j.restv2.model.FoundGroups;
import io.github.primelib.jira4j.restv2.model.FoundUsers;
import io.github.primelib.jira4j.restv2.model.FoundUsersAndGroups;
import io.github.primelib.jira4j.restv2.model.Group;
import io.github.primelib.jira4j.restv2.model.GroupName;
import io.github.primelib.jira4j.restv2.model.IssueBean;
import io.github.primelib.jira4j.restv2.model.IssueCreateMetadata;
import io.github.primelib.jira4j.restv2.model.IssueEntityProperties;
import io.github.primelib.jira4j.restv2.model.IssueEvent;
import io.github.primelib.jira4j.restv2.model.IssueFieldOption;
import io.github.primelib.jira4j.restv2.model.IssueLink;
import io.github.primelib.jira4j.restv2.model.IssueLinkType;
import io.github.primelib.jira4j.restv2.model.IssueLinkTypes;
import io.github.primelib.jira4j.restv2.model.IssueMatches;
import io.github.primelib.jira4j.restv2.model.IssuePickerSuggestions;
import io.github.primelib.jira4j.restv2.model.IssueTypeDetails;
import io.github.primelib.jira4j.restv2.model.IssueTypeSchemeID;
import io.github.primelib.jira4j.restv2.model.IssueTypeScreenSchemeId;
import io.github.primelib.jira4j.restv2.model.IssueTypeScreenSchemeProjectAssociation;
import io.github.primelib.jira4j.restv2.model.IssueTypeWithStatus;
import io.github.primelib.jira4j.restv2.model.IssueTypeWorkflowMapping;
import io.github.primelib.jira4j.restv2.model.IssueTypesWorkflowMapping;
import io.github.primelib.jira4j.restv2.model.IssueUpdateMetadata;
import io.github.primelib.jira4j.restv2.model.JQLReferenceData;
import io.github.primelib.jira4j.restv2.model.JiraExpressionResult;
import io.github.primelib.jira4j.restv2.model.JiraExpressionsAnalysis;
import io.github.primelib.jira4j.restv2.model.JiraStatus;
import io.github.primelib.jira4j.restv2.model.License;
import io.github.primelib.jira4j.restv2.model.LicenseMetric;
import io.github.primelib.jira4j.restv2.model.Locale;
import io.github.primelib.jira4j.restv2.model.ModelConfiguration;
import io.github.primelib.jira4j.restv2.model.Notification;
import io.github.primelib.jira4j.restv2.model.NotificationScheme;
import io.github.primelib.jira4j.restv2.model.NotificationSchemeId;
import io.github.primelib.jira4j.restv2.model.OperationMessage;
import io.github.primelib.jira4j.restv2.model.PageBeanChangelog;
import io.github.primelib.jira4j.restv2.model.PageBeanComment;
import io.github.primelib.jira4j.restv2.model.PageBeanComponentWithIssueCount;
import io.github.primelib.jira4j.restv2.model.PageBeanContext;
import io.github.primelib.jira4j.restv2.model.PageBeanContextForProjectAndIssueType;
import io.github.primelib.jira4j.restv2.model.PageBeanContextualConfiguration;
import io.github.primelib.jira4j.restv2.model.PageBeanCustomFieldContext;
import io.github.primelib.jira4j.restv2.model.PageBeanCustomFieldContextDefaultValue;
import io.github.primelib.jira4j.restv2.model.PageBeanCustomFieldContextOption;
import io.github.primelib.jira4j.restv2.model.PageBeanCustomFieldContextProjectMapping;
import io.github.primelib.jira4j.restv2.model.PageBeanDashboard;
import io.github.primelib.jira4j.restv2.model.PageBeanField;
import io.github.primelib.jira4j.restv2.model.PageBeanFieldConfigurationDetails;
import io.github.primelib.jira4j.restv2.model.PageBeanFieldConfigurationIssueTypeItem;
import io.github.primelib.jira4j.restv2.model.PageBeanFieldConfigurationItem;
import io.github.primelib.jira4j.restv2.model.PageBeanFieldConfigurationScheme;
import io.github.primelib.jira4j.restv2.model.PageBeanFieldConfigurationSchemeProjects;
import io.github.primelib.jira4j.restv2.model.PageBeanFilterDetails;
import io.github.primelib.jira4j.restv2.model.PageBeanGroupDetails;
import io.github.primelib.jira4j.restv2.model.PageBeanIssueFieldOption;
import io.github.primelib.jira4j.restv2.model.PageBeanIssueSecurityLevelMember;
import io.github.primelib.jira4j.restv2.model.PageBeanIssueSecuritySchemeToProjectMapping;
import io.github.primelib.jira4j.restv2.model.PageBeanIssueTypeScheme;
import io.github.primelib.jira4j.restv2.model.PageBeanIssueTypeSchemeMapping;
import io.github.primelib.jira4j.restv2.model.PageBeanIssueTypeSchemeProjects;
import io.github.primelib.jira4j.restv2.model.PageBeanIssueTypeScreenScheme;
import io.github.primelib.jira4j.restv2.model.PageBeanIssueTypeScreenSchemeItem;
import io.github.primelib.jira4j.restv2.model.PageBeanIssueTypeScreenSchemesProjects;
import io.github.primelib.jira4j.restv2.model.PageBeanIssueTypeToContextMapping;
import io.github.primelib.jira4j.restv2.model.PageBeanJqlFunctionPrecomputationBean;
import io.github.primelib.jira4j.restv2.model.PageBeanNotificationScheme;
import io.github.primelib.jira4j.restv2.model.PageBeanNotificationSchemeAndProjectMappingJsonBean;
import io.github.primelib.jira4j.restv2.model.PageBeanPriority;
import io.github.primelib.jira4j.restv2.model.PageBeanProject;
import io.github.primelib.jira4j.restv2.model.PageBeanProjectDetails;
import io.github.primelib.jira4j.restv2.model.PageBeanResolutionJsonBean;
import io.github.primelib.jira4j.restv2.model.PageBeanScreen;
import io.github.primelib.jira4j.restv2.model.PageBeanScreenScheme;
import io.github.primelib.jira4j.restv2.model.PageBeanScreenWithTab;
import io.github.primelib.jira4j.restv2.model.PageBeanSecurityLevel;
import io.github.primelib.jira4j.restv2.model.PageBeanSecurityLevelMember;
import io.github.primelib.jira4j.restv2.model.PageBeanSecuritySchemeWithProjects;
import io.github.primelib.jira4j.restv2.model.PageBeanString;
import io.github.primelib.jira4j.restv2.model.PageBeanUiModificationDetails;
import io.github.primelib.jira4j.restv2.model.PageBeanUser;
import io.github.primelib.jira4j.restv2.model.PageBeanUserDetails;
import io.github.primelib.jira4j.restv2.model.PageBeanUserKey;
import io.github.primelib.jira4j.restv2.model.PageBeanVersion;
import io.github.primelib.jira4j.restv2.model.PageBeanWebhook;
import io.github.primelib.jira4j.restv2.model.PageBeanWorkflow;
import io.github.primelib.jira4j.restv2.model.PageBeanWorkflowScheme;
import io.github.primelib.jira4j.restv2.model.PageBeanWorkflowTransitionRules;
import io.github.primelib.jira4j.restv2.model.PageOfChangelogs;
import io.github.primelib.jira4j.restv2.model.PageOfComments;
import io.github.primelib.jira4j.restv2.model.PageOfDashboards;
import io.github.primelib.jira4j.restv2.model.PageOfStatuses;
import io.github.primelib.jira4j.restv2.model.PageOfWorklogs;
import io.github.primelib.jira4j.restv2.model.ParsedJqlQueries;
import io.github.primelib.jira4j.restv2.model.PermissionGrant;
import io.github.primelib.jira4j.restv2.model.PermissionGrants;
import io.github.primelib.jira4j.restv2.model.PermissionScheme;
import io.github.primelib.jira4j.restv2.model.PermissionSchemes;
import io.github.primelib.jira4j.restv2.model.Permissions;
import io.github.primelib.jira4j.restv2.model.PermittedProjects;
import io.github.primelib.jira4j.restv2.model.Priority;
import io.github.primelib.jira4j.restv2.model.PriorityId;
import io.github.primelib.jira4j.restv2.model.Project;
import io.github.primelib.jira4j.restv2.model.ProjectAvatars;
import io.github.primelib.jira4j.restv2.model.ProjectCategory;
import io.github.primelib.jira4j.restv2.model.ProjectComponent;
import io.github.primelib.jira4j.restv2.model.ProjectEmailAddress;
import io.github.primelib.jira4j.restv2.model.ProjectIdentifiers;
import io.github.primelib.jira4j.restv2.model.ProjectIssueSecurityLevels;
import io.github.primelib.jira4j.restv2.model.ProjectIssueTypeHierarchy;
import io.github.primelib.jira4j.restv2.model.ProjectRole;
import io.github.primelib.jira4j.restv2.model.ProjectRoleDetails;
import io.github.primelib.jira4j.restv2.model.ProjectType;
import io.github.primelib.jira4j.restv2.model.PropertyKeys;
import io.github.primelib.jira4j.restv2.model.PublishDraftWorkflowScheme;
import io.github.primelib.jira4j.restv2.model.RemoteIssueLink;
import io.github.primelib.jira4j.restv2.model.RemoteIssueLinkIdentifies;
import io.github.primelib.jira4j.restv2.model.Resolution;
import io.github.primelib.jira4j.restv2.model.ResolutionId;
import io.github.primelib.jira4j.restv2.model.SanitizedJqlQueries;
import io.github.primelib.jira4j.restv2.model.Screen;
import io.github.primelib.jira4j.restv2.model.ScreenDetails;
import io.github.primelib.jira4j.restv2.model.ScreenSchemeDetails;
import io.github.primelib.jira4j.restv2.model.ScreenSchemeId;
import io.github.primelib.jira4j.restv2.model.ScreenableField;
import io.github.primelib.jira4j.restv2.model.ScreenableTab;
import io.github.primelib.jira4j.restv2.model.SearchResults;
import io.github.primelib.jira4j.restv2.model.SecurityLevel;
import io.github.primelib.jira4j.restv2.model.SecurityScheme;
import io.github.primelib.jira4j.restv2.model.SecuritySchemeId;
import io.github.primelib.jira4j.restv2.model.SecuritySchemes;
import io.github.primelib.jira4j.restv2.model.ServerInformation;
import java.util.Set;
import io.github.primelib.jira4j.restv2.model.SharePermission;
import io.github.primelib.jira4j.restv2.model.StatusCategory;
import io.github.primelib.jira4j.restv2.model.StatusDetails;
import io.github.primelib.jira4j.restv2.model.SystemAvatars;
import io.github.primelib.jira4j.restv2.model.TaskProgressBeanObject;
import io.github.primelib.jira4j.restv2.model.TimeTrackingConfiguration;
import io.github.primelib.jira4j.restv2.model.TimeTrackingProvider;
import io.github.primelib.jira4j.restv2.model.Transitions;
import java.net.URI;
import io.github.primelib.jira4j.restv2.model.UiModificationIdentifiers;
import io.github.primelib.jira4j.restv2.model.UnrestrictedUserEmail;
import io.github.primelib.jira4j.restv2.model.UpdateDefaultScreenScheme;
import io.github.primelib.jira4j.restv2.model.UpdatedProjectCategory;
import io.github.primelib.jira4j.restv2.model.User;
import io.github.primelib.jira4j.restv2.model.UserMigrationBean;
import io.github.primelib.jira4j.restv2.model.Version;
import io.github.primelib.jira4j.restv2.model.VersionIssueCounts;
import io.github.primelib.jira4j.restv2.model.VersionUnresolvedIssuesCount;
import io.github.primelib.jira4j.restv2.model.Votes;
import io.github.primelib.jira4j.restv2.model.Watchers;
import io.github.primelib.jira4j.restv2.model.WebhooksExpirationDate;
import io.github.primelib.jira4j.restv2.model.WorkflowCapabilities;
import io.github.primelib.jira4j.restv2.model.WorkflowCreateResponse;
import io.github.primelib.jira4j.restv2.model.WorkflowIDs;
import io.github.primelib.jira4j.restv2.model.WorkflowReadResponse;
import io.github.primelib.jira4j.restv2.model.WorkflowRulesSearch;
import io.github.primelib.jira4j.restv2.model.WorkflowRulesSearchDetails;
import io.github.primelib.jira4j.restv2.model.WorkflowScheme;
import io.github.primelib.jira4j.restv2.model.WorkflowSchemeProjectAssociation;
import io.github.primelib.jira4j.restv2.model.WorkflowTransitionProperty;
import io.github.primelib.jira4j.restv2.model.WorkflowTransitionRulesUpdate;
import io.github.primelib.jira4j.restv2.model.WorkflowTransitionRulesUpdateErrors;
import io.github.primelib.jira4j.restv2.model.WorkflowUpdateResponse;
import io.github.primelib.jira4j.restv2.model.WorkflowValidationErrorList;
import io.github.primelib.jira4j.restv2.model.Worklog;

import java.util.function.Consumer;

import io.github.primelib.jira4j.restv2.spec.AddActorUsersOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AddAttachmentOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AddCommentOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AddFieldToDefaultScreenOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AddGadgetOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AddIssueTypesToContextOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AddIssueTypesToIssueTypeSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AddNotificationsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AddProjectRoleActorsToRoleOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AddScreenTabOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AddScreenTabFieldOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AddSecurityLevelOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AddSecurityLevelMembersOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AddSharePermissionOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AddUserToGroupOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AddVoteOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AddWatcherOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AddWorklogOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AddonPropertiesResourceDeleteAddonPropertyDeleteOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AddonPropertiesResourceDeleteAppPropertyDeleteOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AddonPropertiesResourceGetAddonPropertiesGetOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AddonPropertiesResourceGetAddonPropertyGetOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AddonPropertiesResourcePutAddonPropertyPutOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AddonPropertiesResourcePutAppPropertyPutOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AnalyseExpressionOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AppIssueFieldValueUpdateResourceUpdateIssueFieldsPutOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AppendMappingsForIssueTypeScreenSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.ArchiveProjectOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AssignFieldConfigurationSchemeToProjectOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AssignIssueOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AssignIssueTypeSchemeToProjectOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AssignIssueTypeScreenSchemeToProjectOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AssignPermissionSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AssignProjectsToCustomFieldContextOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AssignSchemeToProjectOperationSpec;
import io.github.primelib.jira4j.restv2.spec.AssociateSchemesToProjectsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.BulkDeleteIssuePropertyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.BulkGetGroupsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.BulkGetUsersOperationSpec;
import io.github.primelib.jira4j.restv2.spec.BulkGetUsersMigrationOperationSpec;
import io.github.primelib.jira4j.restv2.spec.BulkSetIssuePropertiesByIssueOperationSpec;
import io.github.primelib.jira4j.restv2.spec.BulkSetIssuePropertyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.BulkSetIssuesPropertiesListOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CancelTaskOperationSpec;
import io.github.primelib.jira4j.restv2.spec.ChangeFilterOwnerOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CopyDashboardOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateComponentOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateCustomFieldOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateCustomFieldContextOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateCustomFieldOptionOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateDashboardOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateFieldConfigurationOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateFieldConfigurationSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateFilterOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateGroupOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateIssueOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateIssueFieldOptionOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateIssueLinkTypeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateIssueSecuritySchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateIssueTypeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateIssueTypeAvatarOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateIssueTypeSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateIssueTypeScreenSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateIssuesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateNotificationSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateOrUpdateRemoteIssueLinkOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreatePermissionGrantOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreatePermissionSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreatePriorityOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateProjectOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateProjectAvatarOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateProjectCategoryOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateProjectRoleOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateResolutionOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateScreenOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateScreenSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateStatusesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateUiModificationOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateUserOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateVersionOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateWorkflowOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateWorkflowSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateWorkflowSchemeDraftFromParentOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateWorkflowTransitionPropertyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.CreateWorkflowsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteActorOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteAndReplaceVersionOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteAvatarOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteCommentOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteCommentPropertyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteComponentOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteCustomFieldOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteCustomFieldContextOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteCustomFieldOptionOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteDashboardOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteDashboardItemPropertyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteDefaultWorkflowOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteDraftDefaultWorkflowOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteDraftWorkflowMappingOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteFavouriteForFilterOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteFieldConfigurationOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteFieldConfigurationSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteFilterOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteInactiveWorkflowOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteIssueOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteIssueFieldOptionOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteIssueLinkOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteIssueLinkTypeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteIssuePropertyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteIssueTypeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteIssueTypePropertyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteIssueTypeSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteIssueTypeScreenSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteLocaleOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteNotificationSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeletePermissionSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeletePermissionSchemeEntityOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeletePriorityOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteProjectOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteProjectAsynchronouslyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteProjectAvatarOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteProjectPropertyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteProjectRoleOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteProjectRoleActorsFromRoleOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteRemoteIssueLinkByGlobalIdOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteRemoteIssueLinkByIdOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteResolutionOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteScreenOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteScreenSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteScreenTabOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteSecuritySchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteSharePermissionOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteStatusesByIdOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteUiModificationOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteUserPropertyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteVersionOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteWebhookByIdOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteWorkflowMappingOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteWorkflowSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteWorkflowSchemeDraftOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteWorkflowSchemeDraftIssueTypeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteWorkflowSchemeIssueTypeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteWorkflowTransitionPropertyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteWorkflowTransitionRuleConfigurationsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteWorklogOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DeleteWorklogPropertyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DoTransitionOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DynamicModulesResourceGetModulesGetOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DynamicModulesResourceRegisterModulesPostOperationSpec;
import io.github.primelib.jira4j.restv2.spec.DynamicModulesResourceRemoveModulesDeleteOperationSpec;
import io.github.primelib.jira4j.restv2.spec.EditIssueOperationSpec;
import io.github.primelib.jira4j.restv2.spec.EvaluateJiraExpressionOperationSpec;
import io.github.primelib.jira4j.restv2.spec.ExpandAttachmentForHumansOperationSpec;
import io.github.primelib.jira4j.restv2.spec.ExpandAttachmentForMachinesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.FindAssignableUsersOperationSpec;
import io.github.primelib.jira4j.restv2.spec.FindBulkAssignableUsersOperationSpec;
import io.github.primelib.jira4j.restv2.spec.FindGroupsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.FindUserKeysByQueryOperationSpec;
import io.github.primelib.jira4j.restv2.spec.FindUsersOperationSpec;
import io.github.primelib.jira4j.restv2.spec.FindUsersAndGroupsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.FindUsersByQueryOperationSpec;
import io.github.primelib.jira4j.restv2.spec.FindUsersForPickerOperationSpec;
import io.github.primelib.jira4j.restv2.spec.FindUsersWithAllPermissionsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.FindUsersWithBrowsePermissionOperationSpec;
import io.github.primelib.jira4j.restv2.spec.FullyUpdateProjectRoleOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAccessibleProjectTypeByKeyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAdvancedSettingsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAllAccessibleProjectTypesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAllApplicationRolesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAllAvailableDashboardGadgetsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAllDashboardsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAllFieldConfigurationSchemesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAllFieldConfigurationsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAllGadgetsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAllIssueFieldOptionsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAllIssueTypeSchemesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAllLabelsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAllPermissionSchemesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAllPermissionsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAllProjectAvatarsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAllProjectCategoriesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAllProjectRolesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAllProjectTypesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAllProjectsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAllScreenTabFieldsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAllScreenTabsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAllStatusesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAllSystemAvatarsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAllUsersOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAllUsersDefaultOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAllWorkflowSchemesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAllWorkflowsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAlternativeIssueTypesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetApplicationPropertyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetApplicationRoleOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetApproximateApplicationLicenseCountOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetApproximateLicenseCountOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAssignedPermissionSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAttachmentOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAttachmentContentOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAttachmentMetaOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAttachmentThumbnailOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAuditRecordsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAutoCompleteOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAutoCompletePostOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAvailableScreenFieldsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAvailableTimeTrackingImplementationsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAvatarImageByIDOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAvatarImageByOwnerOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAvatarImageByTypeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetAvatarsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetBannerOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetBulkPermissionsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetChangeLogsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetChangeLogsByIdsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetColumnsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetCommentOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetCommentPropertyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetCommentPropertyKeysOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetCommentsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetCommentsByIdsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetComponentOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetComponentRelatedIssuesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetConfigurationOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetContextsForFieldOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetContextsForFieldDeprecatedOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetCreateIssueMetaOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetCurrentUserOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetCustomFieldConfigurationOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetCustomFieldContextsForProjectsAndIssueTypesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetCustomFieldOptionOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetDashboardOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetDashboardItemPropertyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetDashboardItemPropertyKeysOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetDashboardsPaginatedOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetDefaultShareScopeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetDefaultValuesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetDefaultWorkflowOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetDraftDefaultWorkflowOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetDraftWorkflowOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetDynamicWebhooksForAppOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetEditIssueMetaOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetEventsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetFailedWebhooksOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetFavouriteFiltersOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetFeaturesForProjectOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetFieldAutoCompleteForQueryStringOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetFieldConfigurationItemsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetFieldConfigurationSchemeMappingsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetFieldConfigurationSchemeProjectMappingOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetFieldsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetFieldsPaginatedOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetFilterOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetFiltersPaginatedOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetGroupOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetHierarchyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetIdsOfWorklogsDeletedSinceOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetIdsOfWorklogsModifiedSinceOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetIsWatchingIssueBulkOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetIssueOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetIssueAllTypesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetIssueFieldOptionOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetIssueLinkOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetIssueLinkTypeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetIssueLinkTypesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetIssueNavigatorDefaultColumnsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetIssuePickerResourceOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetIssuePropertyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetIssuePropertyKeysOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetIssueSecurityLevelOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetIssueSecurityLevelMembersOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetIssueSecuritySchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetIssueSecuritySchemesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetIssueTypeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetIssueTypeMappingsForContextsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetIssueTypePropertyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetIssueTypePropertyKeysOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetIssueTypeSchemeForProjectsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetIssueTypeSchemesMappingOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetIssueTypeScreenSchemeMappingsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetIssueTypeScreenSchemeProjectAssociationsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetIssueTypeScreenSchemesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetIssueTypesForProjectOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetIssueWatchersOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetIssueWorklogOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetLicenseOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetLocaleOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetMyFiltersOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetMyPermissionsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetNotificationSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetNotificationSchemeForProjectOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetNotificationSchemeToProjectMappingsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetNotificationSchemesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetOptionsForContextOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetPermissionSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetPermissionSchemeGrantOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetPermissionSchemeGrantsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetPermittedProjectsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetPrecomputationsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetPreferenceOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetPrioritiesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetPriorityOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetProjectOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetProjectCategoryByIdOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetProjectComponentsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetProjectComponentsPaginatedOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetProjectContextMappingOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetProjectEmailOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetProjectIssueSecuritySchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetProjectPropertyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetProjectPropertyKeysOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetProjectRoleOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetProjectRoleActorsForRoleOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetProjectRoleByIdOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetProjectRoleDetailsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetProjectRolesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetProjectTypeByKeyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetProjectVersionsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetProjectVersionsPaginatedOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetProjectsForIssueTypeScreenSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetRecentOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetRemoteIssueLinkByIdOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetRemoteIssueLinksOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetResolutionOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetResolutionsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetScreenSchemesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetScreensOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetScreensForFieldOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetSecurityLevelMembersOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetSecurityLevelsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetSecurityLevelsForProjectOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetSelectableIssueFieldOptionsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetSelectedTimeTrackingImplementationOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetServerInfoOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetSharePermissionOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetSharePermissionsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetSharedTimeTrackingConfigurationOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetStatusOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetStatusCategoriesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetStatusCategoryOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetStatusesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetStatusesByIdOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetTaskOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetTransitionsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetTrashedFieldsPaginatedOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetUiModificationsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetUserOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetUserDefaultColumnsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetUserEmailOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetUserEmailBulkOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetUserGroupsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetUserPropertyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetUserPropertyKeysOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetUsersFromGroupOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetValidProjectKeyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetValidProjectNameOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetVersionOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetVersionRelatedIssuesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetVersionUnresolvedIssuesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetVisibleIssueFieldOptionsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetVotesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetWorkflowOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetWorkflowSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetWorkflowSchemeDraftOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetWorkflowSchemeDraftIssueTypeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetWorkflowSchemeIssueTypeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetWorkflowSchemeProjectAssociationsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetWorkflowTransitionPropertiesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetWorkflowTransitionRuleConfigurationsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetWorkflowsPaginatedOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetWorklogOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetWorklogPropertyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetWorklogPropertyKeysOperationSpec;
import io.github.primelib.jira4j.restv2.spec.GetWorklogsForIdsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.LinkIssuesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.MatchIssuesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.MergeVersionsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.MigrateQueriesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.MigrationResourceUpdateEntityPropertiesValuePutOperationSpec;
import io.github.primelib.jira4j.restv2.spec.MigrationResourceWorkflowRuleSearchPostOperationSpec;
import io.github.primelib.jira4j.restv2.spec.MovePrioritiesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.MoveResolutionsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.MoveScreenTabOperationSpec;
import io.github.primelib.jira4j.restv2.spec.MoveScreenTabFieldOperationSpec;
import io.github.primelib.jira4j.restv2.spec.MoveVersionOperationSpec;
import io.github.primelib.jira4j.restv2.spec.NotifyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.ParseJqlQueriesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.PartialUpdateProjectRoleOperationSpec;
import io.github.primelib.jira4j.restv2.spec.PublishDraftWorkflowSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.ReadWorkflowsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.RefreshWebhooksOperationSpec;
import io.github.primelib.jira4j.restv2.spec.RegisterDynamicWebhooksOperationSpec;
import io.github.primelib.jira4j.restv2.spec.RemoveAttachmentOperationSpec;
import io.github.primelib.jira4j.restv2.spec.RemoveCustomFieldContextFromProjectsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.RemoveGadgetOperationSpec;
import io.github.primelib.jira4j.restv2.spec.RemoveGroupOperationSpec;
import io.github.primelib.jira4j.restv2.spec.RemoveIssueTypeFromIssueTypeSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.RemoveIssueTypesFromContextOperationSpec;
import io.github.primelib.jira4j.restv2.spec.RemoveIssueTypesFromGlobalFieldConfigurationSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.RemoveLevelOperationSpec;
import io.github.primelib.jira4j.restv2.spec.RemoveMappingsFromIssueTypeScreenSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.RemoveMemberFromSecurityLevelOperationSpec;
import io.github.primelib.jira4j.restv2.spec.RemoveNotificationFromNotificationSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.RemovePreferenceOperationSpec;
import io.github.primelib.jira4j.restv2.spec.RemoveProjectCategoryOperationSpec;
import io.github.primelib.jira4j.restv2.spec.RemoveScreenTabFieldOperationSpec;
import io.github.primelib.jira4j.restv2.spec.RemoveUserOperationSpec;
import io.github.primelib.jira4j.restv2.spec.RemoveUserFromGroupOperationSpec;
import io.github.primelib.jira4j.restv2.spec.RemoveVoteOperationSpec;
import io.github.primelib.jira4j.restv2.spec.RemoveWatcherOperationSpec;
import io.github.primelib.jira4j.restv2.spec.RenameScreenTabOperationSpec;
import io.github.primelib.jira4j.restv2.spec.ReorderCustomFieldOptionsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.ReorderIssueTypesInIssueTypeSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.ReplaceIssueFieldOptionOperationSpec;
import io.github.primelib.jira4j.restv2.spec.ResetColumnsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.ResetUserColumnsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.RestoreOperationSpec;
import io.github.primelib.jira4j.restv2.spec.RestoreCustomFieldOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SanitiseJqlQueriesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SearchOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SearchForIssuesUsingJqlOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SearchForIssuesUsingJqlPostOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SearchPrioritiesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SearchProjectsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SearchProjectsUsingSecuritySchemesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SearchResolutionsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SearchSecuritySchemesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SelectTimeTrackingImplementationOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SetActorsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SetApplicationPropertyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SetBannerOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SetColumnsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SetCommentPropertyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SetDashboardItemPropertyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SetDefaultLevelsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SetDefaultPriorityOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SetDefaultResolutionOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SetDefaultShareScopeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SetDefaultValuesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SetFavouriteForFilterOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SetFieldConfigurationSchemeMappingOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SetIssueNavigatorDefaultColumnsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SetIssuePropertyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SetIssueTypePropertyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SetLocaleOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SetPreferenceOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SetProjectPropertyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SetSharedTimeTrackingConfigurationOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SetUserColumnsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SetUserPropertyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SetWorkflowSchemeDraftIssueTypeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SetWorkflowSchemeIssueTypeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.SetWorklogPropertyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.StoreAvatarOperationSpec;
import io.github.primelib.jira4j.restv2.spec.ToggleFeatureForProjectOperationSpec;
import io.github.primelib.jira4j.restv2.spec.TrashCustomFieldOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateCommentOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateComponentOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateCustomFieldOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateCustomFieldConfigurationOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateCustomFieldContextOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateCustomFieldOptionOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateCustomFieldValueOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateDashboardOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateDefaultScreenSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateDefaultWorkflowOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateDraftDefaultWorkflowOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateDraftWorkflowMappingOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateFieldConfigurationOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateFieldConfigurationItemsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateFieldConfigurationSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateFilterOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateGadgetOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateIssueFieldOptionOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateIssueLinkTypeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateIssueSecuritySchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateIssueTypeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateIssueTypeSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateIssueTypeScreenSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateMultipleCustomFieldValuesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateNotificationSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdatePermissionSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdatePrecomputationsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdatePriorityOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateProjectOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateProjectAvatarOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateProjectCategoryOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateProjectEmailOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateRemoteIssueLinkOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateResolutionOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateScreenOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateScreenSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateSecurityLevelOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateStatusesOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateUiModificationOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateVersionOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateWorkflowMappingOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateWorkflowSchemeOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateWorkflowSchemeDraftOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateWorkflowTransitionPropertyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateWorkflowTransitionRuleConfigurationsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateWorkflowsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.UpdateWorklogOperationSpec;
import io.github.primelib.jira4j.restv2.spec.ValidateCreateWorkflowsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.ValidateProjectKeyOperationSpec;
import io.github.primelib.jira4j.restv2.spec.ValidateUpdateWorkflowsOperationSpec;
import io.github.primelib.jira4j.restv2.spec.WorkflowCapabilitiesOperationSpec;

@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JiraRESTV2ConsumerApi {
    private final JiraRESTV2Api api;

    public JiraRESTV2ConsumerApi(JiraRESTV2Api api) {
        this.api = api;
    }

    /**
     * Add actors to project role
     * <p>
     * Adds actors to a project role for the project.
     * To replace all actors for the project, use [Set actors for project role](#api-rest-api-2-project-projectIdOrKey-role-id-put).
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ProjectRole addActorUsers(Consumer<AddActorUsersOperationSpec> spec) {
        AddActorUsersOperationSpec r = new AddActorUsersOperationSpec(spec);
        return api.addActorUsers(r.projectIdOrKey(), r.id(), r.actorsMap());
    }

    /**
     * Add attachment
     * <p>
     * Adds one or more attachments to an issue. Attachments are posted as multipart/form-data ([RFC 1867](https://www.ietf.org/rfc/rfc1867.txt)).
     * Note that:
     *  *
     * The request must have a `X-Atlassian-Token: no-check` header, if not it is blocked. See [Special headers](#special-request-headers) for more information.
     * *
     * The name of the multipart/form-data parameter that contains the attachments must be `file`.
     * The following examples upload a file called *myfile.txt* to the issue *TEST-123*:
     * #### curl ####
     * 
     * 
     * curl --location --request POST 'https://your-domain.atlassian.net/rest/api/2/issue/TEST-123/attachments'
     * 
     * 
     * -u 'email@example.com:&amp;lt;api_token&amp;gt;'
     * 
     * 
     * -H 'X-Atlassian-Token: no-check'
     * 
     * 
     * --form 'file=@"myfile.txt"'
     * #### Node.js ####
     * 
     * 
     * // This code sample uses the 'node-fetch' and 'form-data' libraries:
     * 
     * 
     * // https://www.npmjs.com/package/node-fetch
     * 
     * 
     * // https://www.npmjs.com/package/form-data
     * 
     * 
     * const fetch = require('node-fetch');
     * 
     * 
     * const FormData = require('form-data');
     * 
     * 
     * const fs = require('fs');
     * 
     * 
     * 
     * 
     *  const filePath = 'myfile.txt';
     * 
     * 
     * const form = new FormData();
     * 
     * 
     * const stats = fs.statSync(filePath);
     * 
     * 
     * const fileSizeInBytes = stats.size;
     * 
     * 
     * const fileStream = fs.createReadStream(filePath);
     * 
     * 
     * 
     * 
     *  form.append('file', fileStream, {knownLength: fileSizeInBytes});
     * 
     * 
     * 
     * 
     *  fetch('https://your-domain.atlassian.net/rest/api/2/issue/TEST-123/attachments', {
     * 
     * 
     * 
     * 
     * method: 'POST',
     * 
     * 
     * 
     * 
     * body: form,
     * 
     * 
     * 
     * 
     * headers: {
     * 
     * 
     * 
     * 
     * 
     * 
     * 'Authorization': `Basic ${Buffer.from(
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 'email@example.com:'
     * 
     * 
     * 
     * 
     * 
     * 
     * ).toString('base64')}`,
     * 
     * 
     * 
     * 
     * 
     * 
     * 'Accept': 'application/json',
     * 
     * 
     * 
     * 
     * 
     * 
     * 'X-Atlassian-Token': 'no-check'
     * 
     * 
     * 
     * 
     * }
     * 
     * 
     * })
     * 
     * 
     * 
     * 
     * .then(response =&amp;gt; {
     * 
     * 
     * 
     * 
     * 
     * 
     * console.log(
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * `Response: ${response.status} ${response.statusText}`
     * 
     * 
     * 
     * 
     * 
     * 
     * );
     * 
     * 
     * 
     * 
     * 
     * 
     * return response.text();
     * 
     * 
     * 
     * 
     * })
     * 
     * 
     * 
     * 
     * .then(text =&amp;gt; console.log(text))
     * 
     * 
     * 
     * 
     * .catch(err =&amp;gt; console.error(err));
     * #### Java ####
     * 
     * 
     * // This code sample uses the
     * 'Unirest' library:
     * 
     * 
     * // http://unirest.io/java.html
     * 
     * 
     * HttpResponse response = Unirest.post("https://your-domain.atlassian.net/rest/api/2/issue/{issueIdOrKey}/attachments")
     * 
     * 
     * 
     * 
     * 
     * 
     * .basicAuth("email@example.com", "")
     * 
     * 
     * 
     * 
     * 
     * 
     * .header("Accept", "application/json")
     * 
     * 
     * 
     * 
     * 
     * 
     * .header("X-Atlassian-Token", "no-check")
     * 
     * 
     * 
     * 
     * 
     * 
     * .field("file", new File("myfile.txt"))
     * 
     * 
     * 
     * 
     * 
     * 
     * .asJson();
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     *  System.out.println(response.getBody());
     * #### Python ####
     * 
     * 
     * # This code sample uses the 'requests' library:
     * 
     * 
     * # http://docs.python-requests.org
     * 
     * 
     * import requests
     * 
     * 
     * from requests.auth import HTTPBasicAuth
     * 
     * 
     * import json
     * 
     * 
     * 
     * 
     *  url = "https://your-domain.atlassian.net/rest/api/2/issue/{issueIdOrKey}/attachments"
     * 
     * 
     * 
     * 
     *  auth = HTTPBasicAuth("email@example.com", "")
     * 
     * 
     * 
     * 
     *  headers = {
     * 
     * 
     * 
     *  "Accept": "application/json",
     * 
     * 
     * 
     *  "X-Atlassian-Token": "no-check"
     * 
     * 
     * }
     * 
     * 
     * 
     * 
     *  response = requests.request(
     * 
     * 
     * 
     *  "POST",
     * 
     * 
     * 
     *  url,
     * 
     * 
     * 
     *  headers = headers,
     * 
     * 
     * 
     *  auth = auth,
     * 
     * 
     * 
     *  files = {
     * 
     * 
     * 
     * 
     * 
     * 
     * "file": ("myfile.txt", open("myfile.txt","rb"), "application-type")
     * 
     * 
     * 
     *  }
     * 
     * 
     * )
     * 
     * 
     * 
     * 
     *  print(json.dumps(json.loads(response.text), sort_keys=True, indent=4, separators=(",", ": ")))
     * #### PHP ####
     * 
     * 
     * // This code sample uses the 'Unirest' library:
     * 
     * 
     * // http://unirest.io/php.html
     * 
     * 
     * Unirest\\Request::auth('email@example.com', '');
     * 
     * 
     * 
     * 
     *  $headers = array(
     * 
     * 
     * 
     * 'Accept' =&amp;gt; 'application/json',
     * 
     * 
     * 
     * 'X-Atlassian-Token' =&amp;gt; 'no-check'
     * 
     * 
     * );
     * 
     * 
     * 
     * 
     *  $parameters = array(
     * 
     * 
     * 
     * 'file' =&amp;gt; File::add('myfile.txt')
     * 
     * 
     * );
     * 
     * 
     * 
     * 
     *  $response = Unirest\\Request::post(
     * 
     * 
     * 
     * 'https://your-domain.atlassian.net/rest/api/2/issue/{issueIdOrKey}/attachments',
     * 
     * 
     * 
     * $headers,
     * 
     * 
     * 
     * $parameters
     * 
     * 
     * );
     * 
     * 
     * 
     * 
     *  var_dump($response)
     * #### Forge ####
     * 
     * 
     * // This sample uses Atlassian Forge and the `form-data` library.
     * 
     * 
     * // https://developer.atlassian.com/platform/forge/
     * 
     * 
     * // https://www.npmjs.com/package/form-data
     * 
     * 
     * import api from "@forge/api";
     * 
     * 
     * import FormData from "form-data";
     * 
     * 
     * 
     * 
     *  const form = new FormData();
     * 
     * 
     * form.append('file', fileStream, {knownLength: fileSizeInBytes});
     * 
     * 
     * 
     * 
     *  const response = await api.asApp().requestJira('/rest/api/2/issue/{issueIdOrKey}/attachments', {
     * 
     * 
     * 
     * 
     * method: 'POST',
     * 
     * 
     * 
     * 
     * body: form,
     * 
     * 
     * 
     * 
     * headers: {
     * 
     * 
     * 
     * 
     * 
     * 
     * 'Accept': 'application/json',
     * 
     * 
     * 
     * 
     * 
     * 
     * 'X-Atlassian-Token': 'no-check'
     * 
     * 
     * 
     * 
     * }
     * 
     * 
     * });
     * 
     * 
     * 
     * 
     *  console.log(`Response: ${response.status} ${response.statusText}`);
     * 
     * 
     * console.log(await response.json());
     * Tip: Use a client library. Many client libraries have classes for handling multipart POST operations. For example, in Java, the Apache HTTP Components library provides a [MultiPartEntity](http://hc.apache.org/httpcomponents-client-ga/httpmime/apidocs/org/apache/http/entity/mime/MultipartEntity.html) class for multipart POST operations.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     * 
     * *
     * *Browse Projects* and *Create attachments* [ project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<Attachment> addAttachment(Consumer<AddAttachmentOperationSpec> spec) {
        AddAttachmentOperationSpec r = new AddAttachmentOperationSpec(spec);
        return api.addAttachment(r.issueIdOrKey());
    }

    /**
     * Add comment
     * <p>
     * Adds a comment to an issue.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* and *Add comments* [ project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue containing the comment is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Comment addComment(Consumer<AddCommentOperationSpec> spec) {
        AddCommentOperationSpec r = new AddCommentOperationSpec(spec);
        return api.addComment(r.issueIdOrKey(), r.requestBody(), r.expand());
    }

    /**
     * Add field to default screen
     * <p>
     * Adds a field to the default tab of the default screen.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object addFieldToDefaultScreen(Consumer<AddFieldToDefaultScreenOperationSpec> spec) {
        AddFieldToDefaultScreenOperationSpec r = new AddFieldToDefaultScreenOperationSpec(spec);
        return api.addFieldToDefaultScreen(r.fieldId());
    }

    /**
     * Add gadget to dashboard
     * <p>
     * Adds a gadget to a dashboard.
     * **[Permissions](#permissions) required:** None.
     * Authentication - Required Scopes: [write:jira-work, read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public DashboardGadget addGadget(Consumer<AddGadgetOperationSpec> spec) {
        AddGadgetOperationSpec r = new AddGadgetOperationSpec(spec);
        return api.addGadget(r.dashboardId(), r.dashboardGadgetSettings());
    }

    /**
     * Add issue types to context
     * <p>
     * Adds issue types to a custom field context, appending the issue types to the issue types list.
     * A custom field context without any issue types applies to all issue types. Adding issue types to such a custom field context would result in it applying to only the listed issue types.
     * If any of the issue types exists in the custom field context, the operation fails and no issue types are added.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object addIssueTypesToContext(Consumer<AddIssueTypesToContextOperationSpec> spec) {
        AddIssueTypesToContextOperationSpec r = new AddIssueTypesToContextOperationSpec(spec);
        return api.addIssueTypesToContext(r.fieldId(), r.contextId(), r.issueTypeIds());
    }

    /**
     * Add issue types to issue type scheme
     * <p>
     * Adds issue types to an issue type scheme.
     * The added issue types are appended to the issue types list.
     * If any of the issue types exist in the issue type scheme, the operation fails and no issue types are added.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object addIssueTypesToIssueTypeScheme(Consumer<AddIssueTypesToIssueTypeSchemeOperationSpec> spec) {
        AddIssueTypesToIssueTypeSchemeOperationSpec r = new AddIssueTypesToIssueTypeSchemeOperationSpec(spec);
        return api.addIssueTypesToIssueTypeScheme(r.issueTypeSchemeId(), r.issueTypeIds());
    }

    /**
     * Add notifications to notification scheme
     * <p>
     * Adds notifications to a notification scheme. You can add up to 1000 notifications per request.
     * *Deprecated: The notification type `EmailAddress` is no longer supported in Cloud. Refer to the [changelog](https://developer.atlassian.com/cloud/jira/platform/changelog/#CHANGE-1031) for more details.*
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object addNotifications(Consumer<AddNotificationsOperationSpec> spec) {
        AddNotificationsOperationSpec r = new AddNotificationsOperationSpec(spec);
        return api.addNotifications(r.id(), r.requestBody());
    }

    /**
     * Add default actors to project role
     * <p>
     * Adds [default actors](#api-rest-api-2-resolution-get) to a role. You may add groups or users, but you cannot add groups and users in the same request.
     * Changing a project role's default actors does not affect project role members for projects already created.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ProjectRole addProjectRoleActorsToRole(Consumer<AddProjectRoleActorsToRoleOperationSpec> spec) {
        AddProjectRoleActorsToRoleOperationSpec r = new AddProjectRoleActorsToRoleOperationSpec(spec);
        return api.addProjectRoleActorsToRole(r.id(), r.actorInputBean());
    }

    /**
     * Create screen tab
     * <p>
     * Creates a tab for a screen.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ScreenableTab addScreenTab(Consumer<AddScreenTabOperationSpec> spec) {
        AddScreenTabOperationSpec r = new AddScreenTabOperationSpec(spec);
        return api.addScreenTab(r.screenId(), r.screenableTab());
    }

    /**
     * Add screen tab field
     * <p>
     * Adds a field to a screen tab.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ScreenableField addScreenTabField(Consumer<AddScreenTabFieldOperationSpec> spec) {
        AddScreenTabFieldOperationSpec r = new AddScreenTabFieldOperationSpec(spec);
        return api.addScreenTabField(r.screenId(), r.tabId(), r.addFieldBean());
    }

    /**
     * Add issue security levels
     * <p>
     * Adds levels and levels' members to the issue security scheme. You can add up to 100 levels per request.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object addSecurityLevel(Consumer<AddSecurityLevelOperationSpec> spec) {
        AddSecurityLevelOperationSpec r = new AddSecurityLevelOperationSpec(spec);
        return api.addSecurityLevel(r.schemeId(), r.addSecuritySchemeLevelsRequestBean());
    }

    /**
     * Add issue security level members
     * <p>
     * Adds members to the issue security level. You can add up to 100 members per request.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object addSecurityLevelMembers(Consumer<AddSecurityLevelMembersOperationSpec> spec) {
        AddSecurityLevelMembersOperationSpec r = new AddSecurityLevelMembersOperationSpec(spec);
        return api.addSecurityLevelMembers(r.schemeId(), r.levelId(), r.securitySchemeMembersRequest());
    }

    /**
     * Add share permission
     * <p>
     * Add a share permissions to a filter. If you add a global share permission (one for all logged-in users or the public) it will overwrite all share permissions for the filter.
     * Be aware that this operation uses different objects for updating share permissions compared to [Update filter](#api-rest-api-2-filter-id-put).
     * **[Permissions](#permissions) required:** *Share dashboards and filters* [global permission](https://confluence.atlassian.com/x/x4dKLg) and the user must own the filter.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<SharePermission> addSharePermission(Consumer<AddSharePermissionOperationSpec> spec) {
        AddSharePermissionOperationSpec r = new AddSharePermissionOperationSpec(spec);
        return api.addSharePermission(r.id(), r.sharePermissionInputBean());
    }

    /**
     * Add user to group
     * <p>
     * Adds a user to a group.
     * **[Permissions](#permissions) required:** Site administration (that is, member of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Group addUserToGroup(Consumer<AddUserToGroupOperationSpec> spec) {
        AddUserToGroupOperationSpec r = new AddUserToGroupOperationSpec(spec);
        return api.addUserToGroup(r.requestBody(), r.groupname(), r.groupId());
    }

    /**
     * Add vote
     * <p>
     * Adds the user's vote to an issue. This is the equivalent of the user clicking *Vote* on an issue in Jira.
     * This operation requires the **Allow users to vote on issues** option to be *ON*. This option is set in General configuration for Jira. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object addVote(Consumer<AddVoteOperationSpec> spec) {
        AddVoteOperationSpec r = new AddVoteOperationSpec(spec);
        return api.addVote(r.issueIdOrKey());
    }

    /**
     * Add watcher
     * <p>
     * Adds a user as a watcher of an issue by passing the account ID of the user. For example, `"5b10ac8d82e05b22cc7d4ef5"`. If no user is specified the calling user is added.
     * This operation requires the **Allow users to watch issues** option to be *ON*. This option is set in General configuration for Jira. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * *
     * To add users other than themselves to the watchlist, *Manage watcher list* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object addWatcher(Consumer<AddWatcherOperationSpec> spec) {
        AddWatcherOperationSpec r = new AddWatcherOperationSpec(spec);
        return api.addWatcher(r.issueIdOrKey(), r.body());
    }

    /**
     * Add worklog
     * <p>
     * Adds a worklog to an issue.
     * Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* and *Work on issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Worklog addWorklog(Consumer<AddWorklogOperationSpec> spec) {
        AddWorklogOperationSpec r = new AddWorklogOperationSpec(spec);
        return api.addWorklog(r.issueIdOrKey(), r.requestBody(), r.notifyUsers(), r.adjustEstimate(), r.newEstimate(), r.reduceBy(), r.expand(), r.overrideEditableFlag());
    }

    /**
     * Delete app property
     * <p>
     * Deletes an app's property.
     * **[Permissions](#permissions) required:** Only a Connect app whose key matches `addonKey` can make this request.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void addonPropertiesResourceDeleteAddonPropertyDelete(Consumer<AddonPropertiesResourceDeleteAddonPropertyDeleteOperationSpec> spec) {
        AddonPropertiesResourceDeleteAddonPropertyDeleteOperationSpec r = new AddonPropertiesResourceDeleteAddonPropertyDeleteOperationSpec(spec);
        api.addonPropertiesResourceDeleteAddonPropertyDelete(r.addonKey(), r.propertyKey());
    }

    /**
     * Delete app property (Forge)
     * <p>
     * Deletes a Forge app's property.
     * **[Permissions](#permissions) required:** Only Forge apps can make this request.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void addonPropertiesResourceDeleteAppPropertyDelete(Consumer<AddonPropertiesResourceDeleteAppPropertyDeleteOperationSpec> spec) {
        AddonPropertiesResourceDeleteAppPropertyDeleteOperationSpec r = new AddonPropertiesResourceDeleteAppPropertyDeleteOperationSpec(spec);
        api.addonPropertiesResourceDeleteAppPropertyDelete(r.propertyKey());
    }

    /**
     * Get app properties
     * <p>
     * Gets all the properties of an app.
     * **[Permissions](#permissions) required:** Only a Connect app whose key matches `addonKey` can make this request. Additionally, Forge apps published on the Marketplace can access properties of Connect apps they were [migrated from](https://developer.atlassian.com/platform/forge/build-a-connect-on-forge-app/).
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PropertyKeys addonPropertiesResourceGetAddonPropertiesGet(Consumer<AddonPropertiesResourceGetAddonPropertiesGetOperationSpec> spec) {
        AddonPropertiesResourceGetAddonPropertiesGetOperationSpec r = new AddonPropertiesResourceGetAddonPropertiesGetOperationSpec(spec);
        return api.addonPropertiesResourceGetAddonPropertiesGet(r.addonKey());
    }

    /**
     * Get app property
     * <p>
     * Returns the key and value of an app's property.
     * **[Permissions](#permissions) required:** Only a Connect app whose key matches `addonKey` can make this request. Additionally, Forge apps published on the Marketplace can access properties of Connect apps they were [migrated from](https://developer.atlassian.com/platform/forge/build-a-connect-on-forge-app/).
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public EntityProperty addonPropertiesResourceGetAddonPropertyGet(Consumer<AddonPropertiesResourceGetAddonPropertyGetOperationSpec> spec) {
        AddonPropertiesResourceGetAddonPropertyGetOperationSpec r = new AddonPropertiesResourceGetAddonPropertyGetOperationSpec(spec);
        return api.addonPropertiesResourceGetAddonPropertyGet(r.addonKey(), r.propertyKey());
    }

    /**
     * Set app property
     * <p>
     * Sets the value of an app's property. Use this resource to store custom data for your app.
     * The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.
     * **[Permissions](#permissions) required:** Only a Connect app whose key matches `addonKey` can make this request.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public OperationMessage addonPropertiesResourcePutAddonPropertyPut(Consumer<AddonPropertiesResourcePutAddonPropertyPutOperationSpec> spec) {
        AddonPropertiesResourcePutAddonPropertyPutOperationSpec r = new AddonPropertiesResourcePutAddonPropertyPutOperationSpec(spec);
        return api.addonPropertiesResourcePutAddonPropertyPut(r.addonKey(), r.propertyKey(), r.body());
    }

    /**
     * Set app property (Forge)
     * <p>
     * Sets the value of a Forge app's property. These values can be retrieved in [Jira expressions](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/) through the `app` [context variable](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#context-variables).
     * For other use cases, use the [Storage API](https://developer.atlassian.com/platform/forge/runtime-reference/storage-api/).
     * The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.
     * **[Permissions](#permissions) required:** Only Forge apps can make this request.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public OperationMessage addonPropertiesResourcePutAppPropertyPut(Consumer<AddonPropertiesResourcePutAppPropertyPutOperationSpec> spec) {
        AddonPropertiesResourcePutAppPropertyPutOperationSpec r = new AddonPropertiesResourcePutAppPropertyPutOperationSpec(spec);
        return api.addonPropertiesResourcePutAppPropertyPut(r.propertyKey(), r.body());
    }

    /**
     * Analyse Jira expression
     * <p>
     * Analyses and validates Jira expressions.
     * As an experimental feature, this operation can also attempt to type-check the expressions.
     * Learn more about Jira expressions in the [documentation](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/).
     * **[Permissions](#permissions) required**: None.
     * Authentication - Required Scopes: [read:jira-work, read:jira-user]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public JiraExpressionsAnalysis analyseExpression(Consumer<AnalyseExpressionOperationSpec> spec) {
        AnalyseExpressionOperationSpec r = new AnalyseExpressionOperationSpec(spec);
        return api.analyseExpression(r.jiraExpressionForAnalysis(), r.check());
    }

    /**
     * Bulk update custom field value
     * <p>
     * Updates the value of a custom field added by Connect apps on one or more issues. The values of up to 200 custom fields can be updated.
     * **[Permissions](#permissions) required:** Only Connect apps can make this request.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object appIssueFieldValueUpdateResourceUpdateIssueFieldsPut(Consumer<AppIssueFieldValueUpdateResourceUpdateIssueFieldsPutOperationSpec> spec) {
        AppIssueFieldValueUpdateResourceUpdateIssueFieldsPutOperationSpec r = new AppIssueFieldValueUpdateResourceUpdateIssueFieldsPutOperationSpec(spec);
        return api.appIssueFieldValueUpdateResourceUpdateIssueFieldsPut(r.atlassianTransferId(), r.connectCustomFieldValues());
    }

    /**
     * Append mappings to issue type screen scheme
     * <p>
     * Appends issue type to screen scheme mappings to an issue type screen scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object appendMappingsForIssueTypeScreenScheme(Consumer<AppendMappingsForIssueTypeScreenSchemeOperationSpec> spec) {
        AppendMappingsForIssueTypeScreenSchemeOperationSpec r = new AppendMappingsForIssueTypeScreenSchemeOperationSpec(spec);
        return api.appendMappingsForIssueTypeScreenScheme(r.issueTypeScreenSchemeId(), r.issueTypeScreenSchemeMappingDetails());
    }

    /**
     * Archive project
     * <p>
     * Archives a project. You can't delete a project if it's archived. To delete an archived project, restore the project and then delete it. To restore a project, use the Jira UI.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object archiveProject(Consumer<ArchiveProjectOperationSpec> spec) {
        ArchiveProjectOperationSpec r = new ArchiveProjectOperationSpec(spec);
        return api.archiveProject(r.projectIdOrKey());
    }

    /**
     * Assign field configuration scheme to project
     * <p>
     * Assigns a field configuration scheme to a project. If the field configuration scheme ID is `null`, the operation assigns the default field configuration scheme.
     * Field configuration schemes can only be assigned to classic projects.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object assignFieldConfigurationSchemeToProject(Consumer<AssignFieldConfigurationSchemeToProjectOperationSpec> spec) {
        AssignFieldConfigurationSchemeToProjectOperationSpec r = new AssignFieldConfigurationSchemeToProjectOperationSpec(spec);
        return api.assignFieldConfigurationSchemeToProject(r.fieldConfigurationSchemeProjectAssociation());
    }

    /**
     * Assign issue
     * <p>
     * Assigns an issue to a user. Use this operation when the calling user does not have the *Edit Issues* permission but has the *Assign issue* permission for the project that the issue is in.
     * If `name` or `accountId` is set to:
     *  *
     * `"-1"`, the issue is assigned to the default assignee for the project.
     * *
     * `null`, the issue is set to unassigned.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse Projects* and *Assign Issues* [ project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object assignIssue(Consumer<AssignIssueOperationSpec> spec) {
        AssignIssueOperationSpec r = new AssignIssueOperationSpec(spec);
        return api.assignIssue(r.issueIdOrKey(), r.user());
    }

    /**
     * Assign issue type scheme to project
     * <p>
     * Assigns an issue type scheme to a project.
     * If any issues in the project are assigned issue types not present in the new scheme, the operation will fail. To complete the assignment those issues must be updated to use issue types in the new scheme.
     * Issue type schemes can only be assigned to classic projects.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object assignIssueTypeSchemeToProject(Consumer<AssignIssueTypeSchemeToProjectOperationSpec> spec) {
        AssignIssueTypeSchemeToProjectOperationSpec r = new AssignIssueTypeSchemeToProjectOperationSpec(spec);
        return api.assignIssueTypeSchemeToProject(r.issueTypeSchemeProjectAssociation());
    }

    /**
     * Assign issue type screen scheme to project
     * <p>
     * Assigns an issue type screen scheme to a project.
     * Issue type screen schemes can only be assigned to classic projects.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object assignIssueTypeScreenSchemeToProject(Consumer<AssignIssueTypeScreenSchemeToProjectOperationSpec> spec) {
        AssignIssueTypeScreenSchemeToProjectOperationSpec r = new AssignIssueTypeScreenSchemeToProjectOperationSpec(spec);
        return api.assignIssueTypeScreenSchemeToProject(r.issueTypeScreenSchemeProjectAssociation());
    }

    /**
     * Assign permission scheme
     * <p>
     * Assigns a permission scheme with a project. See [Managing project permissions](https://confluence.atlassian.com/x/yodKLg) for more information about permission schemes.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg)
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PermissionScheme assignPermissionScheme(Consumer<AssignPermissionSchemeOperationSpec> spec) {
        AssignPermissionSchemeOperationSpec r = new AssignPermissionSchemeOperationSpec(spec);
        return api.assignPermissionScheme(r.projectKeyOrId(), r.idBean(), r.expand());
    }

    /**
     * Assign custom field context to projects
     * <p>
     * Assigns a custom field context to projects.
     * If any project in the request is assigned to any context of the custom field, the operation fails.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object assignProjectsToCustomFieldContext(Consumer<AssignProjectsToCustomFieldContextOperationSpec> spec) {
        AssignProjectsToCustomFieldContextOperationSpec r = new AssignProjectsToCustomFieldContextOperationSpec(spec);
        return api.assignProjectsToCustomFieldContext(r.fieldId(), r.contextId(), r.projectIds());
    }

    /**
     * Assign workflow scheme to project
     * <p>
     * Assigns a workflow scheme to a project. This operation is performed only when there are no issues in the project.
     * Workflow schemes can only be assigned to classic projects.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object assignSchemeToProject(Consumer<AssignSchemeToProjectOperationSpec> spec) {
        AssignSchemeToProjectOperationSpec r = new AssignSchemeToProjectOperationSpec(spec);
        return api.assignSchemeToProject(r.workflowSchemeProjectAssociation());
    }

    /**
     * Associate security scheme to project
     * <p>
     * Associates an issue security scheme with a project and remaps security levels of issues to the new levels, if provided.
     * This operation is [asynchronous](#async). Follow the `location` link in the response to determine the status of the task and use [Get task](#api-rest-api-2-task-taskId-get) to obtain subsequent updates.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void associateSchemesToProjects(Consumer<AssociateSchemesToProjectsOperationSpec> spec) {
        AssociateSchemesToProjectsOperationSpec r = new AssociateSchemesToProjectsOperationSpec(spec);
        api.associateSchemesToProjects(r.associateSecuritySchemeWithProjectDetails());
    }

    /**
     * Bulk delete issue property
     * <p>
     * Deletes a property value from multiple issues. The issues to be updated can be specified by filter criteria.
     * The criteria the filter used to identify eligible issues are:
     *  *
     * `entityIds` Only issues from this list are eligible.
     * *
     * `currentValue` Only issues with the property set to this value are eligible.
     * If both criteria is specified, they are joined with the logical *AND*: only issues that satisfy both criteria are considered eligible.
     * If no filter criteria are specified, all the issues visible to the user and where the user has the EDIT\\_ISSUES permission for the issue are considered eligible.
     * This operation is:
     *  *
     * transactional, either the property is deleted from all eligible issues or, when errors occur, no properties are deleted.
     * *
     * [asynchronous](#async). Follow the `location` link in the response to determine the status of the task and use [Get task](#api-rest-api-2-task-taskId-get) to obtain subsequent updates.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [ project permission](https://confluence.atlassian.com/x/yodKLg) for each project containing issues.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * *
     * *Edit issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for each issue.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void bulkDeleteIssueProperty(Consumer<BulkDeleteIssuePropertyOperationSpec> spec) {
        BulkDeleteIssuePropertyOperationSpec r = new BulkDeleteIssuePropertyOperationSpec(spec);
        api.bulkDeleteIssueProperty(r.propertyKey(), r.issueFilterForBulkPropertyDelete());
    }

    /**
     * Bulk get groups
     * <p>
     * Returns a [paginated](#pagination) list of groups.
     * **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [read:jira-user]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanGroupDetails bulkGetGroups(Consumer<BulkGetGroupsOperationSpec> spec) {
        BulkGetGroupsOperationSpec r = new BulkGetGroupsOperationSpec(spec);
        return api.bulkGetGroups(r.startAt(), r.maxResults(), r.groupId(), r.groupName(), r.accessType(), r.applicationKey());
    }

    /**
     * Bulk get users
     * <p>
     * Returns a [paginated](#pagination) list of the users specified by one or more account IDs.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [read:jira-user]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanUser bulkGetUsers(Consumer<BulkGetUsersOperationSpec> spec) {
        BulkGetUsersOperationSpec r = new BulkGetUsersOperationSpec(spec);
        return api.bulkGetUsers(r.accountId(), r.startAt(), r.maxResults(), r.username(), r.key());
    }

    /**
     * Get account IDs for users
     * <p>
     * Returns the account IDs for the users specified in the `key` or `username` parameters. Note that multiple `key` or `username` parameters can be specified.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [read:jira-user]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<UserMigrationBean> bulkGetUsersMigration(Consumer<BulkGetUsersMigrationOperationSpec> spec) {
        BulkGetUsersMigrationOperationSpec r = new BulkGetUsersMigrationOperationSpec(spec);
        return api.bulkGetUsersMigration(r.startAt(), r.maxResults(), r.username(), r.key());
    }

    /**
     * Bulk set issue properties by issue
     * <p>
     * Sets or updates entity property values on issues. Up to 10 entity properties can be specified for each issue and up to 100 issues included in the request.
     * The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON.
     * This operation is:
     *  *
     * [asynchronous](#async). Follow the `location` link in the response to determine the status of the task and use [Get task](#api-rest-api-2-task-taskId-get) to obtain subsequent updates.
     * *
     * non-transactional. Updating some entities may fail. Such information will available in the task result.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* and *Edit issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void bulkSetIssuePropertiesByIssue(Consumer<BulkSetIssuePropertiesByIssueOperationSpec> spec) {
        BulkSetIssuePropertiesByIssueOperationSpec r = new BulkSetIssuePropertiesByIssueOperationSpec(spec);
        api.bulkSetIssuePropertiesByIssue(r.multiIssueEntityProperties());
    }

    /**
     * Bulk set issue property
     * <p>
     * Sets a property value on multiple issues.
     * The value set can be a constant or determined by a [Jira expression](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/). Expressions must be computable with constant complexity when applied to a set of issues. Expressions must also comply with the [restrictions](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#restrictions) that apply to all Jira expressions.
     * The issues to be updated can be specified by a filter.
     * The filter identifies issues eligible for update using these criteria:
     *  *
     * `entityIds` Only issues from this list are eligible.
     * *
     * `currentValue` Only issues with the property set to this value are eligible.
     * *
     * `hasProperty`:
     * 
     * 
     * 
     * 
     *  *
     * If *true*, only issues with the property are eligible.
     * 
     * 
     * *
     * If *false*, only issues without the property are eligible.
     * If more than one criteria is specified, they are joined with the logical *AND*: only issues that satisfy all criteria are eligible.
     * If an invalid combination of criteria is provided, an error is returned. For example, specifying a `currentValue` and `hasProperty` as *false* would not match any issues (because without the property the property cannot have a value).
     * The filter is optional. Without the filter all the issues visible to the user and where the user has the EDIT\\_ISSUES permission for the issue are considered eligible.
     * This operation is:
     *  *
     * transactional, either all eligible issues are updated or, when errors occur, none are updated.
     * *
     * [asynchronous](#async). Follow the `location` link in the response to determine the status of the task and use [Get task](#api-rest-api-2-task-taskId-get) to obtain subsequent updates.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for each project containing issues.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * *
     * *Edit issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for each issue.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void bulkSetIssueProperty(Consumer<BulkSetIssuePropertyOperationSpec> spec) {
        BulkSetIssuePropertyOperationSpec r = new BulkSetIssuePropertyOperationSpec(spec);
        api.bulkSetIssueProperty(r.propertyKey(), r.bulkIssuePropertyUpdateRequest());
    }

    /**
     * Bulk set issues properties by list
     * <p>
     * Sets or updates a list of entity property values on issues. A list of up to 10 entity properties can be specified along with up to 10,000 issues on which to set or update that list of entity properties.
     * The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON. The maximum length of single issue property value is 32768 characters. This operation can be accessed anonymously.
     * This operation is:
     *  *
     * transactional, either all properties are updated in all eligible issues or, when errors occur, no properties are updated.
     * *
     * [asynchronous](#async). Follow the `location` link in the response to determine the status of the task and use [Get task](#api-rest-api-2-task-taskId-get) to obtain subsequent updates.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* and *Edit issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void bulkSetIssuesPropertiesList(Consumer<BulkSetIssuesPropertiesListOperationSpec> spec) {
        BulkSetIssuesPropertiesListOperationSpec r = new BulkSetIssuesPropertiesListOperationSpec(spec);
        api.bulkSetIssuesPropertiesList(r.issueEntityProperties());
    }

    /**
     * Cancel task
     * <p>
     * Cancels a task.
     * **[Permissions](#permissions) required:** either of:
     *  *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * *
     * Creator of the task.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object cancelTask(Consumer<CancelTaskOperationSpec> spec) {
        CancelTaskOperationSpec r = new CancelTaskOperationSpec(spec);
        return api.cancelTask(r.taskId());
    }

    /**
     * Change filter owner
     * <p>
     * Changes the owner of the filter.
     * **[Permissions](#permissions) required:** Permission to access Jira. However, the user must own the filter or have the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object changeFilterOwner(Consumer<ChangeFilterOwnerOperationSpec> spec) {
        ChangeFilterOwnerOperationSpec r = new ChangeFilterOwnerOperationSpec(spec);
        return api.changeFilterOwner(r.id(), r.changeFilterOwner());
    }

    /**
     * Copy dashboard
     * <p>
     * Copies a dashboard. Any values provided in the `dashboard` parameter replace those in the copied dashboard.
     * **[Permissions](#permissions) required:** None
     * The dashboard to be copied must be owned by or shared with the user.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Dashboard copyDashboard(Consumer<CopyDashboardOperationSpec> spec) {
        CopyDashboardOperationSpec r = new CopyDashboardOperationSpec(spec);
        return api.copyDashboard(r.id(), r.dashboardDetails());
    }

    /**
     * Create component
     * <p>
     * Creates a component. Use components to provide containers for issues within a project.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project in which the component is created or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ProjectComponent createComponent(Consumer<CreateComponentOperationSpec> spec) {
        CreateComponentOperationSpec r = new CreateComponentOperationSpec(spec);
        return api.createComponent(r.projectComponent());
    }

    /**
     * Create custom field
     * <p>
     * Creates a custom field.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public FieldDetails createCustomField(Consumer<CreateCustomFieldOperationSpec> spec) {
        CreateCustomFieldOperationSpec r = new CreateCustomFieldOperationSpec(spec);
        return api.createCustomField(r.customFieldDefinitionJsonBean());
    }

    /**
     * Create custom field context
     * <p>
     * Creates a custom field context.
     * If `projectIds` is empty, a global context is created. A global context is one that applies to all project. If `issueTypeIds` is empty, the context applies to all issue types.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public CreateCustomFieldContext createCustomFieldContext(Consumer<CreateCustomFieldContextOperationSpec> spec) {
        CreateCustomFieldContextOperationSpec r = new CreateCustomFieldContextOperationSpec(spec);
        return api.createCustomFieldContext(r.fieldId(), r.createCustomFieldContext());
    }

    /**
     * Create custom field options (context)
     * <p>
     * Creates options and, where the custom select field is of the type Select List (cascading), cascading options for a custom select field. The options are added to a context of the field.
     * The maximum number of options that can be created per request is 1000 and each field can have a maximum of 10000 options.
     * This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public CustomFieldCreatedContextOptionsList createCustomFieldOption(Consumer<CreateCustomFieldOptionOperationSpec> spec) {
        CreateCustomFieldOptionOperationSpec r = new CreateCustomFieldOptionOperationSpec(spec);
        return api.createCustomFieldOption(r.fieldId(), r.contextId(), r.bulkCustomFieldOptionCreateRequest());
    }

    /**
     * Create dashboard
     * <p>
     * Creates a dashboard.
     * **[Permissions](#permissions) required:** None.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Dashboard createDashboard(Consumer<CreateDashboardOperationSpec> spec) {
        CreateDashboardOperationSpec r = new CreateDashboardOperationSpec(spec);
        return api.createDashboard(r.dashboardDetails());
    }

    /**
     * Create field configuration
     * <p>
     * Creates a field configuration. The field configuration is created with the same field properties as the default configuration, with all the fields being optional.
     * This operation can only create configurations for use in company-managed (classic) projects.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public FieldConfiguration createFieldConfiguration(Consumer<CreateFieldConfigurationOperationSpec> spec) {
        CreateFieldConfigurationOperationSpec r = new CreateFieldConfigurationOperationSpec(spec);
        return api.createFieldConfiguration(r.fieldConfigurationDetails());
    }

    /**
     * Create field configuration scheme
     * <p>
     * Creates a field configuration scheme.
     * This operation can only create field configuration schemes used in company-managed (classic) projects.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public FieldConfigurationScheme createFieldConfigurationScheme(Consumer<CreateFieldConfigurationSchemeOperationSpec> spec) {
        CreateFieldConfigurationSchemeOperationSpec r = new CreateFieldConfigurationSchemeOperationSpec(spec);
        return api.createFieldConfigurationScheme(r.updateFieldConfigurationSchemeDetails());
    }

    /**
     * Create filter
     * <p>
     * Creates a filter. The filter is shared according to the [default share scope](#api-rest-api-2-filter-post). The filter is not selected as a favorite.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Filter createFilter(Consumer<CreateFilterOperationSpec> spec) {
        CreateFilterOperationSpec r = new CreateFilterOperationSpec(spec);
        return api.createFilter(r.filter(), r.expand(), r.overrideSharePermissions());
    }

    /**
     * Create group
     * <p>
     * Creates a group.
     * **[Permissions](#permissions) required:** Site administration (that is, member of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Group createGroup(Consumer<CreateGroupOperationSpec> spec) {
        CreateGroupOperationSpec r = new CreateGroupOperationSpec(spec);
        return api.createGroup(r.requestBody());
    }

    /**
     * Create issue
     * <p>
     * Creates an issue or, where the option to create subtasks is enabled in Jira, a subtask. A transition may be applied, to move the issue or subtask to a workflow step other than the default start step, and issue properties set.
     * The content of the issue or subtask is defined using `update` and `fields`. The fields that can be set in the issue or subtask are determined using the [ Get create issue metadata](#api-rest-api-2-issue-createmeta-get). These are the same fields that appear on the issue's create screen.
     * Creating a subtask differs from creating an issue as follows:
     *  *
     * `issueType` must be set to a subtask issue type (use [ Get create issue metadata](#api-rest-api-2-issue-createmeta-get) to find subtask issue types).
     * *
     * `parent` must contain the ID or key of the parent issue.
     * **[Permissions](#permissions) required:** *Browse projects* and *Create issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project in which the issue or subtask is created.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public CreatedIssue createIssue(Consumer<CreateIssueOperationSpec> spec) {
        CreateIssueOperationSpec r = new CreateIssueOperationSpec(spec);
        return api.createIssue(r.requestBody(), r.updateHistory());
    }

    /**
     * Create issue field option
     * <p>
     * Creates an option for a select list issue field.
     * Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public IssueFieldOption createIssueFieldOption(Consumer<CreateIssueFieldOptionOperationSpec> spec) {
        CreateIssueFieldOptionOperationSpec r = new CreateIssueFieldOptionOperationSpec(spec);
        return api.createIssueFieldOption(r.fieldKey(), r.requestBody());
    }

    /**
     * Create issue link type
     * <p>
     * Creates an issue link type. Use this operation to create descriptions of the reasons why issues are linked. The issue link type consists of a name and descriptions for a link's inward and outward relationships.
     * To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public IssueLinkType createIssueLinkType(Consumer<CreateIssueLinkTypeOperationSpec> spec) {
        CreateIssueLinkTypeOperationSpec r = new CreateIssueLinkTypeOperationSpec(spec);
        return api.createIssueLinkType(r.issueLinkType());
    }

    /**
     * Create issue security scheme
     * <p>
     * Creates a security scheme with security scheme levels and levels' members. You can create up to 100 security scheme levels and security scheme levels' members per request.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public SecuritySchemeId createIssueSecurityScheme(Consumer<CreateIssueSecuritySchemeOperationSpec> spec) {
        CreateIssueSecuritySchemeOperationSpec r = new CreateIssueSecuritySchemeOperationSpec(spec);
        return api.createIssueSecurityScheme(r.requestBody());
    }

    /**
     * Create issue type
     * <p>
     * Creates an issue type and adds it to the default issue type scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public IssueTypeDetails createIssueType(Consumer<CreateIssueTypeOperationSpec> spec) {
        CreateIssueTypeOperationSpec r = new CreateIssueTypeOperationSpec(spec);
        return api.createIssueType(r.issueTypeCreateBean());
    }

    /**
     * Load issue type avatar
     * <p>
     * Loads an avatar for the issue type.
     * Specify the avatar's local file location in the body of the request. Also, include the following headers:
     *  *
     * `X-Atlassian-Token: no-check` To prevent XSRF protection blocking the request, for more information see [Special Headers](#special-request-headers).
     * *
     * `Content-Type: image/image type` Valid image types are JPEG, GIF, or PNG.
     * For example:
     *  `curl --request POST \\ --user email@example.com:&amp;lt;api_token&amp;gt; \\ --header 'X-Atlassian-Token: no-check' \\ --header 'Content-Type: image/&amp;lt; image_type&amp;gt;' \\ --data-binary "&amp;lt;@/path/to/file/with/your/avatar&amp;gt;" \\ --url 'https://your-domain.atlassian.net/rest/api/2/issuetype/{issueTypeId}'This`
     * The avatar is cropped to a square. If no crop parameters are specified, the square originates at the top left of the image. The length of the square's sides is set to the smaller of the height or width of the image.
     * The cropped image is then used to create avatars of 16x16, 24x24, 32x32, and 48x48 in size.
     * After creating the avatar, use [ Update issue type](#api-rest-api-2-issuetype-id-put) to set it as the issue type's displayed avatar.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Avatar createIssueTypeAvatar(Consumer<CreateIssueTypeAvatarOperationSpec> spec) {
        CreateIssueTypeAvatarOperationSpec r = new CreateIssueTypeAvatarOperationSpec(spec);
        return api.createIssueTypeAvatar(r.id(), r.size(), r.body(), r.x(), r.y());
    }

    /**
     * Create issue type scheme
     * <p>
     * Creates an issue type scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public IssueTypeSchemeID createIssueTypeScheme(Consumer<CreateIssueTypeSchemeOperationSpec> spec) {
        CreateIssueTypeSchemeOperationSpec r = new CreateIssueTypeSchemeOperationSpec(spec);
        return api.createIssueTypeScheme(r.issueTypeSchemeDetails());
    }

    /**
     * Create issue type screen scheme
     * <p>
     * Creates an issue type screen scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public IssueTypeScreenSchemeId createIssueTypeScreenScheme(Consumer<CreateIssueTypeScreenSchemeOperationSpec> spec) {
        CreateIssueTypeScreenSchemeOperationSpec r = new CreateIssueTypeScreenSchemeOperationSpec(spec);
        return api.createIssueTypeScreenScheme(r.issueTypeScreenSchemeDetails());
    }

    /**
     * Bulk create issue
     * <p>
     * Creates upto **50** issues and, where the option to create subtasks is enabled in Jira, subtasks. Transitions may be applied, to move the issues or subtasks to a workflow step other than the default start step, and issue properties set.
     * The content of each issue or subtask is defined using `update` and `fields`. The fields that can be set in the issue or subtask are determined using the [ Get create issue metadata](#api-rest-api-2-issue-createmeta-get). These are the same fields that appear on the issues' create screens.
     * Creating a subtask differs from creating an issue as follows:
     *  *
     * `issueType` must be set to a subtask issue type (use [ Get create issue metadata](#api-rest-api-2-issue-createmeta-get) to find subtask issue types).
     * *
     * `parent` the must contain the ID or key of the parent issue.
     * **[Permissions](#permissions) required:** *Browse projects* and *Create issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project in which each issue or subtask is created.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public CreatedIssues createIssues(Consumer<CreateIssuesOperationSpec> spec) {
        CreateIssuesOperationSpec r = new CreateIssuesOperationSpec(spec);
        return api.createIssues(r.requestBody());
    }

    /**
     * Create notification scheme
     * <p>
     * Creates a notification scheme with notifications. You can create up to 1000 notifications per request.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public NotificationSchemeId createNotificationScheme(Consumer<CreateNotificationSchemeOperationSpec> spec) {
        CreateNotificationSchemeOperationSpec r = new CreateNotificationSchemeOperationSpec(spec);
        return api.createNotificationScheme(r.requestBody());
    }

    /**
     * Create or update remote issue link
     * <p>
     * Creates or updates a remote issue link for an issue.
     * If a `globalId` is provided and a remote issue link with that global ID is found it is updated. Any fields without values in the request are set to null. Otherwise, the remote issue link is created.
     * This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public RemoteIssueLinkIdentifies createOrUpdateRemoteIssueLink(Consumer<CreateOrUpdateRemoteIssueLinkOperationSpec> spec) {
        CreateOrUpdateRemoteIssueLinkOperationSpec r = new CreateOrUpdateRemoteIssueLinkOperationSpec(spec);
        return api.createOrUpdateRemoteIssueLink(r.issueIdOrKey(), r.requestBody());
    }

    /**
     * Create permission grant
     * <p>
     * Creates a permission grant in a permission scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PermissionGrant createPermissionGrant(Consumer<CreatePermissionGrantOperationSpec> spec) {
        CreatePermissionGrantOperationSpec r = new CreatePermissionGrantOperationSpec(spec);
        return api.createPermissionGrant(r.schemeId(), r.permissionGrant(), r.expand());
    }

    /**
     * Create permission scheme
     * <p>
     * Creates a new permission scheme. You can create a permission scheme with or without defining a set of permission grants.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PermissionScheme createPermissionScheme(Consumer<CreatePermissionSchemeOperationSpec> spec) {
        CreatePermissionSchemeOperationSpec r = new CreatePermissionSchemeOperationSpec(spec);
        return api.createPermissionScheme(r.requestBody(), r.expand());
    }

    /**
     * Create priority
     * <p>
     * Creates an issue priority.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PriorityId createPriority(Consumer<CreatePriorityOperationSpec> spec) {
        CreatePriorityOperationSpec r = new CreatePriorityOperationSpec(spec);
        return api.createPriority(r.requestBody());
    }

    /**
     * Create project
     * <p>
     * Creates a project based on a project type template, as shown in the following table:
     * | Project Type Key | Project Template Key |
     *  |--|--|
     *  | `business` | `com.atlassian.jira-core-project-templates:jira-core-simplified-content-management`, `com.atlassian.jira-core-project-templates:jira-core-simplified-document-approval`, `com.atlassian.jira-core-project-templates:jira-core-simplified-lead-tracking`, `com.atlassian.jira-core-project-templates:jira-core-simplified-process-control`, `com.atlassian.jira-core-project-templates:jira-core-simplified-procurement`, `com.atlassian.jira-core-project-templates:jira-core-simplified-project-management`, `com.atlassian.jira-core-project-templates:jira-core-simplified-recruitment`, `com.atlassian.jira-core-project-templates:jira-core-simplified-task-tracking` |
     *  | `service_desk` | `com.atlassian.servicedesk:simplified-it-service-management`, `com.atlassian.servicedesk:simplified-general-service-desk-it`, `com.atlassian.servicedesk:simplified-general-service-desk-business`, `com.atlassian.servicedesk:simplified-external-service-desk`, `com.atlassian.servicedesk:simplified-hr-service-desk`, `com.atlassian.servicedesk:simplified-facilities-service-desk`, `com.atlassian.servicedesk:simplified-legal-service-desk`, `com.atlassian.servicedesk:simplified-analytics-service-desk`, `com.atlassian.servicedesk:simplified-marketing-service-desk`, `com.atlassian.servicedesk:simplified-design-service-desk`, `com.atlassian.servicedesk:simplified-sales-service-desk`, `com.atlassian.servicedesk:simplified-finance-service-desk` |
     *  | `software` | `com.pyxis.greenhopper.jira:gh-simplified-agility-kanban`, `com.pyxis.greenhopper.jira:gh-simplified-agility-scrum`, `com.pyxis.greenhopper.jira:gh-simplified-basic`, `com.pyxis.greenhopper.jira:gh-simplified-kanban-classic`, `com.pyxis.greenhopper.jira:gh-simplified-scrum-classic` |
     *  The project types are available according to the installed Jira features as follows:
     *  *
     * Jira Core, the default, enables `business` projects.
     * *
     * Jira Service Management enables `service_desk` projects.
     * *
     * Jira Software enables `software` projects.
     * To determine which features are installed, go to **Jira settings** &amp;gt; **Apps** &amp;gt; **Manage apps** and review the System Apps list. To add Jira Software or Jira Service Management into a JIRA instance, use **Jira settings** &amp;gt; **Apps** &amp;gt; **Finding new apps**. For more information, see [ Managing add-ons](https://confluence.atlassian.com/x/S31NLg).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ProjectIdentifiers createProject(Consumer<CreateProjectOperationSpec> spec) {
        CreateProjectOperationSpec r = new CreateProjectOperationSpec(spec);
        return api.createProject(r.createProjectDetails());
    }

    /**
     * Load project avatar
     * <p>
     * Loads an avatar for a project.
     * Specify the avatar's local file location in the body of the request. Also, include the following headers:
     *  *
     * `X-Atlassian-Token: no-check` To prevent XSRF protection blocking the request, for more information see [Special Headers](#special-request-headers).
     * *
     * `Content-Type: image/image type` Valid image types are JPEG, GIF, or PNG.
     * For example:
     *  `curl --request POST `
     * `--user email@example.com:&amp;lt;api_token&amp;gt; `
     * `--header 'X-Atlassian-Token: no-check' `
     * `--header 'Content-Type: image/&amp;lt; image_type&amp;gt;' `
     * `--data-binary "&amp;lt;@/path/to/file/with/your/avatar&amp;gt;" `
     * `--url 'https://your-domain.atlassian.net/rest/api/2/project/{projectIdOrKey}/avatar2'`
     * The avatar is cropped to a square. If no crop parameters are specified, the square originates at the top left of the image. The length of the square's sides is set to the smaller of the height or width of the image.
     * The cropped image is then used to create avatars of 16x16, 24x24, 32x32, and 48x48 in size.
     * After creating the avatar use [Set project avatar](#api-rest-api-2-project-projectIdOrKey-avatar-put) to set it as the project's displayed avatar.
     * **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Avatar createProjectAvatar(Consumer<CreateProjectAvatarOperationSpec> spec) {
        CreateProjectAvatarOperationSpec r = new CreateProjectAvatarOperationSpec(spec);
        return api.createProjectAvatar(r.projectIdOrKey(), r.body(), r.x(), r.y(), r.size());
    }

    /**
     * Create project category
     * <p>
     * Creates a project category.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ProjectCategory createProjectCategory(Consumer<CreateProjectCategoryOperationSpec> spec) {
        CreateProjectCategoryOperationSpec r = new CreateProjectCategoryOperationSpec(spec);
        return api.createProjectCategory(r.projectCategory());
    }

    /**
     * Create project role
     * <p>
     * Creates a new project role with no [default actors](#api-rest-api-2-resolution-get). You can use the [Add default actors to project role](#api-rest-api-2-role-id-actors-post) operation to add default actors to the project role after creating it.
     * *Note that although a new project role is available to all projects upon creation, any default actors that are associated with the project role are not added to projects that existed prior to the role being created.*&amp;lt;
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ProjectRole createProjectRole(Consumer<CreateProjectRoleOperationSpec> spec) {
        CreateProjectRoleOperationSpec r = new CreateProjectRoleOperationSpec(spec);
        return api.createProjectRole(r.createUpdateRoleRequestBean());
    }

    /**
     * Create resolution
     * <p>
     * Creates an issue resolution.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ResolutionId createResolution(Consumer<CreateResolutionOperationSpec> spec) {
        CreateResolutionOperationSpec r = new CreateResolutionOperationSpec(spec);
        return api.createResolution(r.requestBody());
    }

    /**
     * Create screen
     * <p>
     * Creates a screen with a default field tab.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Screen createScreen(Consumer<CreateScreenOperationSpec> spec) {
        CreateScreenOperationSpec r = new CreateScreenOperationSpec(spec);
        return api.createScreen(r.screenDetails());
    }

    /**
     * Create screen scheme
     * <p>
     * Creates a screen scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ScreenSchemeId createScreenScheme(Consumer<CreateScreenSchemeOperationSpec> spec) {
        CreateScreenSchemeOperationSpec r = new CreateScreenSchemeOperationSpec(spec);
        return api.createScreenScheme(r.screenSchemeDetails());
    }

    /**
     * Bulk create statuses
     * <p>
     * Creates statuses for a global or project scope.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)
     * *
     * *Administer Jira* [project permission.](https://confluence.atlassian.com/x/yodKLg)
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<JiraStatus> createStatuses(Consumer<CreateStatusesOperationSpec> spec) {
        CreateStatusesOperationSpec r = new CreateStatusesOperationSpec(spec);
        return api.createStatuses(r.statusCreateRequest());
    }

    /**
     * Create UI modification
     * <p>
     * Creates a UI modification. UI modification can only be created by Forge apps.
     * Each app can define up to 100 UI modifications. Each UI modification can define up to 1000 contexts.
     * **[Permissions](#permissions) required:**
     *  *
     * *None* if the UI modification is created without contexts.
     * *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for one or more projects, if the UI modification is created with contexts.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public UiModificationIdentifiers createUiModification(Consumer<CreateUiModificationOperationSpec> spec) {
        CreateUiModificationOperationSpec r = new CreateUiModificationOperationSpec(spec);
        return api.createUiModification(r.createUiModificationDetails());
    }

    /**
     * Create user
     * <p>
     * Creates a user. This resource is retained for legacy compatibility. As soon as a more suitable alternative is available this resource will be deprecated.
     * If the user exists and has access to Jira, the operation returns a 201 status. If the user exists but does not have access to Jira, the operation returns a 400 status.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public User createUser(Consumer<CreateUserOperationSpec> spec) {
        CreateUserOperationSpec r = new CreateUserOperationSpec(spec);
        return api.createUser(r.requestBody());
    }

    /**
     * Create version
     * <p>
     * Creates a project version.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project the version is added to.
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Version createVersion(Consumer<CreateVersionOperationSpec> spec) {
        CreateVersionOperationSpec r = new CreateVersionOperationSpec(spec);
        return api.createVersion(r.version());
    }

    /**
     * Create workflow
     * <p>
     * Creates a workflow. You can define transition rules using the shapes detailed in the following sections. If no transitional rules are specified the default system transition rules are used. Note: This only applies to company-managed scoped workflows. Use [bulk create workflows](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-workflows/#api-rest-api-3-workflows-create-post) to create both team and company-managed scoped workflows.
     * #### Conditions ####
     * Conditions enable workflow rules that govern whether a transition can execute.
     * ##### Always false condition #####
     * A condition that always fails.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "AlwaysFalseCondition"
     * 
     * 
     * }
     * ##### Block transition until approval #####
     * A condition that blocks issue transition if there is a pending approval.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "BlockInProgressApprovalCondition"
     * 
     * 
     * }
     * ##### Compare number custom field condition #####
     * A condition that allows transition if a comparison between a number custom field and a value is true.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "CompareNumberCFCondition",
     * 
     * 
     * 
     * "configuration": {
     * 
     * 
     * 
     * 
     * "comparator": "=",
     * 
     * 
     * 
     * 
     * "fieldId": "customfield_10029",
     * 
     * 
     * 
     * 
     * "fieldValue": 2
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     *  *
     * `comparator` One of the supported comparator: `=`, `&amp;gt;`, and `&amp;lt;`.
     * *
     * `fieldId` The custom numeric field ID. Allowed field types:
     * 
     * 
     * 
     * 
     *  *
     * `com.atlassian.jira.plugin.system.customfieldtypes:float`
     * 
     * 
     * *
     * `com.pyxis.greenhopper.jira:jsw-story-points`
     * *
     * `fieldValue` The value for comparison.
     * ##### Hide from user condition #####
     * A condition that hides a transition from users. The transition can only be triggered from a workflow function or REST API operation.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "RemoteOnlyCondition"
     * 
     * 
     * }
     * ##### Only assignee condition #####
     * A condition that allows only the assignee to execute a transition.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "AllowOnlyAssignee"
     * 
     * 
     * }
     * ##### Only Bamboo notifications workflow condition #####
     * A condition that makes the transition available only to Bamboo build notifications.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "OnlyBambooNotificationsCondition"
     * 
     * 
     * }
     * ##### Only reporter condition #####
     * A condition that allows only the reporter to execute a transition.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "AllowOnlyReporter"
     * 
     * 
     * }
     * ##### Permission condition #####
     * A condition that allows only users with a permission to execute a transition.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "PermissionCondition",
     * 
     * 
     * 
     * "configuration": {
     * 
     * 
     * 
     * 
     * 
     * "permissionKey": "BROWSE_PROJECTS"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     *  *
     * `permissionKey` The permission required to perform the transition. Allowed values: [built-in](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-permission-schemes/#built-in-permissions) or app defined permissions.
     * ##### Previous status condition #####
     * A condition that allows a transition based on whether an issue has or has not transitioned through a status.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "PreviousStatusCondition",
     * 
     * 
     * 
     * "configuration": {
     * 
     * 
     * 
     * 
     * "ignoreLoopTransitions": true,
     * 
     * 
     * 
     * 
     * "includeCurrentStatus": true,
     * 
     * 
     * 
     * 
     * "mostRecentStatusOnly": true,
     * 
     * 
     * 
     * 
     * "reverseCondition": true,
     * 
     * 
     * 
     * 
     * "previousStatus": {
     * 
     * 
     * 
     * 
     * 
     * "id": "5"
     * 
     * 
     * 
     * 
     * }
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     * By default this condition allows the transition if the status, as defined by its ID in the `previousStatus` object, matches any previous issue status, unless:
     *  *
     * `ignoreLoopTransitions` is `true`, then loop transitions (from and to the same status) are ignored.
     * *
     * `includeCurrentStatus` is `true`, then the current issue status is also checked.
     * *
     * `mostRecentStatusOnly` is `true`, then only the issue's preceding status (the one immediately before the current status) is checked.
     * *
     * `reverseCondition` is `true`, then the status must not be present.
     * ##### Separation of duties condition #####
     * A condition that prevents a user to perform the transition, if the user has already performed a transition on the issue.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "SeparationOfDutiesCondition",
     * 
     * 
     * 
     * "configuration": {
     * 
     * 
     * 
     * 
     * "fromStatus": {
     * 
     * 
     * 
     * 
     * 
     * "id": "5"
     * 
     * 
     * 
     * 
     * },
     * 
     * 
     * 
     * 
     * "toStatus": {
     * 
     * 
     * 
     * 
     * 
     * "id": "6"
     * 
     * 
     * 
     * 
     * }
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     *  *
     * `fromStatus` OPTIONAL. An object containing the ID of the source status of the transition that is blocked. If omitted any transition to `toStatus` is blocked.
     * *
     * `toStatus` An object containing the ID of the target status of the transition that is blocked.
     * ##### Subtask blocking condition #####
     * A condition that blocks transition on a parent issue if any of its subtasks are in any of one or more statuses.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "SubTaskBlockingCondition",
     * 
     * 
     * 
     * "configuration": {
     * 
     * 
     * 
     * 
     * "statuses": [
     * 
     * 
     * 
     * 
     * 
     * {
     * 
     * 
     * 
     * 
     * 
     * 
     * "id": "1"
     * 
     * 
     * 
     * 
     * 
     * },
     * 
     * 
     * 
     * 
     * 
     * {
     * 
     * 
     * 
     * 
     * 
     * 
     * "id": "3"
     * 
     * 
     * 
     * 
     * 
     * }
     * 
     * 
     * 
     * 
     * ]
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     *  *
     * `statuses` A list of objects containing status IDs.
     * ##### User is in any group condition #####
     * A condition that allows users belonging to any group from a list of groups to execute a transition.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "UserInAnyGroupCondition",
     * 
     * 
     * 
     * "configuration": {
     * 
     * 
     * 
     * 
     * "groups": [
     * 
     * 
     * 
     * 
     * 
     * "administrators",
     * 
     * 
     * 
     * 
     * 
     * "atlassian-addons-admin"
     * 
     * 
     * 
     * 
     * ]
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     *  *
     * `groups` A list of group names.
     * ##### User is in any project role condition #####
     * A condition that allows only users with at least one project roles from a list of project roles to execute a transition.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "InAnyProjectRoleCondition",
     * 
     * 
     * 
     * "configuration": {
     * 
     * 
     * 
     * 
     * "projectRoles": [
     * 
     * 
     * 
     * 
     * 
     * {
     * 
     * 
     * 
     * 
     * 
     * 
     * "id": "10002"
     * 
     * 
     * 
     * 
     * 
     * },
     * 
     * 
     * 
     * 
     * 
     * {
     * 
     * 
     * 
     * 
     * 
     * 
     * "id": "10003"
     * 
     * 
     * 
     * 
     * 
     * },
     * 
     * 
     * 
     * 
     * 
     * {
     * 
     * 
     * 
     * 
     * 
     * 
     * "id": "10012"
     * 
     * 
     * 
     * 
     * 
     * },
     * 
     * 
     * 
     * 
     * 
     * {
     * 
     * 
     * 
     * 
     * 
     * 
     * "id": "10013"
     * 
     * 
     * 
     * 
     * 
     * }
     * 
     * 
     * 
     * 
     * ]
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     *  *
     * `projectRoles` A list of objects containing project role IDs.
     * ##### User is in custom field condition #####
     * A condition that allows only users listed in a given custom field to execute the transition.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "UserIsInCustomFieldCondition",
     * 
     * 
     * 
     * "configuration": {
     * 
     * 
     * 
     * 
     * "allowUserInField": false,
     * 
     * 
     * 
     * 
     * "fieldId": "customfield_10010"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     *  *
     * `allowUserInField` If `true` only a user who is listed in `fieldId` can perform the transition, otherwise, only a user who is not listed in `fieldId` can perform the transition.
     * *
     * `fieldId` The ID of the field containing the list of users.
     * ##### User is in group condition #####
     * A condition that allows users belonging to a group to execute a transition.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "UserInGroupCondition",
     * 
     * 
     * 
     * "configuration": {
     * 
     * 
     * 
     * 
     * "group": "administrators"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     *  *
     * `group` The name of the group.
     * ##### User is in group custom field condition #####
     * A condition that allows users belonging to a group specified in a custom field to execute a transition.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "InGroupCFCondition",
     * 
     * 
     * 
     * "configuration": {
     * 
     * 
     * 
     * 
     * "fieldId": "customfield_10012"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     *  *
     * `fieldId` The ID of the field. Allowed field types:
     * 
     * 
     * 
     * 
     *  *
     * `com.atlassian.jira.plugin.system.customfieldtypes:multigrouppicker`
     * 
     * 
     * *
     * `com.atlassian.jira.plugin.system.customfieldtypes:grouppicker`
     * 
     * 
     * *
     * `com.atlassian.jira.plugin.system.customfieldtypes:select`
     * 
     * 
     * *
     * `com.atlassian.jira.plugin.system.customfieldtypes:multiselect`
     * 
     * 
     * *
     * `com.atlassian.jira.plugin.system.customfieldtypes:radiobuttons`
     * 
     * 
     * *
     * `com.atlassian.jira.plugin.system.customfieldtypes:multicheckboxes`
     * 
     * 
     * *
     * `com.pyxis.greenhopper.jira:gh-epic-status`
     * ##### User is in project role condition #####
     * A condition that allows users with a project role to execute a transition.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "InProjectRoleCondition",
     * 
     * 
     * 
     * "configuration": {
     * 
     * 
     * 
     * 
     * "projectRole": {
     * 
     * 
     * 
     * 
     * 
     * "id": "10002"
     * 
     * 
     * 
     * 
     * }
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     *  *
     * `projectRole` An object containing the ID of a project role.
     * ##### Value field condition #####
     * A conditions that allows a transition to execute if the value of a field is equal to a constant value or simply set.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "ValueFieldCondition",
     * 
     * 
     * 
     * "configuration": {
     * 
     * 
     * 
     * 
     * "fieldId": "assignee",
     * 
     * 
     * 
     * 
     * "fieldValue": "qm:6e1ecee6-8e64-4db6-8c85-916bb3275f51:54b56885-2bd2-4381-8239-78263442520f",
     * 
     * 
     * 
     * 
     * "comparisonType": "NUMBER",
     * 
     * 
     * 
     * 
     * "comparator": "="
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     *  *
     * `fieldId` The ID of a field used in the comparison.
     * *
     * `fieldValue` The expected value of the field.
     * *
     * `comparisonType` The type of the comparison. Allowed values: `STRING`, `NUMBER`, `DATE`, `DATE_WITHOUT_TIME`, or `OPTIONID`.
     * *
     * `comparator` One of the supported comparator: `&amp;gt;`, `&amp;gt;=`, `=`, `&amp;lt;=`, `&amp;lt;`, `!=`.
     * **Notes:**
     *  *
     * If you choose the comparison type `STRING`, only `=` and `!=` are valid options.
     * *
     * You may leave `fieldValue` empty when comparison type is `!=` to indicate that a value is required in the field.
     * *
     * For date fields without time format values as `yyyy-MM-dd`, and for those with time as `yyyy-MM-dd HH:mm`. For example, for July 16 2021 use `2021-07-16`, for 8:05 AM use `2021-07-16 08:05`, and for 4 PM: `2021-07-16 16:00`.
     * #### Validators ####
     * Validators check that any input made to the transition is valid before the transition is performed.
     * ##### Date field validator #####
     * A validator that compares two dates.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "DateFieldValidator",
     * 
     * 
     * 
     * "configuration": {
     * 
     * 
     * 
     * 
     * 
     * "comparator": "&amp;gt;",
     * 
     * 
     * 
     * 
     * 
     * "date1": "updated",
     * 
     * 
     * 
     * 
     * 
     * "date2": "created",
     * 
     * 
     * 
     * 
     * 
     * "expression": "1d",
     * 
     * 
     * 
     * 
     * 
     * "includeTime": true
     * 
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     *  *
     * `comparator` One of the supported comparator: `&amp;gt;`, `&amp;gt;=`, `=`, `&amp;lt;=`, `&amp;lt;`, or `!=`.
     * *
     * `date1` The date field to validate. Allowed field types:
     * 
     * 
     * 
     * 
     *  *
     * `com.atlassian.jira.plugin.system.customfieldtypes:datepicker`
     * 
     * 
     * *
     * `com.atlassian.jira.plugin.system.customfieldtypes:datetime`
     * 
     * 
     * *
     * `com.atlassian.jpo:jpo-custom-field-baseline-end`
     * 
     * 
     * *
     * `com.atlassian.jpo:jpo-custom-field-baseline-start`
     * 
     * 
     * *
     * `duedate`
     * 
     * 
     * *
     * `created`
     * 
     * 
     * *
     * `updated`
     * 
     * 
     * *
     * `resolutiondate`
     * *
     * `date2` The second date field. Required, if `expression` is not passed. Allowed field types:
     * 
     * 
     * 
     * 
     *  *
     * `com.atlassian.jira.plugin.system.customfieldtypes:datepicker`
     * 
     * 
     * *
     * `com.atlassian.jira.plugin.system.customfieldtypes:datetime`
     * 
     * 
     * *
     * `com.atlassian.jpo:jpo-custom-field-baseline-end`
     * 
     * 
     * *
     * `com.atlassian.jpo:jpo-custom-field-baseline-start`
     * 
     * 
     * *
     * `duedate`
     * 
     * 
     * *
     * `created`
     * 
     * 
     * *
     * `updated`
     * 
     * 
     * *
     * `resolutiondate`
     * *
     * `expression` An expression specifying an offset. Required, if `date2` is not passed. Offsets are built with a number, with `-` as prefix for the past, and one of these time units: `d` for day, `w` for week, `m` for month, or `y` for year. For example, -2d means two days into the past and 1w means one week into the future. The `now` keyword enables a comparison with the current date.
     * *
     * `includeTime` If `true`, then the time part of the data is included for the comparison. If the field doesn't have a time part, 00:00:00 is used.
     * ##### Windows date validator #####
     * A validator that checks that a date falls on or after a reference date and before or on the reference date plus a number of days.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "WindowsDateValidator",
     * 
     * 
     * 
     * "configuration": {
     * 
     * 
     * 
     * 
     * 
     * "date1": "customfield_10009",
     * 
     * 
     * 
     * 
     * 
     * "date2": "created",
     * 
     * 
     * 
     * 
     * 
     * "windowsDays": 5
     * 
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     *  *
     * `date1` The date field to validate. Allowed field types:
     * 
     * 
     * 
     * 
     *  *
     * `com.atlassian.jira.plugin.system.customfieldtypes:datepicker`
     * 
     * 
     * *
     * `com.atlassian.jira.plugin.system.customfieldtypes:datetime`
     * 
     * 
     * *
     * `com.atlassian.jpo:jpo-custom-field-baseline-end`
     * 
     * 
     * *
     * `com.atlassian.jpo:jpo-custom-field-baseline-start`
     * 
     * 
     * *
     * `duedate`
     * 
     * 
     * *
     * `created`
     * 
     * 
     * *
     * `updated`
     * 
     * 
     * *
     * `resolutiondate`
     * *
     * `date2` The reference date. Allowed field types:
     * 
     * 
     * 
     * 
     *  *
     * `com.atlassian.jira.plugin.system.customfieldtypes:datepicker`
     * 
     * 
     * *
     * `com.atlassian.jira.plugin.system.customfieldtypes:datetime`
     * 
     * 
     * *
     * `com.atlassian.jpo:jpo-custom-field-baseline-end`
     * 
     * 
     * *
     * `com.atlassian.jpo:jpo-custom-field-baseline-start`
     * 
     * 
     * *
     * `duedate`
     * 
     * 
     * *
     * `created`
     * 
     * 
     * *
     * `updated`
     * 
     * 
     * *
     * `resolutiondate`
     * *
     * `windowsDays` A positive integer indicating a number of days.
     * ##### Field required validator #####
     * A validator that checks fields are not empty. By default, if a field is not included in the current context it's ignored and not validated.
     * 
     * 
     * {
     * 
     * 
     * 
     * 
     * "type": "FieldRequiredValidator",
     * 
     * 
     * 
     * 
     * "configuration": {
     * 
     * 
     * 
     * 
     * 
     * 
     * "ignoreContext": true,
     * 
     * 
     * 
     * 
     * 
     * 
     * "errorMessage": "Hey",
     * 
     * 
     * 
     * 
     * 
     * 
     * "fieldIds": [
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * "versions",
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * "customfield_10037",
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * "customfield_10003"
     * 
     * 
     * 
     * 
     * 
     * 
     * ]
     * 
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     *  *
     * `ignoreContext` If `true`, then the context is ignored and all the fields are validated.
     * *
     * `errorMessage` OPTIONAL. The error message displayed when one or more fields are empty. A default error message is shown if an error message is not provided.
     * *
     * `fieldIds` The list of fields to validate.
     * ##### Field changed validator #####
     * A validator that checks that a field value is changed. However, this validation can be ignored for users from a list of groups.
     * 
     * 
     * {
     * 
     * 
     * 
     * 
     * "type": "FieldChangedValidator",
     * 
     * 
     * 
     * 
     * "configuration": {
     * 
     * 
     * 
     * 
     * 
     * 
     * "fieldId": "comment",
     * 
     * 
     * 
     * 
     * 
     * 
     * "errorMessage": "Hey",
     * 
     * 
     * 
     * 
     * 
     * 
     * "exemptedGroups": [
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * "administrators",
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * "atlassian-addons-admin"
     * 
     * 
     * 
     * 
     * 
     * 
     * ]
     * 
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     *  *
     * `fieldId` The ID of a field.
     * *
     * `errorMessage` OPTIONAL. The error message displayed if the field is not changed. A default error message is shown if the error message is not provided.
     * *
     * `exemptedGroups` OPTIONAL. The list of groups.
     * ##### Field has single value validator #####
     * A validator that checks that a multi-select field has only one value. Optionally, the validation can ignore values copied from subtasks.
     * 
     * 
     * {
     * 
     * 
     * 
     * 
     * "type": "FieldHasSingleValueValidator",
     * 
     * 
     * 
     * 
     * "configuration": {
     * 
     * 
     * 
     * 
     * 
     * 
     * "fieldId": "attachment,
     * 
     * 
     * 
     * 
     * 
     * 
     * "excludeSubtasks": true
     * 
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     *  *
     * `fieldId` The ID of a field.
     * *
     * `excludeSubtasks` If `true`, then values copied from subtasks are ignored.
     * ##### Parent status validator #####
     * A validator that checks the status of the parent issue of a subtask. Ìf the issue is not a subtask, no validation is performed.
     * 
     * 
     * {
     * 
     * 
     * 
     * 
     * "type": "ParentStatusValidator",
     * 
     * 
     * 
     * 
     * "configuration": {
     * 
     * 
     * 
     * 
     * 
     * 
     * "parentStatuses": [
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * {
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * "id":"1"
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * },
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * {
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * "id":"2"
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * }
     * 
     * 
     * 
     * 
     * 
     * 
     * ]
     * 
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     *  *
     * `parentStatus` The list of required parent issue statuses.
     * ##### Permission validator #####
     * A validator that checks the user has a permission.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "PermissionValidator",
     * 
     * 
     * 
     * "configuration": {
     * 
     * 
     * 
     * 
     * 
     * "permissionKey": "ADMINISTER_PROJECTS"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     *  *
     * `permissionKey` The permission required to perform the transition. Allowed values: [built-in](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-permission-schemes/#built-in-permissions) or app defined permissions.
     * ##### Previous status validator #####
     * A validator that checks if the issue has held a status.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "PreviousStatusValidator",
     * 
     * 
     * 
     * "configuration": {
     * 
     * 
     * 
     * 
     * 
     * "mostRecentStatusOnly": false,
     * 
     * 
     * 
     * 
     * 
     * "previousStatus": {
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * "id": "15"
     * 
     * 
     * 
     * 
     * 
     * }
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     *  *
     * `mostRecentStatusOnly` If `true`, then only the issue's preceding status (the one immediately before the current status) is checked.
     * *
     * `previousStatus` An object containing the ID of an issue status.
     * ##### Regular expression validator #####
     * A validator that checks the content of a field against a regular expression.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "RegexpFieldValidator",
     * 
     * 
     * 
     * "configuration": {
     * 
     * 
     * 
     * 
     * 
     * "regExp": "[0-9]",
     * 
     * 
     * 
     * 
     * 
     * "fieldId": "customfield_10029"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     *  *
     * `regExp`A regular expression.
     * *
     * `fieldId` The ID of a field. Allowed field types:
     * 
     * 
     * 
     * 
     *  *
     * `com.atlassian.jira.plugin.system.customfieldtypes:select`
     * 
     * 
     * *
     * `com.atlassian.jira.plugin.system.customfieldtypes:multiselect`
     * 
     * 
     * *
     * `com.atlassian.jira.plugin.system.customfieldtypes:radiobuttons`
     * 
     * 
     * *
     * `com.atlassian.jira.plugin.system.customfieldtypes:multicheckboxes`
     * 
     * 
     * *
     * `com.atlassian.jira.plugin.system.customfieldtypes:textarea`
     * 
     * 
     * *
     * `com.atlassian.jira.plugin.system.customfieldtypes:textfield`
     * 
     * 
     * *
     * `com.atlassian.jira.plugin.system.customfieldtypes:url`
     * 
     * 
     * *
     * `com.atlassian.jira.plugin.system.customfieldtypes:float`
     * 
     * 
     * *
     * `com.pyxis.greenhopper.jira:jsw-story-points`
     * 
     * 
     * *
     * `com.pyxis.greenhopper.jira:gh-epic-status`
     * 
     * 
     * *
     * `description`
     * 
     * 
     * *
     * `summary`
     * ##### User permission validator #####
     * A validator that checks if a user has a permission. Obsolete. You may encounter this validator when getting transition rules and can pass it when updating or creating rules, for example, when you want to duplicate the rules from a workflow on a new workflow.
     * 
     * 
     * {
     * 
     * 
     * 
     * 
     * "type": "UserPermissionValidator",
     * 
     * 
     * 
     * 
     * "configuration": {
     * 
     * 
     * 
     * 
     * 
     * 
     * "permissionKey": "BROWSE_PROJECTS",
     * 
     * 
     * 
     * 
     * 
     * 
     * "nullAllowed": false,
     * 
     * 
     * 
     * 
     * 
     * 
     * "username": "TestUser"
     * 
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     *  *
     * `permissionKey` The permission to be validated. Allowed values: [built-in](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-permission-schemes/#built-in-permissions) or app defined permissions.
     * *
     * `nullAllowed` If `true`, allows the transition when `username` is empty.
     * *
     * `username` The username to validate against the `permissionKey`.
     * #### Post functions ####
     * Post functions carry out any additional processing required after a Jira workflow transition is executed.
     * ##### Fire issue event function #####
     * A post function that fires an event that is processed by the listeners.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "FireIssueEventFunction",
     * 
     * 
     * 
     * "configuration": {
     * 
     * 
     * 
     * 
     * "event": {
     * 
     * 
     * 
     * 
     * 
     * "id":"1"
     * 
     * 
     * 
     * 
     * }
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     * **Note:** If provided, this post function overrides the default `FireIssueEventFunction`. Can be included once in a transition.
     *  *
     * `event` An object containing the ID of the issue event.
     * ##### Update issue status #####
     * A post function that sets issue status to the linked status of the destination workflow status.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "UpdateIssueStatusFunction"
     * 
     * 
     * }
     * **Note:** This post function is a default function in global and directed transitions. It can only be added to the initial transition and can only be added once.
     * ##### Create comment #####
     * A post function that adds a comment entered during the transition to an issue.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "CreateCommentFunction"
     * 
     * 
     * }
     * **Note:** This post function is a default function in global and directed transitions. It can only be added to the initial transition and can only be added once.
     * ##### Store issue #####
     * A post function that stores updates to an issue.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "IssueStoreFunction"
     * 
     * 
     * }
     * **Note:** This post function can only be added to the initial transition and can only be added once.
     * ##### Assign to current user function #####
     * A post function that assigns the issue to the current user if the current user has the `ASSIGNABLE_USER` permission.
     * 
     * 
     * {
     * 
     * 
     * 
     * 
     * "type": "AssignToCurrentUserFunction"
     * 
     * 
     * }
     * **Note:** This post function can be included once in a transition.
     * ##### Assign to lead function #####
     * A post function that assigns the issue to the project or component lead developer.
     * 
     * 
     * {
     * 
     * 
     * 
     * 
     * "type": "AssignToLeadFunction"
     * 
     * 
     * }
     * **Note:** This post function can be included once in a transition.
     * ##### Assign to reporter function #####
     * A post function that assigns the issue to the reporter.
     * 
     * 
     * {
     * 
     * 
     * 
     * 
     * "type": "AssignToReporterFunction"
     * 
     * 
     * }
     * **Note:** This post function can be included once in a transition.
     * ##### Clear field value function #####
     * A post function that clears the value from a field.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "ClearFieldValuePostFunction",
     * 
     * 
     * 
     * "configuration": {
     * 
     * 
     * 
     * 
     * "fieldId": "assignee"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     *  *
     * `fieldId` The ID of the field.
     * ##### Copy value from other field function #####
     * A post function that copies the value of one field to another, either within an issue or from parent to subtask.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "CopyValueFromOtherFieldPostFunction",
     * 
     * 
     * 
     * "configuration": {
     * 
     * 
     * 
     * 
     * "sourceFieldId": "assignee",
     * 
     * 
     * 
     * 
     * "destinationFieldId": "creator",
     * 
     * 
     * 
     * 
     * "copyType": "same"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     *  *
     * `sourceFieldId` The ID of the source field.
     * *
     * `destinationFieldId` The ID of the destination field.
     * *
     * `copyType` Use `same` to copy the value from a field inside the issue, or `parent` to copy the value from the parent issue.
     * ##### Create Crucible review workflow function #####
     * A post function that creates a Crucible review for all unreviewed code for the issue.
     * 
     * 
     * {
     * 
     * 
     * 
     * 
     * "type": "CreateCrucibleReviewWorkflowFunction"
     * 
     * 
     * }
     * **Note:** This post function can be included once in a transition.
     * ##### Set issue security level based on user's project role function #####
     * A post function that sets the issue's security level if the current user has a project role.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "SetIssueSecurityFromRoleFunction",
     * 
     * 
     * 
     * "configuration": {
     * 
     * 
     * 
     * 
     * "projectRole": {
     * 
     * 
     * 
     * 
     * 
     * 
     * "id":"10002"
     * 
     * 
     * 
     * 
     * },
     * 
     * 
     * 
     * 
     * "issueSecurityLevel": {
     * 
     * 
     * 
     * 
     * 
     * 
     * "id":"10000"
     * 
     * 
     * 
     * 
     * }
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     *  *
     * `projectRole` An object containing the ID of the project role.
     * *
     * `issueSecurityLevel` OPTIONAL. The object containing the ID of the security level. If not passed, then the security level is set to `none`.
     * ##### Trigger a webhook function #####
     * A post function that triggers a webhook.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "TriggerWebhookFunction",
     * 
     * 
     * 
     * "configuration": {
     * 
     * 
     * 
     * 
     * "webhook": {
     * 
     * 
     * 
     * 
     * 
     * "id": "1"
     * 
     * 
     * 
     * 
     * }
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     *  *
     * `webhook` An object containing the ID of the webhook listener to trigger.
     * ##### Update issue custom field function #####
     * A post function that updates the content of an issue custom field.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "UpdateIssueCustomFieldPostFunction",
     * 
     * 
     * 
     * "configuration": {
     * 
     * 
     * 
     * 
     * "mode": "append",
     * 
     * 
     * 
     * 
     * "fieldId": "customfield_10003",
     * 
     * 
     * 
     * 
     * "fieldValue": "yikes"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     *  *
     * `mode` Use `replace` to override the field content with `fieldValue` or `append` to add `fieldValue` to the end of the field content.
     * *
     * `fieldId` The ID of the field.
     * *
     * `fieldValue` The update content.
     * ##### Update issue field function #####
     * A post function that updates a simple issue field.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "UpdateIssueFieldFunction",
     * 
     * 
     * 
     * "configuration": {
     * 
     * 
     * 
     * 
     * "fieldId": "assignee",
     * 
     * 
     * 
     * 
     * "fieldValue": "5f0c277e70b8a90025a00776"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     *  *
     * `fieldId` The ID of the field. Allowed field types:
     * 
     * 
     * 
     * 
     *  *
     * `assignee`
     * 
     * 
     * *
     * `description`
     * 
     * 
     * *
     * `environment`
     * 
     * 
     * *
     * `priority`
     * 
     * 
     * *
     * `resolution`
     * 
     * 
     * *
     * `summary`
     * 
     * 
     * *
     * `timeoriginalestimate`
     * 
     * 
     * *
     * `timeestimate`
     * 
     * 
     * *
     * `timespent`
     * *
     * `fieldValue` The update value.
     * *
     * If the `fieldId` is `assignee`, the `fieldValue` should be one of these values:
     * 
     * 
     * 
     * 
     *  *
     * an account ID.
     * 
     * 
     * *
     * `automatic`.
     * 
     * 
     * *
     * a blank string, which sets the value to `unassigned`.
     * #### Connect rules ####
     * Connect rules are conditions, validators, and post functions of a transition that are registered by Connect apps. To create a rule registered by the app, the app must be enabled and the rule's module must exist.
     * 
     * 
     * {
     * 
     * 
     * 
     * "type": "appKey__moduleKey",
     * 
     * 
     * 
     * "configuration": {
     * 
     * 
     * 
     * 
     * "value":"{\\"isValid\\":\\"true\\"}"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     *  *
     * `type` A Connect rule key in a form of `appKey__moduleKey`.
     * *
     * `value` The stringified JSON configuration of a Connect rule.
     * #### Forge rules ####
     * Forge transition rules are not yet supported.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WorkflowIDs createWorkflow(Consumer<CreateWorkflowOperationSpec> spec) {
        CreateWorkflowOperationSpec r = new CreateWorkflowOperationSpec(spec);
        return api.createWorkflow(r.createWorkflowDetails());
    }

    /**
     * Create workflow scheme
     * <p>
     * Creates a workflow scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WorkflowScheme createWorkflowScheme(Consumer<CreateWorkflowSchemeOperationSpec> spec) {
        CreateWorkflowSchemeOperationSpec r = new CreateWorkflowSchemeOperationSpec(spec);
        return api.createWorkflowScheme(r.workflowScheme());
    }

    /**
     * Create draft workflow scheme
     * <p>
     * Create a draft workflow scheme from an active workflow scheme, by copying the active workflow scheme. Note that an active workflow scheme can only have one draft workflow scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WorkflowScheme createWorkflowSchemeDraftFromParent(Consumer<CreateWorkflowSchemeDraftFromParentOperationSpec> spec) {
        CreateWorkflowSchemeDraftFromParentOperationSpec r = new CreateWorkflowSchemeDraftFromParentOperationSpec(spec);
        return api.createWorkflowSchemeDraftFromParent(r.id());
    }

    /**
     * Create workflow transition property
     * <p>
     * Adds a property to a workflow transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WorkflowTransitionProperty createWorkflowTransitionProperty(Consumer<CreateWorkflowTransitionPropertyOperationSpec> spec) {
        CreateWorkflowTransitionPropertyOperationSpec r = new CreateWorkflowTransitionPropertyOperationSpec(spec);
        return api.createWorkflowTransitionProperty(r.transitionId(), r.key(), r.workflowName(), r.requestBody(), r.workflowMode());
    }

    /**
     * Bulk create workflows
     * <p>
     * Create workflows and related statuses.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* project permission to create all, including global-scoped, workflows
     * *
     * *Administer projects* project permissions to create project-scoped workflows
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WorkflowCreateResponse createWorkflows(Consumer<CreateWorkflowsOperationSpec> spec) {
        CreateWorkflowsOperationSpec r = new CreateWorkflowsOperationSpec(spec);
        return api.createWorkflows(r.workflowCreateRequest());
    }

    /**
     * Delete actors from project role
     * <p>
     * Deletes actors from a project role for the project.
     * To remove default actors from the project role, use [Delete default actors from project role](#api-rest-api-2-role-id-actors-delete).
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteActor(Consumer<DeleteActorOperationSpec> spec) {
        DeleteActorOperationSpec r = new DeleteActorOperationSpec(spec);
        api.deleteActor(r.projectIdOrKey(), r.id(), r.user(), r.group(), r.groupId());
    }

    /**
     * Delete and replace version
     * <p>
     * Deletes a project version.
     * Alternative versions can be provided to update issues that use the deleted version in `fixVersion`, `affectedVersion`, or any version picker custom fields. If alternatives are not provided, occurrences of `fixVersion`, `affectedVersion`, and any version picker custom field, that contain the deleted version, are cleared. Any replacement version must be in the same project as the version being deleted and cannot be the version being deleted.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that contains the version.
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object deleteAndReplaceVersion(Consumer<DeleteAndReplaceVersionOperationSpec> spec) {
        DeleteAndReplaceVersionOperationSpec r = new DeleteAndReplaceVersionOperationSpec(spec);
        return api.deleteAndReplaceVersion(r.id(), r.deleteAndReplaceVersionBean());
    }

    /**
     * Delete avatar
     * <p>
     * Deletes an avatar from a project or issue type.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteAvatar(Consumer<DeleteAvatarOperationSpec> spec) {
        DeleteAvatarOperationSpec r = new DeleteAvatarOperationSpec(spec);
        api.deleteAvatar(r.type(), r.owningObjectId(), r.id());
    }

    /**
     * Delete comment
     * <p>
     * Deletes a comment.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue containing the comment is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * *
     * *Delete all comments*[ project permission](https://confluence.atlassian.com/x/yodKLg) to delete any comment or *Delete own comments* to delete comment created by the user,
     * *
     * If the comment has visibility restrictions, the user belongs to the group or has the role visibility is restricted to.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteComment(Consumer<DeleteCommentOperationSpec> spec) {
        DeleteCommentOperationSpec r = new DeleteCommentOperationSpec(spec);
        api.deleteComment(r.issueIdOrKey(), r.id());
    }

    /**
     * Delete comment property
     * <p>
     * Deletes a comment property.
     * **[Permissions](#permissions) required:** either of:
     *  *
     * *Edit All Comments* [project permission](https://confluence.atlassian.com/x/yodKLg) to delete a property from any comment.
     * *
     * *Edit Own Comments* [project permission](https://confluence.atlassian.com/x/yodKLg) to delete a property from a comment created by the user.
     * Also, when the visibility of a comment is restricted to a role or group the user must be a member of that role or group.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteCommentProperty(Consumer<DeleteCommentPropertyOperationSpec> spec) {
        DeleteCommentPropertyOperationSpec r = new DeleteCommentPropertyOperationSpec(spec);
        api.deleteCommentProperty(r.commentId(), r.propertyKey());
    }

    /**
     * Delete component
     * <p>
     * Deletes a component.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the component or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteComponent(Consumer<DeleteComponentOperationSpec> spec) {
        DeleteComponentOperationSpec r = new DeleteComponentOperationSpec(spec);
        api.deleteComponent(r.id(), r.moveIssuesTo());
    }

    /**
     * Delete custom field
     * <p>
     * Deletes a custom field. The custom field is deleted whether it is in the trash or not. See [Edit or delete a custom field](https://confluence.atlassian.com/x/Z44fOw) for more information on trashing and deleting custom fields.
     * This operation is [asynchronous](#async). Follow the `location` link in the response to determine the status of the task and use [Get task](#api-rest-api-2-task-taskId-get) to obtain subsequent updates.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteCustomField(Consumer<DeleteCustomFieldOperationSpec> spec) {
        DeleteCustomFieldOperationSpec r = new DeleteCustomFieldOperationSpec(spec);
        api.deleteCustomField(r.id());
    }

    /**
     * Delete custom field context
     * <p>
     * Deletes a [ custom field context](https://confluence.atlassian.com/adminjiracloud/what-are-custom-field-contexts-991923859.html).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object deleteCustomFieldContext(Consumer<DeleteCustomFieldContextOperationSpec> spec) {
        DeleteCustomFieldContextOperationSpec r = new DeleteCustomFieldContextOperationSpec(spec);
        return api.deleteCustomFieldContext(r.fieldId(), r.contextId());
    }

    /**
     * Delete custom field options (context)
     * <p>
     * Deletes a custom field option.
     * Options with cascading options cannot be deleted without deleting the cascading options first.
     * This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteCustomFieldOption(Consumer<DeleteCustomFieldOptionOperationSpec> spec) {
        DeleteCustomFieldOptionOperationSpec r = new DeleteCustomFieldOptionOperationSpec(spec);
        api.deleteCustomFieldOption(r.fieldId(), r.contextId(), r.optionId());
    }

    /**
     * Delete dashboard
     * <p>
     * Deletes a dashboard.
     * **[Permissions](#permissions) required:** None
     * The dashboard to be deleted must be owned by the user.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteDashboard(Consumer<DeleteDashboardOperationSpec> spec) {
        DeleteDashboardOperationSpec r = new DeleteDashboardOperationSpec(spec);
        api.deleteDashboard(r.id());
    }

    /**
     * Delete dashboard item property
     * <p>
     * Deletes a dashboard item property.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** The user must be the owner of the dashboard. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteDashboardItemProperty(Consumer<DeleteDashboardItemPropertyOperationSpec> spec) {
        DeleteDashboardItemPropertyOperationSpec r = new DeleteDashboardItemPropertyOperationSpec(spec);
        api.deleteDashboardItemProperty(r.dashboardId(), r.itemId(), r.propertyKey());
    }

    /**
     * Delete default workflow
     * <p>
     * Resets the default workflow for a workflow scheme. That is, the default workflow is set to Jira's system workflow (the *jira* workflow).
     * Note that active workflow schemes cannot be edited. If the workflow scheme is active, set `updateDraftIfNeeded` to `true` and a draft workflow scheme is created or updated with the default workflow reset. The draft workflow scheme can be published in Jira.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WorkflowScheme deleteDefaultWorkflow(Consumer<DeleteDefaultWorkflowOperationSpec> spec) {
        DeleteDefaultWorkflowOperationSpec r = new DeleteDefaultWorkflowOperationSpec(spec);
        return api.deleteDefaultWorkflow(r.id(), r.updateDraftIfNeeded());
    }

    /**
     * Delete draft default workflow
     * <p>
     * Resets the default workflow for a workflow scheme's draft. That is, the default workflow is set to Jira's system workflow (the *jira* workflow).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WorkflowScheme deleteDraftDefaultWorkflow(Consumer<DeleteDraftDefaultWorkflowOperationSpec> spec) {
        DeleteDraftDefaultWorkflowOperationSpec r = new DeleteDraftDefaultWorkflowOperationSpec(spec);
        return api.deleteDraftDefaultWorkflow(r.id());
    }

    /**
     * Delete issue types for workflow in draft workflow scheme
     * <p>
     * Deletes the workflow-issue type mapping for a workflow in a workflow scheme's draft.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteDraftWorkflowMapping(Consumer<DeleteDraftWorkflowMappingOperationSpec> spec) {
        DeleteDraftWorkflowMappingOperationSpec r = new DeleteDraftWorkflowMappingOperationSpec(spec);
        api.deleteDraftWorkflowMapping(r.id(), r.workflowName());
    }

    /**
     * Remove filter as favorite
     * <p>
     * Removes a filter as a favorite for the user. Note that this operation only removes filters visible to the user from the user's favorites list. For example, if the user favorites a public filter that is subsequently made private (and is therefore no longer visible on their favorites list) they cannot remove it from their favorites list.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Filter deleteFavouriteForFilter(Consumer<DeleteFavouriteForFilterOperationSpec> spec) {
        DeleteFavouriteForFilterOperationSpec r = new DeleteFavouriteForFilterOperationSpec(spec);
        return api.deleteFavouriteForFilter(r.id(), r.expand());
    }

    /**
     * Delete field configuration
     * <p>
     * Deletes a field configuration.
     * This operation can only delete configurations used in company-managed (classic) projects.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object deleteFieldConfiguration(Consumer<DeleteFieldConfigurationOperationSpec> spec) {
        DeleteFieldConfigurationOperationSpec r = new DeleteFieldConfigurationOperationSpec(spec);
        return api.deleteFieldConfiguration(r.id());
    }

    /**
     * Delete field configuration scheme
     * <p>
     * Deletes a field configuration scheme.
     * This operation can only delete field configuration schemes used in company-managed (classic) projects.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object deleteFieldConfigurationScheme(Consumer<DeleteFieldConfigurationSchemeOperationSpec> spec) {
        DeleteFieldConfigurationSchemeOperationSpec r = new DeleteFieldConfigurationSchemeOperationSpec(spec);
        return api.deleteFieldConfigurationScheme(r.id());
    }

    /**
     * Delete filter
     * <p>
     * Delete a filter.
     * **[Permissions](#permissions) required:** Permission to access Jira, however filters can only be deleted by the creator of the filter or a user with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteFilter(Consumer<DeleteFilterOperationSpec> spec) {
        DeleteFilterOperationSpec r = new DeleteFilterOperationSpec(spec);
        api.deleteFilter(r.id());
    }

    /**
     * Delete inactive workflow
     * <p>
     * Deletes a workflow.
     * The workflow cannot be deleted if it is:
     *  *
     * an active workflow.
     * *
     * a system workflow.
     * *
     * associated with any workflow scheme.
     * *
     * associated with any draft workflow scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteInactiveWorkflow(Consumer<DeleteInactiveWorkflowOperationSpec> spec) {
        DeleteInactiveWorkflowOperationSpec r = new DeleteInactiveWorkflowOperationSpec(spec);
        api.deleteInactiveWorkflow(r.entityId());
    }

    /**
     * Delete issue
     * <p>
     * Deletes an issue.
     * An issue cannot be deleted if it has one or more subtasks. To delete an issue with subtasks, set `deleteSubtasks`. This causes the issue's subtasks to be deleted with the issue.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* and *Delete issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteIssue(Consumer<DeleteIssueOperationSpec> spec) {
        DeleteIssueOperationSpec r = new DeleteIssueOperationSpec(spec);
        api.deleteIssue(r.issueIdOrKey(), r.deleteSubtasks());
    }

    /**
     * Delete issue field option
     * <p>
     * Deletes an option from a select list issue field.
     * Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object deleteIssueFieldOption(Consumer<DeleteIssueFieldOptionOperationSpec> spec) {
        DeleteIssueFieldOptionOperationSpec r = new DeleteIssueFieldOptionOperationSpec(spec);
        return api.deleteIssueFieldOption(r.fieldKey(), r.optionId());
    }

    /**
     * Delete issue link
     * <p>
     * Deletes an issue link.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * Browse project [project permission](https://confluence.atlassian.com/x/yodKLg) for all the projects containing the issues in the link.
     * *
     * *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one of the projects containing issues in the link.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, permission to view both of the issues.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteIssueLink(Consumer<DeleteIssueLinkOperationSpec> spec) {
        DeleteIssueLinkOperationSpec r = new DeleteIssueLinkOperationSpec(spec);
        api.deleteIssueLink(r.linkId());
    }

    /**
     * Delete issue link type
     * <p>
     * Deletes an issue link type.
     * To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteIssueLinkType(Consumer<DeleteIssueLinkTypeOperationSpec> spec) {
        DeleteIssueLinkTypeOperationSpec r = new DeleteIssueLinkTypeOperationSpec(spec);
        api.deleteIssueLinkType(r.issueLinkTypeId());
    }

    /**
     * Delete issue property
     * <p>
     * Deletes an issue's property.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* and *Edit issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteIssueProperty(Consumer<DeleteIssuePropertyOperationSpec> spec) {
        DeleteIssuePropertyOperationSpec r = new DeleteIssuePropertyOperationSpec(spec);
        api.deleteIssueProperty(r.issueIdOrKey(), r.propertyKey());
    }

    /**
     * Delete issue type
     * <p>
     * Deletes the issue type. If the issue type is in use, all uses are updated with the alternative issue type (`alternativeIssueTypeId`). A list of alternative issue types are obtained from the [Get alternative issue types](#api-rest-api-2-issuetype-id-alternatives-get) resource.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteIssueType(Consumer<DeleteIssueTypeOperationSpec> spec) {
        DeleteIssueTypeOperationSpec r = new DeleteIssueTypeOperationSpec(spec);
        api.deleteIssueType(r.id(), r.alternativeIssueTypeId());
    }

    /**
     * Delete issue type property
     * <p>
     * Deletes the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteIssueTypeProperty(Consumer<DeleteIssueTypePropertyOperationSpec> spec) {
        DeleteIssueTypePropertyOperationSpec r = new DeleteIssueTypePropertyOperationSpec(spec);
        api.deleteIssueTypeProperty(r.issueTypeId(), r.propertyKey());
    }

    /**
     * Delete issue type scheme
     * <p>
     * Deletes an issue type scheme.
     * Only issue type schemes used in classic projects can be deleted.
     * Any projects assigned to the scheme are reassigned to the default issue type scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object deleteIssueTypeScheme(Consumer<DeleteIssueTypeSchemeOperationSpec> spec) {
        DeleteIssueTypeSchemeOperationSpec r = new DeleteIssueTypeSchemeOperationSpec(spec);
        return api.deleteIssueTypeScheme(r.issueTypeSchemeId());
    }

    /**
     * Delete issue type screen scheme
     * <p>
     * Deletes an issue type screen scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object deleteIssueTypeScreenScheme(Consumer<DeleteIssueTypeScreenSchemeOperationSpec> spec) {
        DeleteIssueTypeScreenSchemeOperationSpec r = new DeleteIssueTypeScreenSchemeOperationSpec(spec);
        return api.deleteIssueTypeScreenScheme(r.issueTypeScreenSchemeId());
    }

    /**
     * Delete locale
     * <p>
     * Deprecated, use [ Update a user profile](https://developer.atlassian.com/cloud/admin/user-management/rest/#api-users-account-id-manage-profile-patch) from the user management REST API instead.
     * Deletes the locale of the user, which restores the default setting.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     * @deprecated
     */
    @Deprecated
    public Object deleteLocale(Consumer<DeleteLocaleOperationSpec> spec) {
        DeleteLocaleOperationSpec r = new DeleteLocaleOperationSpec(spec);
        return api.deleteLocale();
    }

    /**
     * Delete notification scheme
     * <p>
     * Deletes a notification scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object deleteNotificationScheme(Consumer<DeleteNotificationSchemeOperationSpec> spec) {
        DeleteNotificationSchemeOperationSpec r = new DeleteNotificationSchemeOperationSpec(spec);
        return api.deleteNotificationScheme(r.notificationSchemeId());
    }

    /**
     * Delete permission scheme
     * <p>
     * Deletes a permission scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deletePermissionScheme(Consumer<DeletePermissionSchemeOperationSpec> spec) {
        DeletePermissionSchemeOperationSpec r = new DeletePermissionSchemeOperationSpec(spec);
        api.deletePermissionScheme(r.schemeId());
    }

    /**
     * Delete permission scheme grant
     * <p>
     * Deletes a permission grant from a permission scheme. See [About permission schemes and grants](../api-group-permission-schemes/#about-permission-schemes-and-grants) for more details.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deletePermissionSchemeEntity(Consumer<DeletePermissionSchemeEntityOperationSpec> spec) {
        DeletePermissionSchemeEntityOperationSpec r = new DeletePermissionSchemeEntityOperationSpec(spec);
        api.deletePermissionSchemeEntity(r.schemeId(), r.permissionId());
    }

    /**
     * Delete priority
     * <p>
     * Deletes an issue priority.
     * This operation is [asynchronous](#async). Follow the `location` link in the response to determine the status of the task and use [Get task](#api-rest-api-2-task-taskId-get) to obtain subsequent updates.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deletePriority(Consumer<DeletePriorityOperationSpec> spec) {
        DeletePriorityOperationSpec r = new DeletePriorityOperationSpec(spec);
        api.deletePriority(r.id(), r.replaceWith());
    }

    /**
     * Delete project
     * <p>
     * Deletes a project.
     * You can't delete a project if it's archived. To delete an archived project, restore the project and then delete it. To restore a project, use the Jira UI.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteProject(Consumer<DeleteProjectOperationSpec> spec) {
        DeleteProjectOperationSpec r = new DeleteProjectOperationSpec(spec);
        api.deleteProject(r.projectIdOrKey(), r.enableUndo());
    }

    /**
     * Delete project asynchronously
     * <p>
     * Deletes a project asynchronously.
     * This operation is:
     *  *
     * transactional, that is, if part of the delete fails the project is not deleted.
     * *
     * [asynchronous](#async). Follow the `location` link in the response to determine the status of the task and use [Get task](#api-rest-api-2-task-taskId-get) to obtain subsequent updates.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteProjectAsynchronously(Consumer<DeleteProjectAsynchronouslyOperationSpec> spec) {
        DeleteProjectAsynchronouslyOperationSpec r = new DeleteProjectAsynchronouslyOperationSpec(spec);
        api.deleteProjectAsynchronously(r.projectIdOrKey());
    }

    /**
     * Delete project avatar
     * <p>
     * Deletes a custom avatar from a project. Note that system avatars cannot be deleted.
     * **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteProjectAvatar(Consumer<DeleteProjectAvatarOperationSpec> spec) {
        DeleteProjectAvatarOperationSpec r = new DeleteProjectAvatarOperationSpec(spec);
        api.deleteProjectAvatar(r.projectIdOrKey(), r.id());
    }

    /**
     * Delete project property
     * <p>
     * Deletes the [property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties) from a project.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the property.
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteProjectProperty(Consumer<DeleteProjectPropertyOperationSpec> spec) {
        DeleteProjectPropertyOperationSpec r = new DeleteProjectPropertyOperationSpec(spec);
        api.deleteProjectProperty(r.projectIdOrKey(), r.propertyKey());
    }

    /**
     * Delete project role
     * <p>
     * Deletes a project role. You must specify a replacement project role if you wish to delete a project role that is in use.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteProjectRole(Consumer<DeleteProjectRoleOperationSpec> spec) {
        DeleteProjectRoleOperationSpec r = new DeleteProjectRoleOperationSpec(spec);
        api.deleteProjectRole(r.id(), r.swap());
    }

    /**
     * Delete default actors from project role
     * <p>
     * Deletes the [default actors](#api-rest-api-2-resolution-get) from a project role. You may delete a group or user, but you cannot delete a group and a user in the same request.
     * Changing a project role's default actors does not affect project role members for projects already created.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ProjectRole deleteProjectRoleActorsFromRole(Consumer<DeleteProjectRoleActorsFromRoleOperationSpec> spec) {
        DeleteProjectRoleActorsFromRoleOperationSpec r = new DeleteProjectRoleActorsFromRoleOperationSpec(spec);
        return api.deleteProjectRoleActorsFromRole(r.id(), r.user(), r.groupId(), r.group());
    }

    /**
     * Delete remote issue link by global ID
     * <p>
     * Deletes the remote issue link from the issue using the link's global ID. Where the global ID includes reserved URL characters these must be escaped in the request. For example, pass `system=http://www.mycompany.com/support&amp;id=1` as `system%3Dhttp%3A%2F%2Fwww.mycompany.com%2Fsupport%26id%3D1`.
     * This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is implemented, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteRemoteIssueLinkByGlobalId(Consumer<DeleteRemoteIssueLinkByGlobalIdOperationSpec> spec) {
        DeleteRemoteIssueLinkByGlobalIdOperationSpec r = new DeleteRemoteIssueLinkByGlobalIdOperationSpec(spec);
        api.deleteRemoteIssueLinkByGlobalId(r.issueIdOrKey(), r.globalId());
    }

    /**
     * Delete remote issue link by ID
     * <p>
     * Deletes a remote issue link from an issue.
     * This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects*, *Edit issues*, and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteRemoteIssueLinkById(Consumer<DeleteRemoteIssueLinkByIdOperationSpec> spec) {
        DeleteRemoteIssueLinkByIdOperationSpec r = new DeleteRemoteIssueLinkByIdOperationSpec(spec);
        api.deleteRemoteIssueLinkById(r.issueIdOrKey(), r.linkId());
    }

    /**
     * Delete resolution
     * <p>
     * Deletes an issue resolution.
     * This operation is [asynchronous](#async). Follow the `location` link in the response to determine the status of the task and use [Get task](#api-rest-api-2-task-taskId-get) to obtain subsequent updates.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteResolution(Consumer<DeleteResolutionOperationSpec> spec) {
        DeleteResolutionOperationSpec r = new DeleteResolutionOperationSpec(spec);
        api.deleteResolution(r.id(), r.replaceWith());
    }

    /**
     * Delete screen
     * <p>
     * Deletes a screen. A screen cannot be deleted if it is used in a screen scheme, workflow, or workflow draft.
     * Only screens used in classic projects can be deleted.
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteScreen(Consumer<DeleteScreenOperationSpec> spec) {
        DeleteScreenOperationSpec r = new DeleteScreenOperationSpec(spec);
        api.deleteScreen(r.screenId());
    }

    /**
     * Delete screen scheme
     * <p>
     * Deletes a screen scheme. A screen scheme cannot be deleted if it is used in an issue type screen scheme.
     * Only screens schemes used in classic projects can be deleted.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteScreenScheme(Consumer<DeleteScreenSchemeOperationSpec> spec) {
        DeleteScreenSchemeOperationSpec r = new DeleteScreenSchemeOperationSpec(spec);
        api.deleteScreenScheme(r.screenSchemeId());
    }

    /**
     * Delete screen tab
     * <p>
     * Deletes a screen tab.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteScreenTab(Consumer<DeleteScreenTabOperationSpec> spec) {
        DeleteScreenTabOperationSpec r = new DeleteScreenTabOperationSpec(spec);
        api.deleteScreenTab(r.screenId(), r.tabId());
    }

    /**
     * Delete issue security scheme
     * <p>
     * Deletes an issue security scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object deleteSecurityScheme(Consumer<DeleteSecuritySchemeOperationSpec> spec) {
        DeleteSecuritySchemeOperationSpec r = new DeleteSecuritySchemeOperationSpec(spec);
        return api.deleteSecurityScheme(r.schemeId());
    }

    /**
     * Delete share permission
     * <p>
     * Deletes a share permission from a filter.
     * **[Permissions](#permissions) required:** Permission to access Jira and the user must own the filter.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteSharePermission(Consumer<DeleteSharePermissionOperationSpec> spec) {
        DeleteSharePermissionOperationSpec r = new DeleteSharePermissionOperationSpec(spec);
        api.deleteSharePermission(r.id(), r.permissionId());
    }

    /**
     * Bulk delete Statuses
     * <p>
     * Deletes statuses by ID.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)
     * *
     * *Administer Jira* [project permission.](https://confluence.atlassian.com/x/yodKLg)
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object deleteStatusesById(Consumer<DeleteStatusesByIdOperationSpec> spec) {
        DeleteStatusesByIdOperationSpec r = new DeleteStatusesByIdOperationSpec(spec);
        return api.deleteStatusesById(r.id());
    }

    /**
     * Delete UI modification
     * <p>
     * Deletes a UI modification. All the contexts that belong to the UI modification are deleted too. UI modification can only be deleted by Forge apps.
     * **[Permissions](#permissions) required:** None.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object deleteUiModification(Consumer<DeleteUiModificationOperationSpec> spec) {
        DeleteUiModificationOperationSpec r = new DeleteUiModificationOperationSpec(spec);
        return api.deleteUiModification(r.uiModificationId());
    }

    /**
     * Delete user property
     * <p>
     * Deletes a property from a user.
     * Note: This operation does not access the [user properties](https://confluence.atlassian.com/x/8YxjL) created and maintained in Jira.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to delete a property from any user.
     * *
     * Access to Jira, to delete a property from the calling user's record.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteUserProperty(Consumer<DeleteUserPropertyOperationSpec> spec) {
        DeleteUserPropertyOperationSpec r = new DeleteUserPropertyOperationSpec(spec);
        api.deleteUserProperty(r.propertyKey(), r.accountId(), r.userKey(), r.username());
    }

    /**
     * Delete version
     * <p>
     * Deletes a project version.
     * Deprecated, use [ Delete and replace version](#api-rest-api-2-version-id-removeAndSwap-post) that supports swapping version values in custom fields, in addition to the swapping for `fixVersion` and `affectedVersion` provided in this resource.
     * Alternative versions can be provided to update issues that use the deleted version in `fixVersion` or `affectedVersion`. If alternatives are not provided, occurrences of `fixVersion` and `affectedVersion` that contain the deleted version are cleared.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that contains the version.
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     * @deprecated
     */
    @Deprecated
    public void deleteVersion(Consumer<DeleteVersionOperationSpec> spec) {
        DeleteVersionOperationSpec r = new DeleteVersionOperationSpec(spec);
        api.deleteVersion(r.id(), r.moveFixIssuesTo(), r.moveAffectedIssuesTo());
    }

    /**
     * Delete webhooks by ID
     * <p>
     * Removes webhooks by ID. Only webhooks registered by the calling app are removed. If webhooks created by other apps are specified, they are ignored.
     * **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/#connect-apps) and [OAuth 2.0](https://developer.atlassian.com/cloud/jira/platform/oauth-2-3lo-apps) apps can use this operation.
     * Authentication - Required Scopes: [read:jira-work, manage:jira-webhook]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteWebhookById(Consumer<DeleteWebhookByIdOperationSpec> spec) {
        DeleteWebhookByIdOperationSpec r = new DeleteWebhookByIdOperationSpec(spec);
        api.deleteWebhookById(r.containerForWebhookIDs());
    }

    /**
     * Delete issue types for workflow in workflow scheme
     * <p>
     * Deletes the workflow-issue type mapping for a workflow in a workflow scheme.
     * Note that active workflow schemes cannot be edited. If the workflow scheme is active, set `updateDraftIfNeeded` to `true` and a draft workflow scheme is created or updated with the workflow-issue type mapping deleted. The draft workflow scheme can be published in Jira.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteWorkflowMapping(Consumer<DeleteWorkflowMappingOperationSpec> spec) {
        DeleteWorkflowMappingOperationSpec r = new DeleteWorkflowMappingOperationSpec(spec);
        api.deleteWorkflowMapping(r.id(), r.workflowName(), r.updateDraftIfNeeded());
    }

    /**
     * Delete workflow scheme
     * <p>
     * Deletes a workflow scheme. Note that a workflow scheme cannot be deleted if it is active (that is, being used by at least one project).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object deleteWorkflowScheme(Consumer<DeleteWorkflowSchemeOperationSpec> spec) {
        DeleteWorkflowSchemeOperationSpec r = new DeleteWorkflowSchemeOperationSpec(spec);
        return api.deleteWorkflowScheme(r.id());
    }

    /**
     * Delete draft workflow scheme
     * <p>
     * Deletes a draft workflow scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteWorkflowSchemeDraft(Consumer<DeleteWorkflowSchemeDraftOperationSpec> spec) {
        DeleteWorkflowSchemeDraftOperationSpec r = new DeleteWorkflowSchemeDraftOperationSpec(spec);
        api.deleteWorkflowSchemeDraft(r.id());
    }

    /**
     * Delete workflow for issue type in draft workflow scheme
     * <p>
     * Deletes the issue type-workflow mapping for an issue type in a workflow scheme's draft.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WorkflowScheme deleteWorkflowSchemeDraftIssueType(Consumer<DeleteWorkflowSchemeDraftIssueTypeOperationSpec> spec) {
        DeleteWorkflowSchemeDraftIssueTypeOperationSpec r = new DeleteWorkflowSchemeDraftIssueTypeOperationSpec(spec);
        return api.deleteWorkflowSchemeDraftIssueType(r.id(), r.issueType());
    }

    /**
     * Delete workflow for issue type in workflow scheme
     * <p>
     * Deletes the issue type-workflow mapping for an issue type in a workflow scheme.
     * Note that active workflow schemes cannot be edited. If the workflow scheme is active, set `updateDraftIfNeeded` to `true` and a draft workflow scheme is created or updated with the issue type-workflow mapping deleted. The draft workflow scheme can be published in Jira.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WorkflowScheme deleteWorkflowSchemeIssueType(Consumer<DeleteWorkflowSchemeIssueTypeOperationSpec> spec) {
        DeleteWorkflowSchemeIssueTypeOperationSpec r = new DeleteWorkflowSchemeIssueTypeOperationSpec(spec);
        return api.deleteWorkflowSchemeIssueType(r.id(), r.issueType(), r.updateDraftIfNeeded());
    }

    /**
     * Delete workflow transition property
     * <p>
     * Deletes a property from a workflow transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteWorkflowTransitionProperty(Consumer<DeleteWorkflowTransitionPropertyOperationSpec> spec) {
        DeleteWorkflowTransitionPropertyOperationSpec r = new DeleteWorkflowTransitionPropertyOperationSpec(spec);
        api.deleteWorkflowTransitionProperty(r.transitionId(), r.key(), r.workflowName(), r.workflowMode());
    }

    /**
     * Delete workflow transition rule configurations
     * <p>
     * Deletes workflow transition rules from one or more workflows. These rule types are supported:
     *  *
     * [post functions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-post-function/)
     * *
     * [conditions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-condition/)
     * *
     * [validators](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-validator/)
     * Only rules created by the calling Connect app can be deleted.
     * **[Permissions](#permissions) required:** Only Connect apps can use this operation.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WorkflowTransitionRulesUpdateErrors deleteWorkflowTransitionRuleConfigurations(Consumer<DeleteWorkflowTransitionRuleConfigurationsOperationSpec> spec) {
        DeleteWorkflowTransitionRuleConfigurationsOperationSpec r = new DeleteWorkflowTransitionRuleConfigurationsOperationSpec(spec);
        return api.deleteWorkflowTransitionRuleConfigurations(r.workflowsWithTransitionRulesDetails());
    }

    /**
     * Delete worklog
     * <p>
     * Deletes a worklog from an issue.
     * Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * *
     * *Delete all worklogs*[ project permission](https://confluence.atlassian.com/x/yodKLg) to delete any worklog or *Delete own worklogs* to delete worklogs created by the user,
     * *
     * If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteWorklog(Consumer<DeleteWorklogOperationSpec> spec) {
        DeleteWorklogOperationSpec r = new DeleteWorklogOperationSpec(spec);
        api.deleteWorklog(r.issueIdOrKey(), r.id(), r.notifyUsers(), r.adjustEstimate(), r.newEstimate(), r.increaseBy(), r.overrideEditableFlag());
    }

    /**
     * Delete worklog property
     * <p>
     * Deletes a worklog property.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * *
     * If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void deleteWorklogProperty(Consumer<DeleteWorklogPropertyOperationSpec> spec) {
        DeleteWorklogPropertyOperationSpec r = new DeleteWorklogPropertyOperationSpec(spec);
        api.deleteWorklogProperty(r.issueIdOrKey(), r.worklogId(), r.propertyKey());
    }

    /**
     * Transition issue
     * <p>
     * Performs an issue transition and, if the transition has a screen, updates the fields from the transition screen.
     * sortByCategory To update the fields on the transition screen, specify the fields in the `fields` or `update` parameters in the request body. Get details about the fields using [ Get transitions](#api-rest-api-2-issue-issueIdOrKey-transitions-get) with the `transitions.fields` expand.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* and *Transition issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object doTransition(Consumer<DoTransitionOperationSpec> spec) {
        DoTransitionOperationSpec r = new DoTransitionOperationSpec(spec);
        return api.doTransition(r.issueIdOrKey(), r.requestBody());
    }

    /**
     * Get modules
     * <p>
     * Returns all modules registered dynamically by the calling app.
     * **[Permissions](#permissions) required:** Only Connect apps can make this request.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ConnectModules dynamicModulesResourceGetModulesGet(Consumer<DynamicModulesResourceGetModulesGetOperationSpec> spec) {
        DynamicModulesResourceGetModulesGetOperationSpec r = new DynamicModulesResourceGetModulesGetOperationSpec(spec);
        return api.dynamicModulesResourceGetModulesGet();
    }

    /**
     * Register modules
     * <p>
     * Registers a list of modules.
     * **[Permissions](#permissions) required:** Only Connect apps can make this request.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void dynamicModulesResourceRegisterModulesPost(Consumer<DynamicModulesResourceRegisterModulesPostOperationSpec> spec) {
        DynamicModulesResourceRegisterModulesPostOperationSpec r = new DynamicModulesResourceRegisterModulesPostOperationSpec(spec);
        api.dynamicModulesResourceRegisterModulesPost(r.connectModules());
    }

    /**
     * Remove modules
     * <p>
     * Remove all or a list of modules registered by the calling app.
     * **[Permissions](#permissions) required:** Only Connect apps can make this request.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void dynamicModulesResourceRemoveModulesDelete(Consumer<DynamicModulesResourceRemoveModulesDeleteOperationSpec> spec) {
        DynamicModulesResourceRemoveModulesDeleteOperationSpec r = new DynamicModulesResourceRemoveModulesDeleteOperationSpec(spec);
        api.dynamicModulesResourceRemoveModulesDelete(r.moduleKey());
    }

    /**
     * Edit issue
     * <p>
     * Edits an issue. A transition may be applied and issue properties updated as part of the edit.
     * The edits to the issue's fields are defined using `update` and `fields`. The fields that can be edited are determined using [ Get edit issue metadata](#api-rest-api-2-issue-issueIdOrKey-editmeta-get).
     * The parent field may be set by key or ID. For standard issue types, the parent may be removed by setting `update.parent.set.none` to *true*.
     * Connect apps having an app user with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), and Forge apps acting on behalf of users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), can override the screen security configuration using `overrideScreenSecurity` and `overrideEditableFlag`.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* and *Edit issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object editIssue(Consumer<EditIssueOperationSpec> spec) {
        EditIssueOperationSpec r = new EditIssueOperationSpec(spec);
        return api.editIssue(r.issueIdOrKey(), r.requestBody(), r.notifyUsers(), r.overrideScreenSecurity(), r.overrideEditableFlag());
    }

    /**
     * Evaluate Jira expression
     * <p>
     * Evaluates a Jira expression and returns its value.
     * This resource can be used to test Jira expressions that you plan to use elsewhere, or to fetch data in a flexible way. Consult the [Jira expressions documentation](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/) for more details.
     * #### Context variables ####
     * The following context variables are available to Jira expressions evaluated by this resource. Their presence depends on various factors; usually you need to manually request them in the context object sent in the payload, but some of them are added automatically under certain conditions.
     *  *
     * `user` ([User](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#user)): The current user. Always available and equal to `null` if the request is anonymous.
     * *
     * `app` ([App](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#app)): The [Connect app](https://developer.atlassian.com/cloud/jira/platform/index/#connect-apps) that made the request. Available only for authenticated requests made by Connect Apps (read more here: [Authentication for Connect apps](https://developer.atlassian.com/cloud/jira/platform/security-for-connect-apps/)).
     * *
     * `issue` ([Issue](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#issue)): The current issue. Available only when the issue is provided in the request context object.
     * *
     * `issues` ([List](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#list) of [Issues](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#issue)): A collection of issues matching a JQL query. Available only when JQL is provided in the request context object.
     * *
     * `project` ([Project](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#project)): The current project. Available only when the project is provided in the request context object.
     * *
     * `sprint` ([Sprint](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#sprint)): The current sprint. Available only when the sprint is provided in the request context object.
     * *
     * `board` ([Board](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#board)): The current board. Available only when the board is provided in the request context object.
     * *
     * `serviceDesk` ([ServiceDesk](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#servicedesk)): The current service desk. Available only when the service desk is provided in the request context object.
     * *
     * `customerRequest` ([CustomerRequest](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#customerrequest)): The current customer request. Available only when the customer request is provided in the request context object.
     * Also, custom context variables can be passed in the request with their types. Those variables can be accessed by key in the Jira expression. These variable types are available for use in a custom context:
     *  *
     * `user`: A [user](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#user) specified as an Atlassian account ID.
     * *
     * `issue`: An [issue](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#issue) specified by ID or key. All the fields of the issue object are available in the Jira expression.
     * *
     * `json`: A JSON object containing custom content.
     * *
     * `list`: A JSON list of `user`, `issue`, or `json` variable types.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required**: None. However, an expression may return different results for different users depending on their permissions. For example, different users may see different comments on the same issue.
     *  Permission to access Jira Software is required to access Jira Software context variables (`board` and `sprint`) or fields (for example, `issue.sprint`).
     * Authentication - Required Scopes: [read:jira-work, read:jira-user]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public JiraExpressionResult evaluateJiraExpression(Consumer<EvaluateJiraExpressionOperationSpec> spec) {
        EvaluateJiraExpressionOperationSpec r = new EvaluateJiraExpressionOperationSpec(spec);
        return api.evaluateJiraExpression(r.jiraExpressionEvalRequestBean(), r.expand());
    }

    /**
     * Get all metadata for an expanded attachment
     * <p>
     * Returns the metadata for the contents of an attachment, if it is an archive, and metadata for the attachment itself. For example, if the attachment is a ZIP archive, then information about the files in the archive is returned and metadata for the ZIP archive. Currently, only the ZIP archive format is supported.
     * Use this operation to retrieve data that is presented to the user, as this operation returns the metadata for the attachment itself, such as the attachment's ID and name. Otherwise, use [ Get contents metadata for an expanded attachment](#api-rest-api-2-attachment-id-expand-raw-get), which only returns the metadata for the attachment's contents.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** For the issue containing the attachment:
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public AttachmentArchiveMetadataReadable expandAttachmentForHumans(Consumer<ExpandAttachmentForHumansOperationSpec> spec) {
        ExpandAttachmentForHumansOperationSpec r = new ExpandAttachmentForHumansOperationSpec(spec);
        return api.expandAttachmentForHumans(r.id());
    }

    /**
     * Get contents metadata for an expanded attachment
     * <p>
     * Returns the metadata for the contents of an attachment, if it is an archive. For example, if the attachment is a ZIP archive, then information about the files in the archive is returned. Currently, only the ZIP archive format is supported.
     * Use this operation if you are processing the data without presenting it to the user, as this operation only returns the metadata for the contents of the attachment. Otherwise, to retrieve data to present to the user, use [ Get all metadata for an expanded attachment](#api-rest-api-2-attachment-id-expand-human-get) which also returns the metadata for the attachment itself, such as the attachment's ID and name.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** For the issue containing the attachment:
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public AttachmentArchiveImpl expandAttachmentForMachines(Consumer<ExpandAttachmentForMachinesOperationSpec> spec) {
        ExpandAttachmentForMachinesOperationSpec r = new ExpandAttachmentForMachinesOperationSpec(spec);
        return api.expandAttachmentForMachines(r.id());
    }

    /**
     * Find users assignable to issues
     * <p>
     * Returns a list of users that can be assigned to an issue. Use this operation to find the list of users who can be assigned to:
     *  *
     * a new issue, by providing the `projectKeyOrId`.
     * *
     * an updated issue, by providing the `issueKey`.
     * *
     * to an issue during a transition (workflow action), by providing the `issueKey` and the transition id in `actionDescriptorId`. You can obtain the IDs of an issue's valid transitions using the `transitions` option in the `expand` parameter of [ Get issue](#api-rest-api-2-issue-issueIdOrKey-get).
     * In all these cases, you can pass an account ID to determine if a user can be assigned to an issue. The user is returned in the response if they can be assigned to the issue or issue transition.
     * This operation takes the users in the range defined by `startAt` and `maxResults`, up to the thousandth user, and then returns only the users from that range that can be assigned the issue. This means the operation usually returns fewer users than specified in `maxResults`. To get all the users who can be assigned the issue, use [Get all users](#api-rest-api-2-users-search-get) and filter the records in your code.
     * Privacy controls are applied to the response based on the users' preferences. This could mean, for example, that the user's email address is hidden. See the [Profile visibility overview](https://developer.atlassian.com/cloud/jira/platform/profile-visibility/) for more details.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [read:jira-user]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<User> findAssignableUsers(Consumer<FindAssignableUsersOperationSpec> spec) {
        FindAssignableUsersOperationSpec r = new FindAssignableUsersOperationSpec(spec);
        return api.findAssignableUsers(r.query(), r.sessionId(), r.username(), r.accountId(), r.project(), r.issueKey(), r.startAt(), r.maxResults(), r.actionDescriptorId(), r.recommend());
    }

    /**
     * Find users assignable to projects
     * <p>
     * Returns a list of users who can be assigned issues in one or more projects. The list may be restricted to users whose attributes match a string.
     * This operation takes the users in the range defined by `startAt` and `maxResults`, up to the thousandth user, and then returns only the users from that range that can be assigned issues in the projects. This means the operation usually returns fewer users than specified in `maxResults`. To get all the users who can be assigned issues in the projects, use [Get all users](#api-rest-api-2-users-search-get) and filter the records in your code.
     * Privacy controls are applied to the response based on the users' preferences. This could mean, for example, that the user's email address is hidden. See the [Profile visibility overview](https://developer.atlassian.com/cloud/jira/platform/profile-visibility/) for more details.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     * Authentication - Required Scopes: [read:jira-user]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<User> findBulkAssignableUsers(Consumer<FindBulkAssignableUsersOperationSpec> spec) {
        FindBulkAssignableUsersOperationSpec r = new FindBulkAssignableUsersOperationSpec(spec);
        return api.findBulkAssignableUsers(r.projectKeys(), r.query(), r.username(), r.accountId(), r.startAt(), r.maxResults());
    }

    /**
     * Find groups
     * <p>
     * Returns a list of groups whose names contain a query string. A list of group names can be provided to exclude groups from the results.
     * The primary use case for this resource is to populate a group picker suggestions list. To this end, the returned object includes the `html` field where the matched query term is highlighted in the group name with the HTML strong tag. Also, the groups list is wrapped in a response object that contains a header for use in the picker, specifically *Showing X of Y matching groups*.
     * The list returns with the groups sorted. If no groups match the list criteria, an empty list is returned.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg). Anonymous calls and calls by users without the required permission return an empty list.
     * *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg). Without this permission, calls where query is not an exact match to an existing group will return an empty list.
     * Authentication - Required Scopes: [read:jira-user]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public FoundGroups findGroups(Consumer<FindGroupsOperationSpec> spec) {
        FindGroupsOperationSpec r = new FindGroupsOperationSpec(spec);
        return api.findGroups(r.accountId(), r.query(), r.exclude(), r.excludeId(), r.maxResults(), r.caseInsensitive(), r.userName());
    }

    /**
     * Find user keys by query
     * <p>
     * Finds users with a structured query and returns a [paginated](#pagination) list of user keys.
     * This operation takes the users in the range defined by `startAt` and `maxResults`, up to the thousandth user, and then returns only the users from that range that match the structured query. This means the operation usually returns fewer users than specified in `maxResults`. To get all the users who match the structured query, use [Get all users](#api-rest-api-2-users-search-get) and filter the records in your code.
     * **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * The query statements are:
     *  *
     * `is assignee of PROJ` Returns the users that are assignees of at least one issue in project *PROJ*.
     * *
     * `is assignee of (PROJ-1, PROJ-2)` Returns users that are assignees on the issues *PROJ-1* or *PROJ-2*.
     * *
     * `is reporter of (PROJ-1, PROJ-2)` Returns users that are reporters on the issues *PROJ-1* or *PROJ-2*.
     * *
     * `is watcher of (PROJ-1, PROJ-2)` Returns users that are watchers on the issues *PROJ-1* or *PROJ-2*.
     * *
     * `is voter of (PROJ-1, PROJ-2)` Returns users that are voters on the issues *PROJ-1* or *PROJ-2*.
     * *
     * `is commenter of (PROJ-1, PROJ-2)` Returns users that have posted a comment on the issues *PROJ-1* or *PROJ-2*.
     * *
     * `is transitioner of (PROJ-1, PROJ-2)` Returns users that have performed a transition on issues *PROJ-1* or *PROJ-2*.
     * *
     * `[propertyKey].entity.property.path is "property value"` Returns users with the entity property value.
     * The list of issues can be extended as needed, as in *(PROJ-1, PROJ-2, ... PROJ-n)*. Statements can be combined using the `AND` and `OR` operators to form more complex queries. For example:
     * `is assignee of PROJ AND [propertyKey].entity.property.path is "property value"`
     * Authentication - Required Scopes: [read:jira-user]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanUserKey findUserKeysByQuery(Consumer<FindUserKeysByQueryOperationSpec> spec) {
        FindUserKeysByQueryOperationSpec r = new FindUserKeysByQueryOperationSpec(spec);
        return api.findUserKeysByQuery(r.query(), r.startAt(), r.maxResults());
    }

    /**
     * Find users
     * <p>
     * Returns a list of users that match the search string and property.
     * This operation first applies a filter to match the search string and property, and then takes the filtered users in the range defined by `startAt` and `maxResults`, up to the thousandth user. To get all the users who match the search string and property, use [Get all users](#api-rest-api-2-users-search-get) and filter the records in your code.
     * This operation can be accessed anonymously.
     * Privacy controls are applied to the response based on the users' preferences. This could mean, for example, that the user's email address is hidden. See the [Profile visibility overview](https://developer.atlassian.com/cloud/jira/platform/profile-visibility/) for more details.
     * **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg). Anonymous calls or calls by users without the required permission return empty search results.
     * Authentication - Required Scopes: [read:jira-user]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<User> findUsers(Consumer<FindUsersOperationSpec> spec) {
        FindUsersOperationSpec r = new FindUsersOperationSpec(spec);
        return api.findUsers(r.query(), r.username(), r.accountId(), r.startAt(), r.maxResults(), r.property());
    }

    /**
     * Find users and groups
     * <p>
     * Returns a list of users and groups matching a string. The string is used:
     *  *
     * for users, to find a case-insensitive match with display name and e-mail address. Note that if a user has hidden their email address in their user profile, partial matches of the email address will not find the user. An exact match is required.
     * *
     * for groups, to find a case-sensitive match with group name.
     * For example, if the string *tin* is used, records with the display name *Tina*, email address *sarah@tinplatetraining.com*, and the group *accounting* would be returned.
     * Optionally, the search can be refined to:
     *  *
     * the projects and issue types associated with a custom field, such as a user picker. The search can then be further refined to return only users and groups that have permission to view specific:
     * 
     * 
     * 
     * 
     *  *
     * projects.
     * 
     * 
     * *
     * issue types.
     * 
     * 
     * 
     * 
     * If multiple projects or issue types are specified, they must be a subset of those enabled for the custom field or no results are returned. For example, if a field is enabled for projects A, B, and C then the search could be limited to projects B and C. However, if the search is limited to projects B and D, nothing is returned.
     * *
     * not return Connect app users and groups.
     * *
     * return groups that have a case-insensitive match with the query.
     * The primary use case for this resource is to populate a picker field suggestion list with users or groups. To this end, the returned object includes an `html` field for each list. This field highlights the matched query term in the item name with the HTML strong tag. Also, each list is wrapped in a response object that contains a header for use in a picker, specifically *Showing X of Y matching groups*.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/yodKLg).
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public FoundUsersAndGroups findUsersAndGroups(Consumer<FindUsersAndGroupsOperationSpec> spec) {
        FindUsersAndGroupsOperationSpec r = new FindUsersAndGroupsOperationSpec(spec);
        return api.findUsersAndGroups(r.query(), r.maxResults(), r.showAvatar(), r.fieldId(), r.projectId(), r.issueTypeId(), r.avatarSize(), r.caseInsensitive(), r.excludeConnectAddons());
    }

    /**
     * Find users by query
     * <p>
     * Finds users with a structured query and returns a [paginated](#pagination) list of user details.
     * This operation takes the users in the range defined by `startAt` and `maxResults`, up to the thousandth user, and then returns only the users from that range that match the structured query. This means the operation usually returns fewer users than specified in `maxResults`. To get all the users who match the structured query, use [Get all users](#api-rest-api-2-users-search-get) and filter the records in your code.
     * **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * The query statements are:
     *  *
     * `is assignee of PROJ` Returns the users that are assignees of at least one issue in project *PROJ*.
     * *
     * `is assignee of (PROJ-1, PROJ-2)` Returns users that are assignees on the issues *PROJ-1* or *PROJ-2*.
     * *
     * `is reporter of (PROJ-1, PROJ-2)` Returns users that are reporters on the issues *PROJ-1* or *PROJ-2*.
     * *
     * `is watcher of (PROJ-1, PROJ-2)` Returns users that are watchers on the issues *PROJ-1* or *PROJ-2*.
     * *
     * `is voter of (PROJ-1, PROJ-2)` Returns users that are voters on the issues *PROJ-1* or *PROJ-2*.
     * *
     * `is commenter of (PROJ-1, PROJ-2)` Returns users that have posted a comment on the issues *PROJ-1* or *PROJ-2*.
     * *
     * `is transitioner of (PROJ-1, PROJ-2)` Returns users that have performed a transition on issues *PROJ-1* or *PROJ-2*.
     * *
     * `[propertyKey].entity.property.path is "property value"` Returns users with the entity property value.
     * The list of issues can be extended as needed, as in *(PROJ-1, PROJ-2, ... PROJ-n)*. Statements can be combined using the `AND` and `OR` operators to form more complex queries. For example:
     * `is assignee of PROJ AND [propertyKey].entity.property.path is "property value"`
     * Authentication - Required Scopes: [read:jira-user]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanUser findUsersByQuery(Consumer<FindUsersByQueryOperationSpec> spec) {
        FindUsersByQueryOperationSpec r = new FindUsersByQueryOperationSpec(spec);
        return api.findUsersByQuery(r.query(), r.startAt(), r.maxResults());
    }

    /**
     * Find users for picker
     * <p>
     * Returns a list of users whose attributes match the query term. The returned object includes the `html` field where the matched query term is highlighted with the HTML strong tag. A list of account IDs can be provided to exclude users from the results.
     * This operation takes the users in the range defined by `maxResults`, up to the thousandth user, and then returns only the users from that range that match the query term. This means the operation usually returns fewer users than specified in `maxResults`. To get all the users who match the query term, use [Get all users](#api-rest-api-2-users-search-get) and filter the records in your code.
     * Privacy controls are applied to the response based on the users' preferences. This could mean, for example, that the user's email address is hidden. See the [Profile visibility overview](https://developer.atlassian.com/cloud/jira/platform/profile-visibility/) for more details.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg). Anonymous calls and calls by users without the required permission return search results for an exact name match only.
     * Authentication - Required Scopes: [read:jira-user]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public FoundUsers findUsersForPicker(Consumer<FindUsersForPickerOperationSpec> spec) {
        FindUsersForPickerOperationSpec r = new FindUsersForPickerOperationSpec(spec);
        return api.findUsersForPicker(r.query(), r.maxResults(), r.showAvatar(), r.exclude(), r.excludeAccountIds(), r.avatarSize(), r.excludeConnectUsers());
    }

    /**
     * Find users with permissions
     * <p>
     * Returns a list of users who fulfill these criteria:
     *  *
     * their user attributes match a search string.
     * *
     * they have a set of permissions for a project or issue.
     * If no search string is provided, a list of all users with the permissions is returned.
     * This operation takes the users in the range defined by `startAt` and `maxResults`, up to the thousandth user, and then returns only the users from that range that match the search string and have permission for the project or issue. This means the operation usually returns fewer users than specified in `maxResults`. To get all the users who match the search string and have permission for the project or issue, use [Get all users](#api-rest-api-2-users-search-get) and filter the records in your code.
     * Privacy controls are applied to the response based on the users' preferences. This could mean, for example, that the user's email address is hidden. See the [Profile visibility overview](https://developer.atlassian.com/cloud/jira/platform/profile-visibility/) for more details.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to get users for any project.
     * *
     * *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project, to get users for that project.
     * Authentication - Required Scopes: [read:jira-user]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<User> findUsersWithAllPermissions(Consumer<FindUsersWithAllPermissionsOperationSpec> spec) {
        FindUsersWithAllPermissionsOperationSpec r = new FindUsersWithAllPermissionsOperationSpec(spec);
        return api.findUsersWithAllPermissions(r.permissions(), r.query(), r.username(), r.accountId(), r.issueKey(), r.projectKey(), r.startAt(), r.maxResults());
    }

    /**
     * Find users with browse permission
     * <p>
     * Returns a list of users who fulfill these criteria:
     *  *
     * their user attributes match a search string.
     * *
     * they have permission to browse issues.
     * Use this resource to find users who can browse:
     *  *
     * an issue, by providing the `issueKey`.
     * *
     * any issue in a project, by providing the `projectKey`.
     * This operation takes the users in the range defined by `startAt` and `maxResults`, up to the thousandth user, and then returns only the users from that range that match the search string and have permission to browse issues. This means the operation usually returns fewer users than specified in `maxResults`. To get all the users who match the search string and have permission to browse issues, use [Get all users](#api-rest-api-2-users-search-get) and filter the records in your code.
     * Privacy controls are applied to the response based on the users' preferences. This could mean, for example, that the user's email address is hidden. See the [Profile visibility overview](https://developer.atlassian.com/cloud/jira/platform/profile-visibility/) for more details.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg). Anonymous calls and calls by users without the required permission return empty search results.
     * Authentication - Required Scopes: [read:jira-user]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<User> findUsersWithBrowsePermission(Consumer<FindUsersWithBrowsePermissionOperationSpec> spec) {
        FindUsersWithBrowsePermissionOperationSpec r = new FindUsersWithBrowsePermissionOperationSpec(spec);
        return api.findUsersWithBrowsePermission(r.query(), r.username(), r.accountId(), r.issueKey(), r.projectKey(), r.startAt(), r.maxResults());
    }

    /**
     * Fully update project role
     * <p>
     * Updates the project role's name and description. You must include both a name and a description in the request.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ProjectRole fullyUpdateProjectRole(Consumer<FullyUpdateProjectRoleOperationSpec> spec) {
        FullyUpdateProjectRoleOperationSpec r = new FullyUpdateProjectRoleOperationSpec(spec);
        return api.fullyUpdateProjectRole(r.id(), r.createUpdateRoleRequestBean());
    }

    /**
     * Get accessible project type by key
     * <p>
     * Returns a [project type](https://confluence.atlassian.com/x/Var1Nw) if it is accessible to the user.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ProjectType getAccessibleProjectTypeByKey(Consumer<GetAccessibleProjectTypeByKeyOperationSpec> spec) {
        GetAccessibleProjectTypeByKeyOperationSpec r = new GetAccessibleProjectTypeByKeyOperationSpec(spec);
        return api.getAccessibleProjectTypeByKey(r.projectTypeKey());
    }

    /**
     * Get advanced settings
     * <p>
     * Returns the application properties that are accessible on the *Advanced Settings* page. To navigate to the *Advanced Settings* page in Jira, choose the Jira icon &amp;gt; **Jira settings** &amp;gt; **System**, **General Configuration** and then click **Advanced Settings** (in the upper right).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<ApplicationProperty> getAdvancedSettings(Consumer<GetAdvancedSettingsOperationSpec> spec) {
        GetAdvancedSettingsOperationSpec r = new GetAdvancedSettingsOperationSpec(spec);
        return api.getAdvancedSettings();
    }

    /**
     * Get licensed project types
     * <p>
     * Returns all [project types](https://confluence.atlassian.com/x/Var1Nw) with a valid license.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<ProjectType> getAllAccessibleProjectTypes(Consumer<GetAllAccessibleProjectTypesOperationSpec> spec) {
        GetAllAccessibleProjectTypesOperationSpec r = new GetAllAccessibleProjectTypesOperationSpec(spec);
        return api.getAllAccessibleProjectTypes();
    }

    /**
     * Get all application roles
     * <p>
     * Returns all application roles. In Jira, application roles are managed using the [Application access configuration](https://confluence.atlassian.com/x/3YxjL) page.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<ApplicationRole> getAllApplicationRoles(Consumer<GetAllApplicationRolesOperationSpec> spec) {
        GetAllApplicationRolesOperationSpec r = new GetAllApplicationRolesOperationSpec(spec);
        return api.getAllApplicationRoles();
    }

    /**
     * Get available gadgets
     * <p>
     * Gets a list of all available gadgets that can be added to all dashboards.
     * **[Permissions](#permissions) required:** None.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public AvailableDashboardGadgetsResponse getAllAvailableDashboardGadgets(Consumer<GetAllAvailableDashboardGadgetsOperationSpec> spec) {
        GetAllAvailableDashboardGadgetsOperationSpec r = new GetAllAvailableDashboardGadgetsOperationSpec(spec);
        return api.getAllAvailableDashboardGadgets();
    }

    /**
     * Get all dashboards
     * <p>
     * Returns a list of dashboards owned by or shared with the user. The list may be filtered to include only favorite or owned dashboards.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageOfDashboards getAllDashboards(Consumer<GetAllDashboardsOperationSpec> spec) {
        GetAllDashboardsOperationSpec r = new GetAllDashboardsOperationSpec(spec);
        return api.getAllDashboards(r.filter(), r.startAt(), r.maxResults());
    }

    /**
     * Get all field configuration schemes
     * <p>
     * Returns a [paginated](#pagination) list of field configuration schemes.
     * Only field configuration schemes used in classic projects are returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanFieldConfigurationScheme getAllFieldConfigurationSchemes(Consumer<GetAllFieldConfigurationSchemesOperationSpec> spec) {
        GetAllFieldConfigurationSchemesOperationSpec r = new GetAllFieldConfigurationSchemesOperationSpec(spec);
        return api.getAllFieldConfigurationSchemes(r.startAt(), r.maxResults(), r.id());
    }

    /**
     * Get all field configurations
     * <p>
     * Returns a [paginated](#pagination) list of field configurations. The list can be for all field configurations or a subset determined by any combination of these criteria:
     *  *
     * a list of field configuration item IDs.
     * *
     * whether the field configuration is a default.
     * *
     * whether the field configuration name or description contains a query string.
     * Only field configurations used in company-managed (classic) projects are returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanFieldConfigurationDetails getAllFieldConfigurations(Consumer<GetAllFieldConfigurationsOperationSpec> spec) {
        GetAllFieldConfigurationsOperationSpec r = new GetAllFieldConfigurationsOperationSpec(spec);
        return api.getAllFieldConfigurations(r.startAt(), r.maxResults(), r.id(), r.isDefault(), r.query());
    }

    /**
     * Get gadgets
     * <p>
     * Returns a list of dashboard gadgets on a dashboard.
     * This operation returns:
     *  *
     * Gadgets from a list of IDs, when `id` is set.
     * *
     * Gadgets with a module key, when `moduleKey` is set.
     * *
     * Gadgets from a list of URIs, when `uri` is set.
     * *
     * All gadgets, when no other parameters are set.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public DashboardGadgetResponse getAllGadgets(Consumer<GetAllGadgetsOperationSpec> spec) {
        GetAllGadgetsOperationSpec r = new GetAllGadgetsOperationSpec(spec);
        return api.getAllGadgets(r.dashboardId(), r.moduleKey(), r.uri(), r.gadgetId());
    }

    /**
     * Get all issue field options
     * <p>
     * Returns a [paginated](#pagination) list of all the options of a select list issue field. A select list issue field is a type of [issue field](https://developer.atlassian.com/cloud/jira/platform/modules/issue-field/) that enables a user to select a value from a list of options.
     * Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanIssueFieldOption getAllIssueFieldOptions(Consumer<GetAllIssueFieldOptionsOperationSpec> spec) {
        GetAllIssueFieldOptionsOperationSpec r = new GetAllIssueFieldOptionsOperationSpec(spec);
        return api.getAllIssueFieldOptions(r.fieldKey(), r.startAt(), r.maxResults());
    }

    /**
     * Get all issue type schemes
     * <p>
     * Returns a [paginated](#pagination) list of issue type schemes.
     * Only issue type schemes used in classic projects are returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanIssueTypeScheme getAllIssueTypeSchemes(Consumer<GetAllIssueTypeSchemesOperationSpec> spec) {
        GetAllIssueTypeSchemesOperationSpec r = new GetAllIssueTypeSchemesOperationSpec(spec);
        return api.getAllIssueTypeSchemes(r.startAt(), r.maxResults(), r.id(), r.orderBy(), r.expand(), r.queryString());
    }

    /**
     * Get all labels
     * <p>
     * Returns a [paginated](#pagination) list of labels.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanString getAllLabels(Consumer<GetAllLabelsOperationSpec> spec) {
        GetAllLabelsOperationSpec r = new GetAllLabelsOperationSpec(spec);
        return api.getAllLabels(r.startAt(), r.maxResults());
    }

    /**
     * Get all permission schemes
     * <p>
     * Returns all permission schemes.
     * ### About permission schemes and grants ###
     * A permission scheme is a collection of permission grants. A permission grant consists of a `holder` and a `permission`.
     * #### Holder object ####
     * The `holder` object contains information about the user or group being granted the permission. For example, the *Administer projects* permission is granted to a group named *Teams in space administrators*. In this case, the type is `"type": "group"`, and the parameter is the group name, `"parameter": "Teams in space administrators"` and the value is group ID, `"value": "ca85fac0-d974-40ca-a615-7af99c48d24f"`. The `holder` object is defined by the following properties:
     *  *
     * `type` Identifies the user or group (see the list of types below).
     * *
     * `parameter` As a group's name can change, use of `value` is recommended. The value of this property depends on the `type`. For example, if the `type` is a group, then you need to specify the group name.
     * *
     * `value` The value of this property depends on the `type`. If the `type` is a group, then you need to specify the group ID. For other `type` it has the same value as `parameter`
     * The following `types` are available. The expected values for `parameter` and `value` are given in parentheses (some types may not have a `parameter` or `value`):
     *  *
     * `anyone` Grant for anonymous users.
     * *
     * `applicationRole` Grant for users with access to the specified application (application name, application name). See [Update product access settings](https://confluence.atlassian.com/x/3YxjL) for more information.
     * *
     * `assignee` Grant for the user currently assigned to an issue.
     * *
     * `group` Grant for the specified group (`parameter` : group name, `value` : group ID).
     * *
     * `groupCustomField` Grant for a user in the group selected in the specified custom field (`parameter` : custom field ID, `value` : custom field ID).
     * *
     * `projectLead` Grant for a project lead.
     * *
     * `projectRole` Grant for the specified project role (`parameter` :project role ID, `value` : project role ID).
     * *
     * `reporter` Grant for the user who reported the issue.
     * *
     * `sd.customer.portal.only` Jira Service Desk only. Grants customers permission to access the customer portal but not Jira. See [Customizing Jira Service Desk permissions](https://confluence.atlassian.com/x/24dKLg) for more information.
     * *
     * `user` Grant for the specified user (`parameter` : user ID - historically this was the userkey but that is deprecated and the account ID should be used, `value` : user ID).
     * *
     * `userCustomField` Grant for a user selected in the specified custom field (`parameter` : custom field ID, `value` : custom field ID).
     * #### Built-in permissions ####
     * The [built-in Jira permissions](https://confluence.atlassian.com/x/yodKLg) are listed below. Apps can also define custom permissions. See the [project permission](https://developer.atlassian.com/cloud/jira/platform/modules/project-permission/) and [global permission](https://developer.atlassian.com/cloud/jira/platform/modules/global-permission/) module documentation for more information.
     * **Project permissions**
     *  *
     * `ADMINISTER_PROJECTS`
     * *
     * `BROWSE_PROJECTS`
     * *
     * `MANAGE_SPRINTS_PERMISSION` (Jira Software only)
     * *
     * `SERVICEDESK_AGENT` (Jira Service Desk only)
     * *
     * `VIEW_DEV_TOOLS` (Jira Software only)
     * *
     * `VIEW_READONLY_WORKFLOW`
     * **Issue permissions**
     *  *
     * `ASSIGNABLE_USER`
     * *
     * `ASSIGN_ISSUES`
     * *
     * `CLOSE_ISSUES`
     * *
     * `CREATE_ISSUES`
     * *
     * `DELETE_ISSUES`
     * *
     * `EDIT_ISSUES`
     * *
     * `LINK_ISSUES`
     * *
     * `MODIFY_REPORTER`
     * *
     * `MOVE_ISSUES`
     * *
     * `RESOLVE_ISSUES`
     * *
     * `SCHEDULE_ISSUES`
     * *
     * `SET_ISSUE_SECURITY`
     * *
     * `TRANSITION_ISSUES`
     * **Voters and watchers permissions**
     *  *
     * `MANAGE_WATCHERS`
     * *
     * `VIEW_VOTERS_AND_WATCHERS`
     * **Comments permissions**
     *  *
     * `ADD_COMMENTS`
     * *
     * `DELETE_ALL_COMMENTS`
     * *
     * `DELETE_OWN_COMMENTS`
     * *
     * `EDIT_ALL_COMMENTS`
     * *
     * `EDIT_OWN_COMMENTS`
     * **Attachments permissions**
     *  *
     * `CREATE_ATTACHMENTS`
     * *
     * `DELETE_ALL_ATTACHMENTS`
     * *
     * `DELETE_OWN_ATTACHMENTS`
     * **Time tracking permissions**
     *  *
     * `DELETE_ALL_WORKLOGS`
     * *
     * `DELETE_OWN_WORKLOGS`
     * *
     * `EDIT_ALL_WORKLOGS`
     * *
     * `EDIT_OWN_WORKLOGS`
     * *
     * `WORK_ON_ISSUES`
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PermissionSchemes getAllPermissionSchemes(Consumer<GetAllPermissionSchemesOperationSpec> spec) {
        GetAllPermissionSchemesOperationSpec r = new GetAllPermissionSchemesOperationSpec(spec);
        return api.getAllPermissionSchemes(r.expand());
    }

    /**
     * Get all permissions
     * <p>
     * Returns all permissions, including:
     *  *
     * global permissions.
     * *
     * project permissions.
     * *
     * global permissions added by plugins.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Permissions getAllPermissions(Consumer<GetAllPermissionsOperationSpec> spec) {
        GetAllPermissionsOperationSpec r = new GetAllPermissionsOperationSpec(spec);
        return api.getAllPermissions();
    }

    /**
     * Get all project avatars
     * <p>
     * Returns all project avatars, grouped by system and custom avatars.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ProjectAvatars getAllProjectAvatars(Consumer<GetAllProjectAvatarsOperationSpec> spec) {
        GetAllProjectAvatarsOperationSpec r = new GetAllProjectAvatarsOperationSpec(spec);
        return api.getAllProjectAvatars(r.projectIdOrKey());
    }

    /**
     * Get all project categories
     * <p>
     * Returns all project categories.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<ProjectCategory> getAllProjectCategories(Consumer<GetAllProjectCategoriesOperationSpec> spec) {
        GetAllProjectCategoriesOperationSpec r = new GetAllProjectCategoriesOperationSpec(spec);
        return api.getAllProjectCategories();
    }

    /**
     * Get all project roles
     * <p>
     * Gets a list of all project roles, complete with project role details and default actors.
     * ### About project roles ###
     * [Project roles](https://confluence.atlassian.com/x/3odKLg) are a flexible way to to associate users and groups with projects. In Jira Cloud, the list of project roles is shared globally with all projects, but each project can have a different set of actors associated with it (unlike groups, which have the same membership throughout all Jira applications).
     * Project roles are used in [permission schemes](#api-rest-api-2-permissionscheme-get), [email notification schemes](#api-rest-api-2-notificationscheme-get), [issue security levels](#api-rest-api-2-issuesecurityschemes-get), [comment visibility](#api-rest-api-2-comment-list-post), and workflow conditions.
     * #### Members and actors ####
     * In the Jira REST API, a member of a project role is called an *actor*. An *actor* is a group or user associated with a project role.
     * Actors may be set as [default members](https://confluence.atlassian.com/x/3odKLg#Managingprojectroles-Specifying'defaultmembers'foraprojectrole) of the project role or set at the project level:
     *  *
     * Default actors: Users and groups that are assigned to the project role for all newly created projects. The default actors can be removed at the project level later if desired.
     * *
     * Actors: Users and groups that are associated with a project role for a project, which may differ from the default actors. This enables you to assign a user to different roles in different projects.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<ProjectRole> getAllProjectRoles(Consumer<GetAllProjectRolesOperationSpec> spec) {
        GetAllProjectRolesOperationSpec r = new GetAllProjectRolesOperationSpec(spec);
        return api.getAllProjectRoles();
    }

    /**
     * Get all project types
     * <p>
     * Returns all [project types](https://confluence.atlassian.com/x/Var1Nw), whether or not the instance has a valid license for each type.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<ProjectType> getAllProjectTypes(Consumer<GetAllProjectTypesOperationSpec> spec) {
        GetAllProjectTypesOperationSpec r = new GetAllProjectTypesOperationSpec(spec);
        return api.getAllProjectTypes();
    }

    /**
     * Get all projects
     * <p>
     * Returns all projects visible to the user. Deprecated, use [ Get projects paginated](#api-rest-api-2-project-search-get) that supports search and pagination.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** Projects are returned only where the user has *Browse Projects* or *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     * @deprecated
     */
    @Deprecated
    public List<Project> getAllProjects(Consumer<GetAllProjectsOperationSpec> spec) {
        GetAllProjectsOperationSpec r = new GetAllProjectsOperationSpec(spec);
        return api.getAllProjects(r.expand(), r.recent(), r.properties());
    }

    /**
     * Get all screen tab fields
     * <p>
     * Returns all fields for a screen tab.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * *
     * *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) when the project key is specified, providing that the screen is associated with the project through a Screen Scheme and Issue Type Screen Scheme.
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<ScreenableField> getAllScreenTabFields(Consumer<GetAllScreenTabFieldsOperationSpec> spec) {
        GetAllScreenTabFieldsOperationSpec r = new GetAllScreenTabFieldsOperationSpec(spec);
        return api.getAllScreenTabFields(r.screenId(), r.tabId(), r.projectKey());
    }

    /**
     * Get all screen tabs
     * <p>
     * Returns the list of tabs for a screen.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * *
     * *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) when the project key is specified, providing that the screen is associated with the project through a Screen Scheme and Issue Type Screen Scheme.
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<ScreenableTab> getAllScreenTabs(Consumer<GetAllScreenTabsOperationSpec> spec) {
        GetAllScreenTabsOperationSpec r = new GetAllScreenTabsOperationSpec(spec);
        return api.getAllScreenTabs(r.screenId(), r.projectKey());
    }

    /**
     * Get all statuses for project
     * <p>
     * Returns the valid statuses for a project. The statuses are grouped by issue type, as each project has a set of valid issue types and each issue type has a set of valid statuses.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<IssueTypeWithStatus> getAllStatuses(Consumer<GetAllStatusesOperationSpec> spec) {
        GetAllStatusesOperationSpec r = new GetAllStatusesOperationSpec(spec);
        return api.getAllStatuses(r.projectIdOrKey());
    }

    /**
     * Get system avatars by type
     * <p>
     * Returns a list of system avatar details by owner type, where the owner types are issue type, project, or user.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public SystemAvatars getAllSystemAvatars(Consumer<GetAllSystemAvatarsOperationSpec> spec) {
        GetAllSystemAvatarsOperationSpec r = new GetAllSystemAvatarsOperationSpec(spec);
        return api.getAllSystemAvatars(r.type());
    }

    /**
     * Get all users
     * <p>
     * Returns a list of all users, including active users, inactive users and previously deleted users that have an Atlassian account.
     * Privacy controls are applied to the response based on the users' preferences. This could mean, for example, that the user's email address is hidden. See the [Profile visibility overview](https://developer.atlassian.com/cloud/jira/platform/profile-visibility/) for more details.
     * **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [read:jira-user]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<User> getAllUsers(Consumer<GetAllUsersOperationSpec> spec) {
        GetAllUsersOperationSpec r = new GetAllUsersOperationSpec(spec);
        return api.getAllUsers(r.startAt(), r.maxResults());
    }

    /**
     * Get all users default
     * <p>
     * Returns a list of all users, including active users, inactive users and previously deleted users that have an Atlassian account.
     * Privacy controls are applied to the response based on the users' preferences. This could mean, for example, that the user's email address is hidden. See the [Profile visibility overview](https://developer.atlassian.com/cloud/jira/platform/profile-visibility/) for more details.
     * **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [read:jira-user]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<User> getAllUsersDefault(Consumer<GetAllUsersDefaultOperationSpec> spec) {
        GetAllUsersDefaultOperationSpec r = new GetAllUsersDefaultOperationSpec(spec);
        return api.getAllUsersDefault(r.startAt(), r.maxResults());
    }

    /**
     * Get all workflow schemes
     * <p>
     * Returns a [paginated](#pagination) list of all workflow schemes, not including draft workflow schemes.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanWorkflowScheme getAllWorkflowSchemes(Consumer<GetAllWorkflowSchemesOperationSpec> spec) {
        GetAllWorkflowSchemesOperationSpec r = new GetAllWorkflowSchemesOperationSpec(spec);
        return api.getAllWorkflowSchemes(r.startAt(), r.maxResults());
    }

    /**
     * Get all workflows
     * <p>
     * Returns all workflows in Jira or a workflow. Deprecated, use [Get workflows paginated](#api-rest-api-2-workflow-search-get).
     * If the `workflowName` parameter is specified, the workflow is returned as an object (not in an array). Otherwise, an array of workflow objects is returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     * @deprecated
     */
    @Deprecated
    public List<DeprecatedWorkflow> getAllWorkflows(Consumer<GetAllWorkflowsOperationSpec> spec) {
        GetAllWorkflowsOperationSpec r = new GetAllWorkflowsOperationSpec(spec);
        return api.getAllWorkflows(r.workflowName());
    }

    /**
     * Get alternative issue types
     * <p>
     * Returns a list of issue types that can be used to replace the issue type. The alternative issue types are those assigned to the same workflow scheme, field configuration scheme, and screen scheme.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<IssueTypeDetails> getAlternativeIssueTypes(Consumer<GetAlternativeIssueTypesOperationSpec> spec) {
        GetAlternativeIssueTypesOperationSpec r = new GetAlternativeIssueTypesOperationSpec(spec);
        return api.getAlternativeIssueTypes(r.id());
    }

    /**
     * Get application property
     * <p>
     * Returns all application properties or an application property.
     * If you specify a value for the `key` parameter, then an application property is returned as an object (not in an array). Otherwise, an array of all editable application properties is returned. See [Set application property](#api-rest-api-2-application-properties-id-put) for descriptions of editable properties.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<ApplicationProperty> getApplicationProperty(Consumer<GetApplicationPropertyOperationSpec> spec) {
        GetApplicationPropertyOperationSpec r = new GetApplicationPropertyOperationSpec(spec);
        return api.getApplicationProperty(r.key(), r.permissionLevel(), r.keyFilter());
    }

    /**
     * Get application role
     * <p>
     * Returns an application role.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ApplicationRole getApplicationRole(Consumer<GetApplicationRoleOperationSpec> spec) {
        GetApplicationRoleOperationSpec r = new GetApplicationRoleOperationSpec(spec);
        return api.getApplicationRole(r.key());
    }

    /**
     * Get approximate application license count
     * <p>
     * Returns the total approximate number of user accounts for a single Jira license. Note that this information is cached with a 7-day lifecycle and could be stale at the time of call.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public LicenseMetric getApproximateApplicationLicenseCount(Consumer<GetApproximateApplicationLicenseCountOperationSpec> spec) {
        GetApproximateApplicationLicenseCountOperationSpec r = new GetApproximateApplicationLicenseCountOperationSpec(spec);
        return api.getApproximateApplicationLicenseCount(r.applicationKey());
    }

    /**
     * Get approximate license count
     * <p>
     * Returns the approximate number of user accounts across all Jira licenses. Note that this information is cached with a 7-day lifecycle and could be stale at the time of call.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public LicenseMetric getApproximateLicenseCount(Consumer<GetApproximateLicenseCountOperationSpec> spec) {
        GetApproximateLicenseCountOperationSpec r = new GetApproximateLicenseCountOperationSpec(spec);
        return api.getApproximateLicenseCount();
    }

    /**
     * Get assigned permission scheme
     * <p>
     * Gets the [permission scheme](https://confluence.atlassian.com/x/yodKLg) associated with the project.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PermissionScheme getAssignedPermissionScheme(Consumer<GetAssignedPermissionSchemeOperationSpec> spec) {
        GetAssignedPermissionSchemeOperationSpec r = new GetAssignedPermissionSchemeOperationSpec(spec);
        return api.getAssignedPermissionScheme(r.projectKeyOrId(), r.expand());
    }

    /**
     * Get attachment metadata
     * <p>
     * Returns the metadata for an attachment. Note that the attachment itself is not returned.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public AttachmentMetadata getAttachment(Consumer<GetAttachmentOperationSpec> spec) {
        GetAttachmentOperationSpec r = new GetAttachmentOperationSpec(spec);
        return api.getAttachment(r.id());
    }

    /**
     * Get attachment content
     * <p>
     * Returns the contents of an attachment. A `Range` header can be set to define a range of bytes within the attachment to download. See the [HTTP Range header standard](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Range) for details.
     * To return a thumbnail of the attachment, use [Get attachment thumbnail](#api-rest-api-2-attachment-thumbnail-id-get).
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** For the issue containing the attachment:
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object getAttachmentContent(Consumer<GetAttachmentContentOperationSpec> spec) {
        GetAttachmentContentOperationSpec r = new GetAttachmentContentOperationSpec(spec);
        return api.getAttachmentContent(r.id(), r.redirect());
    }

    /**
     * Get Jira attachment settings
     * <p>
     * Returns the attachment settings, that is, whether attachments are enabled and the maximum attachment size allowed.
     * Note that there are also [project permissions](https://confluence.atlassian.com/x/yodKLg) that restrict whether users can create and delete attachments.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public AttachmentSettings getAttachmentMeta(Consumer<GetAttachmentMetaOperationSpec> spec) {
        GetAttachmentMetaOperationSpec r = new GetAttachmentMetaOperationSpec(spec);
        return api.getAttachmentMeta();
    }

    /**
     * Get attachment thumbnail
     * <p>
     * Returns the thumbnail of an attachment.
     * To return the attachment contents, use [Get attachment content](#api-rest-api-2-attachment-content-id-get).
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** For the issue containing the attachment:
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object getAttachmentThumbnail(Consumer<GetAttachmentThumbnailOperationSpec> spec) {
        GetAttachmentThumbnailOperationSpec r = new GetAttachmentThumbnailOperationSpec(spec);
        return api.getAttachmentThumbnail(r.id(), r.redirect(), r.fallbackToDefault(), r.width(), r.height());
    }

    /**
     * Get audit records
     * <p>
     * Returns a list of audit records. The list can be filtered to include items:
     *  *
     * where each item in `filter` has at least one match in any of these fields:
     * 
     * 
     * 
     * 
     *  *
     * `summary`
     * 
     * 
     * *
     * `category`
     * 
     * 
     * *
     * `eventSource`
     * 
     * 
     * *
     * `objectItem.name` If the object is a user, account ID is available to filter.
     * 
     * 
     * *
     * `objectItem.parentName`
     * 
     * 
     * *
     * `objectItem.typeName`
     * 
     * 
     * *
     * `changedValues.changedFrom`
     * 
     * 
     * *
     * `changedValues.changedTo`
     * 
     * 
     * *
     * `remoteAddress`
     * 
     * 
     * 
     * 
     * For example, if `filter` contains *man ed*, an audit record containing `summary": "User added to group"` and `"category": "group management"` is returned.
     * *
     * created on or after a date and time.
     * *
     * created or or before a date and time.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public AuditRecords getAuditRecords(Consumer<GetAuditRecordsOperationSpec> spec) {
        GetAuditRecordsOperationSpec r = new GetAuditRecordsOperationSpec(spec);
        return api.getAuditRecords(r.offset(), r.limit(), r.filter(), r.from(), r.to());
    }

    /**
     * Get field reference data (GET)
     * <p>
     * Returns reference data for JQL searches. This is a downloadable version of the documentation provided in [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ) and [Advanced searching - functions reference](https://confluence.atlassian.com/x/hgORLQ), along with a list of JQL-reserved words. Use this information to assist with the programmatic creation of JQL queries or the validation of queries built in a custom query builder.
     * To filter visible field details by project or collapse non-unique fields by field type then [Get field reference data (POST)](#api-rest-api-2-jql-autocompletedata-post) can be used.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public JQLReferenceData getAutoComplete(Consumer<GetAutoCompleteOperationSpec> spec) {
        GetAutoCompleteOperationSpec r = new GetAutoCompleteOperationSpec(spec);
        return api.getAutoComplete();
    }

    /**
     * Get field reference data (POST)
     * <p>
     * Returns reference data for JQL searches. This is a downloadable version of the documentation provided in [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ) and [Advanced searching - functions reference](https://confluence.atlassian.com/x/hgORLQ), along with a list of JQL-reserved words. Use this information to assist with the programmatic creation of JQL queries or the validation of queries built in a custom query builder.
     * This operation can filter the custom fields returned by project. Invalid project IDs in `projectIds` are ignored. System fields are always returned.
     * It can also return the collapsed field for custom fields. Collapsed fields enable searches to be performed across all fields with the same name and of the same field type. For example, the collapsed field `Component - Component[Dropdown]` enables dropdown fields `Component - cf[10061]` and `Component - cf[10062]` to be searched simultaneously.
     * **[Permissions](#permissions) required:** None.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public JQLReferenceData getAutoCompletePost(Consumer<GetAutoCompletePostOperationSpec> spec) {
        GetAutoCompletePostOperationSpec r = new GetAutoCompletePostOperationSpec(spec);
        return api.getAutoCompletePost(r.searchAutoCompleteFilter());
    }

    /**
     * Get available screen fields
     * <p>
     * Returns the fields that can be added to a tab on a screen.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<ScreenableField> getAvailableScreenFields(Consumer<GetAvailableScreenFieldsOperationSpec> spec) {
        GetAvailableScreenFieldsOperationSpec r = new GetAvailableScreenFieldsOperationSpec(spec);
        return api.getAvailableScreenFields(r.screenId());
    }

    /**
     * Get all time tracking providers
     * <p>
     * Returns all time tracking providers. By default, Jira only has one time tracking provider: *JIRA provided time tracking*. However, you can install other time tracking providers via apps from the Atlassian Marketplace. For more information on time tracking providers, see the documentation for the [ Time Tracking Provider](https://developer.atlassian.com/cloud/jira/platform/modules/time-tracking-provider/) module.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<TimeTrackingProvider> getAvailableTimeTrackingImplementations(Consumer<GetAvailableTimeTrackingImplementationsOperationSpec> spec) {
        GetAvailableTimeTrackingImplementationsOperationSpec r = new GetAvailableTimeTrackingImplementationsOperationSpec(spec);
        return api.getAvailableTimeTrackingImplementations();
    }

    /**
     * Get avatar image by ID
     * <p>
     * Returns a project or issue type avatar image by ID.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * For system avatars, none.
     * *
     * For custom project avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project the avatar belongs to.
     * *
     * For custom issue type avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one project the issue type is used in.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void getAvatarImageByID(Consumer<GetAvatarImageByIDOperationSpec> spec) {
        GetAvatarImageByIDOperationSpec r = new GetAvatarImageByIDOperationSpec(spec);
        api.getAvatarImageByID(r.type(), r.id(), r.size(), r.format());
    }

    /**
     * Get avatar image by owner
     * <p>
     * Returns the avatar image for a project or issue type.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * For system avatars, none.
     * *
     * For custom project avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project the avatar belongs to.
     * *
     * For custom issue type avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one project the issue type is used in.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void getAvatarImageByOwner(Consumer<GetAvatarImageByOwnerOperationSpec> spec) {
        GetAvatarImageByOwnerOperationSpec r = new GetAvatarImageByOwnerOperationSpec(spec);
        api.getAvatarImageByOwner(r.type(), r.entityId(), r.size(), r.format());
    }

    /**
     * Get avatar image by type
     * <p>
     * Returns the default project or issue type avatar image.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void getAvatarImageByType(Consumer<GetAvatarImageByTypeOperationSpec> spec) {
        GetAvatarImageByTypeOperationSpec r = new GetAvatarImageByTypeOperationSpec(spec);
        api.getAvatarImageByType(r.type(), r.size(), r.format());
    }

    /**
     * Get avatars
     * <p>
     * Returns the system and custom avatars for a project or issue type.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * for custom project avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project the avatar belongs to.
     * *
     * for custom issue type avatars, *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one project the issue type is used in.
     * *
     * for system avatars, none.
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Avatars getAvatars(Consumer<GetAvatarsOperationSpec> spec) {
        GetAvatarsOperationSpec r = new GetAvatarsOperationSpec(spec);
        return api.getAvatars(r.type(), r.entityId());
    }

    /**
     * Get announcement banner configuration
     * <p>
     * Returns the current announcement banner configuration.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public AnnouncementBannerConfiguration getBanner(Consumer<GetBannerOperationSpec> spec) {
        GetBannerOperationSpec r = new GetBannerOperationSpec(spec);
        return api.getBanner();
    }

    /**
     * Get bulk permissions
     * <p>
     * Returns:
     *  *
     * for a list of global permissions, the global permissions granted to a user.
     * *
     * for a list of project permissions and lists of projects and issues, for each project permission a list of the projects and issues a user can access or manipulate.
     * If no account ID is provided, the operation returns details for the logged in user.
     * Note that:
     *  *
     * Invalid project and issue IDs are ignored.
     * *
     * A maximum of 1000 projects and 1000 issues can be checked.
     * *
     * Null values in `globalPermissions`, `projectPermissions`, `projectPermissions.projects`, and `projectPermissions.issues` are ignored.
     * *
     * Empty strings in `projectPermissions.permissions` are ignored.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) to check the permissions for other users, otherwise none. However, Connect apps can make a call from the app server to the product to obtain permission details for any user, without admin permission. This Connect app ability doesn't apply to calls made using AP.request() in a browser.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public BulkPermissionGrants getBulkPermissions(Consumer<GetBulkPermissionsOperationSpec> spec) {
        GetBulkPermissionsOperationSpec r = new GetBulkPermissionsOperationSpec(spec);
        return api.getBulkPermissions(r.bulkPermissionsRequestBean());
    }

    /**
     * Get changelogs
     * <p>
     * Returns a [paginated](#pagination) list of all changelogs for an issue sorted by date, starting from the oldest.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanChangelog getChangeLogs(Consumer<GetChangeLogsOperationSpec> spec) {
        GetChangeLogsOperationSpec r = new GetChangeLogsOperationSpec(spec);
        return api.getChangeLogs(r.issueIdOrKey(), r.startAt(), r.maxResults());
    }

    /**
     * Get changelogs by IDs
     * <p>
     * Returns changelogs for an issue specified by a list of changelog IDs.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageOfChangelogs getChangeLogsByIds(Consumer<GetChangeLogsByIdsOperationSpec> spec) {
        GetChangeLogsByIdsOperationSpec r = new GetChangeLogsByIdsOperationSpec(spec);
        return api.getChangeLogsByIds(r.issueIdOrKey(), r.issueChangelogIds());
    }

    /**
     * Get columns
     * <p>
     * Returns the columns configured for a filter. The column configuration is used when the filter's results are viewed in *List View* with the *Columns* set to *Filter*.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None, however, column details are only returned for:
     *  *
     * filters owned by the user.
     * *
     * filters shared with a group that the user is a member of.
     * *
     * filters shared with a private project that the user has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.
     * *
     * filters shared with a public project.
     * *
     * filters shared with the public.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<ColumnItem> getColumns(Consumer<GetColumnsOperationSpec> spec) {
        GetColumnsOperationSpec r = new GetColumnsOperationSpec(spec);
        return api.getColumns(r.id());
    }

    /**
     * Get comment
     * <p>
     * Returns a comment.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the comment.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * *
     * If the comment has visibility restrictions, the user belongs to the group or has the role visibility is restricted to.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Comment getComment(Consumer<GetCommentOperationSpec> spec) {
        GetCommentOperationSpec r = new GetCommentOperationSpec(spec);
        return api.getComment(r.issueIdOrKey(), r.id(), r.expand());
    }

    /**
     * Get comment property
     * <p>
     * Returns the value of a comment property.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * *
     * If the comment has visibility restrictions, belongs to the group or has the role visibility is restricted to.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public EntityProperty getCommentProperty(Consumer<GetCommentPropertyOperationSpec> spec) {
        GetCommentPropertyOperationSpec r = new GetCommentPropertyOperationSpec(spec);
        return api.getCommentProperty(r.commentId(), r.propertyKey());
    }

    /**
     * Get comment property keys
     * <p>
     * Returns the keys of all the properties of a comment.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * *
     * If the comment has visibility restrictions, belongs to the group or has the role visibility is restricted to.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PropertyKeys getCommentPropertyKeys(Consumer<GetCommentPropertyKeysOperationSpec> spec) {
        GetCommentPropertyKeysOperationSpec r = new GetCommentPropertyKeysOperationSpec(spec);
        return api.getCommentPropertyKeys(r.commentId());
    }

    /**
     * Get comments
     * <p>
     * Returns all comments for an issue.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** Comments are included in the response where the user has:
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the comment.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * *
     * If the comment has visibility restrictions, belongs to the group or has the role visibility is role visibility is restricted to.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageOfComments getComments(Consumer<GetCommentsOperationSpec> spec) {
        GetCommentsOperationSpec r = new GetCommentsOperationSpec(spec);
        return api.getComments(r.issueIdOrKey(), r.startAt(), r.maxResults(), r.orderBy(), r.expand());
    }

    /**
     * Get comments by IDs
     * <p>
     * Returns a [paginated](#pagination) list of comments specified by a list of comment IDs.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** Comments are returned where the user:
     *  *
     * has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the comment.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * *
     * If the comment has visibility restrictions, belongs to the group or has the role visibility is restricted to.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanComment getCommentsByIds(Consumer<GetCommentsByIdsOperationSpec> spec) {
        GetCommentsByIdsOperationSpec r = new GetCommentsByIdsOperationSpec(spec);
        return api.getCommentsByIds(r.issueCommentListRequestBean(), r.expand());
    }

    /**
     * Get component
     * <p>
     * Returns a component.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for project containing the component.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ProjectComponent getComponent(Consumer<GetComponentOperationSpec> spec) {
        GetComponentOperationSpec r = new GetComponentOperationSpec(spec);
        return api.getComponent(r.id());
    }

    /**
     * Get component issues count
     * <p>
     * Returns the counts of issues assigned to the component.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ComponentIssuesCount getComponentRelatedIssues(Consumer<GetComponentRelatedIssuesOperationSpec> spec) {
        GetComponentRelatedIssuesOperationSpec r = new GetComponentRelatedIssuesOperationSpec(spec);
        return api.getComponentRelatedIssues(r.id());
    }

    /**
     * Get global settings
     * <p>
     * Returns the [global settings](https://confluence.atlassian.com/x/qYXKM) in Jira. These settings determine whether optional features (for example, subtasks, time tracking, and others) are enabled. If time tracking is enabled, this operation also returns the time tracking configuration.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [read:jira-user]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ModelConfiguration getConfiguration(Consumer<GetConfigurationOperationSpec> spec) {
        GetConfigurationOperationSpec r = new GetConfigurationOperationSpec(spec);
        return api.getConfiguration();
    }

    /**
     * Get custom field contexts
     * <p>
     * Returns a [paginated](#pagination) list of [ contexts](https://confluence.atlassian.com/adminjiracloud/what-are-custom-field-contexts-991923859.html) for a custom field. Contexts can be returned as follows:
     *  *
     * With no other parameters set, all contexts.
     * *
     * By defining `id` only, all contexts from the list of IDs.
     * *
     * By defining `isAnyIssueType`, limit the list of contexts returned to either those that apply to all issue types (true) or those that apply to only a subset of issue types (false)
     * *
     * By defining `isGlobalContext`, limit the list of contexts return to either those that apply to all projects (global contexts) (true) or those that apply to only a subset of projects (false).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanCustomFieldContext getContextsForField(Consumer<GetContextsForFieldOperationSpec> spec) {
        GetContextsForFieldOperationSpec r = new GetContextsForFieldOperationSpec(spec);
        return api.getContextsForField(r.fieldId(), r.isAnyIssueType(), r.isGlobalContext(), r.contextId(), r.startAt(), r.maxResults());
    }

    /**
     * Get contexts for a field
     * <p>
     * Returns a [paginated](#pagination) list of the contexts a field is used in. Deprecated, use [ Get custom field contexts](#api-rest-api-2-field-fieldId-context-get).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     * @deprecated
     */
    @Deprecated
    public PageBeanContext getContextsForFieldDeprecated(Consumer<GetContextsForFieldDeprecatedOperationSpec> spec) {
        GetContextsForFieldDeprecatedOperationSpec r = new GetContextsForFieldDeprecatedOperationSpec(spec);
        return api.getContextsForFieldDeprecated(r.fieldId(), r.startAt(), r.maxResults());
    }

    /**
     * Get create issue metadata
     * <p>
     * Returns details of projects, issue types within projects, and, when requested, the create screen fields for each issue type for the user. Use the information to populate the requests in [ Create issue](#api-rest-api-2-issue-post) and [Create issues](#api-rest-api-2-issue-bulk-post).
     * The request can be restricted to specific projects or issue types using the query parameters. The response will contain information for the valid projects, issue types, or project and issue type combinations requested. Note that invalid project, issue type, or project and issue type combinations do not generate errors.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Create issues* [project permission](https://confluence.atlassian.com/x/yodKLg) in the requested projects.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public IssueCreateMetadata getCreateIssueMeta(Consumer<GetCreateIssueMetaOperationSpec> spec) {
        GetCreateIssueMetaOperationSpec r = new GetCreateIssueMetaOperationSpec(spec);
        return api.getCreateIssueMeta(r.projectIds(), r.projectKeys(), r.issuetypeIds(), r.issuetypeNames(), r.expand());
    }

    /**
     * Get current user
     * <p>
     * Returns details for the current user.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [read:jira-user]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public User getCurrentUser(Consumer<GetCurrentUserOperationSpec> spec) {
        GetCurrentUserOperationSpec r = new GetCurrentUserOperationSpec(spec);
        return api.getCurrentUser(r.expand());
    }

    /**
     * Get custom field configurations
     * <p>
     * Returns a [paginated](#pagination) list of configurations for a custom field created by a [Forge app](https://developer.atlassian.com/platform/forge/).
     * The result can be filtered by one of these criteria:
     *  *
     * `id`.
     * *
     * `fieldContextId`.
     * *
     * `issueId`.
     * *
     * `projectKeyOrId` and `issueTypeId`.
     * Otherwise, all configurations are returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the Forge app that created the custom field.
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanContextualConfiguration getCustomFieldConfiguration(Consumer<GetCustomFieldConfigurationOperationSpec> spec) {
        GetCustomFieldConfigurationOperationSpec r = new GetCustomFieldConfigurationOperationSpec(spec);
        return api.getCustomFieldConfiguration(r.fieldIdOrKey(), r.id(), r.fieldContextId(), r.issueId(), r.projectKeyOrId(), r.issueTypeId(), r.startAt(), r.maxResults());
    }

    /**
     * Get custom field contexts for projects and issue types
     * <p>
     * Returns a [paginated](#pagination) list of project and issue type mappings and, for each mapping, the ID of a [custom field context](https://confluence.atlassian.com/x/k44fOw) that applies to the project and issue type.
     * If there is no custom field context assigned to the project then, if present, the custom field context that applies to all projects is returned if it also applies to the issue type or all issue types. If a custom field context is not found, the returned custom field context ID is `null`.
     * Duplicate project and issue type mappings cannot be provided in the request.
     * The order of the returned values is the same as provided in the request.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanContextForProjectAndIssueType getCustomFieldContextsForProjectsAndIssueTypes(Consumer<GetCustomFieldContextsForProjectsAndIssueTypesOperationSpec> spec) {
        GetCustomFieldContextsForProjectsAndIssueTypesOperationSpec r = new GetCustomFieldContextsForProjectsAndIssueTypesOperationSpec(spec);
        return api.getCustomFieldContextsForProjectsAndIssueTypes(r.fieldId(), r.projectIssueTypeMappings(), r.startAt(), r.maxResults());
    }

    /**
     * Get custom field option
     * <p>
     * Returns a custom field option. For example, an option in a select list.
     * Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect apps.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** The custom field option is returned as follows:
     *  *
     * if the user has the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * *
     * if the user has the *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one project the custom field is used in, and the field is visible in at least one layout the user has permission to view.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public CustomFieldOption getCustomFieldOption(Consumer<GetCustomFieldOptionOperationSpec> spec) {
        GetCustomFieldOptionOperationSpec r = new GetCustomFieldOptionOperationSpec(spec);
        return api.getCustomFieldOption(r.id());
    }

    /**
     * Get dashboard
     * <p>
     * Returns a dashboard.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     * However, to get a dashboard, the dashboard must be shared with the user or the user must own it. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. The System dashboard is considered to be shared with all other users.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Dashboard getDashboard(Consumer<GetDashboardOperationSpec> spec) {
        GetDashboardOperationSpec r = new GetDashboardOperationSpec(spec);
        return api.getDashboard(r.id());
    }

    /**
     * Get dashboard item property
     * <p>
     * Returns the key and value of a dashboard item property.
     * A dashboard item enables an app to add user-specific information to a user dashboard. Dashboard items are exposed to users as gadgets that users can add to their dashboards. For more information on how users do this, see [Adding and customizing gadgets](https://confluence.atlassian.com/x/7AeiLQ).
     * When an app creates a dashboard item it registers a callback to receive the dashboard item ID. The callback fires whenever the item is rendered or, where the item is configurable, the user edits the item. The app then uses this resource to store the item's content or configuration details. For more information on working with dashboard items, see [ Building a dashboard item for a JIRA Connect add-on](https://developer.atlassian.com/server/jira/platform/guide-building-a-dashboard-item-for-a-jira-connect-add-on-33746254/) and the [Dashboard Item](https://developer.atlassian.com/cloud/jira/platform/modules/dashboard-item/) documentation.
     * There is no resource to set or get dashboard items.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** The user must be the owner of the dashboard or have the dashboard shared with them. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. The System dashboard is considered to be shared with all other users, and is accessible to anonymous users when Jira’s anonymous access is permitted.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public EntityProperty getDashboardItemProperty(Consumer<GetDashboardItemPropertyOperationSpec> spec) {
        GetDashboardItemPropertyOperationSpec r = new GetDashboardItemPropertyOperationSpec(spec);
        return api.getDashboardItemProperty(r.dashboardId(), r.itemId(), r.propertyKey());
    }

    /**
     * Get dashboard item property keys
     * <p>
     * Returns the keys of all properties for a dashboard item.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** The user must be the owner of the dashboard or have the dashboard shared with them. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. The System dashboard is considered to be shared with all other users, and is accessible to anonymous users when Jira’s anonymous access is permitted.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PropertyKeys getDashboardItemPropertyKeys(Consumer<GetDashboardItemPropertyKeysOperationSpec> spec) {
        GetDashboardItemPropertyKeysOperationSpec r = new GetDashboardItemPropertyKeysOperationSpec(spec);
        return api.getDashboardItemPropertyKeys(r.dashboardId(), r.itemId());
    }

    /**
     * Search for dashboards
     * <p>
     * Returns a [paginated](#pagination) list of dashboards. This operation is similar to [Get dashboards](#api-rest-api-2-dashboard-get) except that the results can be refined to include dashboards that have specific attributes. For example, dashboards with a particular name. When multiple attributes are specified only filters matching all attributes are returned.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** The following dashboards that match the query parameters are returned:
     *  *
     * Dashboards owned by the user. Not returned for anonymous users.
     * *
     * Dashboards shared with a group that the user is a member of. Not returned for anonymous users.
     * *
     * Dashboards shared with a private project that the user can browse. Not returned for anonymous users.
     * *
     * Dashboards shared with a public project.
     * *
     * Dashboards shared with the public.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanDashboard getDashboardsPaginated(Consumer<GetDashboardsPaginatedOperationSpec> spec) {
        GetDashboardsPaginatedOperationSpec r = new GetDashboardsPaginatedOperationSpec(spec);
        return api.getDashboardsPaginated(r.dashboardName(), r.accountId(), r.owner(), r.groupname(), r.groupId(), r.projectId(), r.orderBy(), r.startAt(), r.maxResults(), r.status(), r.expand());
    }

    /**
     * Get default share scope
     * <p>
     * Returns the default sharing settings for new filters and dashboards for a user.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public DefaultShareScope getDefaultShareScope(Consumer<GetDefaultShareScopeOperationSpec> spec) {
        GetDefaultShareScopeOperationSpec r = new GetDefaultShareScopeOperationSpec(spec);
        return api.getDefaultShareScope();
    }

    /**
     * Get custom field contexts default values
     * <p>
     * Returns a [paginated](#pagination) list of defaults for a custom field. The results can be filtered by `contextId`, otherwise all values are returned. If no defaults are set for a context, nothing is returned.
     *  The returned object depends on type of the custom field:
     *  *
     * `CustomFieldContextDefaultValueDate` (type `datepicker`) for date fields.
     * *
     * `CustomFieldContextDefaultValueDateTime` (type `datetimepicker`) for date-time fields.
     * *
     * `CustomFieldContextDefaultValueSingleOption` (type `option.single`) for single choice select lists and radio buttons.
     * *
     * `CustomFieldContextDefaultValueMultipleOption` (type `option.multiple`) for multiple choice select lists and checkboxes.
     * *
     * `CustomFieldContextDefaultValueCascadingOption` (type `option.cascading`) for cascading select lists.
     * *
     * `CustomFieldContextSingleUserPickerDefaults` (type `single.user.select`) for single users.
     * *
     * `CustomFieldContextDefaultValueMultiUserPicker` (type `multi.user.select`) for user lists.
     * *
     * `CustomFieldContextDefaultValueSingleGroupPicker` (type `grouppicker.single`) for single choice group pickers.
     * *
     * `CustomFieldContextDefaultValueMultipleGroupPicker` (type `grouppicker.multiple`) for multiple choice group pickers.
     * *
     * `CustomFieldContextDefaultValueURL` (type `url`) for URLs.
     * *
     * `CustomFieldContextDefaultValueProject` (type `project`) for project pickers.
     * *
     * `CustomFieldContextDefaultValueFloat` (type `float`) for floats (floating-point numbers).
     * *
     * `CustomFieldContextDefaultValueLabels` (type `labels`) for labels.
     * *
     * `CustomFieldContextDefaultValueTextField` (type `textfield`) for text fields.
     * *
     * `CustomFieldContextDefaultValueTextArea` (type `textarea`) for text area fields.
     * *
     * `CustomFieldContextDefaultValueReadOnly` (type `readonly`) for read only (text) fields.
     * *
     * `CustomFieldContextDefaultValueMultipleVersion` (type `version.multiple`) for single choice version pickers.
     * *
     * `CustomFieldContextDefaultValueSingleVersion` (type `version.single`) for multiple choice version pickers.
     * Forge custom fields [types](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field-type/#data-types) are also supported, returning:
     *  *
     * `CustomFieldContextDefaultValueForgeStringFieldBean` (type `forge.string`) for Forge string fields.
     * *
     * `CustomFieldContextDefaultValueForgeMultiStringFieldBean` (type `forge.string.list`) for Forge string collection fields.
     * *
     * `CustomFieldContextDefaultValueForgeObjectFieldBean` (type `forge.object`) for Forge object fields.
     * *
     * `CustomFieldContextDefaultValueForgeDateTimeFieldBean` (type `forge.datetime`) for Forge date-time fields.
     * *
     * `CustomFieldContextDefaultValueForgeGroupFieldBean` (type `forge.group`) for Forge group fields.
     * *
     * `CustomFieldContextDefaultValueForgeMultiGroupFieldBean` (type `forge.group.list`) for Forge group collection fields.
     * *
     * `CustomFieldContextDefaultValueForgeNumberFieldBean` (type `forge.number`) for Forge number fields.
     * *
     * `CustomFieldContextDefaultValueForgeUserFieldBean` (type `forge.user`) for Forge user fields.
     * *
     * `CustomFieldContextDefaultValueForgeMultiUserFieldBean` (type `forge.user.list`) for Forge user collection fields.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanCustomFieldContextDefaultValue getDefaultValues(Consumer<GetDefaultValuesOperationSpec> spec) {
        GetDefaultValuesOperationSpec r = new GetDefaultValuesOperationSpec(spec);
        return api.getDefaultValues(r.fieldId(), r.contextId(), r.startAt(), r.maxResults());
    }

    /**
     * Get default workflow
     * <p>
     * Returns the default workflow for a workflow scheme. The default workflow is the workflow that is assigned any issue types that have not been mapped to any other workflow. The default workflow has *All Unassigned Issue Types* listed in its issue types for the workflow scheme in Jira.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public DefaultWorkflow getDefaultWorkflow(Consumer<GetDefaultWorkflowOperationSpec> spec) {
        GetDefaultWorkflowOperationSpec r = new GetDefaultWorkflowOperationSpec(spec);
        return api.getDefaultWorkflow(r.id(), r.returnDraftIfExists());
    }

    /**
     * Get draft default workflow
     * <p>
     * Returns the default workflow for a workflow scheme's draft. The default workflow is the workflow that is assigned any issue types that have not been mapped to any other workflow. The default workflow has *All Unassigned Issue Types* listed in its issue types for the workflow scheme in Jira.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public DefaultWorkflow getDraftDefaultWorkflow(Consumer<GetDraftDefaultWorkflowOperationSpec> spec) {
        GetDraftDefaultWorkflowOperationSpec r = new GetDraftDefaultWorkflowOperationSpec(spec);
        return api.getDraftDefaultWorkflow(r.id());
    }

    /**
     * Get issue types for workflows in draft workflow scheme
     * <p>
     * Returns the workflow-issue type mappings for a workflow scheme's draft.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public IssueTypesWorkflowMapping getDraftWorkflow(Consumer<GetDraftWorkflowOperationSpec> spec) {
        GetDraftWorkflowOperationSpec r = new GetDraftWorkflowOperationSpec(spec);
        return api.getDraftWorkflow(r.id(), r.workflowName());
    }

    /**
     * Get dynamic webhooks for app
     * <p>
     * Returns a [paginated](#pagination) list of the webhooks registered by the calling app.
     * **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/#connect-apps) and [OAuth 2.0](https://developer.atlassian.com/cloud/jira/platform/oauth-2-3lo-apps) apps can use this operation.
     * Authentication - Required Scopes: [read:jira-work, manage:jira-webhook]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanWebhook getDynamicWebhooksForApp(Consumer<GetDynamicWebhooksForAppOperationSpec> spec) {
        GetDynamicWebhooksForAppOperationSpec r = new GetDynamicWebhooksForAppOperationSpec(spec);
        return api.getDynamicWebhooksForApp(r.startAt(), r.maxResults());
    }

    /**
     * Get edit issue metadata
     * <p>
     * Returns the edit screen fields for an issue that are visible to and editable by the user. Use the information to populate the requests in [Edit issue](#api-rest-api-2-issue-issueIdOrKey-put).
     * This endpoint will check for these conditions:
     * 1.
     * Field is available on a field screen - through screen, screen scheme, issue type screen scheme, and issue type scheme configuration. `overrideScreenSecurity=true` skips this condition. 2.
     * Field is visible in the [field configuration](https://support.atlassian.com/jira-cloud-administration/docs/change-a-field-configuration/). `overrideScreenSecurity=true` skips this condition. 3.
     * Field is shown on the issue: each field has different conditions here. For example: Attachment field only shows if attachments are enabled. Assignee only shows if user has permissions to assign the issue. 4.
     * If a field is custom then it must have valid custom field context, applicable for its project and issue type. All system fields are assumed to have context in all projects and all issue types. 5.
     * Issue has a project, issue type, and status defined. 6.
     * Issue is assigned to a valid workflow, and the current status has assigned a workflow step. `overrideEditableFlag=true` skips this condition. 7.
     * The current workflow step is editable. This is true by default, but [can be disabled by setting](https://support.atlassian.com/jira-cloud-administration/docs/use-workflow-properties/) the `jira.issue.editable` property to `false`. `overrideEditableFlag=true` skips this condition. 8.
     * User has [Edit issues permission](https://support.atlassian.com/jira-cloud-administration/docs/permissions-for-company-managed-projects/). 9.
     * Workflow permissions allow editing a field. This is true by default but [can be modified](https://support.atlassian.com/jira-cloud-administration/docs/use-workflow-properties/) using `jira.permission.*` workflow properties.
     * Fields hidden using [Issue layout settings page](https://support.atlassian.com/jira-software-cloud/docs/configure-field-layout-in-the-issue-view/) remain editable.
     * Connect apps having an app user with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), and Forge apps acting on behalf of users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), can return additional details using:
     *  *
     * `overrideScreenSecurity` When this flag is `true`, then this endpoint skips checking if fields are available through screens, and field configuration (conditions 1. and 2. from the list above).
     * *
     * `overrideEditableFlag` When this flag is `true`, then this endpoint skips checking if workflow is present and if the current step is editable (conditions 6. and 7. from the list above).
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Note: For any fields to be editable the user must have the *Edit issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the issue.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public IssueUpdateMetadata getEditIssueMeta(Consumer<GetEditIssueMetaOperationSpec> spec) {
        GetEditIssueMetaOperationSpec r = new GetEditIssueMetaOperationSpec(spec);
        return api.getEditIssueMeta(r.issueIdOrKey(), r.overrideScreenSecurity(), r.overrideEditableFlag());
    }

    /**
     * Get events
     * <p>
     * Returns all issue events.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<IssueEvent> getEvents(Consumer<GetEventsOperationSpec> spec) {
        GetEventsOperationSpec r = new GetEventsOperationSpec(spec);
        return api.getEvents();
    }

    /**
     * Get failed webhooks
     * <p>
     * Returns webhooks that have recently failed to be delivered to the requesting app after the maximum number of retries.
     * After 72 hours the failure may no longer be returned by this operation.
     * The oldest failure is returned first.
     * This method uses a cursor-based pagination. To request the next page use the failure time of the last webhook on the list as the `failedAfter` value or use the URL provided in `next`.
     * **[Permissions](#permissions) required:** Only [Connect apps](https://developer.atlassian.com/cloud/jira/platform/index/#connect-apps) can use this operation.
     * Authentication - Required Scopes: [read:jira-work, manage:jira-webhook]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public FailedWebhooks getFailedWebhooks(Consumer<GetFailedWebhooksOperationSpec> spec) {
        GetFailedWebhooksOperationSpec r = new GetFailedWebhooksOperationSpec(spec);
        return api.getFailedWebhooks(r.maxResults(), r.after());
    }

    /**
     * Get favorite filters
     * <p>
     * Returns the visible favorite filters of the user.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** A favorite filter is only visible to the user where the filter is:
     *  *
     * owned by the user.
     * *
     * shared with a group that the user is a member of.
     * *
     * shared with a private project that the user has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.
     * *
     * shared with a public project.
     * *
     * shared with the public.
     * For example, if the user favorites a public filter that is subsequently made private that filter is not returned by this operation.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<Filter> getFavouriteFilters(Consumer<GetFavouriteFiltersOperationSpec> spec) {
        GetFavouriteFiltersOperationSpec r = new GetFavouriteFiltersOperationSpec(spec);
        return api.getFavouriteFilters(r.expand());
    }

    /**
     * Get project features
     * <p>
     * Returns the list of features for a project.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ContainerForProjectFeatures getFeaturesForProject(Consumer<GetFeaturesForProjectOperationSpec> spec) {
        GetFeaturesForProjectOperationSpec r = new GetFeaturesForProjectOperationSpec(spec);
        return api.getFeaturesForProject(r.projectIdOrKey());
    }

    /**
     * Get field auto complete suggestions
     * <p>
     * Returns the JQL search auto complete suggestions for a field.
     * Suggestions can be obtained by providing:
     *  *
     * `fieldName` to get a list of all values for the field.
     * *
     * `fieldName` and `fieldValue` to get a list of values containing the text in `fieldValue`.
     * *
     * `fieldName` and `predicateName` to get a list of all predicate values for the field.
     * *
     * `fieldName`, `predicateName`, and `predicateValue` to get a list of predicate values containing the text in `predicateValue`.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public AutoCompleteSuggestions getFieldAutoCompleteForQueryString(Consumer<GetFieldAutoCompleteForQueryStringOperationSpec> spec) {
        GetFieldAutoCompleteForQueryStringOperationSpec r = new GetFieldAutoCompleteForQueryStringOperationSpec(spec);
        return api.getFieldAutoCompleteForQueryString(r.fieldName(), r.fieldValue(), r.predicateName(), r.predicateValue());
    }

    /**
     * Get field configuration items
     * <p>
     * Returns a [paginated](#pagination) list of all fields for a configuration.
     * Only the fields from configurations used in company-managed (classic) projects are returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanFieldConfigurationItem getFieldConfigurationItems(Consumer<GetFieldConfigurationItemsOperationSpec> spec) {
        GetFieldConfigurationItemsOperationSpec r = new GetFieldConfigurationItemsOperationSpec(spec);
        return api.getFieldConfigurationItems(r.id(), r.startAt(), r.maxResults());
    }

    /**
     * Get field configuration issue type items
     * <p>
     * Returns a [paginated](#pagination) list of field configuration issue type items.
     * Only items used in classic projects are returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanFieldConfigurationIssueTypeItem getFieldConfigurationSchemeMappings(Consumer<GetFieldConfigurationSchemeMappingsOperationSpec> spec) {
        GetFieldConfigurationSchemeMappingsOperationSpec r = new GetFieldConfigurationSchemeMappingsOperationSpec(spec);
        return api.getFieldConfigurationSchemeMappings(r.startAt(), r.maxResults(), r.fieldConfigurationSchemeId());
    }

    /**
     * Get field configuration schemes for projects
     * <p>
     * Returns a [paginated](#pagination) list of field configuration schemes and, for each scheme, a list of the projects that use it.
     * The list is sorted by field configuration scheme ID. The first item contains the list of project IDs assigned to the default field configuration scheme.
     * Only field configuration schemes used in classic projects are returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanFieldConfigurationSchemeProjects getFieldConfigurationSchemeProjectMapping(Consumer<GetFieldConfigurationSchemeProjectMappingOperationSpec> spec) {
        GetFieldConfigurationSchemeProjectMappingOperationSpec r = new GetFieldConfigurationSchemeProjectMappingOperationSpec(spec);
        return api.getFieldConfigurationSchemeProjectMapping(r.projectId(), r.startAt(), r.maxResults());
    }

    /**
     * Get fields
     * <p>
     * Returns system and custom issue fields according to the following rules:
     *  *
     * Fields that cannot be added to the issue navigator are always returned.
     * *
     * Fields that cannot be placed on an issue screen are always returned.
     * *
     * Fields that depend on global Jira settings are only returned if the setting is enabled. That is, timetracking fields, subtasks, votes, and watches.
     * *
     * For all other fields, this operation only returns the fields that the user has permission to view (that is, the field is used in at least one project that the user has *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.)
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<FieldDetails> getFields(Consumer<GetFieldsOperationSpec> spec) {
        GetFieldsOperationSpec r = new GetFieldsOperationSpec(spec);
        return api.getFields();
    }

    /**
     * Get fields paginated
     * <p>
     * Returns a [paginated](#pagination) list of fields for Classic Jira projects. The list can include:
     *  *
     * all fields
     * *
     * specific fields, by defining `id`
     * *
     * fields that contain a string in the field name or description, by defining `query`
     * *
     * specific fields that contain a string in the field name or description, by defining `id` and `query`
     * Only custom fields can be queried, `type` must be set to `custom`.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanField getFieldsPaginated(Consumer<GetFieldsPaginatedOperationSpec> spec) {
        GetFieldsPaginatedOperationSpec r = new GetFieldsPaginatedOperationSpec(spec);
        return api.getFieldsPaginated(r.startAt(), r.maxResults(), r.type(), r.id(), r.query(), r.orderBy(), r.expand());
    }

    /**
     * Get filter
     * <p>
     * Returns a filter.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None, however, the filter is only returned where it is:
     *  *
     * owned by the user.
     * *
     * shared with a group that the user is a member of.
     * *
     * shared with a private project that the user has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.
     * *
     * shared with a public project.
     * *
     * shared with the public.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Filter getFilter(Consumer<GetFilterOperationSpec> spec) {
        GetFilterOperationSpec r = new GetFilterOperationSpec(spec);
        return api.getFilter(r.id(), r.expand(), r.overrideSharePermissions());
    }

    /**
     * Search for filters
     * <p>
     * Returns a [paginated](#pagination) list of filters. Use this operation to get:
     *  *
     * specific filters, by defining `id` only.
     * *
     * filters that match all of the specified attributes. For example, all filters for a user with a particular word in their name. When multiple attributes are specified only filters matching all attributes are returned.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None, however, only the following filters that match the query parameters are returned:
     *  *
     * filters owned by the user.
     * *
     * filters shared with a group that the user is a member of.
     * *
     * filters shared with a private project that the user has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.
     * *
     * filters shared with a public project.
     * *
     * filters shared with the public.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanFilterDetails getFiltersPaginated(Consumer<GetFiltersPaginatedOperationSpec> spec) {
        GetFiltersPaginatedOperationSpec r = new GetFiltersPaginatedOperationSpec(spec);
        return api.getFiltersPaginated(r.filterName(), r.accountId(), r.owner(), r.groupname(), r.groupId(), r.projectId(), r.id(), r.orderBy(), r.startAt(), r.maxResults(), r.expand(), r.overrideSharePermissions());
    }

    /**
     * Get group
     * <p>
     * This operation is deprecated, use [`group/member`](#api-rest-api-2-group-member-get).
     * Returns all users in a group.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [read:jira-user]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     * @deprecated
     */
    @Deprecated
    public Group getGroup(Consumer<GetGroupOperationSpec> spec) {
        GetGroupOperationSpec r = new GetGroupOperationSpec(spec);
        return api.getGroup(r.groupname(), r.groupId(), r.expand());
    }

    /**
     * Get project issue type hierarchy
     * <p>
     * Get the issue type hierarchy for a next-gen project.
     * The issue type hierarchy for a project consists of:
     *  *
     * *Epic* at level 1 (optional).
     * *
     * One or more issue types at level 0 such as *Story*, *Task*, or *Bug*. Where the issue type *Epic* is defined, these issue types are used to break down the content of an epic.
     * *
     * *Subtask* at level -1 (optional). This issue type enables level 0 issue types to be broken down into components. Issues based on a level -1 issue type must have a parent issue.
     * **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     * @deprecated
     */
    @Deprecated
    public ProjectIssueTypeHierarchy getHierarchy(Consumer<GetHierarchyOperationSpec> spec) {
        GetHierarchyOperationSpec r = new GetHierarchyOperationSpec(spec);
        return api.getHierarchy(r.projectId());
    }

    /**
     * Get IDs of deleted worklogs
     * <p>
     * Returns a list of IDs and delete timestamps for worklogs deleted after a date and time.
     * This resource is paginated, with a limit of 1000 worklogs per page. Each page lists worklogs from oldest to youngest. If the number of items in the date range exceeds 1000, `until` indicates the timestamp of the youngest item on the page. Also, `nextPage` provides the URL for the next page of worklogs. The `lastPage` parameter is set to true on the last page of worklogs.
     * This resource does not return worklogs deleted during the minute preceding the request.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ChangedWorklogs getIdsOfWorklogsDeletedSince(Consumer<GetIdsOfWorklogsDeletedSinceOperationSpec> spec) {
        GetIdsOfWorklogsDeletedSinceOperationSpec r = new GetIdsOfWorklogsDeletedSinceOperationSpec(spec);
        return api.getIdsOfWorklogsDeletedSince(r.since());
    }

    /**
     * Get IDs of updated worklogs
     * <p>
     * Returns a list of IDs and update timestamps for worklogs updated after a date and time.
     * This resource is paginated, with a limit of 1000 worklogs per page. Each page lists worklogs from oldest to youngest. If the number of items in the date range exceeds 1000, `until` indicates the timestamp of the youngest item on the page. Also, `nextPage` provides the URL for the next page of worklogs. The `lastPage` parameter is set to true on the last page of worklogs.
     * This resource does not return worklogs updated during the minute preceding the request.
     * **[Permissions](#permissions) required:** Permission to access Jira, however, worklogs are only returned where either of the following is true:
     *  *
     * the worklog is set as *Viewable by All Users*.
     * *
     * the user is a member of a project role or group with permission to view the worklog.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ChangedWorklogs getIdsOfWorklogsModifiedSince(Consumer<GetIdsOfWorklogsModifiedSinceOperationSpec> spec) {
        GetIdsOfWorklogsModifiedSinceOperationSpec r = new GetIdsOfWorklogsModifiedSinceOperationSpec(spec);
        return api.getIdsOfWorklogsModifiedSince(r.since(), r.expand());
    }

    /**
     * Get is watching issue bulk
     * <p>
     * Returns, for the user, details of the watched status of issues from a list. If an issue ID is invalid, the returned watched status is `false`.
     * This operation requires the **Allow users to watch issues** option to be *ON*. This option is set in General configuration for Jira. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public BulkIssueIsWatching getIsWatchingIssueBulk(Consumer<GetIsWatchingIssueBulkOperationSpec> spec) {
        GetIsWatchingIssueBulkOperationSpec r = new GetIsWatchingIssueBulkOperationSpec(spec);
        return api.getIsWatchingIssueBulk(r.issueList());
    }

    /**
     * Get issue
     * <p>
     * Returns the details for an issue.
     * The issue is identified by its ID or key, however, if the identifier doesn't match an issue, a case-insensitive search and check for moved issues is performed. If a matching issue is found its details are returned, a 302 or other redirect is **not** returned. The issue key returned in the response is the key of the issue found.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public IssueBean getIssue(Consumer<GetIssueOperationSpec> spec) {
        GetIssueOperationSpec r = new GetIssueOperationSpec(spec);
        return api.getIssue(r.issueIdOrKey(), r.fields(), r.fieldsByKeys(), r.expand(), r.properties(), r.updateHistory());
    }

    /**
     * Get all issue types for user
     * <p>
     * Returns all issue types.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** Issue types are only returned as follows:
     *  *
     * if the user has the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), all issue types are returned.
     * *
     * if the user has the *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for one or more projects, the issue types associated with the projects the user has permission to browse are returned.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<IssueTypeDetails> getIssueAllTypes(Consumer<GetIssueAllTypesOperationSpec> spec) {
        GetIssueAllTypesOperationSpec r = new GetIssueAllTypesOperationSpec(spec);
        return api.getIssueAllTypes();
    }

    /**
     * Get issue field option
     * <p>
     * Returns an option from a select list issue field.
     * Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public IssueFieldOption getIssueFieldOption(Consumer<GetIssueFieldOptionOperationSpec> spec) {
        GetIssueFieldOptionOperationSpec r = new GetIssueFieldOptionOperationSpec(spec);
        return api.getIssueFieldOption(r.fieldKey(), r.optionId());
    }

    /**
     * Get issue link
     * <p>
     * Returns an issue link.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse project* [project permission](https://confluence.atlassian.com/x/yodKLg) for all the projects containing the linked issues.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, permission to view both of the issues.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public IssueLink getIssueLink(Consumer<GetIssueLinkOperationSpec> spec) {
        GetIssueLinkOperationSpec r = new GetIssueLinkOperationSpec(spec);
        return api.getIssueLink(r.linkId());
    }

    /**
     * Get issue link type
     * <p>
     * Returns an issue link type.
     * To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project in the site.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public IssueLinkType getIssueLinkType(Consumer<GetIssueLinkTypeOperationSpec> spec) {
        GetIssueLinkTypeOperationSpec r = new GetIssueLinkTypeOperationSpec(spec);
        return api.getIssueLinkType(r.issueLinkTypeId());
    }

    /**
     * Get issue link types
     * <p>
     * Returns a list of all issue link types.
     * To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project in the site.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public IssueLinkTypes getIssueLinkTypes(Consumer<GetIssueLinkTypesOperationSpec> spec) {
        GetIssueLinkTypesOperationSpec r = new GetIssueLinkTypesOperationSpec(spec);
        return api.getIssueLinkTypes();
    }

    /**
     * Get issue navigator default columns
     * <p>
     * Returns the default issue navigator columns.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<ColumnItem> getIssueNavigatorDefaultColumns(Consumer<GetIssueNavigatorDefaultColumnsOperationSpec> spec) {
        GetIssueNavigatorDefaultColumnsOperationSpec r = new GetIssueNavigatorDefaultColumnsOperationSpec(spec);
        return api.getIssueNavigatorDefaultColumns();
    }

    /**
     * Get issue picker suggestions
     * <p>
     * Returns lists of issues matching a query string. Use this resource to provide auto-completion suggestions when the user is looking for an issue using a word or string.
     * This operation returns two lists:
     *  *
     * `History Search` which includes issues from the user's history of created, edited, or viewed issues that contain the string in the `query` parameter.
     * *
     * `Current Search` which includes issues that match the JQL expression in `currentJQL` and contain the string in the `query` parameter.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public IssuePickerSuggestions getIssuePickerResource(Consumer<GetIssuePickerResourceOperationSpec> spec) {
        GetIssuePickerResourceOperationSpec r = new GetIssuePickerResourceOperationSpec(spec);
        return api.getIssuePickerResource(r.query(), r.currentJQL(), r.currentIssueKey(), r.currentProjectId(), r.showSubTasks(), r.showSubTaskParent());
    }

    /**
     * Get issue property
     * <p>
     * Returns the key and value of an issue's property.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public EntityProperty getIssueProperty(Consumer<GetIssuePropertyOperationSpec> spec) {
        GetIssuePropertyOperationSpec r = new GetIssuePropertyOperationSpec(spec);
        return api.getIssueProperty(r.issueIdOrKey(), r.propertyKey());
    }

    /**
     * Get issue property keys
     * <p>
     * Returns the URLs and keys of an issue's properties.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** Property details are only returned where the user has:
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PropertyKeys getIssuePropertyKeys(Consumer<GetIssuePropertyKeysOperationSpec> spec) {
        GetIssuePropertyKeysOperationSpec r = new GetIssuePropertyKeysOperationSpec(spec);
        return api.getIssuePropertyKeys(r.issueIdOrKey());
    }

    /**
     * Get issue security level
     * <p>
     * Returns details of an issue security level.
     * Use [Get issue security scheme](#api-rest-api-2-issuesecurityschemes-id-get) to obtain the IDs of issue security levels associated with the issue security scheme.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public SecurityLevel getIssueSecurityLevel(Consumer<GetIssueSecurityLevelOperationSpec> spec) {
        GetIssueSecurityLevelOperationSpec r = new GetIssueSecurityLevelOperationSpec(spec);
        return api.getIssueSecurityLevel(r.id());
    }

    /**
     * Get issue security level members
     * <p>
     * Returns issue security level members.
     * Only issue security level members in context of classic projects are returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanIssueSecurityLevelMember getIssueSecurityLevelMembers(Consumer<GetIssueSecurityLevelMembersOperationSpec> spec) {
        GetIssueSecurityLevelMembersOperationSpec r = new GetIssueSecurityLevelMembersOperationSpec(spec);
        return api.getIssueSecurityLevelMembers(r.issueSecuritySchemeId(), r.startAt(), r.maxResults(), r.issueSecurityLevelId(), r.expand());
    }

    /**
     * Get issue security scheme
     * <p>
     * Returns an issue security scheme along with its security levels.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * *
     * *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project that uses the requested issue security scheme.
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public SecurityScheme getIssueSecurityScheme(Consumer<GetIssueSecuritySchemeOperationSpec> spec) {
        GetIssueSecuritySchemeOperationSpec r = new GetIssueSecuritySchemeOperationSpec(spec);
        return api.getIssueSecurityScheme(r.id());
    }

    /**
     * Get issue security schemes
     * <p>
     * Returns all [issue security schemes](https://confluence.atlassian.com/x/J4lKLg).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public SecuritySchemes getIssueSecuritySchemes(Consumer<GetIssueSecuritySchemesOperationSpec> spec) {
        GetIssueSecuritySchemesOperationSpec r = new GetIssueSecuritySchemesOperationSpec(spec);
        return api.getIssueSecuritySchemes();
    }

    /**
     * Get issue type
     * <p>
     * Returns an issue type.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) in a project the issue type is associated with or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public IssueTypeDetails getIssueType(Consumer<GetIssueTypeOperationSpec> spec) {
        GetIssueTypeOperationSpec r = new GetIssueTypeOperationSpec(spec);
        return api.getIssueType(r.id());
    }

    /**
     * Get issue types for custom field context
     * <p>
     * Returns a [paginated](#pagination) list of context to issue type mappings for a custom field. Mappings are returned for all contexts or a list of contexts. Mappings are ordered first by context ID and then by issue type ID.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanIssueTypeToContextMapping getIssueTypeMappingsForContexts(Consumer<GetIssueTypeMappingsForContextsOperationSpec> spec) {
        GetIssueTypeMappingsForContextsOperationSpec r = new GetIssueTypeMappingsForContextsOperationSpec(spec);
        return api.getIssueTypeMappingsForContexts(r.fieldId(), r.contextId(), r.startAt(), r.maxResults());
    }

    /**
     * Get issue type property
     * <p>
     * Returns the key and value of the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties).
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) to get the details of any issue type.
     * *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) to get the details of any issue types associated with the projects the user has permission to browse.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public EntityProperty getIssueTypeProperty(Consumer<GetIssueTypePropertyOperationSpec> spec) {
        GetIssueTypePropertyOperationSpec r = new GetIssueTypePropertyOperationSpec(spec);
        return api.getIssueTypeProperty(r.issueTypeId(), r.propertyKey());
    }

    /**
     * Get issue type property keys
     * <p>
     * Returns all the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties) keys of the issue type.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) to get the property keys of any issue type.
     * *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) to get the property keys of any issue types associated with the projects the user has permission to browse.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PropertyKeys getIssueTypePropertyKeys(Consumer<GetIssueTypePropertyKeysOperationSpec> spec) {
        GetIssueTypePropertyKeysOperationSpec r = new GetIssueTypePropertyKeysOperationSpec(spec);
        return api.getIssueTypePropertyKeys(r.issueTypeId());
    }

    /**
     * Get issue type schemes for projects
     * <p>
     * Returns a [paginated](#pagination) list of issue type schemes and, for each issue type scheme, a list of the projects that use it.
     * Only issue type schemes used in classic projects are returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanIssueTypeSchemeProjects getIssueTypeSchemeForProjects(Consumer<GetIssueTypeSchemeForProjectsOperationSpec> spec) {
        GetIssueTypeSchemeForProjectsOperationSpec r = new GetIssueTypeSchemeForProjectsOperationSpec(spec);
        return api.getIssueTypeSchemeForProjects(r.projectId(), r.startAt(), r.maxResults());
    }

    /**
     * Get issue type scheme items
     * <p>
     * Returns a [paginated](#pagination) list of issue type scheme items.
     * Only issue type scheme items used in classic projects are returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanIssueTypeSchemeMapping getIssueTypeSchemesMapping(Consumer<GetIssueTypeSchemesMappingOperationSpec> spec) {
        GetIssueTypeSchemesMappingOperationSpec r = new GetIssueTypeSchemesMappingOperationSpec(spec);
        return api.getIssueTypeSchemesMapping(r.startAt(), r.maxResults(), r.issueTypeSchemeId());
    }

    /**
     * Get issue type screen scheme items
     * <p>
     * Returns a [paginated](#pagination) list of issue type screen scheme items.
     * Only issue type screen schemes used in classic projects are returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanIssueTypeScreenSchemeItem getIssueTypeScreenSchemeMappings(Consumer<GetIssueTypeScreenSchemeMappingsOperationSpec> spec) {
        GetIssueTypeScreenSchemeMappingsOperationSpec r = new GetIssueTypeScreenSchemeMappingsOperationSpec(spec);
        return api.getIssueTypeScreenSchemeMappings(r.startAt(), r.maxResults(), r.issueTypeScreenSchemeId());
    }

    /**
     * Get issue type screen schemes for projects
     * <p>
     * Returns a [paginated](#pagination) list of issue type screen schemes and, for each issue type screen scheme, a list of the projects that use it.
     * Only issue type screen schemes used in classic projects are returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanIssueTypeScreenSchemesProjects getIssueTypeScreenSchemeProjectAssociations(Consumer<GetIssueTypeScreenSchemeProjectAssociationsOperationSpec> spec) {
        GetIssueTypeScreenSchemeProjectAssociationsOperationSpec r = new GetIssueTypeScreenSchemeProjectAssociationsOperationSpec(spec);
        return api.getIssueTypeScreenSchemeProjectAssociations(r.projectId(), r.startAt(), r.maxResults());
    }

    /**
     * Get issue type screen schemes
     * <p>
     * Returns a [paginated](#pagination) list of issue type screen schemes.
     * Only issue type screen schemes used in classic projects are returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanIssueTypeScreenScheme getIssueTypeScreenSchemes(Consumer<GetIssueTypeScreenSchemesOperationSpec> spec) {
        GetIssueTypeScreenSchemesOperationSpec r = new GetIssueTypeScreenSchemesOperationSpec(spec);
        return api.getIssueTypeScreenSchemes(r.startAt(), r.maxResults(), r.id(), r.queryString(), r.orderBy(), r.expand());
    }

    /**
     * Get issue types for project
     * <p>
     * Returns issue types for a project.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) in the relevant project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<IssueTypeDetails> getIssueTypesForProject(Consumer<GetIssueTypesForProjectOperationSpec> spec) {
        GetIssueTypesForProjectOperationSpec r = new GetIssueTypesForProjectOperationSpec(spec);
        return api.getIssueTypesForProject(r.projectId(), r.level());
    }

    /**
     * Get issue watchers
     * <p>
     * Returns the watchers for an issue.
     * This operation requires the **Allow users to watch issues** option to be *ON*. This option is set in General configuration for Jira. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is ini
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * *
     * To see details of users on the watchlist other than themselves, *View voters and watchers* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Watchers getIssueWatchers(Consumer<GetIssueWatchersOperationSpec> spec) {
        GetIssueWatchersOperationSpec r = new GetIssueWatchersOperationSpec(spec);
        return api.getIssueWatchers(r.issueIdOrKey());
    }

    /**
     * Get issue worklogs
     * <p>
     * Returns worklogs for an issue, starting from the oldest worklog or from the worklog started on or after a date and time.
     * Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** Workloads are only returned where the user has:
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * *
     * If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageOfWorklogs getIssueWorklog(Consumer<GetIssueWorklogOperationSpec> spec) {
        GetIssueWorklogOperationSpec r = new GetIssueWorklogOperationSpec(spec);
        return api.getIssueWorklog(r.issueIdOrKey(), r.startAt(), r.maxResults(), r.startedAfter(), r.startedBefore(), r.expand());
    }

    /**
     * Get license
     * <p>
     * Returns licensing information about the Jira instance.
     * **[Permissions](#permissions) required:** None.
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public License getLicense(Consumer<GetLicenseOperationSpec> spec) {
        GetLicenseOperationSpec r = new GetLicenseOperationSpec(spec);
        return api.getLicense();
    }

    /**
     * Get locale
     * <p>
     * Returns the locale for the user.
     * If the user has no language preference set (which is the default setting) or this resource is accessed anonymous, the browser locale detected by Jira is returned. Jira detects the browser locale using the *Accept-Language* header in the request. However, if this doesn't match a locale available Jira, the site default locale is returned.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Locale getLocale(Consumer<GetLocaleOperationSpec> spec) {
        GetLocaleOperationSpec r = new GetLocaleOperationSpec(spec);
        return api.getLocale();
    }

    /**
     * Get my filters
     * <p>
     * Returns the filters owned by the user. If `includeFavourites` is `true`, the user's visible favorite filters are also returned.
     * **[Permissions](#permissions) required:** Permission to access Jira, however, a favorite filters is only visible to the user where the filter is:
     *  *
     * owned by the user.
     * *
     * shared with a group that the user is a member of.
     * *
     * shared with a private project that the user has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.
     * *
     * shared with a public project.
     * *
     * shared with the public.
     * For example, if the user favorites a public filter that is subsequently made private that filter is not returned by this operation.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<Filter> getMyFilters(Consumer<GetMyFiltersOperationSpec> spec) {
        GetMyFiltersOperationSpec r = new GetMyFiltersOperationSpec(spec);
        return api.getMyFilters(r.expand(), r.includeFavourites());
    }

    /**
     * Get my permissions
     * <p>
     * Returns a list of permissions indicating which permissions the user has. Details of the user's permissions can be obtained in a global, project, issue or comment context.
     * The user is reported as having a project permission:
     *  *
     * in the global context, if the user has the project permission in any project.
     * *
     * for a project, where the project permission is determined using issue data, if the user meets the permission's criteria for any issue in the project. Otherwise, if the user has the project permission in the project.
     * *
     * for an issue, where a project permission is determined using issue data, if the user has the permission in the issue. Otherwise, if the user has the project permission in the project containing the issue.
     * *
     * for a comment, where the user has both the permission to browse the comment and the project permission for the comment's parent issue. Only the BROWSE\\_PROJECTS permission is supported. If a `commentId` is provided whose `permissions` does not equal BROWSE\\_PROJECTS, a 400 error will be returned.
     * This means that users may be shown as having an issue permission (such as EDIT\\_ISSUES) in the global context or a project context but may not have the permission for any or all issues. For example, if Reporters have the EDIT\\_ISSUES permission a user would be shown as having this permission in the global context or the context of a project, because any user can be a reporter. However, if they are not the user who reported the issue queried they would not have EDIT\\_ISSUES permission for that issue.
     * Global permissions are unaffected by context.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Permissions getMyPermissions(Consumer<GetMyPermissionsOperationSpec> spec) {
        GetMyPermissionsOperationSpec r = new GetMyPermissionsOperationSpec(spec);
        return api.getMyPermissions(r.projectKey(), r.projectId(), r.issueKey(), r.issueId(), r.permissions(), r.projectUuid(), r.projectConfigurationUuid(), r.commentId());
    }

    /**
     * Get notification scheme
     * <p>
     * Returns a [notification scheme](https://confluence.atlassian.com/x/8YdKLg), including the list of events and the recipients who will receive notifications for those events.
     * **[Permissions](#permissions) required:** Permission to access Jira, however, the user must have permission to administer at least one project associated with the notification scheme.
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public NotificationScheme getNotificationScheme(Consumer<GetNotificationSchemeOperationSpec> spec) {
        GetNotificationSchemeOperationSpec r = new GetNotificationSchemeOperationSpec(spec);
        return api.getNotificationScheme(r.id(), r.expand());
    }

    /**
     * Get project notification scheme
     * <p>
     * Gets a [notification scheme](https://confluence.atlassian.com/x/8YdKLg) associated with the project.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public NotificationScheme getNotificationSchemeForProject(Consumer<GetNotificationSchemeForProjectOperationSpec> spec) {
        GetNotificationSchemeForProjectOperationSpec r = new GetNotificationSchemeForProjectOperationSpec(spec);
        return api.getNotificationSchemeForProject(r.projectKeyOrId(), r.expand());
    }

    /**
     * Get projects using notification schemes paginated
     * <p>
     * Returns a [paginated](#pagination) mapping of project that have notification scheme assigned. You can provide either one or multiple notification scheme IDs or project IDs to filter by. If you don't provide any, this will return a list of all mappings. Note that only company-managed (classic) projects are supported. This is because team-managed projects don't have a concept of a default notification scheme. The mappings are ordered by projectId.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanNotificationSchemeAndProjectMappingJsonBean getNotificationSchemeToProjectMappings(Consumer<GetNotificationSchemeToProjectMappingsOperationSpec> spec) {
        GetNotificationSchemeToProjectMappingsOperationSpec r = new GetNotificationSchemeToProjectMappingsOperationSpec(spec);
        return api.getNotificationSchemeToProjectMappings(r.startAt(), r.maxResults(), r.notificationSchemeId(), r.projectId());
    }

    /**
     * Get notification schemes paginated
     * <p>
     * Returns a [paginated](#pagination) list of [notification schemes](https://confluence.atlassian.com/x/8YdKLg) ordered by the display name.
     * *Note that you should allow for events without recipients to appear in responses.*
     * **[Permissions](#permissions) required:** Permission to access Jira, however, the user must have permission to administer at least one project associated with a notification scheme for it to be returned.
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanNotificationScheme getNotificationSchemes(Consumer<GetNotificationSchemesOperationSpec> spec) {
        GetNotificationSchemesOperationSpec r = new GetNotificationSchemesOperationSpec(spec);
        return api.getNotificationSchemes(r.startAt(), r.maxResults(), r.id(), r.projectId(), r.onlyDefault(), r.expand());
    }

    /**
     * Get custom field options (context)
     * <p>
     * Returns a [paginated](#pagination) list of all custom field option for a context. Options are returned first then cascading options, in the order they display in Jira.
     * This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanCustomFieldContextOption getOptionsForContext(Consumer<GetOptionsForContextOperationSpec> spec) {
        GetOptionsForContextOperationSpec r = new GetOptionsForContextOperationSpec(spec);
        return api.getOptionsForContext(r.fieldId(), r.contextId(), r.optionId(), r.onlyOptions(), r.startAt(), r.maxResults());
    }

    /**
     * Get permission scheme
     * <p>
     * Returns a permission scheme.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PermissionScheme getPermissionScheme(Consumer<GetPermissionSchemeOperationSpec> spec) {
        GetPermissionSchemeOperationSpec r = new GetPermissionSchemeOperationSpec(spec);
        return api.getPermissionScheme(r.schemeId(), r.expand());
    }

    /**
     * Get permission scheme grant
     * <p>
     * Returns a permission grant.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PermissionGrant getPermissionSchemeGrant(Consumer<GetPermissionSchemeGrantOperationSpec> spec) {
        GetPermissionSchemeGrantOperationSpec r = new GetPermissionSchemeGrantOperationSpec(spec);
        return api.getPermissionSchemeGrant(r.schemeId(), r.permissionId(), r.expand());
    }

    /**
     * Get permission scheme grants
     * <p>
     * Returns all permission grants for a permission scheme.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PermissionGrants getPermissionSchemeGrants(Consumer<GetPermissionSchemeGrantsOperationSpec> spec) {
        GetPermissionSchemeGrantsOperationSpec r = new GetPermissionSchemeGrantsOperationSpec(spec);
        return api.getPermissionSchemeGrants(r.schemeId(), r.expand());
    }

    /**
     * Get permitted projects
     * <p>
     * Returns all the projects where the user is granted a list of project permissions.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PermittedProjects getPermittedProjects(Consumer<GetPermittedProjectsOperationSpec> spec) {
        GetPermittedProjectsOperationSpec r = new GetPermittedProjectsOperationSpec(spec);
        return api.getPermittedProjects(r.permissionsKeysBean());
    }

    /**
     * Get precomputations (apps)
     * <p>
     * Returns the list of a function's precomputations along with information about when they were created, updated, and last used. Each precomputation has a `value` \\- the JQL fragment to replace the custom function clause with.
     * **[Permissions](#permissions) required:** This API is only accessible to apps and apps can only inspect their own functions.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanJqlFunctionPrecomputationBean getPrecomputations(Consumer<GetPrecomputationsOperationSpec> spec) {
        GetPrecomputationsOperationSpec r = new GetPrecomputationsOperationSpec(spec);
        return api.getPrecomputations(r.functionKey(), r.startAt(), r.maxResults(), r.orderBy(), r.filter());
    }

    /**
     * Get preference
     * <p>
     * Returns the value of a preference of the current user.
     * Note that these keys are deprecated:
     *  *
     * *jira.user.locale* The locale of the user. By default this is not set and the user takes the locale of the instance.
     * *
     * *jira.user.timezone* The time zone of the user. By default this is not set and the user takes the timezone of the instance.
     * Use [ Update a user profile](https://developer.atlassian.com/cloud/admin/user-management/rest/#api-users-account-id-manage-profile-patch) from the user management REST API to manage timezone and locale instead.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public String getPreference(Consumer<GetPreferenceOperationSpec> spec) {
        GetPreferenceOperationSpec r = new GetPreferenceOperationSpec(spec);
        return api.getPreference(r.key());
    }

    /**
     * Get priorities
     * <p>
     * Returns the list of all issue priorities.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     * @deprecated
     */
    @Deprecated
    public List<Priority> getPriorities(Consumer<GetPrioritiesOperationSpec> spec) {
        GetPrioritiesOperationSpec r = new GetPrioritiesOperationSpec(spec);
        return api.getPriorities();
    }

    /**
     * Get priority
     * <p>
     * Returns an issue priority.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Priority getPriority(Consumer<GetPriorityOperationSpec> spec) {
        GetPriorityOperationSpec r = new GetPriorityOperationSpec(spec);
        return api.getPriority(r.id());
    }

    /**
     * Get project
     * <p>
     * Returns the [project details](https://confluence.atlassian.com/x/ahLpNw) for a project.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Project getProject(Consumer<GetProjectOperationSpec> spec) {
        GetProjectOperationSpec r = new GetProjectOperationSpec(spec);
        return api.getProject(r.projectIdOrKey(), r.expand(), r.properties());
    }

    /**
     * Get project category by ID
     * <p>
     * Returns a project category.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ProjectCategory getProjectCategoryById(Consumer<GetProjectCategoryByIdOperationSpec> spec) {
        GetProjectCategoryByIdOperationSpec r = new GetProjectCategoryByIdOperationSpec(spec);
        return api.getProjectCategoryById(r.id());
    }

    /**
     * Get project components
     * <p>
     * Returns all components in a project. See the [Get project components paginated](#api-rest-api-2-project-projectIdOrKey-component-get) resource if you want to get a full list of components with pagination.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<ProjectComponent> getProjectComponents(Consumer<GetProjectComponentsOperationSpec> spec) {
        GetProjectComponentsOperationSpec r = new GetProjectComponentsOperationSpec(spec);
        return api.getProjectComponents(r.projectIdOrKey());
    }

    /**
     * Get project components paginated
     * <p>
     * Returns a [paginated](#pagination) list of all components in a project. See the [Get project components](#api-rest-api-2-project-projectIdOrKey-components-get) resource if you want to get a full list of versions without pagination.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanComponentWithIssueCount getProjectComponentsPaginated(Consumer<GetProjectComponentsPaginatedOperationSpec> spec) {
        GetProjectComponentsPaginatedOperationSpec r = new GetProjectComponentsPaginatedOperationSpec(spec);
        return api.getProjectComponentsPaginated(r.projectIdOrKey(), r.startAt(), r.maxResults(), r.orderBy(), r.query());
    }

    /**
     * Get project mappings for custom field context
     * <p>
     * Returns a [paginated](#pagination) list of context to project mappings for a custom field. The result can be filtered by `contextId`. Otherwise, all mappings are returned. Invalid IDs are ignored.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanCustomFieldContextProjectMapping getProjectContextMapping(Consumer<GetProjectContextMappingOperationSpec> spec) {
        GetProjectContextMappingOperationSpec r = new GetProjectContextMappingOperationSpec(spec);
        return api.getProjectContextMapping(r.fieldId(), r.contextId(), r.startAt(), r.maxResults());
    }

    /**
     * Get project's sender email
     * <p>
     * Returns the [project's sender email address](https://confluence.atlassian.com/x/dolKLg).
     * **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ProjectEmailAddress getProjectEmail(Consumer<GetProjectEmailOperationSpec> spec) {
        GetProjectEmailOperationSpec r = new GetProjectEmailOperationSpec(spec);
        return api.getProjectEmail(r.projectId());
    }

    /**
     * Get project issue security scheme
     * <p>
     * Returns the [issue security scheme](https://confluence.atlassian.com/x/J4lKLg) associated with the project.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or the *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public SecurityScheme getProjectIssueSecurityScheme(Consumer<GetProjectIssueSecuritySchemeOperationSpec> spec) {
        GetProjectIssueSecuritySchemeOperationSpec r = new GetProjectIssueSecuritySchemeOperationSpec(spec);
        return api.getProjectIssueSecurityScheme(r.projectKeyOrId());
    }

    /**
     * Get project property
     * <p>
     * Returns the value of a [project property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties).
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the property.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public EntityProperty getProjectProperty(Consumer<GetProjectPropertyOperationSpec> spec) {
        GetProjectPropertyOperationSpec r = new GetProjectPropertyOperationSpec(spec);
        return api.getProjectProperty(r.projectIdOrKey(), r.propertyKey());
    }

    /**
     * Get project property keys
     * <p>
     * Returns all [project property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties) keys for the project.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PropertyKeys getProjectPropertyKeys(Consumer<GetProjectPropertyKeysOperationSpec> spec) {
        GetProjectPropertyKeysOperationSpec r = new GetProjectPropertyKeysOperationSpec(spec);
        return api.getProjectPropertyKeys(r.projectIdOrKey());
    }

    /**
     * Get project role for project
     * <p>
     * Returns a project role's details and actors associated with the project. The list of actors is sorted by display name.
     * To check whether a user belongs to a role based on their group memberships, use [Get user](#api-rest-api-2-user-get) with the `groups` expand parameter selected. Then check whether the user keys and groups match with the actors returned for the project.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ProjectRole getProjectRole(Consumer<GetProjectRoleOperationSpec> spec) {
        GetProjectRoleOperationSpec r = new GetProjectRoleOperationSpec(spec);
        return api.getProjectRole(r.projectIdOrKey(), r.id(), r.excludeInactiveUsers());
    }

    /**
     * Get default actors for project role
     * <p>
     * Returns the [default actors](#api-rest-api-2-resolution-get) for the project role.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ProjectRole getProjectRoleActorsForRole(Consumer<GetProjectRoleActorsForRoleOperationSpec> spec) {
        GetProjectRoleActorsForRoleOperationSpec r = new GetProjectRoleActorsForRoleOperationSpec(spec);
        return api.getProjectRoleActorsForRole(r.id());
    }

    /**
     * Get project role by ID
     * <p>
     * Gets the project role details and the default actors associated with the role. The list of default actors is sorted by display name.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ProjectRole getProjectRoleById(Consumer<GetProjectRoleByIdOperationSpec> spec) {
        GetProjectRoleByIdOperationSpec r = new GetProjectRoleByIdOperationSpec(spec);
        return api.getProjectRoleById(r.id());
    }

    /**
     * Get project role details
     * <p>
     * Returns all [project roles](https://confluence.atlassian.com/x/3odKLg) and the details for each role. Note that the list of project roles is common to all projects.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<ProjectRoleDetails> getProjectRoleDetails(Consumer<GetProjectRoleDetailsOperationSpec> spec) {
        GetProjectRoleDetailsOperationSpec r = new GetProjectRoleDetailsOperationSpec(spec);
        return api.getProjectRoleDetails(r.projectIdOrKey(), r.currentMember(), r.excludeConnectAddons());
    }

    /**
     * Get project roles for project
     * <p>
     * Returns a list of [project roles](https://confluence.atlassian.com/x/3odKLg) for the project returning the name and self URL for each role.
     * Note that all project roles are shared with all projects in Jira Cloud. See [Get all project roles](#api-rest-api-2-role-get) for more information.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for any project on the site or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Map<String, URI> getProjectRoles(Consumer<GetProjectRolesOperationSpec> spec) {
        GetProjectRolesOperationSpec r = new GetProjectRolesOperationSpec(spec);
        return api.getProjectRoles(r.projectIdOrKey());
    }

    /**
     * Get project type by key
     * <p>
     * Returns a [project type](https://confluence.atlassian.com/x/Var1Nw).
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ProjectType getProjectTypeByKey(Consumer<GetProjectTypeByKeyOperationSpec> spec) {
        GetProjectTypeByKeyOperationSpec r = new GetProjectTypeByKeyOperationSpec(spec);
        return api.getProjectTypeByKey(r.projectTypeKey());
    }

    /**
     * Get project versions
     * <p>
     * Returns all versions in a project. The response is not paginated. Use [Get project versions paginated](#api-rest-api-2-project-projectIdOrKey-version-get) if you want to get the versions in a project with pagination.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<Version> getProjectVersions(Consumer<GetProjectVersionsOperationSpec> spec) {
        GetProjectVersionsOperationSpec r = new GetProjectVersionsOperationSpec(spec);
        return api.getProjectVersions(r.projectIdOrKey(), r.expand());
    }

    /**
     * Get project versions paginated
     * <p>
     * Returns a [paginated](#pagination) list of all versions in a project. See the [Get project versions](#api-rest-api-2-project-projectIdOrKey-versions-get) resource if you want to get a full list of versions without pagination.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanVersion getProjectVersionsPaginated(Consumer<GetProjectVersionsPaginatedOperationSpec> spec) {
        GetProjectVersionsPaginatedOperationSpec r = new GetProjectVersionsPaginatedOperationSpec(spec);
        return api.getProjectVersionsPaginated(r.projectIdOrKey(), r.startAt(), r.maxResults(), r.orderBy(), r.query(), r.status(), r.expand());
    }

    /**
     * Get issue type screen scheme projects
     * <p>
     * Returns a [paginated](#pagination) list of projects associated with an issue type screen scheme.
     * Only company-managed projects associated with an issue type screen scheme are returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanProjectDetails getProjectsForIssueTypeScreenScheme(Consumer<GetProjectsForIssueTypeScreenSchemeOperationSpec> spec) {
        GetProjectsForIssueTypeScreenSchemeOperationSpec r = new GetProjectsForIssueTypeScreenSchemeOperationSpec(spec);
        return api.getProjectsForIssueTypeScreenScheme(r.issueTypeScreenSchemeId(), r.startAt(), r.maxResults(), r.query());
    }

    /**
     * Get recent projects
     * <p>
     * Returns a list of up to 20 projects recently viewed by the user that are still visible to the user.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** Projects are returned only where the user has one of:
     *  *
     * *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * *
     * *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<Project> getRecent(Consumer<GetRecentOperationSpec> spec) {
        GetRecentOperationSpec r = new GetRecentOperationSpec(spec);
        return api.getRecent(r.expand(), r.properties());
    }

    /**
     * Get remote issue link by ID
     * <p>
     * Returns a remote issue link for an issue.
     * This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public RemoteIssueLink getRemoteIssueLinkById(Consumer<GetRemoteIssueLinkByIdOperationSpec> spec) {
        GetRemoteIssueLinkByIdOperationSpec r = new GetRemoteIssueLinkByIdOperationSpec(spec);
        return api.getRemoteIssueLinkById(r.issueIdOrKey(), r.linkId());
    }

    /**
     * Get remote issue links
     * <p>
     * Returns the remote issue links for an issue. When a remote issue link global ID is provided the record with that global ID is returned, otherwise all remote issue links are returned. Where a global ID includes reserved URL characters these must be escaped in the request. For example, pass `system=http://www.mycompany.com/support&amp;id=1` as `system%3Dhttp%3A%2F%2Fwww.mycompany.com%2Fsupport%26id%3D1`.
     * This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public RemoteIssueLink getRemoteIssueLinks(Consumer<GetRemoteIssueLinksOperationSpec> spec) {
        GetRemoteIssueLinksOperationSpec r = new GetRemoteIssueLinksOperationSpec(spec);
        return api.getRemoteIssueLinks(r.issueIdOrKey(), r.globalId());
    }

    /**
     * Get resolution
     * <p>
     * Returns an issue resolution value.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Resolution getResolution(Consumer<GetResolutionOperationSpec> spec) {
        GetResolutionOperationSpec r = new GetResolutionOperationSpec(spec);
        return api.getResolution(r.id());
    }

    /**
     * Get resolutions
     * <p>
     * Returns a list of all issue resolution values.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     * @deprecated
     */
    @Deprecated
    public List<Resolution> getResolutions(Consumer<GetResolutionsOperationSpec> spec) {
        GetResolutionsOperationSpec r = new GetResolutionsOperationSpec(spec);
        return api.getResolutions();
    }

    /**
     * Get screen schemes
     * <p>
     * Returns a [paginated](#pagination) list of screen schemes.
     * Only screen schemes used in classic projects are returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanScreenScheme getScreenSchemes(Consumer<GetScreenSchemesOperationSpec> spec) {
        GetScreenSchemesOperationSpec r = new GetScreenSchemesOperationSpec(spec);
        return api.getScreenSchemes(r.startAt(), r.maxResults(), r.id(), r.expand(), r.queryString(), r.orderBy());
    }

    /**
     * Get screens
     * <p>
     * Returns a [paginated](#pagination) list of all screens or those specified by one or more screen IDs.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanScreen getScreens(Consumer<GetScreensOperationSpec> spec) {
        GetScreensOperationSpec r = new GetScreensOperationSpec(spec);
        return api.getScreens(r.startAt(), r.maxResults(), r.id(), r.queryString(), r.scope(), r.orderBy());
    }

    /**
     * Get screens for a field
     * <p>
     * Returns a [paginated](#pagination) list of the screens a field is used in.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanScreenWithTab getScreensForField(Consumer<GetScreensForFieldOperationSpec> spec) {
        GetScreensForFieldOperationSpec r = new GetScreensForFieldOperationSpec(spec);
        return api.getScreensForField(r.fieldId(), r.startAt(), r.maxResults(), r.expand());
    }

    /**
     * Get issue security level members
     * <p>
     * Returns a [paginated](#pagination) list of issue security level members.
     * Only issue security level members in the context of classic projects are returned.
     * Filtering using parameters is inclusive: if you specify both security scheme IDs and level IDs, the result will include all issue security level members from the specified schemes and levels.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanSecurityLevelMember getSecurityLevelMembers(Consumer<GetSecurityLevelMembersOperationSpec> spec) {
        GetSecurityLevelMembersOperationSpec r = new GetSecurityLevelMembersOperationSpec(spec);
        return api.getSecurityLevelMembers(r.startAt(), r.maxResults(), r.id(), r.schemeId(), r.levelId(), r.expand());
    }

    /**
     * Get issue security levels
     * <p>
     * Returns a [paginated](#pagination) list of issue security levels.
     * Only issue security levels in the context of classic projects are returned.
     * Filtering using IDs is inclusive: if you specify both security scheme IDs and level IDs, the result will include both specified issue security levels and all issue security levels from the specified schemes.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanSecurityLevel getSecurityLevels(Consumer<GetSecurityLevelsOperationSpec> spec) {
        GetSecurityLevelsOperationSpec r = new GetSecurityLevelsOperationSpec(spec);
        return api.getSecurityLevels(r.startAt(), r.maxResults(), r.id(), r.schemeId(), r.onlyDefault());
    }

    /**
     * Get project issue security levels
     * <p>
     * Returns all [issue security](https://confluence.atlassian.com/x/J4lKLg) levels for the project that the user has access to.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse projects* [global permission](https://confluence.atlassian.com/x/x4dKLg) for the project, however, issue security levels are only returned for authenticated user with *Set Issue Security* [global permission](https://confluence.atlassian.com/x/x4dKLg) for the project.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ProjectIssueSecurityLevels getSecurityLevelsForProject(Consumer<GetSecurityLevelsForProjectOperationSpec> spec) {
        GetSecurityLevelsForProjectOperationSpec r = new GetSecurityLevelsForProjectOperationSpec(spec);
        return api.getSecurityLevelsForProject(r.projectKeyOrId());
    }

    /**
     * Get selectable issue field options
     * <p>
     * Returns a [paginated](#pagination) list of options for a select list issue field that can be viewed and selected by the user.
     * Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanIssueFieldOption getSelectableIssueFieldOptions(Consumer<GetSelectableIssueFieldOptionsOperationSpec> spec) {
        GetSelectableIssueFieldOptionsOperationSpec r = new GetSelectableIssueFieldOptionsOperationSpec(spec);
        return api.getSelectableIssueFieldOptions(r.fieldKey(), r.startAt(), r.maxResults(), r.projectId());
    }

    /**
     * Get selected time tracking provider
     * <p>
     * Returns the time tracking provider that is currently selected. Note that if time tracking is disabled, then a successful but empty response is returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public TimeTrackingProvider getSelectedTimeTrackingImplementation(Consumer<GetSelectedTimeTrackingImplementationOperationSpec> spec) {
        GetSelectedTimeTrackingImplementationOperationSpec r = new GetSelectedTimeTrackingImplementationOperationSpec(spec);
        return api.getSelectedTimeTrackingImplementation();
    }

    /**
     * Get Jira instance info
     * <p>
     * Returns information about the Jira instance.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ServerInformation getServerInfo(Consumer<GetServerInfoOperationSpec> spec) {
        GetServerInfoOperationSpec r = new GetServerInfoOperationSpec(spec);
        return api.getServerInfo();
    }

    /**
     * Get share permission
     * <p>
     * Returns a share permission for a filter. A filter can be shared with groups, projects, all logged-in users, or the public. Sharing with all logged-in users or the public is known as a global share permission.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None, however, a share permission is only returned for:
     *  *
     * filters owned by the user.
     * *
     * filters shared with a group that the user is a member of.
     * *
     * filters shared with a private project that the user has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.
     * *
     * filters shared with a public project.
     * *
     * filters shared with the public.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public SharePermission getSharePermission(Consumer<GetSharePermissionOperationSpec> spec) {
        GetSharePermissionOperationSpec r = new GetSharePermissionOperationSpec(spec);
        return api.getSharePermission(r.id(), r.permissionId());
    }

    /**
     * Get share permissions
     * <p>
     * Returns the share permissions for a filter. A filter can be shared with groups, projects, all logged-in users, or the public. Sharing with all logged-in users or the public is known as a global share permission.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None, however, share permissions are only returned for:
     *  *
     * filters owned by the user.
     * *
     * filters shared with a group that the user is a member of.
     * *
     * filters shared with a private project that the user has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.
     * *
     * filters shared with a public project.
     * *
     * filters shared with the public.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<SharePermission> getSharePermissions(Consumer<GetSharePermissionsOperationSpec> spec) {
        GetSharePermissionsOperationSpec r = new GetSharePermissionsOperationSpec(spec);
        return api.getSharePermissions(r.id());
    }

    /**
     * Get time tracking settings
     * <p>
     * Returns the time tracking settings. This includes settings such as the time format, default time unit, and others. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public TimeTrackingConfiguration getSharedTimeTrackingConfiguration(Consumer<GetSharedTimeTrackingConfigurationOperationSpec> spec) {
        GetSharedTimeTrackingConfigurationOperationSpec r = new GetSharedTimeTrackingConfigurationOperationSpec(spec);
        return api.getSharedTimeTrackingConfiguration();
    }

    /**
     * Get status
     * <p>
     * Returns a status. The status must be associated with an active workflow to be returned.
     * If a name is used on more than one status, only the status found first is returned. Therefore, identifying the status by its ID may be preferable.
     * This operation can be accessed anonymously.
     * [Permissions](#permissions) required: None.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public StatusDetails getStatus(Consumer<GetStatusOperationSpec> spec) {
        GetStatusOperationSpec r = new GetStatusOperationSpec(spec);
        return api.getStatus(r.idOrName());
    }

    /**
     * Get all status categories
     * <p>
     * Returns a list of all status categories.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<StatusCategory> getStatusCategories(Consumer<GetStatusCategoriesOperationSpec> spec) {
        GetStatusCategoriesOperationSpec r = new GetStatusCategoriesOperationSpec(spec);
        return api.getStatusCategories();
    }

    /**
     * Get status category
     * <p>
     * Returns a status category. Status categories provided a mechanism for categorizing [statuses](#api-rest-api-2-status-idOrName-get).
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public StatusCategory getStatusCategory(Consumer<GetStatusCategoryOperationSpec> spec) {
        GetStatusCategoryOperationSpec r = new GetStatusCategoryOperationSpec(spec);
        return api.getStatusCategory(r.idOrKey());
    }

    /**
     * Get all statuses
     * <p>
     * Returns a list of all statuses associated with active workflows.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<StatusDetails> getStatuses(Consumer<GetStatusesOperationSpec> spec) {
        GetStatusesOperationSpec r = new GetStatusesOperationSpec(spec);
        return api.getStatuses();
    }

    /**
     * Bulk get statuses
     * <p>
     * Returns a list of the statuses specified by one or more status IDs.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)
     * *
     * *Administer Jira* [project permission.](https://confluence.atlassian.com/x/yodKLg)
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<JiraStatus> getStatusesById(Consumer<GetStatusesByIdOperationSpec> spec) {
        GetStatusesByIdOperationSpec r = new GetStatusesByIdOperationSpec(spec);
        return api.getStatusesById(r.expand(), r.id());
    }

    /**
     * Get task
     * <p>
     * Returns the status of a [long-running asynchronous task](#async).
     * When a task has finished, this operation returns the JSON blob applicable to the task. See the documentation of the operation that created the task for details. Task details are not permanently retained. As of September 2019, details are retained for 14 days although this period may change without notice.
     * **[Permissions](#permissions) required:** either of:
     *  *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * *
     * Creator of the task.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public TaskProgressBeanObject getTask(Consumer<GetTaskOperationSpec> spec) {
        GetTaskOperationSpec r = new GetTaskOperationSpec(spec);
        return api.getTask(r.taskId());
    }

    /**
     * Get transitions
     * <p>
     * Returns either all transitions or a transition that can be performed by the user on an issue, based on the issue's status.
     * Note, if a request is made for a transition that does not exist or cannot be performed on the issue, given its status, the response will return any empty transitions list.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required: A list or transition is returned only when the user has:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * However, if the user does not have the *Transition issues* [ project permission](https://confluence.atlassian.com/x/yodKLg) the response will not list any transitions.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Transitions getTransitions(Consumer<GetTransitionsOperationSpec> spec) {
        GetTransitionsOperationSpec r = new GetTransitionsOperationSpec(spec);
        return api.getTransitions(r.issueIdOrKey(), r.expand(), r.transitionId(), r.skipRemoteOnlyCondition(), r.includeUnavailableTransitions(), r.sortByOpsBarAndStatus());
    }

    /**
     * Get fields in trash paginated
     * <p>
     * Returns a [paginated](#pagination) list of fields in the trash. The list may be restricted to fields whose field name or description partially match a string.
     * Only custom fields can be queried, `type` must be set to `custom`.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanField getTrashedFieldsPaginated(Consumer<GetTrashedFieldsPaginatedOperationSpec> spec) {
        GetTrashedFieldsPaginatedOperationSpec r = new GetTrashedFieldsPaginatedOperationSpec(spec);
        return api.getTrashedFieldsPaginated(r.startAt(), r.maxResults(), r.id(), r.query(), r.expand(), r.orderBy());
    }

    /**
     * Get UI modifications
     * <p>
     * Gets UI modifications. UI modifications can only be retrieved by Forge apps.
     * **[Permissions](#permissions) required:** None.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanUiModificationDetails getUiModifications(Consumer<GetUiModificationsOperationSpec> spec) {
        GetUiModificationsOperationSpec r = new GetUiModificationsOperationSpec(spec);
        return api.getUiModifications(r.startAt(), r.maxResults(), r.expand());
    }

    /**
     * Get user
     * <p>
     * Returns a user.
     * Privacy controls are applied to the response based on the user's preferences. This could mean, for example, that the user's email address is hidden. See the [Profile visibility overview](https://developer.atlassian.com/cloud/jira/platform/profile-visibility/) for more details.
     * **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [read:jira-user]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public User getUser(Consumer<GetUserOperationSpec> spec) {
        GetUserOperationSpec r = new GetUserOperationSpec(spec);
        return api.getUser(r.accountId(), r.username(), r.key(), r.expand());
    }

    /**
     * Get user default columns
     * <p>
     * Returns the default [issue table columns](https://confluence.atlassian.com/x/XYdKLg) for the user. If `accountId` is not passed in the request, the calling user's details are returned.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLgl), to get the column details for any user.
     * *
     * Permission to access Jira, to get the calling user's column details.
     * Authentication - Required Scopes: [read:jira-user]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<ColumnItem> getUserDefaultColumns(Consumer<GetUserDefaultColumnsOperationSpec> spec) {
        GetUserDefaultColumnsOperationSpec r = new GetUserDefaultColumnsOperationSpec(spec);
        return api.getUserDefaultColumns(r.accountId(), r.username());
    }

    /**
     * Get user email
     * <p>
     * Returns a user's email address. This API is only available to apps approved by Atlassian, according to these [guidelines](https://community.developer.atlassian.com/t/guidelines-for-requesting-access-to-email-address/27603).
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public UnrestrictedUserEmail getUserEmail(Consumer<GetUserEmailOperationSpec> spec) {
        GetUserEmailOperationSpec r = new GetUserEmailOperationSpec(spec);
        return api.getUserEmail(r.accountId());
    }

    /**
     * Get user email bulk
     * <p>
     * Returns a user's email address. This API is only available to apps approved by Atlassian, according to these [guidelines](https://community.developer.atlassian.com/t/guidelines-for-requesting-access-to-email-address/27603).
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public UnrestrictedUserEmail getUserEmailBulk(Consumer<GetUserEmailBulkOperationSpec> spec) {
        GetUserEmailBulkOperationSpec r = new GetUserEmailBulkOperationSpec(spec);
        return api.getUserEmailBulk(r.accountId());
    }

    /**
     * Get user groups
     * <p>
     * Returns the groups to which a user belongs.
     * **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [read:jira-user]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<GroupName> getUserGroups(Consumer<GetUserGroupsOperationSpec> spec) {
        GetUserGroupsOperationSpec r = new GetUserGroupsOperationSpec(spec);
        return api.getUserGroups(r.accountId(), r.username(), r.key());
    }

    /**
     * Get user property
     * <p>
     * Returns the value of a user's property. If no property key is provided [Get user property keys](#api-rest-api-2-user-properties-get) is called.
     * Note: This operation does not access the [user properties](https://confluence.atlassian.com/x/8YxjL) created and maintained in Jira.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to get a property from any user.
     * *
     * Access to Jira, to get a property from the calling user's record.
     * Authentication - Required Scopes: [read:jira-user]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public EntityProperty getUserProperty(Consumer<GetUserPropertyOperationSpec> spec) {
        GetUserPropertyOperationSpec r = new GetUserPropertyOperationSpec(spec);
        return api.getUserProperty(r.propertyKey(), r.accountId(), r.userKey(), r.username());
    }

    /**
     * Get user property keys
     * <p>
     * Returns the keys of all properties for a user.
     * Note: This operation does not access the [user properties](https://confluence.atlassian.com/x/8YxjL) created and maintained in Jira.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to access the property keys on any user.
     * *
     * Access to Jira, to access the calling user's property keys.
     * Authentication - Required Scopes: [read:jira-user]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PropertyKeys getUserPropertyKeys(Consumer<GetUserPropertyKeysOperationSpec> spec) {
        GetUserPropertyKeysOperationSpec r = new GetUserPropertyKeysOperationSpec(spec);
        return api.getUserPropertyKeys(r.accountId(), r.userKey(), r.username());
    }

    /**
     * Get users from group
     * <p>
     * Returns a [paginated](#pagination) list of all users in a group.
     * Note that users are ordered by username, however the username is not returned in the results due to privacy reasons.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanUserDetails getUsersFromGroup(Consumer<GetUsersFromGroupOperationSpec> spec) {
        GetUsersFromGroupOperationSpec r = new GetUsersFromGroupOperationSpec(spec);
        return api.getUsersFromGroup(r.groupname(), r.groupId(), r.includeInactiveUsers(), r.startAt(), r.maxResults());
    }

    /**
     * Get valid project key
     * <p>
     * Validates a project key and, if the key is invalid or in use, generates a valid random string for the project key.
     * **[Permissions](#permissions) required:** None.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public String getValidProjectKey(Consumer<GetValidProjectKeyOperationSpec> spec) {
        GetValidProjectKeyOperationSpec r = new GetValidProjectKeyOperationSpec(spec);
        return api.getValidProjectKey(r.key());
    }

    /**
     * Get valid project name
     * <p>
     * Checks that a project name isn't in use. If the name isn't in use, the passed string is returned. If the name is in use, this operation attempts to generate a valid project name based on the one supplied, usually by adding a sequence number. If a valid project name cannot be generated, a 404 response is returned.
     * **[Permissions](#permissions) required:** None.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public String getValidProjectName(Consumer<GetValidProjectNameOperationSpec> spec) {
        GetValidProjectNameOperationSpec r = new GetValidProjectNameOperationSpec(spec);
        return api.getValidProjectName(r.name());
    }

    /**
     * Get version
     * <p>
     * Returns a project version.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the version.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Version getVersion(Consumer<GetVersionOperationSpec> spec) {
        GetVersionOperationSpec r = new GetVersionOperationSpec(spec);
        return api.getVersion(r.id(), r.expand());
    }

    /**
     * Get version's related issues count
     * <p>
     * Returns the following counts for a version:
     *  *
     * Number of issues where the `fixVersion` is set to the version.
     * *
     * Number of issues where the `affectedVersion` is set to the version.
     * *
     * Number of issues where a version custom field is set to the version.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse projects* project permission for the project that contains the version.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public VersionIssueCounts getVersionRelatedIssues(Consumer<GetVersionRelatedIssuesOperationSpec> spec) {
        GetVersionRelatedIssuesOperationSpec r = new GetVersionRelatedIssuesOperationSpec(spec);
        return api.getVersionRelatedIssues(r.id());
    }

    /**
     * Get version's unresolved issues count
     * <p>
     * Returns counts of the issues and unresolved issues for the project version.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse projects* project permission for the project that contains the version.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public VersionUnresolvedIssuesCount getVersionUnresolvedIssues(Consumer<GetVersionUnresolvedIssuesOperationSpec> spec) {
        GetVersionUnresolvedIssuesOperationSpec r = new GetVersionUnresolvedIssuesOperationSpec(spec);
        return api.getVersionUnresolvedIssues(r.id());
    }

    /**
     * Get visible issue field options
     * <p>
     * Returns a [paginated](#pagination) list of options for a select list issue field that can be viewed by the user.
     * Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanIssueFieldOption getVisibleIssueFieldOptions(Consumer<GetVisibleIssueFieldOptionsOperationSpec> spec) {
        GetVisibleIssueFieldOptionsOperationSpec r = new GetVisibleIssueFieldOptionsOperationSpec(spec);
        return api.getVisibleIssueFieldOptions(r.fieldKey(), r.startAt(), r.maxResults(), r.projectId());
    }

    /**
     * Get votes
     * <p>
     * Returns details about the votes on an issue.
     * This operation requires the **Allow users to vote on issues** option to be *ON*. This option is set in General configuration for Jira. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is ini
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Note that users with the necessary permissions for this operation but without the *View voters and watchers* project permissions are not returned details in the `voters` field.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Votes getVotes(Consumer<GetVotesOperationSpec> spec) {
        GetVotesOperationSpec r = new GetVotesOperationSpec(spec);
        return api.getVotes(r.issueIdOrKey());
    }

    /**
     * Get issue types for workflows in workflow scheme
     * <p>
     * Returns the workflow-issue type mappings for a workflow scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public IssueTypesWorkflowMapping getWorkflow(Consumer<GetWorkflowOperationSpec> spec) {
        GetWorkflowOperationSpec r = new GetWorkflowOperationSpec(spec);
        return api.getWorkflow(r.id(), r.workflowName(), r.returnDraftIfExists());
    }

    /**
     * Get workflow scheme
     * <p>
     * Returns a workflow scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WorkflowScheme getWorkflowScheme(Consumer<GetWorkflowSchemeOperationSpec> spec) {
        GetWorkflowSchemeOperationSpec r = new GetWorkflowSchemeOperationSpec(spec);
        return api.getWorkflowScheme(r.id(), r.returnDraftIfExists());
    }

    /**
     * Get draft workflow scheme
     * <p>
     * Returns the draft workflow scheme for an active workflow scheme. Draft workflow schemes allow changes to be made to the active workflow schemes: When an active workflow scheme is updated, a draft copy is created. The draft is modified, then the changes in the draft are copied back to the active workflow scheme. See [Configuring workflow schemes](https://confluence.atlassian.com/x/tohKLg) for more information.
     *  Note that:
     *  *
     * Only active workflow schemes can have draft workflow schemes.
     * *
     * An active workflow scheme can only have one draft workflow scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WorkflowScheme getWorkflowSchemeDraft(Consumer<GetWorkflowSchemeDraftOperationSpec> spec) {
        GetWorkflowSchemeDraftOperationSpec r = new GetWorkflowSchemeDraftOperationSpec(spec);
        return api.getWorkflowSchemeDraft(r.id());
    }

    /**
     * Get workflow for issue type in draft workflow scheme
     * <p>
     * Returns the issue type-workflow mapping for an issue type in a workflow scheme's draft.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public IssueTypeWorkflowMapping getWorkflowSchemeDraftIssueType(Consumer<GetWorkflowSchemeDraftIssueTypeOperationSpec> spec) {
        GetWorkflowSchemeDraftIssueTypeOperationSpec r = new GetWorkflowSchemeDraftIssueTypeOperationSpec(spec);
        return api.getWorkflowSchemeDraftIssueType(r.id(), r.issueType());
    }

    /**
     * Get workflow for issue type in workflow scheme
     * <p>
     * Returns the issue type-workflow mapping for an issue type in a workflow scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public IssueTypeWorkflowMapping getWorkflowSchemeIssueType(Consumer<GetWorkflowSchemeIssueTypeOperationSpec> spec) {
        GetWorkflowSchemeIssueTypeOperationSpec r = new GetWorkflowSchemeIssueTypeOperationSpec(spec);
        return api.getWorkflowSchemeIssueType(r.id(), r.issueType(), r.returnDraftIfExists());
    }

    /**
     * Get workflow scheme project associations
     * <p>
     * Returns a list of the workflow schemes associated with a list of projects. Each returned workflow scheme includes a list of the requested projects associated with it. Any team-managed or non-existent projects in the request are ignored and no errors are returned.
     * If the project is associated with the `Default Workflow Scheme` no ID is returned. This is because the way the `Default Workflow Scheme` is stored means it has no ID.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ContainerOfWorkflowSchemeAssociations getWorkflowSchemeProjectAssociations(Consumer<GetWorkflowSchemeProjectAssociationsOperationSpec> spec) {
        GetWorkflowSchemeProjectAssociationsOperationSpec r = new GetWorkflowSchemeProjectAssociationsOperationSpec(spec);
        return api.getWorkflowSchemeProjectAssociations(r.projectId());
    }

    /**
     * Get workflow transition properties
     * <p>
     * Returns the properties on a workflow transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WorkflowTransitionProperty getWorkflowTransitionProperties(Consumer<GetWorkflowTransitionPropertiesOperationSpec> spec) {
        GetWorkflowTransitionPropertiesOperationSpec r = new GetWorkflowTransitionPropertiesOperationSpec(spec);
        return api.getWorkflowTransitionProperties(r.transitionId(), r.workflowName(), r.includeReservedKeys(), r.key(), r.workflowMode());
    }

    /**
     * Get workflow transition rule configurations
     * <p>
     * Returns a [paginated](#pagination) list of workflows with transition rules. The workflows can be filtered to return only those containing workflow transition rules:
     *  *
     * of one or more transition rule types, such as [workflow post functions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-post-function/).
     * *
     * matching one or more transition rule keys.
     * Only workflows containing transition rules created by the calling [Connect](https://developer.atlassian.com/cloud/jira/platform/index/#connect-apps) or [Forge](https://developer.atlassian.com/cloud/jira/platform/index/#forge-apps) app are returned.
     * Due to server-side optimizations, workflows with an empty list of rules may be returned; these workflows can be ignored.
     * **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/index/#connect-apps) or [Forge](https://developer.atlassian.com/cloud/jira/platform/index/#forge-apps) apps can use this operation.
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanWorkflowTransitionRules getWorkflowTransitionRuleConfigurations(Consumer<GetWorkflowTransitionRuleConfigurationsOperationSpec> spec) {
        GetWorkflowTransitionRuleConfigurationsOperationSpec r = new GetWorkflowTransitionRuleConfigurationsOperationSpec(spec);
        return api.getWorkflowTransitionRuleConfigurations(r.types(), r.startAt(), r.maxResults(), r.keys(), r.workflowNames(), r.withTags(), r.draft(), r.expand());
    }

    /**
     * Get workflows paginated
     * <p>
     * Returns a [paginated](#pagination) list of published classic workflows. When workflow names are specified, details of those workflows are returned. Otherwise, all published classic workflows are returned.
     * This operation does not return next-gen workflows.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanWorkflow getWorkflowsPaginated(Consumer<GetWorkflowsPaginatedOperationSpec> spec) {
        GetWorkflowsPaginatedOperationSpec r = new GetWorkflowsPaginatedOperationSpec(spec);
        return api.getWorkflowsPaginated(r.startAt(), r.maxResults(), r.workflowName(), r.expand(), r.queryString(), r.orderBy(), r.isActive());
    }

    /**
     * Get worklog
     * <p>
     * Returns a worklog.
     * Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * *
     * If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Worklog getWorklog(Consumer<GetWorklogOperationSpec> spec) {
        GetWorklogOperationSpec r = new GetWorklogOperationSpec(spec);
        return api.getWorklog(r.issueIdOrKey(), r.id(), r.expand());
    }

    /**
     * Get worklog property
     * <p>
     * Returns the value of a worklog property.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * *
     * If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public EntityProperty getWorklogProperty(Consumer<GetWorklogPropertyOperationSpec> spec) {
        GetWorklogPropertyOperationSpec r = new GetWorklogPropertyOperationSpec(spec);
        return api.getWorklogProperty(r.issueIdOrKey(), r.worklogId(), r.propertyKey());
    }

    /**
     * Get worklog property keys
     * <p>
     * Returns the keys of all properties for a worklog.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * *
     * If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PropertyKeys getWorklogPropertyKeys(Consumer<GetWorklogPropertyKeysOperationSpec> spec) {
        GetWorklogPropertyKeysOperationSpec r = new GetWorklogPropertyKeysOperationSpec(spec);
        return api.getWorklogPropertyKeys(r.issueIdOrKey(), r.worklogId());
    }

    /**
     * Get worklogs
     * <p>
     * Returns worklog details for a list of worklog IDs.
     * The returned list of worklogs is limited to 1000 items.
     * **[Permissions](#permissions) required:** Permission to access Jira, however, worklogs are only returned where either of the following is true:
     *  *
     * the worklog is set as *Viewable by All Users*.
     * *
     * the user is a member of a project role or group with permission to view the worklog.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public List<Worklog> getWorklogsForIds(Consumer<GetWorklogsForIdsOperationSpec> spec) {
        GetWorklogsForIdsOperationSpec r = new GetWorklogsForIdsOperationSpec(spec);
        return api.getWorklogsForIds(r.worklogIdsRequestBean(), r.expand());
    }

    /**
     * Create issue link
     * <p>
     * Creates a link between two issues. Use this operation to indicate a relationship between two issues and optionally add a comment to the from (outward) issue. To use this resource the site must have [Issue Linking](https://confluence.atlassian.com/x/yoXKM) enabled.
     * This resource returns nothing on the creation of an issue link. To obtain the ID of the issue link, use `https://your-domain.atlassian.net/rest/api/2/issue/[linked issue key]?fields=issuelinks`.
     * If the link request duplicates a link, the response indicates that the issue link was created. If the request included a comment, the comment is added.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse project* [project permission](https://confluence.atlassian.com/x/yodKLg) for all the projects containing the issues to be linked,
     * *
     * *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) on the project containing the from (outward) issue,
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * *
     * If the comment has visibility restrictions, belongs to the group or has the role visibility is restricted to.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object linkIssues(Consumer<LinkIssuesOperationSpec> spec) {
        LinkIssuesOperationSpec r = new LinkIssuesOperationSpec(spec);
        return api.linkIssues(r.linkIssueRequestJsonBean());
    }

    /**
     * Check issues against JQL
     * <p>
     * Checks whether one or more issues would be returned by one or more JQL queries.
     * **[Permissions](#permissions) required:** None, however, issues are only matched against JQL queries where the user has:
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public IssueMatches matchIssues(Consumer<MatchIssuesOperationSpec> spec) {
        MatchIssuesOperationSpec r = new MatchIssuesOperationSpec(spec);
        return api.matchIssues(r.issuesAndJQLQueries());
    }

    /**
     * Merge versions
     * <p>
     * Merges two project versions. The merge is completed by deleting the version specified in `id` and replacing any occurrences of its ID in `fixVersion` with the version ID specified in `moveIssuesTo`.
     * Consider using [ Delete and replace version](#api-rest-api-2-version-id-removeAndSwap-post) instead. This resource supports swapping version values in `fixVersion`, `affectedVersion`, and custom fields.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that contains the version.
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object mergeVersions(Consumer<MergeVersionsOperationSpec> spec) {
        MergeVersionsOperationSpec r = new MergeVersionsOperationSpec(spec);
        return api.mergeVersions(r.id(), r.moveIssuesTo());
    }

    /**
     * Convert user identifiers to account IDs in JQL queries
     * <p>
     * Converts one or more JQL queries with user identifiers (username or user key) to equivalent JQL queries with account IDs.
     * You may wish to use this operation if your system stores JQL queries and you want to make them GDPR-compliant. For more information about GDPR-related changes, see the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/).
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [read:jira-user]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ConvertedJQLQueries migrateQueries(Consumer<MigrateQueriesOperationSpec> spec) {
        MigrateQueriesOperationSpec r = new MigrateQueriesOperationSpec(spec);
        return api.migrateQueries(r.jqLPersonalDataMigrationRequest());
    }

    /**
     * Bulk update entity properties
     * <p>
     * Updates the values of multiple entity properties for an object, up to 50 updates per request. This operation is for use by Connect apps during app migration.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void migrationResourceUpdateEntityPropertiesValuePut(Consumer<MigrationResourceUpdateEntityPropertiesValuePutOperationSpec> spec) {
        MigrationResourceUpdateEntityPropertiesValuePutOperationSpec r = new MigrationResourceUpdateEntityPropertiesValuePutOperationSpec(spec);
        api.migrationResourceUpdateEntityPropertiesValuePut(r.atlassianTransferId(), r.entityType(), r.entityPropertyDetails());
    }

    /**
     * Get workflow transition rule configurations
     * <p>
     * Returns configurations for workflow transition rules migrated from server to cloud and owned by the calling Connect app.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WorkflowRulesSearchDetails migrationResourceWorkflowRuleSearchPost(Consumer<MigrationResourceWorkflowRuleSearchPostOperationSpec> spec) {
        MigrationResourceWorkflowRuleSearchPostOperationSpec r = new MigrationResourceWorkflowRuleSearchPostOperationSpec(spec);
        return api.migrationResourceWorkflowRuleSearchPost(r.atlassianTransferId(), r.workflowRulesSearch());
    }

    /**
     * Move priorities
     * <p>
     * Changes the order of issue priorities.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object movePriorities(Consumer<MovePrioritiesOperationSpec> spec) {
        MovePrioritiesOperationSpec r = new MovePrioritiesOperationSpec(spec);
        return api.movePriorities(r.reorderIssuePriorities());
    }

    /**
     * Move resolutions
     * <p>
     * Changes the order of issue resolutions.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object moveResolutions(Consumer<MoveResolutionsOperationSpec> spec) {
        MoveResolutionsOperationSpec r = new MoveResolutionsOperationSpec(spec);
        return api.moveResolutions(r.reorderIssueResolutionsRequest());
    }

    /**
     * Move screen tab
     * <p>
     * Moves a screen tab.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object moveScreenTab(Consumer<MoveScreenTabOperationSpec> spec) {
        MoveScreenTabOperationSpec r = new MoveScreenTabOperationSpec(spec);
        return api.moveScreenTab(r.screenId(), r.tabId(), r.pos());
    }

    /**
     * Move screen tab field
     * <p>
     * Moves a screen tab field.
     * If `after` and `position` are provided in the request, `position` is ignored.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object moveScreenTabField(Consumer<MoveScreenTabFieldOperationSpec> spec) {
        MoveScreenTabFieldOperationSpec r = new MoveScreenTabFieldOperationSpec(spec);
        return api.moveScreenTabField(r.screenId(), r.tabId(), r.id(), r.moveFieldBean());
    }

    /**
     * Move version
     * <p>
     * Modifies the version's sequence within the project, which affects the display order of the versions in Jira.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse projects* project permission for the project that contains the version.
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Version moveVersion(Consumer<MoveVersionOperationSpec> spec) {
        MoveVersionOperationSpec r = new MoveVersionOperationSpec(spec);
        return api.moveVersion(r.id(), r.versionMoveBean());
    }

    /**
     * Send notification for issue
     * <p>
     * Creates an email notification for an issue and adds it to the mail queue.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object notify(Consumer<NotifyOperationSpec> spec) {
        NotifyOperationSpec r = new NotifyOperationSpec(spec);
        return api.notify(r.issueIdOrKey(), r.requestBody());
    }

    /**
     * Parse JQL query
     * <p>
     * Parses and validates JQL queries.
     * Validation is performed in context of the current user.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ParsedJqlQueries parseJqlQueries(Consumer<ParseJqlQueriesOperationSpec> spec) {
        ParseJqlQueriesOperationSpec r = new ParseJqlQueriesOperationSpec(spec);
        return api.parseJqlQueries(r.jqlQueriesToParse(), r.validation());
    }

    /**
     * Partial update project role
     * <p>
     * Updates either the project role's name or its description.
     * You cannot update both the name and description at the same time using this operation. If you send a request with a name and a description only the name is updated.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ProjectRole partialUpdateProjectRole(Consumer<PartialUpdateProjectRoleOperationSpec> spec) {
        PartialUpdateProjectRoleOperationSpec r = new PartialUpdateProjectRoleOperationSpec(spec);
        return api.partialUpdateProjectRole(r.id(), r.createUpdateRoleRequestBean());
    }

    /**
     * Publish draft workflow scheme
     * <p>
     * Publishes a draft workflow scheme.
     * Where the draft workflow includes new workflow statuses for an issue type, mappings are provided to update issues with the original workflow status to the new workflow status.
     * This operation is [asynchronous](#async). Follow the `location` link in the response to determine the status of the task and use [Get task](#api-rest-api-2-task-taskId-get) to obtain updates.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void publishDraftWorkflowScheme(Consumer<PublishDraftWorkflowSchemeOperationSpec> spec) {
        PublishDraftWorkflowSchemeOperationSpec r = new PublishDraftWorkflowSchemeOperationSpec(spec);
        api.publishDraftWorkflowScheme(r.id(), r.publishDraftWorkflowScheme(), r.validateOnly());
    }

    /**
     * Bulk get workflows
     * <p>
     * Returns a list of workflows and related statuses by providing workflow names, workflow IDs, or project and issue types.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* project permission to access all, including global-scoped, workflows
     * *
     * At least one of the *Administer projects* and *View (read-only) workflow* project permissions to access project-scoped workflows
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WorkflowReadResponse readWorkflows(Consumer<ReadWorkflowsOperationSpec> spec) {
        ReadWorkflowsOperationSpec r = new ReadWorkflowsOperationSpec(spec);
        return api.readWorkflows(r.workflowReadRequest(), r.expand());
    }

    /**
     * Extend webhook life
     * <p>
     * Extends the life of webhook. Webhooks registered through the REST API expire after 30 days. Call this operation to keep them alive.
     * Unrecognized webhook IDs (those that are not found or belong to other apps) are ignored.
     * **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/#connect-apps) and [OAuth 2.0](https://developer.atlassian.com/cloud/jira/platform/oauth-2-3lo-apps) apps can use this operation.
     * Authentication - Required Scopes: [read:jira-work, manage:jira-webhook]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WebhooksExpirationDate refreshWebhooks(Consumer<RefreshWebhooksOperationSpec> spec) {
        RefreshWebhooksOperationSpec r = new RefreshWebhooksOperationSpec(spec);
        return api.refreshWebhooks(r.containerForWebhookIDs());
    }

    /**
     * Register dynamic webhooks
     * <p>
     * Registers webhooks.
     * **NOTE:** for non-public OAuth apps, webhooks are delivered only if there is a match between the app owner and the user who registered a dynamic webhook.
     * **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/#connect-apps) and [OAuth 2.0](https://developer.atlassian.com/cloud/jira/platform/oauth-2-3lo-apps) apps can use this operation.
     * Authentication - Required Scopes: [read:jira-work, manage:jira-webhook]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ContainerForRegisteredWebhooks registerDynamicWebhooks(Consumer<RegisterDynamicWebhooksOperationSpec> spec) {
        RegisterDynamicWebhooksOperationSpec r = new RegisterDynamicWebhooksOperationSpec(spec);
        return api.registerDynamicWebhooks(r.webhookRegistrationDetails());
    }

    /**
     * Delete attachment
     * <p>
     * Deletes an attachment from an issue.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** For the project holding the issue containing the attachment:
     *  *
     * *Delete own attachments* [project permission](https://confluence.atlassian.com/x/yodKLg) to delete an attachment created by the calling user.
     * *
     * *Delete all attachments* [project permission](https://confluence.atlassian.com/x/yodKLg) to delete an attachment created by any user.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void removeAttachment(Consumer<RemoveAttachmentOperationSpec> spec) {
        RemoveAttachmentOperationSpec r = new RemoveAttachmentOperationSpec(spec);
        api.removeAttachment(r.id());
    }

    /**
     * Remove custom field context from projects
     * <p>
     * Removes a custom field context from projects.
     * A custom field context without any projects applies to all projects. Removing all projects from a custom field context would result in it applying to all projects.
     * If any project in the request is not assigned to the context, or the operation would result in two global contexts for the field, the operation fails.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object removeCustomFieldContextFromProjects(Consumer<RemoveCustomFieldContextFromProjectsOperationSpec> spec) {
        RemoveCustomFieldContextFromProjectsOperationSpec r = new RemoveCustomFieldContextFromProjectsOperationSpec(spec);
        return api.removeCustomFieldContextFromProjects(r.fieldId(), r.contextId(), r.projectIds());
    }

    /**
     * Remove gadget from dashboard
     * <p>
     * Removes a dashboard gadget from a dashboard.
     * When a gadget is removed from a dashboard, other gadgets in the same column are moved up to fill the emptied position.
     * **[Permissions](#permissions) required:** None.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object removeGadget(Consumer<RemoveGadgetOperationSpec> spec) {
        RemoveGadgetOperationSpec r = new RemoveGadgetOperationSpec(spec);
        return api.removeGadget(r.dashboardId(), r.gadgetId());
    }

    /**
     * Remove group
     * <p>
     * Deletes a group.
     * **[Permissions](#permissions) required:** Site administration (that is, member of the *site-admin* strategic [group](https://confluence.atlassian.com/x/24xjL)).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void removeGroup(Consumer<RemoveGroupOperationSpec> spec) {
        RemoveGroupOperationSpec r = new RemoveGroupOperationSpec(spec);
        api.removeGroup(r.groupname(), r.groupId(), r.swapGroup(), r.swapGroupId());
    }

    /**
     * Remove issue type from issue type scheme
     * <p>
     * Removes an issue type from an issue type scheme.
     * This operation cannot remove:
     *  *
     * any issue type used by issues.
     * *
     * any issue types from the default issue type scheme.
     * *
     * the last standard issue type from an issue type scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object removeIssueTypeFromIssueTypeScheme(Consumer<RemoveIssueTypeFromIssueTypeSchemeOperationSpec> spec) {
        RemoveIssueTypeFromIssueTypeSchemeOperationSpec r = new RemoveIssueTypeFromIssueTypeSchemeOperationSpec(spec);
        return api.removeIssueTypeFromIssueTypeScheme(r.issueTypeSchemeId(), r.issueTypeId());
    }

    /**
     * Remove issue types from context
     * <p>
     * Removes issue types from a custom field context.
     * A custom field context without any issue types applies to all issue types.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object removeIssueTypesFromContext(Consumer<RemoveIssueTypesFromContextOperationSpec> spec) {
        RemoveIssueTypesFromContextOperationSpec r = new RemoveIssueTypesFromContextOperationSpec(spec);
        return api.removeIssueTypesFromContext(r.fieldId(), r.contextId(), r.issueTypeIds());
    }

    /**
     * Remove issue types from field configuration scheme
     * <p>
     * Removes issue types from the field configuration scheme.
     * This operation can only modify field configuration schemes used in company-managed (classic) projects.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object removeIssueTypesFromGlobalFieldConfigurationScheme(Consumer<RemoveIssueTypesFromGlobalFieldConfigurationSchemeOperationSpec> spec) {
        RemoveIssueTypesFromGlobalFieldConfigurationSchemeOperationSpec r = new RemoveIssueTypesFromGlobalFieldConfigurationSchemeOperationSpec(spec);
        return api.removeIssueTypesFromGlobalFieldConfigurationScheme(r.id(), r.issueTypeIdsToRemove());
    }

    /**
     * Remove issue security level
     * <p>
     * Deletes an issue security level.
     * This operation is [asynchronous](#async). Follow the `location` link in the response to determine the status of the task and use [Get task](#api-rest-api-2-task-taskId-get) to obtain subsequent updates.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void removeLevel(Consumer<RemoveLevelOperationSpec> spec) {
        RemoveLevelOperationSpec r = new RemoveLevelOperationSpec(spec);
        api.removeLevel(r.schemeId(), r.levelId(), r.replaceWith());
    }

    /**
     * Remove mappings from issue type screen scheme
     * <p>
     * Removes issue type to screen scheme mappings from an issue type screen scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object removeMappingsFromIssueTypeScreenScheme(Consumer<RemoveMappingsFromIssueTypeScreenSchemeOperationSpec> spec) {
        RemoveMappingsFromIssueTypeScreenSchemeOperationSpec r = new RemoveMappingsFromIssueTypeScreenSchemeOperationSpec(spec);
        return api.removeMappingsFromIssueTypeScreenScheme(r.issueTypeScreenSchemeId(), r.issueTypeIds());
    }

    /**
     * Remove member from issue security level
     * <p>
     * Removes an issue security level member from an issue security scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object removeMemberFromSecurityLevel(Consumer<RemoveMemberFromSecurityLevelOperationSpec> spec) {
        RemoveMemberFromSecurityLevelOperationSpec r = new RemoveMemberFromSecurityLevelOperationSpec(spec);
        return api.removeMemberFromSecurityLevel(r.schemeId(), r.levelId(), r.memberId());
    }

    /**
     * Remove notification from notification scheme
     * <p>
     * Removes a notification from a notification scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object removeNotificationFromNotificationScheme(Consumer<RemoveNotificationFromNotificationSchemeOperationSpec> spec) {
        RemoveNotificationFromNotificationSchemeOperationSpec r = new RemoveNotificationFromNotificationSchemeOperationSpec(spec);
        return api.removeNotificationFromNotificationScheme(r.notificationSchemeId(), r.notificationId());
    }

    /**
     * Delete preference
     * <p>
     * Deletes a preference of the user, which restores the default value of system defined settings.
     * Note that these keys are deprecated:
     *  *
     * *jira.user.locale* The locale of the user. By default, not set. The user takes the instance locale.
     * *
     * *jira.user.timezone* The time zone of the user. By default, not set. The user takes the instance timezone.
     * Use [ Update a user profile](https://developer.atlassian.com/cloud/admin/user-management/rest/#api-users-account-id-manage-profile-patch) from the user management REST API to manage timezone and locale instead.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void removePreference(Consumer<RemovePreferenceOperationSpec> spec) {
        RemovePreferenceOperationSpec r = new RemovePreferenceOperationSpec(spec);
        api.removePreference(r.key());
    }

    /**
     * Delete project category
     * <p>
     * Deletes a project category.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void removeProjectCategory(Consumer<RemoveProjectCategoryOperationSpec> spec) {
        RemoveProjectCategoryOperationSpec r = new RemoveProjectCategoryOperationSpec(spec);
        api.removeProjectCategory(r.id());
    }

    /**
     * Remove screen tab field
     * <p>
     * Removes a field from a screen tab.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void removeScreenTabField(Consumer<RemoveScreenTabFieldOperationSpec> spec) {
        RemoveScreenTabFieldOperationSpec r = new RemoveScreenTabFieldOperationSpec(spec);
        api.removeScreenTabField(r.screenId(), r.tabId(), r.id());
    }

    /**
     * Delete user
     * <p>
     * Deletes a user. If the operation completes successfully then the user is removed from Jira's user base. This operation does not delete the user's Atlassian account.
     * **[Permissions](#permissions) required:** Site administration (that is, membership of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)).
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void removeUser(Consumer<RemoveUserOperationSpec> spec) {
        RemoveUserOperationSpec r = new RemoveUserOperationSpec(spec);
        api.removeUser(r.accountId(), r.username(), r.key());
    }

    /**
     * Remove user from group
     * <p>
     * Removes a user from a group.
     * **[Permissions](#permissions) required:** Site administration (that is, member of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void removeUserFromGroup(Consumer<RemoveUserFromGroupOperationSpec> spec) {
        RemoveUserFromGroupOperationSpec r = new RemoveUserFromGroupOperationSpec(spec);
        api.removeUserFromGroup(r.accountId(), r.groupname(), r.groupId(), r.username());
    }

    /**
     * Delete vote
     * <p>
     * Deletes a user's vote from an issue. This is the equivalent of the user clicking *Unvote* on an issue in Jira.
     * This operation requires the **Allow users to vote on issues** option to be *ON*. This option is set in General configuration for Jira. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void removeVote(Consumer<RemoveVoteOperationSpec> spec) {
        RemoveVoteOperationSpec r = new RemoveVoteOperationSpec(spec);
        api.removeVote(r.issueIdOrKey());
    }

    /**
     * Delete watcher
     * <p>
     * Deletes a user as a watcher of an issue.
     * This operation requires the **Allow users to watch issues** option to be *ON*. This option is set in General configuration for Jira. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * *
     * To remove users other than themselves from the watchlist, *Manage watcher list* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void removeWatcher(Consumer<RemoveWatcherOperationSpec> spec) {
        RemoveWatcherOperationSpec r = new RemoveWatcherOperationSpec(spec);
        api.removeWatcher(r.issueIdOrKey(), r.username(), r.accountId());
    }

    /**
     * Update screen tab
     * <p>
     * Updates the name of a screen tab.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ScreenableTab renameScreenTab(Consumer<RenameScreenTabOperationSpec> spec) {
        RenameScreenTabOperationSpec r = new RenameScreenTabOperationSpec(spec);
        return api.renameScreenTab(r.screenId(), r.tabId(), r.screenableTab());
    }

    /**
     * Reorder custom field options (context)
     * <p>
     * Changes the order of custom field options or cascading options in a context.
     * This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object reorderCustomFieldOptions(Consumer<ReorderCustomFieldOptionsOperationSpec> spec) {
        ReorderCustomFieldOptionsOperationSpec r = new ReorderCustomFieldOptionsOperationSpec(spec);
        return api.reorderCustomFieldOptions(r.fieldId(), r.contextId(), r.orderOfCustomFieldOptions());
    }

    /**
     * Change order of issue types
     * <p>
     * Changes the order of issue types in an issue type scheme.
     * The request body parameters must meet the following requirements:
     *  *
     * all of the issue types must belong to the issue type scheme.
     * *
     * either `after` or `position` must be provided.
     * *
     * the issue type in `after` must not be in the issue type list.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object reorderIssueTypesInIssueTypeScheme(Consumer<ReorderIssueTypesInIssueTypeSchemeOperationSpec> spec) {
        ReorderIssueTypesInIssueTypeSchemeOperationSpec r = new ReorderIssueTypesInIssueTypeSchemeOperationSpec(spec);
        return api.reorderIssueTypesInIssueTypeScheme(r.issueTypeSchemeId(), r.orderOfIssueTypes());
    }

    /**
     * Replace issue field option
     * <p>
     * Deselects an issue-field select-list option from all issues where it is selected. A different option can be selected to replace the deselected option. The update can also be limited to a smaller set of issues by using a JQL query.
     * Connect and Forge app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) can override the screen security configuration using `overrideScreenSecurity` and `overrideEditableFlag`.
     * This is an [asynchronous operation](#async). The response object contains a link to the long-running task.
     * Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void replaceIssueFieldOption(Consumer<ReplaceIssueFieldOptionOperationSpec> spec) {
        ReplaceIssueFieldOptionOperationSpec r = new ReplaceIssueFieldOptionOperationSpec(spec);
        api.replaceIssueFieldOption(r.fieldKey(), r.optionId(), r.replaceWith(), r.jql(), r.overrideScreenSecurity(), r.overrideEditableFlag());
    }

    /**
     * Reset columns
     * <p>
     * Reset the user's column configuration for the filter to the default.
     * **[Permissions](#permissions) required:** Permission to access Jira, however, columns are only reset for:
     *  *
     * filters owned by the user.
     * *
     * filters shared with a group that the user is a member of.
     * *
     * filters shared with a private project that the user has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.
     * *
     * filters shared with a public project.
     * *
     * filters shared with the public.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void resetColumns(Consumer<ResetColumnsOperationSpec> spec) {
        ResetColumnsOperationSpec r = new ResetColumnsOperationSpec(spec);
        api.resetColumns(r.id());
    }

    /**
     * Reset user default columns
     * <p>
     * Resets the default [ issue table columns](https://confluence.atlassian.com/x/XYdKLg) for the user to the system default. If `accountId` is not passed, the calling user's default columns are reset.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to set the columns on any user.
     * *
     * Permission to access Jira, to set the calling user's columns.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public void resetUserColumns(Consumer<ResetUserColumnsOperationSpec> spec) {
        ResetUserColumnsOperationSpec r = new ResetUserColumnsOperationSpec(spec);
        api.resetUserColumns(r.accountId(), r.username());
    }

    /**
     * Restore deleted or archived project
     * <p>
     * Restores a project that has been archived or placed in the Jira recycle bin.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg)for Company managed projects.
     * *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project for Team managed projects.
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Project restore(Consumer<RestoreOperationSpec> spec) {
        RestoreOperationSpec r = new RestoreOperationSpec(spec);
        return api.restore(r.projectIdOrKey());
    }

    /**
     * Restore custom field from trash
     * <p>
     * Restores a custom field from trash. See [Edit or delete a custom field](https://confluence.atlassian.com/x/Z44fOw) for more information on trashing and deleting custom fields.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object restoreCustomField(Consumer<RestoreCustomFieldOperationSpec> spec) {
        RestoreCustomFieldOperationSpec r = new RestoreCustomFieldOperationSpec(spec);
        return api.restoreCustomField(r.id());
    }

    /**
     * Sanitize JQL queries
     * <p>
     * Sanitizes one or more JQL queries by converting readable details into IDs where a user doesn't have permission to view the entity.
     * For example, if the query contains the clause *project = 'Secret project'*, and a user does not have browse permission for the project "Secret project", the sanitized query replaces the clause with *project = 12345"* (where 12345 is the ID of the project). If a user has the required permission, the clause is not sanitized. If the account ID is null, sanitizing is performed for an anonymous user.
     * Note that sanitization doesn't make the queries GDPR-compliant, because it doesn't remove user identifiers (username or user key). If you need to make queries GDPR-compliant, use [Convert user identifiers to account IDs in JQL queries](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-jql/#api-rest-api-3-jql-sanitize-post).
     * Before sanitization each JQL query is parsed. The queries are returned in the same order that they were passed.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public SanitizedJqlQueries sanitiseJqlQueries(Consumer<SanitiseJqlQueriesOperationSpec> spec) {
        SanitiseJqlQueriesOperationSpec r = new SanitiseJqlQueriesOperationSpec(spec);
        return api.sanitiseJqlQueries(r.jqlQueriesToSanitize());
    }

    /**
     * Search statuses paginated
     * <p>
     * Returns a [paginated](https://developer.atlassian.com/cloud/jira/platform/rest/v3/intro/#pagination) list of statuses that match a search on name or project.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)
     * *
     * *Administer Jira* [project permission.](https://confluence.atlassian.com/x/yodKLg)
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageOfStatuses search(Consumer<SearchOperationSpec> spec) {
        SearchOperationSpec r = new SearchOperationSpec(spec);
        return api.search(r.expand(), r.projectId(), r.startAt(), r.maxResults(), r.searchString(), r.statusCategory());
    }

    /**
     * Search for issues using JQL (GET)
     * <p>
     * Searches for issues using [JQL](https://confluence.atlassian.com/x/egORLQ).
     * If the JQL query expression is too large to be encoded as a query parameter, use the [POST](#api-rest-api-2-search-post) version of this resource.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** Issues are included in the response where the user has:
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public SearchResults searchForIssuesUsingJql(Consumer<SearchForIssuesUsingJqlOperationSpec> spec) {
        SearchForIssuesUsingJqlOperationSpec r = new SearchForIssuesUsingJqlOperationSpec(spec);
        return api.searchForIssuesUsingJql(r.jql(), r.startAt(), r.maxResults(), r.validateQuery(), r.fields(), r.expand(), r.properties(), r.fieldsByKeys());
    }

    /**
     * Search for issues using JQL (POST)
     * <p>
     * Searches for issues using [JQL](https://confluence.atlassian.com/x/egORLQ).
     * There is a [GET](#api-rest-api-2-search-get) version of this resource that can be used for smaller JQL query expressions.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** Issues are included in the response where the user has:
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public SearchResults searchForIssuesUsingJqlPost(Consumer<SearchForIssuesUsingJqlPostOperationSpec> spec) {
        SearchForIssuesUsingJqlPostOperationSpec r = new SearchForIssuesUsingJqlPostOperationSpec(spec);
        return api.searchForIssuesUsingJqlPost(r.searchRequestBean());
    }

    /**
     * Search priorities
     * <p>
     * Returns a [paginated](#pagination) list of priorities. The list can contain all priorities or a subset determined by any combination of these criteria:
     *  *
     * a list of priority IDs. Any invalid priority IDs are ignored.
     * *
     * whether the field configuration is a default. This returns priorities from company-managed (classic) projects only, as there is no concept of default priorities in team-managed projects.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanPriority searchPriorities(Consumer<SearchPrioritiesOperationSpec> spec) {
        SearchPrioritiesOperationSpec r = new SearchPrioritiesOperationSpec(spec);
        return api.searchPriorities(r.startAt(), r.maxResults(), r.id(), r.onlyDefault());
    }

    /**
     * Get projects paginated
     * <p>
     * Returns a [paginated](#pagination) list of projects visible to the user.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** Projects are returned only where the user has one of:
     *  *
     * *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * *
     * *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanProject searchProjects(Consumer<SearchProjectsOperationSpec> spec) {
        SearchProjectsOperationSpec r = new SearchProjectsOperationSpec(spec);
        return api.searchProjects(r.startAt(), r.maxResults(), r.orderBy(), r.id(), r.keys(), r.query(), r.typeKey(), r.categoryId(), r.action(), r.expand(), r.status(), r.properties(), r.propertyQuery());
    }

    /**
     * Get projects using issue security schemes
     * <p>
     * Returns a [paginated](#pagination) mapping of projects that are using security schemes. You can provide either one or multiple security scheme IDs or project IDs to filter by. If you don't provide any, this will return a list of all mappings. Only issue security schemes in the context of classic projects are supported. **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanIssueSecuritySchemeToProjectMapping searchProjectsUsingSecuritySchemes(Consumer<SearchProjectsUsingSecuritySchemesOperationSpec> spec) {
        SearchProjectsUsingSecuritySchemesOperationSpec r = new SearchProjectsUsingSecuritySchemesOperationSpec(spec);
        return api.searchProjectsUsingSecuritySchemes(r.startAt(), r.maxResults(), r.issueSecuritySchemeId(), r.projectId());
    }

    /**
     * Search resolutions
     * <p>
     * Returns a [paginated](#pagination) list of resolutions. The list can contain all resolutions or a subset determined by any combination of these criteria:
     *  *
     * a list of resolutions IDs.
     * *
     * whether the field configuration is a default. This returns resolutions from company-managed (classic) projects only, as there is no concept of default resolutions in team-managed projects.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanResolutionJsonBean searchResolutions(Consumer<SearchResolutionsOperationSpec> spec) {
        SearchResolutionsOperationSpec r = new SearchResolutionsOperationSpec(spec);
        return api.searchResolutions(r.startAt(), r.maxResults(), r.id(), r.onlyDefault());
    }

    /**
     * Search issue security schemes
     * <p>
     * Returns a paginated list of issue security schemes.
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PageBeanSecuritySchemeWithProjects searchSecuritySchemes(Consumer<SearchSecuritySchemesOperationSpec> spec) {
        SearchSecuritySchemesOperationSpec r = new SearchSecuritySchemesOperationSpec(spec);
        return api.searchSecuritySchemes(r.startAt(), r.maxResults(), r.id(), r.projectId());
    }

    /**
     * Select time tracking provider
     * <p>
     * Selects a time tracking provider.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object selectTimeTrackingImplementation(Consumer<SelectTimeTrackingImplementationOperationSpec> spec) {
        SelectTimeTrackingImplementationOperationSpec r = new SelectTimeTrackingImplementationOperationSpec(spec);
        return api.selectTimeTrackingImplementation(r.timeTrackingProvider());
    }

    /**
     * Set actors for project role
     * <p>
     * Sets the actors for a project role for a project, replacing all existing actors.
     * To add actors to the project without overwriting the existing list, use [Add actors to project role](#api-rest-api-2-project-projectIdOrKey-role-id-post).
     * **[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ProjectRole setActors(Consumer<SetActorsOperationSpec> spec) {
        SetActorsOperationSpec r = new SetActorsOperationSpec(spec);
        return api.setActors(r.projectIdOrKey(), r.id(), r.projectRoleActorsUpdateBean());
    }

    /**
     * Set application property
     * <p>
     * Changes the value of an application property. For example, you can change the value of the `jira.clone.prefix` from its default value of *CLONE -* to *Clone -* if you prefer sentence case capitalization. Editable properties are described below along with their default values.
     * #### Advanced settings ####
     * The advanced settings below are also accessible in [Jira](https://confluence.atlassian.com/x/vYXKM).
     * | Key | Description | Default value |
     *  | -- | -- | -- |
     *  | `jira.clone.prefix` | The string of text prefixed to the title of a cloned issue. | `CLONE -` |
     *  | `jira.date.picker.java.format` | The date format for the Java (server-side) generated dates. This must be the same as the `jira.date.picker.javascript.format` format setting. | `d/MMM/yy` |
     *  | `jira.date.picker.javascript.format` | The date format for the JavaScript (client-side) generated dates. This must be the same as the `jira.date.picker.java.format` format setting. | `%e/%b/%y` |
     *  | `jira.date.time.picker.java.format` | The date format for the Java (server-side) generated date times. This must be the same as the `jira.date.time.picker.javascript.format` format setting. | `dd/MMM/yy h:mm a` |
     *  | `jira.date.time.picker.javascript.format` | The date format for the JavaScript (client-side) generated date times. This must be the same as the `jira.date.time.picker.java.format` format setting. | `%e/%b/%y %I:%M %p` |
     *  | `jira.issue.actions.order` | The default order of actions (such as *Comments* or *Change history*) displayed on the issue view. | `asc` |
     *  | `jira.table.cols.subtasks` | The columns to show while viewing subtask issues in a table. For example, a list of subtasks on an issue. | `issuetype, status, assignee, progress` |
     *  | `jira.view.issue.links.sort.order` | The sort order of the list of issue links on the issue view. | `type, status, priority` |
     *  | `jira.comment.collapsing.minimum.hidden` | The minimum number of comments required for comment collapsing to occur. A value of `0` disables comment collapsing. | `4` |
     *  | `jira.newsletter.tip.delay.days` | The number of days before a prompt to sign up to the Jira Insiders newsletter is shown. A value of `-1` disables this feature. | `7` |
     * 
     *  #### Look and feel ####
     * The settings listed below adjust the [look and feel](https://confluence.atlassian.com/x/VwCLLg).
     * | Key | Description | Default value |
     *  | -- | -- | -- |
     *  | `jira.lf.date.time` | The [ time format](https://docs.oracle.com/javase/6/docs/api/index.html?java/text/SimpleDateFormat.html). | `h:mm a` |
     *  | `jira.lf.date.day` | The [ day format](https://docs.oracle.com/javase/6/docs/api/index.html?java/text/SimpleDateFormat.html). | `EEEE h:mm a` |
     *  | `jira.lf.date.complete` | The [ date and time format](https://docs.oracle.com/javase/6/docs/api/index.html?java/text/SimpleDateFormat.html). | `dd/MMM/yy h:mm a` |
     *  | `jira.lf.date.dmy` | The [ date format](https://docs.oracle.com/javase/6/docs/api/index.html?java/text/SimpleDateFormat.html). | `dd/MMM/yy` |
     *  | `jira.date.time.picker.use.iso8061` | When enabled, sets Monday as the first day of the week in the date picker, as specified by the ISO8601 standard. | `false` |
     *  | `jira.lf.logo.url` | The URL of the logo image file. | `/images/icon-jira-logo.png` |
     *  | `jira.lf.logo.show.application.title` | Controls the visibility of the application title on the sidebar. | `false` |
     *  | `jira.lf.favicon.url` | The URL of the favicon. | `/favicon.ico` |
     *  | `jira.lf.favicon.hires.url` | The URL of the high-resolution favicon. | `/images/64jira.png` |
     *  | `jira.lf.navigation.bgcolour` | The background color of the sidebar. | `#0747A6` |
     *  | `jira.lf.navigation.highlightcolour` | The color of the text and logo of the sidebar. | `#DEEBFF` |
     *  | `jira.lf.hero.button.base.bg.colour` | The background color of the hero button. | `#3b7fc4` |
     *  | `jira.title` | The text for the application title. The application title can also be set in *General settings*. | `Jira` |
     *  | `jira.option.globalsharing` | Whether filters and dashboards can be shared with anyone signed into Jira. | `true` |
     *  | `xflow.product.suggestions.enabled` | Whether to expose product suggestions for other Atlassian products within Jira. | `true` |
     * 
     *  #### Other settings ####
     * | Key | Description | Default value |
     *  | -- | -- | -- |
     *  | `jira.issuenav.criteria.autoupdate` | Whether instant updates to search criteria is active. | `true` |
     * 
     *  *Note: Be careful when changing [application properties and advanced settings](https://confluence.atlassian.com/x/vYXKM).*
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ApplicationProperty setApplicationProperty(Consumer<SetApplicationPropertyOperationSpec> spec) {
        SetApplicationPropertyOperationSpec r = new SetApplicationPropertyOperationSpec(spec);
        return api.setApplicationProperty(r.id(), r.simpleApplicationPropertyBean());
    }

    /**
     * Update announcement banner configuration
     * <p>
     * Updates the announcement banner configuration.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object setBanner(Consumer<SetBannerOperationSpec> spec) {
        SetBannerOperationSpec r = new SetBannerOperationSpec(spec);
        return api.setBanner(r.announcementBannerConfigurationUpdate());
    }

    /**
     * Set columns
     * <p>
     * Sets the columns for a filter. Only navigable fields can be set as columns. Use [Get fields](#api-rest-api-2-field-get) to get the list fields in Jira. A navigable field has `navigable` set to `true`.
     * The parameters for this resource are expressed as HTML form data. For example, in curl:
     * `curl -X PUT -d columns=summary -d columns=description https://your-domain.atlassian.net/rest/api/2/filter/10000/columns`
     * **[Permissions](#permissions) required:** Permission to access Jira, however, columns are only set for:
     *  *
     * filters owned by the user.
     * *
     * filters shared with a group that the user is a member of.
     * *
     * filters shared with a private project that the user has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.
     * *
     * filters shared with a public project.
     * *
     * filters shared with the public.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object setColumns(Consumer<SetColumnsOperationSpec> spec) {
        SetColumnsOperationSpec r = new SetColumnsOperationSpec(spec);
        return api.setColumns(r.id(), r.requestBody());
    }

    /**
     * Set comment property
     * <p>
     * Creates or updates the value of a property for a comment. Use this resource to store custom data against a comment.
     * The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.
     * **[Permissions](#permissions) required:** either of:
     *  *
     * *Edit All Comments* [project permission](https://confluence.atlassian.com/x/yodKLg) to create or update the value of a property on any comment.
     * *
     * *Edit Own Comments* [project permission](https://confluence.atlassian.com/x/yodKLg) to create or update the value of a property on a comment created by the user.
     * Also, when the visibility of a comment is restricted to a role or group the user must be a member of that role or group.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object setCommentProperty(Consumer<SetCommentPropertyOperationSpec> spec) {
        SetCommentPropertyOperationSpec r = new SetCommentPropertyOperationSpec(spec);
        return api.setCommentProperty(r.commentId(), r.propertyKey(), r.body());
    }

    /**
     * Set dashboard item property
     * <p>
     * Sets the value of a dashboard item property. Use this resource in apps to store custom data against a dashboard item.
     * A dashboard item enables an app to add user-specific information to a user dashboard. Dashboard items are exposed to users as gadgets that users can add to their dashboards. For more information on how users do this, see [Adding and customizing gadgets](https://confluence.atlassian.com/x/7AeiLQ).
     * When an app creates a dashboard item it registers a callback to receive the dashboard item ID. The callback fires whenever the item is rendered or, where the item is configurable, the user edits the item. The app then uses this resource to store the item's content or configuration details. For more information on working with dashboard items, see [ Building a dashboard item for a JIRA Connect add-on](https://developer.atlassian.com/server/jira/platform/guide-building-a-dashboard-item-for-a-jira-connect-add-on-33746254/) and the [Dashboard Item](https://developer.atlassian.com/cloud/jira/platform/modules/dashboard-item/) documentation.
     * There is no resource to set or get dashboard items.
     * The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** The user must be the owner of the dashboard. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object setDashboardItemProperty(Consumer<SetDashboardItemPropertyOperationSpec> spec) {
        SetDashboardItemPropertyOperationSpec r = new SetDashboardItemPropertyOperationSpec(spec);
        return api.setDashboardItemProperty(r.dashboardId(), r.itemId(), r.propertyKey(), r.body());
    }

    /**
     * Set default issue security levels
     * <p>
     * Sets default issue security levels for schemes.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object setDefaultLevels(Consumer<SetDefaultLevelsOperationSpec> spec) {
        SetDefaultLevelsOperationSpec r = new SetDefaultLevelsOperationSpec(spec);
        return api.setDefaultLevels(r.requestBody());
    }

    /**
     * Set default priority
     * <p>
     * Sets default issue priority.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object setDefaultPriority(Consumer<SetDefaultPriorityOperationSpec> spec) {
        SetDefaultPriorityOperationSpec r = new SetDefaultPriorityOperationSpec(spec);
        return api.setDefaultPriority(r.setDefaultPriorityRequest());
    }

    /**
     * Set default resolution
     * <p>
     * Sets default issue resolution.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object setDefaultResolution(Consumer<SetDefaultResolutionOperationSpec> spec) {
        SetDefaultResolutionOperationSpec r = new SetDefaultResolutionOperationSpec(spec);
        return api.setDefaultResolution(r.setDefaultResolutionRequest());
    }

    /**
     * Set default share scope
     * <p>
     * Sets the default sharing for new filters and dashboards for a user.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public DefaultShareScope setDefaultShareScope(Consumer<SetDefaultShareScopeOperationSpec> spec) {
        SetDefaultShareScopeOperationSpec r = new SetDefaultShareScopeOperationSpec(spec);
        return api.setDefaultShareScope(r.defaultShareScope());
    }

    /**
     * Set custom field contexts default values
     * <p>
     * Sets default for contexts of a custom field. Default are defined using these objects:
     *  *
     * `CustomFieldContextDefaultValueDate` (type `datepicker`) for date fields.
     * *
     * `CustomFieldContextDefaultValueDateTime` (type `datetimepicker`) for date-time fields.
     * *
     * `CustomFieldContextDefaultValueSingleOption` (type `option.single`) for single choice select lists and radio buttons.
     * *
     * `CustomFieldContextDefaultValueMultipleOption` (type `option.multiple`) for multiple choice select lists and checkboxes.
     * *
     * `CustomFieldContextDefaultValueCascadingOption` (type `option.cascading`) for cascading select lists.
     * *
     * `CustomFieldContextSingleUserPickerDefaults` (type `single.user.select`) for single users.
     * *
     * `CustomFieldContextDefaultValueMultiUserPicker` (type `multi.user.select`) for user lists.
     * *
     * `CustomFieldContextDefaultValueSingleGroupPicker` (type `grouppicker.single`) for single choice group pickers.
     * *
     * `CustomFieldContextDefaultValueMultipleGroupPicker` (type `grouppicker.multiple`) for multiple choice group pickers.
     * *
     * `CustomFieldContextDefaultValueURL` (type `url`) for URLs.
     * *
     * `CustomFieldContextDefaultValueProject` (type `project`) for project pickers.
     * *
     * `CustomFieldContextDefaultValueFloat` (type `float`) for floats (floating-point numbers).
     * *
     * `CustomFieldContextDefaultValueLabels` (type `labels`) for labels.
     * *
     * `CustomFieldContextDefaultValueTextField` (type `textfield`) for text fields.
     * *
     * `CustomFieldContextDefaultValueTextArea` (type `textarea`) for text area fields.
     * *
     * `CustomFieldContextDefaultValueReadOnly` (type `readonly`) for read only (text) fields.
     * *
     * `CustomFieldContextDefaultValueMultipleVersion` (type `version.multiple`) for single choice version pickers.
     * *
     * `CustomFieldContextDefaultValueSingleVersion` (type `version.single`) for multiple choice version pickers.
     * Forge custom fields [types](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field-type/#data-types) are also supported, returning:
     *  *
     * `CustomFieldContextDefaultValueForgeStringFieldBean` (type `forge.string`) for Forge string fields.
     * *
     * `CustomFieldContextDefaultValueForgeMultiStringFieldBean` (type `forge.string.list`) for Forge string collection fields.
     * *
     * `CustomFieldContextDefaultValueForgeObjectFieldBean` (type `forge.object`) for Forge object fields.
     * *
     * `CustomFieldContextDefaultValueForgeDateTimeFieldBean` (type `forge.datetime`) for Forge date-time fields.
     * *
     * `CustomFieldContextDefaultValueForgeGroupFieldBean` (type `forge.group`) for Forge group fields.
     * *
     * `CustomFieldContextDefaultValueForgeMultiGroupFieldBean` (type `forge.group.list`) for Forge group collection fields.
     * *
     * `CustomFieldContextDefaultValueForgeNumberFieldBean` (type `forge.number`) for Forge number fields.
     * *
     * `CustomFieldContextDefaultValueForgeUserFieldBean` (type `forge.user`) for Forge user fields.
     * *
     * `CustomFieldContextDefaultValueForgeMultiUserFieldBean` (type `forge.user.list`) for Forge user collection fields.
     * Only one type of default object can be included in a request. To remove a default for a context, set the default parameter to `null`.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object setDefaultValues(Consumer<SetDefaultValuesOperationSpec> spec) {
        SetDefaultValuesOperationSpec r = new SetDefaultValuesOperationSpec(spec);
        return api.setDefaultValues(r.fieldId(), r.customFieldContextDefaultValueUpdate());
    }

    /**
     * Add filter as favorite
     * <p>
     * Add a filter as a favorite for the user.
     * **[Permissions](#permissions) required:** Permission to access Jira, however, the user can only favorite:
     *  *
     * filters owned by the user.
     * *
     * filters shared with a group that the user is a member of.
     * *
     * filters shared with a private project that the user has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.
     * *
     * filters shared with a public project.
     * *
     * filters shared with the public.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Filter setFavouriteForFilter(Consumer<SetFavouriteForFilterOperationSpec> spec) {
        SetFavouriteForFilterOperationSpec r = new SetFavouriteForFilterOperationSpec(spec);
        return api.setFavouriteForFilter(r.id(), r.expand());
    }

    /**
     * Assign issue types to field configurations
     * <p>
     * Assigns issue types to field configurations on field configuration scheme.
     * This operation can only modify field configuration schemes used in company-managed (classic) projects.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object setFieldConfigurationSchemeMapping(Consumer<SetFieldConfigurationSchemeMappingOperationSpec> spec) {
        SetFieldConfigurationSchemeMappingOperationSpec r = new SetFieldConfigurationSchemeMappingOperationSpec(spec);
        return api.setFieldConfigurationSchemeMapping(r.id(), r.associateFieldConfigurationsWithIssueTypesRequest());
    }

    /**
     * Set issue navigator default columns
     * <p>
     * Sets the default issue navigator columns.
     * The `columns` parameter accepts a navigable field value and is expressed as HTML form data. To specify multiple columns, pass multiple `columns` parameters. For example, in curl:
     * `curl -X PUT -d columns=summary -d columns=description https://your-domain.atlassian.net/rest/api/2/settings/columns`
     * If no column details are sent, then all default columns are removed.
     * A navigable field is one that can be used as a column on the issue navigator. Find details of navigable issue columns using [Get fields](#api-rest-api-2-field-get).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object setIssueNavigatorDefaultColumns(Consumer<SetIssueNavigatorDefaultColumnsOperationSpec> spec) {
        SetIssueNavigatorDefaultColumnsOperationSpec r = new SetIssueNavigatorDefaultColumnsOperationSpec(spec);
        return api.setIssueNavigatorDefaultColumns(r.requestBody());
    }

    /**
     * Set issue property
     * <p>
     * Sets the value of an issue's property. Use this resource to store custom data against an issue.
     * The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* and *Edit issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object setIssueProperty(Consumer<SetIssuePropertyOperationSpec> spec) {
        SetIssuePropertyOperationSpec r = new SetIssuePropertyOperationSpec(spec);
        return api.setIssueProperty(r.issueIdOrKey(), r.propertyKey(), r.body());
    }

    /**
     * Set issue type property
     * <p>
     * Creates or updates the value of the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties). Use this resource to store and update data against an issue type.
     * The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object setIssueTypeProperty(Consumer<SetIssueTypePropertyOperationSpec> spec) {
        SetIssueTypePropertyOperationSpec r = new SetIssueTypePropertyOperationSpec(spec);
        return api.setIssueTypeProperty(r.issueTypeId(), r.propertyKey(), r.body());
    }

    /**
     * Set locale
     * <p>
     * Deprecated, use [ Update a user profile](https://developer.atlassian.com/cloud/admin/user-management/rest/#api-users-account-id-manage-profile-patch) from the user management REST API instead.
     * Sets the locale of the user. The locale must be one supported by the instance of Jira.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     * @deprecated
     */
    @Deprecated
    public Object setLocale(Consumer<SetLocaleOperationSpec> spec) {
        SetLocaleOperationSpec r = new SetLocaleOperationSpec(spec);
        return api.setLocale(r.locale());
    }

    /**
     * Set preference
     * <p>
     * Creates a preference for the user or updates a preference's value by sending a plain text string. For example, `false`. An arbitrary preference can be created with the value containing up to 255 characters. In addition, the following keys define system preferences that can be set or created:
     *  *
     * *user.notifications.mimetype* The mime type used in notifications sent to the user. Defaults to `html`.
     * *
     * *user.notify.own.changes* Whether the user gets notified of their own changes. Defaults to `false`.
     * *
     * *user.default.share.private* Whether new [ filters](https://confluence.atlassian.com/x/eQiiLQ) are set to private. Defaults to `true`.
     * *
     * *user.keyboard.shortcuts.disabled* Whether keyboard shortcuts are disabled. Defaults to `false`.
     * *
     * *user.autowatch.disabled* Whether the user automatically watches issues they create or add a comment to. By default, not set: the user takes the instance autowatch setting.
     * Note that these keys are deprecated:
     *  *
     * *jira.user.locale* The locale of the user. By default, not set. The user takes the instance locale.
     * *
     * *jira.user.timezone* The time zone of the user. By default, not set. The user takes the instance timezone.
     * Use [ Update a user profile](https://developer.atlassian.com/cloud/admin/user-management/rest/#api-users-account-id-manage-profile-patch) from the user management REST API to manage timezone and locale instead.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object setPreference(Consumer<SetPreferenceOperationSpec> spec) {
        SetPreferenceOperationSpec r = new SetPreferenceOperationSpec(spec);
        return api.setPreference(r.key(), r.body());
    }

    /**
     * Set project property
     * <p>
     * Sets the value of the [project property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties). You can use project properties to store custom data against the project.
     * The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project in which the property is created.
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object setProjectProperty(Consumer<SetProjectPropertyOperationSpec> spec) {
        SetProjectPropertyOperationSpec r = new SetProjectPropertyOperationSpec(spec);
        return api.setProjectProperty(r.projectIdOrKey(), r.propertyKey(), r.body());
    }

    /**
     * Set time tracking settings
     * <p>
     * Sets the time tracking settings.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public TimeTrackingConfiguration setSharedTimeTrackingConfiguration(Consumer<SetSharedTimeTrackingConfigurationOperationSpec> spec) {
        SetSharedTimeTrackingConfigurationOperationSpec r = new SetSharedTimeTrackingConfigurationOperationSpec(spec);
        return api.setSharedTimeTrackingConfiguration(r.timeTrackingConfiguration());
    }

    /**
     * Set user default columns
     * <p>
     * Sets the default [ issue table columns](https://confluence.atlassian.com/x/XYdKLg) for the user. If an account ID is not passed, the calling user's default columns are set. If no column details are sent, then all default columns are removed.
     * The parameters for this resource are expressed as HTML form data. For example, in curl:
     * `curl -X PUT -d columns=summary -d columns=description https://your-domain.atlassian.net/rest/api/2/user/columns?accountId=5b10ac8d82e05b22cc7d4ef5'`
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to set the columns on any user.
     * *
     * Permission to access Jira, to set the calling user's columns.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object setUserColumns(Consumer<SetUserColumnsOperationSpec> spec) {
        SetUserColumnsOperationSpec r = new SetUserColumnsOperationSpec(spec);
        return api.setUserColumns(r.accountId(), r.requestBody());
    }

    /**
     * Set user property
     * <p>
     * Sets the value of a user's property. Use this resource to store custom data against a user.
     * Note: This operation does not access the [user properties](https://confluence.atlassian.com/x/8YxjL) created and maintained in Jira.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to set a property on any user.
     * *
     * Access to Jira, to set a property on the calling user's record.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object setUserProperty(Consumer<SetUserPropertyOperationSpec> spec) {
        SetUserPropertyOperationSpec r = new SetUserPropertyOperationSpec(spec);
        return api.setUserProperty(r.propertyKey(), r.body(), r.accountId(), r.userKey(), r.username());
    }

    /**
     * Set workflow for issue type in draft workflow scheme
     * <p>
     * Sets the workflow for an issue type in a workflow scheme's draft.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WorkflowScheme setWorkflowSchemeDraftIssueType(Consumer<SetWorkflowSchemeDraftIssueTypeOperationSpec> spec) {
        SetWorkflowSchemeDraftIssueTypeOperationSpec r = new SetWorkflowSchemeDraftIssueTypeOperationSpec(spec);
        return api.setWorkflowSchemeDraftIssueType(r.id(), r.issueType(), r.issueTypeWorkflowMapping());
    }

    /**
     * Set workflow for issue type in workflow scheme
     * <p>
     * Sets the workflow for an issue type in a workflow scheme.
     * Note that active workflow schemes cannot be edited. If the workflow scheme is active, set `updateDraftIfNeeded` to `true` in the request body and a draft workflow scheme is created or updated with the new issue type-workflow mapping. The draft workflow scheme can be published in Jira.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WorkflowScheme setWorkflowSchemeIssueType(Consumer<SetWorkflowSchemeIssueTypeOperationSpec> spec) {
        SetWorkflowSchemeIssueTypeOperationSpec r = new SetWorkflowSchemeIssueTypeOperationSpec(spec);
        return api.setWorkflowSchemeIssueType(r.id(), r.issueType(), r.issueTypeWorkflowMapping());
    }

    /**
     * Set worklog property
     * <p>
     * Sets the value of a worklog property. Use this operation to store custom data against the worklog.
     * The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * *
     * *Edit all worklogs*[ project permission](https://confluence.atlassian.com/x/yodKLg) to update any worklog or *Edit own worklogs* to update worklogs created by the user.
     * *
     * If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object setWorklogProperty(Consumer<SetWorklogPropertyOperationSpec> spec) {
        SetWorklogPropertyOperationSpec r = new SetWorklogPropertyOperationSpec(spec);
        return api.setWorklogProperty(r.issueIdOrKey(), r.worklogId(), r.propertyKey(), r.body());
    }

    /**
     * Load avatar
     * <p>
     * Loads a custom avatar for a project or issue type.
     * Specify the avatar's local file location in the body of the request. Also, include the following headers:
     *  *
     * `X-Atlassian-Token: no-check` To prevent XSRF protection blocking the request, for more information see [Special Headers](#special-request-headers).
     * *
     * `Content-Type: image/image type` Valid image types are JPEG, GIF, or PNG.
     * For example:
     *  `curl --request POST `
     * `--user email@example.com:&amp;lt;api_token&amp;gt; `
     * `--header 'X-Atlassian-Token: no-check' `
     * `--header 'Content-Type: image/&amp;lt; image_type&amp;gt;' `
     * `--data-binary "&amp;lt;@/path/to/file/with/your/avatar&amp;gt;" `
     * `--url 'https://your-domain.atlassian.net/rest/api/2/universal_avatar/type/{type}/owner/{entityId}'`
     * The avatar is cropped to a square. If no crop parameters are specified, the square originates at the top left of the image. The length of the square's sides is set to the smaller of the height or width of the image.
     * The cropped image is then used to create avatars of 16x16, 24x24, 32x32, and 48x48 in size.
     * After creating the avatar use:
     *  *
     * [Update issue type](#api-rest-api-2-issuetype-id-put) to set it as the issue type's displayed avatar.
     * *
     * [Set project avatar](#api-rest-api-2-project-projectIdOrKey-avatar-put) to set it as the project's displayed avatar.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Avatar storeAvatar(Consumer<StoreAvatarOperationSpec> spec) {
        StoreAvatarOperationSpec r = new StoreAvatarOperationSpec(spec);
        return api.storeAvatar(r.type(), r.entityId(), r.size(), r.body(), r.x(), r.y());
    }

    /**
     * Set project feature state
     * <p>
     * Sets the state of a project feature.
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ContainerForProjectFeatures toggleFeatureForProject(Consumer<ToggleFeatureForProjectOperationSpec> spec) {
        ToggleFeatureForProjectOperationSpec r = new ToggleFeatureForProjectOperationSpec(spec);
        return api.toggleFeatureForProject(r.projectIdOrKey(), r.featureKey(), r.projectFeatureState());
    }

    /**
     * Move custom field to trash
     * <p>
     * Moves a custom field to trash. See [Edit or delete a custom field](https://confluence.atlassian.com/x/Z44fOw) for more information on trashing and deleting custom fields.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object trashCustomField(Consumer<TrashCustomFieldOperationSpec> spec) {
        TrashCustomFieldOperationSpec r = new TrashCustomFieldOperationSpec(spec);
        return api.trashCustomField(r.id());
    }

    /**
     * Update comment
     * <p>
     * Updates a comment.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue containing the comment is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * *
     * *Edit all comments*[ project permission](https://confluence.atlassian.com/x/yodKLg) to update any comment or *Edit own comments* to update comment created by the user.
     * *
     * If the comment has visibility restrictions, the user belongs to the group or has the role visibility is restricted to.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Comment updateComment(Consumer<UpdateCommentOperationSpec> spec) {
        UpdateCommentOperationSpec r = new UpdateCommentOperationSpec(spec);
        return api.updateComment(r.issueIdOrKey(), r.id(), r.requestBody(), r.notifyUsers(), r.overrideEditableFlag(), r.expand());
    }

    /**
     * Update component
     * <p>
     * Updates a component. Any fields included in the request are overwritten. If `leadAccountId` is an empty string ("") the component lead is removed.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the component or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ProjectComponent updateComponent(Consumer<UpdateComponentOperationSpec> spec) {
        UpdateComponentOperationSpec r = new UpdateComponentOperationSpec(spec);
        return api.updateComponent(r.id(), r.projectComponent());
    }

    /**
     * Update custom field
     * <p>
     * Updates a custom field.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object updateCustomField(Consumer<UpdateCustomFieldOperationSpec> spec) {
        UpdateCustomFieldOperationSpec r = new UpdateCustomFieldOperationSpec(spec);
        return api.updateCustomField(r.fieldId(), r.updateCustomFieldDetails());
    }

    /**
     * Update custom field configurations
     * <p>
     * Update the configuration for contexts of a custom field created by a [Forge app](https://developer.atlassian.com/platform/forge/).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the Forge app that created the custom field.
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object updateCustomFieldConfiguration(Consumer<UpdateCustomFieldConfigurationOperationSpec> spec) {
        UpdateCustomFieldConfigurationOperationSpec r = new UpdateCustomFieldConfigurationOperationSpec(spec);
        return api.updateCustomFieldConfiguration(r.fieldIdOrKey(), r.customFieldConfigurations());
    }

    /**
     * Update custom field context
     * <p>
     * Updates a [ custom field context](https://confluence.atlassian.com/adminjiracloud/what-are-custom-field-contexts-991923859.html).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object updateCustomFieldContext(Consumer<UpdateCustomFieldContextOperationSpec> spec) {
        UpdateCustomFieldContextOperationSpec r = new UpdateCustomFieldContextOperationSpec(spec);
        return api.updateCustomFieldContext(r.fieldId(), r.contextId(), r.customFieldContextUpdateDetails());
    }

    /**
     * Update custom field options (context)
     * <p>
     * Updates the options of a custom field.
     * If any of the options are not found, no options are updated. Options where the values in the request match the current values aren't updated and aren't reported in the response.
     * Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect apps.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public CustomFieldUpdatedContextOptionsList updateCustomFieldOption(Consumer<UpdateCustomFieldOptionOperationSpec> spec) {
        UpdateCustomFieldOptionOperationSpec r = new UpdateCustomFieldOptionOperationSpec(spec);
        return api.updateCustomFieldOption(r.fieldId(), r.contextId(), r.bulkCustomFieldOptionUpdateRequest());
    }

    /**
     * Update custom field value
     * <p>
     * Updates the value of a custom field on one or more issues. Custom fields can only be updated by the Forge app that created them.
     * **[Permissions](#permissions) required:** Only the app that created the custom field can update its values with this operation.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object updateCustomFieldValue(Consumer<UpdateCustomFieldValueOperationSpec> spec) {
        UpdateCustomFieldValueOperationSpec r = new UpdateCustomFieldValueOperationSpec(spec);
        return api.updateCustomFieldValue(r.fieldIdOrKey(), r.customFieldValueUpdateDetails(), r.generateChangelog());
    }

    /**
     * Update dashboard
     * <p>
     * Updates a dashboard, replacing all the dashboard details with those provided.
     * **[Permissions](#permissions) required:** None
     * The dashboard to be updated must be owned by the user.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Dashboard updateDashboard(Consumer<UpdateDashboardOperationSpec> spec) {
        UpdateDashboardOperationSpec r = new UpdateDashboardOperationSpec(spec);
        return api.updateDashboard(r.id(), r.dashboardDetails());
    }

    /**
     * Update issue type screen scheme default screen scheme
     * <p>
     * Updates the default screen scheme of an issue type screen scheme. The default screen scheme is used for all unmapped issue types.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object updateDefaultScreenScheme(Consumer<UpdateDefaultScreenSchemeOperationSpec> spec) {
        UpdateDefaultScreenSchemeOperationSpec r = new UpdateDefaultScreenSchemeOperationSpec(spec);
        return api.updateDefaultScreenScheme(r.issueTypeScreenSchemeId(), r.updateDefaultScreenScheme());
    }

    /**
     * Update default workflow
     * <p>
     * Sets the default workflow for a workflow scheme.
     * Note that active workflow schemes cannot be edited. If the workflow scheme is active, set `updateDraftIfNeeded` to `true` in the request object and a draft workflow scheme is created or updated with the new default workflow. The draft workflow scheme can be published in Jira.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WorkflowScheme updateDefaultWorkflow(Consumer<UpdateDefaultWorkflowOperationSpec> spec) {
        UpdateDefaultWorkflowOperationSpec r = new UpdateDefaultWorkflowOperationSpec(spec);
        return api.updateDefaultWorkflow(r.id(), r.defaultWorkflow());
    }

    /**
     * Update draft default workflow
     * <p>
     * Sets the default workflow for a workflow scheme's draft.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WorkflowScheme updateDraftDefaultWorkflow(Consumer<UpdateDraftDefaultWorkflowOperationSpec> spec) {
        UpdateDraftDefaultWorkflowOperationSpec r = new UpdateDraftDefaultWorkflowOperationSpec(spec);
        return api.updateDraftDefaultWorkflow(r.id(), r.defaultWorkflow());
    }

    /**
     * Set issue types for workflow in workflow scheme
     * <p>
     * Sets the issue types for a workflow in a workflow scheme's draft. The workflow can also be set as the default workflow for the draft workflow scheme. Unmapped issues types are mapped to the default workflow.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WorkflowScheme updateDraftWorkflowMapping(Consumer<UpdateDraftWorkflowMappingOperationSpec> spec) {
        UpdateDraftWorkflowMappingOperationSpec r = new UpdateDraftWorkflowMappingOperationSpec(spec);
        return api.updateDraftWorkflowMapping(r.id(), r.workflowName(), r.issueTypesWorkflowMapping());
    }

    /**
     * Update field configuration
     * <p>
     * Updates a field configuration. The name and the description provided in the request override the existing values.
     * This operation can only update configurations used in company-managed (classic) projects.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object updateFieldConfiguration(Consumer<UpdateFieldConfigurationOperationSpec> spec) {
        UpdateFieldConfigurationOperationSpec r = new UpdateFieldConfigurationOperationSpec(spec);
        return api.updateFieldConfiguration(r.id(), r.fieldConfigurationDetails());
    }

    /**
     * Update field configuration items
     * <p>
     * Updates fields in a field configuration. The properties of the field configuration fields provided override the existing values.
     * This operation can only update field configurations used in company-managed (classic) projects.
     * The operation can set the renderer for text fields to the default text renderer (`text-renderer`) or wiki style renderer (`wiki-renderer`). However, the renderer cannot be updated for fields using the autocomplete renderer (`autocomplete-renderer`).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object updateFieldConfigurationItems(Consumer<UpdateFieldConfigurationItemsOperationSpec> spec) {
        UpdateFieldConfigurationItemsOperationSpec r = new UpdateFieldConfigurationItemsOperationSpec(spec);
        return api.updateFieldConfigurationItems(r.id(), r.fieldConfigurationItemsDetails());
    }

    /**
     * Update field configuration scheme
     * <p>
     * Updates a field configuration scheme.
     * This operation can only update field configuration schemes used in company-managed (classic) projects.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object updateFieldConfigurationScheme(Consumer<UpdateFieldConfigurationSchemeOperationSpec> spec) {
        UpdateFieldConfigurationSchemeOperationSpec r = new UpdateFieldConfigurationSchemeOperationSpec(spec);
        return api.updateFieldConfigurationScheme(r.id(), r.updateFieldConfigurationSchemeDetails());
    }

    /**
     * Update filter
     * <p>
     * Updates a filter. Use this operation to update a filter's name, description, JQL, or sharing.
     * **[Permissions](#permissions) required:** Permission to access Jira, however the user must own the filter.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Filter updateFilter(Consumer<UpdateFilterOperationSpec> spec) {
        UpdateFilterOperationSpec r = new UpdateFilterOperationSpec(spec);
        return api.updateFilter(r.id(), r.filter(), r.expand(), r.overrideSharePermissions());
    }

    /**
     * Update gadget on dashboard
     * <p>
     * Changes the title, position, and color of the gadget on a dashboard.
     * **[Permissions](#permissions) required:** None.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object updateGadget(Consumer<UpdateGadgetOperationSpec> spec) {
        UpdateGadgetOperationSpec r = new UpdateGadgetOperationSpec(spec);
        return api.updateGadget(r.dashboardId(), r.gadgetId(), r.dashboardGadgetUpdateRequest());
    }

    /**
     * Update issue field option
     * <p>
     * Updates or creates an option for a select list issue field. This operation requires that the option ID is provided when creating an option, therefore, the option ID needs to be specified as a path and body parameter. The option ID provided in the path and body must be identical.
     * Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public IssueFieldOption updateIssueFieldOption(Consumer<UpdateIssueFieldOptionOperationSpec> spec) {
        UpdateIssueFieldOptionOperationSpec r = new UpdateIssueFieldOptionOperationSpec(spec);
        return api.updateIssueFieldOption(r.fieldKey(), r.optionId(), r.issueFieldOption());
    }

    /**
     * Update issue link type
     * <p>
     * Updates an issue link type.
     * To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public IssueLinkType updateIssueLinkType(Consumer<UpdateIssueLinkTypeOperationSpec> spec) {
        UpdateIssueLinkTypeOperationSpec r = new UpdateIssueLinkTypeOperationSpec(spec);
        return api.updateIssueLinkType(r.issueLinkTypeId(), r.issueLinkType());
    }

    /**
     * Update issue security scheme
     * <p>
     * Updates the issue security scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object updateIssueSecurityScheme(Consumer<UpdateIssueSecuritySchemeOperationSpec> spec) {
        UpdateIssueSecuritySchemeOperationSpec r = new UpdateIssueSecuritySchemeOperationSpec(spec);
        return api.updateIssueSecurityScheme(r.id(), r.updateIssueSecuritySchemeRequestBean());
    }

    /**
     * Update issue type
     * <p>
     * Updates the issue type.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public IssueTypeDetails updateIssueType(Consumer<UpdateIssueTypeOperationSpec> spec) {
        UpdateIssueTypeOperationSpec r = new UpdateIssueTypeOperationSpec(spec);
        return api.updateIssueType(r.id(), r.issueTypeUpdateBean());
    }

    /**
     * Update issue type scheme
     * <p>
     * Updates an issue type scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object updateIssueTypeScheme(Consumer<UpdateIssueTypeSchemeOperationSpec> spec) {
        UpdateIssueTypeSchemeOperationSpec r = new UpdateIssueTypeSchemeOperationSpec(spec);
        return api.updateIssueTypeScheme(r.issueTypeSchemeId(), r.issueTypeSchemeUpdateDetails());
    }

    /**
     * Update issue type screen scheme
     * <p>
     * Updates an issue type screen scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object updateIssueTypeScreenScheme(Consumer<UpdateIssueTypeScreenSchemeOperationSpec> spec) {
        UpdateIssueTypeScreenSchemeOperationSpec r = new UpdateIssueTypeScreenSchemeOperationSpec(spec);
        return api.updateIssueTypeScreenScheme(r.issueTypeScreenSchemeId(), r.issueTypeScreenSchemeUpdateDetails());
    }

    /**
     * Update custom fields
     * <p>
     * Updates the value of one or more custom fields on one or more issues. Combinations of custom field and issue should be unique within the request. Custom fields can only be updated by the Forge app that created them.
     * **[Permissions](#permissions) required:** Only the app that created the custom field can update its values with this operation.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object updateMultipleCustomFieldValues(Consumer<UpdateMultipleCustomFieldValuesOperationSpec> spec) {
        UpdateMultipleCustomFieldValuesOperationSpec r = new UpdateMultipleCustomFieldValuesOperationSpec(spec);
        return api.updateMultipleCustomFieldValues(r.multipleCustomFieldValuesUpdateDetails(), r.generateChangelog());
    }

    /**
     * Update notification scheme
     * <p>
     * Updates a notification scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object updateNotificationScheme(Consumer<UpdateNotificationSchemeOperationSpec> spec) {
        UpdateNotificationSchemeOperationSpec r = new UpdateNotificationSchemeOperationSpec(spec);
        return api.updateNotificationScheme(r.id(), r.requestBody());
    }

    /**
     * Update permission scheme
     * <p>
     * Updates a permission scheme. Below are some important things to note when using this resource:
     *  *
     * If a permissions list is present in the request, then it is set in the permission scheme, overwriting *all existing* grants.
     * *
     * If you want to update only the name and description, then do not send a permissions list in the request.
     * *
     * Sending an empty list will remove all permission grants from the permission scheme.
     * If you want to add or delete a permission grant instead of updating the whole list, see [Create permission grant](#api-rest-api-2-permissionscheme-schemeId-permission-post) or [Delete permission scheme entity](#api-rest-api-2-permissionscheme-schemeId-permission-permissionId-delete).
     * See [About permission schemes and grants](../api-group-permission-schemes/#about-permission-schemes-and-grants) for more details.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public PermissionScheme updatePermissionScheme(Consumer<UpdatePermissionSchemeOperationSpec> spec) {
        UpdatePermissionSchemeOperationSpec r = new UpdatePermissionSchemeOperationSpec(spec);
        return api.updatePermissionScheme(r.schemeId(), r.requestBody(), r.expand());
    }

    /**
     * Update precomputations (apps)
     * <p>
     * Update the precomputation value of a function created by a Forge/Connect app.
     * **[Permissions](#permissions) required:** An API for apps to update their own precomputations.
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object updatePrecomputations(Consumer<UpdatePrecomputationsOperationSpec> spec) {
        UpdatePrecomputationsOperationSpec r = new UpdatePrecomputationsOperationSpec(spec);
        return api.updatePrecomputations(r.jqlFunctionPrecomputationUpdateRequestBean());
    }

    /**
     * Update priority
     * <p>
     * Updates an issue priority.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object updatePriority(Consumer<UpdatePriorityOperationSpec> spec) {
        UpdatePriorityOperationSpec r = new UpdatePriorityOperationSpec(spec);
        return api.updatePriority(r.id(), r.requestBody());
    }

    /**
     * Update project
     * <p>
     * Updates the [project details](https://confluence.atlassian.com/x/ahLpNw) of a project.
     * All parameters are optional in the body of the request.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Project updateProject(Consumer<UpdateProjectOperationSpec> spec) {
        UpdateProjectOperationSpec r = new UpdateProjectOperationSpec(spec);
        return api.updateProject(r.projectIdOrKey(), r.updateProjectDetails(), r.expand());
    }

    /**
     * Set project avatar
     * <p>
     * Sets the avatar displayed for a project.
     * Use [Load project avatar](#api-rest-api-2-project-projectIdOrKey-avatar2-post) to store avatars against the project, before using this operation to set the displayed avatar.
     * **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object updateProjectAvatar(Consumer<UpdateProjectAvatarOperationSpec> spec) {
        UpdateProjectAvatarOperationSpec r = new UpdateProjectAvatarOperationSpec(spec);
        return api.updateProjectAvatar(r.projectIdOrKey(), r.requestBody());
    }

    /**
     * Update project category
     * <p>
     * Updates a project category.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public UpdatedProjectCategory updateProjectCategory(Consumer<UpdateProjectCategoryOperationSpec> spec) {
        UpdateProjectCategoryOperationSpec r = new UpdateProjectCategoryOperationSpec(spec);
        return api.updateProjectCategory(r.id(), r.projectCategory());
    }

    /**
     * Set project's sender email
     * <p>
     * Sets the [project's sender email address](https://confluence.atlassian.com/x/dolKLg).
     * If `emailAddress` is an empty string, the default email address is restored.
     * **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object updateProjectEmail(Consumer<UpdateProjectEmailOperationSpec> spec) {
        UpdateProjectEmailOperationSpec r = new UpdateProjectEmailOperationSpec(spec);
        return api.updateProjectEmail(r.projectId(), r.projectEmailAddress());
    }

    /**
     * Update remote issue link by ID
     * <p>
     * Updates a remote issue link for an issue.
     * Note: Fields without values in the request are set to null.
     * This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object updateRemoteIssueLink(Consumer<UpdateRemoteIssueLinkOperationSpec> spec) {
        UpdateRemoteIssueLinkOperationSpec r = new UpdateRemoteIssueLinkOperationSpec(spec);
        return api.updateRemoteIssueLink(r.issueIdOrKey(), r.linkId(), r.requestBody());
    }

    /**
     * Update resolution
     * <p>
     * Updates an issue resolution.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object updateResolution(Consumer<UpdateResolutionOperationSpec> spec) {
        UpdateResolutionOperationSpec r = new UpdateResolutionOperationSpec(spec);
        return api.updateResolution(r.id(), r.requestBody());
    }

    /**
     * Update screen
     * <p>
     * Updates a screen. Only screens used in classic projects can be updated.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Screen updateScreen(Consumer<UpdateScreenOperationSpec> spec) {
        UpdateScreenOperationSpec r = new UpdateScreenOperationSpec(spec);
        return api.updateScreen(r.screenId(), r.updateScreenDetails());
    }

    /**
     * Update screen scheme
     * <p>
     * Updates a screen scheme. Only screen schemes used in classic projects can be updated.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object updateScreenScheme(Consumer<UpdateScreenSchemeOperationSpec> spec) {
        UpdateScreenSchemeOperationSpec r = new UpdateScreenSchemeOperationSpec(spec);
        return api.updateScreenScheme(r.screenSchemeId(), r.updateScreenSchemeDetails());
    }

    /**
     * Update issue security level
     * <p>
     * Updates the issue security level.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object updateSecurityLevel(Consumer<UpdateSecurityLevelOperationSpec> spec) {
        UpdateSecurityLevelOperationSpec r = new UpdateSecurityLevelOperationSpec(spec);
        return api.updateSecurityLevel(r.schemeId(), r.levelId(), r.requestBody());
    }

    /**
     * Bulk update statuses
     * <p>
     * Updates statuses by ID.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)
     * *
     * *Administer Jira* [project permission.](https://confluence.atlassian.com/x/yodKLg)
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object updateStatuses(Consumer<UpdateStatusesOperationSpec> spec) {
        UpdateStatusesOperationSpec r = new UpdateStatusesOperationSpec(spec);
        return api.updateStatuses(r.statusUpdateRequest());
    }

    /**
     * Update UI modification
     * <p>
     * Updates a UI modification. UI modification can only be updated by Forge apps.
     * Each UI modification can define up to 1000 contexts.
     * **[Permissions](#permissions) required:**
     *  *
     * *None* if the UI modification is created without contexts.
     * *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for one or more projects, if the UI modification is created with contexts.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Object updateUiModification(Consumer<UpdateUiModificationOperationSpec> spec) {
        UpdateUiModificationOperationSpec r = new UpdateUiModificationOperationSpec(spec);
        return api.updateUiModification(r.uiModificationId(), r.updateUiModificationDetails());
    }

    /**
     * Update version
     * <p>
     * Updates a project version.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that contains the version.
     * Authentication - Required Scopes: [manage:jira-project]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Version updateVersion(Consumer<UpdateVersionOperationSpec> spec) {
        UpdateVersionOperationSpec r = new UpdateVersionOperationSpec(spec);
        return api.updateVersion(r.id(), r.version());
    }

    /**
     * Set issue types for workflow in workflow scheme
     * <p>
     * Sets the issue types for a workflow in a workflow scheme. The workflow can also be set as the default workflow for the workflow scheme. Unmapped issues types are mapped to the default workflow.
     * Note that active workflow schemes cannot be edited. If the workflow scheme is active, set `updateDraftIfNeeded` to `true` in the request body and a draft workflow scheme is created or updated with the new workflow-issue types mappings. The draft workflow scheme can be published in Jira.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WorkflowScheme updateWorkflowMapping(Consumer<UpdateWorkflowMappingOperationSpec> spec) {
        UpdateWorkflowMappingOperationSpec r = new UpdateWorkflowMappingOperationSpec(spec);
        return api.updateWorkflowMapping(r.id(), r.workflowName(), r.issueTypesWorkflowMapping());
    }

    /**
     * Update workflow scheme
     * <p>
     * Updates a workflow scheme, including the name, default workflow, issue type to project mappings, and more. If the workflow scheme is active (that is, being used by at least one project), then a draft workflow scheme is created or updated instead, provided that `updateDraftIfNeeded` is set to `true`.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WorkflowScheme updateWorkflowScheme(Consumer<UpdateWorkflowSchemeOperationSpec> spec) {
        UpdateWorkflowSchemeOperationSpec r = new UpdateWorkflowSchemeOperationSpec(spec);
        return api.updateWorkflowScheme(r.id(), r.workflowScheme());
    }

    /**
     * Update draft workflow scheme
     * <p>
     * Updates a draft workflow scheme. If a draft workflow scheme does not exist for the active workflow scheme, then a draft is created. Note that an active workflow scheme can only have one draft workflow scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WorkflowScheme updateWorkflowSchemeDraft(Consumer<UpdateWorkflowSchemeDraftOperationSpec> spec) {
        UpdateWorkflowSchemeDraftOperationSpec r = new UpdateWorkflowSchemeDraftOperationSpec(spec);
        return api.updateWorkflowSchemeDraft(r.id(), r.workflowScheme());
    }

    /**
     * Update workflow transition property
     * <p>
     * Updates a workflow transition by changing the property value. Trying to update a property that does not exist results in a new property being added to the transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WorkflowTransitionProperty updateWorkflowTransitionProperty(Consumer<UpdateWorkflowTransitionPropertyOperationSpec> spec) {
        UpdateWorkflowTransitionPropertyOperationSpec r = new UpdateWorkflowTransitionPropertyOperationSpec(spec);
        return api.updateWorkflowTransitionProperty(r.transitionId(), r.key(), r.workflowName(), r.requestBody(), r.workflowMode());
    }

    /**
     * Update workflow transition rule configurations
     * <p>
     * Updates configuration of workflow transition rules. The following rule types are supported:
     *  *
     * [post functions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-post-function/)
     * *
     * [conditions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-condition/)
     * *
     * [validators](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-validator/)
     * Only rules created by the calling Connect app can be updated.
     * To assist with app migration, this operation can be used to:
     *  *
     * Disable a rule.
     * *
     * Add a `tag`. Use this to filter rules in the [Get workflow transition rule configurations](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-workflow-transition-rules/#api-rest-api-3-workflow-rule-config-get).
     * Rules are enabled if the `disabled` parameter is not provided.
     * **[Permissions](#permissions) required:** Only Connect apps can use this operation.
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WorkflowTransitionRulesUpdateErrors updateWorkflowTransitionRuleConfigurations(Consumer<UpdateWorkflowTransitionRuleConfigurationsOperationSpec> spec) {
        UpdateWorkflowTransitionRuleConfigurationsOperationSpec r = new UpdateWorkflowTransitionRuleConfigurationsOperationSpec(spec);
        return api.updateWorkflowTransitionRuleConfigurations(r.workflowTransitionRulesUpdate());
    }

    /**
     * Bulk update workflows
     * <p>
     * Update workflows and related statuses.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* project permission to create all, including global-scoped, workflows
     * *
     * *Administer projects* project permissions to create project-scoped workflows
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WorkflowUpdateResponse updateWorkflows(Consumer<UpdateWorkflowsOperationSpec> spec) {
        UpdateWorkflowsOperationSpec r = new UpdateWorkflowsOperationSpec(spec);
        return api.updateWorkflows(r.workflowUpdateRequest(), r.expand());
    }

    /**
     * Update worklog
     * <p>
     * Updates a worklog.
     * Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * *
     * *Edit all worklogs*[ project permission](https://confluence.atlassian.com/x/yodKLg) to update any worklog or *Edit own worklogs* to update worklogs created by the user.
     * *
     * If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
     * Authentication - Required Scopes: [write:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public Worklog updateWorklog(Consumer<UpdateWorklogOperationSpec> spec) {
        UpdateWorklogOperationSpec r = new UpdateWorklogOperationSpec(spec);
        return api.updateWorklog(r.issueIdOrKey(), r.id(), r.requestBody(), r.notifyUsers(), r.adjustEstimate(), r.newEstimate(), r.expand(), r.overrideEditableFlag());
    }

    /**
     * Validate create workflows
     * <p>
     * Validate the payload for bulk create workflows.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* project permission to create all, including global-scoped, workflows
     * *
     * *Administer projects* project permissions to create project-scoped workflows
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WorkflowValidationErrorList validateCreateWorkflows(Consumer<ValidateCreateWorkflowsOperationSpec> spec) {
        ValidateCreateWorkflowsOperationSpec r = new ValidateCreateWorkflowsOperationSpec(spec);
        return api.validateCreateWorkflows(r.workflowCreateValidateRequest());
    }

    /**
     * Validate project key
     * <p>
     * Validates a project key by confirming the key is a valid string and not in use.
     * **[Permissions](#permissions) required:** None.
     * Authentication - Required Scopes: [read:jira-work]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public ErrorCollection validateProjectKey(Consumer<ValidateProjectKeyOperationSpec> spec) {
        ValidateProjectKeyOperationSpec r = new ValidateProjectKeyOperationSpec(spec);
        return api.validateProjectKey(r.key());
    }

    /**
     * Validate update workflows
     * <p>
     * Validate the payload for bulk update workflows.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* project permission to create all, including global-scoped, workflows
     * *
     * *Administer projects* project permissions to create project-scoped workflows
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WorkflowValidationErrorList validateUpdateWorkflows(Consumer<ValidateUpdateWorkflowsOperationSpec> spec) {
        ValidateUpdateWorkflowsOperationSpec r = new ValidateUpdateWorkflowsOperationSpec(spec);
        return api.validateUpdateWorkflows(r.workflowUpdateValidateRequestBean());
    }

    /**
     * Get available workflow capabilities
     * <p>
     * Get the list of workflow capabilities for a specific workflow using either the workflow ID, or the project and issue type ID pair. The response includes the scope of the workflow, defined as global/project-based, and a list of project types that the workflow is scoped to. It also includes all rules organised into their broad categories (conditions, validators, actions, triggers, screens) as well as the source location (Atlassian-provided, Connect, Forge).
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* project permission to access all, including global-scoped, workflows
     * *
     * *Administer projects* project permissions to access project-scoped workflows
     * The current list of Atlassian-provided rules:
     * #### Validators ####
     * A validator rule that checks if a user has the required permissions to execute the transition in the workflow.
     * ##### Permission validator #####
     * A validator rule that checks if a user has the required permissions to execute the transition in the workflow.
     * 
     * 
     * {
     * 
     * 
     * 
     * "ruleKey": "system:check-permission-validator",
     * 
     * 
     * 
     * "parameters": {
     * 
     * 
     * 
     * 
     * "permissionKey": "ADMINISTER_PROJECTS"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     * Parameters:
     *  *
     * `permissionKey` The permission required to perform the transition. Allowed values: [built-in Jira permissions](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-permission-schemes/#built-in-permissions).
     * ##### Parent or child blocking validator #####
     * A validator to block the child issue’s transition depending on the parent issue’s status.
     * 
     * 
     * {
     * 
     * 
     * 
     * "ruleKey" : "system:parent-or-child-blocking-validator"
     * 
     * 
     * 
     * "parameters" : {
     * 
     * 
     * 
     * 
     * "blocker" : "PARENT"
     * 
     * 
     * 
     * 
     * "statusIds" : "1,2,3"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     * Parameters:
     *  *
     * `blocker` currently only supports `PARENT`.
     * *
     * `statusIds` a comma-separated list of status IDs.
     * ##### Previous status validator #####
     * A validator that checks if an issue has transitioned through specified previous status(es) before allowing the current transition to occur.
     * 
     * 
     * {
     * 
     * 
     * 
     * "ruleKey": "system:previous-status-validator",
     * 
     * 
     * 
     * "parameters": {
     * 
     * 
     * 
     * 
     * "previousStatusIds": "10014",
     * 
     * 
     * 
     * 
     * "mostRecentStatusOnly": "true"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     * Parameters:
     *  *
     * `previousStatusIds` a comma-separated list of status IDs, currently only support one ID.
     * *
     * `mostRecentStatusOnly` when `true` only considers the most recent status for the condition evaluation. Allowed values: `true`, `false`.
     * ##### Validate a field value #####
     * A validation that ensures a specific field's value meets the defined criteria before allowing an issue to transition in the workflow.
     * Depending on the rule type, the result will vary:
     * ###### Field required ######
     * 
     * 
     * {
     * 
     * 
     * 
     * "ruleKey": "system:validate-field-value",
     * 
     * 
     * 
     * "parameters": {
     * 
     * 
     * 
     * 
     * "ruleType": "fieldRequired",
     * 
     * 
     * 
     * 
     * "fieldsRequired": "assignee",
     * 
     * 
     * 
     * 
     * "ignoreContext": "true",
     * 
     * 
     * 
     * 
     * "errorMessage": "An assignee must be set!"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     * Parameters:
     *  *
     * `fieldsRequired` the ID of the field that is required. For a custom field, it would look like `customfield_123`.
     * *
     * `ignoreContext` controls the impact of context settings on field validation. When set to `true`, the validator doesn't check a required field if its context isn't configured for the current issue. When set to `false`, the validator requires a field even if its context is invalid. Allowed values: `true`, `false`.
     * *
     * `errorMessage` is the error message to display if the user does not provide a value during the transition. A default error message will be shown if you don't provide one (Optional).
     * ###### Field changed ######
     * 
     * 
     * {
     * 
     * 
     * 
     * "ruleKey": "system:validate-field-value",
     * 
     * 
     * 
     * "parameters": {
     * 
     * 
     * 
     * 
     * "ruleType": "fieldChanged",
     * 
     * 
     * 
     * 
     * "groupsExemptFromValidation": "6862ac20-8672-4f68-896d-4854f5efb79e",
     * 
     * 
     * 
     * 
     * "fieldKey": "versions",
     * 
     * 
     * 
     * 
     * "errorMessage": "Affect versions must be modified before transition"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     * Parameters:
     *  *
     * `groupsExemptFromValidation` a comma-separated list of group IDs to be exempt from the validation.
     * *
     * `fieldKey` the ID of the field that has changed. For a custom field, it would look like `customfield_123`.
     * *
     * `errorMessage` the error message to display if the user does not provide a value during the transition. A default error message will be shown if you don't provide one (Optional).
     * ###### Field has a single value ######
     * 
     * 
     * {
     * 
     * 
     * 
     * "ruleKey": "system:validate-field-value",
     * 
     * 
     * 
     * "parameters": {
     * 
     * 
     * 
     * 
     * "ruleType": "fieldHasSingleValue",
     * 
     * 
     * 
     * 
     * "fieldKey": "created",
     * 
     * 
     * 
     * 
     * "excludeSubtasks": "true"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     * Parameters:
     *  *
     * `fieldKey` the ID of the field to validate. For a custom field, it would look like `customfield_123`.
     * *
     * `excludeSubtasks` Option to exclude values copied from sub-tasks. Allowed values: `true`, `false`.
     * ###### Field matches regular expression ######
     * 
     * 
     * {
     * 
     * 
     * 
     * "ruleKey": "system:validate-field-value",
     * 
     * 
     * 
     * "parameters": {
     * 
     * 
     * 
     * 
     * "ruleType": "fieldMatchesRegularExpression",
     * 
     * 
     * 
     * 
     * "regexp": "[0-9]{4}",
     * 
     * 
     * 
     * 
     * "fieldKey": "description"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     * Parameters:
     *  *
     * `regexp` the regular expression used to validate the field’s content.
     * *
     * `fieldKey` the ID of the field to validate. For a custom field, it would look like `customfield_123`.
     * ###### Date field comparison ######
     * 
     * 
     * {
     * 
     * 
     * 
     * "ruleKey": "system:validate-field-value",
     * 
     * 
     * 
     * "parameters": {
     * 
     * 
     * 
     * 
     * "ruleType": "dateFieldComparison",
     * 
     * 
     * 
     * 
     * "date1FieldKey": "duedate",
     * 
     * 
     * 
     * 
     * "date2FieldKey": "customfield_10054",
     * 
     * 
     * 
     * 
     * "includeTime": "true",
     * 
     * 
     * 
     * 
     * "conditionSelected": "&amp;gt;="
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     * Parameters:
     *  *
     * `date1FieldKey` the ID of the first field to compare. For a custom field, it would look like `customfield_123`.
     * *
     * `date2FieldKey` the ID of the second field to compare. For a custom field, it would look like `customfield_123`.
     * *
     * `includeTime` if `true`, compares both date and time. Allowed values: `true`, `false`.
     * *
     * `conditionSelected` the condition to compare with. Allowed values: `&amp;gt;`, `&amp;gt;=`, `=`, `&amp;lt;=`, `&amp;lt;`, `!=`.
     * ###### Date range comparison ######
     * 
     * 
     * {
     * 
     * 
     * 
     * "ruleKey": "system:validate-field-value",
     * 
     * 
     * 
     * "parameters": {
     * 
     * 
     * 
     * 
     * "ruleType": "windowDateComparison",
     * 
     * 
     * 
     * 
     * "date1FieldKey": "customfield_10009",
     * 
     * 
     * 
     * 
     * "date2FieldKey": "customfield_10054",
     * 
     * 
     * 
     * 
     * "numberOfDays": "3"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     * Parameters:
     *  *
     * `date1FieldKey` the ID of the first field to compare. For a custom field, it would look like `customfield_123`.
     * *
     * `date2FieldKey` the ID of the second field to compare. For a custom field, it would look like `customfield_123`.
     * *
     * `numberOfDays` maximum number of days past the reference date (`date2FieldKey`) to pass validation.
     * This rule is composed by aggregating the following legacy rules:
     *  *
     * FieldRequiredValidator
     * *
     * FieldChangedValidator
     * *
     * FieldHasSingleValueValidator
     * *
     * RegexpFieldValidator
     * *
     * DateFieldValidator
     * *
     * WindowsDateValidator
     * ##### Proforma: Forms attached validator #####
     * Validates that one or more forms are attached to the issue.
     * 
     * 
     * {
     * 
     * 
     * 
     * "ruleKey" : "system:proforma-forms-attached"
     * 
     * 
     * 
     * "parameters" : {}
     * 
     * 
     * }
     * ##### Proforma: Forms submitted validator #####
     * Validates that all forms attached to the issue have been submitted.
     * 
     * 
     * {
     * 
     * 
     * 
     * "ruleKey" : "system:proforma-forms-submitted"
     * 
     * 
     * 
     * "parameters" : {}
     * 
     * 
     * }
     * #### Conditions ####
     * Conditions enable workflow rules that govern whether a transition can execute.
     * ##### Check field value #####
     * A condition rule evaluates as true if a specific field's value meets the defined criteria. This rule ensures that an issue can only transition to the next step in the workflow if the field's value matches the desired condition.
     * 
     * 
     * {
     * 
     * 
     * 
     * "ruleKey": "system:check-field-value",
     * 
     * 
     * 
     * "parameters": {
     * 
     * 
     * 
     * 
     * "fieldId": "description",
     * 
     * 
     * 
     * 
     * "fieldValue": "[\\"Done\\"]",
     * 
     * 
     * 
     * 
     * "comparator": "=",
     * 
     * 
     * 
     * 
     * "comparisonType": "STRING"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     * Parameters:
     *  *
     * `fieldId` The ID of the field to check the value of. For non-system fields, it will look like `customfield_123`. Note: `fieldId` is used interchangeably with the idea of `fieldKey` here, they refer to the same field.
     * *
     * `fieldValue` the list of values to check against the field’s value.
     * *
     * `comparator` The comparison logic. Allowed values: `&amp;gt;`, `&amp;gt;=`, `=`, `&amp;lt;=`, `&amp;lt;`, `!=`.
     * *
     * `comparisonType` The type of data being compared. Allowed values: `STRING`, `NUMBER`, `DATE`, `DATE_WITHOUT_TIME`, `OPTIONID`.
     * ##### Restrict issue transition #####
     * This rule ensures that issue transitions are restricted based on user accounts, roles, group memberships, and permissions, maintaining control over who can transition an issue. This condition evaluates as `true` if any of the following criteria is met.
     * 
     * 
     * {
     * 
     * 
     * 
     * "ruleKey": "system:restrict-issue-transition",
     * 
     * 
     * 
     * "parameters": {
     * 
     * 
     * 
     * 
     * "accountIds": "allow-reporter,5e68ac137d64450d01a77fa0",
     * 
     * 
     * 
     * 
     * "roleIds": "10002,10004",
     * 
     * 
     * 
     * 
     * "groupIds": "703ff44a-7dc8-4f4b-9aa6-a65bf3574fa4",
     * 
     * 
     * 
     * 
     * "permissionKeys": "ADMINISTER_PROJECTS",
     * 
     * 
     * 
     * 
     * "groupCustomFields": "customfield_10028",
     * 
     * 
     * 
     * 
     * "allowUserCustomFields": "customfield_10072,customfield_10144,customfield_10007",
     * 
     * 
     * 
     * 
     * "denyUserCustomFields": "customfield_10107"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     * Parameters:
     *  *
     * `accountIds` a comma-separated list of the user account IDs. It also allows generic values like: `allow-assignee`, `allow-reporter`, and `accountIds` Note: This is only supported in team-managed projects
     * *
     * `roleIds` a comma-separated list of role IDs.
     * *
     * `groupIds` a comma-separated list of group IDs.
     * *
     * `permissionKeys` a comma-separated list of permission keys. Allowed values: [built-in Jira permissions](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-permission-schemes/#built-in-permissions).
     * *
     * `groupCustomFields` a comma-separated list of group custom field IDs.
     * *
     * `allowUserCustomFields` a comma-separated list of user custom field IDs to allow for issue transition.
     * *
     * `denyUserCustomFields` a comma-separated list of user custom field IDs to deny for issue transition.
     * This rule is composed by aggregating the following legacy rules:
     *  *
     * AllowOnlyAssignee
     * *
     * AllowOnlyReporter
     * *
     * InAnyProjectRoleCondition
     * *
     * InProjectRoleCondition
     * *
     * UserInAnyGroupCondition
     * *
     * UserInGroupCondition
     * *
     * PermissionCondtion
     * *
     * InGroupCFCondition
     * *
     * UserIsInCustomFieldCondition
     * ##### Previous status condition #####
     * A condition that evaluates based on an issue's previous status(es) and specific criteria.
     * 
     * 
     * {
     * 
     * 
     * 
     * "ruleKey" : "system:previous-status-condition"
     * 
     * 
     * 
     * "parameters" : {
     * 
     * 
     * 
     * 
     * "previousStatusIds" : "10004",
     * 
     * 
     * 
     * 
     * "not": "true",
     * 
     * 
     * 
     * 
     * "mostRecentStatusOnly" : "true",
     * 
     * 
     * 
     * 
     * "includeCurrentStatus": "true",
     * 
     * 
     * 
     * 
     * "ignoreLoopTransitions": "true"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     * Parameters:
     *  *
     * `previousStatusIds` a comma-separated list of status IDs, current only support one ID.
     * *
     * `not` indicates if the condition should be reversed. When `true` it checks that the issue has not been in the selected statuses. Allowed values: `true`, `false`.
     * *
     * `mostRecentStatusOnly` when true only considers the most recent status for the condition evaluation. Allowed values: `true`, `false`.
     * *
     * `includeCurrentStatus` includes the current status when evaluating if the issue has been through the selected statuses. Allowed values: `true`, `false`.
     * *
     * `ignoreLoopTransitions` ignore loop transitions. Allowed values: `true`, `false`.
     * ##### Parent or child blocking condition #####
     * A condition to block the parent’s issue transition depending on the child’s issue status.
     * 
     * 
     * {
     * 
     * 
     * 
     * "ruleKey" : "system:parent-or-child-blocking-condition"
     * 
     * 
     * 
     * "parameters" : {
     * 
     * 
     * 
     * 
     * "blocker" : "CHILD",
     * 
     * 
     * 
     * 
     * "statusIds" : "1,2,3"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     * Parameters:
     *  *
     * `blocker` currently only supports `CHILD`.
     * *
     * `statusIds` a comma-separated list of status IDs.
     * ##### Separation of duties #####
     * A condition preventing the user from performing, if the user has already performed a transition on the issue.
     * 
     * 
     * {
     * 
     * 
     * 
     * "ruleKey": "system:separation-of-duties",
     * 
     * 
     * 
     * "parameters": {
     * 
     * 
     * 
     * 
     * "fromStatusId": "10161",
     * 
     * 
     * 
     * 
     * "toStatusId": "10160"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     * Parameters:
     *  *
     * `fromStatusId` represents the status ID from which the issue is transitioning. It ensures that the user performing the current transition has not performed any actions when the issue was in the specified status.
     * *
     * `toStatusId` represents the status ID to which the issue is transitioning. It ensures that the user performing the current transition is not the same user who has previously transitioned the issue.
     * ##### Restrict transitions #####
     * A condition preventing all users from transitioning the issue can also optionally include APIs as well.
     * 
     * 
     * {
     * 
     * 
     * 
     * "ruleKey": "system:restrict-from-all-users",
     * 
     * 
     * 
     * "parameters": {
     * 
     * 
     * 
     * 
     * "restrictMode": "users"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     * Parameters:
     *  *
     * `restrictMode` restricts the issue transition including/excluding APIs. Allowed values: `"users"`, `"usersAndAPI"`.
     * ##### Jira Service Management block until approved #####
     * Block an issue transition until approval. Note: This is only supported in team-managed projects.
     * 
     * 
     * {
     * 
     * 
     * 
     * "ruleKey": "system:jsd-approvals-block-until-approved",
     * 
     * 
     * 
     * "parameters": {
     * 
     * 
     * 
     * 
     * "approvalConfigurationJson": "{"statusExternalUuid...}"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     * Parameters:
     *  *
     * `approvalConfigurationJson` a stringified JSON holding the Jira Service Management approval configuration.
     * ##### Jira Service Management block until rejected #####
     * Block an issue transition until rejected. Note: This is only supported in team-managed projects.
     * 
     * 
     * {
     * 
     * 
     * 
     * "ruleKey": "system:jsd-approvals-block-until-rejected",
     * 
     * 
     * 
     * "parameters": {
     * 
     * 
     * 
     * 
     * "approvalConfigurationJson": "{"statusExternalUuid...}"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     * Parameters:
     *  *
     * `approvalConfigurationJson` a stringified JSON holding the Jira Service Management approval configuration.
     * ##### Block in progress approval #####
     * Condition to block issue transition if there is pending approval. Note: This is only supported in company-managed projects.
     * 
     * 
     * {
     * 
     * 
     * 
     * "ruleKey": "system:block-in-progress-approval",
     * 
     * 
     * 
     * "parameters": {}
     * 
     * 
     * }
     * #### Post functions ####
     * Post functions carry out any additional processing required after a workflow transition is executed.
     * ##### Change assignee #####
     * A post function rule that changes the assignee of an issue after a transition.
     * 
     * 
     * {
     * 
     * 
     * 
     * "ruleKey": "system:change-assignee",
     * 
     * 
     * 
     * "parameters": {
     * 
     * 
     * 
     * 
     * "type": "to-selected-user",
     * 
     * 
     * 
     * 
     * "accountId": "example-account-id"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     * Parameters:
     *  *
     * `type` the parameter used to determine the new assignee. Allowed values: `to-selected-user`, `to-unassigned`, `to-current-user`, `to-current-user`, `to-default-user`, `to-default-user`
     * *
     * `accountId` the account ID of the user to assign the issue to. This parameter is required only when the type is `"to-selected-user"`.
     * ##### Copy field value #####
     * A post function that automates the process of copying values between fields during a specific transition, ensuring data consistency and reducing manual effort.
     * 
     * 
     * {
     * 
     * 
     * 
     * "ruleKey": "system:copy-value-from-other-field",
     * 
     * 
     * 
     * "parameters": {
     * 
     * 
     * 
     * 
     * "sourceFieldKey": "description",
     * 
     * 
     * 
     * 
     * "targetFieldKey": "components",
     * 
     * 
     * 
     * 
     * "issueSource": "SAME"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     * Parameters:
     *  *
     * `sourceFieldKey` the field key to copy from. For a custom field, it would look like `customfield_123`
     * *
     * `targetFieldKey` the field key to copy to. For a custom field, it would look like `customfield_123`
     * *
     * `issueSource` `SAME` or `PARENT`. Defaults to `SAME` if no value is provided.
     * ##### Update field #####
     * A post function that updates or appends a specific field with the given value.
     * 
     * 
     * {
     * 
     * 
     * 
     * "ruleKey": "system:update-field",
     * 
     * 
     * 
     * "parameters": {
     * 
     * 
     * 
     * 
     * "field": "customfield_10056",
     * 
     * 
     * 
     * 
     * "value": "asdf",
     * 
     * 
     * 
     * 
     * "mode": "append"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     * Parameters:
     *  *
     * `field` the ID of the field to update. For a custom field, it would look like `customfield_123`
     * *
     * `value` the value to update the field with.
     * *
     * `mode` `append` or `replace`. Determines if a value will be appended to the current value, or if the current value will be replaced.
     * ##### Trigger webhook #####
     * A post function that automatically triggers a predefined webhook when a transition occurs in the workflow.
     * 
     * 
     * {
     * 
     * 
     * 
     * "ruleKey": "system:trigger-webhook",
     * 
     * 
     * 
     * "parameters": {
     * 
     * 
     * 
     * 
     * "webhookId": "1"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     * Parameters:
     *  *
     * `webhookId` the ID of the webhook.
     * #### Screen ####
     * ##### Remind people to update fields #####
     * A screen rule that prompts users to update a specific field when they interact with an issue screen during a transition. This rule is useful for ensuring that users provide or modify necessary information before moving an issue to the next step in the workflow.
     * 
     * 
     * {
     * 
     * 
     * 
     * "ruleKey": "system:remind-people-to-update-fields",
     * 
     * 
     * 
     * "params": {
     * 
     * 
     * 
     * 
     * "remindingFieldIds": "assignee,customfield_10025",
     * 
     * 
     * 
     * 
     * "remindingMessage": "The message",
     * 
     * 
     * 
     * 
     * "remindingAlwaysAsk": "true"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     * Parameters:
     *  *
     * `remindingFieldIds` a comma-separated list of field IDs. Note: `fieldId` is used interchangeably with the idea of `fieldKey` here, they refer to the same field.
     * *
     * `remindingMessage` the message to display when prompting the users to update the fields.
     * *
     * `remindingAlwaysAsk` always remind to update fields. Allowed values: `true`, `false`.
     * ##### Shared transition screen #####
     * A common screen that is shared between transitions in a workflow.
     * 
     * 
     * {
     * 
     * 
     * 
     * "ruleKey": "system:transition-screen",
     * 
     * 
     * 
     * "params": {
     * 
     * 
     * 
     * 
     * "screenId": "3"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     * Parameters:
     *  *
     * `screenId` the ID of the screen.
     * #### Connect &amp; Forge ####
     * ##### Connect rules #####
     * Validator/Condition/Post function for Connect app.
     * 
     * 
     * {
     * 
     * 
     * 
     * "ruleKey": "connect:expression-validator",
     * 
     * 
     * 
     * "parameters": {
     * 
     * 
     * 
     * 
     * "appKey": "com.atlassian.app",
     * 
     * 
     * 
     * 
     * "config": "",
     * 
     * 
     * 
     * 
     * "id": "90ce590f-e90c-4cd3-8281-165ce41f2ac3",
     * 
     * 
     * 
     * 
     * "disabled": "false",
     * 
     * 
     * 
     * 
     * "tag": ""
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     * Parameters:
     *  *
     * `ruleKey` Validator: `connect:expression-validator`, Condition: `connect:expression-condition`, and Post function: `connect:remote-workflow-function`
     * *
     * `appKey` the reference to the Connect app
     * *
     * `config` a JSON payload string describing the configuration
     * *
     * `id` the ID of the rule
     * *
     * `disabled` determine if the Connect app is disabled. Allowed values: `true`, `false`.
     * *
     * `tag` additional tags for the Connect app
     * ##### Forge rules #####
     * Validator/Condition/Post function for Forge app.
     * 
     * 
     * {
     * 
     * 
     * 
     * "ruleKey": "forge:expression-validator",
     * 
     * 
     * 
     * "parameters": {
     * 
     * 
     * 
     * 
     * "key": "ari:cloud:ecosystem::extension/{appId}/{environmentId}/static/{moduleKey}",
     * 
     * 
     * 
     * 
     * "config": "{"searchString":"workflow validator"}",
     * 
     * 
     * 
     * 
     * "id": "a865ddf6-bb3f-4a7b-9540-c2f8b3f9f6c2"
     * 
     * 
     * 
     * }
     * 
     * 
     * }
     * Parameters:
     *  *
     * `ruleKey` Validator: `forge:expression-validator`, Condition: `forge:expression-condition`, and Post function: `forge:workflow-post-function`
     * *
     * `key` the identifier for the Forge app
     * *
     * `config` the persistent stringified JSON configuration for the Forge rule
     * *
     * `id` the ID of the Forge rule
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param spec                 a consumer that takes a spec to prepare the request for execution
     */
    public WorkflowCapabilities workflowCapabilities(Consumer<WorkflowCapabilitiesOperationSpec> spec) {
        WorkflowCapabilitiesOperationSpec r = new WorkflowCapabilitiesOperationSpec(spec);
        return api.workflowCapabilities(r.workflowId(), r.projectId(), r.issueTypeId());
    }

}
