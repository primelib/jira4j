package io.github.primelib.jira4j.restv2.api;

import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.ActorInputBean;
import io.github.primelib.jira4j.restv2.model.ActorsMap;
import io.github.primelib.jira4j.restv2.model.AddFieldBean;
import io.github.primelib.jira4j.restv2.model.AddGroupBean;
import io.github.primelib.jira4j.restv2.model.AddNotificationsDetails;
import io.github.primelib.jira4j.restv2.model.AddSecuritySchemeLevelsRequestBean;
import io.github.primelib.jira4j.restv2.model.AnnouncementBannerConfiguration;
import io.github.primelib.jira4j.restv2.model.AnnouncementBannerConfigurationUpdate;
import io.github.primelib.jira4j.restv2.model.ApplicationProperty;
import io.github.primelib.jira4j.restv2.model.ApplicationRole;
import io.github.primelib.jira4j.restv2.model.ArchiveIssueAsyncRequest;
import io.github.primelib.jira4j.restv2.model.ArchivedIssuesFilterRequest;
import io.github.primelib.jira4j.restv2.model.AssociateFieldConfigurationsWithIssueTypesRequest;
import io.github.primelib.jira4j.restv2.model.AssociateSecuritySchemeWithProjectDetails;
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
import io.github.primelib.jira4j.restv2.model.BulkCustomFieldOptionCreateRequest;
import io.github.primelib.jira4j.restv2.model.BulkCustomFieldOptionUpdateRequest;
import io.github.primelib.jira4j.restv2.model.BulkEditShareableEntityRequest;
import io.github.primelib.jira4j.restv2.model.BulkEditShareableEntityResponse;
import io.github.primelib.jira4j.restv2.model.BulkIssueIsWatching;
import io.github.primelib.jira4j.restv2.model.BulkIssuePropertyUpdateRequest;
import io.github.primelib.jira4j.restv2.model.BulkPermissionGrants;
import io.github.primelib.jira4j.restv2.model.BulkPermissionsRequestBean;
import io.github.primelib.jira4j.restv2.model.ChangeFilterOwner;
import io.github.primelib.jira4j.restv2.model.ChangedWorklogs;
import io.github.primelib.jira4j.restv2.model.ColumnItem;
import io.github.primelib.jira4j.restv2.model.Comment;
import io.github.primelib.jira4j.restv2.model.ComponentIssuesCount;
import io.github.primelib.jira4j.restv2.model.Configuration;
import io.github.primelib.jira4j.restv2.model.ConnectCustomFieldValues;
import io.github.primelib.jira4j.restv2.model.ConnectModules;
import io.github.primelib.jira4j.restv2.model.ContainerForProjectFeatures;
import io.github.primelib.jira4j.restv2.model.ContainerForRegisteredWebhooks;
import io.github.primelib.jira4j.restv2.model.ContainerForWebhookIDs;
import io.github.primelib.jira4j.restv2.model.ContainerOfWorkflowSchemeAssociations;
import io.github.primelib.jira4j.restv2.model.ConvertedJQLQueries;
import io.github.primelib.jira4j.restv2.model.CreateCustomFieldContext;
import io.github.primelib.jira4j.restv2.model.CreateIssueSecuritySchemeDetails;
import io.github.primelib.jira4j.restv2.model.CreateNotificationSchemeDetails;
import io.github.primelib.jira4j.restv2.model.CreatePriorityDetails;
import io.github.primelib.jira4j.restv2.model.CreateProjectDetails;
import io.github.primelib.jira4j.restv2.model.CreateResolutionDetails;
import io.github.primelib.jira4j.restv2.model.CreateUiModificationDetails;
import io.github.primelib.jira4j.restv2.model.CreateUpdateRoleRequestBean;
import io.github.primelib.jira4j.restv2.model.CreateWorkflowDetails;
import io.github.primelib.jira4j.restv2.model.CreatedIssue;
import io.github.primelib.jira4j.restv2.model.CreatedIssues;
import io.github.primelib.jira4j.restv2.model.CustomFieldConfigurations;
import io.github.primelib.jira4j.restv2.model.CustomFieldContextDefaultValueUpdate;
import io.github.primelib.jira4j.restv2.model.CustomFieldContextUpdateDetails;
import io.github.primelib.jira4j.restv2.model.CustomFieldCreatedContextOptionsList;
import io.github.primelib.jira4j.restv2.model.CustomFieldDefinitionJsonBean;
import io.github.primelib.jira4j.restv2.model.CustomFieldOption;
import io.github.primelib.jira4j.restv2.model.CustomFieldUpdatedContextOptionsList;
import io.github.primelib.jira4j.restv2.model.CustomFieldValueUpdateDetails;
import io.github.primelib.jira4j.restv2.model.Dashboard;
import io.github.primelib.jira4j.restv2.model.DashboardDetails;
import io.github.primelib.jira4j.restv2.model.DashboardGadget;
import io.github.primelib.jira4j.restv2.model.DashboardGadgetResponse;
import io.github.primelib.jira4j.restv2.model.DashboardGadgetSettings;
import io.github.primelib.jira4j.restv2.model.DashboardGadgetUpdateRequest;
import io.github.primelib.jira4j.restv2.model.DefaultShareScope;
import io.github.primelib.jira4j.restv2.model.DefaultWorkflow;
import io.github.primelib.jira4j.restv2.model.DeleteAndReplaceVersionBean;
import io.github.primelib.jira4j.restv2.model.DeprecatedWorkflow;
import io.github.primelib.jira4j.restv2.model.EntityProperty;
import io.github.primelib.jira4j.restv2.model.EntityPropertyDetails;
import io.github.primelib.jira4j.restv2.model.ErrorCollection;
import io.github.primelib.jira4j.restv2.model.ExportArchivedIssuesTaskProgressResponse;
import io.github.primelib.jira4j.restv2.model.FailedWebhooks;
import io.github.primelib.jira4j.restv2.model.FieldConfiguration;
import io.github.primelib.jira4j.restv2.model.FieldConfigurationDetails;
import io.github.primelib.jira4j.restv2.model.FieldConfigurationItemsDetails;
import io.github.primelib.jira4j.restv2.model.FieldConfigurationScheme;
import io.github.primelib.jira4j.restv2.model.FieldConfigurationSchemeProjectAssociation;
import io.github.primelib.jira4j.restv2.model.FieldDetails;
import io.github.primelib.jira4j.restv2.model.Filter;
import io.github.primelib.jira4j.restv2.model.FoundGroups;
import io.github.primelib.jira4j.restv2.model.FoundUsers;
import io.github.primelib.jira4j.restv2.model.FoundUsersAndGroups;
import io.github.primelib.jira4j.restv2.model.Group;
import io.github.primelib.jira4j.restv2.model.GroupName;
import io.github.primelib.jira4j.restv2.model.IdBean;
import io.github.primelib.jira4j.restv2.model.IssueArchivalSyncRequest;
import io.github.primelib.jira4j.restv2.model.IssueArchivalSyncResponse;
import io.github.primelib.jira4j.restv2.model.IssueBean;
import io.github.primelib.jira4j.restv2.model.IssueChangelogIds;
import io.github.primelib.jira4j.restv2.model.IssueCommentListRequestBean;
import io.github.primelib.jira4j.restv2.model.IssueCreateMetadata;
import io.github.primelib.jira4j.restv2.model.IssueEntityProperties;
import io.github.primelib.jira4j.restv2.model.IssueEvent;
import io.github.primelib.jira4j.restv2.model.IssueFieldOption;
import io.github.primelib.jira4j.restv2.model.IssueFieldOptionCreateBean;
import io.github.primelib.jira4j.restv2.model.IssueFilterForBulkPropertyDelete;
import io.github.primelib.jira4j.restv2.model.IssueLink;
import io.github.primelib.jira4j.restv2.model.IssueLinkType;
import io.github.primelib.jira4j.restv2.model.IssueLinkTypes;
import io.github.primelib.jira4j.restv2.model.IssueList;
import io.github.primelib.jira4j.restv2.model.IssueMatches;
import io.github.primelib.jira4j.restv2.model.IssuePickerSuggestions;
import io.github.primelib.jira4j.restv2.model.IssueTypeCreateBean;
import io.github.primelib.jira4j.restv2.model.IssueTypeDetails;
import io.github.primelib.jira4j.restv2.model.IssueTypeIds;
import io.github.primelib.jira4j.restv2.model.IssueTypeIdsToRemove;
import io.github.primelib.jira4j.restv2.model.IssueTypeSchemeDetails;
import io.github.primelib.jira4j.restv2.model.IssueTypeSchemeID;
import io.github.primelib.jira4j.restv2.model.IssueTypeSchemeProjectAssociation;
import io.github.primelib.jira4j.restv2.model.IssueTypeSchemeUpdateDetails;
import io.github.primelib.jira4j.restv2.model.IssueTypeScreenSchemeDetails;
import io.github.primelib.jira4j.restv2.model.IssueTypeScreenSchemeId;
import io.github.primelib.jira4j.restv2.model.IssueTypeScreenSchemeMappingDetails;
import io.github.primelib.jira4j.restv2.model.IssueTypeScreenSchemeProjectAssociation;
import io.github.primelib.jira4j.restv2.model.IssueTypeScreenSchemeUpdateDetails;
import io.github.primelib.jira4j.restv2.model.IssueTypeUpdateBean;
import io.github.primelib.jira4j.restv2.model.IssueTypeWithStatus;
import io.github.primelib.jira4j.restv2.model.IssueTypeWorkflowMapping;
import io.github.primelib.jira4j.restv2.model.IssueTypesWorkflowMapping;
import io.github.primelib.jira4j.restv2.model.IssueUpdateDetails;
import io.github.primelib.jira4j.restv2.model.IssueUpdateMetadata;
import io.github.primelib.jira4j.restv2.model.IssuesAndJQLQueries;
import io.github.primelib.jira4j.restv2.model.IssuesUpdateBean;
import io.github.primelib.jira4j.restv2.model.JQLPersonalDataMigrationRequest;
import io.github.primelib.jira4j.restv2.model.JQLReferenceData;
import io.github.primelib.jira4j.restv2.model.JiraExpressionEvalRequestBean;
import io.github.primelib.jira4j.restv2.model.JiraExpressionForAnalysis;
import io.github.primelib.jira4j.restv2.model.JiraExpressionResult;
import io.github.primelib.jira4j.restv2.model.JiraExpressionsAnalysis;
import io.github.primelib.jira4j.restv2.model.JiraStatus;
import io.github.primelib.jira4j.restv2.model.JqlFunctionPrecomputationUpdateRequestBean;
import io.github.primelib.jira4j.restv2.model.JqlQueriesToParse;
import io.github.primelib.jira4j.restv2.model.JqlQueriesToSanitize;
import io.github.primelib.jira4j.restv2.model.License;
import io.github.primelib.jira4j.restv2.model.LicenseMetric;
import io.github.primelib.jira4j.restv2.model.LinkIssueRequestJsonBean;
import io.github.primelib.jira4j.restv2.model.Locale;
import io.github.primelib.jira4j.restv2.model.MoveFieldBean;
import io.github.primelib.jira4j.restv2.model.MultiIssueEntityProperties;
import io.github.primelib.jira4j.restv2.model.MultipleCustomFieldValuesUpdateDetails;
import io.github.primelib.jira4j.restv2.model.NewUserDetails;
import io.github.primelib.jira4j.restv2.model.Notification;
import io.github.primelib.jira4j.restv2.model.NotificationScheme;
import io.github.primelib.jira4j.restv2.model.NotificationSchemeId;
import java.time.OffsetDateTime;
import io.github.primelib.jira4j.restv2.model.OperationMessage;
import io.github.primelib.jira4j.restv2.model.OrderOfCustomFieldOptions;
import io.github.primelib.jira4j.restv2.model.OrderOfIssueTypes;
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
import io.github.primelib.jira4j.restv2.model.PageOfCreateMetaIssueType;
import io.github.primelib.jira4j.restv2.model.PageOfDashboards;
import io.github.primelib.jira4j.restv2.model.PageOfStatuses;
import io.github.primelib.jira4j.restv2.model.PageOfWorklogs;
import io.github.primelib.jira4j.restv2.model.ParsedJqlQueries;
import io.github.primelib.jira4j.restv2.model.PermissionGrant;
import io.github.primelib.jira4j.restv2.model.PermissionGrants;
import io.github.primelib.jira4j.restv2.model.PermissionScheme;
import io.github.primelib.jira4j.restv2.model.PermissionSchemes;
import io.github.primelib.jira4j.restv2.model.Permissions;
import io.github.primelib.jira4j.restv2.model.PermissionsKeysBean;
import io.github.primelib.jira4j.restv2.model.PermittedProjects;
import io.github.primelib.jira4j.restv2.model.Priority;
import io.github.primelib.jira4j.restv2.model.PriorityId;
import io.github.primelib.jira4j.restv2.model.Project;
import io.github.primelib.jira4j.restv2.model.ProjectAvatars;
import io.github.primelib.jira4j.restv2.model.ProjectCategory;
import io.github.primelib.jira4j.restv2.model.ProjectComponent;
import io.github.primelib.jira4j.restv2.model.ProjectEmailAddress;
import io.github.primelib.jira4j.restv2.model.ProjectFeatureState;
import io.github.primelib.jira4j.restv2.model.ProjectIdentifiers;
import io.github.primelib.jira4j.restv2.model.ProjectIds;
import io.github.primelib.jira4j.restv2.model.ProjectIssueSecurityLevels;
import io.github.primelib.jira4j.restv2.model.ProjectIssueTypeHierarchy;
import io.github.primelib.jira4j.restv2.model.ProjectIssueTypeMappings;
import io.github.primelib.jira4j.restv2.model.ProjectRole;
import io.github.primelib.jira4j.restv2.model.ProjectRoleActorsUpdateBean;
import io.github.primelib.jira4j.restv2.model.ProjectRoleDetails;
import io.github.primelib.jira4j.restv2.model.ProjectType;
import io.github.primelib.jira4j.restv2.model.PropertyKeys;
import io.github.primelib.jira4j.restv2.model.PublishDraftWorkflowScheme;
import io.github.primelib.jira4j.restv2.model.RemoteIssueLink;
import io.github.primelib.jira4j.restv2.model.RemoteIssueLinkIdentifies;
import io.github.primelib.jira4j.restv2.model.RemoteIssueLinkRequest;
import io.github.primelib.jira4j.restv2.model.ReorderIssuePriorities;
import io.github.primelib.jira4j.restv2.model.ReorderIssueResolutionsRequest;
import io.github.primelib.jira4j.restv2.model.Resolution;
import io.github.primelib.jira4j.restv2.model.ResolutionId;
import io.github.primelib.jira4j.restv2.model.SanitizedJqlQueries;
import io.github.primelib.jira4j.restv2.model.Screen;
import io.github.primelib.jira4j.restv2.model.ScreenDetails;
import io.github.primelib.jira4j.restv2.model.ScreenSchemeDetails;
import io.github.primelib.jira4j.restv2.model.ScreenSchemeId;
import io.github.primelib.jira4j.restv2.model.ScreenableField;
import io.github.primelib.jira4j.restv2.model.ScreenableTab;
import io.github.primelib.jira4j.restv2.model.SearchAutoCompleteFilter;
import io.github.primelib.jira4j.restv2.model.SearchRequestBean;
import io.github.primelib.jira4j.restv2.model.SearchResults;
import io.github.primelib.jira4j.restv2.model.SecurityLevel;
import io.github.primelib.jira4j.restv2.model.SecurityScheme;
import io.github.primelib.jira4j.restv2.model.SecuritySchemeId;
import io.github.primelib.jira4j.restv2.model.SecuritySchemeMembersRequest;
import io.github.primelib.jira4j.restv2.model.SecuritySchemes;
import io.github.primelib.jira4j.restv2.model.ServerInformation;
import java.util.Set;
import io.github.primelib.jira4j.restv2.model.SetDefaultLevelsRequest;
import io.github.primelib.jira4j.restv2.model.SetDefaultPriorityRequest;
import io.github.primelib.jira4j.restv2.model.SetDefaultResolutionRequest;
import io.github.primelib.jira4j.restv2.model.SharePermission;
import io.github.primelib.jira4j.restv2.model.SharePermissionInputBean;
import io.github.primelib.jira4j.restv2.model.SimpleApplicationPropertyBean;
import io.github.primelib.jira4j.restv2.model.StatusCategory;
import io.github.primelib.jira4j.restv2.model.StatusCreateRequest;
import io.github.primelib.jira4j.restv2.model.StatusDetails;
import io.github.primelib.jira4j.restv2.model.StatusUpdateRequest;
import io.github.primelib.jira4j.restv2.model.SystemAvatars;
import io.github.primelib.jira4j.restv2.model.TaskProgressBeanObject;
import io.github.primelib.jira4j.restv2.model.TimeTrackingConfiguration;
import io.github.primelib.jira4j.restv2.model.TimeTrackingProvider;
import io.github.primelib.jira4j.restv2.model.Transitions;
import java.net.URI;
import java.util.UUID;
import io.github.primelib.jira4j.restv2.model.UiModificationIdentifiers;
import io.github.primelib.jira4j.restv2.model.UnrestrictedUserEmail;
import io.github.primelib.jira4j.restv2.model.UpdateCustomFieldDetails;
import io.github.primelib.jira4j.restv2.model.UpdateDefaultScreenScheme;
import io.github.primelib.jira4j.restv2.model.UpdateFieldConfigurationSchemeDetails;
import io.github.primelib.jira4j.restv2.model.UpdateIssueSecurityLevelDetails;
import io.github.primelib.jira4j.restv2.model.UpdateIssueSecuritySchemeRequestBean;
import io.github.primelib.jira4j.restv2.model.UpdateNotificationSchemeDetails;
import io.github.primelib.jira4j.restv2.model.UpdatePriorityDetails;
import io.github.primelib.jira4j.restv2.model.UpdateProjectDetails;
import io.github.primelib.jira4j.restv2.model.UpdateResolutionDetails;
import io.github.primelib.jira4j.restv2.model.UpdateScreenDetails;
import io.github.primelib.jira4j.restv2.model.UpdateScreenSchemeDetails;
import io.github.primelib.jira4j.restv2.model.UpdateUiModificationDetails;
import io.github.primelib.jira4j.restv2.model.UpdateUserToGroupBean;
import io.github.primelib.jira4j.restv2.model.UpdatedProjectCategory;
import io.github.primelib.jira4j.restv2.model.User;
import io.github.primelib.jira4j.restv2.model.UserMigrationBean;
import io.github.primelib.jira4j.restv2.model.Version;
import io.github.primelib.jira4j.restv2.model.VersionIssueCounts;
import io.github.primelib.jira4j.restv2.model.VersionMoveBean;
import io.github.primelib.jira4j.restv2.model.VersionRelatedWork;
import io.github.primelib.jira4j.restv2.model.VersionUnresolvedIssuesCount;
import io.github.primelib.jira4j.restv2.model.Votes;
import io.github.primelib.jira4j.restv2.model.Watchers;
import io.github.primelib.jira4j.restv2.model.WebhookRegistrationDetails;
import io.github.primelib.jira4j.restv2.model.WebhooksExpirationDate;
import io.github.primelib.jira4j.restv2.model.WorkflowCapabilities;
import io.github.primelib.jira4j.restv2.model.WorkflowCreateRequest;
import io.github.primelib.jira4j.restv2.model.WorkflowCreateResponse;
import io.github.primelib.jira4j.restv2.model.WorkflowCreateValidateRequest;
import io.github.primelib.jira4j.restv2.model.WorkflowIDs;
import io.github.primelib.jira4j.restv2.model.WorkflowReadRequest;
import io.github.primelib.jira4j.restv2.model.WorkflowReadResponse;
import io.github.primelib.jira4j.restv2.model.WorkflowRulesSearch;
import io.github.primelib.jira4j.restv2.model.WorkflowRulesSearchDetails;
import io.github.primelib.jira4j.restv2.model.WorkflowScheme;
import io.github.primelib.jira4j.restv2.model.WorkflowSchemeProjectAssociation;
import io.github.primelib.jira4j.restv2.model.WorkflowSchemeReadRequest;
import io.github.primelib.jira4j.restv2.model.WorkflowSchemeReadResponse;
import io.github.primelib.jira4j.restv2.model.WorkflowSchemeUpdateRequest;
import io.github.primelib.jira4j.restv2.model.WorkflowSchemeUpdateRequiredMappingsRequest;
import io.github.primelib.jira4j.restv2.model.WorkflowSchemeUpdateRequiredMappingsResponse;
import io.github.primelib.jira4j.restv2.model.WorkflowTransitionProperty;
import io.github.primelib.jira4j.restv2.model.WorkflowTransitionRulesUpdate;
import io.github.primelib.jira4j.restv2.model.WorkflowTransitionRulesUpdateErrors;
import io.github.primelib.jira4j.restv2.model.WorkflowUpdateRequest;
import io.github.primelib.jira4j.restv2.model.WorkflowUpdateResponse;
import io.github.primelib.jira4j.restv2.model.WorkflowUpdateValidateRequestBean;
import io.github.primelib.jira4j.restv2.model.WorkflowValidationErrorList;
import io.github.primelib.jira4j.restv2.model.WorkflowsWithTransitionRulesDetails;
import io.github.primelib.jira4j.restv2.model.Worklog;
import io.github.primelib.jira4j.restv2.model.WorklogIdsRequestBean;
import feign.RequestLine;
import feign.Param;
import feign.Headers;

@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public interface JiraRESTV2Api {

    /**
     * Add actors to project role
     * <p>
     * Adds actors to a project role for the project.
     * To replace all actors for the project, use [Set actors for project role](#api-rest-api-2-project-projectIdOrKey-role-id-put).
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param projectIdOrKey       The project ID or project key (case sensitive). (required)
     * @param id                   The ID of the project role. Use [Get all project roles](#api-rest-api-2-role-get) to get a list of project role IDs. (required)
     * @param actorsMap            The groups or users to associate with the project role for this project. Provide the user account ID, group name, or group ID. As a group's name can change, use of group ID is recommended. (required)
     */
    @RequestLine("POST /rest/api/2/project/{projectIdOrKey}/role/{id}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    ProjectRole addActorUsers(@Param("projectIdOrKey") @NotNull String projectIdOrKey, @Param("id") @NotNull Long id, @NotNull ActorsMap actorsMap);

    /**
     * Add attachment
     * <p>
     * Adds one or more attachments to an issue. Attachments are posted as multipart/form-data ([RFC 1867](https://www.ietf.org/rfc/rfc1867.txt)).
     * Note that:
     *  *
     * The request must have a {@code X-Atlassian-Token: no-check} header, if not it is blocked. See [Special headers](#special-request-headers) for more information.
     * *
     * The name of the multipart/form-data parameter that contains the attachments must be {@code file}.
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
     * {@code Response: ${response.status} ${response.statusText}}
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
     * // This sample uses Atlassian Forge and the {@code form-data} library.
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
     *  console.log({@code Response: ${response.status} ${response.statusText}});
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
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param issueIdOrKey         The ID or key of the issue that attachments are added to. (required)
     */
    @RequestLine("POST /rest/api/2/issue/{issueIdOrKey}/attachments")
    @Headers({
        "Content-Type: multipart/form-data", 
        "Accept: application/json"
    })
    List<Attachment> addAttachment(@Param("issueIdOrKey") @NotNull String issueIdOrKey);

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
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     * @param comment               (required)
     * @param expand               Use [expand](#expansion) to include additional information about comments in the response. This parameter accepts {@code renderedBody}, which returns the comment body rendered in HTML. (optional)
     */
    @RequestLine("POST /rest/api/2/issue/{issueIdOrKey}/comment?expand={expand}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Comment addComment(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @NotNull Comment comment, @Param("expand") @Nullable String expand);

    /**
     * Add field to default screen
     * <p>
     * Adds a field to the default tab of the default screen.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param fieldId              The ID of the field. (required)
     */
    @RequestLine("POST /rest/api/2/screens/addToDefault/{fieldId}")
    @Headers({
        "Accept: application/json"
    })
    Object addFieldToDefaultScreen(@Param("fieldId") @NotNull String fieldId);

    /**
     * Add gadget to dashboard
     * <p>
     * Adds a gadget to a dashboard.
     * **[Permissions](#permissions) required:** None.
     *
     * Authentication - Required Scopes: [write:jira-work, read:jira-work]
     * @param dashboardId          The ID of the dashboard. (required)
     * @param dashboardGadgetSettings  (required)
     */
    @RequestLine("POST /rest/api/2/dashboard/{dashboardId}/gadget")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    DashboardGadget addGadget(@Param("dashboardId") @NotNull Long dashboardId, @NotNull DashboardGadgetSettings dashboardGadgetSettings);

    /**
     * Add issue types to context
     * <p>
     * Adds issue types to a custom field context, appending the issue types to the issue types list.
     * A custom field context without any issue types applies to all issue types. Adding issue types to such a custom field context would result in it applying to only the listed issue types.
     * If any of the issue types exists in the custom field context, the operation fails and no issue types are added.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param fieldId              The ID of the custom field. (required)
     * @param contextId            The ID of the context. (required)
     * @param issueTypeIds          (required)
     */
    @RequestLine("PUT /rest/api/2/field/{fieldId}/context/{contextId}/issuetype")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object addIssueTypesToContext(@Param("fieldId") @NotNull String fieldId, @Param("contextId") @NotNull Long contextId, @NotNull IssueTypeIds issueTypeIds);

    /**
     * Add issue types to issue type scheme
     * <p>
     * Adds issue types to an issue type scheme.
     * The added issue types are appended to the issue types list.
     * If any of the issue types exist in the issue type scheme, the operation fails and no issue types are added.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param issueTypeSchemeId    The ID of the issue type scheme. (required)
     * @param issueTypeIds          (required)
     */
    @RequestLine("PUT /rest/api/2/issuetypescheme/{issueTypeSchemeId}/issuetype")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object addIssueTypesToIssueTypeScheme(@Param("issueTypeSchemeId") @NotNull Long issueTypeSchemeId, @NotNull IssueTypeIds issueTypeIds);

    /**
     * Add notifications to notification scheme
     * <p>
     * Adds notifications to a notification scheme. You can add up to 1000 notifications per request.
     * *Deprecated: The notification type {@code EmailAddress} is no longer supported in Cloud. Refer to the [changelog](https://developer.atlassian.com/cloud/jira/platform/changelog/#CHANGE-1031) for more details.*
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the notification scheme. (required)
     * @param addNotificationsDetails  (required)
     */
    @RequestLine("PUT /rest/api/2/notificationscheme/{id}/notification")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object addNotifications(@Param("id") @NotNull String id, @NotNull AddNotificationsDetails addNotificationsDetails);

    /**
     * Add default actors to project role
     * <p>
     * Adds [default actors](#api-rest-api-2-resolution-get) to a role. You may add groups or users, but you cannot add groups and users in the same request.
     * Changing a project role's default actors does not affect project role members for projects already created.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the project role. Use [Get all project roles](#api-rest-api-2-role-get) to get a list of project role IDs. (required)
     * @param actorInputBean        (required)
     */
    @RequestLine("POST /rest/api/2/role/{id}/actors")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    ProjectRole addProjectRoleActorsToRole(@Param("id") @NotNull Long id, @NotNull ActorInputBean actorInputBean);

    /**
     * Create screen tab
     * <p>
     * Creates a tab for a screen.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param screenId             The ID of the screen. (required)
     * @param screenableTab         (required)
     */
    @RequestLine("POST /rest/api/2/screens/{screenId}/tabs")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    ScreenableTab addScreenTab(@Param("screenId") @NotNull Long screenId, @NotNull ScreenableTab screenableTab);

    /**
     * Add screen tab field
     * <p>
     * Adds a field to a screen tab.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param screenId             The ID of the screen. (required)
     * @param tabId                The ID of the screen tab. (required)
     * @param addFieldBean          (required)
     */
    @RequestLine("POST /rest/api/2/screens/{screenId}/tabs/{tabId}/fields")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    ScreenableField addScreenTabField(@Param("screenId") @NotNull Long screenId, @Param("tabId") @NotNull Long tabId, @NotNull AddFieldBean addFieldBean);

    /**
     * Add issue security levels
     * <p>
     * Adds levels and levels' members to the issue security scheme. You can add up to 100 levels per request.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param schemeId             The ID of the issue security scheme. (required)
     * @param addSecuritySchemeLevelsRequestBean  (required)
     */
    @RequestLine("PUT /rest/api/2/issuesecurityschemes/{schemeId}/level")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object addSecurityLevel(@Param("schemeId") @NotNull String schemeId, @NotNull AddSecuritySchemeLevelsRequestBean addSecuritySchemeLevelsRequestBean);

    /**
     * Add issue security level members
     * <p>
     * Adds members to the issue security level. You can add up to 100 members per request.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param schemeId             The ID of the issue security scheme. (required)
     * @param levelId              The ID of the issue security level. (required)
     * @param securitySchemeMembersRequest  (required)
     */
    @RequestLine("PUT /rest/api/2/issuesecurityschemes/{schemeId}/level/{levelId}/member")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object addSecurityLevelMembers(@Param("schemeId") @NotNull String schemeId, @Param("levelId") @NotNull String levelId, @NotNull SecuritySchemeMembersRequest securitySchemeMembersRequest);

    /**
     * Add share permission
     * <p>
     * Add a share permissions to a filter. If you add a global share permission (one for all logged-in users or the public) it will overwrite all share permissions for the filter.
     * Be aware that this operation uses different objects for updating share permissions compared to [Update filter](#api-rest-api-2-filter-id-put).
     * **[Permissions](#permissions) required:** *Share dashboards and filters* [global permission](https://confluence.atlassian.com/x/x4dKLg) and the user must own the filter.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param id                   The ID of the filter. (required)
     * @param sharePermissionInputBean  (required)
     */
    @RequestLine("POST /rest/api/2/filter/{id}/permission")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    List<SharePermission> addSharePermission(@Param("id") @NotNull Long id, @NotNull SharePermissionInputBean sharePermissionInputBean);

    /**
     * Add user to group
     * <p>
     * Adds a user to a group.
     * **[Permissions](#permissions) required:** Site administration (that is, member of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param updateUserToGroupBean The user to add to the group. (required)
     * @param groupname            As a group's name can change, use of {@code groupId} is recommended to identify a group.   The name of the group. This parameter cannot be used with the {@code groupId} parameter. (optional)
     * @param groupId              The ID of the group. This parameter cannot be used with the {@code groupName} parameter. (optional)
     */
    @RequestLine("POST /rest/api/2/group/user?groupname={groupname}&groupId={groupId}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Group addUserToGroup(@NotNull UpdateUserToGroupBean updateUserToGroupBean, @Param("groupname") @Nullable String groupname, @Param("groupId") @Nullable String groupId);

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
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     */
    @RequestLine("POST /rest/api/2/issue/{issueIdOrKey}/votes")
    @Headers({
        "Accept: application/json"
    })
    Object addVote(@Param("issueIdOrKey") @NotNull String issueIdOrKey);

    /**
     * Add watcher
     * <p>
     * Adds a user as a watcher of an issue by passing the account ID of the user. For example, {@code "5b10ac8d82e05b22cc7d4ef5"}. If no user is specified the calling user is added.
     * This operation requires the **Allow users to watch issues** option to be *ON*. This option is set in General configuration for Jira. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * *
     * To add users other than themselves to the watchlist, *Manage watcher list* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     * @param body                 The account ID of the user. Note that username cannot be used due to privacy changes. (required)
     */
    @RequestLine("POST /rest/api/2/issue/{issueIdOrKey}/watchers")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object addWatcher(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @NotNull String body);

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
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param issueIdOrKey         The ID or key the issue. (required)
     * @param worklog               (required)
     * @param notifyUsers          Whether users watching the issue are notified by email. (optional, defaults to true)
     * @param adjustEstimate       Defines how to update the issue's time estimate, the options are:   *  {@code new} Sets the estimate to a specific value, defined in {@code newEstimate}.  *  {@code leave} Leaves the estimate unchanged.  *  {@code manual} Reduces the estimate by amount specified in {@code reduceBy}.  *  {@code auto} Reduces the estimate by the value of {@code timeSpent} in the worklog. (optional, defaults to auto)
     * @param newEstimate          The value to set as the issue's remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when {@code adjustEstimate} is {@code new}. (optional)
     * @param reduceBy             The amount to reduce the issue's remaining estimate by, as days (\\#d), hours (\\#h), or minutes (\\#m). For example, *2d*. Required when {@code adjustEstimate} is {@code manual}. (optional)
     * @param expand               Use [expand](#expansion) to include additional information about work logs in the response. This parameter accepts {@code properties}, which returns worklog properties. (optional)
     * @param overrideEditableFlag Whether the worklog entry should be added to the issue even if the issue is not editable, because jira.issue.editable set to false or missing. For example, the issue is closed. Connect and Forge app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) can use this flag. (optional, defaults to false)
     */
    @RequestLine("POST /rest/api/2/issue/{issueIdOrKey}/worklog?notifyUsers={notifyUsers}&adjustEstimate={adjustEstimate}&newEstimate={newEstimate}&reduceBy={reduceBy}&expand={expand}&overrideEditableFlag={overrideEditableFlag}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Worklog addWorklog(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @NotNull Worklog worklog, @Param("notifyUsers") @Nullable Boolean notifyUsers, @Param("adjustEstimate") @Nullable String adjustEstimate, @Param("newEstimate") @Nullable String newEstimate, @Param("reduceBy") @Nullable String reduceBy, @Param("expand") @Nullable String expand, @Param("overrideEditableFlag") @Nullable Boolean overrideEditableFlag);

    /**
     * Delete app property
     * <p>
     * Deletes an app's property.
     * **[Permissions](#permissions) required:** Only a Connect app whose key matches {@code addonKey} can make this request.
     *
     * @param addonKey             The key of the app, as defined in its descriptor. (required)
     * @param propertyKey          The key of the property. (required)
     */
    @RequestLine("DELETE /rest/atlassian-connect/1/addons/{addonKey}/properties/{propertyKey}")
    @Headers({
        "Accept: application/json"
    })
    void addonPropertiesResourceDeleteAddonPropertyDelete(@Param("addonKey") @NotNull String addonKey, @Param("propertyKey") @NotNull String propertyKey);

    /**
     * Delete app property (Forge)
     * <p>
     * Deletes a Forge app's property.
     * **[Permissions](#permissions) required:** Only Forge apps can make this request.
     *
     * @param propertyKey          The key of the property. (required)
     */
    @RequestLine("DELETE /rest/forge/1/app/properties/{propertyKey}")
    @Headers({
        "Accept: application/json"
    })
    void addonPropertiesResourceDeleteAppPropertyDelete(@Param("propertyKey") @NotNull String propertyKey);

    /**
     * Get app properties
     * <p>
     * Gets all the properties of an app.
     * **[Permissions](#permissions) required:** Only a Connect app whose key matches {@code addonKey} can make this request. Additionally, Forge apps published on the Marketplace can access properties of Connect apps they were [migrated from](https://developer.atlassian.com/platform/forge/build-a-connect-on-forge-app/).
     *
     * @param addonKey             The key of the app, as defined in its descriptor. (required)
     */
    @RequestLine("GET /rest/atlassian-connect/1/addons/{addonKey}/properties")
    @Headers({
        "Accept: application/json"
    })
    PropertyKeys addonPropertiesResourceGetAddonPropertiesGet(@Param("addonKey") @NotNull String addonKey);

    /**
     * Get app property
     * <p>
     * Returns the key and value of an app's property.
     * **[Permissions](#permissions) required:** Only a Connect app whose key matches {@code addonKey} can make this request. Additionally, Forge apps published on the Marketplace can access properties of Connect apps they were [migrated from](https://developer.atlassian.com/platform/forge/build-a-connect-on-forge-app/).
     *
     * @param addonKey             The key of the app, as defined in its descriptor. (required)
     * @param propertyKey          The key of the property. (required)
     */
    @RequestLine("GET /rest/atlassian-connect/1/addons/{addonKey}/properties/{propertyKey}")
    @Headers({
        "Accept: application/json"
    })
    EntityProperty addonPropertiesResourceGetAddonPropertyGet(@Param("addonKey") @NotNull String addonKey, @Param("propertyKey") @NotNull String propertyKey);

    /**
     * Set app property
     * <p>
     * Sets the value of an app's property. Use this resource to store custom data for your app.
     * The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.
     * **[Permissions](#permissions) required:** Only a Connect app whose key matches {@code addonKey} can make this request.
     *
     * @param addonKey             The key of the app, as defined in its descriptor. (required)
     * @param propertyKey          The key of the property. (required)
     * @param body                  (required)
     */
    @RequestLine("PUT /rest/atlassian-connect/1/addons/{addonKey}/properties/{propertyKey}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    OperationMessage addonPropertiesResourcePutAddonPropertyPut(@Param("addonKey") @NotNull String addonKey, @Param("propertyKey") @NotNull String propertyKey, @NotNull Object body);

    /**
     * Set app property (Forge)
     * <p>
     * Sets the value of a Forge app's property. These values can be retrieved in [Jira expressions](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/) through the {@code app} [context variable](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#context-variables).
     * For other use cases, use the [Storage API](https://developer.atlassian.com/platform/forge/runtime-reference/storage-api/).
     * The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.
     * **[Permissions](#permissions) required:** Only Forge apps can make this request.
     *
     * @param propertyKey          The key of the property. (required)
     * @param body                  (required)
     */
    @RequestLine("PUT /rest/forge/1/app/properties/{propertyKey}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    OperationMessage addonPropertiesResourcePutAppPropertyPut(@Param("propertyKey") @NotNull String propertyKey, @NotNull Object body);

    /**
     * Analyse Jira expression
     * <p>
     * Analyses and validates Jira expressions.
     * As an experimental feature, this operation can also attempt to type-check the expressions.
     * Learn more about Jira expressions in the [documentation](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/).
     * **[Permissions](#permissions) required**: None.
     *
     * Authentication - Required Scopes: [read:jira-work, read:jira-user]
     * @param jiraExpressionForAnalysis The Jira expressions to analyse. (required)
     * @param check                The check to perform:   *  {@code syntax} Each expression's syntax is checked to ensure the expression can be parsed. Also, syntactic limits are validated. For example, the expression's length.  *  {@code type} EXPERIMENTAL. Each expression is type checked and the final type of the expression inferred. Any type errors that would result in the expression failure at runtime are reported. For example, accessing properties that don't exist or passing the wrong number of arguments to functions. Also performs the syntax check.  *  {@code complexity} EXPERIMENTAL. Determines the formulae for how many [expensive operations](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#expensive-operations) each expression may execute. (optional, defaults to syntax)
     */
    @RequestLine("POST /rest/api/2/expression/analyse?check={check}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    JiraExpressionsAnalysis analyseExpression(@NotNull JiraExpressionForAnalysis jiraExpressionForAnalysis, @Param("check") @Nullable String check);

    /**
     * Bulk update custom field value
     * <p>
     * Updates the value of a custom field added by Connect apps on one or more issues. The values of up to 200 custom fields can be updated.
     * **[Permissions](#permissions) required:** Only Connect apps can make this request.
     *
     * @param atlassianTransferId  The ID of the transfer. (required)
     * @param connectCustomFieldValues  (required)
     */
    @RequestLine("PUT /rest/atlassian-connect/1/migration/field")
    @Headers({
        "Atlassian-Transfer-Id: {atlassianTransferId}", 
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object appIssueFieldValueUpdateResourceUpdateIssueFieldsPut(@Param("atlassianTransferId") @NotNull UUID atlassianTransferId, @NotNull ConnectCustomFieldValues connectCustomFieldValues);

    /**
     * Append mappings to issue type screen scheme
     * <p>
     * Appends issue type to screen scheme mappings to an issue type screen scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param issueTypeScreenSchemeId The ID of the issue type screen scheme. (required)
     * @param issueTypeScreenSchemeMappingDetails  (required)
     */
    @RequestLine("PUT /rest/api/2/issuetypescreenscheme/{issueTypeScreenSchemeId}/mapping")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object appendMappingsForIssueTypeScreenScheme(@Param("issueTypeScreenSchemeId") @NotNull String issueTypeScreenSchemeId, @NotNull IssueTypeScreenSchemeMappingDetails issueTypeScreenSchemeMappingDetails);

    /**
     * Archive issue(s) by issue ID/key
     * <p>
     * Enables admins to archive up to 1000 issues in a single request using issue ID/key, returning details of the issue(s) archived in the process and the errors encountered, if any.
     * **Note that:**
     *  *
     * you can't archive subtasks directly, only through their parent issues
     * *
     * you can only archive issues from software, service management, and business projects
     * **[Permissions](#permissions) required:** Jira admin or site admin: [global permission](https://confluence.atlassian.com/x/x4dKLg)
     * **License required:** Premium or Enterprise
     * **Signed-in users only:** This API can't be accessed anonymously.
     * 
     *  
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param issueArchivalSyncRequest Contains a list of issue keys or IDs to be archived. (required)
     */
    @RequestLine("PUT /rest/api/2/issue/archive")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    IssueArchivalSyncResponse archiveIssues(@NotNull IssueArchivalSyncRequest issueArchivalSyncRequest);

    /**
     * Archive issue(s) by JQL
     * <p>
     * Enables admins to archive up to 100,000 issues in a single request using JQL, returning the URL to check the status of the submitted request.
     * You can use the [get task](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-tasks/#api-rest-api-3-task-taskid-get) and [cancel task](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-tasks/#api-rest-api-3-task-taskid-cancel-post) APIs to manage the request.
     * **Note that:**
     *  *
     * you can't archive subtasks directly, only through their parent issues
     * *
     * you can only archive issues from software, service management, and business projects
     * **[Permissions](#permissions) required:** Jira admin or site admin: [global permission](https://confluence.atlassian.com/x/x4dKLg)
     * **License required:** Premium or Enterprise
     * **Signed-in users only:** This API can't be accessed anonymously.
     * **Rate limiting:** Only a single request per user can be active at any given time.
     * 
     *  
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param archiveIssueAsyncRequest A JQL query specifying the issues to archive. Note that subtasks can only be archived through their parent issues. (required)
     */
    @RequestLine("POST /rest/api/2/issue/archive")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    String archiveIssuesAsync(@NotNull ArchiveIssueAsyncRequest archiveIssueAsyncRequest);

    /**
     * Archive project
     * <p>
     * Archives a project. You can't delete a project if it's archived. To delete an archived project, restore the project and then delete it. To restore a project, use the Jira UI.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param projectIdOrKey       The project ID or project key (case sensitive). (required)
     */
    @RequestLine("POST /rest/api/2/project/{projectIdOrKey}/archive")
    @Headers({
        "Accept: application/json"
    })
    Object archiveProject(@Param("projectIdOrKey") @NotNull String projectIdOrKey);

    /**
     * Assign field configuration scheme to project
     * <p>
     * Assigns a field configuration scheme to a project. If the field configuration scheme ID is {@code null}, the operation assigns the default field configuration scheme.
     * Field configuration schemes can only be assigned to classic projects.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param fieldConfigurationSchemeProjectAssociation  (required)
     */
    @RequestLine("PUT /rest/api/2/fieldconfigurationscheme/project")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object assignFieldConfigurationSchemeToProject(@NotNull FieldConfigurationSchemeProjectAssociation fieldConfigurationSchemeProjectAssociation);

    /**
     * Assign issue
     * <p>
     * Assigns an issue to a user. Use this operation when the calling user does not have the *Edit Issues* permission but has the *Assign issue* permission for the project that the issue is in.
     * If {@code name} or {@code accountId} is set to:
     *  *
     * {@code "-1"}, the issue is assigned to the default assignee for the project.
     * *
     * {@code null}, the issue is set to unassigned.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse Projects* and *Assign Issues* [ project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param issueIdOrKey         The ID or key of the issue to be assigned. (required)
     * @param user                 The request object with the user that the issue is assigned to. (required)
     */
    @RequestLine("PUT /rest/api/2/issue/{issueIdOrKey}/assignee")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object assignIssue(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @NotNull User user);

    /**
     * Assign issue type scheme to project
     * <p>
     * Assigns an issue type scheme to a project.
     * If any issues in the project are assigned issue types not present in the new scheme, the operation will fail. To complete the assignment those issues must be updated to use issue types in the new scheme.
     * Issue type schemes can only be assigned to classic projects.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param issueTypeSchemeProjectAssociation  (required)
     */
    @RequestLine("PUT /rest/api/2/issuetypescheme/project")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object assignIssueTypeSchemeToProject(@NotNull IssueTypeSchemeProjectAssociation issueTypeSchemeProjectAssociation);

    /**
     * Assign issue type screen scheme to project
     * <p>
     * Assigns an issue type screen scheme to a project.
     * Issue type screen schemes can only be assigned to classic projects.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param issueTypeScreenSchemeProjectAssociation  (required)
     */
    @RequestLine("PUT /rest/api/2/issuetypescreenscheme/project")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object assignIssueTypeScreenSchemeToProject(@NotNull IssueTypeScreenSchemeProjectAssociation issueTypeScreenSchemeProjectAssociation);

    /**
     * Assign permission scheme
     * <p>
     * Assigns a permission scheme with a project. See [Managing project permissions](https://confluence.atlassian.com/x/yodKLg) for more information about permission schemes.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg)
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param projectKeyOrId       The project ID or project key (case sensitive). (required)
     * @param idBean                (required)
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are included when you specify any value. Expand options include:   *  {@code all} Returns all expandable information.  *  {@code field} Returns information about the custom field granted the permission.  *  {@code group} Returns information about the group that is granted the permission.  *  {@code permissions} Returns all permission grants for each permission scheme.  *  {@code projectRole} Returns information about the project role granted the permission.  *  {@code user} Returns information about the user who is granted the permission. (optional)
     */
    @RequestLine("PUT /rest/api/2/project/{projectKeyOrId}/permissionscheme?expand={expand}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    PermissionScheme assignPermissionScheme(@Param("projectKeyOrId") @NotNull String projectKeyOrId, @NotNull IdBean idBean, @Param("expand") @Nullable String expand);

    /**
     * Assign custom field context to projects
     * <p>
     * Assigns a custom field context to projects.
     * If any project in the request is assigned to any context of the custom field, the operation fails.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param fieldId              The ID of the custom field. (required)
     * @param contextId            The ID of the context. (required)
     * @param projectIds            (required)
     */
    @RequestLine("PUT /rest/api/2/field/{fieldId}/context/{contextId}/project")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object assignProjectsToCustomFieldContext(@Param("fieldId") @NotNull String fieldId, @Param("contextId") @NotNull Long contextId, @NotNull ProjectIds projectIds);

    /**
     * Assign workflow scheme to project
     * <p>
     * Assigns a workflow scheme to a project. This operation is performed only when there are no issues in the project.
     * Workflow schemes can only be assigned to classic projects.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param workflowSchemeProjectAssociation  (required)
     */
    @RequestLine("PUT /rest/api/2/workflowscheme/project")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object assignSchemeToProject(@NotNull WorkflowSchemeProjectAssociation workflowSchemeProjectAssociation);

    /**
     * Associate security scheme to project
     * <p>
     * Associates an issue security scheme with a project and remaps security levels of issues to the new levels, if provided.
     * This operation is [asynchronous](#async). Follow the {@code location} link in the response to determine the status of the task and use [Get task](#api-rest-api-2-task-taskId-get) to obtain subsequent updates.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param associateSecuritySchemeWithProjectDetails  (required)
     */
    @RequestLine("PUT /rest/api/2/issuesecurityschemes/project")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    void associateSchemesToProjects(@NotNull AssociateSecuritySchemeWithProjectDetails associateSecuritySchemeWithProjectDetails);

    /**
     * Bulk delete issue property
     * <p>
     * Deletes a property value from multiple issues. The issues to be updated can be specified by filter criteria.
     * The criteria the filter used to identify eligible issues are:
     *  *
     * {@code entityIds} Only issues from this list are eligible.
     * *
     * {@code currentValue} Only issues with the property set to this value are eligible.
     * If both criteria is specified, they are joined with the logical *AND*: only issues that satisfy both criteria are considered eligible.
     * If no filter criteria are specified, all the issues visible to the user and where the user has the EDIT\\_ISSUES permission for the issue are considered eligible.
     * This operation is:
     *  *
     * transactional, either the property is deleted from all eligible issues or, when errors occur, no properties are deleted.
     * *
     * [asynchronous](#async). Follow the {@code location} link in the response to determine the status of the task and use [Get task](#api-rest-api-2-task-taskId-get) to obtain subsequent updates.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [ project permission](https://confluence.atlassian.com/x/yodKLg) for each project containing issues.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * *
     * *Edit issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for each issue.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param propertyKey          The key of the property. (required)
     * @param issueFilterForBulkPropertyDelete  (required)
     */
    @RequestLine("DELETE /rest/api/2/issue/properties/{propertyKey}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    void bulkDeleteIssueProperty(@Param("propertyKey") @NotNull String propertyKey, @NotNull IssueFilterForBulkPropertyDelete issueFilterForBulkPropertyDelete);

    /**
     * Bulk edit dashboards
     * <p>
     * Bulk edit dashboards. Maximum number of dashboards to be edited at the same time is 100.
     * **[Permissions](#permissions) required:** None
     * The dashboards to be updated must be owned by the user, or the user must be an administrator.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param bulkEditShareableEntityRequest The details of dashboards being updated in bulk. (required)
     */
    @RequestLine("PUT /rest/api/2/dashboard/bulk/edit")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    BulkEditShareableEntityResponse bulkEditDashboards(@NotNull BulkEditShareableEntityRequest bulkEditShareableEntityRequest);

    /**
     * Bulk get groups
     * <p>
     * Returns a [paginated](#pagination) list of groups.
     * **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [read:jira-user]
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     * @param groupId              The ID of a group. To specify multiple IDs, pass multiple {@code groupId} parameters. For example, {@code groupId=5b10a2844c20165700ede21g&amp;groupId=5b10ac8d82e05b22cc7d4ef5}. (optional)
     * @param groupName            The name of a group. To specify multiple names, pass multiple {@code groupName} parameters. For example, {@code groupName=administrators&amp;groupName=jira-software-users}. (optional)
     * @param accessType           The access level of a group. Valid values: 'site-admin', 'admin', 'user'. (optional)
     * @param applicationKey       The application key of the product user groups to search for. Valid values: 'jira-servicedesk', 'jira-software', 'jira-product-discovery', 'jira-core'. (optional)
     */
    @RequestLine("GET /rest/api/2/group/bulk?startAt={startAt}&maxResults={maxResults}&groupId={groupId}&groupName={groupName}&accessType={accessType}&applicationKey={applicationKey}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanGroupDetails bulkGetGroups(@Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("groupId") @Nullable Set<String> groupId, @Param("groupName") @Nullable Set<String> groupName, @Param("accessType") @Nullable String accessType, @Param("applicationKey") @Nullable String applicationKey);

    /**
     * Bulk get users
     * <p>
     * Returns a [paginated](#pagination) list of the users specified by one or more account IDs.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * Authentication - Required Scopes: [read:jira-user]
     * @param accountId            The account ID of a user. To specify multiple users, pass multiple {@code accountId} parameters. For example, {@code accountId=5b10a2844c20165700ede21g&amp;accountId=5b10ac8d82e05b22cc7d4ef5}. (required)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 10)
     * @param username             This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param key                  This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     */
    @RequestLine("GET /rest/api/2/user/bulk?startAt={startAt}&maxResults={maxResults}&username={username}&key={key}&accountId={accountId}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanUser bulkGetUsers(@Param("accountId") @NotNull List<String> accountId, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("username") @Nullable List<String> username, @Param("key") @Nullable List<String> key);

    /**
     * Get account IDs for users
     * <p>
     * Returns the account IDs for the users specified in the {@code key} or {@code username} parameters. Note that multiple {@code key} or {@code username} parameters can be specified.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * Authentication - Required Scopes: [read:jira-user]
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 10)
     * @param username             Username of a user. To specify multiple users, pass multiple copies of this parameter. For example, {@code username=fred&amp;username=barney}. Required if {@code key} isn't provided. Cannot be provided if {@code key} is present. (optional)
     * @param key                  Key of a user. To specify multiple users, pass multiple copies of this parameter. For example, {@code key=fred&amp;key=barney}. Required if {@code username} isn't provided. Cannot be provided if {@code username} is present. (optional)
     */
    @RequestLine("GET /rest/api/2/user/bulk/migration?startAt={startAt}&maxResults={maxResults}&username={username}&key={key}")
    @Headers({
        "Accept: application/json"
    })
    List<UserMigrationBean> bulkGetUsersMigration(@Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("username") @Nullable List<String> username, @Param("key") @Nullable List<String> key);

    /**
     * Bulk set issue properties by issue
     * <p>
     * Sets or updates entity property values on issues. Up to 10 entity properties can be specified for each issue and up to 100 issues included in the request.
     * The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON.
     * This operation is:
     *  *
     * [asynchronous](#async). Follow the {@code location} link in the response to determine the status of the task and use [Get task](#api-rest-api-2-task-taskId-get) to obtain subsequent updates.
     * *
     * non-transactional. Updating some entities may fail. Such information will available in the task result.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* and *Edit issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param multiIssueEntityProperties Details of the issue properties to be set or updated. Note that if an issue is not found, it is ignored. (required)
     */
    @RequestLine("POST /rest/api/2/issue/properties/multi")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    void bulkSetIssuePropertiesByIssue(@NotNull MultiIssueEntityProperties multiIssueEntityProperties);

    /**
     * Bulk set issue property
     * <p>
     * Sets a property value on multiple issues.
     * The value set can be a constant or determined by a [Jira expression](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/). Expressions must be computable with constant complexity when applied to a set of issues. Expressions must also comply with the [restrictions](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#restrictions) that apply to all Jira expressions.
     * The issues to be updated can be specified by a filter.
     * The filter identifies issues eligible for update using these criteria:
     *  *
     * {@code entityIds} Only issues from this list are eligible.
     * *
     * {@code currentValue} Only issues with the property set to this value are eligible.
     * *
     * {@code hasProperty}:
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
     * If an invalid combination of criteria is provided, an error is returned. For example, specifying a {@code currentValue} and {@code hasProperty} as *false* would not match any issues (because without the property the property cannot have a value).
     * The filter is optional. Without the filter all the issues visible to the user and where the user has the EDIT\\_ISSUES permission for the issue are considered eligible.
     * This operation is:
     *  *
     * transactional, either all eligible issues are updated or, when errors occur, none are updated.
     * *
     * [asynchronous](#async). Follow the {@code location} link in the response to determine the status of the task and use [Get task](#api-rest-api-2-task-taskId-get) to obtain subsequent updates.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for each project containing issues.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * *
     * *Edit issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for each issue.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param propertyKey          The key of the property. The maximum length is 255 characters. (required)
     * @param bulkIssuePropertyUpdateRequest  (required)
     */
    @RequestLine("PUT /rest/api/2/issue/properties/{propertyKey}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    void bulkSetIssueProperty(@Param("propertyKey") @NotNull String propertyKey, @NotNull BulkIssuePropertyUpdateRequest bulkIssuePropertyUpdateRequest);

    /**
     * Bulk set issues properties by list
     * <p>
     * Sets or updates a list of entity property values on issues. A list of up to 10 entity properties can be specified along with up to 10,000 issues on which to set or update that list of entity properties.
     * The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON. The maximum length of single issue property value is 32768 characters. This operation can be accessed anonymously.
     * This operation is:
     *  *
     * transactional, either all properties are updated in all eligible issues or, when errors occur, no properties are updated.
     * *
     * [asynchronous](#async). Follow the {@code location} link in the response to determine the status of the task and use [Get task](#api-rest-api-2-task-taskId-get) to obtain subsequent updates.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* and *Edit issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param issueEntityProperties Issue properties to be set or updated with values. (required)
     */
    @RequestLine("POST /rest/api/2/issue/properties")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    void bulkSetIssuesPropertiesList(@NotNull IssueEntityProperties issueEntityProperties);

    /**
     * Cancel task
     * <p>
     * Cancels a task.
     * **[Permissions](#permissions) required:** either of:
     *  *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * *
     * Creator of the task.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param taskId               The ID of the task. (required)
     */
    @RequestLine("POST /rest/api/2/task/{taskId}/cancel")
    @Headers({
        "Accept: application/json"
    })
    Object cancelTask(@Param("taskId") @NotNull String taskId);

    /**
     * Change filter owner
     * <p>
     * Changes the owner of the filter.
     * **[Permissions](#permissions) required:** Permission to access Jira. However, the user must own the filter or have the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param id                   The ID of the filter to update. (required)
     * @param changeFilterOwner    The account ID of the new owner of the filter. (required)
     */
    @RequestLine("PUT /rest/api/2/filter/{id}/owner")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object changeFilterOwner(@Param("id") @NotNull Long id, @NotNull ChangeFilterOwner changeFilterOwner);

    /**
     * Copy dashboard
     * <p>
     * Copies a dashboard. Any values provided in the {@code dashboard} parameter replace those in the copied dashboard.
     * **[Permissions](#permissions) required:** None
     * The dashboard to be copied must be owned by or shared with the user.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param id                    (required)
     * @param dashboardDetails     Dashboard details. (required)
     */
    @RequestLine("POST /rest/api/2/dashboard/{id}/copy")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Dashboard copyDashboard(@Param("id") @NotNull String id, @NotNull DashboardDetails dashboardDetails);

    /**
     * Create component
     * <p>
     * Creates a component. Use components to provide containers for issues within a project. Use components to provide containers for issues within a project.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project in which the component is created or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param projectComponent      (required)
     */
    @RequestLine("POST /rest/api/2/component")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    ProjectComponent createComponent(@NotNull ProjectComponent projectComponent);

    /**
     * Create custom field
     * <p>
     * Creates a custom field.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param customFieldDefinitionJsonBean Definition of the custom field to be created (required)
     */
    @RequestLine("POST /rest/api/2/field")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    FieldDetails createCustomField(@NotNull CustomFieldDefinitionJsonBean customFieldDefinitionJsonBean);

    /**
     * Create custom field context
     * <p>
     * Creates a custom field context.
     * If {@code projectIds} is empty, a global context is created. A global context is one that applies to all project. If {@code issueTypeIds} is empty, the context applies to all issue types.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param fieldId              The ID of the custom field. (required)
     * @param createCustomFieldContext  (required)
     */
    @RequestLine("POST /rest/api/2/field/{fieldId}/context")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CreateCustomFieldContext createCustomFieldContext(@Param("fieldId") @NotNull String fieldId, @NotNull CreateCustomFieldContext createCustomFieldContext);

    /**
     * Create custom field options (context)
     * <p>
     * Creates options and, where the custom select field is of the type Select List (cascading), cascading options for a custom select field. The options are added to a context of the field.
     * The maximum number of options that can be created per request is 1000 and each field can have a maximum of 10000 options.
     * This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param fieldId              The ID of the custom field. (required)
     * @param contextId            The ID of the context. (required)
     * @param bulkCustomFieldOptionCreateRequest  (required)
     */
    @RequestLine("POST /rest/api/2/field/{fieldId}/context/{contextId}/option")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CustomFieldCreatedContextOptionsList createCustomFieldOption(@Param("fieldId") @NotNull String fieldId, @Param("contextId") @NotNull Long contextId, @NotNull BulkCustomFieldOptionCreateRequest bulkCustomFieldOptionCreateRequest);

    /**
     * Create dashboard
     * <p>
     * Creates a dashboard.
     * **[Permissions](#permissions) required:** None.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param dashboardDetails     Dashboard details. (required)
     */
    @RequestLine("POST /rest/api/2/dashboard")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Dashboard createDashboard(@NotNull DashboardDetails dashboardDetails);

    /**
     * Create field configuration
     * <p>
     * Creates a field configuration. The field configuration is created with the same field properties as the default configuration, with all the fields being optional.
     * This operation can only create configurations for use in company-managed (classic) projects.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param fieldConfigurationDetails  (required)
     */
    @RequestLine("POST /rest/api/2/fieldconfiguration")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    FieldConfiguration createFieldConfiguration(@NotNull FieldConfigurationDetails fieldConfigurationDetails);

    /**
     * Create field configuration scheme
     * <p>
     * Creates a field configuration scheme.
     * This operation can only create field configuration schemes used in company-managed (classic) projects.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param updateFieldConfigurationSchemeDetails The details of the field configuration scheme. (required)
     */
    @RequestLine("POST /rest/api/2/fieldconfigurationscheme")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    FieldConfigurationScheme createFieldConfigurationScheme(@NotNull UpdateFieldConfigurationSchemeDetails updateFieldConfigurationSchemeDetails);

    /**
     * Create filter
     * <p>
     * Creates a filter. The filter is shared according to the [default share scope](#api-rest-api-2-filter-post). The filter is not selected as a favorite.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param filter               The filter to create. (required)
     * @param expand               Use [expand](#expansion) to include additional information about filter in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code sharedUsers} Returns the users that the filter is shared with. This includes users that can browse projects that the filter is shared with. If you don't specify {@code sharedUsers}, then the {@code sharedUsers} object is returned but it doesn't list any users. The list of users returned is limited to 1000, to access additional users append {@code [start-index:end-index]} to the expand request. For example, to access the next 1000 users, use {@code ?expand=sharedUsers[1001:2000]}.  *  {@code subscriptions} Returns the users that are subscribed to the filter. If you don't specify {@code subscriptions}, the {@code subscriptions} object is returned but it doesn't list any subscriptions. The list of subscriptions returned is limited to 1000, to access additional subscriptions append {@code [start-index:end-index]} to the expand request. For example, to access the next 1000 subscriptions, use {@code ?expand=subscriptions[1001:2000]}. (optional)
     * @param overrideSharePermissions EXPERIMENTAL: Whether share permissions are overridden to enable filters with any share permissions to be created. Available to users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). (optional, defaults to false)
     */
    @RequestLine("POST /rest/api/2/filter?expand={expand}&overrideSharePermissions={overrideSharePermissions}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Filter createFilter(@NotNull Filter filter, @Param("expand") @Nullable String expand, @Param("overrideSharePermissions") @Nullable Boolean overrideSharePermissions);

    /**
     * Create group
     * <p>
     * Creates a group.
     * **[Permissions](#permissions) required:** Site administration (that is, member of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param addGroupBean         The name of the group. (required)
     */
    @RequestLine("POST /rest/api/2/group")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Group createGroup(@NotNull AddGroupBean addGroupBean);

    /**
     * Create issue
     * <p>
     * Creates an issue or, where the option to create subtasks is enabled in Jira, a subtask. A transition may be applied, to move the issue or subtask to a workflow step other than the default start step, and issue properties set.
     * The content of the issue or subtask is defined using {@code update} and {@code fields}. The fields that can be set in the issue or subtask are determined using the [ Get create issue metadata](#api-rest-api-2-issue-createmeta-get). These are the same fields that appear on the issue's create screen.
     * Creating a subtask differs from creating an issue as follows:
     *  *
     * {@code issueType} must be set to a subtask issue type (use [ Get create issue metadata](#api-rest-api-2-issue-createmeta-get) to find subtask issue types).
     * *
     * {@code parent} must contain the ID or key of the parent issue.
     * **[Permissions](#permissions) required:** *Browse projects* and *Create issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project in which the issue or subtask is created.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param issueUpdateDetails    (required)
     * @param updateHistory        Whether the project in which the issue is created is added to the user's **Recently viewed** project list, as shown under **Projects** in Jira. When provided, the issue type and request type are added to the user's history for a project. These values are then used to provide defaults on the issue create screen. (optional, defaults to false)
     */
    @RequestLine("POST /rest/api/2/issue?updateHistory={updateHistory}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CreatedIssue createIssue(@NotNull IssueUpdateDetails issueUpdateDetails, @Param("updateHistory") @Nullable Boolean updateHistory);

    /**
     * Create issue field option
     * <p>
     * Creates an option for a select list issue field.
     * Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param fieldKey             The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the {@code fieldKey} value, do one of the following:   *  open the app's plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the {@code jiraIssueFields} module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-2-field-get) and in the field details the value is returned in {@code key}. For example, {@code "key": "teams-add-on__team-issue-field"} (required)
     * @param issueFieldOptionCreateBean  (required)
     */
    @RequestLine("POST /rest/api/2/field/{fieldKey}/option")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    IssueFieldOption createIssueFieldOption(@Param("fieldKey") @NotNull String fieldKey, @NotNull IssueFieldOptionCreateBean issueFieldOptionCreateBean);

    /**
     * Create issue link type
     * <p>
     * Creates an issue link type. Use this operation to create descriptions of the reasons why issues are linked. The issue link type consists of a name and descriptions for a link's inward and outward relationships.
     * To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param issueLinkType         (required)
     */
    @RequestLine("POST /rest/api/2/issueLinkType")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    IssueLinkType createIssueLinkType(@NotNull IssueLinkType issueLinkType);

    /**
     * Create issue security scheme
     * <p>
     * Creates a security scheme with security scheme levels and levels' members. You can create up to 100 security scheme levels and security scheme levels' members per request.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param createIssueSecuritySchemeDetails  (required)
     */
    @RequestLine("POST /rest/api/2/issuesecurityschemes")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    SecuritySchemeId createIssueSecurityScheme(@NotNull CreateIssueSecuritySchemeDetails createIssueSecuritySchemeDetails);

    /**
     * Create issue type
     * <p>
     * Creates an issue type and adds it to the default issue type scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param issueTypeCreateBean   (required)
     */
    @RequestLine("POST /rest/api/2/issuetype")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    IssueTypeDetails createIssueType(@NotNull IssueTypeCreateBean issueTypeCreateBean);

    /**
     * Load issue type avatar
     * <p>
     * Loads an avatar for the issue type.
     * Specify the avatar's local file location in the body of the request. Also, include the following headers:
     *  *
     * {@code X-Atlassian-Token: no-check} To prevent XSRF protection blocking the request, for more information see [Special Headers](#special-request-headers).
     * *
     * {@code Content-Type: image/image type} Valid image types are JPEG, GIF, or PNG.
     * For example:
     *  {@code curl --request POST \\ --user email@example.com:&amp;lt;api_token&amp;gt; \\ --header 'X-Atlassian-Token: no-check' \\ --header 'Content-Type: image/&amp;lt; image_type&amp;gt;' \\ --data-binary "&amp;lt;@/path/to/file/with/your/avatar&amp;gt;" \\ --url 'https://your-domain.atlassian.net/rest/api/2/issuetype/{issueTypeId}'This}
     * The avatar is cropped to a square. If no crop parameters are specified, the square originates at the top left of the image. The length of the square's sides is set to the smaller of the height or width of the image.
     * The cropped image is then used to create avatars of 16x16, 24x24, 32x32, and 48x48 in size.
     * After creating the avatar, use [ Update issue type](#api-rest-api-2-issuetype-id-put) to set it as the issue type's displayed avatar.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the issue type. (required)
     * @param size                 The length of each side of the crop region. (required)
     * @param body                  (required)
     * @param x                    The X coordinate of the top-left corner of the crop region. (optional, defaults to 0)
     * @param y                    The Y coordinate of the top-left corner of the crop region. (optional, defaults to 0)
     */
    @RequestLine("POST /rest/api/2/issuetype/{id}/avatar2?x={x}&y={y}&size={size}")
    @Headers({
        "Content-Type: */*", 
        "Accept: application/json"
    })
    Avatar createIssueTypeAvatar(@Param("id") @NotNull String id, @Param("size") @NotNull Integer size, @NotNull Object body, @Param("x") @Nullable Integer x, @Param("y") @Nullable Integer y);

    /**
     * Create issue type scheme
     * <p>
     * Creates an issue type scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param issueTypeSchemeDetails  (required)
     */
    @RequestLine("POST /rest/api/2/issuetypescheme")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    IssueTypeSchemeID createIssueTypeScheme(@NotNull IssueTypeSchemeDetails issueTypeSchemeDetails);

    /**
     * Create issue type screen scheme
     * <p>
     * Creates an issue type screen scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param issueTypeScreenSchemeDetails An issue type screen scheme bean. (required)
     */
    @RequestLine("POST /rest/api/2/issuetypescreenscheme")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    IssueTypeScreenSchemeId createIssueTypeScreenScheme(@NotNull IssueTypeScreenSchemeDetails issueTypeScreenSchemeDetails);

    /**
     * Bulk create issue
     * <p>
     * Creates upto **50** issues and, where the option to create subtasks is enabled in Jira, subtasks. Transitions may be applied, to move the issues or subtasks to a workflow step other than the default start step, and issue properties set.
     * The content of each issue or subtask is defined using {@code update} and {@code fields}. The fields that can be set in the issue or subtask are determined using the [ Get create issue metadata](#api-rest-api-2-issue-createmeta-get). These are the same fields that appear on the issues' create screens.
     * Creating a subtask differs from creating an issue as follows:
     *  *
     * {@code issueType} must be set to a subtask issue type (use [ Get create issue metadata](#api-rest-api-2-issue-createmeta-get) to find subtask issue types).
     * *
     * {@code parent} the must contain the ID or key of the parent issue.
     * **[Permissions](#permissions) required:** *Browse projects* and *Create issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project in which each issue or subtask is created.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param issuesUpdateBean      (required)
     */
    @RequestLine("POST /rest/api/2/issue/bulk")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CreatedIssues createIssues(@NotNull IssuesUpdateBean issuesUpdateBean);

    /**
     * Create notification scheme
     * <p>
     * Creates a notification scheme with notifications. You can create up to 1000 notifications per request.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param createNotificationSchemeDetails  (required)
     */
    @RequestLine("POST /rest/api/2/notificationscheme")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    NotificationSchemeId createNotificationScheme(@NotNull CreateNotificationSchemeDetails createNotificationSchemeDetails);

    /**
     * Create or update remote issue link
     * <p>
     * Creates or updates a remote issue link for an issue.
     * If a {@code globalId} is provided and a remote issue link with that global ID is found it is updated. Any fields without values in the request are set to null. Otherwise, the remote issue link is created.
     * This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     * @param remoteIssueLinkRequest  (required)
     */
    @RequestLine("POST /rest/api/2/issue/{issueIdOrKey}/remotelink")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    RemoteIssueLinkIdentifies createOrUpdateRemoteIssueLink(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @NotNull RemoteIssueLinkRequest remoteIssueLinkRequest);

    /**
     * Create permission grant
     * <p>
     * Creates a permission grant in a permission scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param schemeId             The ID of the permission scheme in which to create a new permission grant. (required)
     * @param permissionGrant      The permission grant to create. (required)
     * @param expand               Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  {@code permissions} Returns all permission grants for each permission scheme.  *  {@code user} Returns information about the user who is granted the permission.  *  {@code group} Returns information about the group that is granted the permission.  *  {@code projectRole} Returns information about the project role granted the permission.  *  {@code field} Returns information about the custom field granted the permission.  *  {@code all} Returns all expandable information. (optional)
     */
    @RequestLine("POST /rest/api/2/permissionscheme/{schemeId}/permission?expand={expand}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    PermissionGrant createPermissionGrant(@Param("schemeId") @NotNull Long schemeId, @NotNull PermissionGrant permissionGrant, @Param("expand") @Nullable String expand);

    /**
     * Create permission scheme
     * <p>
     * Creates a new permission scheme. You can create a permission scheme with or without defining a set of permission grants.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param permissionScheme     The permission scheme to create. (required)
     * @param expand               Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  {@code all} Returns all expandable information.  *  {@code field} Returns information about the custom field granted the permission.  *  {@code group} Returns information about the group that is granted the permission.  *  {@code permissions} Returns all permission grants for each permission scheme.  *  {@code projectRole} Returns information about the project role granted the permission.  *  {@code user} Returns information about the user who is granted the permission. (optional)
     */
    @RequestLine("POST /rest/api/2/permissionscheme?expand={expand}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    PermissionScheme createPermissionScheme(@NotNull PermissionScheme permissionScheme, @Param("expand") @Nullable String expand);

    /**
     * Create priority
     * <p>
     * Creates an issue priority.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param createPriorityDetails  (required)
     */
    @RequestLine("POST /rest/api/2/priority")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    PriorityId createPriority(@NotNull CreatePriorityDetails createPriorityDetails);

    /**
     * Create project
     * <p>
     * Creates a project based on a project type template, as shown in the following table:
     * | Project Type Key | Project Template Key |
     *  |--|--|
     *  | {@code business} | {@code com.atlassian.jira-core-project-templates:jira-core-simplified-content-management}, {@code com.atlassian.jira-core-project-templates:jira-core-simplified-document-approval}, {@code com.atlassian.jira-core-project-templates:jira-core-simplified-lead-tracking}, {@code com.atlassian.jira-core-project-templates:jira-core-simplified-process-control}, {@code com.atlassian.jira-core-project-templates:jira-core-simplified-procurement}, {@code com.atlassian.jira-core-project-templates:jira-core-simplified-project-management}, {@code com.atlassian.jira-core-project-templates:jira-core-simplified-recruitment}, {@code com.atlassian.jira-core-project-templates:jira-core-simplified-task-tracking} |
     *  | {@code service_desk} | {@code com.atlassian.servicedesk:simplified-it-service-management}, {@code com.atlassian.servicedesk:simplified-general-service-desk-it}, {@code com.atlassian.servicedesk:simplified-general-service-desk-business}, {@code com.atlassian.servicedesk:simplified-external-service-desk}, {@code com.atlassian.servicedesk:simplified-hr-service-desk}, {@code com.atlassian.servicedesk:simplified-facilities-service-desk}, {@code com.atlassian.servicedesk:simplified-legal-service-desk}, {@code com.atlassian.servicedesk:simplified-analytics-service-desk}, {@code com.atlassian.servicedesk:simplified-marketing-service-desk}, {@code com.atlassian.servicedesk:simplified-design-service-desk}, {@code com.atlassian.servicedesk:simplified-sales-service-desk}, {@code com.atlassian.servicedesk:simplified-blank-project-business}, {@code com.atlassian.servicedesk:simplified-blank-project-it}, {@code com.atlassian.servicedesk:simplified-finance-service-desk}, {@code com.atlassian.servicedesk:next-gen-it-service-desk}, {@code com.atlassian.servicedesk:next-gen-hr-service-desk}, {@code com.atlassian.servicedesk:next-gen-legal-service-desk}, {@code com.atlassian.servicedesk:next-gen-marketing-service-desk}, {@code com.atlassian.servicedesk:next-gen-facilities-service-desk}, {@code com.atlassian.servicedesk:next-gen-general-it-service-desk}, {@code com.atlassian.servicedesk:next-gen-general-business-service-desk}, {@code com.atlassian.servicedesk:next-gen-analytics-service-desk}, {@code com.atlassian.servicedesk:next-gen-finance-service-desk}, {@code com.atlassian.servicedesk:next-gen-design-service-desk}, {@code com.atlassian.servicedesk:next-gen-sales-service-desk} |
     *  | {@code software} | {@code com.pyxis.greenhopper.jira:gh-simplified-agility-kanban}, {@code com.pyxis.greenhopper.jira:gh-simplified-agility-scrum}, {@code com.pyxis.greenhopper.jira:gh-simplified-basic}, {@code com.pyxis.greenhopper.jira:gh-simplified-kanban-classic}, {@code com.pyxis.greenhopper.jira:gh-simplified-scrum-classic} |
     *  The project types are available according to the installed Jira features as follows:
     *  *
     * Jira Core, the default, enables {@code business} projects.
     * *
     * Jira Service Management enables {@code service_desk} projects.
     * *
     * Jira Software enables {@code software} projects.
     * To determine which features are installed, go to **Jira settings** &amp;gt; **Apps** &amp;gt; **Manage apps** and review the System Apps list. To add Jira Software or Jira Service Management into a JIRA instance, use **Jira settings** &amp;gt; **Apps** &amp;gt; **Finding new apps**. For more information, see [ Managing add-ons](https://confluence.atlassian.com/x/S31NLg).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param createProjectDetails The JSON representation of the project being created. (required)
     */
    @RequestLine("POST /rest/api/2/project")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    ProjectIdentifiers createProject(@NotNull CreateProjectDetails createProjectDetails);

    /**
     * Load project avatar
     * <p>
     * Loads an avatar for a project.
     * Specify the avatar's local file location in the body of the request. Also, include the following headers:
     *  *
     * {@code X-Atlassian-Token: no-check} To prevent XSRF protection blocking the request, for more information see [Special Headers](#special-request-headers).
     * *
     * {@code Content-Type: image/image type} Valid image types are JPEG, GIF, or PNG.
     * For example:
     *  {@code curl --request POST }
     * {@code --user email@example.com:&amp;lt;api_token&amp;gt; }
     * {@code --header 'X-Atlassian-Token: no-check' }
     * {@code --header 'Content-Type: image/&amp;lt; image_type&amp;gt;' }
     * {@code --data-binary "&amp;lt;@/path/to/file/with/your/avatar&amp;gt;" }
     * {@code --url 'https://your-domain.atlassian.net/rest/api/2/project/{projectIdOrKey}/avatar2'}
     * The avatar is cropped to a square. If no crop parameters are specified, the square originates at the top left of the image. The length of the square's sides is set to the smaller of the height or width of the image.
     * The cropped image is then used to create avatars of 16x16, 24x24, 32x32, and 48x48 in size.
     * After creating the avatar use [Set project avatar](#api-rest-api-2-project-projectIdOrKey-avatar-put) to set it as the project's displayed avatar.
     * **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param projectIdOrKey       The ID or (case-sensitive) key of the project. (required)
     * @param body                  (required)
     * @param x                    The X coordinate of the top-left corner of the crop region. (optional, defaults to 0)
     * @param y                    The Y coordinate of the top-left corner of the crop region. (optional, defaults to 0)
     * @param size                 The length of each side of the crop region. (optional)
     */
    @RequestLine("POST /rest/api/2/project/{projectIdOrKey}/avatar2?x={x}&y={y}&size={size}")
    @Headers({
        "Content-Type: */*", 
        "Accept: application/json"
    })
    Avatar createProjectAvatar(@Param("projectIdOrKey") @NotNull String projectIdOrKey, @NotNull Object body, @Param("x") @Nullable Integer x, @Param("y") @Nullable Integer y, @Param("size") @Nullable Integer size);

    /**
     * Create project category
     * <p>
     * Creates a project category.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param projectCategory       (required)
     */
    @RequestLine("POST /rest/api/2/projectCategory")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    ProjectCategory createProjectCategory(@NotNull ProjectCategory projectCategory);

    /**
     * Create project role
     * <p>
     * Creates a new project role with no [default actors](#api-rest-api-2-resolution-get). You can use the [Add default actors to project role](#api-rest-api-2-role-id-actors-post) operation to add default actors to the project role after creating it.
     * *Note that although a new project role is available to all projects upon creation, any default actors that are associated with the project role are not added to projects that existed prior to the role being created.*&amp;lt;
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param createUpdateRoleRequestBean  (required)
     */
    @RequestLine("POST /rest/api/2/role")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    ProjectRole createProjectRole(@NotNull CreateUpdateRoleRequestBean createUpdateRoleRequestBean);

    /**
     * Create related work
     * <p>
     * Creates a related work for the given version. You can only create a generic link type of related works via this API. relatedWorkId will be auto-generated UUID, that does not need to be provided.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Resolve issues:* and *Edit issues* [Managing project permissions](https://confluence.atlassian.com/adminjiraserver/managing-project-permissions-938847145.html) for the project that contains the version.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param id                    (required)
     * @param versionRelatedWork    (required)
     */
    @RequestLine("POST /rest/api/2/version/{id}/relatedwork")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    VersionRelatedWork createRelatedWork(@Param("id") @NotNull String id, @NotNull VersionRelatedWork versionRelatedWork);

    /**
     * Create resolution
     * <p>
     * Creates an issue resolution.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param createResolutionDetails  (required)
     */
    @RequestLine("POST /rest/api/2/resolution")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    ResolutionId createResolution(@NotNull CreateResolutionDetails createResolutionDetails);

    /**
     * Create screen
     * <p>
     * Creates a screen with a default field tab.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param screenDetails         (required)
     */
    @RequestLine("POST /rest/api/2/screens")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Screen createScreen(@NotNull ScreenDetails screenDetails);

    /**
     * Create screen scheme
     * <p>
     * Creates a screen scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param screenSchemeDetails   (required)
     */
    @RequestLine("POST /rest/api/2/screenscheme")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    ScreenSchemeId createScreenScheme(@NotNull ScreenSchemeDetails screenSchemeDetails);

    /**
     * Bulk create statuses
     * <p>
     * Creates statuses for a global or project scope.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)
     * *
     * *Administer Jira* [project permission.](https://confluence.atlassian.com/x/yodKLg)
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param statusCreateRequest  Details of the statuses being created and their scope. (required)
     */
    @RequestLine("POST /rest/api/2/statuses")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    List<JiraStatus> createStatuses(@NotNull StatusCreateRequest statusCreateRequest);

    /**
     * Create UI modification
     * <p>
     * Creates a UI modification. UI modification can only be created by Forge apps.
     * Each app can define up to 3000 UI modifications. Each UI modification can define up to 1000 contexts. The same context can be assigned to maximum 100 UI modifications.
     * **[Permissions](#permissions) required:**
     *  *
     * *None* if the UI modification is created without contexts.
     * *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for one or more projects, if the UI modification is created with contexts.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param createUiModificationDetails Details of the UI modification. (required)
     */
    @RequestLine("POST /rest/api/2/uiModifications")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    UiModificationIdentifiers createUiModification(@NotNull CreateUiModificationDetails createUiModificationDetails);

    /**
     * Create user
     * <p>
     * Creates a user. This resource is retained for legacy compatibility. As soon as a more suitable alternative is available this resource will be deprecated.
     * If the user exists and has access to Jira, the operation returns a 201 status. If the user exists but does not have access to Jira, the operation returns a 400 status.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @param newUserDetails       Details about the user to be created. (required)
     */
    @RequestLine("POST /rest/api/2/user")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    User createUser(@NotNull NewUserDetails newUserDetails);

    /**
     * Create version
     * <p>
     * Creates a project version.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project the version is added to.
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param version               (required)
     */
    @RequestLine("POST /rest/api/2/version")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Version createVersion(@NotNull Version version);

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
     * {@code comparator} One of the supported comparator: {@code =}, {@code &amp;gt;}, and {@code &amp;lt;}.
     * *
     * {@code fieldId} The custom numeric field ID. Allowed field types:
     * 
     * 
     * 
     * 
     *  *
     * {@code com.atlassian.jira.plugin.system.customfieldtypes:float}
     * 
     * 
     * *
     * {@code com.pyxis.greenhopper.jira:jsw-story-points}
     * *
     * {@code fieldValue} The value for comparison.
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
     * {@code permissionKey} The permission required to perform the transition. Allowed values: [built-in](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-permission-schemes/#built-in-permissions) or app defined permissions.
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
     * By default this condition allows the transition if the status, as defined by its ID in the {@code previousStatus} object, matches any previous issue status, unless:
     *  *
     * {@code ignoreLoopTransitions} is {@code true}, then loop transitions (from and to the same status) are ignored.
     * *
     * {@code includeCurrentStatus} is {@code true}, then the current issue status is also checked.
     * *
     * {@code mostRecentStatusOnly} is {@code true}, then only the issue's preceding status (the one immediately before the current status) is checked.
     * *
     * {@code reverseCondition} is {@code true}, then the status must not be present.
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
     * {@code fromStatus} OPTIONAL. An object containing the ID of the source status of the transition that is blocked. If omitted any transition to {@code toStatus} is blocked.
     * *
     * {@code toStatus} An object containing the ID of the target status of the transition that is blocked.
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
     * {@code statuses} A list of objects containing status IDs.
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
     * {@code groups} A list of group names.
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
     * {@code projectRoles} A list of objects containing project role IDs.
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
     * {@code allowUserInField} If {@code true} only a user who is listed in {@code fieldId} can perform the transition, otherwise, only a user who is not listed in {@code fieldId} can perform the transition.
     * *
     * {@code fieldId} The ID of the field containing the list of users.
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
     * {@code group} The name of the group.
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
     * {@code fieldId} The ID of the field. Allowed field types:
     * 
     * 
     * 
     * 
     *  *
     * {@code com.atlassian.jira.plugin.system.customfieldtypes:multigrouppicker}
     * 
     * 
     * *
     * {@code com.atlassian.jira.plugin.system.customfieldtypes:grouppicker}
     * 
     * 
     * *
     * {@code com.atlassian.jira.plugin.system.customfieldtypes:select}
     * 
     * 
     * *
     * {@code com.atlassian.jira.plugin.system.customfieldtypes:multiselect}
     * 
     * 
     * *
     * {@code com.atlassian.jira.plugin.system.customfieldtypes:radiobuttons}
     * 
     * 
     * *
     * {@code com.atlassian.jira.plugin.system.customfieldtypes:multicheckboxes}
     * 
     * 
     * *
     * {@code com.pyxis.greenhopper.jira:gh-epic-status}
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
     * {@code projectRole} An object containing the ID of a project role.
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
     * {@code fieldId} The ID of a field used in the comparison.
     * *
     * {@code fieldValue} The expected value of the field.
     * *
     * {@code comparisonType} The type of the comparison. Allowed values: {@code STRING}, {@code NUMBER}, {@code DATE}, {@code DATE_WITHOUT_TIME}, or {@code OPTIONID}.
     * *
     * {@code comparator} One of the supported comparator: {@code &amp;gt;}, {@code &amp;gt;=}, {@code =}, {@code &amp;lt;=}, {@code &amp;lt;}, {@code !=}.
     * **Notes:**
     *  *
     * If you choose the comparison type {@code STRING}, only {@code =} and {@code !=} are valid options.
     * *
     * You may leave {@code fieldValue} empty when comparison type is {@code !=} to indicate that a value is required in the field.
     * *
     * For date fields without time format values as {@code yyyy-MM-dd}, and for those with time as {@code yyyy-MM-dd HH:mm}. For example, for July 16 2021 use {@code 2021-07-16}, for 8:05 AM use {@code 2021-07-16 08:05}, and for 4 PM: {@code 2021-07-16 16:00}.
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
     * {@code comparator} One of the supported comparator: {@code &amp;gt;}, {@code &amp;gt;=}, {@code =}, {@code &amp;lt;=}, {@code &amp;lt;}, or {@code !=}.
     * *
     * {@code date1} The date field to validate. Allowed field types:
     * 
     * 
     * 
     * 
     *  *
     * {@code com.atlassian.jira.plugin.system.customfieldtypes:datepicker}
     * 
     * 
     * *
     * {@code com.atlassian.jira.plugin.system.customfieldtypes:datetime}
     * 
     * 
     * *
     * {@code com.atlassian.jpo:jpo-custom-field-baseline-end}
     * 
     * 
     * *
     * {@code com.atlassian.jpo:jpo-custom-field-baseline-start}
     * 
     * 
     * *
     * {@code duedate}
     * 
     * 
     * *
     * {@code created}
     * 
     * 
     * *
     * {@code updated}
     * 
     * 
     * *
     * {@code resolutiondate}
     * *
     * {@code date2} The second date field. Required, if {@code expression} is not passed. Allowed field types:
     * 
     * 
     * 
     * 
     *  *
     * {@code com.atlassian.jira.plugin.system.customfieldtypes:datepicker}
     * 
     * 
     * *
     * {@code com.atlassian.jira.plugin.system.customfieldtypes:datetime}
     * 
     * 
     * *
     * {@code com.atlassian.jpo:jpo-custom-field-baseline-end}
     * 
     * 
     * *
     * {@code com.atlassian.jpo:jpo-custom-field-baseline-start}
     * 
     * 
     * *
     * {@code duedate}
     * 
     * 
     * *
     * {@code created}
     * 
     * 
     * *
     * {@code updated}
     * 
     * 
     * *
     * {@code resolutiondate}
     * *
     * {@code expression} An expression specifying an offset. Required, if {@code date2} is not passed. Offsets are built with a number, with {@code -} as prefix for the past, and one of these time units: {@code d} for day, {@code w} for week, {@code m} for month, or {@code y} for year. For example, -2d means two days into the past and 1w means one week into the future. The {@code now} keyword enables a comparison with the current date.
     * *
     * {@code includeTime} If {@code true}, then the time part of the data is included for the comparison. If the field doesn't have a time part, 00:00:00 is used.
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
     * {@code date1} The date field to validate. Allowed field types:
     * 
     * 
     * 
     * 
     *  *
     * {@code com.atlassian.jira.plugin.system.customfieldtypes:datepicker}
     * 
     * 
     * *
     * {@code com.atlassian.jira.plugin.system.customfieldtypes:datetime}
     * 
     * 
     * *
     * {@code com.atlassian.jpo:jpo-custom-field-baseline-end}
     * 
     * 
     * *
     * {@code com.atlassian.jpo:jpo-custom-field-baseline-start}
     * 
     * 
     * *
     * {@code duedate}
     * 
     * 
     * *
     * {@code created}
     * 
     * 
     * *
     * {@code updated}
     * 
     * 
     * *
     * {@code resolutiondate}
     * *
     * {@code date2} The reference date. Allowed field types:
     * 
     * 
     * 
     * 
     *  *
     * {@code com.atlassian.jira.plugin.system.customfieldtypes:datepicker}
     * 
     * 
     * *
     * {@code com.atlassian.jira.plugin.system.customfieldtypes:datetime}
     * 
     * 
     * *
     * {@code com.atlassian.jpo:jpo-custom-field-baseline-end}
     * 
     * 
     * *
     * {@code com.atlassian.jpo:jpo-custom-field-baseline-start}
     * 
     * 
     * *
     * {@code duedate}
     * 
     * 
     * *
     * {@code created}
     * 
     * 
     * *
     * {@code updated}
     * 
     * 
     * *
     * {@code resolutiondate}
     * *
     * {@code windowsDays} A positive integer indicating a number of days.
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
     * {@code ignoreContext} If {@code true}, then the context is ignored and all the fields are validated.
     * *
     * {@code errorMessage} OPTIONAL. The error message displayed when one or more fields are empty. A default error message is shown if an error message is not provided.
     * *
     * {@code fieldIds} The list of fields to validate.
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
     * {@code fieldId} The ID of a field.
     * *
     * {@code errorMessage} OPTIONAL. The error message displayed if the field is not changed. A default error message is shown if the error message is not provided.
     * *
     * {@code exemptedGroups} OPTIONAL. The list of groups.
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
     * {@code fieldId} The ID of a field.
     * *
     * {@code excludeSubtasks} If {@code true}, then values copied from subtasks are ignored.
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
     * {@code parentStatus} The list of required parent issue statuses.
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
     * {@code permissionKey} The permission required to perform the transition. Allowed values: [built-in](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-permission-schemes/#built-in-permissions) or app defined permissions.
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
     * {@code mostRecentStatusOnly} If {@code true}, then only the issue's preceding status (the one immediately before the current status) is checked.
     * *
     * {@code previousStatus} An object containing the ID of an issue status.
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
     * {@code regExp}A regular expression.
     * *
     * {@code fieldId} The ID of a field. Allowed field types:
     * 
     * 
     * 
     * 
     *  *
     * {@code com.atlassian.jira.plugin.system.customfieldtypes:select}
     * 
     * 
     * *
     * {@code com.atlassian.jira.plugin.system.customfieldtypes:multiselect}
     * 
     * 
     * *
     * {@code com.atlassian.jira.plugin.system.customfieldtypes:radiobuttons}
     * 
     * 
     * *
     * {@code com.atlassian.jira.plugin.system.customfieldtypes:multicheckboxes}
     * 
     * 
     * *
     * {@code com.atlassian.jira.plugin.system.customfieldtypes:textarea}
     * 
     * 
     * *
     * {@code com.atlassian.jira.plugin.system.customfieldtypes:textfield}
     * 
     * 
     * *
     * {@code com.atlassian.jira.plugin.system.customfieldtypes:url}
     * 
     * 
     * *
     * {@code com.atlassian.jira.plugin.system.customfieldtypes:float}
     * 
     * 
     * *
     * {@code com.pyxis.greenhopper.jira:jsw-story-points}
     * 
     * 
     * *
     * {@code com.pyxis.greenhopper.jira:gh-epic-status}
     * 
     * 
     * *
     * {@code description}
     * 
     * 
     * *
     * {@code summary}
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
     * {@code permissionKey} The permission to be validated. Allowed values: [built-in](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-permission-schemes/#built-in-permissions) or app defined permissions.
     * *
     * {@code nullAllowed} If {@code true}, allows the transition when {@code username} is empty.
     * *
     * {@code username} The username to validate against the {@code permissionKey}.
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
     * **Note:** If provided, this post function overrides the default {@code FireIssueEventFunction}. Can be included once in a transition.
     *  *
     * {@code event} An object containing the ID of the issue event.
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
     * A post function that assigns the issue to the current user if the current user has the {@code ASSIGNABLE_USER} permission.
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
     * {@code fieldId} The ID of the field.
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
     * {@code sourceFieldId} The ID of the source field.
     * *
     * {@code destinationFieldId} The ID of the destination field.
     * *
     * {@code copyType} Use {@code same} to copy the value from a field inside the issue, or {@code parent} to copy the value from the parent issue.
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
     * {@code projectRole} An object containing the ID of the project role.
     * *
     * {@code issueSecurityLevel} OPTIONAL. The object containing the ID of the security level. If not passed, then the security level is set to {@code none}.
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
     * {@code webhook} An object containing the ID of the webhook listener to trigger.
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
     * {@code mode} Use {@code replace} to override the field content with {@code fieldValue} or {@code append} to add {@code fieldValue} to the end of the field content.
     * *
     * {@code fieldId} The ID of the field.
     * *
     * {@code fieldValue} The update content.
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
     * {@code fieldId} The ID of the field. Allowed field types:
     * 
     * 
     * 
     * 
     *  *
     * {@code assignee}
     * 
     * 
     * *
     * {@code description}
     * 
     * 
     * *
     * {@code environment}
     * 
     * 
     * *
     * {@code priority}
     * 
     * 
     * *
     * {@code resolution}
     * 
     * 
     * *
     * {@code summary}
     * 
     * 
     * *
     * {@code timeoriginalestimate}
     * 
     * 
     * *
     * {@code timeestimate}
     * 
     * 
     * *
     * {@code timespent}
     * *
     * {@code fieldValue} The update value.
     * *
     * If the {@code fieldId} is {@code assignee}, the {@code fieldValue} should be one of these values:
     * 
     * 
     * 
     * 
     *  *
     * an account ID.
     * 
     * 
     * *
     * {@code automatic}.
     * 
     * 
     * *
     * a blank string, which sets the value to {@code unassigned}.
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
     * {@code type} A Connect rule key in a form of {@code appKey__moduleKey}.
     * *
     * {@code value} The stringified JSON configuration of a Connect rule.
     * #### Forge rules ####
     * Forge transition rules are not yet supported.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param createWorkflowDetails The workflow details. (required)
     * @deprecated
     */
    @Deprecated
    @RequestLine("POST /rest/api/2/workflow")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    WorkflowIDs createWorkflow(@NotNull CreateWorkflowDetails createWorkflowDetails);

    /**
     * Create workflow scheme
     * <p>
     * Creates a workflow scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param workflowScheme        (required)
     */
    @RequestLine("POST /rest/api/2/workflowscheme")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    WorkflowScheme createWorkflowScheme(@NotNull WorkflowScheme workflowScheme);

    /**
     * Create draft workflow scheme
     * <p>
     * Create a draft workflow scheme from an active workflow scheme, by copying the active workflow scheme. Note that an active workflow scheme can only have one draft workflow scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the active workflow scheme that the draft is created from. (required)
     */
    @RequestLine("POST /rest/api/2/workflowscheme/{id}/createdraft")
    @Headers({
        "Accept: application/json"
    })
    WorkflowScheme createWorkflowSchemeDraftFromParent(@Param("id") @NotNull Long id);

    /**
     * Create workflow transition property
     * <p>
     * Adds a property to a workflow transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param transitionId         The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition. (required)
     * @param key                  The key of the property being added, also known as the name of the property. Set this to the same value as the {@code key} defined in the request body. (required)
     * @param workflowName         The name of the workflow that the transition belongs to. (required)
     * @param workflowTransitionProperty  (required)
     * @param workflowMode         The workflow status. Set to *live* for inactive workflows or *draft* for draft workflows. Active workflows cannot be edited. (optional, defaults to live)
     */
    @RequestLine("POST /rest/api/2/workflow/transitions/{transitionId}/properties?key={key}&workflowName={workflowName}&workflowMode={workflowMode}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    WorkflowTransitionProperty createWorkflowTransitionProperty(@Param("transitionId") @NotNull Long transitionId, @Param("key") @NotNull String key, @Param("workflowName") @NotNull String workflowName, @NotNull WorkflowTransitionProperty workflowTransitionProperty, @Param("workflowMode") @Nullable String workflowMode);

    /**
     * Bulk create workflows
     * <p>
     * Create workflows and related statuses.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* project permission to create all, including global-scoped, workflows
     * *
     * *Administer projects* project permissions to create project-scoped workflows
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param workflowCreateRequest  (required)
     */
    @RequestLine("POST /rest/api/2/workflows/create")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    WorkflowCreateResponse createWorkflows(@NotNull WorkflowCreateRequest workflowCreateRequest);

    /**
     * Delete actors from project role
     * <p>
     * Deletes actors from a project role for the project.
     * To remove default actors from the project role, use [Delete default actors from project role](#api-rest-api-2-role-id-actors-delete).
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param projectIdOrKey       The project ID or project key (case sensitive). (required)
     * @param id                   The ID of the project role. Use [Get all project roles](#api-rest-api-2-role-get) to get a list of project role IDs. (required)
     * @param user                 The user account ID of the user to remove from the project role. (optional)
     * @param group                The name of the group to remove from the project role. This parameter cannot be used with the {@code groupId} parameter. As a group's name can change, use of {@code groupId} is recommended. (optional)
     * @param groupId              The ID of the group to remove from the project role. This parameter cannot be used with the {@code group} parameter. (optional)
     */
    @RequestLine("DELETE /rest/api/2/project/{projectIdOrKey}/role/{id}?user={user}&group={group}&groupId={groupId}")
    @Headers({
        "Accept: application/json"
    })
    void deleteActor(@Param("projectIdOrKey") @NotNull String projectIdOrKey, @Param("id") @NotNull Long id, @Param("user") @Nullable String user, @Param("group") @Nullable String group, @Param("groupId") @Nullable String groupId);

    /**
     * Delete and replace version
     * <p>
     * Deletes a project version.
     * Alternative versions can be provided to update issues that use the deleted version in {@code fixVersion}, {@code affectedVersion}, or any version picker custom fields. If alternatives are not provided, occurrences of {@code fixVersion}, {@code affectedVersion}, and any version picker custom field, that contain the deleted version, are cleared. Any replacement version must be in the same project as the version being deleted and cannot be the version being deleted.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that contains the version.
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param id                   The ID of the version. (required)
     * @param deleteAndReplaceVersionBean  (required)
     */
    @RequestLine("POST /rest/api/2/version/{id}/removeAndSwap")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object deleteAndReplaceVersion(@Param("id") @NotNull String id, @NotNull DeleteAndReplaceVersionBean deleteAndReplaceVersionBean);

    /**
     * Delete avatar
     * <p>
     * Deletes an avatar from a project or issue type.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param type                 The avatar type. (required)
     * @param owningObjectId       The ID of the item the avatar is associated with. (required)
     * @param id                   The ID of the avatar. (required)
     */
    @RequestLine("DELETE /rest/api/2/universal_avatar/type/{type}/owner/{owningObjectId}/avatar/{id}")
    @Headers({
        "Accept: application/json"
    })
    void deleteAvatar(@Param("type") @NotNull String type, @Param("owningObjectId") @NotNull String owningObjectId, @Param("id") @NotNull Long id);

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
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     * @param id                   The ID of the comment. (required)
     */
    @RequestLine("DELETE /rest/api/2/issue/{issueIdOrKey}/comment/{id}")
    @Headers({
        "Accept: application/json"
    })
    void deleteComment(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @Param("id") @NotNull String id);

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
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param commentId            The ID of the comment. (required)
     * @param propertyKey          The key of the property. (required)
     */
    @RequestLine("DELETE /rest/api/2/comment/{commentId}/properties/{propertyKey}")
    @Headers({
        "Accept: application/json"
    })
    void deleteCommentProperty(@Param("commentId") @NotNull String commentId, @Param("propertyKey") @NotNull String propertyKey);

    /**
     * Delete component
     * <p>
     * Deletes a component.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the component or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param id                   The ID of the component. (required)
     * @param moveIssuesTo         The ID of the component to replace the deleted component. If this value is null no replacement is made. (optional)
     */
    @RequestLine("DELETE /rest/api/2/component/{id}?moveIssuesTo={moveIssuesTo}")
    @Headers({
        "Accept: application/json"
    })
    void deleteComponent(@Param("id") @NotNull String id, @Param("moveIssuesTo") @Nullable String moveIssuesTo);

    /**
     * Delete custom field
     * <p>
     * Deletes a custom field. The custom field is deleted whether it is in the trash or not. See [Edit or delete a custom field](https://confluence.atlassian.com/x/Z44fOw) for more information on trashing and deleting custom fields.
     * This operation is [asynchronous](#async). Follow the {@code location} link in the response to determine the status of the task and use [Get task](#api-rest-api-2-task-taskId-get) to obtain subsequent updates.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of a custom field. (required)
     */
    @RequestLine("DELETE /rest/api/2/field/{id}")
    @Headers({
        "Accept: application/json"
    })
    void deleteCustomField(@Param("id") @NotNull String id);

    /**
     * Delete custom field context
     * <p>
     * Deletes a [ custom field context](https://confluence.atlassian.com/adminjiracloud/what-are-custom-field-contexts-991923859.html).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param fieldId              The ID of the custom field. (required)
     * @param contextId            The ID of the context. (required)
     */
    @RequestLine("DELETE /rest/api/2/field/{fieldId}/context/{contextId}")
    @Headers({
        "Accept: application/json"
    })
    Object deleteCustomFieldContext(@Param("fieldId") @NotNull String fieldId, @Param("contextId") @NotNull Long contextId);

    /**
     * Delete custom field options (context)
     * <p>
     * Deletes a custom field option.
     * Options with cascading options cannot be deleted without deleting the cascading options first.
     * This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param fieldId              The ID of the custom field. (required)
     * @param contextId            The ID of the context from which an option should be deleted. (required)
     * @param optionId             The ID of the option to delete. (required)
     */
    @RequestLine("DELETE /rest/api/2/field/{fieldId}/context/{contextId}/option/{optionId}")
    @Headers({
        "Accept: application/json"
    })
    void deleteCustomFieldOption(@Param("fieldId") @NotNull String fieldId, @Param("contextId") @NotNull Long contextId, @Param("optionId") @NotNull Long optionId);

    /**
     * Delete dashboard
     * <p>
     * Deletes a dashboard.
     * **[Permissions](#permissions) required:** None
     * The dashboard to be deleted must be owned by the user.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param id                   The ID of the dashboard. (required)
     */
    @RequestLine("DELETE /rest/api/2/dashboard/{id}")
    @Headers({
        "Accept: application/json"
    })
    void deleteDashboard(@Param("id") @NotNull String id);

    /**
     * Delete dashboard item property
     * <p>
     * Deletes a dashboard item property.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** The user must be the owner of the dashboard. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param dashboardId          The ID of the dashboard. (required)
     * @param itemId               The ID of the dashboard item. (required)
     * @param propertyKey          The key of the dashboard item property. (required)
     */
    @RequestLine("DELETE /rest/api/2/dashboard/{dashboardId}/items/{itemId}/properties/{propertyKey}")
    @Headers({
        "Accept: application/json"
    })
    void deleteDashboardItemProperty(@Param("dashboardId") @NotNull String dashboardId, @Param("itemId") @NotNull String itemId, @Param("propertyKey") @NotNull String propertyKey);

    /**
     * Delete default workflow
     * <p>
     * Resets the default workflow for a workflow scheme. That is, the default workflow is set to Jira's system workflow (the *jira* workflow).
     * Note that active workflow schemes cannot be edited. If the workflow scheme is active, set {@code updateDraftIfNeeded} to {@code true} and a draft workflow scheme is created or updated with the default workflow reset. The draft workflow scheme can be published in Jira.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the workflow scheme. (required)
     * @param updateDraftIfNeeded  Set to true to create or update the draft of a workflow scheme and delete the mapping from the draft, when the workflow scheme cannot be edited. Defaults to {@code false}. (optional)
     */
    @RequestLine("DELETE /rest/api/2/workflowscheme/{id}/default?updateDraftIfNeeded={updateDraftIfNeeded}")
    @Headers({
        "Accept: application/json"
    })
    WorkflowScheme deleteDefaultWorkflow(@Param("id") @NotNull Long id, @Param("updateDraftIfNeeded") @Nullable Boolean updateDraftIfNeeded);

    /**
     * Delete draft default workflow
     * <p>
     * Resets the default workflow for a workflow scheme's draft. That is, the default workflow is set to Jira's system workflow (the *jira* workflow).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the workflow scheme that the draft belongs to. (required)
     */
    @RequestLine("DELETE /rest/api/2/workflowscheme/{id}/draft/default")
    @Headers({
        "Accept: application/json"
    })
    WorkflowScheme deleteDraftDefaultWorkflow(@Param("id") @NotNull Long id);

    /**
     * Delete issue types for workflow in draft workflow scheme
     * <p>
     * Deletes the workflow-issue type mapping for a workflow in a workflow scheme's draft.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the workflow scheme that the draft belongs to. (required)
     * @param workflowName         The name of the workflow. (required)
     */
    @RequestLine("DELETE /rest/api/2/workflowscheme/{id}/draft/workflow?workflowName={workflowName}")
    @Headers({
        "Accept: application/json"
    })
    void deleteDraftWorkflowMapping(@Param("id") @NotNull Long id, @Param("workflowName") @NotNull String workflowName);

    /**
     * Remove filter as favorite
     * <p>
     * Removes a filter as a favorite for the user. Note that this operation only removes filters visible to the user from the user's favorites list. For example, if the user favorites a public filter that is subsequently made private (and is therefore no longer visible on their favorites list) they cannot remove it from their favorites list.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param id                   The ID of the filter. (required)
     * @param expand               Use [expand](#expansion) to include additional information about filter in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code sharedUsers} Returns the users that the filter is shared with. This includes users that can browse projects that the filter is shared with. If you don't specify {@code sharedUsers}, then the {@code sharedUsers} object is returned but it doesn't list any users. The list of users returned is limited to 1000, to access additional users append {@code [start-index:end-index]} to the expand request. For example, to access the next 1000 users, use {@code ?expand=sharedUsers[1001:2000]}.  *  {@code subscriptions} Returns the users that are subscribed to the filter. If you don't specify {@code subscriptions}, the {@code subscriptions} object is returned but it doesn't list any subscriptions. The list of subscriptions returned is limited to 1000, to access additional subscriptions append {@code [start-index:end-index]} to the expand request. For example, to access the next 1000 subscriptions, use {@code ?expand=subscriptions[1001:2000]}. (optional)
     */
    @RequestLine("DELETE /rest/api/2/filter/{id}/favourite?expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    Filter deleteFavouriteForFilter(@Param("id") @NotNull Long id, @Param("expand") @Nullable String expand);

    /**
     * Delete field configuration
     * <p>
     * Deletes a field configuration.
     * This operation can only delete configurations used in company-managed (classic) projects.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the field configuration. (required)
     */
    @RequestLine("DELETE /rest/api/2/fieldconfiguration/{id}")
    @Headers({
        "Accept: application/json"
    })
    Object deleteFieldConfiguration(@Param("id") @NotNull Long id);

    /**
     * Delete field configuration scheme
     * <p>
     * Deletes a field configuration scheme.
     * This operation can only delete field configuration schemes used in company-managed (classic) projects.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the field configuration scheme. (required)
     */
    @RequestLine("DELETE /rest/api/2/fieldconfigurationscheme/{id}")
    @Headers({
        "Accept: application/json"
    })
    Object deleteFieldConfigurationScheme(@Param("id") @NotNull Long id);

    /**
     * Delete filter
     * <p>
     * Delete a filter.
     * **[Permissions](#permissions) required:** Permission to access Jira, however filters can only be deleted by the creator of the filter or a user with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param id                   The ID of the filter to delete. (required)
     */
    @RequestLine("DELETE /rest/api/2/filter/{id}")
    @Headers({
        "Accept: application/json"
    })
    void deleteFilter(@Param("id") @NotNull Long id);

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
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param entityId             The entity ID of the workflow. (required)
     */
    @RequestLine("DELETE /rest/api/2/workflow/{entityId}")
    @Headers({
        "Accept: application/json"
    })
    void deleteInactiveWorkflow(@Param("entityId") @NotNull String entityId);

    /**
     * Delete issue
     * <p>
     * Deletes an issue.
     * An issue cannot be deleted if it has one or more subtasks. To delete an issue with subtasks, set {@code deleteSubtasks}. This causes the issue's subtasks to be deleted with the issue.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* and *Delete issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     * @param deleteSubtasks       Whether the issue's subtasks are deleted when the issue is deleted. (optional, defaults to false)
     */
    @RequestLine("DELETE /rest/api/2/issue/{issueIdOrKey}?deleteSubtasks={deleteSubtasks}")
    @Headers({
        "Accept: application/json"
    })
    void deleteIssue(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @Param("deleteSubtasks") @Nullable String deleteSubtasks);

    /**
     * Delete issue field option
     * <p>
     * Deletes an option from a select list issue field.
     * Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param fieldKey             The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the {@code fieldKey} value, do one of the following:   *  open the app's plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the {@code jiraIssueFields} module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-2-field-get) and in the field details the value is returned in {@code key}. For example, {@code "key": "teams-add-on__team-issue-field"} (required)
     * @param optionId             The ID of the option to be deleted. (required)
     */
    @RequestLine("DELETE /rest/api/2/field/{fieldKey}/option/{optionId}")
    @Headers({
        "Accept: application/json"
    })
    Object deleteIssueFieldOption(@Param("fieldKey") @NotNull String fieldKey, @Param("optionId") @NotNull Long optionId);

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
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param linkId               The ID of the issue link. (required)
     */
    @RequestLine("DELETE /rest/api/2/issueLink/{linkId}")
    @Headers({
        "Accept: application/json"
    })
    void deleteIssueLink(@Param("linkId") @NotNull String linkId);

    /**
     * Delete issue link type
     * <p>
     * Deletes an issue link type.
     * To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param issueLinkTypeId      The ID of the issue link type. (required)
     */
    @RequestLine("DELETE /rest/api/2/issueLinkType/{issueLinkTypeId}")
    @Headers({
        "Accept: application/json"
    })
    void deleteIssueLinkType(@Param("issueLinkTypeId") @NotNull String issueLinkTypeId);

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
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param issueIdOrKey         The key or ID of the issue. (required)
     * @param propertyKey          The key of the property. (required)
     */
    @RequestLine("DELETE /rest/api/2/issue/{issueIdOrKey}/properties/{propertyKey}")
    @Headers({
        "Accept: application/json"
    })
    void deleteIssueProperty(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @Param("propertyKey") @NotNull String propertyKey);

    /**
     * Delete issue type
     * <p>
     * Deletes the issue type. If the issue type is in use, all uses are updated with the alternative issue type ({@code alternativeIssueTypeId}). A list of alternative issue types are obtained from the [Get alternative issue types](#api-rest-api-2-issuetype-id-alternatives-get) resource.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the issue type. (required)
     * @param alternativeIssueTypeId The ID of the replacement issue type. (optional)
     */
    @RequestLine("DELETE /rest/api/2/issuetype/{id}?alternativeIssueTypeId={alternativeIssueTypeId}")
    @Headers({
        "Accept: application/json"
    })
    void deleteIssueType(@Param("id") @NotNull String id, @Param("alternativeIssueTypeId") @Nullable String alternativeIssueTypeId);

    /**
     * Delete issue type property
     * <p>
     * Deletes the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param issueTypeId          The ID of the issue type. (required)
     * @param propertyKey          The key of the property. Use [Get issue type property keys](#api-rest-api-2-issuetype-issueTypeId-properties-get) to get a list of all issue type property keys. (required)
     */
    @RequestLine("DELETE /rest/api/2/issuetype/{issueTypeId}/properties/{propertyKey}")
    @Headers({
        "Accept: application/json"
    })
    void deleteIssueTypeProperty(@Param("issueTypeId") @NotNull String issueTypeId, @Param("propertyKey") @NotNull String propertyKey);

    /**
     * Delete issue type scheme
     * <p>
     * Deletes an issue type scheme.
     * Only issue type schemes used in classic projects can be deleted.
     * Any projects assigned to the scheme are reassigned to the default issue type scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param issueTypeSchemeId    The ID of the issue type scheme. (required)
     */
    @RequestLine("DELETE /rest/api/2/issuetypescheme/{issueTypeSchemeId}")
    @Headers({
        "Accept: application/json"
    })
    Object deleteIssueTypeScheme(@Param("issueTypeSchemeId") @NotNull Long issueTypeSchemeId);

    /**
     * Delete issue type screen scheme
     * <p>
     * Deletes an issue type screen scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param issueTypeScreenSchemeId The ID of the issue type screen scheme. (required)
     */
    @RequestLine("DELETE /rest/api/2/issuetypescreenscheme/{issueTypeScreenSchemeId}")
    @Headers({
        "Accept: application/json"
    })
    Object deleteIssueTypeScreenScheme(@Param("issueTypeScreenSchemeId") @NotNull String issueTypeScreenSchemeId);

    /**
     * Delete locale
     * <p>
     * Deprecated, use [ Update a user profile](https://developer.atlassian.com/cloud/admin/user-management/rest/#api-users-account-id-manage-profile-patch) from the user management REST API instead.
     * Deletes the locale of the user, which restores the default setting.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @deprecated
     */
    @Deprecated
    @RequestLine("DELETE /rest/api/2/mypreferences/locale")
    @Headers({
        "Accept: application/json"
    })
    Object deleteLocale();

    /**
     * Delete notification scheme
     * <p>
     * Deletes a notification scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param notificationSchemeId The ID of the notification scheme. (required)
     */
    @RequestLine("DELETE /rest/api/2/notificationscheme/{notificationSchemeId}")
    @Headers({
        "Accept: application/json"
    })
    Object deleteNotificationScheme(@Param("notificationSchemeId") @NotNull String notificationSchemeId);

    /**
     * Delete permission scheme
     * <p>
     * Deletes a permission scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param schemeId             The ID of the permission scheme being deleted. (required)
     */
    @RequestLine("DELETE /rest/api/2/permissionscheme/{schemeId}")
    @Headers({
        "Accept: application/json"
    })
    void deletePermissionScheme(@Param("schemeId") @NotNull Long schemeId);

    /**
     * Delete permission scheme grant
     * <p>
     * Deletes a permission grant from a permission scheme. See [About permission schemes and grants](../api-group-permission-schemes/#about-permission-schemes-and-grants) for more details.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param schemeId             The ID of the permission scheme to delete the permission grant from. (required)
     * @param permissionId         The ID of the permission grant to delete. (required)
     */
    @RequestLine("DELETE /rest/api/2/permissionscheme/{schemeId}/permission/{permissionId}")
    @Headers({
        "Accept: application/json"
    })
    void deletePermissionSchemeEntity(@Param("schemeId") @NotNull Long schemeId, @Param("permissionId") @NotNull Long permissionId);

    /**
     * Delete priority
     * <p>
     * *Deprecated: please refer to the* [changelog](https://developer.atlassian.com/changelog/#CHANGE-1066) *for more details.*
     * Deletes an issue priority.
     * This operation is [asynchronous](#async). Follow the {@code location} link in the response to determine the status of the task and use [Get task](#api-rest-api-2-task-taskId-get) to obtain subsequent updates.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the issue priority. (required)
     * @param replaceWith          The ID of the issue priority that will replace the currently selected resolution. (required)
     * @deprecated
     */
    @Deprecated
    @RequestLine("DELETE /rest/api/2/priority/{id}?replaceWith={replaceWith}")
    @Headers({
        "Accept: application/json"
    })
    void deletePriority(@Param("id") @NotNull String id, @Param("replaceWith") @NotNull String replaceWith);

    /**
     * Delete project
     * <p>
     * Deletes a project.
     * You can't delete a project if it's archived. To delete an archived project, restore the project and then delete it. To restore a project, use the Jira UI.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param projectIdOrKey       The project ID or project key (case sensitive). (required)
     * @param enableUndo           Whether this project is placed in the Jira recycle bin where it will be available for restoration. (optional, defaults to true)
     */
    @RequestLine("DELETE /rest/api/2/project/{projectIdOrKey}?enableUndo={enableUndo}")
    @Headers({
        "Accept: application/json"
    })
    void deleteProject(@Param("projectIdOrKey") @NotNull String projectIdOrKey, @Param("enableUndo") @Nullable Boolean enableUndo);

    /**
     * Delete project asynchronously
     * <p>
     * Deletes a project asynchronously.
     * This operation is:
     *  *
     * transactional, that is, if part of the delete fails the project is not deleted.
     * *
     * [asynchronous](#async). Follow the {@code location} link in the response to determine the status of the task and use [Get task](#api-rest-api-2-task-taskId-get) to obtain subsequent updates.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param projectIdOrKey       The project ID or project key (case sensitive). (required)
     */
    @RequestLine("POST /rest/api/2/project/{projectIdOrKey}/delete")
    @Headers({
        "Accept: application/json"
    })
    void deleteProjectAsynchronously(@Param("projectIdOrKey") @NotNull String projectIdOrKey);

    /**
     * Delete project avatar
     * <p>
     * Deletes a custom avatar from a project. Note that system avatars cannot be deleted.
     * **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param projectIdOrKey       The project ID or (case-sensitive) key. (required)
     * @param id                   The ID of the avatar. (required)
     */
    @RequestLine("DELETE /rest/api/2/project/{projectIdOrKey}/avatar/{id}")
    @Headers({
        "Accept: application/json"
    })
    void deleteProjectAvatar(@Param("projectIdOrKey") @NotNull String projectIdOrKey, @Param("id") @NotNull Long id);

    /**
     * Delete project property
     * <p>
     * Deletes the [property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties) from a project.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the property.
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param projectIdOrKey       The project ID or project key (case sensitive). (required)
     * @param propertyKey          The project property key. Use [Get project property keys](#api-rest-api-2-project-projectIdOrKey-properties-get) to get a list of all project property keys. (required)
     */
    @RequestLine("DELETE /rest/api/2/project/{projectIdOrKey}/properties/{propertyKey}")
    @Headers({
        "Accept: application/json"
    })
    void deleteProjectProperty(@Param("projectIdOrKey") @NotNull String projectIdOrKey, @Param("propertyKey") @NotNull String propertyKey);

    /**
     * Delete project role
     * <p>
     * Deletes a project role. You must specify a replacement project role if you wish to delete a project role that is in use.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the project role to delete. Use [Get all project roles](#api-rest-api-2-role-get) to get a list of project role IDs. (required)
     * @param swap                 The ID of the project role that will replace the one being deleted. (optional)
     */
    @RequestLine("DELETE /rest/api/2/role/{id}?swap={swap}")
    @Headers({
        "Accept: application/json"
    })
    void deleteProjectRole(@Param("id") @NotNull Long id, @Param("swap") @Nullable Long swap);

    /**
     * Delete default actors from project role
     * <p>
     * Deletes the [default actors](#api-rest-api-2-resolution-get) from a project role. You may delete a group or user, but you cannot delete a group and a user in the same request.
     * Changing a project role's default actors does not affect project role members for projects already created.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the project role. Use [Get all project roles](#api-rest-api-2-role-get) to get a list of project role IDs. (required)
     * @param user                 The user account ID of the user to remove as a default actor. (optional)
     * @param groupId              The group ID of the group to be removed as a default actor. This parameter cannot be used with the {@code group} parameter. (optional)
     * @param group                The group name of the group to be removed as a default actor.This parameter cannot be used with the {@code groupId} parameter. As a group's name can change, use of {@code groupId} is recommended. (optional)
     */
    @RequestLine("DELETE /rest/api/2/role/{id}/actors?user={user}&groupId={groupId}&group={group}")
    @Headers({
        "Accept: application/json"
    })
    ProjectRole deleteProjectRoleActorsFromRole(@Param("id") @NotNull Long id, @Param("user") @Nullable String user, @Param("groupId") @Nullable String groupId, @Param("group") @Nullable String group);

    /**
     * Delete related work
     * <p>
     * Deletes the given related work for the given version.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Resolve issues:* and *Edit issues* [Managing project permissions](https://confluence.atlassian.com/adminjiraserver/managing-project-permissions-938847145.html) for the project that contains the version.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param versionId            The ID of the version that the target related work belongs to. (required)
     * @param relatedWorkId        The ID of the related work to delete. (required)
     */
    @RequestLine("DELETE /rest/api/2/version/{versionId}/relatedwork/{relatedWorkId}")
    @Headers({
        "Accept: application/json"
    })
    void deleteRelatedWork(@Param("versionId") @NotNull String versionId, @Param("relatedWorkId") @NotNull String relatedWorkId);

    /**
     * Delete remote issue link by global ID
     * <p>
     * Deletes the remote issue link from the issue using the link's global ID. Where the global ID includes reserved URL characters these must be escaped in the request. For example, pass {@code system=http://www.mycompany.com/support&amp;id=1} as {@code system%3Dhttp%3A%2F%2Fwww.mycompany.com%2Fsupport%26id%3D1}.
     * This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is implemented, issue-level security permission to view the issue.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     * @param globalId             The global ID of a remote issue link. (required)
     */
    @RequestLine("DELETE /rest/api/2/issue/{issueIdOrKey}/remotelink?globalId={globalId}")
    @Headers({
        "Accept: application/json"
    })
    void deleteRemoteIssueLinkByGlobalId(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @Param("globalId") @NotNull String globalId);

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
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     * @param linkId               The ID of a remote issue link. (required)
     */
    @RequestLine("DELETE /rest/api/2/issue/{issueIdOrKey}/remotelink/{linkId}")
    @Headers({
        "Accept: application/json"
    })
    void deleteRemoteIssueLinkById(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @Param("linkId") @NotNull String linkId);

    /**
     * Delete resolution
     * <p>
     * Deletes an issue resolution.
     * This operation is [asynchronous](#async). Follow the {@code location} link in the response to determine the status of the task and use [Get task](#api-rest-api-2-task-taskId-get) to obtain subsequent updates.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the issue resolution. (required)
     * @param replaceWith          The ID of the issue resolution that will replace the currently selected resolution. (required)
     */
    @RequestLine("DELETE /rest/api/2/resolution/{id}?replaceWith={replaceWith}")
    @Headers({
        "Accept: application/json"
    })
    void deleteResolution(@Param("id") @NotNull String id, @Param("replaceWith") @NotNull String replaceWith);

    /**
     * Delete screen
     * <p>
     * Deletes a screen. A screen cannot be deleted if it is used in a screen scheme, workflow, or workflow draft.
     * Only screens used in classic projects can be deleted.
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param screenId             The ID of the screen. (required)
     */
    @RequestLine("DELETE /rest/api/2/screens/{screenId}")
    @Headers({
        "Accept: application/json"
    })
    void deleteScreen(@Param("screenId") @NotNull Long screenId);

    /**
     * Delete screen scheme
     * <p>
     * Deletes a screen scheme. A screen scheme cannot be deleted if it is used in an issue type screen scheme.
     * Only screens schemes used in classic projects can be deleted.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param screenSchemeId       The ID of the screen scheme. (required)
     */
    @RequestLine("DELETE /rest/api/2/screenscheme/{screenSchemeId}")
    @Headers({
        "Accept: application/json"
    })
    void deleteScreenScheme(@Param("screenSchemeId") @NotNull String screenSchemeId);

    /**
     * Delete screen tab
     * <p>
     * Deletes a screen tab.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param screenId             The ID of the screen. (required)
     * @param tabId                The ID of the screen tab. (required)
     */
    @RequestLine("DELETE /rest/api/2/screens/{screenId}/tabs/{tabId}")
    @Headers({
        "Accept: application/json"
    })
    void deleteScreenTab(@Param("screenId") @NotNull Long screenId, @Param("tabId") @NotNull Long tabId);

    /**
     * Delete issue security scheme
     * <p>
     * Deletes an issue security scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param schemeId             The ID of the issue security scheme. (required)
     */
    @RequestLine("DELETE /rest/api/2/issuesecurityschemes/{schemeId}")
    @Headers({
        "Accept: application/json"
    })
    Object deleteSecurityScheme(@Param("schemeId") @NotNull String schemeId);

    /**
     * Delete share permission
     * <p>
     * Deletes a share permission from a filter.
     * **[Permissions](#permissions) required:** Permission to access Jira and the user must own the filter.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param id                   The ID of the filter. (required)
     * @param permissionId         The ID of the share permission. (required)
     */
    @RequestLine("DELETE /rest/api/2/filter/{id}/permission/{permissionId}")
    @Headers({
        "Accept: application/json"
    })
    void deleteSharePermission(@Param("id") @NotNull Long id, @Param("permissionId") @NotNull Long permissionId);

    /**
     * Bulk delete Statuses
     * <p>
     * Deletes statuses by ID.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)
     * *
     * *Administer Jira* [project permission.](https://confluence.atlassian.com/x/yodKLg)
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The list of status IDs. To include multiple IDs, provide an ampersand-separated list. For example, id=10000&amp;id=10001.  Min items {@code 1}, Max items {@code 50} (optional)
     */
    @RequestLine("DELETE /rest/api/2/statuses?id={id}")
    @Headers({
        "Accept: application/json"
    })
    Object deleteStatusesById(@Param("id") @Nullable List<String> id);

    /**
     * Delete UI modification
     * <p>
     * Deletes a UI modification. All the contexts that belong to the UI modification are deleted too. UI modification can only be deleted by Forge apps.
     * **[Permissions](#permissions) required:** None.
     *
     * @param uiModificationId     The ID of the UI modification. (required)
     */
    @RequestLine("DELETE /rest/api/2/uiModifications/{uiModificationId}")
    @Headers({
        "Accept: application/json"
    })
    Object deleteUiModification(@Param("uiModificationId") @NotNull String uiModificationId);

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
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param propertyKey          The key of the user's property. (required)
     * @param accountId            The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. (optional)
     * @param userKey              This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param username             This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     */
    @RequestLine("DELETE /rest/api/2/user/properties/{propertyKey}?accountId={accountId}&userKey={userKey}&username={username}")
    @Headers({
        "Accept: application/json"
    })
    void deleteUserProperty(@Param("propertyKey") @NotNull String propertyKey, @Param("accountId") @Nullable String accountId, @Param("userKey") @Nullable String userKey, @Param("username") @Nullable String username);

    /**
     * Delete version
     * <p>
     * Deletes a project version.
     * Deprecated, use [ Delete and replace version](#api-rest-api-2-version-id-removeAndSwap-post) that supports swapping version values in custom fields, in addition to the swapping for {@code fixVersion} and {@code affectedVersion} provided in this resource.
     * Alternative versions can be provided to update issues that use the deleted version in {@code fixVersion} or {@code affectedVersion}. If alternatives are not provided, occurrences of {@code fixVersion} and {@code affectedVersion} that contain the deleted version are cleared.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that contains the version.
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param id                   The ID of the version. (required)
     * @param moveFixIssuesTo      The ID of the version to update {@code fixVersion} to when the field contains the deleted version. The replacement version must be in the same project as the version being deleted and cannot be the version being deleted. (optional)
     * @param moveAffectedIssuesTo The ID of the version to update {@code affectedVersion} to when the field contains the deleted version. The replacement version must be in the same project as the version being deleted and cannot be the version being deleted. (optional)
     * @deprecated
     */
    @Deprecated
    @RequestLine("DELETE /rest/api/2/version/{id}?moveFixIssuesTo={moveFixIssuesTo}&moveAffectedIssuesTo={moveAffectedIssuesTo}")
    @Headers({
        "Accept: application/json"
    })
    void deleteVersion(@Param("id") @NotNull String id, @Param("moveFixIssuesTo") @Nullable String moveFixIssuesTo, @Param("moveAffectedIssuesTo") @Nullable String moveAffectedIssuesTo);

    /**
     * Delete webhooks by ID
     * <p>
     * Removes webhooks by ID. Only webhooks registered by the calling app are removed. If webhooks created by other apps are specified, they are ignored.
     * **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/#connect-apps) and [OAuth 2.0](https://developer.atlassian.com/cloud/jira/platform/oauth-2-3lo-apps) apps can use this operation.
     *
     * Authentication - Required Scopes: [read:jira-work, manage:jira-webhook]
     * @param containerForWebhookIDs  (required)
     */
    @RequestLine("DELETE /rest/api/2/webhook")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    void deleteWebhookById(@NotNull ContainerForWebhookIDs containerForWebhookIDs);

    /**
     * Delete issue types for workflow in workflow scheme
     * <p>
     * Deletes the workflow-issue type mapping for a workflow in a workflow scheme.
     * Note that active workflow schemes cannot be edited. If the workflow scheme is active, set {@code updateDraftIfNeeded} to {@code true} and a draft workflow scheme is created or updated with the workflow-issue type mapping deleted. The draft workflow scheme can be published in Jira.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the workflow scheme. (required)
     * @param workflowName         The name of the workflow. (required)
     * @param updateDraftIfNeeded  Set to true to create or update the draft of a workflow scheme and delete the mapping from the draft, when the workflow scheme cannot be edited. Defaults to {@code false}. (optional)
     */
    @RequestLine("DELETE /rest/api/2/workflowscheme/{id}/workflow?workflowName={workflowName}&updateDraftIfNeeded={updateDraftIfNeeded}")
    @Headers({
        "Accept: application/json"
    })
    void deleteWorkflowMapping(@Param("id") @NotNull Long id, @Param("workflowName") @NotNull String workflowName, @Param("updateDraftIfNeeded") @Nullable Boolean updateDraftIfNeeded);

    /**
     * Delete workflow scheme
     * <p>
     * Deletes a workflow scheme. Note that a workflow scheme cannot be deleted if it is active (that is, being used by at least one project).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the workflow scheme. Find this ID by editing the desired workflow scheme in Jira. The ID is shown in the URL as {@code schemeId}. For example, *schemeId=10301*. (required)
     */
    @RequestLine("DELETE /rest/api/2/workflowscheme/{id}")
    @Headers({
        "Accept: application/json"
    })
    Object deleteWorkflowScheme(@Param("id") @NotNull Long id);

    /**
     * Delete draft workflow scheme
     * <p>
     * Deletes a draft workflow scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the active workflow scheme that the draft was created from. (required)
     */
    @RequestLine("DELETE /rest/api/2/workflowscheme/{id}/draft")
    @Headers({
        "Accept: application/json"
    })
    void deleteWorkflowSchemeDraft(@Param("id") @NotNull Long id);

    /**
     * Delete workflow for issue type in draft workflow scheme
     * <p>
     * Deletes the issue type-workflow mapping for an issue type in a workflow scheme's draft.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the workflow scheme that the draft belongs to. (required)
     * @param issueType            The ID of the issue type. (required)
     */
    @RequestLine("DELETE /rest/api/2/workflowscheme/{id}/draft/issuetype/{issueType}")
    @Headers({
        "Accept: application/json"
    })
    WorkflowScheme deleteWorkflowSchemeDraftIssueType(@Param("id") @NotNull Long id, @Param("issueType") @NotNull String issueType);

    /**
     * Delete workflow for issue type in workflow scheme
     * <p>
     * Deletes the issue type-workflow mapping for an issue type in a workflow scheme.
     * Note that active workflow schemes cannot be edited. If the workflow scheme is active, set {@code updateDraftIfNeeded} to {@code true} and a draft workflow scheme is created or updated with the issue type-workflow mapping deleted. The draft workflow scheme can be published in Jira.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the workflow scheme. (required)
     * @param issueType            The ID of the issue type. (required)
     * @param updateDraftIfNeeded  Set to true to create or update the draft of a workflow scheme and update the mapping in the draft, when the workflow scheme cannot be edited. Defaults to {@code false}. (optional)
     */
    @RequestLine("DELETE /rest/api/2/workflowscheme/{id}/issuetype/{issueType}?updateDraftIfNeeded={updateDraftIfNeeded}")
    @Headers({
        "Accept: application/json"
    })
    WorkflowScheme deleteWorkflowSchemeIssueType(@Param("id") @NotNull Long id, @Param("issueType") @NotNull String issueType, @Param("updateDraftIfNeeded") @Nullable Boolean updateDraftIfNeeded);

    /**
     * Delete workflow transition property
     * <p>
     * Deletes a property from a workflow transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param transitionId         The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition. (required)
     * @param key                  The name of the transition property to delete, also known as the name of the property. (required)
     * @param workflowName         The name of the workflow that the transition belongs to. (required)
     * @param workflowMode         The workflow status. Set to {@code live} for inactive workflows or {@code draft} for draft workflows. Active workflows cannot be edited. (optional)
     */
    @RequestLine("DELETE /rest/api/2/workflow/transitions/{transitionId}/properties?key={key}&workflowName={workflowName}&workflowMode={workflowMode}")
    @Headers({
        "Accept: application/json"
    })
    void deleteWorkflowTransitionProperty(@Param("transitionId") @NotNull Long transitionId, @Param("key") @NotNull String key, @Param("workflowName") @NotNull String workflowName, @Param("workflowMode") @Nullable String workflowMode);

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
     *
     * @param workflowsWithTransitionRulesDetails  (required)
     */
    @RequestLine("PUT /rest/api/2/workflow/rule/config/delete")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    WorkflowTransitionRulesUpdateErrors deleteWorkflowTransitionRuleConfigurations(@NotNull WorkflowsWithTransitionRulesDetails workflowsWithTransitionRulesDetails);

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
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     * @param id                   The ID of the worklog. (required)
     * @param notifyUsers          Whether users watching the issue are notified by email. (optional, defaults to true)
     * @param adjustEstimate       Defines how to update the issue's time estimate, the options are:   *  {@code new} Sets the estimate to a specific value, defined in {@code newEstimate}.  *  {@code leave} Leaves the estimate unchanged.  *  {@code manual} Increases the estimate by amount specified in {@code increaseBy}.  *  {@code auto} Reduces the estimate by the value of {@code timeSpent} in the worklog. (optional, defaults to auto)
     * @param newEstimate          The value to set as the issue's remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when {@code adjustEstimate} is {@code new}. (optional)
     * @param increaseBy           The amount to increase the issue's remaining estimate by, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when {@code adjustEstimate} is {@code manual}. (optional)
     * @param overrideEditableFlag Whether the work log entry should be added to the issue even if the issue is not editable, because jira.issue.editable set to false or missing. For example, the issue is closed. Connect and Forge app users with admin permission can use this flag. (optional, defaults to false)
     */
    @RequestLine("DELETE /rest/api/2/issue/{issueIdOrKey}/worklog/{id}?notifyUsers={notifyUsers}&adjustEstimate={adjustEstimate}&newEstimate={newEstimate}&increaseBy={increaseBy}&overrideEditableFlag={overrideEditableFlag}")
    @Headers({
        "Accept: application/json"
    })
    void deleteWorklog(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @Param("id") @NotNull String id, @Param("notifyUsers") @Nullable Boolean notifyUsers, @Param("adjustEstimate") @Nullable String adjustEstimate, @Param("newEstimate") @Nullable String newEstimate, @Param("increaseBy") @Nullable String increaseBy, @Param("overrideEditableFlag") @Nullable Boolean overrideEditableFlag);

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
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     * @param worklogId            The ID of the worklog. (required)
     * @param propertyKey          The key of the property. (required)
     */
    @RequestLine("DELETE /rest/api/2/issue/{issueIdOrKey}/worklog/{worklogId}/properties/{propertyKey}")
    @Headers({
        "Accept: application/json"
    })
    void deleteWorklogProperty(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @Param("worklogId") @NotNull String worklogId, @Param("propertyKey") @NotNull String propertyKey);

    /**
     * Transition issue
     * <p>
     * Performs an issue transition and, if the transition has a screen, updates the fields from the transition screen.
     * sortByCategory To update the fields on the transition screen, specify the fields in the {@code fields} or {@code update} parameters in the request body. Get details about the fields using [ Get transitions](#api-rest-api-2-issue-issueIdOrKey-transitions-get) with the {@code transitions.fields} expand.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* and *Transition issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     * @param issueUpdateDetails    (required)
     */
    @RequestLine("POST /rest/api/2/issue/{issueIdOrKey}/transitions")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object doTransition(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @NotNull IssueUpdateDetails issueUpdateDetails);

    /**
     * Get modules
     * <p>
     * Returns all modules registered dynamically by the calling app.
     * **[Permissions](#permissions) required:** Only Connect apps can make this request.
     *
     */
    @RequestLine("GET /rest/atlassian-connect/1/app/module/dynamic")
    @Headers({
        "Accept: application/json"
    })
    ConnectModules dynamicModulesResourceGetModulesGet();

    /**
     * Register modules
     * <p>
     * Registers a list of modules.
     * **[Permissions](#permissions) required:** Only Connect apps can make this request.
     *
     * @param connectModules        (required)
     */
    @RequestLine("POST /rest/atlassian-connect/1/app/module/dynamic")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    void dynamicModulesResourceRegisterModulesPost(@NotNull ConnectModules connectModules);

    /**
     * Remove modules
     * <p>
     * Remove all or a list of modules registered by the calling app.
     * **[Permissions](#permissions) required:** Only Connect apps can make this request.
     *
     * @param moduleKey            The key of the module to remove. To include multiple module keys, provide multiple copies of this parameter. For example, {@code moduleKey=dynamic-attachment-entity-property&amp;moduleKey=dynamic-select-field}. Nonexistent keys are ignored. (optional)
     */
    @RequestLine("DELETE /rest/atlassian-connect/1/app/module/dynamic?moduleKey={moduleKey}")
    @Headers({
        "Accept: application/json"
    })
    void dynamicModulesResourceRemoveModulesDelete(@Param("moduleKey") @Nullable List<String> moduleKey);

    /**
     * Edit issue
     * <p>
     * Edits an issue. A transition may be applied and issue properties updated as part of the edit.
     * The edits to the issue's fields are defined using {@code update} and {@code fields}. The fields that can be edited are determined using [ Get edit issue metadata](#api-rest-api-2-issue-issueIdOrKey-editmeta-get).
     * The parent field may be set by key or ID. For standard issue types, the parent may be removed by setting {@code update.parent.set.none} to *true*.
     * Connect apps having an app user with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), and Forge apps acting on behalf of users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), can override the screen security configuration using {@code overrideScreenSecurity} and {@code overrideEditableFlag}.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* and *Edit issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     * @param issueUpdateDetails    (required)
     * @param notifyUsers          Whether a notification email about the issue update is sent to all watchers. To disable the notification, administer Jira or administer project permissions are required. If the user doesn't have the necessary permission the request is ignored. (optional, defaults to true)
     * @param overrideScreenSecurity Whether screen security is overridden to enable hidden fields to be edited. Available to Connect app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) and Forge apps acting on behalf of users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). (optional, defaults to false)
     * @param overrideEditableFlag Whether screen security is overridden to enable uneditable fields to be edited. Available to Connect app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) and Forge apps acting on behalf of users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). (optional, defaults to false)
     * @param returnIssue          Whether the response should contain the issue with fields edited in this request. The returned issue will have the same format as in the [Get issue API](#api-rest-api-3-issue-issueidorkey-get). (optional, defaults to false)
     * @param expand               The Get issue API expand parameter to use in the response if the {@code returnIssue} parameter is {@code true}. (optional)
     */
    @RequestLine("PUT /rest/api/2/issue/{issueIdOrKey}?notifyUsers={notifyUsers}&overrideScreenSecurity={overrideScreenSecurity}&overrideEditableFlag={overrideEditableFlag}&returnIssue={returnIssue}&expand={expand}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object editIssue(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @NotNull IssueUpdateDetails issueUpdateDetails, @Param("notifyUsers") @Nullable Boolean notifyUsers, @Param("overrideScreenSecurity") @Nullable Boolean overrideScreenSecurity, @Param("overrideEditableFlag") @Nullable Boolean overrideEditableFlag, @Param("returnIssue") @Nullable Boolean returnIssue, @Param("expand") @Nullable String expand);

    /**
     * Evaluate Jira expression
     * <p>
     * Evaluates a Jira expression and returns its value.
     * This resource can be used to test Jira expressions that you plan to use elsewhere, or to fetch data in a flexible way. Consult the [Jira expressions documentation](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/) for more details.
     * #### Context variables ####
     * The following context variables are available to Jira expressions evaluated by this resource. Their presence depends on various factors; usually you need to manually request them in the context object sent in the payload, but some of them are added automatically under certain conditions.
     *  *
     * {@code user} ([User](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#user)): The current user. Always available and equal to {@code null} if the request is anonymous.
     * *
     * {@code app} ([App](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#app)): The [Connect app](https://developer.atlassian.com/cloud/jira/platform/index/#connect-apps) that made the request. Available only for authenticated requests made by Connect Apps (read more here: [Authentication for Connect apps](https://developer.atlassian.com/cloud/jira/platform/security-for-connect-apps/)).
     * *
     * {@code issue} ([Issue](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#issue)): The current issue. Available only when the issue is provided in the request context object.
     * *
     * {@code issues} ([List](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#list) of [Issues](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#issue)): A collection of issues matching a JQL query. Available only when JQL is provided in the request context object.
     * *
     * {@code project} ([Project](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#project)): The current project. Available only when the project is provided in the request context object.
     * *
     * {@code sprint} ([Sprint](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#sprint)): The current sprint. Available only when the sprint is provided in the request context object.
     * *
     * {@code board} ([Board](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#board)): The current board. Available only when the board is provided in the request context object.
     * *
     * {@code serviceDesk} ([ServiceDesk](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#servicedesk)): The current service desk. Available only when the service desk is provided in the request context object.
     * *
     * {@code customerRequest} ([CustomerRequest](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#customerrequest)): The current customer request. Available only when the customer request is provided in the request context object.
     * Also, custom context variables can be passed in the request with their types. Those variables can be accessed by key in the Jira expression. These variable types are available for use in a custom context:
     *  *
     * {@code user}: A [user](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#user) specified as an Atlassian account ID.
     * *
     * {@code issue}: An [issue](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#issue) specified by ID or key. All the fields of the issue object are available in the Jira expression.
     * *
     * {@code json}: A JSON object containing custom content.
     * *
     * {@code list}: A JSON list of {@code user}, {@code issue}, or {@code json} variable types.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required**: None. However, an expression may return different results for different users depending on their permissions. For example, different users may see different comments on the same issue.
     *  Permission to access Jira Software is required to access Jira Software context variables ({@code board} and {@code sprint}) or fields (for example, {@code issue.sprint}).
     *
     * Authentication - Required Scopes: [read:jira-work, read:jira-user]
     * @param jiraExpressionEvalRequestBean The Jira expression and the evaluation context. (required)
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts {@code meta.complexity} that returns information about the expression complexity. For example, the number of expensive operations used by the expression and how close the expression is to reaching the [complexity limit](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#restrictions). Useful when designing and debugging your expressions. (optional)
     */
    @RequestLine("POST /rest/api/2/expression/eval?expand={expand}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    JiraExpressionResult evaluateJiraExpression(@NotNull JiraExpressionEvalRequestBean jiraExpressionEvalRequestBean, @Param("expand") @Nullable String expand);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param id                   The ID of the attachment. (required)
     */
    @RequestLine("GET /rest/api/2/attachment/{id}/expand/human")
    @Headers({
        "Accept: application/json"
    })
    AttachmentArchiveMetadataReadable expandAttachmentForHumans(@Param("id") @NotNull String id);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param id                   The ID of the attachment. (required)
     */
    @RequestLine("GET /rest/api/2/attachment/{id}/expand/raw")
    @Headers({
        "Accept: application/json"
    })
    AttachmentArchiveImpl expandAttachmentForMachines(@Param("id") @NotNull String id);

    /**
     * Export archived issue(s)
     * <p>
     * Enables admins to retrieve details of all archived issues. Upon a successful request, the admin who submitted it will receive an email with a link to download a CSV file with the issue details.
     * Note that this API only exports the values of system fields and archival-specific fields ({@code ArchivedBy} and {@code ArchivedDate}). Custom fields aren't supported.
     * **[Permissions](#permissions) required:** Jira admin or site admin: [global permission](https://confluence.atlassian.com/x/x4dKLg)
     * **License required:** Premium or Enterprise
     * **Signed-in users only:** This API can't be accessed anonymously.
     * **Rate limiting:** Only a single request can be active at any given time.
     * 
     *  
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param archivedIssuesFilterRequest You can filter the issues in your request by the {@code projects}, {@code archivedBy}, {@code archivedDate}, {@code issueTypes}, and {@code reporters} fields. All filters are optional. If you don't provide any filters, you'll get a list of up to one million archived issues. (required)
     */
    @RequestLine("PUT /rest/api/2/issues/archive/export")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    ExportArchivedIssuesTaskProgressResponse exportArchivedIssues(@NotNull ArchivedIssuesFilterRequest archivedIssuesFilterRequest);

    /**
     * Find users assignable to issues
     * <p>
     * Returns a list of users that can be assigned to an issue. Use this operation to find the list of users who can be assigned to:
     *  *
     * a new issue, by providing the {@code projectKeyOrId}.
     * *
     * an updated issue, by providing the {@code issueKey}.
     * *
     * to an issue during a transition (workflow action), by providing the {@code issueKey} and the transition id in {@code actionDescriptorId}. You can obtain the IDs of an issue's valid transitions using the {@code transitions} option in the {@code expand} parameter of [ Get issue](#api-rest-api-2-issue-issueIdOrKey-get).
     * In all these cases, you can pass an account ID to determine if a user can be assigned to an issue. The user is returned in the response if they can be assigned to the issue or issue transition.
     * This operation takes the users in the range defined by {@code startAt} and {@code maxResults}, up to the thousandth user, and then returns only the users from that range that can be assigned the issue. This means the operation usually returns fewer users than specified in {@code maxResults}. To get all the users who can be assigned the issue, use [Get all users](#api-rest-api-2-users-search-get) and filter the records in your code.
     * Privacy controls are applied to the response based on the users' preferences. This could mean, for example, that the user's email address is hidden. See the [Profile visibility overview](https://developer.atlassian.com/cloud/jira/platform/profile-visibility/) for more details.
     * **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Assign issues* [project permission](https://confluence.atlassian.com/x/yodKLg)
     *
     * Authentication - Required Scopes: [read:jira-user]
     * @param query                A query string that is matched against user attributes, such as {@code displayName}, and {@code emailAddress}, to find relevant users. The string can match the prefix of the attribute's value. For example, *query=john* matches a user with a {@code displayName} of *John Smith* and a user with an {@code emailAddress} of *johnson@example.com*. Required, unless {@code username} or {@code accountId} is specified. (optional)
     * @param sessionId            The sessionId of this request. SessionId is the same until the assignee is set. (optional)
     * @param username             This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param accountId            A query string that is matched exactly against user {@code accountId}. Required, unless {@code query} is specified. (optional)
     * @param project              The project ID or project key (case sensitive). Required, unless {@code issueKey} is specified. (optional)
     * @param issueKey             The key of the issue. Required, unless {@code project} is specified. (optional)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return. This operation may return less than the maximum number of items even if more are available. The operation fetches users up to the maximum and then, from the fetched users, returns only the users that can be assigned to the issue. (optional, defaults to 50)
     * @param actionDescriptorId   The ID of the transition. (optional)
     * @param recommend             (optional, defaults to false)
     */
    @RequestLine("GET /rest/api/2/user/assignable/search?query={query}&sessionId={sessionId}&username={username}&accountId={accountId}&project={project}&issueKey={issueKey}&startAt={startAt}&maxResults={maxResults}&actionDescriptorId={actionDescriptorId}&recommend={recommend}")
    @Headers({
        "Accept: application/json"
    })
    List<User> findAssignableUsers(@Param("query") @Nullable String query, @Param("sessionId") @Nullable String sessionId, @Param("username") @Nullable String username, @Param("accountId") @Nullable String accountId, @Param("project") @Nullable String project, @Param("issueKey") @Nullable String issueKey, @Param("startAt") @Nullable Integer startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("actionDescriptorId") @Nullable Integer actionDescriptorId, @Param("recommend") @Nullable Boolean recommend);

    /**
     * Find users assignable to projects
     * <p>
     * Returns a list of users who can be assigned issues in one or more projects. The list may be restricted to users whose attributes match a string.
     * This operation takes the users in the range defined by {@code startAt} and {@code maxResults}, up to the thousandth user, and then returns only the users from that range that can be assigned issues in the projects. This means the operation usually returns fewer users than specified in {@code maxResults}. To get all the users who can be assigned issues in the projects, use [Get all users](#api-rest-api-2-users-search-get) and filter the records in your code.
     * Privacy controls are applied to the response based on the users' preferences. This could mean, for example, that the user's email address is hidden. See the [Profile visibility overview](https://developer.atlassian.com/cloud/jira/platform/profile-visibility/) for more details.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     *
     * Authentication - Required Scopes: [read:jira-user]
     * @param projectKeys          A list of project keys (case sensitive). This parameter accepts a comma-separated list. (required)
     * @param query                A query string that is matched against user attributes, such as {@code displayName} and {@code emailAddress}, to find relevant users. The string can match the prefix of the attribute's value. For example, *query=john* matches a user with a {@code displayName} of *John Smith* and a user with an {@code emailAddress} of *johnson@example.com*. Required, unless {@code accountId} is specified. (optional)
     * @param username             This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param accountId            A query string that is matched exactly against user {@code accountId}. Required, unless {@code query} is specified. (optional)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     */
    @RequestLine("GET /rest/api/2/user/assignable/multiProjectSearch?query={query}&username={username}&accountId={accountId}&projectKeys={projectKeys}&startAt={startAt}&maxResults={maxResults}")
    @Headers({
        "Accept: application/json"
    })
    List<User> findBulkAssignableUsers(@Param("projectKeys") @NotNull String projectKeys, @Param("query") @Nullable String query, @Param("username") @Nullable String username, @Param("accountId") @Nullable String accountId, @Param("startAt") @Nullable Integer startAt, @Param("maxResults") @Nullable Integer maxResults);

    /**
     * Find groups
     * <p>
     * Returns a list of groups whose names contain a query string. A list of group names can be provided to exclude groups from the results.
     * The primary use case for this resource is to populate a group picker suggestions list. To this end, the returned object includes the {@code html} field where the matched query term is highlighted in the group name with the HTML strong tag. Also, the groups list is wrapped in a response object that contains a header for use in the picker, specifically *Showing X of Y matching groups*.
     * The list returns with the groups sorted. If no groups match the list criteria, an empty list is returned.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg). Anonymous calls and calls by users without the required permission return an empty list.
     * *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg). Without this permission, calls where query is not an exact match to an existing group will return an empty list.
     *
     * Authentication - Required Scopes: [read:jira-user]
     * @param accountId            This parameter is deprecated, setting it does not affect the results. To find groups containing a particular user, use [Get user groups](#api-rest-api-2-user-groups-get). (optional)
     * @param query                The string to find in group names. (optional)
     * @param exclude              As a group's name can change, use of {@code excludeGroupIds} is recommended to identify a group.   A group to exclude from the result. To exclude multiple groups, provide an ampersand-separated list. For example, {@code exclude=group1&amp;exclude=group2}. This parameter cannot be used with the {@code excludeGroupIds} parameter. (optional)
     * @param excludeId            A group ID to exclude from the result. To exclude multiple groups, provide an ampersand-separated list. For example, {@code excludeId=group1-id&amp;excludeId=group2-id}. This parameter cannot be used with the {@code excludeGroups} parameter. (optional)
     * @param maxResults           The maximum number of groups to return. The maximum number of groups that can be returned is limited by the system property {@code jira.ajax.autocomplete.limit}. (optional)
     * @param caseInsensitive      Whether the search for groups should be case insensitive. (optional, defaults to false)
     * @param userName             This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     */
    @RequestLine("GET /rest/api/2/groups/picker?accountId={accountId}&query={query}&exclude={exclude}&excludeId={excludeId}&maxResults={maxResults}&caseInsensitive={caseInsensitive}&userName={userName}")
    @Headers({
        "Accept: application/json"
    })
    FoundGroups findGroups(@Param("accountId") @Nullable String accountId, @Param("query") @Nullable String query, @Param("exclude") @Nullable List<String> exclude, @Param("excludeId") @Nullable List<String> excludeId, @Param("maxResults") @Nullable Integer maxResults, @Param("caseInsensitive") @Nullable Boolean caseInsensitive, @Param("userName") @Nullable String userName);

    /**
     * Find user keys by query
     * <p>
     * Finds users with a structured query and returns a [paginated](#pagination) list of user keys.
     * This operation takes the users in the range defined by {@code startAt} and {@code maxResults}, up to the thousandth user, and then returns only the users from that range that match the structured query. This means the operation usually returns fewer users than specified in {@code maxResults}. To get all the users who match the structured query, use [Get all users](#api-rest-api-2-users-search-get) and filter the records in your code.
     * **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * The query statements are:
     *  *
     * {@code is assignee of PROJ} Returns the users that are assignees of at least one issue in project *PROJ*.
     * *
     * {@code is assignee of (PROJ-1, PROJ-2)} Returns users that are assignees on the issues *PROJ-1* or *PROJ-2*.
     * *
     * {@code is reporter of (PROJ-1, PROJ-2)} Returns users that are reporters on the issues *PROJ-1* or *PROJ-2*.
     * *
     * {@code is watcher of (PROJ-1, PROJ-2)} Returns users that are watchers on the issues *PROJ-1* or *PROJ-2*.
     * *
     * {@code is voter of (PROJ-1, PROJ-2)} Returns users that are voters on the issues *PROJ-1* or *PROJ-2*.
     * *
     * {@code is commenter of (PROJ-1, PROJ-2)} Returns users that have posted a comment on the issues *PROJ-1* or *PROJ-2*.
     * *
     * {@code is transitioner of (PROJ-1, PROJ-2)} Returns users that have performed a transition on issues *PROJ-1* or *PROJ-2*.
     * *
     * {@code [propertyKey].entity.property.path is "property value"} Returns users with the entity property value.
     * The list of issues can be extended as needed, as in *(PROJ-1, PROJ-2, ... PROJ-n)*. Statements can be combined using the {@code AND} and {@code OR} operators to form more complex queries. For example:
     * {@code is assignee of PROJ AND [propertyKey].entity.property.path is "property value"}
     *
     * Authentication - Required Scopes: [read:jira-user]
     * @param query                The search query. (required)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 100)
     */
    @RequestLine("GET /rest/api/2/user/search/query/key?query={query}&startAt={startAt}&maxResults={maxResults}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanUserKey findUserKeysByQuery(@Param("query") @NotNull String query, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults);

    /**
     * Find users
     * <p>
     * Returns a list of active users that match the search string and property.
     * This operation first applies a filter to match the search string and property, and then takes the filtered users in the range defined by {@code startAt} and {@code maxResults}, up to the thousandth user. To get all the users who match the search string and property, use [Get all users](#api-rest-api-2-users-search-get) and filter the records in your code.
     * This operation can be accessed anonymously.
     * Privacy controls are applied to the response based on the users' preferences. This could mean, for example, that the user's email address is hidden. See the [Profile visibility overview](https://developer.atlassian.com/cloud/jira/platform/profile-visibility/) for more details.
     * **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg). Anonymous calls or calls by users without the required permission return empty search results.
     *
     * Authentication - Required Scopes: [read:jira-user]
     * @param query                A query string that is matched against user attributes ( {@code displayName}, and {@code emailAddress}) to find relevant users. The string can match the prefix of the attribute's value. For example, *query=john* matches a user with a {@code displayName} of *John Smith* and a user with an {@code emailAddress} of *johnson@example.com*. Required, unless {@code accountId} or {@code property} is specified. (optional)
     * @param username              (optional)
     * @param accountId            A query string that is matched exactly against a user {@code accountId}. Required, unless {@code query} or {@code property} is specified. (optional)
     * @param startAt              The index of the first item to return in a page of filtered results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     * @param property             A query string used to search properties. Property keys are specified by path, so property keys containing dot (.) or equals (=) characters cannot be used. The query string cannot be specified using a JSON object. Example: To search for the value of {@code nested} from {@code {"something":{"nested":1,"other":2}}} use {@code thepropertykey.something.nested=1}. Required, unless {@code accountId} or {@code query} is specified. (optional)
     */
    @RequestLine("GET /rest/api/2/user/search?query={query}&username={username}&accountId={accountId}&startAt={startAt}&maxResults={maxResults}&property={property}")
    @Headers({
        "Accept: application/json"
    })
    List<User> findUsers(@Param("query") @Nullable String query, @Param("username") @Nullable String username, @Param("accountId") @Nullable String accountId, @Param("startAt") @Nullable Integer startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("property") @Nullable String property);

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
     * The primary use case for this resource is to populate a picker field suggestion list with users or groups. To this end, the returned object includes an {@code html} field for each list. This field highlights the matched query term in the item name with the HTML strong tag. Also, each list is wrapped in a response object that contains a header for use in a picker, specifically *Showing X of Y matching groups*.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/yodKLg).
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param query                The search string. (required)
     * @param maxResults           The maximum number of items to return in each list. (optional, defaults to 50)
     * @param showAvatar           Whether the user avatar should be returned. If an invalid value is provided, the default value is used. (optional, defaults to false)
     * @param fieldId              The custom field ID of the field this request is for. (optional)
     * @param projectId            The ID of a project that returned users and groups must have permission to view. To include multiple projects, provide an ampersand-separated list. For example, {@code projectId=10000&amp;projectId=10001}. This parameter is only used when {@code fieldId} is present. (optional)
     * @param issueTypeId          The ID of an issue type that returned users and groups must have permission to view. To include multiple issue types, provide an ampersand-separated list. For example, {@code issueTypeId=10000&amp;issueTypeId=10001}. Special values, such as {@code -1} (all standard issue types) and {@code -2} (all subtask issue types), are supported. This parameter is only used when {@code fieldId} is present. (optional)
     * @param avatarSize           The size of the avatar to return. If an invalid value is provided, the default value is used. (optional, defaults to xsmall)
     * @param caseInsensitive      Whether the search for groups should be case insensitive. (optional, defaults to false)
     * @param excludeConnectAddons Whether Connect app users and groups should be excluded from the search results. If an invalid value is provided, the default value is used. (optional, defaults to false)
     */
    @RequestLine("GET /rest/api/2/groupuserpicker?query={query}&maxResults={maxResults}&showAvatar={showAvatar}&fieldId={fieldId}&projectId={projectId}&issueTypeId={issueTypeId}&avatarSize={avatarSize}&caseInsensitive={caseInsensitive}&excludeConnectAddons={excludeConnectAddons}")
    @Headers({
        "Accept: application/json"
    })
    FoundUsersAndGroups findUsersAndGroups(@Param("query") @NotNull String query, @Param("maxResults") @Nullable Integer maxResults, @Param("showAvatar") @Nullable Boolean showAvatar, @Param("fieldId") @Nullable String fieldId, @Param("projectId") @Nullable List<String> projectId, @Param("issueTypeId") @Nullable List<String> issueTypeId, @Param("avatarSize") @Nullable String avatarSize, @Param("caseInsensitive") @Nullable Boolean caseInsensitive, @Param("excludeConnectAddons") @Nullable Boolean excludeConnectAddons);

    /**
     * Find users by query
     * <p>
     * Finds users with a structured query and returns a [paginated](#pagination) list of user details.
     * This operation takes the users in the range defined by {@code startAt} and {@code maxResults}, up to the thousandth user, and then returns only the users from that range that match the structured query. This means the operation usually returns fewer users than specified in {@code maxResults}. To get all the users who match the structured query, use [Get all users](#api-rest-api-2-users-search-get) and filter the records in your code.
     * **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * The query statements are:
     *  *
     * {@code is assignee of PROJ} Returns the users that are assignees of at least one issue in project *PROJ*.
     * *
     * {@code is assignee of (PROJ-1, PROJ-2)} Returns users that are assignees on the issues *PROJ-1* or *PROJ-2*.
     * *
     * {@code is reporter of (PROJ-1, PROJ-2)} Returns users that are reporters on the issues *PROJ-1* or *PROJ-2*.
     * *
     * {@code is watcher of (PROJ-1, PROJ-2)} Returns users that are watchers on the issues *PROJ-1* or *PROJ-2*.
     * *
     * {@code is voter of (PROJ-1, PROJ-2)} Returns users that are voters on the issues *PROJ-1* or *PROJ-2*.
     * *
     * {@code is commenter of (PROJ-1, PROJ-2)} Returns users that have posted a comment on the issues *PROJ-1* or *PROJ-2*.
     * *
     * {@code is transitioner of (PROJ-1, PROJ-2)} Returns users that have performed a transition on issues *PROJ-1* or *PROJ-2*.
     * *
     * {@code [propertyKey].entity.property.path is "property value"} Returns users with the entity property value.
     * The list of issues can be extended as needed, as in *(PROJ-1, PROJ-2, ... PROJ-n)*. Statements can be combined using the {@code AND} and {@code OR} operators to form more complex queries. For example:
     * {@code is assignee of PROJ AND [propertyKey].entity.property.path is "property value"}
     *
     * Authentication - Required Scopes: [read:jira-user]
     * @param query                The search query. (required)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 100)
     */
    @RequestLine("GET /rest/api/2/user/search/query?query={query}&startAt={startAt}&maxResults={maxResults}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanUser findUsersByQuery(@Param("query") @NotNull String query, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults);

    /**
     * Find users for picker
     * <p>
     * Returns a list of users whose attributes match the query term. The returned object includes the {@code html} field where the matched query term is highlighted with the HTML strong tag. A list of account IDs can be provided to exclude users from the results.
     * This operation takes the users in the range defined by {@code maxResults}, up to the thousandth user, and then returns only the users from that range that match the query term. This means the operation usually returns fewer users than specified in {@code maxResults}. To get all the users who match the query term, use [Get all users](#api-rest-api-2-users-search-get) and filter the records in your code.
     * Privacy controls are applied to the response based on the users' preferences. This could mean, for example, that the user's email address is hidden. See the [Profile visibility overview](https://developer.atlassian.com/cloud/jira/platform/profile-visibility/) for more details.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg). Anonymous calls and calls by users without the required permission return search results for an exact name match only.
     *
     * Authentication - Required Scopes: [read:jira-user]
     * @param query                A query string that is matched against user attributes, such as {@code displayName}, and {@code emailAddress}, to find relevant users. The string can match the prefix of the attribute's value. For example, *query=john* matches a user with a {@code displayName} of *John Smith* and a user with an {@code emailAddress} of *johnson@example.com*. (required)
     * @param maxResults           The maximum number of items to return. The total number of matched users is returned in {@code total}. (optional, defaults to 50)
     * @param showAvatar           Include the URI to the user's avatar. (optional, defaults to false)
     * @param exclude              This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param excludeAccountIds    A list of account IDs to exclude from the search results. This parameter accepts a comma-separated list. Multiple account IDs can also be provided using an ampersand-separated list. For example, {@code excludeAccountIds=5b10a2844c20165700ede21g,5b10a0effa615349cb016cd8&amp;excludeAccountIds=5b10ac8d82e05b22cc7d4ef5}. Cannot be provided with {@code exclude}. (optional)
     * @param avatarSize            (optional)
     * @param excludeConnectUsers   (optional, defaults to false)
     */
    @RequestLine("GET /rest/api/2/user/picker?query={query}&maxResults={maxResults}&showAvatar={showAvatar}&exclude={exclude}&excludeAccountIds={excludeAccountIds}&avatarSize={avatarSize}&excludeConnectUsers={excludeConnectUsers}")
    @Headers({
        "Accept: application/json"
    })
    FoundUsers findUsersForPicker(@Param("query") @NotNull String query, @Param("maxResults") @Nullable Integer maxResults, @Param("showAvatar") @Nullable Boolean showAvatar, @Param("exclude") @Nullable List<String> exclude, @Param("excludeAccountIds") @Nullable List<String> excludeAccountIds, @Param("avatarSize") @Nullable String avatarSize, @Param("excludeConnectUsers") @Nullable Boolean excludeConnectUsers);

    /**
     * Find users with permissions
     * <p>
     * Returns a list of users who fulfill these criteria:
     *  *
     * their user attributes match a search string.
     * *
     * they have a set of permissions for a project or issue.
     * If no search string is provided, a list of all users with the permissions is returned.
     * This operation takes the users in the range defined by {@code startAt} and {@code maxResults}, up to the thousandth user, and then returns only the users from that range that match the search string and have permission for the project or issue. This means the operation usually returns fewer users than specified in {@code maxResults}. To get all the users who match the search string and have permission for the project or issue, use [Get all users](#api-rest-api-2-users-search-get) and filter the records in your code.
     * Privacy controls are applied to the response based on the users' preferences. This could mean, for example, that the user's email address is hidden. See the [Profile visibility overview](https://developer.atlassian.com/cloud/jira/platform/profile-visibility/) for more details.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to get users for any project.
     * *
     * *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project, to get users for that project.
     *
     * Authentication - Required Scopes: [read:jira-user]
     * @param permissions          A comma separated list of permissions. Permissions can be specified as any:   *  permission returned by [Get all permissions](#api-rest-api-2-permissions-get).  *  custom project permission added by Connect apps.  *  (deprecated) one of the following:           *  ASSIGNABLE\\_USER      *  ASSIGN\\_ISSUE      *  ATTACHMENT\\_DELETE\\_ALL      *  ATTACHMENT\\_DELETE\\_OWN      *  BROWSE      *  CLOSE\\_ISSUE      *  COMMENT\\_DELETE\\_ALL      *  COMMENT\\_DELETE\\_OWN      *  COMMENT\\_EDIT\\_ALL      *  COMMENT\\_EDIT\\_OWN      *  COMMENT\\_ISSUE      *  CREATE\\_ATTACHMENT      *  CREATE\\_ISSUE      *  DELETE\\_ISSUE      *  EDIT\\_ISSUE      *  LINK\\_ISSUE      *  MANAGE\\_WATCHER\\_LIST      *  MODIFY\\_REPORTER      *  MOVE\\_ISSUE      *  PROJECT\\_ADMIN      *  RESOLVE\\_ISSUE      *  SCHEDULE\\_ISSUE      *  SET\\_ISSUE\\_SECURITY      *  TRANSITION\\_ISSUE      *  VIEW\\_VERSION\\_CONTROL      *  VIEW\\_VOTERS\\_AND\\_WATCHERS      *  VIEW\\_WORKFLOW\\_READONLY      *  WORKLOG\\_DELETE\\_ALL      *  WORKLOG\\_DELETE\\_OWN      *  WORKLOG\\_EDIT\\_ALL      *  WORKLOG\\_EDIT\\_OWN      *  WORK\\_ISSUE (required)
     * @param query                A query string that is matched against user attributes, such as {@code displayName} and {@code emailAddress}, to find relevant users. The string can match the prefix of the attribute's value. For example, *query=john* matches a user with a {@code displayName} of *John Smith* and a user with an {@code emailAddress} of *johnson@example.com*. Required, unless {@code accountId} is specified. (optional)
     * @param username             This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param accountId            A query string that is matched exactly against user {@code accountId}. Required, unless {@code query} is specified. (optional)
     * @param issueKey             The issue key for the issue. (optional)
     * @param projectKey           The project key for the project (case sensitive). (optional)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     */
    @RequestLine("GET /rest/api/2/user/permission/search?query={query}&username={username}&accountId={accountId}&permissions={permissions}&issueKey={issueKey}&projectKey={projectKey}&startAt={startAt}&maxResults={maxResults}")
    @Headers({
        "Accept: application/json"
    })
    List<User> findUsersWithAllPermissions(@Param("permissions") @NotNull String permissions, @Param("query") @Nullable String query, @Param("username") @Nullable String username, @Param("accountId") @Nullable String accountId, @Param("issueKey") @Nullable String issueKey, @Param("projectKey") @Nullable String projectKey, @Param("startAt") @Nullable Integer startAt, @Param("maxResults") @Nullable Integer maxResults);

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
     * an issue, by providing the {@code issueKey}.
     * *
     * any issue in a project, by providing the {@code projectKey}.
     * This operation takes the users in the range defined by {@code startAt} and {@code maxResults}, up to the thousandth user, and then returns only the users from that range that match the search string and have permission to browse issues. This means the operation usually returns fewer users than specified in {@code maxResults}. To get all the users who match the search string and have permission to browse issues, use [Get all users](#api-rest-api-2-users-search-get) and filter the records in your code.
     * Privacy controls are applied to the response based on the users' preferences. This could mean, for example, that the user's email address is hidden. See the [Profile visibility overview](https://developer.atlassian.com/cloud/jira/platform/profile-visibility/) for more details.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg). Anonymous calls and calls by users without the required permission return empty search results.
     *
     * Authentication - Required Scopes: [read:jira-user]
     * @param query                A query string that is matched against user attributes, such as {@code displayName} and {@code emailAddress}, to find relevant users. The string can match the prefix of the attribute's value. For example, *query=john* matches a user with a {@code displayName} of *John Smith* and a user with an {@code emailAddress} of *johnson@example.com*. Required, unless {@code accountId} is specified. (optional)
     * @param username             This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param accountId            A query string that is matched exactly against user {@code accountId}. Required, unless {@code query} is specified. (optional)
     * @param issueKey             The issue key for the issue. Required, unless {@code projectKey} is specified. (optional)
     * @param projectKey           The project key for the project (case sensitive). Required, unless {@code issueKey} is specified. (optional)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     */
    @RequestLine("GET /rest/api/2/user/viewissue/search?query={query}&username={username}&accountId={accountId}&issueKey={issueKey}&projectKey={projectKey}&startAt={startAt}&maxResults={maxResults}")
    @Headers({
        "Accept: application/json"
    })
    List<User> findUsersWithBrowsePermission(@Param("query") @Nullable String query, @Param("username") @Nullable String username, @Param("accountId") @Nullable String accountId, @Param("issueKey") @Nullable String issueKey, @Param("projectKey") @Nullable String projectKey, @Param("startAt") @Nullable Integer startAt, @Param("maxResults") @Nullable Integer maxResults);

    /**
     * Fully update project role
     * <p>
     * Updates the project role's name and description. You must include both a name and a description in the request.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the project role. Use [Get all project roles](#api-rest-api-2-role-get) to get a list of project role IDs. (required)
     * @param createUpdateRoleRequestBean  (required)
     */
    @RequestLine("PUT /rest/api/2/role/{id}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    ProjectRole fullyUpdateProjectRole(@Param("id") @NotNull Long id, @NotNull CreateUpdateRoleRequestBean createUpdateRoleRequestBean);

    /**
     * Get accessible project type by key
     * <p>
     * Returns a [project type](https://confluence.atlassian.com/x/Var1Nw) if it is accessible to the user.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param projectTypeKey       The key of the project type. (required)
     */
    @RequestLine("GET /rest/api/2/project/type/{projectTypeKey}/accessible")
    @Headers({
        "Accept: application/json"
    })
    ProjectType getAccessibleProjectTypeByKey(@Param("projectTypeKey") @NotNull String projectTypeKey);

    /**
     * Get advanced settings
     * <p>
     * Returns the application properties that are accessible on the *Advanced Settings* page. To navigate to the *Advanced Settings* page in Jira, choose the Jira icon &amp;gt; **Jira settings** &amp;gt; **System**, **General Configuration** and then click **Advanced Settings** (in the upper right).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     */
    @RequestLine("GET /rest/api/2/application-properties/advanced-settings")
    @Headers({
        "Accept: application/json"
    })
    List<ApplicationProperty> getAdvancedSettings();

    /**
     * Get licensed project types
     * <p>
     * Returns all [project types](https://confluence.atlassian.com/x/Var1Nw) with a valid license.
     *
     * Authentication - Required Scopes: [read:jira-work]
     */
    @RequestLine("GET /rest/api/2/project/type/accessible")
    @Headers({
        "Accept: application/json"
    })
    List<ProjectType> getAllAccessibleProjectTypes();

    /**
     * Get all application roles
     * <p>
     * Returns all application roles. In Jira, application roles are managed using the [Application access configuration](https://confluence.atlassian.com/x/3YxjL) page.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     */
    @RequestLine("GET /rest/api/2/applicationrole")
    @Headers({
        "Accept: application/json"
    })
    List<ApplicationRole> getAllApplicationRoles();

    /**
     * Get available gadgets
     * <p>
     * Gets a list of all available gadgets that can be added to all dashboards.
     * **[Permissions](#permissions) required:** None.
     *
     * Authentication - Required Scopes: [read:jira-work]
     */
    @RequestLine("GET /rest/api/2/dashboard/gadgets")
    @Headers({
        "Accept: application/json"
    })
    AvailableDashboardGadgetsResponse getAllAvailableDashboardGadgets();

    /**
     * Get all dashboards
     * <p>
     * Returns a list of dashboards owned by or shared with the user. The list may be filtered to include only favorite or owned dashboards.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param filter               The filter applied to the list of dashboards. Valid values are:   *  {@code favourite} Returns dashboards the user has marked as favorite.  *  {@code my} Returns dashboards owned by the user. (optional)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 20)
     */
    @RequestLine("GET /rest/api/2/dashboard?filter={filter}&startAt={startAt}&maxResults={maxResults}")
    @Headers({
        "Accept: application/json"
    })
    PageOfDashboards getAllDashboards(@Param("filter") @Nullable String filter, @Param("startAt") @Nullable Integer startAt, @Param("maxResults") @Nullable Integer maxResults);

    /**
     * Get all field configuration schemes
     * <p>
     * Returns a [paginated](#pagination) list of field configuration schemes.
     * Only field configuration schemes used in classic projects are returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     * @param id                   The list of field configuration scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, {@code id=10000&amp;id=10001}. (optional)
     */
    @RequestLine("GET /rest/api/2/fieldconfigurationscheme?startAt={startAt}&maxResults={maxResults}&id={id}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanFieldConfigurationScheme getAllFieldConfigurationSchemes(@Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("id") @Nullable Set<Long> id);

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
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     * @param id                   The list of field configuration IDs. To include multiple IDs, provide an ampersand-separated list. For example, {@code id=10000&amp;id=10001}. (optional)
     * @param isDefault            If *true* returns default field configurations only. (optional, defaults to false)
     * @param query                The query string used to match against field configuration names and descriptions. (optional)
     */
    @RequestLine("GET /rest/api/2/fieldconfiguration?startAt={startAt}&maxResults={maxResults}&id={id}&isDefault={isDefault}&query={query}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanFieldConfigurationDetails getAllFieldConfigurations(@Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("id") @Nullable Set<Long> id, @Param("isDefault") @Nullable Boolean isDefault, @Param("query") @Nullable String query);

    /**
     * Get gadgets
     * <p>
     * Returns a list of dashboard gadgets on a dashboard.
     * This operation returns:
     *  *
     * Gadgets from a list of IDs, when {@code id} is set.
     * *
     * Gadgets with a module key, when {@code moduleKey} is set.
     * *
     * Gadgets from a list of URIs, when {@code uri} is set.
     * *
     * All gadgets, when no other parameters are set.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param dashboardId          The ID of the dashboard. (required)
     * @param moduleKey            The list of gadgets module keys. To include multiple module keys, separate module keys with ampersand: {@code moduleKey=key:one&amp;moduleKey=key:two}. (optional)
     * @param uri                  The list of gadgets URIs. To include multiple URIs, separate URIs with ampersand: {@code uri=/rest/example/uri/1&amp;uri=/rest/example/uri/2}. (optional)
     * @param gadgetId             The list of gadgets IDs. To include multiple IDs, separate IDs with ampersand: {@code gadgetId=10000&amp;gadgetId=10001}. (optional)
     */
    @RequestLine("GET /rest/api/2/dashboard/{dashboardId}/gadget?moduleKey={moduleKey}&uri={uri}&gadgetId={gadgetId}")
    @Headers({
        "Accept: application/json"
    })
    DashboardGadgetResponse getAllGadgets(@Param("dashboardId") @NotNull Long dashboardId, @Param("moduleKey") @Nullable List<String> moduleKey, @Param("uri") @Nullable List<String> uri, @Param("gadgetId") @Nullable List<Long> gadgetId);

    /**
     * Get all issue field options
     * <p>
     * Returns a [paginated](#pagination) list of all the options of a select list issue field. A select list issue field is a type of [issue field](https://developer.atlassian.com/cloud/jira/platform/modules/issue-field/) that enables a user to select a value from a list of options.
     * Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param fieldKey             The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the {@code fieldKey} value, do one of the following:   *  open the app's plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the {@code jiraIssueFields} module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-2-field-get) and in the field details the value is returned in {@code key}. For example, {@code "key": "teams-add-on__team-issue-field"} (required)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     */
    @RequestLine("GET /rest/api/2/field/{fieldKey}/option?startAt={startAt}&maxResults={maxResults}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanIssueFieldOption getAllIssueFieldOptions(@Param("fieldKey") @NotNull String fieldKey, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults);

    /**
     * Get all issue type schemes
     * <p>
     * Returns a [paginated](#pagination) list of issue type schemes.
     * Only issue type schemes used in classic projects are returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     * @param id                   The list of issue type schemes IDs. To include multiple IDs, provide an ampersand-separated list. For example, {@code id=10000&amp;id=10001}. (optional)
     * @param orderBy              [Order](#ordering) the results by a field:   *  {@code name} Sorts by issue type scheme name.  *  {@code id} Sorts by issue type scheme ID. (optional, defaults to id)
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code projects} For each issue type schemes, returns information about the projects the issue type scheme is assigned to.  *  {@code issueTypes} For each issue type schemes, returns information about the issueTypes the issue type scheme have. (optional)
     * @param queryString          String used to perform a case-insensitive partial match with issue type scheme name. (optional)
     */
    @RequestLine("GET /rest/api/2/issuetypescheme?startAt={startAt}&maxResults={maxResults}&id={id}&orderBy={orderBy}&expand={expand}&queryString={queryString}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanIssueTypeScheme getAllIssueTypeSchemes(@Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("id") @Nullable Set<Long> id, @Param("orderBy") @Nullable String orderBy, @Param("expand") @Nullable String expand, @Param("queryString") @Nullable String queryString);

    /**
     * Get all labels
     * <p>
     * Returns a [paginated](#pagination) list of labels.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 1000)
     */
    @RequestLine("GET /rest/api/2/label?startAt={startAt}&maxResults={maxResults}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanString getAllLabels(@Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults);

    /**
     * Get all permission schemes
     * <p>
     * Returns all permission schemes.
     * ### About permission schemes and grants ###
     * A permission scheme is a collection of permission grants. A permission grant consists of a {@code holder} and a {@code permission}.
     * #### Holder object ####
     * The {@code holder} object contains information about the user or group being granted the permission. For example, the *Administer projects* permission is granted to a group named *Teams in space administrators*. In this case, the type is {@code "type": "group"}, and the parameter is the group name, {@code "parameter": "Teams in space administrators"} and the value is group ID, {@code "value": "ca85fac0-d974-40ca-a615-7af99c48d24f"}.
     * The {@code holder} object is defined by the following properties:
     *  *
     * {@code type} Identifies the user or group (see the list of types below).
     * *
     * {@code parameter} As a group's name can change, use of {@code value} is recommended. The value of this property depends on the {@code type}. For example, if the {@code type} is a group, then you need to specify the group name.
     * *
     * {@code value} The value of this property depends on the {@code type}. If the {@code type} is a group, then you need to specify the group ID. For other {@code type} it has the same value as {@code parameter}
     * The following {@code types} are available. The expected values for {@code parameter} and {@code value} are given in parentheses (some types may not have a {@code parameter} or {@code value}):
     *  *
     * {@code anyone} Grant for anonymous users.
     * *
     * {@code applicationRole} Grant for users with access to the specified application (application name, application name). See [Update product access settings](https://confluence.atlassian.com/x/3YxjL) for more information.
     * *
     * {@code assignee} Grant for the user currently assigned to an issue.
     * *
     * {@code group} Grant for the specified group ({@code parameter} : group name, {@code value} : group ID).
     * *
     * {@code groupCustomField} Grant for a user in the group selected in the specified custom field ({@code parameter} : custom field ID, {@code value} : custom field ID).
     * *
     * {@code projectLead} Grant for a project lead.
     * *
     * {@code projectRole} Grant for the specified project role ({@code parameter} :project role ID, {@code value} : project role ID).
     * *
     * {@code reporter} Grant for the user who reported the issue.
     * *
     * {@code sd.customer.portal.only} Jira Service Desk only. Grants customers permission to access the customer portal but not Jira. See [Customizing Jira Service Desk permissions](https://confluence.atlassian.com/x/24dKLg) for more information.
     * *
     * {@code user} Grant for the specified user ({@code parameter} : user ID - historically this was the userkey but that is deprecated and the account ID should be used, {@code value} : user ID).
     * *
     * {@code userCustomField} Grant for a user selected in the specified custom field ({@code parameter} : custom field ID, {@code value} : custom field ID).
     * #### Built-in permissions ####
     * The [built-in Jira permissions](https://confluence.atlassian.com/x/yodKLg) are listed below. Apps can also define custom permissions. See the [project permission](https://developer.atlassian.com/cloud/jira/platform/modules/project-permission/) and [global permission](https://developer.atlassian.com/cloud/jira/platform/modules/global-permission/) module documentation for more information.
     * **Project permissions**
     *  *
     * {@code ADMINISTER_PROJECTS}
     * *
     * {@code BROWSE_PROJECTS}
     * *
     * {@code MANAGE_SPRINTS_PERMISSION} (Jira Software only)
     * *
     * {@code SERVICEDESK_AGENT} (Jira Service Desk only)
     * *
     * {@code VIEW_DEV_TOOLS} (Jira Software only)
     * *
     * {@code VIEW_READONLY_WORKFLOW}
     * **Issue permissions**
     *  *
     * {@code ASSIGNABLE_USER}
     * *
     * {@code ASSIGN_ISSUES}
     * *
     * {@code CLOSE_ISSUES}
     * *
     * {@code CREATE_ISSUES}
     * *
     * {@code DELETE_ISSUES}
     * *
     * {@code EDIT_ISSUES}
     * *
     * {@code LINK_ISSUES}
     * *
     * {@code MODIFY_REPORTER}
     * *
     * {@code MOVE_ISSUES}
     * *
     * {@code RESOLVE_ISSUES}
     * *
     * {@code SCHEDULE_ISSUES}
     * *
     * {@code SET_ISSUE_SECURITY}
     * *
     * {@code TRANSITION_ISSUES}
     * **Voters and watchers permissions**
     *  *
     * {@code MANAGE_WATCHERS}
     * *
     * {@code VIEW_VOTERS_AND_WATCHERS}
     * **Comments permissions**
     *  *
     * {@code ADD_COMMENTS}
     * *
     * {@code DELETE_ALL_COMMENTS}
     * *
     * {@code DELETE_OWN_COMMENTS}
     * *
     * {@code EDIT_ALL_COMMENTS}
     * *
     * {@code EDIT_OWN_COMMENTS}
     * **Attachments permissions**
     *  *
     * {@code CREATE_ATTACHMENTS}
     * *
     * {@code DELETE_ALL_ATTACHMENTS}
     * *
     * {@code DELETE_OWN_ATTACHMENTS}
     * **Time tracking permissions**
     *  *
     * {@code DELETE_ALL_WORKLOGS}
     * *
     * {@code DELETE_OWN_WORKLOGS}
     * *
     * {@code EDIT_ALL_WORKLOGS}
     * *
     * {@code EDIT_OWN_WORKLOGS}
     * *
     * {@code WORK_ON_ISSUES}
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param expand               Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are included when you specify any value. Expand options include:   *  {@code all} Returns all expandable information.  *  {@code field} Returns information about the custom field granted the permission.  *  {@code group} Returns information about the group that is granted the permission.  *  {@code permissions} Returns all permission grants for each permission scheme.  *  {@code projectRole} Returns information about the project role granted the permission.  *  {@code user} Returns information about the user who is granted the permission. (optional)
     */
    @RequestLine("GET /rest/api/2/permissionscheme?expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    PermissionSchemes getAllPermissionSchemes(@Param("expand") @Nullable String expand);

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
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     */
    @RequestLine("GET /rest/api/2/permissions")
    @Headers({
        "Accept: application/json"
    })
    Permissions getAllPermissions();

    /**
     * Get all project avatars
     * <p>
     * Returns all project avatars, grouped by system and custom avatars.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param projectIdOrKey       The ID or (case-sensitive) key of the project. (required)
     */
    @RequestLine("GET /rest/api/2/project/{projectIdOrKey}/avatars")
    @Headers({
        "Accept: application/json"
    })
    ProjectAvatars getAllProjectAvatars(@Param("projectIdOrKey") @NotNull String projectIdOrKey);

    /**
     * Get all project categories
     * <p>
     * Returns all project categories.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * Authentication - Required Scopes: [read:jira-work]
     */
    @RequestLine("GET /rest/api/2/projectCategory")
    @Headers({
        "Accept: application/json"
    })
    List<ProjectCategory> getAllProjectCategories();

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
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     */
    @RequestLine("GET /rest/api/2/role")
    @Headers({
        "Accept: application/json"
    })
    List<ProjectRole> getAllProjectRoles();

    /**
     * Get all project types
     * <p>
     * Returns all [project types](https://confluence.atlassian.com/x/Var1Nw), whether or not the instance has a valid license for each type.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     *
     * Authentication - Required Scopes: [read:jira-work]
     */
    @RequestLine("GET /rest/api/2/project/type")
    @Headers({
        "Accept: application/json"
    })
    List<ProjectType> getAllProjectTypes();

    /**
     * Get all projects
     * <p>
     * Returns all projects visible to the user. Deprecated, use [ Get projects paginated](#api-rest-api-2-project-search-get) that supports search and pagination.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** Projects are returned only where the user has *Browse Projects* or *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expanded options include:   *  {@code description} Returns the project description.  *  {@code issueTypes} Returns all issue types associated with the project.  *  {@code lead} Returns information about the project lead.  *  {@code projectKeys} Returns all project keys associated with the project. (optional)
     * @param recent               Returns the user's most recently accessed projects. You may specify the number of results to return up to a maximum of 20. If access is anonymous, then the recently accessed projects are based on the current HTTP session. (optional)
     * @param properties           A list of project properties to return for the project. This parameter accepts a comma-separated list. (optional)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /rest/api/2/project?expand={expand}&recent={recent}&properties={properties}")
    @Headers({
        "Accept: application/json"
    })
    List<Project> getAllProjects(@Param("expand") @Nullable String expand, @Param("recent") @Nullable Integer recent, @Param("properties") @Nullable List<String> properties);

    /**
     * Get all screen tab fields
     * <p>
     * Returns all fields for a screen tab.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * *
     * *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) when the project key is specified, providing that the screen is associated with the project through a Screen Scheme and Issue Type Screen Scheme.
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param screenId             The ID of the screen. (required)
     * @param tabId                The ID of the screen tab. (required)
     * @param projectKey           The key of the project. (optional)
     */
    @RequestLine("GET /rest/api/2/screens/{screenId}/tabs/{tabId}/fields?projectKey={projectKey}")
    @Headers({
        "Accept: application/json"
    })
    List<ScreenableField> getAllScreenTabFields(@Param("screenId") @NotNull Long screenId, @Param("tabId") @NotNull Long tabId, @Param("projectKey") @Nullable String projectKey);

    /**
     * Get all screen tabs
     * <p>
     * Returns the list of tabs for a screen.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * *
     * *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) when the project key is specified, providing that the screen is associated with the project through a Screen Scheme and Issue Type Screen Scheme.
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param screenId             The ID of the screen. (required)
     * @param projectKey           The key of the project. (optional)
     */
    @RequestLine("GET /rest/api/2/screens/{screenId}/tabs?projectKey={projectKey}")
    @Headers({
        "Accept: application/json"
    })
    List<ScreenableTab> getAllScreenTabs(@Param("screenId") @NotNull Long screenId, @Param("projectKey") @Nullable String projectKey);

    /**
     * Get all statuses for project
     * <p>
     * Returns the valid statuses for a project. The statuses are grouped by issue type, as each project has a set of valid issue types and each issue type has a set of valid statuses.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param projectIdOrKey       The project ID or project key (case sensitive). (required)
     */
    @RequestLine("GET /rest/api/2/project/{projectIdOrKey}/statuses")
    @Headers({
        "Accept: application/json"
    })
    List<IssueTypeWithStatus> getAllStatuses(@Param("projectIdOrKey") @NotNull String projectIdOrKey);

    /**
     * Get system avatars by type
     * <p>
     * Returns a list of system avatar details by owner type, where the owner types are issue type, project, or user.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param type                 The avatar type. (required)
     */
    @RequestLine("GET /rest/api/2/avatar/{type}/system")
    @Headers({
        "Accept: application/json"
    })
    SystemAvatars getAllSystemAvatars(@Param("type") @NotNull String type);

    /**
     * Get all users
     * <p>
     * Returns a list of all users, including active users, inactive users and previously deleted users that have an Atlassian account.
     * Privacy controls are applied to the response based on the users' preferences. This could mean, for example, that the user's email address is hidden. See the [Profile visibility overview](https://developer.atlassian.com/cloud/jira/platform/profile-visibility/) for more details.
     * **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [read:jira-user]
     * @param startAt              The index of the first item to return. (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return. (optional, defaults to 50)
     */
    @RequestLine("GET /rest/api/2/users/search?startAt={startAt}&maxResults={maxResults}")
    @Headers({
        "Accept: application/json"
    })
    List<User> getAllUsers(@Param("startAt") @Nullable Integer startAt, @Param("maxResults") @Nullable Integer maxResults);

    /**
     * Get all users default
     * <p>
     * Returns a list of all users, including active users, inactive users and previously deleted users that have an Atlassian account.
     * Privacy controls are applied to the response based on the users' preferences. This could mean, for example, that the user's email address is hidden. See the [Profile visibility overview](https://developer.atlassian.com/cloud/jira/platform/profile-visibility/) for more details.
     * **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [read:jira-user]
     * @param startAt              The index of the first item to return. (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return. (optional, defaults to 50)
     */
    @RequestLine("GET /rest/api/2/users?startAt={startAt}&maxResults={maxResults}")
    @Headers({
        "Accept: application/json"
    })
    List<User> getAllUsersDefault(@Param("startAt") @Nullable Integer startAt, @Param("maxResults") @Nullable Integer maxResults);

    /**
     * Get all workflow schemes
     * <p>
     * Returns a [paginated](#pagination) list of all workflow schemes, not including draft workflow schemes.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     */
    @RequestLine("GET /rest/api/2/workflowscheme?startAt={startAt}&maxResults={maxResults}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanWorkflowScheme getAllWorkflowSchemes(@Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults);

    /**
     * Get all workflows
     * <p>
     * Returns all workflows in Jira or a workflow. Deprecated, use [Get workflows paginated](#api-rest-api-2-workflow-search-get).
     * If the {@code workflowName} parameter is specified, the workflow is returned as an object (not in an array). Otherwise, an array of workflow objects is returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param workflowName         The name of the workflow to be returned. Only one workflow can be specified. (optional)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /rest/api/2/workflow?workflowName={workflowName}")
    @Headers({
        "Accept: application/json"
    })
    List<DeprecatedWorkflow> getAllWorkflows(@Param("workflowName") @Nullable String workflowName);

    /**
     * Get alternative issue types
     * <p>
     * Returns a list of issue types that can be used to replace the issue type. The alternative issue types are those assigned to the same workflow scheme, field configuration scheme, and screen scheme.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param id                   The ID of the issue type. (required)
     */
    @RequestLine("GET /rest/api/2/issuetype/{id}/alternatives")
    @Headers({
        "Accept: application/json"
    })
    List<IssueTypeDetails> getAlternativeIssueTypes(@Param("id") @NotNull String id);

    /**
     * Get application property
     * <p>
     * Returns all application properties or an application property.
     * If you specify a value for the {@code key} parameter, then an application property is returned as an object (not in an array). Otherwise, an array of all editable application properties is returned. See [Set application property](#api-rest-api-2-application-properties-id-put) for descriptions of editable properties.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param key                  The key of the application property. (optional)
     * @param permissionLevel      The permission level of all items being returned in the list. (optional)
     * @param keyFilter            When a {@code key} isn't provided, this filters the list of results by the application property {@code key} using a regular expression. For example, using {@code jira.lf.*} will return all application properties with keys that start with *jira.lf.*. (optional)
     */
    @RequestLine("GET /rest/api/2/application-properties?key={key}&permissionLevel={permissionLevel}&keyFilter={keyFilter}")
    @Headers({
        "Accept: application/json"
    })
    List<ApplicationProperty> getApplicationProperty(@Param("key") @Nullable String key, @Param("permissionLevel") @Nullable String permissionLevel, @Param("keyFilter") @Nullable String keyFilter);

    /**
     * Get application role
     * <p>
     * Returns an application role.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @param key                  The key of the application role. Use the [Get all application roles](#api-rest-api-2-applicationrole-get) operation to get the key for each application role. (required)
     */
    @RequestLine("GET /rest/api/2/applicationrole/{key}")
    @Headers({
        "Accept: application/json"
    })
    ApplicationRole getApplicationRole(@Param("key") @NotNull String key);

    /**
     * Get approximate application license count
     * <p>
     * Returns the total approximate number of user accounts for a single Jira license. Note that this information is cached with a 7-day lifecycle and could be stale at the time of call.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param applicationKey       The ID of the application, represents a specific version of Jira. (required)
     */
    @RequestLine("GET /rest/api/2/license/approximateLicenseCount/product/{applicationKey}")
    @Headers({
        "Accept: application/json"
    })
    LicenseMetric getApproximateApplicationLicenseCount(@Param("applicationKey") @NotNull String applicationKey);

    /**
     * Get approximate license count
     * <p>
     * Returns the approximate number of user accounts across all Jira licenses. Note that this information is cached with a 7-day lifecycle and could be stale at the time of call.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     */
    @RequestLine("GET /rest/api/2/license/approximateLicenseCount")
    @Headers({
        "Accept: application/json"
    })
    LicenseMetric getApproximateLicenseCount();

    /**
     * Get assigned permission scheme
     * <p>
     * Gets the [permission scheme](https://confluence.atlassian.com/x/yodKLg) associated with the project.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param projectKeyOrId       The project ID or project key (case sensitive). (required)
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are included when you specify any value. Expand options include:   *  {@code all} Returns all expandable information.  *  {@code field} Returns information about the custom field granted the permission.  *  {@code group} Returns information about the group that is granted the permission.  *  {@code permissions} Returns all permission grants for each permission scheme.  *  {@code projectRole} Returns information about the project role granted the permission.  *  {@code user} Returns information about the user who is granted the permission. (optional)
     */
    @RequestLine("GET /rest/api/2/project/{projectKeyOrId}/permissionscheme?expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    PermissionScheme getAssignedPermissionScheme(@Param("projectKeyOrId") @NotNull String projectKeyOrId, @Param("expand") @Nullable String expand);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param id                   The ID of the attachment. (required)
     */
    @RequestLine("GET /rest/api/2/attachment/{id}")
    @Headers({
        "Accept: application/json"
    })
    AttachmentMetadata getAttachment(@Param("id") @NotNull String id);

    /**
     * Get attachment content
     * <p>
     * Returns the contents of an attachment. A {@code Range} header can be set to define a range of bytes within the attachment to download. See the [HTTP Range header standard](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Range) for details.
     * To return a thumbnail of the attachment, use [Get attachment thumbnail](#api-rest-api-2-attachment-thumbnail-id-get).
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** For the issue containing the attachment:
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param id                   The ID of the attachment. (required)
     * @param redirect             Whether a redirect is provided for the attachment download. Clients that do not automatically follow redirects can set this to {@code false} to avoid making multiple requests to download the attachment. (optional, defaults to true)
     */
    @RequestLine("GET /rest/api/2/attachment/content/{id}?redirect={redirect}")
    @Headers({
        "Accept: application/json"
    })
    Object getAttachmentContent(@Param("id") @NotNull String id, @Param("redirect") @Nullable Boolean redirect);

    /**
     * Get Jira attachment settings
     * <p>
     * Returns the attachment settings, that is, whether attachments are enabled and the maximum attachment size allowed.
     * Note that there are also [project permissions](https://confluence.atlassian.com/x/yodKLg) that restrict whether users can create and delete attachments.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     *
     * Authentication - Required Scopes: [read:jira-work]
     */
    @RequestLine("GET /rest/api/2/attachment/meta")
    @Headers({
        "Accept: application/json"
    })
    AttachmentSettings getAttachmentMeta();

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param id                   The ID of the attachment. (required)
     * @param redirect             Whether a redirect is provided for the attachment download. Clients that do not automatically follow redirects can set this to {@code false} to avoid making multiple requests to download the attachment. (optional, defaults to true)
     * @param fallbackToDefault    Whether a default thumbnail is returned when the requested thumbnail is not found. (optional, defaults to true)
     * @param width                The maximum width to scale the thumbnail to. (optional)
     * @param height               The maximum height to scale the thumbnail to. (optional)
     */
    @RequestLine("GET /rest/api/2/attachment/thumbnail/{id}?redirect={redirect}&fallbackToDefault={fallbackToDefault}&width={width}&height={height}")
    @Headers({
        "Accept: application/json"
    })
    Object getAttachmentThumbnail(@Param("id") @NotNull String id, @Param("redirect") @Nullable Boolean redirect, @Param("fallbackToDefault") @Nullable Boolean fallbackToDefault, @Param("width") @Nullable Integer width, @Param("height") @Nullable Integer height);

    /**
     * Get audit records
     * <p>
     * Returns a list of audit records. The list can be filtered to include items:
     *  *
     * where each item in {@code filter} has at least one match in any of these fields:
     * 
     * 
     * 
     * 
     *  *
     * {@code summary}
     * 
     * 
     * *
     * {@code category}
     * 
     * 
     * *
     * {@code eventSource}
     * 
     * 
     * *
     * {@code objectItem.name} If the object is a user, account ID is available to filter.
     * 
     * 
     * *
     * {@code objectItem.parentName}
     * 
     * 
     * *
     * {@code objectItem.typeName}
     * 
     * 
     * *
     * {@code changedValues.changedFrom}
     * 
     * 
     * *
     * {@code changedValues.changedTo}
     * 
     * 
     * *
     * {@code remoteAddress}
     * 
     * 
     * 
     * 
     * For example, if {@code filter} contains *man ed*, an audit record containing {@code summary": "User added to group"} and {@code "category": "group management"} is returned.
     * *
     * created on or after a date and time.
     * *
     * created or or before a date and time.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param offset               The number of records to skip before returning the first result. (optional, defaults to 0)
     * @param limit                The maximum number of results to return. (optional, defaults to 1000)
     * @param filter               The strings to match with audit field content, space separated. (optional)
     * @param from                 The date and time on or after which returned audit records must have been created. If {@code to} is provided {@code from} must be before {@code to} or no audit records are returned. (optional)
     * @param to                   The date and time on or before which returned audit results must have been created. If {@code from} is provided {@code to} must be after {@code from} or no audit records are returned. (optional)
     */
    @RequestLine("GET /rest/api/2/auditing/record?offset={offset}&limit={limit}&filter={filter}&from={from}&to={to}")
    @Headers({
        "Accept: application/json"
    })
    AuditRecords getAuditRecords(@Param("offset") @Nullable Integer offset, @Param("limit") @Nullable Integer limit, @Param("filter") @Nullable String filter, @Param("from") @Nullable OffsetDateTime from, @Param("to") @Nullable OffsetDateTime to);

    /**
     * Get field reference data (GET)
     * <p>
     * Returns reference data for JQL searches. This is a downloadable version of the documentation provided in [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ) and [Advanced searching - functions reference](https://confluence.atlassian.com/x/hgORLQ), along with a list of JQL-reserved words. Use this information to assist with the programmatic creation of JQL queries or the validation of queries built in a custom query builder.
     * To filter visible field details by project or collapse non-unique fields by field type then [Get field reference data (POST)](#api-rest-api-2-jql-autocompletedata-post) can be used.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     *
     * Authentication - Required Scopes: [read:jira-work]
     */
    @RequestLine("GET /rest/api/2/jql/autocompletedata")
    @Headers({
        "Accept: application/json"
    })
    JQLReferenceData getAutoComplete();

    /**
     * Get field reference data (POST)
     * <p>
     * Returns reference data for JQL searches. This is a downloadable version of the documentation provided in [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ) and [Advanced searching - functions reference](https://confluence.atlassian.com/x/hgORLQ), along with a list of JQL-reserved words. Use this information to assist with the programmatic creation of JQL queries or the validation of queries built in a custom query builder.
     * This operation can filter the custom fields returned by project. Invalid project IDs in {@code projectIds} are ignored. System fields are always returned.
     * It can also return the collapsed field for custom fields. Collapsed fields enable searches to be performed across all fields with the same name and of the same field type. For example, the collapsed field {@code Component - Component[Dropdown]} enables dropdown fields {@code Component - cf[10061]} and {@code Component - cf[10062]} to be searched simultaneously.
     * **[Permissions](#permissions) required:** None.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param searchAutoCompleteFilter  (required)
     */
    @RequestLine("POST /rest/api/2/jql/autocompletedata")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    JQLReferenceData getAutoCompletePost(@NotNull SearchAutoCompleteFilter searchAutoCompleteFilter);

    /**
     * Get available screen fields
     * <p>
     * Returns the fields that can be added to a tab on a screen.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param screenId             The ID of the screen. (required)
     */
    @RequestLine("GET /rest/api/2/screens/{screenId}/availableFields")
    @Headers({
        "Accept: application/json"
    })
    List<ScreenableField> getAvailableScreenFields(@Param("screenId") @NotNull Long screenId);

    /**
     * Get all time tracking providers
     * <p>
     * Returns all time tracking providers. By default, Jira only has one time tracking provider: *JIRA provided time tracking*. However, you can install other time tracking providers via apps from the Atlassian Marketplace. For more information on time tracking providers, see the documentation for the [ Time Tracking Provider](https://developer.atlassian.com/cloud/jira/platform/modules/time-tracking-provider/) module.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     */
    @RequestLine("GET /rest/api/2/configuration/timetracking/list")
    @Headers({
        "Accept: application/json"
    })
    List<TimeTrackingProvider> getAvailableTimeTrackingImplementations();

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param type                 The icon type of the avatar. (required)
     * @param id                   The ID of the avatar. (required)
     * @param size                 The size of the avatar image. If not provided the default size is returned. (optional)
     * @param format               The format to return the avatar image in. If not provided the original content format is returned. (optional)
     */
    @RequestLine("GET /rest/api/2/universal_avatar/view/type/{type}/avatar/{id}?size={size}&format={format}")
    @Headers({
        "Accept: */*"
    })
    void getAvatarImageByID(@Param("type") @NotNull String type, @Param("id") @NotNull Long id, @Param("size") @Nullable String size, @Param("format") @Nullable String format);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param type                 The icon type of the avatar. (required)
     * @param entityId             The ID of the project or issue type the avatar belongs to. (required)
     * @param size                 The size of the avatar image. If not provided the default size is returned. (optional)
     * @param format               The format to return the avatar image in. If not provided the original content format is returned. (optional)
     */
    @RequestLine("GET /rest/api/2/universal_avatar/view/type/{type}/owner/{entityId}?size={size}&format={format}")
    @Headers({
        "Accept: */*"
    })
    void getAvatarImageByOwner(@Param("type") @NotNull String type, @Param("entityId") @NotNull String entityId, @Param("size") @Nullable String size, @Param("format") @Nullable String format);

    /**
     * Get avatar image by type
     * <p>
     * Returns the default project or issue type avatar image.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param type                 The icon type of the avatar. (required)
     * @param size                 The size of the avatar image. If not provided the default size is returned. (optional)
     * @param format               The format to return the avatar image in. If not provided the original content format is returned. (optional)
     */
    @RequestLine("GET /rest/api/2/universal_avatar/view/type/{type}?size={size}&format={format}")
    @Headers({
        "Accept: */*"
    })
    void getAvatarImageByType(@Param("type") @NotNull String type, @Param("size") @Nullable String size, @Param("format") @Nullable String format);

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
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param type                 The avatar type. (required)
     * @param entityId             The ID of the item the avatar is associated with. (required)
     */
    @RequestLine("GET /rest/api/2/universal_avatar/type/{type}/owner/{entityId}")
    @Headers({
        "Accept: application/json"
    })
    Avatars getAvatars(@Param("type") @NotNull String type, @Param("entityId") @NotNull String entityId);

    /**
     * Get announcement banner configuration
     * <p>
     * Returns the current announcement banner configuration.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     */
    @RequestLine("GET /rest/api/2/announcementBanner")
    @Headers({
        "Accept: application/json"
    })
    AnnouncementBannerConfiguration getBanner();

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
     * Null values in {@code globalPermissions}, {@code projectPermissions}, {@code projectPermissions.projects}, and {@code projectPermissions.issues} are ignored.
     * *
     * Empty strings in {@code projectPermissions.permissions} are ignored.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) to check the permissions for other users, otherwise none. However, Connect apps can make a call from the app server to the product to obtain permission details for any user, without admin permission. This Connect app ability doesn't apply to calls made using AP.request() in a browser.
     *
     * @param bulkPermissionsRequestBean Details of the permissions to check. (required)
     */
    @RequestLine("POST /rest/api/2/permissions/check")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    BulkPermissionGrants getBulkPermissions(@NotNull BulkPermissionsRequestBean bulkPermissionsRequestBean);

    /**
     * Get bulk screen tabs
     * <p>
     * Returns the list of tabs for a bulk of screens.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param screenId             The list of screen IDs. To include multiple screen IDs, provide an ampersand-separated list. For example, {@code screenId=10000&amp;screenId=10001}. (optional)
     * @param tabId                The list of tab IDs. To include multiple tab IDs, provide an ampersand-separated list. For example, {@code tabId=10000&amp;tabId=10001}. (optional)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResult            The maximum number of items to return per page. The maximum number is 100, (optional, defaults to 100)
     */
    @RequestLine("GET /rest/api/2/screens/tabs?screenId={screenId}&tabId={tabId}&startAt={startAt}&maxResult={maxResult}")
    @Headers({
        "Accept: application/json"
    })
    void getBulkScreenTabs(@Param("screenId") @Nullable Set<Long> screenId, @Param("tabId") @Nullable Set<Long> tabId, @Param("startAt") @Nullable Long startAt, @Param("maxResult") @Nullable Integer maxResult);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 100)
     */
    @RequestLine("GET /rest/api/2/issue/{issueIdOrKey}/changelog?startAt={startAt}&maxResults={maxResults}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanChangelog getChangeLogs(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @Param("startAt") @Nullable Integer startAt, @Param("maxResults") @Nullable Integer maxResults);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     * @param issueChangelogIds     (required)
     */
    @RequestLine("POST /rest/api/2/issue/{issueIdOrKey}/changelog/list")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    PageOfChangelogs getChangeLogsByIds(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @NotNull IssueChangelogIds issueChangelogIds);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param id                   The ID of the filter. (required)
     */
    @RequestLine("GET /rest/api/2/filter/{id}/columns")
    @Headers({
        "Accept: application/json"
    })
    List<ColumnItem> getColumns(@Param("id") @NotNull Long id);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     * @param id                   The ID of the comment. (required)
     * @param expand               Use [expand](#expansion) to include additional information about comments in the response. This parameter accepts {@code renderedBody}, which returns the comment body rendered in HTML. (optional)
     */
    @RequestLine("GET /rest/api/2/issue/{issueIdOrKey}/comment/{id}?expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    Comment getComment(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @Param("id") @NotNull String id, @Param("expand") @Nullable String expand);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param commentId            The ID of the comment. (required)
     * @param propertyKey          The key of the property. (required)
     */
    @RequestLine("GET /rest/api/2/comment/{commentId}/properties/{propertyKey}")
    @Headers({
        "Accept: application/json"
    })
    EntityProperty getCommentProperty(@Param("commentId") @NotNull String commentId, @Param("propertyKey") @NotNull String propertyKey);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param commentId            The ID of the comment. (required)
     */
    @RequestLine("GET /rest/api/2/comment/{commentId}/properties")
    @Headers({
        "Accept: application/json"
    })
    PropertyKeys getCommentPropertyKeys(@Param("commentId") @NotNull String commentId);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 5000)
     * @param orderBy              [Order](#ordering) the results by a field. Accepts *created* to sort comments by their created date. (optional)
     * @param expand               Use [expand](#expansion) to include additional information about comments in the response. This parameter accepts {@code renderedBody}, which returns the comment body rendered in HTML. (optional)
     */
    @RequestLine("GET /rest/api/2/issue/{issueIdOrKey}/comment?startAt={startAt}&maxResults={maxResults}&orderBy={orderBy}&expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    PageOfComments getComments(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("orderBy") @Nullable String orderBy, @Param("expand") @Nullable String expand);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param issueCommentListRequestBean The list of comment IDs. (required)
     * @param expand               Use [expand](#expansion) to include additional information about comments in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code renderedBody} Returns the comment body rendered in HTML.  *  {@code properties} Returns the comment's properties. (optional)
     */
    @RequestLine("POST /rest/api/2/comment/list?expand={expand}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    PageBeanComment getCommentsByIds(@NotNull IssueCommentListRequestBean issueCommentListRequestBean, @Param("expand") @Nullable String expand);

    /**
     * Get component
     * <p>
     * Returns a component.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for project containing the component.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param id                   The ID of the component. (required)
     */
    @RequestLine("GET /rest/api/2/component/{id}")
    @Headers({
        "Accept: application/json"
    })
    ProjectComponent getComponent(@Param("id") @NotNull String id);

    /**
     * Get component issues count
     * <p>
     * Returns the counts of issues assigned to the component.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param id                   The ID of the component. (required)
     */
    @RequestLine("GET /rest/api/2/component/{id}/relatedIssueCounts")
    @Headers({
        "Accept: application/json"
    })
    ComponentIssuesCount getComponentRelatedIssues(@Param("id") @NotNull String id);

    /**
     * Get global settings
     * <p>
     * Returns the [global settings](https://confluence.atlassian.com/x/qYXKM) in Jira. These settings determine whether optional features (for example, subtasks, time tracking, and others) are enabled. If time tracking is enabled, this operation also returns the time tracking configuration.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * Authentication - Required Scopes: [read:jira-user]
     */
    @RequestLine("GET /rest/api/2/configuration")
    @Headers({
        "Accept: application/json"
    })
    Configuration getConfiguration();

    /**
     * Get custom field contexts
     * <p>
     * Returns a [paginated](#pagination) list of [ contexts](https://confluence.atlassian.com/adminjiracloud/what-are-custom-field-contexts-991923859.html) for a custom field. Contexts can be returned as follows:
     *  *
     * With no other parameters set, all contexts.
     * *
     * By defining {@code id} only, all contexts from the list of IDs.
     * *
     * By defining {@code isAnyIssueType}, limit the list of contexts returned to either those that apply to all issue types (true) or those that apply to only a subset of issue types (false)
     * *
     * By defining {@code isGlobalContext}, limit the list of contexts return to either those that apply to all projects (global contexts) (true) or those that apply to only a subset of projects (false).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param fieldId              The ID of the custom field. (required)
     * @param isAnyIssueType       Whether to return contexts that apply to all issue types. (optional)
     * @param isGlobalContext      Whether to return contexts that apply to all projects. (optional)
     * @param contextId            The list of context IDs. To include multiple contexts, separate IDs with ampersand: {@code contextId=10000&amp;contextId=10001}. (optional)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     */
    @RequestLine("GET /rest/api/2/field/{fieldId}/context?isAnyIssueType={isAnyIssueType}&isGlobalContext={isGlobalContext}&contextId={contextId}&startAt={startAt}&maxResults={maxResults}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanCustomFieldContext getContextsForField(@Param("fieldId") @NotNull String fieldId, @Param("isAnyIssueType") @Nullable Boolean isAnyIssueType, @Param("isGlobalContext") @Nullable Boolean isGlobalContext, @Param("contextId") @Nullable Set<Long> contextId, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults);

    /**
     * Get contexts for a field
     * <p>
     * Returns a [paginated](#pagination) list of the contexts a field is used in. Deprecated, use [ Get custom field contexts](#api-rest-api-2-field-fieldId-context-get).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param fieldId              The ID of the field to return contexts for. (required)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 20)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /rest/api/2/field/{fieldId}/contexts?startAt={startAt}&maxResults={maxResults}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanContext getContextsForFieldDeprecated(@Param("fieldId") @NotNull String fieldId, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults);

    /**
     * Get create issue metadata
     * <p>
     * Returns details of projects, issue types within projects, and, when requested, the create screen fields for each issue type for the user. Use the information to populate the requests in [ Create issue](#api-rest-api-2-issue-post) and [Create issues](#api-rest-api-2-issue-bulk-post).
     * The request can be restricted to specific projects or issue types using the query parameters. The response will contain information for the valid projects, issue types, or project and issue type combinations requested. Note that invalid project, issue type, or project and issue type combinations do not generate errors.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Create issues* [project permission](https://confluence.atlassian.com/x/yodKLg) in the requested projects.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param projectIds           List of project IDs. This parameter accepts a comma-separated list. Multiple project IDs can also be provided using an ampersand-separated list. For example, {@code projectIds=10000,10001&amp;projectIds=10020,10021}. This parameter may be provided with {@code projectKeys}. (optional)
     * @param projectKeys          List of project keys. This parameter accepts a comma-separated list. Multiple project keys can also be provided using an ampersand-separated list. For example, {@code projectKeys=proj1,proj2&amp;projectKeys=proj3}. This parameter may be provided with {@code projectIds}. (optional)
     * @param issuetypeIds         List of issue type IDs. This parameter accepts a comma-separated list. Multiple issue type IDs can also be provided using an ampersand-separated list. For example, {@code issuetypeIds=10000,10001&amp;issuetypeIds=10020,10021}. This parameter may be provided with {@code issuetypeNames}. (optional)
     * @param issuetypeNames       List of issue type names. This parameter accepts a comma-separated list. Multiple issue type names can also be provided using an ampersand-separated list. For example, {@code issuetypeNames=name1,name2&amp;issuetypeNames=name3}. This parameter may be provided with {@code issuetypeIds}. (optional)
     * @param expand               Use [expand](#expansion) to include additional information about issue metadata in the response. This parameter accepts {@code projects.issuetypes.fields}, which returns information about the fields in the issue creation screen for each issue type. Fields hidden from the screen are not returned. Use the information to populate the {@code fields} and {@code update} fields in [Create issue](#api-rest-api-2-issue-post) and [Create issues](#api-rest-api-2-issue-bulk-post). (optional)
     */
    @RequestLine("GET /rest/api/2/issue/createmeta?projectIds={projectIds}&projectKeys={projectKeys}&issuetypeIds={issuetypeIds}&issuetypeNames={issuetypeNames}&expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    IssueCreateMetadata getCreateIssueMeta(@Param("projectIds") @Nullable List<String> projectIds, @Param("projectKeys") @Nullable List<String> projectKeys, @Param("issuetypeIds") @Nullable List<String> issuetypeIds, @Param("issuetypeNames") @Nullable List<String> issuetypeNames, @Param("expand") @Nullable String expand);

    /**
     * Get create metadata issue types for a project
     * <p>
     * Returns a page of issue type metadata for a specified project Use the information to populate the requests in [ Create issue](#api-rest-api-2-issue-post) and [Create issues](#api-rest-api-2-issue-bulk-post).
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Create issues* [project permission](https://confluence.atlassian.com/x/yodKLg) in the requested projects.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param projectIdOrKey       The ID or key of the project. (required)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     */
    @RequestLine("GET /rest/api/2/issue/createmeta/{projectIdOrKey}/issueTypes?startAt={startAt}&maxResults={maxResults}")
    @Headers({
        "Accept: application/json"
    })
    PageOfCreateMetaIssueType getCreateIssueMetaIssueTypes(@Param("projectIdOrKey") @NotNull String projectIdOrKey, @Param("startAt") @Nullable Integer startAt, @Param("maxResults") @Nullable Integer maxResults);

    /**
     * Get current user
     * <p>
     * Returns details for the current user.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * Authentication - Required Scopes: [read:jira-user]
     * @param expand               Use [expand](#expansion) to include additional information about user in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code groups} Returns all groups, including nested groups, the user belongs to.  *  {@code applicationRoles} Returns the application roles the user is assigned to. (optional)
     */
    @RequestLine("GET /rest/api/2/myself?expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    User getCurrentUser(@Param("expand") @Nullable String expand);

    /**
     * Get custom field configurations
     * <p>
     * Returns a [paginated](#pagination) list of configurations for a custom field created by a [Forge app](https://developer.atlassian.com/platform/forge/).
     * The result can be filtered by one of these criteria:
     *  *
     * {@code id}.
     * *
     * {@code fieldContextId}.
     * *
     * {@code issueId}.
     * *
     * {@code projectKeyOrId} and {@code issueTypeId}.
     * Otherwise, all configurations are returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the Forge app that created the custom field.
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param fieldIdOrKey         The ID or key of the custom field, for example {@code customfield_10000}. (required)
     * @param id                   The list of configuration IDs. To include multiple configurations, separate IDs with an ampersand: {@code id=10000&amp;id=10001}. Can't be provided with {@code fieldContextId}, {@code issueId}, {@code projectKeyOrId}, or {@code issueTypeId}. (optional)
     * @param fieldContextId       The list of field context IDs. To include multiple field contexts, separate IDs with an ampersand: {@code fieldContextId=10000&amp;fieldContextId=10001}. Can't be provided with {@code id}, {@code issueId}, {@code projectKeyOrId}, or {@code issueTypeId}. (optional)
     * @param issueId              The ID of the issue to filter results by. If the issue doesn't exist, an empty list is returned. Can't be provided with {@code projectKeyOrId}, or {@code issueTypeId}. (optional)
     * @param projectKeyOrId       The ID or key of the project to filter results by. Must be provided with {@code issueTypeId}. Can't be provided with {@code issueId}. (optional)
     * @param issueTypeId          The ID of the issue type to filter results by. Must be provided with {@code projectKeyOrId}. Can't be provided with {@code issueId}. (optional)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 100)
     */
    @RequestLine("GET /rest/api/2/app/field/{fieldIdOrKey}/context/configuration?id={id}&fieldContextId={fieldContextId}&issueId={issueId}&projectKeyOrId={projectKeyOrId}&issueTypeId={issueTypeId}&startAt={startAt}&maxResults={maxResults}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanContextualConfiguration getCustomFieldConfiguration(@Param("fieldIdOrKey") @NotNull String fieldIdOrKey, @Param("id") @Nullable Set<Long> id, @Param("fieldContextId") @Nullable Set<Long> fieldContextId, @Param("issueId") @Nullable Long issueId, @Param("projectKeyOrId") @Nullable String projectKeyOrId, @Param("issueTypeId") @Nullable String issueTypeId, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults);

    /**
     * Get custom field contexts for projects and issue types
     * <p>
     * Returns a [paginated](#pagination) list of project and issue type mappings and, for each mapping, the ID of a [custom field context](https://confluence.atlassian.com/x/k44fOw) that applies to the project and issue type.
     * If there is no custom field context assigned to the project then, if present, the custom field context that applies to all projects is returned if it also applies to the issue type or all issue types. If a custom field context is not found, the returned custom field context ID is {@code null}.
     * Duplicate project and issue type mappings cannot be provided in the request.
     * The order of the returned values is the same as provided in the request.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param fieldId              The ID of the custom field. (required)
     * @param projectIssueTypeMappings The list of project and issue type mappings. (required)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     */
    @RequestLine("POST /rest/api/2/field/{fieldId}/context/mapping?startAt={startAt}&maxResults={maxResults}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    PageBeanContextForProjectAndIssueType getCustomFieldContextsForProjectsAndIssueTypes(@Param("fieldId") @NotNull String fieldId, @NotNull ProjectIssueTypeMappings projectIssueTypeMappings, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param id                   The ID of the custom field option. (required)
     */
    @RequestLine("GET /rest/api/2/customFieldOption/{id}")
    @Headers({
        "Accept: application/json"
    })
    CustomFieldOption getCustomFieldOption(@Param("id") @NotNull String id);

    /**
     * Get dashboard
     * <p>
     * Returns a dashboard.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     * However, to get a dashboard, the dashboard must be shared with the user or the user must own it. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. The System dashboard is considered to be shared with all other users.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param id                   The ID of the dashboard. (required)
     */
    @RequestLine("GET /rest/api/2/dashboard/{id}")
    @Headers({
        "Accept: application/json"
    })
    Dashboard getDashboard(@Param("id") @NotNull String id);

    /**
     * Get dashboard item property
     * <p>
     * Returns the key and value of a dashboard item property.
     * A dashboard item enables an app to add user-specific information to a user dashboard. Dashboard items are exposed to users as gadgets that users can add to their dashboards. For more information on how users do this, see [Adding and customizing gadgets](https://confluence.atlassian.com/x/7AeiLQ).
     * When an app creates a dashboard item it registers a callback to receive the dashboard item ID. The callback fires whenever the item is rendered or, where the item is configurable, the user edits the item. The app then uses this resource to store the item's content or configuration details. For more information on working with dashboard items, see [ Building a dashboard item for a JIRA Connect add-on](https://developer.atlassian.com/server/jira/platform/guide-building-a-dashboard-item-for-a-jira-connect-add-on-33746254/) and the [Dashboard Item](https://developer.atlassian.com/cloud/jira/platform/modules/dashboard-item/) documentation.
     * There is no resource to set or get dashboard items.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** The user must be the owner of the dashboard or have the dashboard shared with them. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. The System dashboard is considered to be shared with all other users, and is accessible to anonymous users when Jira’s anonymous access is permitted.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param dashboardId          The ID of the dashboard. (required)
     * @param itemId               The ID of the dashboard item. (required)
     * @param propertyKey          The key of the dashboard item property. (required)
     */
    @RequestLine("GET /rest/api/2/dashboard/{dashboardId}/items/{itemId}/properties/{propertyKey}")
    @Headers({
        "Accept: application/json"
    })
    EntityProperty getDashboardItemProperty(@Param("dashboardId") @NotNull String dashboardId, @Param("itemId") @NotNull String itemId, @Param("propertyKey") @NotNull String propertyKey);

    /**
     * Get dashboard item property keys
     * <p>
     * Returns the keys of all properties for a dashboard item.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** The user must be the owner of the dashboard or have the dashboard shared with them. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. The System dashboard is considered to be shared with all other users, and is accessible to anonymous users when Jira’s anonymous access is permitted.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param dashboardId          The ID of the dashboard. (required)
     * @param itemId               The ID of the dashboard item. (required)
     */
    @RequestLine("GET /rest/api/2/dashboard/{dashboardId}/items/{itemId}/properties")
    @Headers({
        "Accept: application/json"
    })
    PropertyKeys getDashboardItemPropertyKeys(@Param("dashboardId") @NotNull String dashboardId, @Param("itemId") @NotNull String itemId);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param dashboardName        String used to perform a case-insensitive partial match with {@code name}. (optional)
     * @param accountId            User account ID used to return dashboards with the matching {@code owner.accountId}. This parameter cannot be used with the {@code owner} parameter. (optional)
     * @param owner                This parameter is deprecated because of privacy changes. Use {@code accountId} instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. User name used to return dashboards with the matching {@code owner.name}. This parameter cannot be used with the {@code accountId} parameter. (optional)
     * @param groupname            As a group's name can change, use of {@code groupId} is recommended. Group name used to return dashboards that are shared with a group that matches {@code sharePermissions.group.name}. This parameter cannot be used with the {@code groupId} parameter. (optional)
     * @param groupId              Group ID used to return dashboards that are shared with a group that matches {@code sharePermissions.group.groupId}. This parameter cannot be used with the {@code groupname} parameter. (optional)
     * @param projectId            Project ID used to returns dashboards that are shared with a project that matches {@code sharePermissions.project.id}. (optional)
     * @param orderBy              [Order](#ordering) the results by a field:   *  {@code description} Sorts by dashboard description. Note that this sort works independently of whether the expand to display the description field is in use.  *  {@code favourite_count} Sorts by dashboard popularity.  *  {@code id} Sorts by dashboard ID.  *  {@code is_favourite} Sorts by whether the dashboard is marked as a favorite.  *  {@code name} Sorts by dashboard name.  *  {@code owner} Sorts by dashboard owner name. (optional, defaults to name)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     * @param status               The status to filter by. It may be active, archived or deleted. (optional, defaults to active)
     * @param expand               Use [expand](#expansion) to include additional information about dashboard in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code description} Returns the description of the dashboard.  *  {@code owner} Returns the owner of the dashboard.  *  {@code viewUrl} Returns the URL that is used to view the dashboard.  *  {@code favourite} Returns {@code isFavourite}, an indicator of whether the user has set the dashboard as a favorite.  *  {@code favouritedCount} Returns {@code popularity}, a count of how many users have set this dashboard as a favorite.  *  {@code sharePermissions} Returns details of the share permissions defined for the dashboard.  *  {@code editPermissions} Returns details of the edit permissions defined for the dashboard.  *  {@code isWritable} Returns whether the current user has permission to edit the dashboard. (optional)
     */
    @RequestLine("GET /rest/api/2/dashboard/search?dashboardName={dashboardName}&accountId={accountId}&owner={owner}&groupname={groupname}&groupId={groupId}&projectId={projectId}&orderBy={orderBy}&startAt={startAt}&maxResults={maxResults}&status={status}&expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanDashboard getDashboardsPaginated(@Param("dashboardName") @Nullable String dashboardName, @Param("accountId") @Nullable String accountId, @Param("owner") @Nullable String owner, @Param("groupname") @Nullable String groupname, @Param("groupId") @Nullable String groupId, @Param("projectId") @Nullable Long projectId, @Param("orderBy") @Nullable String orderBy, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("status") @Nullable String status, @Param("expand") @Nullable String expand);

    /**
     * Get default share scope
     * <p>
     * Returns the default sharing settings for new filters and dashboards for a user.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * Authentication - Required Scopes: [read:jira-work]
     */
    @RequestLine("GET /rest/api/2/filter/defaultShareScope")
    @Headers({
        "Accept: application/json"
    })
    DefaultShareScope getDefaultShareScope();

    /**
     * Get custom field contexts default values
     * <p>
     * Returns a [paginated](#pagination) list of defaults for a custom field. The results can be filtered by {@code contextId}, otherwise all values are returned. If no defaults are set for a context, nothing is returned.
     *  The returned object depends on type of the custom field:
     *  *
     * {@code CustomFieldContextDefaultValueDate} (type {@code datepicker}) for date fields.
     * *
     * {@code CustomFieldContextDefaultValueDateTime} (type {@code datetimepicker}) for date-time fields.
     * *
     * {@code CustomFieldContextDefaultValueSingleOption} (type {@code option.single}) for single choice select lists and radio buttons.
     * *
     * {@code CustomFieldContextDefaultValueMultipleOption} (type {@code option.multiple}) for multiple choice select lists and checkboxes.
     * *
     * {@code CustomFieldContextDefaultValueCascadingOption} (type {@code option.cascading}) for cascading select lists.
     * *
     * {@code CustomFieldContextSingleUserPickerDefaults} (type {@code single.user.select}) for single users.
     * *
     * {@code CustomFieldContextDefaultValueMultiUserPicker} (type {@code multi.user.select}) for user lists.
     * *
     * {@code CustomFieldContextDefaultValueSingleGroupPicker} (type {@code grouppicker.single}) for single choice group pickers.
     * *
     * {@code CustomFieldContextDefaultValueMultipleGroupPicker} (type {@code grouppicker.multiple}) for multiple choice group pickers.
     * *
     * {@code CustomFieldContextDefaultValueURL} (type {@code url}) for URLs.
     * *
     * {@code CustomFieldContextDefaultValueProject} (type {@code project}) for project pickers.
     * *
     * {@code CustomFieldContextDefaultValueFloat} (type {@code float}) for floats (floating-point numbers).
     * *
     * {@code CustomFieldContextDefaultValueLabels} (type {@code labels}) for labels.
     * *
     * {@code CustomFieldContextDefaultValueTextField} (type {@code textfield}) for text fields.
     * *
     * {@code CustomFieldContextDefaultValueTextArea} (type {@code textarea}) for text area fields.
     * *
     * {@code CustomFieldContextDefaultValueReadOnly} (type {@code readonly}) for read only (text) fields.
     * *
     * {@code CustomFieldContextDefaultValueMultipleVersion} (type {@code version.multiple}) for single choice version pickers.
     * *
     * {@code CustomFieldContextDefaultValueSingleVersion} (type {@code version.single}) for multiple choice version pickers.
     * Forge custom fields [types](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field-type/#data-types) are also supported, returning:
     *  *
     * {@code CustomFieldContextDefaultValueForgeStringFieldBean} (type {@code forge.string}) for Forge string fields.
     * *
     * {@code CustomFieldContextDefaultValueForgeMultiStringFieldBean} (type {@code forge.string.list}) for Forge string collection fields.
     * *
     * {@code CustomFieldContextDefaultValueForgeObjectFieldBean} (type {@code forge.object}) for Forge object fields.
     * *
     * {@code CustomFieldContextDefaultValueForgeDateTimeFieldBean} (type {@code forge.datetime}) for Forge date-time fields.
     * *
     * {@code CustomFieldContextDefaultValueForgeGroupFieldBean} (type {@code forge.group}) for Forge group fields.
     * *
     * {@code CustomFieldContextDefaultValueForgeMultiGroupFieldBean} (type {@code forge.group.list}) for Forge group collection fields.
     * *
     * {@code CustomFieldContextDefaultValueForgeNumberFieldBean} (type {@code forge.number}) for Forge number fields.
     * *
     * {@code CustomFieldContextDefaultValueForgeUserFieldBean} (type {@code forge.user}) for Forge user fields.
     * *
     * {@code CustomFieldContextDefaultValueForgeMultiUserFieldBean} (type {@code forge.user.list}) for Forge user collection fields.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param fieldId              The ID of the custom field, for example {@code customfield\\_10000}. (required)
     * @param contextId            The IDs of the contexts. (optional)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     */
    @RequestLine("GET /rest/api/2/field/{fieldId}/context/defaultValue?contextId={contextId}&startAt={startAt}&maxResults={maxResults}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanCustomFieldContextDefaultValue getDefaultValues(@Param("fieldId") @NotNull String fieldId, @Param("contextId") @Nullable Set<Long> contextId, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults);

    /**
     * Get default workflow
     * <p>
     * Returns the default workflow for a workflow scheme. The default workflow is the workflow that is assigned any issue types that have not been mapped to any other workflow. The default workflow has *All Unassigned Issue Types* listed in its issue types for the workflow scheme in Jira.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the workflow scheme. (required)
     * @param returnDraftIfExists  Set to {@code true} to return the default workflow for the workflow scheme's draft rather than scheme itself. If the workflow scheme does not have a draft, then the default workflow for the workflow scheme is returned. (optional, defaults to false)
     */
    @RequestLine("GET /rest/api/2/workflowscheme/{id}/default?returnDraftIfExists={returnDraftIfExists}")
    @Headers({
        "Accept: application/json"
    })
    DefaultWorkflow getDefaultWorkflow(@Param("id") @NotNull Long id, @Param("returnDraftIfExists") @Nullable Boolean returnDraftIfExists);

    /**
     * Get draft default workflow
     * <p>
     * Returns the default workflow for a workflow scheme's draft. The default workflow is the workflow that is assigned any issue types that have not been mapped to any other workflow. The default workflow has *All Unassigned Issue Types* listed in its issue types for the workflow scheme in Jira.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the workflow scheme that the draft belongs to. (required)
     */
    @RequestLine("GET /rest/api/2/workflowscheme/{id}/draft/default")
    @Headers({
        "Accept: application/json"
    })
    DefaultWorkflow getDraftDefaultWorkflow(@Param("id") @NotNull Long id);

    /**
     * Get issue types for workflows in draft workflow scheme
     * <p>
     * Returns the workflow-issue type mappings for a workflow scheme's draft.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the workflow scheme that the draft belongs to. (required)
     * @param workflowName         The name of a workflow in the scheme. Limits the results to the workflow-issue type mapping for the specified workflow. (optional)
     */
    @RequestLine("GET /rest/api/2/workflowscheme/{id}/draft/workflow?workflowName={workflowName}")
    @Headers({
        "Accept: application/json"
    })
    IssueTypesWorkflowMapping getDraftWorkflow(@Param("id") @NotNull Long id, @Param("workflowName") @Nullable String workflowName);

    /**
     * Get dynamic webhooks for app
     * <p>
     * Returns a [paginated](#pagination) list of the webhooks registered by the calling app.
     * **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/#connect-apps) and [OAuth 2.0](https://developer.atlassian.com/cloud/jira/platform/oauth-2-3lo-apps) apps can use this operation.
     *
     * Authentication - Required Scopes: [read:jira-work, manage:jira-webhook]
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 100)
     */
    @RequestLine("GET /rest/api/2/webhook?startAt={startAt}&maxResults={maxResults}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanWebhook getDynamicWebhooksForApp(@Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults);

    /**
     * Get edit issue metadata
     * <p>
     * Returns the edit screen fields for an issue that are visible to and editable by the user. Use the information to populate the requests in [Edit issue](#api-rest-api-2-issue-issueIdOrKey-put).
     * This endpoint will check for these conditions:
     * 1.
     * Field is available on a field screen - through screen, screen scheme, issue type screen scheme, and issue type scheme configuration. {@code overrideScreenSecurity=true} skips this condition. 2.
     * Field is visible in the [field configuration](https://support.atlassian.com/jira-cloud-administration/docs/change-a-field-configuration/). {@code overrideScreenSecurity=true} skips this condition. 3.
     * Field is shown on the issue: each field has different conditions here. For example: Attachment field only shows if attachments are enabled. Assignee only shows if user has permissions to assign the issue. 4.
     * If a field is custom then it must have valid custom field context, applicable for its project and issue type. All system fields are assumed to have context in all projects and all issue types. 5.
     * Issue has a project, issue type, and status defined. 6.
     * Issue is assigned to a valid workflow, and the current status has assigned a workflow step. {@code overrideEditableFlag=true} skips this condition. 7.
     * The current workflow step is editable. This is true by default, but [can be disabled by setting](https://support.atlassian.com/jira-cloud-administration/docs/use-workflow-properties/) the {@code jira.issue.editable} property to {@code false}. {@code overrideEditableFlag=true} skips this condition. 8.
     * User has [Edit issues permission](https://support.atlassian.com/jira-cloud-administration/docs/permissions-for-company-managed-projects/). 9.
     * Workflow permissions allow editing a field. This is true by default but [can be modified](https://support.atlassian.com/jira-cloud-administration/docs/use-workflow-properties/) using {@code jira.permission.*} workflow properties.
     * Fields hidden using [Issue layout settings page](https://support.atlassian.com/jira-software-cloud/docs/configure-field-layout-in-the-issue-view/) remain editable.
     * Connect apps having an app user with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), and Forge apps acting on behalf of users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), can return additional details using:
     *  *
     * {@code overrideScreenSecurity} When this flag is {@code true}, then this endpoint skips checking if fields are available through screens, and field configuration (conditions 1. and 2. from the list above).
     * *
     * {@code overrideEditableFlag} When this flag is {@code true}, then this endpoint skips checking if workflow is present and if the current step is editable (conditions 6. and 7. from the list above).
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * Note: For any fields to be editable the user must have the *Edit issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the issue.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     * @param overrideScreenSecurity Whether hidden fields are returned. Available to Connect app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) and Forge apps acting on behalf of users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). (optional, defaults to false)
     * @param overrideEditableFlag Whether non-editable fields are returned. Available to Connect app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) and Forge apps acting on behalf of users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). (optional, defaults to false)
     */
    @RequestLine("GET /rest/api/2/issue/{issueIdOrKey}/editmeta?overrideScreenSecurity={overrideScreenSecurity}&overrideEditableFlag={overrideEditableFlag}")
    @Headers({
        "Accept: application/json"
    })
    IssueUpdateMetadata getEditIssueMeta(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @Param("overrideScreenSecurity") @Nullable Boolean overrideScreenSecurity, @Param("overrideEditableFlag") @Nullable Boolean overrideEditableFlag);

    /**
     * Get events
     * <p>
     * Returns all issue events.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     */
    @RequestLine("GET /rest/api/2/events")
    @Headers({
        "Accept: application/json"
    })
    List<IssueEvent> getEvents();

    /**
     * Get failed webhooks
     * <p>
     * Returns webhooks that have recently failed to be delivered to the requesting app after the maximum number of retries.
     * After 72 hours the failure may no longer be returned by this operation.
     * The oldest failure is returned first.
     * This method uses a cursor-based pagination. To request the next page use the failure time of the last webhook on the list as the {@code failedAfter} value or use the URL provided in {@code next}.
     * **[Permissions](#permissions) required:** Only [Connect apps](https://developer.atlassian.com/cloud/jira/platform/index/#connect-apps) can use this operation.
     *
     * Authentication - Required Scopes: [read:jira-work, manage:jira-webhook]
     * @param maxResults           The maximum number of webhooks to return per page. If obeying the maxResults directive would result in records with the same failure time being split across pages, the directive is ignored and all records with the same failure time included on the page. (optional)
     * @param after                The time after which any webhook failure must have occurred for the record to be returned, expressed as milliseconds since the UNIX epoch. (optional)
     */
    @RequestLine("GET /rest/api/2/webhook/failed?maxResults={maxResults}&after={after}")
    @Headers({
        "Accept: application/json"
    })
    FailedWebhooks getFailedWebhooks(@Param("maxResults") @Nullable Integer maxResults, @Param("after") @Nullable Long after);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param expand               Use [expand](#expansion) to include additional information about filter in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code sharedUsers} Returns the users that the filter is shared with. This includes users that can browse projects that the filter is shared with. If you don't specify {@code sharedUsers}, then the {@code sharedUsers} object is returned but it doesn't list any users. The list of users returned is limited to 1000, to access additional users append {@code [start-index:end-index]} to the expand request. For example, to access the next 1000 users, use {@code ?expand=sharedUsers[1001:2000]}.  *  {@code subscriptions} Returns the users that are subscribed to the filter. If you don't specify {@code subscriptions}, the {@code subscriptions} object is returned but it doesn't list any subscriptions. The list of subscriptions returned is limited to 1000, to access additional subscriptions append {@code [start-index:end-index]} to the expand request. For example, to access the next 1000 subscriptions, use {@code ?expand=subscriptions[1001:2000]}. (optional)
     */
    @RequestLine("GET /rest/api/2/filter/favourite?expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    List<Filter> getFavouriteFilters(@Param("expand") @Nullable String expand);

    /**
     * Get project features
     * <p>
     * Returns the list of features for a project.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param projectIdOrKey       The ID or (case-sensitive) key of the project. (required)
     */
    @RequestLine("GET /rest/api/2/project/{projectIdOrKey}/features")
    @Headers({
        "Accept: application/json"
    })
    ContainerForProjectFeatures getFeaturesForProject(@Param("projectIdOrKey") @NotNull String projectIdOrKey);

    /**
     * Get field auto complete suggestions
     * <p>
     * Returns the JQL search auto complete suggestions for a field.
     * Suggestions can be obtained by providing:
     *  *
     * {@code fieldName} to get a list of all values for the field.
     * *
     * {@code fieldName} and {@code fieldValue} to get a list of values containing the text in {@code fieldValue}.
     * *
     * {@code fieldName} and {@code predicateName} to get a list of all predicate values for the field.
     * *
     * {@code fieldName}, {@code predicateName}, and {@code predicateValue} to get a list of predicate values containing the text in {@code predicateValue}.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param fieldName            The name of the field. (optional)
     * @param fieldValue           The partial field item name entered by the user. (optional)
     * @param predicateName        The name of the [ CHANGED operator predicate](https://confluence.atlassian.com/x/hQORLQ#Advancedsearching-operatorsreference-CHANGEDCHANGED) for which the suggestions are generated. The valid predicate operators are *by*, *from*, and *to*. (optional)
     * @param predicateValue       The partial predicate item name entered by the user. (optional)
     */
    @RequestLine("GET /rest/api/2/jql/autocompletedata/suggestions?fieldName={fieldName}&fieldValue={fieldValue}&predicateName={predicateName}&predicateValue={predicateValue}")
    @Headers({
        "Accept: application/json"
    })
    AutoCompleteSuggestions getFieldAutoCompleteForQueryString(@Param("fieldName") @Nullable String fieldName, @Param("fieldValue") @Nullable String fieldValue, @Param("predicateName") @Nullable String predicateName, @Param("predicateValue") @Nullable String predicateValue);

    /**
     * Get field configuration items
     * <p>
     * Returns a [paginated](#pagination) list of all fields for a configuration.
     * Only the fields from configurations used in company-managed (classic) projects are returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the field configuration. (required)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     */
    @RequestLine("GET /rest/api/2/fieldconfiguration/{id}/fields?startAt={startAt}&maxResults={maxResults}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanFieldConfigurationItem getFieldConfigurationItems(@Param("id") @NotNull Long id, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults);

    /**
     * Get field configuration issue type items
     * <p>
     * Returns a [paginated](#pagination) list of field configuration issue type items.
     * Only items used in classic projects are returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     * @param fieldConfigurationSchemeId The list of field configuration scheme IDs. To include multiple field configuration schemes separate IDs with ampersand: {@code fieldConfigurationSchemeId=10000&amp;fieldConfigurationSchemeId=10001}. (optional)
     */
    @RequestLine("GET /rest/api/2/fieldconfigurationscheme/mapping?startAt={startAt}&maxResults={maxResults}&fieldConfigurationSchemeId={fieldConfigurationSchemeId}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanFieldConfigurationIssueTypeItem getFieldConfigurationSchemeMappings(@Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("fieldConfigurationSchemeId") @Nullable Set<Long> fieldConfigurationSchemeId);

    /**
     * Get field configuration schemes for projects
     * <p>
     * Returns a [paginated](#pagination) list of field configuration schemes and, for each scheme, a list of the projects that use it.
     * The list is sorted by field configuration scheme ID. The first item contains the list of project IDs assigned to the default field configuration scheme.
     * Only field configuration schemes used in classic projects are returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param projectId            The list of project IDs. To include multiple projects, separate IDs with ampersand: {@code projectId=10000&amp;projectId=10001}. (required)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     */
    @RequestLine("GET /rest/api/2/fieldconfigurationscheme/project?startAt={startAt}&maxResults={maxResults}&projectId={projectId}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanFieldConfigurationSchemeProjects getFieldConfigurationSchemeProjectMapping(@Param("projectId") @NotNull Set<Long> projectId, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     */
    @RequestLine("GET /rest/api/2/field")
    @Headers({
        "Accept: application/json"
    })
    List<FieldDetails> getFields();

    /**
     * Get fields paginated
     * <p>
     * Returns a [paginated](#pagination) list of fields for Classic Jira projects. The list can include:
     *  *
     * all fields
     * *
     * specific fields, by defining {@code id}
     * *
     * fields that contain a string in the field name or description, by defining {@code query}
     * *
     * specific fields that contain a string in the field name or description, by defining {@code id} and {@code query}
     * Only custom fields can be queried, {@code type} must be set to {@code custom}.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     * @param type                 The type of fields to search. (optional)
     * @param id                   The IDs of the custom fields to return or, where {@code query} is specified, filter. (optional)
     * @param query                String used to perform a case-insensitive partial match with field names or descriptions. (optional)
     * @param orderBy              [Order](#ordering) the results by a field:   *  {@code contextsCount} sorts by the number of contexts related to a field  *  {@code lastUsed} sorts by the date when the value of the field last changed  *  {@code name} sorts by the field name  *  {@code screensCount} sorts by the number of screens related to a field (optional)
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code key} returns the key for each field  *  {@code lastUsed} returns the date when the value of the field last changed  *  {@code screensCount} returns the number of screens related to a field  *  {@code contextsCount} returns the number of contexts related to a field  *  {@code isLocked} returns information about whether the field is [locked](https://confluence.atlassian.com/x/ZSN7Og)  *  {@code searcherKey} returns the searcher key for each custom field (optional)
     */
    @RequestLine("GET /rest/api/2/field/search?startAt={startAt}&maxResults={maxResults}&type={type}&id={id}&query={query}&orderBy={orderBy}&expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanField getFieldsPaginated(@Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("type") @Nullable List<String> type, @Param("id") @Nullable Set<String> id, @Param("query") @Nullable String query, @Param("orderBy") @Nullable String orderBy, @Param("expand") @Nullable String expand);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param id                   The ID of the filter to return. (required)
     * @param expand               Use [expand](#expansion) to include additional information about filter in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code sharedUsers} Returns the users that the filter is shared with. This includes users that can browse projects that the filter is shared with. If you don't specify {@code sharedUsers}, then the {@code sharedUsers} object is returned but it doesn't list any users. The list of users returned is limited to 1000, to access additional users append {@code [start-index:end-index]} to the expand request. For example, to access the next 1000 users, use {@code ?expand=sharedUsers[1001:2000]}.  *  {@code subscriptions} Returns the users that are subscribed to the filter. If you don't specify {@code subscriptions}, the {@code subscriptions} object is returned but it doesn't list any subscriptions. The list of subscriptions returned is limited to 1000, to access additional subscriptions append {@code [start-index:end-index]} to the expand request. For example, to access the next 1000 subscriptions, use {@code ?expand=subscriptions[1001:2000]}. (optional)
     * @param overrideSharePermissions EXPERIMENTAL: Whether share permissions are overridden to enable filters with any share permissions to be returned. Available to users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). (optional, defaults to false)
     */
    @RequestLine("GET /rest/api/2/filter/{id}?expand={expand}&overrideSharePermissions={overrideSharePermissions}")
    @Headers({
        "Accept: application/json"
    })
    Filter getFilter(@Param("id") @NotNull Long id, @Param("expand") @Nullable String expand, @Param("overrideSharePermissions") @Nullable Boolean overrideSharePermissions);

    /**
     * Search for filters
     * <p>
     * Returns a [paginated](#pagination) list of filters. Use this operation to get:
     *  *
     * specific filters, by defining {@code id} only.
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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param filterName           String used to perform a case-insensitive partial match with {@code name}. (optional)
     * @param accountId            User account ID used to return filters with the matching {@code owner.accountId}. This parameter cannot be used with {@code owner}. (optional)
     * @param owner                This parameter is deprecated because of privacy changes. Use {@code accountId} instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. User name used to return filters with the matching {@code owner.name}. This parameter cannot be used with {@code accountId}. (optional)
     * @param groupname            As a group's name can change, use of {@code groupId} is recommended to identify a group. Group name used to returns filters that are shared with a group that matches {@code sharePermissions.group.groupname}. This parameter cannot be used with the {@code groupId} parameter. (optional)
     * @param groupId              Group ID used to returns filters that are shared with a group that matches {@code sharePermissions.group.groupId}. This parameter cannot be used with the {@code groupname} parameter. (optional)
     * @param projectId            Project ID used to returns filters that are shared with a project that matches {@code sharePermissions.project.id}. (optional)
     * @param id                   The list of filter IDs. To include multiple IDs, provide an ampersand-separated list. For example, {@code id=10000&amp;id=10001}. Do not exceed 200 filter IDs. (optional)
     * @param orderBy              [Order](#ordering) the results by a field:   *  {@code description} Sorts by filter description. Note that this sorting works independently of whether the expand to display the description field is in use.  *  {@code favourite_count} Sorts by the count of how many users have this filter as a favorite.  *  {@code is_favourite} Sorts by whether the filter is marked as a favorite.  *  {@code id} Sorts by filter ID.  *  {@code name} Sorts by filter name.  *  {@code owner} Sorts by the ID of the filter owner.  *  {@code is_shared} Sorts by whether the filter is shared. (optional, defaults to name)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     * @param expand               Use [expand](#expansion) to include additional information about filter in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code description} Returns the description of the filter.  *  {@code favourite} Returns an indicator of whether the user has set the filter as a favorite.  *  {@code favouritedCount} Returns a count of how many users have set this filter as a favorite.  *  {@code jql} Returns the JQL query that the filter uses.  *  {@code owner} Returns the owner of the filter.  *  {@code searchUrl} Returns a URL to perform the filter's JQL query.  *  {@code sharePermissions} Returns the share permissions defined for the filter.  *  {@code editPermissions} Returns the edit permissions defined for the filter.  *  {@code isWritable} Returns whether the current user has permission to edit the filter.  *  {@code subscriptions} Returns the users that are subscribed to the filter.  *  {@code viewUrl} Returns a URL to view the filter. (optional)
     * @param overrideSharePermissions EXPERIMENTAL: Whether share permissions are overridden to enable filters with any share permissions to be returned. Available to users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). (optional, defaults to false)
     */
    @RequestLine("GET /rest/api/2/filter/search?filterName={filterName}&accountId={accountId}&owner={owner}&groupname={groupname}&groupId={groupId}&projectId={projectId}&id={id}&orderBy={orderBy}&startAt={startAt}&maxResults={maxResults}&expand={expand}&overrideSharePermissions={overrideSharePermissions}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanFilterDetails getFiltersPaginated(@Param("filterName") @Nullable String filterName, @Param("accountId") @Nullable String accountId, @Param("owner") @Nullable String owner, @Param("groupname") @Nullable String groupname, @Param("groupId") @Nullable String groupId, @Param("projectId") @Nullable Long projectId, @Param("id") @Nullable Set<Long> id, @Param("orderBy") @Nullable String orderBy, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("expand") @Nullable String expand, @Param("overrideSharePermissions") @Nullable Boolean overrideSharePermissions);

    /**
     * Get group
     * <p>
     * This operation is deprecated, use [{@code group/member}](#api-rest-api-2-group-member-get).
     * Returns all users in a group.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [read:jira-user]
     * @param groupname            As a group's name can change, use of {@code groupId} is recommended to identify a group.   The name of the group. This parameter cannot be used with the {@code groupId} parameter. (optional)
     * @param groupId              The ID of the group. This parameter cannot be used with the {@code groupName} parameter. (optional)
     * @param expand               List of fields to expand. (optional)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /rest/api/2/group?groupname={groupname}&groupId={groupId}&expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    Group getGroup(@Param("groupname") @Nullable String groupname, @Param("groupId") @Nullable String groupId, @Param("expand") @Nullable String expand);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param projectId            The ID of the project. (required)
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /rest/api/2/project/{projectId}/hierarchy")
    @Headers({
        "Accept: application/json"
    })
    ProjectIssueTypeHierarchy getHierarchy(@Param("projectId") @NotNull Long projectId);

    /**
     * Get IDs of deleted worklogs
     * <p>
     * Returns a list of IDs and delete timestamps for worklogs deleted after a date and time.
     * This resource is paginated, with a limit of 1000 worklogs per page. Each page lists worklogs from oldest to youngest. If the number of items in the date range exceeds 1000, {@code until} indicates the timestamp of the youngest item on the page. Also, {@code nextPage} provides the URL for the next page of worklogs. The {@code lastPage} parameter is set to true on the last page of worklogs.
     * This resource does not return worklogs deleted during the minute preceding the request.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param since                The date and time, as a UNIX timestamp in milliseconds, after which deleted worklogs are returned. (optional, defaults to 0)
     */
    @RequestLine("GET /rest/api/2/worklog/deleted?since={since}")
    @Headers({
        "Accept: application/json"
    })
    ChangedWorklogs getIdsOfWorklogsDeletedSince(@Param("since") @Nullable Long since);

    /**
     * Get IDs of updated worklogs
     * <p>
     * Returns a list of IDs and update timestamps for worklogs updated after a date and time.
     * This resource is paginated, with a limit of 1000 worklogs per page. Each page lists worklogs from oldest to youngest. If the number of items in the date range exceeds 1000, {@code until} indicates the timestamp of the youngest item on the page. Also, {@code nextPage} provides the URL for the next page of worklogs. The {@code lastPage} parameter is set to true on the last page of worklogs.
     * This resource does not return worklogs updated during the minute preceding the request.
     * **[Permissions](#permissions) required:** Permission to access Jira, however, worklogs are only returned where either of the following is true:
     *  *
     * the worklog is set as *Viewable by All Users*.
     * *
     * the user is a member of a project role or group with permission to view the worklog.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param since                The date and time, as a UNIX timestamp in milliseconds, after which updated worklogs are returned. (optional, defaults to 0)
     * @param expand               Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts {@code properties} that returns the properties of each worklog. (optional)
     */
    @RequestLine("GET /rest/api/2/worklog/updated?since={since}&expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    ChangedWorklogs getIdsOfWorklogsModifiedSince(@Param("since") @Nullable Long since, @Param("expand") @Nullable String expand);

    /**
     * Get is watching issue bulk
     * <p>
     * Returns, for the user, details of the watched status of issues from a list. If an issue ID is invalid, the returned watched status is {@code false}.
     * This operation requires the **Allow users to watch issues** option to be *ON*. This option is set in General configuration for Jira. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param issueList            A list of issue IDs. (required)
     */
    @RequestLine("POST /rest/api/2/issue/watching")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    BulkIssueIsWatching getIsWatchingIssueBulk(@NotNull IssueList issueList);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     * @param fields               A list of fields to return for the issue. This parameter accepts a comma-separated list. Use it to retrieve a subset of fields. Allowed values:   *  {@code *all} Returns all fields.  *  {@code *navigable} Returns navigable fields.  *  Any issue field, prefixed with a minus to exclude.  Examples:   *  {@code summary,comment} Returns only the summary and comments fields.  *  {@code -description} Returns all (default) fields except description.  *  {@code *navigable,-comment} Returns all navigable fields except comment.  This parameter may be specified multiple times. For example, {@code fields=field1,field2&amp; fields=field3}.  Note: All fields are returned by default. This differs from [Search for issues using JQL (GET)](#api-rest-api-2-search-get) and [Search for issues using JQL (POST)](#api-rest-api-2-search-post) where the default is all navigable fields. (optional)
     * @param fieldsByKeys         Whether fields in {@code fields} are referenced by keys rather than IDs. This parameter is useful where fields have been added by a connect app and a field's key may differ from its ID. (optional, defaults to false)
     * @param expand               Use [expand](#expansion) to include additional information about the issues in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code renderedFields} Returns field values rendered in HTML format.  *  {@code names} Returns the display name of each field.  *  {@code schema} Returns the schema describing a field type.  *  {@code transitions} Returns all possible transitions for the issue.  *  {@code editmeta} Returns information about how each field can be edited.  *  {@code changelog} Returns a list of recent updates to an issue, sorted by date, starting from the most recent.  *  {@code versionedRepresentations} Returns a JSON array for each version of a field's value, with the highest number representing the most recent version. Note: When included in the request, the {@code fields} parameter is ignored. (optional)
     * @param properties           A list of issue properties to return for the issue. This parameter accepts a comma-separated list. Allowed values:   *  {@code *all} Returns all issue properties.  *  Any issue property key, prefixed with a minus to exclude.  Examples:   *  {@code *all} Returns all properties.  *  {@code *all,-prop1} Returns all properties except {@code prop1}.  *  {@code prop1,prop2} Returns {@code prop1} and {@code prop2} properties.  This parameter may be specified multiple times. For example, {@code properties=prop1,prop2&amp; properties=prop3}. (optional)
     * @param updateHistory        Whether the project in which the issue is created is added to the user's **Recently viewed** project list, as shown under **Projects** in Jira. This also populates the [JQL issues search](#api-rest-api-2-search-get) {@code lastViewed} field. (optional, defaults to false)
     */
    @RequestLine("GET /rest/api/2/issue/{issueIdOrKey}?fields={fields}&fieldsByKeys={fieldsByKeys}&expand={expand}&properties={properties}&updateHistory={updateHistory}")
    @Headers({
        "Accept: application/json"
    })
    IssueBean getIssue(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @Param("fields") @Nullable List<String> fields, @Param("fieldsByKeys") @Nullable Boolean fieldsByKeys, @Param("expand") @Nullable String expand, @Param("properties") @Nullable List<String> properties, @Param("updateHistory") @Nullable Boolean updateHistory);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     */
    @RequestLine("GET /rest/api/2/issuetype")
    @Headers({
        "Accept: application/json"
    })
    List<IssueTypeDetails> getIssueAllTypes();

    /**
     * Get issue field option
     * <p>
     * Returns an option from a select list issue field.
     * Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param fieldKey             The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the {@code fieldKey} value, do one of the following:   *  open the app's plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the {@code jiraIssueFields} module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-2-field-get) and in the field details the value is returned in {@code key}. For example, {@code "key": "teams-add-on__team-issue-field"} (required)
     * @param optionId             The ID of the option to be returned. (required)
     */
    @RequestLine("GET /rest/api/2/field/{fieldKey}/option/{optionId}")
    @Headers({
        "Accept: application/json"
    })
    IssueFieldOption getIssueFieldOption(@Param("fieldKey") @NotNull String fieldKey, @Param("optionId") @NotNull Long optionId);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param linkId               The ID of the issue link. (required)
     */
    @RequestLine("GET /rest/api/2/issueLink/{linkId}")
    @Headers({
        "Accept: application/json"
    })
    IssueLink getIssueLink(@Param("linkId") @NotNull String linkId);

    /**
     * Get issue link type
     * <p>
     * Returns an issue link type.
     * To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project in the site.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param issueLinkTypeId      The ID of the issue link type. (required)
     */
    @RequestLine("GET /rest/api/2/issueLinkType/{issueLinkTypeId}")
    @Headers({
        "Accept: application/json"
    })
    IssueLinkType getIssueLinkType(@Param("issueLinkTypeId") @NotNull String issueLinkTypeId);

    /**
     * Get issue link types
     * <p>
     * Returns a list of all issue link types.
     * To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project in the site.
     *
     * Authentication - Required Scopes: [read:jira-work]
     */
    @RequestLine("GET /rest/api/2/issueLinkType")
    @Headers({
        "Accept: application/json"
    })
    IssueLinkTypes getIssueLinkTypes();

    /**
     * Get issue navigator default columns
     * <p>
     * Returns the default issue navigator columns.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     */
    @RequestLine("GET /rest/api/2/settings/columns")
    @Headers({
        "Accept: application/json"
    })
    List<ColumnItem> getIssueNavigatorDefaultColumns();

    /**
     * Get issue picker suggestions
     * <p>
     * Returns lists of issues matching a query string. Use this resource to provide auto-completion suggestions when the user is looking for an issue using a word or string.
     * This operation returns two lists:
     *  *
     * {@code History Search} which includes issues from the user's history of created, edited, or viewed issues that contain the string in the {@code query} parameter.
     * *
     * {@code Current Search} which includes issues that match the JQL expression in {@code currentJQL} and contain the string in the {@code query} parameter.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param query                A string to match against text fields in the issue such as title, description, or comments. (optional)
     * @param currentJQL           A JQL query defining a list of issues to search for the query term. Note that {@code username} and {@code userkey} cannot be used as search terms for this parameter, due to privacy reasons. Use {@code accountId} instead. (optional)
     * @param currentIssueKey      The key of an issue to exclude from search results. For example, the issue the user is viewing when they perform this query. (optional)
     * @param currentProjectId     The ID of a project that suggested issues must belong to. (optional)
     * @param showSubTasks         Indicate whether to include subtasks in the suggestions list. (optional)
     * @param showSubTaskParent    When {@code currentIssueKey} is a subtask, whether to include the parent issue in the suggestions if it matches the query. (optional)
     */
    @RequestLine("GET /rest/api/2/issue/picker?query={query}&currentJQL={currentJQL}&currentIssueKey={currentIssueKey}&currentProjectId={currentProjectId}&showSubTasks={showSubTasks}&showSubTaskParent={showSubTaskParent}")
    @Headers({
        "Accept: application/json"
    })
    IssuePickerSuggestions getIssuePickerResource(@Param("query") @Nullable String query, @Param("currentJQL") @Nullable String currentJQL, @Param("currentIssueKey") @Nullable String currentIssueKey, @Param("currentProjectId") @Nullable String currentProjectId, @Param("showSubTasks") @Nullable Boolean showSubTasks, @Param("showSubTaskParent") @Nullable Boolean showSubTaskParent);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param issueIdOrKey         The key or ID of the issue. (required)
     * @param propertyKey          The key of the property. (required)
     */
    @RequestLine("GET /rest/api/2/issue/{issueIdOrKey}/properties/{propertyKey}")
    @Headers({
        "Accept: application/json"
    })
    EntityProperty getIssueProperty(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @Param("propertyKey") @NotNull String propertyKey);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param issueIdOrKey         The key or ID of the issue. (required)
     */
    @RequestLine("GET /rest/api/2/issue/{issueIdOrKey}/properties")
    @Headers({
        "Accept: application/json"
    })
    PropertyKeys getIssuePropertyKeys(@Param("issueIdOrKey") @NotNull String issueIdOrKey);

    /**
     * Get issue security level
     * <p>
     * Returns details of an issue security level.
     * Use [Get issue security scheme](#api-rest-api-2-issuesecurityschemes-id-get) to obtain the IDs of issue security levels associated with the issue security scheme.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the issue security level. (required)
     */
    @RequestLine("GET /rest/api/2/securitylevel/{id}")
    @Headers({
        "Accept: application/json"
    })
    SecurityLevel getIssueSecurityLevel(@Param("id") @NotNull String id);

    /**
     * Get issue security level members
     * <p>
     * Returns issue security level members.
     * Only issue security level members in context of classic projects are returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param issueSecuritySchemeId The ID of the issue security scheme. Use the [Get issue security schemes](#api-rest-api-2-issuesecurityschemes-get) operation to get a list of issue security scheme IDs. (required)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     * @param issueSecurityLevelId The list of issue security level IDs. To include multiple issue security levels separate IDs with ampersand: {@code issueSecurityLevelId=10000&amp;issueSecurityLevelId=10001}. (optional)
     * @param expand               Use expand to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code all} Returns all expandable information.  *  {@code field} Returns information about the custom field granted the permission.  *  {@code group} Returns information about the group that is granted the permission.  *  {@code projectRole} Returns information about the project role granted the permission.  *  {@code user} Returns information about the user who is granted the permission. (optional)
     */
    @RequestLine("GET /rest/api/2/issuesecurityschemes/{issueSecuritySchemeId}/members?startAt={startAt}&maxResults={maxResults}&issueSecurityLevelId={issueSecurityLevelId}&expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanIssueSecurityLevelMember getIssueSecurityLevelMembers(@Param("issueSecuritySchemeId") @NotNull Long issueSecuritySchemeId, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("issueSecurityLevelId") @Nullable Set<Long> issueSecurityLevelId, @Param("expand") @Nullable String expand);

    /**
     * Get issue security scheme
     * <p>
     * Returns an issue security scheme along with its security levels.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * *
     * *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project that uses the requested issue security scheme.
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param id                   The ID of the issue security scheme. Use the [Get issue security schemes](#api-rest-api-2-issuesecurityschemes-get) operation to get a list of issue security scheme IDs. (required)
     */
    @RequestLine("GET /rest/api/2/issuesecurityschemes/{id}")
    @Headers({
        "Accept: application/json"
    })
    SecurityScheme getIssueSecurityScheme(@Param("id") @NotNull Long id);

    /**
     * Get issue security schemes
     * <p>
     * Returns all [issue security schemes](https://confluence.atlassian.com/x/J4lKLg).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     */
    @RequestLine("GET /rest/api/2/issuesecurityschemes")
    @Headers({
        "Accept: application/json"
    })
    SecuritySchemes getIssueSecuritySchemes();

    /**
     * Get issue type
     * <p>
     * Returns an issue type.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) in a project the issue type is associated with or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param id                   The ID of the issue type. (required)
     */
    @RequestLine("GET /rest/api/2/issuetype/{id}")
    @Headers({
        "Accept: application/json"
    })
    IssueTypeDetails getIssueType(@Param("id") @NotNull String id);

    /**
     * Get issue types for custom field context
     * <p>
     * Returns a [paginated](#pagination) list of context to issue type mappings for a custom field. Mappings are returned for all contexts or a list of contexts. Mappings are ordered first by context ID and then by issue type ID.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param fieldId              The ID of the custom field. (required)
     * @param contextId            The ID of the context. To include multiple contexts, provide an ampersand-separated list. For example, {@code contextId=10001&amp;contextId=10002}. (optional)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     */
    @RequestLine("GET /rest/api/2/field/{fieldId}/context/issuetypemapping?contextId={contextId}&startAt={startAt}&maxResults={maxResults}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanIssueTypeToContextMapping getIssueTypeMappingsForContexts(@Param("fieldId") @NotNull String fieldId, @Param("contextId") @Nullable List<Long> contextId, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param issueTypeId          The ID of the issue type. (required)
     * @param propertyKey          The key of the property. Use [Get issue type property keys](#api-rest-api-2-issuetype-issueTypeId-properties-get) to get a list of all issue type property keys. (required)
     */
    @RequestLine("GET /rest/api/2/issuetype/{issueTypeId}/properties/{propertyKey}")
    @Headers({
        "Accept: application/json"
    })
    EntityProperty getIssueTypeProperty(@Param("issueTypeId") @NotNull String issueTypeId, @Param("propertyKey") @NotNull String propertyKey);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param issueTypeId          The ID of the issue type. (required)
     */
    @RequestLine("GET /rest/api/2/issuetype/{issueTypeId}/properties")
    @Headers({
        "Accept: application/json"
    })
    PropertyKeys getIssueTypePropertyKeys(@Param("issueTypeId") @NotNull String issueTypeId);

    /**
     * Get issue type schemes for projects
     * <p>
     * Returns a [paginated](#pagination) list of issue type schemes and, for each issue type scheme, a list of the projects that use it.
     * Only issue type schemes used in classic projects are returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param projectId            The list of project IDs. To include multiple project IDs, provide an ampersand-separated list. For example, {@code projectId=10000&amp;projectId=10001}. (required)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     */
    @RequestLine("GET /rest/api/2/issuetypescheme/project?startAt={startAt}&maxResults={maxResults}&projectId={projectId}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanIssueTypeSchemeProjects getIssueTypeSchemeForProjects(@Param("projectId") @NotNull Set<Long> projectId, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults);

    /**
     * Get issue type scheme items
     * <p>
     * Returns a [paginated](#pagination) list of issue type scheme items.
     * Only issue type scheme items used in classic projects are returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     * @param issueTypeSchemeId    The list of issue type scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, {@code issueTypeSchemeId=10000&amp;issueTypeSchemeId=10001}. (optional)
     */
    @RequestLine("GET /rest/api/2/issuetypescheme/mapping?startAt={startAt}&maxResults={maxResults}&issueTypeSchemeId={issueTypeSchemeId}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanIssueTypeSchemeMapping getIssueTypeSchemesMapping(@Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("issueTypeSchemeId") @Nullable Set<Long> issueTypeSchemeId);

    /**
     * Get issue type screen scheme items
     * <p>
     * Returns a [paginated](#pagination) list of issue type screen scheme items.
     * Only issue type screen schemes used in classic projects are returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     * @param issueTypeScreenSchemeId The list of issue type screen scheme IDs. To include multiple issue type screen schemes, separate IDs with ampersand: {@code issueTypeScreenSchemeId=10000&amp;issueTypeScreenSchemeId=10001}. (optional)
     */
    @RequestLine("GET /rest/api/2/issuetypescreenscheme/mapping?startAt={startAt}&maxResults={maxResults}&issueTypeScreenSchemeId={issueTypeScreenSchemeId}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanIssueTypeScreenSchemeItem getIssueTypeScreenSchemeMappings(@Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("issueTypeScreenSchemeId") @Nullable Set<Long> issueTypeScreenSchemeId);

    /**
     * Get issue type screen schemes for projects
     * <p>
     * Returns a [paginated](#pagination) list of issue type screen schemes and, for each issue type screen scheme, a list of the projects that use it.
     * Only issue type screen schemes used in classic projects are returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param projectId            The list of project IDs. To include multiple projects, separate IDs with ampersand: {@code projectId=10000&amp;projectId=10001}. (required)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     */
    @RequestLine("GET /rest/api/2/issuetypescreenscheme/project?startAt={startAt}&maxResults={maxResults}&projectId={projectId}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanIssueTypeScreenSchemesProjects getIssueTypeScreenSchemeProjectAssociations(@Param("projectId") @NotNull Set<Long> projectId, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults);

    /**
     * Get issue type screen schemes
     * <p>
     * Returns a [paginated](#pagination) list of issue type screen schemes.
     * Only issue type screen schemes used in classic projects are returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     * @param id                   The list of issue type screen scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, {@code id=10000&amp;id=10001}. (optional)
     * @param queryString          String used to perform a case-insensitive partial match with issue type screen scheme name. (optional)
     * @param orderBy              [Order](#ordering) the results by a field:   *  {@code name} Sorts by issue type screen scheme name.  *  {@code id} Sorts by issue type screen scheme ID. (optional, defaults to id)
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts {@code projects} that, for each issue type screen schemes, returns information about the projects the issue type screen scheme is assigned to. (optional)
     */
    @RequestLine("GET /rest/api/2/issuetypescreenscheme?startAt={startAt}&maxResults={maxResults}&id={id}&queryString={queryString}&orderBy={orderBy}&expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanIssueTypeScreenScheme getIssueTypeScreenSchemes(@Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("id") @Nullable Set<Long> id, @Param("queryString") @Nullable String queryString, @Param("orderBy") @Nullable String orderBy, @Param("expand") @Nullable String expand);

    /**
     * Get issue types for project
     * <p>
     * Returns issue types for a project.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) in the relevant project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param projectId            The ID of the project. (required)
     * @param level                The level of the issue type to filter by. Use:   *  {@code -1} for Subtask.  *  {@code 0} for Base.  *  {@code 1} for Epic. (optional)
     */
    @RequestLine("GET /rest/api/2/issuetype/project?projectId={projectId}&level={level}")
    @Headers({
        "Accept: application/json"
    })
    List<IssueTypeDetails> getIssueTypesForProject(@Param("projectId") @NotNull Long projectId, @Param("level") @Nullable Integer level);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     */
    @RequestLine("GET /rest/api/2/issue/{issueIdOrKey}/watchers")
    @Headers({
        "Accept: application/json"
    })
    Watchers getIssueWatchers(@Param("issueIdOrKey") @NotNull String issueIdOrKey);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 5000)
     * @param startedAfter         The worklog start date and time, as a UNIX timestamp in milliseconds, after which worklogs are returned. (optional)
     * @param startedBefore        The worklog start date and time, as a UNIX timestamp in milliseconds, before which worklogs are returned. (optional)
     * @param expand               Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts{@code properties}, which returns worklog properties. (optional)
     */
    @RequestLine("GET /rest/api/2/issue/{issueIdOrKey}/worklog?startAt={startAt}&maxResults={maxResults}&startedAfter={startedAfter}&startedBefore={startedBefore}&expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    PageOfWorklogs getIssueWorklog(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("startedAfter") @Nullable Long startedAfter, @Param("startedBefore") @Nullable Long startedBefore, @Param("expand") @Nullable String expand);

    /**
     * Get license
     * <p>
     * Returns licensing information about the Jira instance.
     * **[Permissions](#permissions) required:** None.
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     */
    @RequestLine("GET /rest/api/2/instance/license")
    @Headers({
        "Accept: application/json"
    })
    License getLicense();

    /**
     * Get locale
     * <p>
     * Returns the locale for the user.
     * If the user has no language preference set (which is the default setting) or this resource is accessed anonymous, the browser locale detected by Jira is returned. Jira detects the browser locale using the *Accept-Language* header in the request. However, if this doesn't match a locale available Jira, the site default locale is returned.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     */
    @RequestLine("GET /rest/api/2/mypreferences/locale")
    @Headers({
        "Accept: application/json"
    })
    Locale getLocale();

    /**
     * Get my filters
     * <p>
     * Returns the filters owned by the user. If {@code includeFavourites} is {@code true}, the user's visible favorite filters are also returned.
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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param expand               Use [expand](#expansion) to include additional information about filter in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code sharedUsers} Returns the users that the filter is shared with. This includes users that can browse projects that the filter is shared with. If you don't specify {@code sharedUsers}, then the {@code sharedUsers} object is returned but it doesn't list any users. The list of users returned is limited to 1000, to access additional users append {@code [start-index:end-index]} to the expand request. For example, to access the next 1000 users, use {@code ?expand=sharedUsers[1001:2000]}.  *  {@code subscriptions} Returns the users that are subscribed to the filter. If you don't specify {@code subscriptions}, the {@code subscriptions} object is returned but it doesn't list any subscriptions. The list of subscriptions returned is limited to 1000, to access additional subscriptions append {@code [start-index:end-index]} to the expand request. For example, to access the next 1000 subscriptions, use {@code ?expand=subscriptions[1001:2000]}. (optional)
     * @param includeFavourites    Include the user's favorite filters in the response. (optional, defaults to false)
     */
    @RequestLine("GET /rest/api/2/filter/my?expand={expand}&includeFavourites={includeFavourites}")
    @Headers({
        "Accept: application/json"
    })
    List<Filter> getMyFilters(@Param("expand") @Nullable String expand, @Param("includeFavourites") @Nullable Boolean includeFavourites);

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
     * for a comment, where the user has both the permission to browse the comment and the project permission for the comment's parent issue. Only the BROWSE\\_PROJECTS permission is supported. If a {@code commentId} is provided whose {@code permissions} does not equal BROWSE\\_PROJECTS, a 400 error will be returned.
     * This means that users may be shown as having an issue permission (such as EDIT\\_ISSUES) in the global context or a project context but may not have the permission for any or all issues. For example, if Reporters have the EDIT\\_ISSUES permission a user would be shown as having this permission in the global context or the context of a project, because any user can be a reporter. However, if they are not the user who reported the issue queried they would not have EDIT\\_ISSUES permission for that issue.
     * Global permissions are unaffected by context.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     *
     * @param projectKey           The key of project. Ignored if {@code projectId} is provided. (optional)
     * @param projectId            The ID of project. (optional)
     * @param issueKey             The key of the issue. Ignored if {@code issueId} is provided. (optional)
     * @param issueId              The ID of the issue. (optional)
     * @param permissions          A list of permission keys. (Required) This parameter accepts a comma-separated list. To get the list of available permissions, use [Get all permissions](#api-rest-api-2-permissions-get). (optional)
     * @param projectUuid           (optional)
     * @param projectConfigurationUuid  (optional)
     * @param commentId            The ID of the comment. (optional)
     */
    @RequestLine("GET /rest/api/2/mypermissions?projectKey={projectKey}&projectId={projectId}&issueKey={issueKey}&issueId={issueId}&permissions={permissions}&projectUuid={projectUuid}&projectConfigurationUuid={projectConfigurationUuid}&commentId={commentId}")
    @Headers({
        "Accept: application/json"
    })
    Permissions getMyPermissions(@Param("projectKey") @Nullable String projectKey, @Param("projectId") @Nullable String projectId, @Param("issueKey") @Nullable String issueKey, @Param("issueId") @Nullable String issueId, @Param("permissions") @Nullable String permissions, @Param("projectUuid") @Nullable String projectUuid, @Param("projectConfigurationUuid") @Nullable String projectConfigurationUuid, @Param("commentId") @Nullable String commentId);

    /**
     * Get notification scheme
     * <p>
     * Returns a [notification scheme](https://confluence.atlassian.com/x/8YdKLg), including the list of events and the recipients who will receive notifications for those events.
     * **[Permissions](#permissions) required:** Permission to access Jira, however, the user must have permission to administer at least one project associated with the notification scheme.
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the notification scheme. Use [Get notification schemes paginated](#api-rest-api-2-notificationscheme-get) to get a list of notification scheme IDs. (required)
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code all} Returns all expandable information  *  {@code field} Returns information about any custom fields assigned to receive an event  *  {@code group} Returns information about any groups assigned to receive an event  *  {@code notificationSchemeEvents} Returns a list of event associations. This list is returned for all expandable information  *  {@code projectRole} Returns information about any project roles assigned to receive an event  *  {@code user} Returns information about any users assigned to receive an event (optional)
     */
    @RequestLine("GET /rest/api/2/notificationscheme/{id}?expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    NotificationScheme getNotificationScheme(@Param("id") @NotNull Long id, @Param("expand") @Nullable String expand);

    /**
     * Get project notification scheme
     * <p>
     * Gets a [notification scheme](https://confluence.atlassian.com/x/8YdKLg) associated with the project.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param projectKeyOrId       The project ID or project key (case sensitive). (required)
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code all} Returns all expandable information  *  {@code field} Returns information about any custom fields assigned to receive an event  *  {@code group} Returns information about any groups assigned to receive an event  *  {@code notificationSchemeEvents} Returns a list of event associations. This list is returned for all expandable information  *  {@code projectRole} Returns information about any project roles assigned to receive an event  *  {@code user} Returns information about any users assigned to receive an event (optional)
     */
    @RequestLine("GET /rest/api/2/project/{projectKeyOrId}/notificationscheme?expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    NotificationScheme getNotificationSchemeForProject(@Param("projectKeyOrId") @NotNull String projectKeyOrId, @Param("expand") @Nullable String expand);

    /**
     * Get projects using notification schemes paginated
     * <p>
     * Returns a [paginated](#pagination) mapping of project that have notification scheme assigned. You can provide either one or multiple notification scheme IDs or project IDs to filter by. If you don't provide any, this will return a list of all mappings. Note that only company-managed (classic) projects are supported. This is because team-managed projects don't have a concept of a default notification scheme. The mappings are ordered by projectId.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     * @param notificationSchemeId The list of notifications scheme IDs to be filtered out (optional)
     * @param projectId            The list of project IDs to be filtered out (optional)
     */
    @RequestLine("GET /rest/api/2/notificationscheme/project?startAt={startAt}&maxResults={maxResults}&notificationSchemeId={notificationSchemeId}&projectId={projectId}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanNotificationSchemeAndProjectMappingJsonBean getNotificationSchemeToProjectMappings(@Param("startAt") @Nullable String startAt, @Param("maxResults") @Nullable String maxResults, @Param("notificationSchemeId") @Nullable Set<String> notificationSchemeId, @Param("projectId") @Nullable Set<String> projectId);

    /**
     * Get notification schemes paginated
     * <p>
     * Returns a [paginated](#pagination) list of [notification schemes](https://confluence.atlassian.com/x/8YdKLg) ordered by the display name.
     * *Note that you should allow for events without recipients to appear in responses.*
     * **[Permissions](#permissions) required:** Permission to access Jira, however, the user must have permission to administer at least one project associated with a notification scheme for it to be returned.
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     * @param id                   The list of notification schemes IDs to be filtered by (optional)
     * @param projectId            The list of projects IDs to be filtered by (optional)
     * @param onlyDefault          When set to true, returns only the default notification scheme. If you provide project IDs not associated with the default, returns an empty page. The default value is false. (optional, defaults to false)
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code all} Returns all expandable information  *  {@code field} Returns information about any custom fields assigned to receive an event  *  {@code group} Returns information about any groups assigned to receive an event  *  {@code notificationSchemeEvents} Returns a list of event associations. This list is returned for all expandable information  *  {@code projectRole} Returns information about any project roles assigned to receive an event  *  {@code user} Returns information about any users assigned to receive an event (optional)
     */
    @RequestLine("GET /rest/api/2/notificationscheme?startAt={startAt}&maxResults={maxResults}&id={id}&projectId={projectId}&onlyDefault={onlyDefault}&expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanNotificationScheme getNotificationSchemes(@Param("startAt") @Nullable String startAt, @Param("maxResults") @Nullable String maxResults, @Param("id") @Nullable Set<String> id, @Param("projectId") @Nullable Set<String> projectId, @Param("onlyDefault") @Nullable Boolean onlyDefault, @Param("expand") @Nullable String expand);

    /**
     * Get custom field options (context)
     * <p>
     * Returns a [paginated](#pagination) list of all custom field option for a context. Options are returned first then cascading options, in the order they display in Jira.
     * This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param fieldId              The ID of the custom field. (required)
     * @param contextId            The ID of the context. (required)
     * @param optionId             The ID of the option. (optional)
     * @param onlyOptions          Whether only options are returned. (optional, defaults to false)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 100)
     */
    @RequestLine("GET /rest/api/2/field/{fieldId}/context/{contextId}/option?optionId={optionId}&onlyOptions={onlyOptions}&startAt={startAt}&maxResults={maxResults}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanCustomFieldContextOption getOptionsForContext(@Param("fieldId") @NotNull String fieldId, @Param("contextId") @NotNull Long contextId, @Param("optionId") @Nullable Long optionId, @Param("onlyOptions") @Nullable Boolean onlyOptions, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults);

    /**
     * Get permission scheme
     * <p>
     * Returns a permission scheme.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param schemeId             The ID of the permission scheme to return. (required)
     * @param expand               Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are included when you specify any value. Expand options include:   *  {@code all} Returns all expandable information.  *  {@code field} Returns information about the custom field granted the permission.  *  {@code group} Returns information about the group that is granted the permission.  *  {@code permissions} Returns all permission grants for each permission scheme.  *  {@code projectRole} Returns information about the project role granted the permission.  *  {@code user} Returns information about the user who is granted the permission. (optional)
     */
    @RequestLine("GET /rest/api/2/permissionscheme/{schemeId}?expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    PermissionScheme getPermissionScheme(@Param("schemeId") @NotNull Long schemeId, @Param("expand") @Nullable String expand);

    /**
     * Get permission scheme grant
     * <p>
     * Returns a permission grant.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param schemeId             The ID of the permission scheme. (required)
     * @param permissionId         The ID of the permission grant. (required)
     * @param expand               Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  {@code all} Returns all expandable information.  *  {@code field} Returns information about the custom field granted the permission.  *  {@code group} Returns information about the group that is granted the permission.  *  {@code permissions} Returns all permission grants for each permission scheme.  *  {@code projectRole} Returns information about the project role granted the permission.  *  {@code user} Returns information about the user who is granted the permission. (optional)
     */
    @RequestLine("GET /rest/api/2/permissionscheme/{schemeId}/permission/{permissionId}?expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    PermissionGrant getPermissionSchemeGrant(@Param("schemeId") @NotNull Long schemeId, @Param("permissionId") @NotNull Long permissionId, @Param("expand") @Nullable String expand);

    /**
     * Get permission scheme grants
     * <p>
     * Returns all permission grants for a permission scheme.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param schemeId             The ID of the permission scheme. (required)
     * @param expand               Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  {@code permissions} Returns all permission grants for each permission scheme.  *  {@code user} Returns information about the user who is granted the permission.  *  {@code group} Returns information about the group that is granted the permission.  *  {@code projectRole} Returns information about the project role granted the permission.  *  {@code field} Returns information about the custom field granted the permission.  *  {@code all} Returns all expandable information. (optional)
     */
    @RequestLine("GET /rest/api/2/permissionscheme/{schemeId}/permission?expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    PermissionGrants getPermissionSchemeGrants(@Param("schemeId") @NotNull Long schemeId, @Param("expand") @Nullable String expand);

    /**
     * Get permitted projects
     * <p>
     * Returns all the projects where the user is granted a list of project permissions.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     *
     * @param permissionsKeysBean   (required)
     */
    @RequestLine("POST /rest/api/2/permissions/project")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    PermittedProjects getPermittedProjects(@NotNull PermissionsKeysBean permissionsKeysBean);

    /**
     * Get precomputations (apps)
     * <p>
     * Returns the list of a function's precomputations along with information about when they were created, updated, and last used. Each precomputation has a {@code value} \\- the JQL fragment to replace the custom function clause with.
     * **[Permissions](#permissions) required:** This API is only accessible to apps and apps can only inspect their own functions.
     *
     * @param functionKey          The function key in format:   *  Forge: {@code ari:cloud:ecosystem::extension/[App ID]/[Environment ID]/static/[Function key from manifest]}  *  Connect: {@code [App key]__[Module key]} (optional)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 100)
     * @param orderBy              [Order](#ordering) the results by a field:   *  {@code functionKey} Sorts by the functionKey.  *  {@code used} Sorts by the used timestamp.  *  {@code created} Sorts by the created timestamp.  *  {@code updated} Sorts by the updated timestamp. (optional)
     */
    @RequestLine("GET /rest/api/2/jql/function/computation?functionKey={functionKey}&startAt={startAt}&maxResults={maxResults}&orderBy={orderBy}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanJqlFunctionPrecomputationBean getPrecomputations(@Param("functionKey") @Nullable List<String> functionKey, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("orderBy") @Nullable String orderBy);

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
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param key                  The key of the preference. (required)
     */
    @RequestLine("GET /rest/api/2/mypreferences?key={key}")
    @Headers({
        "Accept: application/json"
    })
    String getPreference(@Param("key") @NotNull String key);

    /**
     * Get priorities
     * <p>
     * Returns the list of all issue priorities.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /rest/api/2/priority")
    @Headers({
        "Accept: application/json"
    })
    List<Priority> getPriorities();

    /**
     * Get priority
     * <p>
     * Returns an issue priority.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param id                   The ID of the issue priority. (required)
     */
    @RequestLine("GET /rest/api/2/priority/{id}")
    @Headers({
        "Accept: application/json"
    })
    Priority getPriority(@Param("id") @NotNull String id);

    /**
     * Get project
     * <p>
     * Returns the [project details](https://confluence.atlassian.com/x/ahLpNw) for a project.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param projectIdOrKey       The project ID or project key (case sensitive). (required)
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Note that the project description, issue types, and project lead are included in all responses by default. Expand options include:   *  {@code description} The project description.  *  {@code issueTypes} The issue types associated with the project.  *  {@code lead} The project lead.  *  {@code projectKeys} All project keys associated with the project.  *  {@code issueTypeHierarchy} The project issue type hierarchy. (optional)
     * @param properties           A list of project properties to return for the project. This parameter accepts a comma-separated list. (optional)
     */
    @RequestLine("GET /rest/api/2/project/{projectIdOrKey}?expand={expand}&properties={properties}")
    @Headers({
        "Accept: application/json"
    })
    Project getProject(@Param("projectIdOrKey") @NotNull String projectIdOrKey, @Param("expand") @Nullable String expand, @Param("properties") @Nullable List<String> properties);

    /**
     * Get project category by ID
     * <p>
     * Returns a project category.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param id                   The ID of the project category. (required)
     */
    @RequestLine("GET /rest/api/2/projectCategory/{id}")
    @Headers({
        "Accept: application/json"
    })
    ProjectCategory getProjectCategoryById(@Param("id") @NotNull Long id);

    /**
     * Get project components
     * <p>
     * Returns all components in a project. See the [Get project components paginated](#api-rest-api-2-project-projectIdOrKey-component-get) resource if you want to get a full list of components with pagination.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param projectIdOrKey       The project ID or project key (case sensitive). (required)
     */
    @RequestLine("GET /rest/api/2/project/{projectIdOrKey}/components")
    @Headers({
        "Accept: application/json"
    })
    List<ProjectComponent> getProjectComponents(@Param("projectIdOrKey") @NotNull String projectIdOrKey);

    /**
     * Get project components paginated
     * <p>
     * Returns a [paginated](#pagination) list of all components in a project. See the [Get project components](#api-rest-api-2-project-projectIdOrKey-components-get) resource if you want to get a full list of versions without pagination.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param projectIdOrKey       The project ID or project key (case sensitive). (required)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     * @param orderBy              [Order](#ordering) the results by a field:   *  {@code description} Sorts by the component description.  *  {@code issueCount} Sorts by the count of issues associated with the component.  *  {@code lead} Sorts by the user key of the component's project lead.  *  {@code name} Sorts by component name. (optional)
     * @param query                Filter the results using a literal string. Components with a matching {@code name} or {@code description} are returned (case insensitive). (optional)
     */
    @RequestLine("GET /rest/api/2/project/{projectIdOrKey}/component?startAt={startAt}&maxResults={maxResults}&orderBy={orderBy}&query={query}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanComponentWithIssueCount getProjectComponentsPaginated(@Param("projectIdOrKey") @NotNull String projectIdOrKey, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("orderBy") @Nullable String orderBy, @Param("query") @Nullable String query);

    /**
     * Get project mappings for custom field context
     * <p>
     * Returns a [paginated](#pagination) list of context to project mappings for a custom field. The result can be filtered by {@code contextId}. Otherwise, all mappings are returned. Invalid IDs are ignored.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param fieldId              The ID of the custom field, for example {@code customfield\\_10000}. (required)
     * @param contextId            The list of context IDs. To include multiple context, separate IDs with ampersand: {@code contextId=10000&amp;contextId=10001}. (optional)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     */
    @RequestLine("GET /rest/api/2/field/{fieldId}/context/projectmapping?contextId={contextId}&startAt={startAt}&maxResults={maxResults}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanCustomFieldContextProjectMapping getProjectContextMapping(@Param("fieldId") @NotNull String fieldId, @Param("contextId") @Nullable Set<Long> contextId, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults);

    /**
     * Get project's sender email
     * <p>
     * Returns the [project's sender email address](https://confluence.atlassian.com/x/dolKLg).
     * **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param projectId            The project ID. (required)
     */
    @RequestLine("GET /rest/api/2/project/{projectId}/email")
    @Headers({
        "Accept: application/json"
    })
    ProjectEmailAddress getProjectEmail(@Param("projectId") @NotNull Long projectId);

    /**
     * Get project issue security scheme
     * <p>
     * Returns the [issue security scheme](https://confluence.atlassian.com/x/J4lKLg) associated with the project.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or the *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param projectKeyOrId       The project ID or project key (case sensitive). (required)
     */
    @RequestLine("GET /rest/api/2/project/{projectKeyOrId}/issuesecuritylevelscheme")
    @Headers({
        "Accept: application/json"
    })
    SecurityScheme getProjectIssueSecurityScheme(@Param("projectKeyOrId") @NotNull String projectKeyOrId);

    /**
     * Get project property
     * <p>
     * Returns the value of a [project property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties).
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the property.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param projectIdOrKey       The project ID or project key (case sensitive). (required)
     * @param propertyKey          The project property key. Use [Get project property keys](#api-rest-api-2-project-projectIdOrKey-properties-get) to get a list of all project property keys. (required)
     */
    @RequestLine("GET /rest/api/2/project/{projectIdOrKey}/properties/{propertyKey}")
    @Headers({
        "Accept: application/json"
    })
    EntityProperty getProjectProperty(@Param("projectIdOrKey") @NotNull String projectIdOrKey, @Param("propertyKey") @NotNull String propertyKey);

    /**
     * Get project property keys
     * <p>
     * Returns all [project property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties) keys for the project.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param projectIdOrKey       The project ID or project key (case sensitive). (required)
     */
    @RequestLine("GET /rest/api/2/project/{projectIdOrKey}/properties")
    @Headers({
        "Accept: application/json"
    })
    PropertyKeys getProjectPropertyKeys(@Param("projectIdOrKey") @NotNull String projectIdOrKey);

    /**
     * Get project role for project
     * <p>
     * Returns a project role's details and actors associated with the project. The list of actors is sorted by display name.
     * To check whether a user belongs to a role based on their group memberships, use [Get user](#api-rest-api-2-user-get) with the {@code groups} expand parameter selected. Then check whether the user keys and groups match with the actors returned for the project.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param projectIdOrKey       The project ID or project key (case sensitive). (required)
     * @param id                   The ID of the project role. Use [Get all project roles](#api-rest-api-2-role-get) to get a list of project role IDs. (required)
     * @param excludeInactiveUsers Exclude inactive users. (optional, defaults to false)
     */
    @RequestLine("GET /rest/api/2/project/{projectIdOrKey}/role/{id}?excludeInactiveUsers={excludeInactiveUsers}")
    @Headers({
        "Accept: application/json"
    })
    ProjectRole getProjectRole(@Param("projectIdOrKey") @NotNull String projectIdOrKey, @Param("id") @NotNull Long id, @Param("excludeInactiveUsers") @Nullable Boolean excludeInactiveUsers);

    /**
     * Get default actors for project role
     * <p>
     * Returns the [default actors](#api-rest-api-2-resolution-get) for the project role.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the project role. Use [Get all project roles](#api-rest-api-2-role-get) to get a list of project role IDs. (required)
     */
    @RequestLine("GET /rest/api/2/role/{id}/actors")
    @Headers({
        "Accept: application/json"
    })
    ProjectRole getProjectRoleActorsForRole(@Param("id") @NotNull Long id);

    /**
     * Get project role by ID
     * <p>
     * Gets the project role details and the default actors associated with the role. The list of default actors is sorted by display name.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the project role. Use [Get all project roles](#api-rest-api-2-role-get) to get a list of project role IDs. (required)
     */
    @RequestLine("GET /rest/api/2/role/{id}")
    @Headers({
        "Accept: application/json"
    })
    ProjectRole getProjectRoleById(@Param("id") @NotNull Long id);

    /**
     * Get project role details
     * <p>
     * Returns all [project roles](https://confluence.atlassian.com/x/3odKLg) and the details for each role. Note that the list of project roles is common to all projects.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param projectIdOrKey       The project ID or project key (case sensitive). (required)
     * @param currentMember        Whether the roles should be filtered to include only those the user is assigned to. (optional, defaults to false)
     * @param excludeConnectAddons  (optional, defaults to false)
     */
    @RequestLine("GET /rest/api/2/project/{projectIdOrKey}/roledetails?currentMember={currentMember}&excludeConnectAddons={excludeConnectAddons}")
    @Headers({
        "Accept: application/json"
    })
    List<ProjectRoleDetails> getProjectRoleDetails(@Param("projectIdOrKey") @NotNull String projectIdOrKey, @Param("currentMember") @Nullable Boolean currentMember, @Param("excludeConnectAddons") @Nullable Boolean excludeConnectAddons);

    /**
     * Get project roles for project
     * <p>
     * Returns a list of [project roles](https://confluence.atlassian.com/x/3odKLg) for the project returning the name and self URL for each role.
     * Note that all project roles are shared with all projects in Jira Cloud. See [Get all project roles](#api-rest-api-2-role-get) for more information.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for any project on the site or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param projectIdOrKey       The project ID or project key (case sensitive). (required)
     */
    @RequestLine("GET /rest/api/2/project/{projectIdOrKey}/role")
    @Headers({
        "Accept: application/json"
    })
    Map<String, URI> getProjectRoles(@Param("projectIdOrKey") @NotNull String projectIdOrKey);

    /**
     * Get project type by key
     * <p>
     * Returns a [project type](https://confluence.atlassian.com/x/Var1Nw).
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param projectTypeKey       The key of the project type. (required)
     */
    @RequestLine("GET /rest/api/2/project/type/{projectTypeKey}")
    @Headers({
        "Accept: application/json"
    })
    ProjectType getProjectTypeByKey(@Param("projectTypeKey") @NotNull String projectTypeKey);

    /**
     * Get project versions
     * <p>
     * Returns all versions in a project. The response is not paginated. Use [Get project versions paginated](#api-rest-api-2-project-projectIdOrKey-version-get) if you want to get the versions in a project with pagination.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param projectIdOrKey       The project ID or project key (case sensitive). (required)
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts {@code operations}, which returns actions that can be performed on the version. (optional)
     */
    @RequestLine("GET /rest/api/2/project/{projectIdOrKey}/versions?expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    List<Version> getProjectVersions(@Param("projectIdOrKey") @NotNull String projectIdOrKey, @Param("expand") @Nullable String expand);

    /**
     * Get project versions paginated
     * <p>
     * Returns a [paginated](#pagination) list of all versions in a project. See the [Get project versions](#api-rest-api-2-project-projectIdOrKey-versions-get) resource if you want to get a full list of versions without pagination.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param projectIdOrKey       The project ID or project key (case sensitive). (required)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     * @param orderBy              [Order](#ordering) the results by a field:   *  {@code description} Sorts by version description.  *  {@code name} Sorts by version name.  *  {@code releaseDate} Sorts by release date, starting with the oldest date. Versions with no release date are listed last.  *  {@code sequence} Sorts by the order of appearance in the user interface.  *  {@code startDate} Sorts by start date, starting with the oldest date. Versions with no start date are listed last. (optional)
     * @param query                Filter the results using a literal string. Versions with matching {@code name} or {@code description} are returned (case insensitive). (optional)
     * @param status               A list of status values used to filter the results by version status. This parameter accepts a comma-separated list. The status values are {@code released}, {@code unreleased}, and {@code archived}. (optional)
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code issuesstatus} Returns the number of issues in each status category for each version.  *  {@code operations} Returns actions that can be performed on the specified version.  *  {@code driver} Returns the Atlassian account ID of the version driver.  *  {@code approvers} Returns a list containing the approvers for this version. (optional)
     */
    @RequestLine("GET /rest/api/2/project/{projectIdOrKey}/version?startAt={startAt}&maxResults={maxResults}&orderBy={orderBy}&query={query}&status={status}&expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanVersion getProjectVersionsPaginated(@Param("projectIdOrKey") @NotNull String projectIdOrKey, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("orderBy") @Nullable String orderBy, @Param("query") @Nullable String query, @Param("status") @Nullable String status, @Param("expand") @Nullable String expand);

    /**
     * Get issue type screen scheme projects
     * <p>
     * Returns a [paginated](#pagination) list of projects associated with an issue type screen scheme.
     * Only company-managed projects associated with an issue type screen scheme are returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param issueTypeScreenSchemeId The ID of the issue type screen scheme. (required)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     * @param query                 (optional)
     */
    @RequestLine("GET /rest/api/2/issuetypescreenscheme/{issueTypeScreenSchemeId}/project?startAt={startAt}&maxResults={maxResults}&query={query}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanProjectDetails getProjectsForIssueTypeScreenScheme(@Param("issueTypeScreenSchemeId") @NotNull Long issueTypeScreenSchemeId, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("query") @Nullable String query);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expanded options include:   *  {@code description} Returns the project description.  *  {@code projectKeys} Returns all project keys associated with a project.  *  {@code lead} Returns information about the project lead.  *  {@code issueTypes} Returns all issue types associated with the project.  *  {@code url} Returns the URL associated with the project.  *  {@code permissions} Returns the permissions associated with the project.  *  {@code insight} EXPERIMENTAL. Returns the insight details of total issue count and last issue update time for the project.  *  {@code *} Returns the project with all available expand options. (optional)
     * @param properties           EXPERIMENTAL. A list of project properties to return for the project. This parameter accepts a comma-separated list. Invalid property names are ignored. (optional)
     */
    @RequestLine("GET /rest/api/2/project/recent?expand={expand}&properties={properties}")
    @Headers({
        "Accept: application/json"
    })
    List<Project> getRecent(@Param("expand") @Nullable String expand, @Param("properties") @Nullable List<Object> properties);

    /**
     * Get related work
     * <p>
     * Returns related work items for the given version id.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the version.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param id                   The ID of the version. (required)
     */
    @RequestLine("GET /rest/api/2/version/{id}/relatedwork")
    @Headers({
        "Accept: application/json"
    })
    List<VersionRelatedWork> getRelatedWork(@Param("id") @NotNull String id);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     * @param linkId               The ID of the remote issue link. (required)
     */
    @RequestLine("GET /rest/api/2/issue/{issueIdOrKey}/remotelink/{linkId}")
    @Headers({
        "Accept: application/json"
    })
    RemoteIssueLink getRemoteIssueLinkById(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @Param("linkId") @NotNull String linkId);

    /**
     * Get remote issue links
     * <p>
     * Returns the remote issue links for an issue. When a remote issue link global ID is provided the record with that global ID is returned, otherwise all remote issue links are returned. Where a global ID includes reserved URL characters these must be escaped in the request. For example, pass {@code system=http://www.mycompany.com/support&amp;id=1} as {@code system%3Dhttp%3A%2F%2Fwww.mycompany.com%2Fsupport%26id%3D1}.
     * This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     * @param globalId             The global ID of the remote issue link. (optional)
     */
    @RequestLine("GET /rest/api/2/issue/{issueIdOrKey}/remotelink?globalId={globalId}")
    @Headers({
        "Accept: application/json"
    })
    RemoteIssueLink getRemoteIssueLinks(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @Param("globalId") @Nullable String globalId);

    /**
     * Get resolution
     * <p>
     * Returns an issue resolution value.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param id                   The ID of the issue resolution value. (required)
     */
    @RequestLine("GET /rest/api/2/resolution/{id}")
    @Headers({
        "Accept: application/json"
    })
    Resolution getResolution(@Param("id") @NotNull String id);

    /**
     * Get resolutions
     * <p>
     * Returns a list of all issue resolution values.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @deprecated
     */
    @Deprecated
    @RequestLine("GET /rest/api/2/resolution")
    @Headers({
        "Accept: application/json"
    })
    List<Resolution> getResolutions();

    /**
     * Get screen schemes
     * <p>
     * Returns a [paginated](#pagination) list of screen schemes.
     * Only screen schemes used in classic projects are returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 25)
     * @param id                   The list of screen scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, {@code id=10000&amp;id=10001}. (optional)
     * @param expand               Use [expand](#expansion) include additional information in the response. This parameter accepts {@code issueTypeScreenSchemes} that, for each screen schemes, returns information about the issue type screen scheme the screen scheme is assigned to. (optional)
     * @param queryString          String used to perform a case-insensitive partial match with screen scheme name. (optional)
     * @param orderBy              [Order](#ordering) the results by a field:   *  {@code id} Sorts by screen scheme ID.  *  {@code name} Sorts by screen scheme name. (optional)
     */
    @RequestLine("GET /rest/api/2/screenscheme?startAt={startAt}&maxResults={maxResults}&id={id}&expand={expand}&queryString={queryString}&orderBy={orderBy}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanScreenScheme getScreenSchemes(@Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("id") @Nullable Set<Long> id, @Param("expand") @Nullable String expand, @Param("queryString") @Nullable String queryString, @Param("orderBy") @Nullable String orderBy);

    /**
     * Get screens
     * <p>
     * Returns a [paginated](#pagination) list of all screens or those specified by one or more screen IDs.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 100)
     * @param id                   The list of screen IDs. To include multiple IDs, provide an ampersand-separated list. For example, {@code id=10000&amp;id=10001}. (optional)
     * @param queryString          String used to perform a case-insensitive partial match with screen name. (optional)
     * @param scope                The scope filter string. To filter by multiple scope, provide an ampersand-separated list. For example, {@code scope=GLOBAL&amp;scope=PROJECT}. (optional)
     * @param orderBy              [Order](#ordering) the results by a field:   *  {@code id} Sorts by screen ID.  *  {@code name} Sorts by screen name. (optional)
     */
    @RequestLine("GET /rest/api/2/screens?startAt={startAt}&maxResults={maxResults}&id={id}&queryString={queryString}&scope={scope}&orderBy={orderBy}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanScreen getScreens(@Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("id") @Nullable Set<Long> id, @Param("queryString") @Nullable String queryString, @Param("scope") @Nullable Set<String> scope, @Param("orderBy") @Nullable String orderBy);

    /**
     * Get screens for a field
     * <p>
     * Returns a [paginated](#pagination) list of the screens a field is used in.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param fieldId              The ID of the field to return screens for. (required)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 100)
     * @param expand               Use [expand](#expansion) to include additional information about screens in the response. This parameter accepts {@code tab} which returns details about the screen tabs the field is used in. (optional)
     */
    @RequestLine("GET /rest/api/2/field/{fieldId}/screens?startAt={startAt}&maxResults={maxResults}&expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanScreenWithTab getScreensForField(@Param("fieldId") @NotNull String fieldId, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("expand") @Nullable String expand);

    /**
     * Get issue security level members
     * <p>
     * Returns a [paginated](#pagination) list of issue security level members.
     * Only issue security level members in the context of classic projects are returned.
     * Filtering using parameters is inclusive: if you specify both security scheme IDs and level IDs, the result will include all issue security level members from the specified schemes and levels.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     * @param id                   The list of issue security level member IDs. To include multiple issue security level members separate IDs with an ampersand: {@code id=10000&amp;id=10001}. (optional)
     * @param schemeId             The list of issue security scheme IDs. To include multiple issue security schemes separate IDs with an ampersand: {@code schemeId=10000&amp;schemeId=10001}. (optional)
     * @param levelId              The list of issue security level IDs. To include multiple issue security levels separate IDs with an ampersand: {@code levelId=10000&amp;levelId=10001}. (optional)
     * @param expand               Use expand to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code all} Returns all expandable information  *  {@code field} Returns information about the custom field granted the permission  *  {@code group} Returns information about the group that is granted the permission  *  {@code projectRole} Returns information about the project role granted the permission  *  {@code user} Returns information about the user who is granted the permission (optional)
     */
    @RequestLine("GET /rest/api/2/issuesecurityschemes/level/member?startAt={startAt}&maxResults={maxResults}&id={id}&schemeId={schemeId}&levelId={levelId}&expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanSecurityLevelMember getSecurityLevelMembers(@Param("startAt") @Nullable String startAt, @Param("maxResults") @Nullable String maxResults, @Param("id") @Nullable Set<String> id, @Param("schemeId") @Nullable Set<String> schemeId, @Param("levelId") @Nullable Set<String> levelId, @Param("expand") @Nullable String expand);

    /**
     * Get issue security levels
     * <p>
     * Returns a [paginated](#pagination) list of issue security levels.
     * Only issue security levels in the context of classic projects are returned.
     * Filtering using IDs is inclusive: if you specify both security scheme IDs and level IDs, the result will include both specified issue security levels and all issue security levels from the specified schemes.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     * @param id                   The list of issue security scheme level IDs. To include multiple issue security levels, separate IDs with an ampersand: {@code id=10000&amp;id=10001}. (optional)
     * @param schemeId             The list of issue security scheme IDs. To include multiple issue security schemes, separate IDs with an ampersand: {@code schemeId=10000&amp;schemeId=10001}. (optional)
     * @param onlyDefault          When set to true, returns multiple default levels for each security scheme containing a default. If you provide scheme and level IDs not associated with the default, returns an empty page. The default value is false. (optional, defaults to false)
     */
    @RequestLine("GET /rest/api/2/issuesecurityschemes/level?startAt={startAt}&maxResults={maxResults}&id={id}&schemeId={schemeId}&onlyDefault={onlyDefault}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanSecurityLevel getSecurityLevels(@Param("startAt") @Nullable String startAt, @Param("maxResults") @Nullable String maxResults, @Param("id") @Nullable Set<String> id, @Param("schemeId") @Nullable Set<String> schemeId, @Param("onlyDefault") @Nullable Boolean onlyDefault);

    /**
     * Get project issue security levels
     * <p>
     * Returns all [issue security](https://confluence.atlassian.com/x/J4lKLg) levels for the project that the user has access to.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse projects* [global permission](https://confluence.atlassian.com/x/x4dKLg) for the project, however, issue security levels are only returned for authenticated user with *Set Issue Security* [global permission](https://confluence.atlassian.com/x/x4dKLg) for the project.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param projectKeyOrId       The project ID or project key (case sensitive). (required)
     */
    @RequestLine("GET /rest/api/2/project/{projectKeyOrId}/securitylevel")
    @Headers({
        "Accept: application/json"
    })
    ProjectIssueSecurityLevels getSecurityLevelsForProject(@Param("projectKeyOrId") @NotNull String projectKeyOrId);

    /**
     * Get selectable issue field options
     * <p>
     * Returns a [paginated](#pagination) list of options for a select list issue field that can be viewed and selected by the user.
     * Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param fieldKey             The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the {@code fieldKey} value, do one of the following:   *  open the app's plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the {@code jiraIssueFields} module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-2-field-get) and in the field details the value is returned in {@code key}. For example, {@code "key": "teams-add-on__team-issue-field"} (required)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     * @param projectId            Filters the results to options that are only available in the specified project. (optional)
     */
    @RequestLine("GET /rest/api/2/field/{fieldKey}/option/suggestions/edit?startAt={startAt}&maxResults={maxResults}&projectId={projectId}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanIssueFieldOption getSelectableIssueFieldOptions(@Param("fieldKey") @NotNull String fieldKey, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("projectId") @Nullable Long projectId);

    /**
     * Get selected time tracking provider
     * <p>
     * Returns the time tracking provider that is currently selected. Note that if time tracking is disabled, then a successful but empty response is returned.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     */
    @RequestLine("GET /rest/api/2/configuration/timetracking")
    @Headers({
        "Accept: application/json"
    })
    TimeTrackingProvider getSelectedTimeTrackingImplementation();

    /**
     * Get Jira instance info
     * <p>
     * Returns information about the Jira instance.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     *
     */
    @RequestLine("GET /rest/api/2/serverInfo")
    @Headers({
        "Accept: application/json"
    })
    ServerInformation getServerInfo();

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param id                   The ID of the filter. (required)
     * @param permissionId         The ID of the share permission. (required)
     */
    @RequestLine("GET /rest/api/2/filter/{id}/permission/{permissionId}")
    @Headers({
        "Accept: application/json"
    })
    SharePermission getSharePermission(@Param("id") @NotNull Long id, @Param("permissionId") @NotNull Long permissionId);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param id                   The ID of the filter. (required)
     */
    @RequestLine("GET /rest/api/2/filter/{id}/permission")
    @Headers({
        "Accept: application/json"
    })
    List<SharePermission> getSharePermissions(@Param("id") @NotNull Long id);

    /**
     * Get time tracking settings
     * <p>
     * Returns the time tracking settings. This includes settings such as the time format, default time unit, and others. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     */
    @RequestLine("GET /rest/api/2/configuration/timetracking/options")
    @Headers({
        "Accept: application/json"
    })
    TimeTrackingConfiguration getSharedTimeTrackingConfiguration();

    /**
     * Get status
     * <p>
     * Returns a status. The status must be associated with an active workflow to be returned.
     * If a name is used on more than one status, only the status found first is returned. Therefore, identifying the status by its ID may be preferable.
     * This operation can be accessed anonymously.
     * [Permissions](#permissions) required: None.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param idOrName             The ID or name of the status. (required)
     */
    @RequestLine("GET /rest/api/2/status/{idOrName}")
    @Headers({
        "Accept: application/json"
    })
    StatusDetails getStatus(@Param("idOrName") @NotNull String idOrName);

    /**
     * Get all status categories
     * <p>
     * Returns a list of all status categories.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * Authentication - Required Scopes: [read:jira-work]
     */
    @RequestLine("GET /rest/api/2/statuscategory")
    @Headers({
        "Accept: application/json"
    })
    List<StatusCategory> getStatusCategories();

    /**
     * Get status category
     * <p>
     * Returns a status category. Status categories provided a mechanism for categorizing [statuses](#api-rest-api-2-status-idOrName-get).
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param idOrKey              The ID or key of the status category. (required)
     */
    @RequestLine("GET /rest/api/2/statuscategory/{idOrKey}")
    @Headers({
        "Accept: application/json"
    })
    StatusCategory getStatusCategory(@Param("idOrKey") @NotNull String idOrKey);

    /**
     * Get all statuses
     * <p>
     * Returns a list of all statuses associated with active workflows.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     *
     * Authentication - Required Scopes: [read:jira-work]
     */
    @RequestLine("GET /rest/api/2/status")
    @Headers({
        "Accept: application/json"
    })
    List<StatusDetails> getStatuses();

    /**
     * Bulk get statuses
     * <p>
     * Returns a list of the statuses specified by one or more status IDs.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)
     * *
     * *Administer Jira* [project permission.](https://confluence.atlassian.com/x/yodKLg)
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code usages} Returns the project and issue types that use the status in their workflow.  *  {@code workflowUsages} Returns the workflows that use the status. (optional)
     * @param id                   The list of status IDs. To include multiple IDs, provide an ampersand-separated list. For example, id=10000&amp;id=10001.  Min items {@code 1}, Max items {@code 50} (optional)
     */
    @RequestLine("GET /rest/api/2/statuses?expand={expand}&id={id}")
    @Headers({
        "Accept: application/json"
    })
    List<JiraStatus> getStatusesById(@Param("expand") @Nullable String expand, @Param("id") @Nullable List<String> id);

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
     *
     * @param taskId               The ID of the task. (required)
     */
    @RequestLine("GET /rest/api/2/task/{taskId}")
    @Headers({
        "Accept: application/json"
    })
    TaskProgressBeanObject getTask(@Param("taskId") @NotNull String taskId);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     * @param expand               Use [expand](#expansion) to include additional information about transitions in the response. This parameter accepts {@code transitions.fields}, which returns information about the fields in the transition screen for each transition. Fields hidden from the screen are not returned. Use this information to populate the {@code fields} and {@code update} fields in [Transition issue](#api-rest-api-2-issue-issueIdOrKey-transitions-post). (optional)
     * @param transitionId         The ID of the transition. (optional)
     * @param skipRemoteOnlyCondition Whether transitions with the condition *Hide From User Condition* are included in the response. (optional, defaults to false)
     * @param includeUnavailableTransitions Whether details of transitions that fail a condition are included in the response (optional, defaults to false)
     * @param sortByOpsBarAndStatus Whether the transitions are sorted by ops-bar sequence value first then category order (Todo, In Progress, Done) or only by ops-bar sequence value. (optional, defaults to false)
     */
    @RequestLine("GET /rest/api/2/issue/{issueIdOrKey}/transitions?expand={expand}&transitionId={transitionId}&skipRemoteOnlyCondition={skipRemoteOnlyCondition}&includeUnavailableTransitions={includeUnavailableTransitions}&sortByOpsBarAndStatus={sortByOpsBarAndStatus}")
    @Headers({
        "Accept: application/json"
    })
    Transitions getTransitions(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @Param("expand") @Nullable String expand, @Param("transitionId") @Nullable String transitionId, @Param("skipRemoteOnlyCondition") @Nullable Boolean skipRemoteOnlyCondition, @Param("includeUnavailableTransitions") @Nullable Boolean includeUnavailableTransitions, @Param("sortByOpsBarAndStatus") @Nullable Boolean sortByOpsBarAndStatus);

    /**
     * Get fields in trash paginated
     * <p>
     * Returns a [paginated](#pagination) list of fields in the trash. The list may be restricted to fields whose field name or description partially match a string.
     * Only custom fields can be queried, {@code type} must be set to {@code custom}.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     * @param id                    (optional)
     * @param query                String used to perform a case-insensitive partial match with field names or descriptions. (optional)
     * @param expand                (optional)
     * @param orderBy              [Order](#ordering) the results by a field:   *  {@code name} sorts by the field name  *  {@code trashDate} sorts by the date the field was moved to the trash  *  {@code plannedDeletionDate} sorts by the planned deletion date (optional)
     */
    @RequestLine("GET /rest/api/2/field/search/trashed?startAt={startAt}&maxResults={maxResults}&id={id}&query={query}&expand={expand}&orderBy={orderBy}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanField getTrashedFieldsPaginated(@Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("id") @Nullable Set<String> id, @Param("query") @Nullable String query, @Param("expand") @Nullable String expand, @Param("orderBy") @Nullable String orderBy);

    /**
     * Get UI modifications
     * <p>
     * Gets UI modifications. UI modifications can only be retrieved by Forge apps.
     * **[Permissions](#permissions) required:** None.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     * @param expand               Use expand to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code data} Returns UI modification data.  *  {@code contexts} Returns UI modification contexts. (optional)
     */
    @RequestLine("GET /rest/api/2/uiModifications?startAt={startAt}&maxResults={maxResults}&expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanUiModificationDetails getUiModifications(@Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("expand") @Nullable String expand);

    /**
     * Get user
     * <p>
     * Returns a user.
     * Privacy controls are applied to the response based on the user's preferences. This could mean, for example, that the user's email address is hidden. See the [Profile visibility overview](https://developer.atlassian.com/cloud/jira/platform/profile-visibility/) for more details.
     * **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [read:jira-user]
     * @param accountId            The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required. (optional)
     * @param username             This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide) for details. (optional)
     * @param key                  This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide) for details. (optional)
     * @param expand               Use [expand](#expansion) to include additional information about users in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code groups} includes all groups and nested groups to which the user belongs.  *  {@code applicationRoles} includes details of all the applications to which the user has access. (optional)
     */
    @RequestLine("GET /rest/api/2/user?accountId={accountId}&username={username}&key={key}&expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    User getUser(@Param("accountId") @Nullable String accountId, @Param("username") @Nullable String username, @Param("key") @Nullable String key, @Param("expand") @Nullable String expand);

    /**
     * Get user default columns
     * <p>
     * Returns the default [issue table columns](https://confluence.atlassian.com/x/XYdKLg) for the user. If {@code accountId} is not passed in the request, the calling user's details are returned.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLgl), to get the column details for any user.
     * *
     * Permission to access Jira, to get the calling user's column details.
     *
     * Authentication - Required Scopes: [read:jira-user]
     * @param accountId            The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. (optional)
     * @param username             This parameter is no longer available See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     */
    @RequestLine("GET /rest/api/2/user/columns?accountId={accountId}&username={username}")
    @Headers({
        "Accept: application/json"
    })
    List<ColumnItem> getUserDefaultColumns(@Param("accountId") @Nullable String accountId, @Param("username") @Nullable String username);

    /**
     * Get user email
     * <p>
     * Returns a user's email address. This API is only available to apps approved by Atlassian, according to these [guidelines](https://community.developer.atlassian.com/t/guidelines-for-requesting-access-to-email-address/27603).
     *
     * @param accountId            The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, {@code 5b10ac8d82e05b22cc7d4ef5}. (required)
     */
    @RequestLine("GET /rest/api/2/user/email?accountId={accountId}")
    @Headers({
        "Accept: application/json"
    })
    UnrestrictedUserEmail getUserEmail(@Param("accountId") @NotNull String accountId);

    /**
     * Get user email bulk
     * <p>
     * Returns a user's email address. This API is only available to apps approved by Atlassian, according to these [guidelines](https://community.developer.atlassian.com/t/guidelines-for-requesting-access-to-email-address/27603).
     *
     * @param accountId            The account IDs of the users for which emails are required. An {@code accountId} is an identifier that uniquely identifies the user across all Atlassian products. For example, {@code 5b10ac8d82e05b22cc7d4ef5}. Note, this should be treated as an opaque identifier (that is, do not assume any structure in the value). (required)
     */
    @RequestLine("GET /rest/api/2/user/email/bulk?accountId={accountId}")
    @Headers({
        "Accept: application/json"
    })
    UnrestrictedUserEmail getUserEmailBulk(@Param("accountId") @NotNull List<String> accountId);

    /**
     * Get user groups
     * <p>
     * Returns the groups to which a user belongs.
     * **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [read:jira-user]
     * @param accountId            The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. (required)
     * @param username             This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param key                  This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     */
    @RequestLine("GET /rest/api/2/user/groups?accountId={accountId}&username={username}&key={key}")
    @Headers({
        "Accept: application/json"
    })
    List<GroupName> getUserGroups(@Param("accountId") @NotNull String accountId, @Param("username") @Nullable String username, @Param("key") @Nullable String key);

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
     *
     * Authentication - Required Scopes: [read:jira-user]
     * @param propertyKey          The key of the user's property. (required)
     * @param accountId            The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. (optional)
     * @param userKey              This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param username             This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     */
    @RequestLine("GET /rest/api/2/user/properties/{propertyKey}?accountId={accountId}&userKey={userKey}&username={username}")
    @Headers({
        "Accept: application/json"
    })
    EntityProperty getUserProperty(@Param("propertyKey") @NotNull String propertyKey, @Param("accountId") @Nullable String accountId, @Param("userKey") @Nullable String userKey, @Param("username") @Nullable String username);

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
     *
     * Authentication - Required Scopes: [read:jira-user]
     * @param accountId            The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. (optional)
     * @param userKey              This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param username             This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     */
    @RequestLine("GET /rest/api/2/user/properties?accountId={accountId}&userKey={userKey}&username={username}")
    @Headers({
        "Accept: application/json"
    })
    PropertyKeys getUserPropertyKeys(@Param("accountId") @Nullable String accountId, @Param("userKey") @Nullable String userKey, @Param("username") @Nullable String username);

    /**
     * Get users from group
     * <p>
     * Returns a [paginated](#pagination) list of all users in a group.
     * Note that users are ordered by username, however the username is not returned in the results due to privacy reasons.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param groupname            As a group's name can change, use of {@code groupId} is recommended to identify a group.   The name of the group. This parameter cannot be used with the {@code groupId} parameter. (optional)
     * @param groupId              The ID of the group. This parameter cannot be used with the {@code groupName} parameter. (optional)
     * @param includeInactiveUsers Include inactive users. (optional, defaults to false)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     */
    @RequestLine("GET /rest/api/2/group/member?groupname={groupname}&groupId={groupId}&includeInactiveUsers={includeInactiveUsers}&startAt={startAt}&maxResults={maxResults}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanUserDetails getUsersFromGroup(@Param("groupname") @Nullable String groupname, @Param("groupId") @Nullable String groupId, @Param("includeInactiveUsers") @Nullable Boolean includeInactiveUsers, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults);

    /**
     * Get valid project key
     * <p>
     * Validates a project key and, if the key is invalid or in use, generates a valid random string for the project key.
     * **[Permissions](#permissions) required:** None.
     *
     * @param key                  The project key. (optional)
     */
    @RequestLine("GET /rest/api/2/projectvalidate/validProjectKey?key={key}")
    @Headers({
        "Accept: application/json"
    })
    String getValidProjectKey(@Param("key") @Nullable String key);

    /**
     * Get valid project name
     * <p>
     * Checks that a project name isn't in use. If the name isn't in use, the passed string is returned. If the name is in use, this operation attempts to generate a valid project name based on the one supplied, usually by adding a sequence number. If a valid project name cannot be generated, a 404 response is returned.
     * **[Permissions](#permissions) required:** None.
     *
     * @param name                 The project name. (required)
     */
    @RequestLine("GET /rest/api/2/projectvalidate/validProjectName?name={name}")
    @Headers({
        "Accept: application/json"
    })
    String getValidProjectName(@Param("name") @NotNull String name);

    /**
     * Get version
     * <p>
     * Returns a project version.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the version.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param id                   The ID of the version. (required)
     * @param expand               Use [expand](#expansion) to include additional information about version in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code operations} Returns the list of operations available for this version.  *  {@code issuesstatus} Returns the count of issues in this version for each of the status categories *to do*, *in progress*, *done*, and *unmapped*. The *unmapped* property represents the number of issues with a status other than *to do*, *in progress*, and *done*.  *  {@code driver} Returns the Atlassian account ID of the version driver.  *  {@code approvers} Returns a list containing the Atlassian account IDs of approvers for this version. (optional)
     */
    @RequestLine("GET /rest/api/2/version/{id}?expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    Version getVersion(@Param("id") @NotNull String id, @Param("expand") @Nullable String expand);

    /**
     * Get version's related issues count
     * <p>
     * Returns the following counts for a version:
     *  *
     * Number of issues where the {@code fixVersion} is set to the version.
     * *
     * Number of issues where the {@code affectedVersion} is set to the version.
     * *
     * Number of issues where a version custom field is set to the version.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse projects* project permission for the project that contains the version.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param id                   The ID of the version. (required)
     */
    @RequestLine("GET /rest/api/2/version/{id}/relatedIssueCounts")
    @Headers({
        "Accept: application/json"
    })
    VersionIssueCounts getVersionRelatedIssues(@Param("id") @NotNull String id);

    /**
     * Get version's unresolved issues count
     * <p>
     * Returns counts of the issues and unresolved issues for the project version.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse projects* project permission for the project that contains the version.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param id                   The ID of the version. (required)
     */
    @RequestLine("GET /rest/api/2/version/{id}/unresolvedIssueCount")
    @Headers({
        "Accept: application/json"
    })
    VersionUnresolvedIssuesCount getVersionUnresolvedIssues(@Param("id") @NotNull String id);

    /**
     * Get visible issue field options
     * <p>
     * Returns a [paginated](#pagination) list of options for a select list issue field that can be viewed by the user.
     * Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param fieldKey             The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the {@code fieldKey} value, do one of the following:   *  open the app's plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the {@code jiraIssueFields} module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-2-field-get) and in the field details the value is returned in {@code key}. For example, {@code "key": "teams-add-on__team-issue-field"} (required)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional)
     * @param projectId            Filters the results to options that are only available in the specified project. (optional)
     */
    @RequestLine("GET /rest/api/2/field/{fieldKey}/option/suggestions/search?startAt={startAt}&maxResults={maxResults}&projectId={projectId}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanIssueFieldOption getVisibleIssueFieldOptions(@Param("fieldKey") @NotNull String fieldKey, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("projectId") @Nullable Long projectId);

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
     * Note that users with the necessary permissions for this operation but without the *View voters and watchers* project permissions are not returned details in the {@code voters} field.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     */
    @RequestLine("GET /rest/api/2/issue/{issueIdOrKey}/votes")
    @Headers({
        "Accept: application/json"
    })
    Votes getVotes(@Param("issueIdOrKey") @NotNull String issueIdOrKey);

    /**
     * Get issue types for workflows in workflow scheme
     * <p>
     * Returns the workflow-issue type mappings for a workflow scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the workflow scheme. (required)
     * @param workflowName         The name of a workflow in the scheme. Limits the results to the workflow-issue type mapping for the specified workflow. (optional)
     * @param returnDraftIfExists  Returns the mapping from the workflow scheme's draft rather than the workflow scheme, if set to true. If no draft exists, the mapping from the workflow scheme is returned. (optional, defaults to false)
     */
    @RequestLine("GET /rest/api/2/workflowscheme/{id}/workflow?workflowName={workflowName}&returnDraftIfExists={returnDraftIfExists}")
    @Headers({
        "Accept: application/json"
    })
    IssueTypesWorkflowMapping getWorkflow(@Param("id") @NotNull Long id, @Param("workflowName") @Nullable String workflowName, @Param("returnDraftIfExists") @Nullable Boolean returnDraftIfExists);

    /**
     * Get workflow scheme
     * <p>
     * Returns a workflow scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the workflow scheme. Find this ID by editing the desired workflow scheme in Jira. The ID is shown in the URL as {@code schemeId}. For example, *schemeId=10301*. (required)
     * @param returnDraftIfExists  Returns the workflow scheme's draft rather than scheme itself, if set to true. If the workflow scheme does not have a draft, then the workflow scheme is returned. (optional, defaults to false)
     */
    @RequestLine("GET /rest/api/2/workflowscheme/{id}?returnDraftIfExists={returnDraftIfExists}")
    @Headers({
        "Accept: application/json"
    })
    WorkflowScheme getWorkflowScheme(@Param("id") @NotNull Long id, @Param("returnDraftIfExists") @Nullable Boolean returnDraftIfExists);

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
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the active workflow scheme that the draft was created from. (required)
     */
    @RequestLine("GET /rest/api/2/workflowscheme/{id}/draft")
    @Headers({
        "Accept: application/json"
    })
    WorkflowScheme getWorkflowSchemeDraft(@Param("id") @NotNull Long id);

    /**
     * Get workflow for issue type in draft workflow scheme
     * <p>
     * Returns the issue type-workflow mapping for an issue type in a workflow scheme's draft.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the workflow scheme that the draft belongs to. (required)
     * @param issueType            The ID of the issue type. (required)
     */
    @RequestLine("GET /rest/api/2/workflowscheme/{id}/draft/issuetype/{issueType}")
    @Headers({
        "Accept: application/json"
    })
    IssueTypeWorkflowMapping getWorkflowSchemeDraftIssueType(@Param("id") @NotNull Long id, @Param("issueType") @NotNull String issueType);

    /**
     * Get workflow for issue type in workflow scheme
     * <p>
     * Returns the issue type-workflow mapping for an issue type in a workflow scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the workflow scheme. (required)
     * @param issueType            The ID of the issue type. (required)
     * @param returnDraftIfExists  Returns the mapping from the workflow scheme's draft rather than the workflow scheme, if set to true. If no draft exists, the mapping from the workflow scheme is returned. (optional, defaults to false)
     */
    @RequestLine("GET /rest/api/2/workflowscheme/{id}/issuetype/{issueType}?returnDraftIfExists={returnDraftIfExists}")
    @Headers({
        "Accept: application/json"
    })
    IssueTypeWorkflowMapping getWorkflowSchemeIssueType(@Param("id") @NotNull Long id, @Param("issueType") @NotNull String issueType, @Param("returnDraftIfExists") @Nullable Boolean returnDraftIfExists);

    /**
     * Get workflow scheme project associations
     * <p>
     * Returns a list of the workflow schemes associated with a list of projects. Each returned workflow scheme includes a list of the requested projects associated with it. Any team-managed or non-existent projects in the request are ignored and no errors are returned.
     * If the project is associated with the {@code Default Workflow Scheme} no ID is returned. This is because the way the {@code Default Workflow Scheme} is stored means it has no ID.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param projectId            The ID of a project to return the workflow schemes for. To include multiple projects, provide an ampersand-Jim: oneseparated list. For example, {@code projectId=10000&amp;projectId=10001}. (required)
     */
    @RequestLine("GET /rest/api/2/workflowscheme/project?projectId={projectId}")
    @Headers({
        "Accept: application/json"
    })
    ContainerOfWorkflowSchemeAssociations getWorkflowSchemeProjectAssociations(@Param("projectId") @NotNull Set<Long> projectId);

    /**
     * Get workflow transition properties
     * <p>
     * Returns the properties on a workflow transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param transitionId         The ID of the transition. To get the ID, view the workflow in text mode in the Jira administration console. The ID is shown next to the transition. (required)
     * @param workflowName         The name of the workflow that the transition belongs to. (required)
     * @param includeReservedKeys  Some properties with keys that have the *jira.* prefix are reserved, which means they are not editable. To include these properties in the results, set this parameter to *true*. (optional, defaults to false)
     * @param key                  The key of the property being returned, also known as the name of the property. If this parameter is not specified, all properties on the transition are returned. (optional)
     * @param workflowMode         The workflow status. Set to *live* for active and inactive workflows, or *draft* for draft workflows. (optional, defaults to live)
     */
    @RequestLine("GET /rest/api/2/workflow/transitions/{transitionId}/properties?includeReservedKeys={includeReservedKeys}&key={key}&workflowName={workflowName}&workflowMode={workflowMode}")
    @Headers({
        "Accept: application/json"
    })
    WorkflowTransitionProperty getWorkflowTransitionProperties(@Param("transitionId") @NotNull Long transitionId, @Param("workflowName") @NotNull String workflowName, @Param("includeReservedKeys") @Nullable Boolean includeReservedKeys, @Param("key") @Nullable String key, @Param("workflowMode") @Nullable String workflowMode);

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
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param types                The types of the transition rules to return. (required)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 10)
     * @param keys                 The transition rule class keys, as defined in the Connect or the Forge app descriptor, of the transition rules to return. (optional)
     * @param workflowNames        The list of workflow names to filter by. (optional)
     * @param withTags             The list of {@code tags} to filter by. (optional)
     * @param draft                Whether draft or published workflows are returned. If not provided, both workflow types are returned. (optional)
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts {@code transition}, which, for each rule, returns information about the transition the rule is assigned to. (optional)
     */
    @RequestLine("GET /rest/api/2/workflow/rule/config?startAt={startAt}&maxResults={maxResults}&types={types}&keys={keys}&workflowNames={workflowNames}&withTags={withTags}&draft={draft}&expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanWorkflowTransitionRules getWorkflowTransitionRuleConfigurations(@Param("types") @NotNull Set<String> types, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("keys") @Nullable Set<String> keys, @Param("workflowNames") @Nullable Set<String> workflowNames, @Param("withTags") @Nullable Set<String> withTags, @Param("draft") @Nullable Boolean draft, @Param("expand") @Nullable String expand);

    /**
     * Get workflows paginated
     * <p>
     * Returns a [paginated](#pagination) list of published classic workflows. When workflow names are specified, details of those workflows are returned. Otherwise, all published classic workflows are returned.
     * This operation does not return next-gen workflows.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     * @param workflowName         The name of a workflow to return. To include multiple workflows, provide an ampersand-separated list. For example, {@code workflowName=name1&amp;workflowName=name2}. (optional)
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code transitions} For each workflow, returns information about the transitions inside the workflow.  *  {@code transitions.rules} For each workflow transition, returns information about its rules. Transitions are included automatically if this expand is requested.  *  {@code transitions.properties} For each workflow transition, returns information about its properties. Transitions are included automatically if this expand is requested.  *  {@code statuses} For each workflow, returns information about the statuses inside the workflow.  *  {@code statuses.properties} For each workflow status, returns information about its properties. Statuses are included automatically if this expand is requested.  *  {@code default} For each workflow, returns information about whether this is the default workflow.  *  {@code schemes} For each workflow, returns information about the workflow schemes the workflow is assigned to.  *  {@code projects} For each workflow, returns information about the projects the workflow is assigned to, through workflow schemes.  *  {@code hasDraftWorkflow} For each workflow, returns information about whether the workflow has a draft version.  *  {@code operations} For each workflow, returns information about the actions that can be undertaken on the workflow. (optional)
     * @param queryString          String used to perform a case-insensitive partial match with workflow name. (optional)
     * @param orderBy              [Order](#ordering) the results by a field:   *  {@code name} Sorts by workflow name.  *  {@code created} Sorts by create time.  *  {@code updated} Sorts by update time. (optional)
     * @param isActive             Filters active and inactive workflows. (optional)
     */
    @RequestLine("GET /rest/api/2/workflow/search?startAt={startAt}&maxResults={maxResults}&workflowName={workflowName}&expand={expand}&queryString={queryString}&orderBy={orderBy}&isActive={isActive}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanWorkflow getWorkflowsPaginated(@Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("workflowName") @Nullable Set<String> workflowName, @Param("expand") @Nullable String expand, @Param("queryString") @Nullable String queryString, @Param("orderBy") @Nullable String orderBy, @Param("isActive") @Nullable Boolean isActive);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     * @param id                   The ID of the worklog. (required)
     * @param expand               Use [expand](#expansion) to include additional information about work logs in the response. This parameter accepts  {@code properties}, which returns worklog properties. (optional)
     */
    @RequestLine("GET /rest/api/2/issue/{issueIdOrKey}/worklog/{id}?expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    Worklog getWorklog(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @Param("id") @NotNull String id, @Param("expand") @Nullable String expand);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     * @param worklogId            The ID of the worklog. (required)
     * @param propertyKey          The key of the property. (required)
     */
    @RequestLine("GET /rest/api/2/issue/{issueIdOrKey}/worklog/{worklogId}/properties/{propertyKey}")
    @Headers({
        "Accept: application/json"
    })
    EntityProperty getWorklogProperty(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @Param("worklogId") @NotNull String worklogId, @Param("propertyKey") @NotNull String propertyKey);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     * @param worklogId            The ID of the worklog. (required)
     */
    @RequestLine("GET /rest/api/2/issue/{issueIdOrKey}/worklog/{worklogId}/properties")
    @Headers({
        "Accept: application/json"
    })
    PropertyKeys getWorklogPropertyKeys(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @Param("worklogId") @NotNull String worklogId);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param worklogIdsRequestBean A JSON object containing a list of worklog IDs. (required)
     * @param expand               Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts {@code properties} that returns the properties of each worklog. (optional)
     */
    @RequestLine("POST /rest/api/2/worklog/list?expand={expand}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    List<Worklog> getWorklogsForIds(@NotNull WorklogIdsRequestBean worklogIdsRequestBean, @Param("expand") @Nullable String expand);

    /**
     * Create issue link
     * <p>
     * Creates a link between two issues. Use this operation to indicate a relationship between two issues and optionally add a comment to the from (outward) issue. To use this resource the site must have [Issue Linking](https://confluence.atlassian.com/x/yoXKM) enabled.
     * This resource returns nothing on the creation of an issue link. To obtain the ID of the issue link, use {@code https://your-domain.atlassian.net/rest/api/2/issue/[linked issue key]?fields=issuelinks}.
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
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param linkIssueRequestJsonBean The issue link request. (required)
     */
    @RequestLine("POST /rest/api/2/issueLink")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object linkIssues(@NotNull LinkIssueRequestJsonBean linkIssueRequestJsonBean);

    /**
     * Check issues against JQL
     * <p>
     * Checks whether one or more issues would be returned by one or more JQL queries.
     * **[Permissions](#permissions) required:** None, however, issues are only matched against JQL queries where the user has:
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param issuesAndJQLQueries   (required)
     */
    @RequestLine("POST /rest/api/2/jql/match")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    IssueMatches matchIssues(@NotNull IssuesAndJQLQueries issuesAndJQLQueries);

    /**
     * Merge versions
     * <p>
     * Merges two project versions. The merge is completed by deleting the version specified in {@code id} and replacing any occurrences of its ID in {@code fixVersion} with the version ID specified in {@code moveIssuesTo}.
     * Consider using [ Delete and replace version](#api-rest-api-2-version-id-removeAndSwap-post) instead. This resource supports swapping version values in {@code fixVersion}, {@code affectedVersion}, and custom fields.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that contains the version.
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param id                   The ID of the version to delete. (required)
     * @param moveIssuesTo         The ID of the version to merge into. (required)
     */
    @RequestLine("PUT /rest/api/2/version/{id}/mergeto/{moveIssuesTo}")
    @Headers({
        "Accept: application/json"
    })
    Object mergeVersions(@Param("id") @NotNull String id, @Param("moveIssuesTo") @NotNull String moveIssuesTo);

    /**
     * Convert user identifiers to account IDs in JQL queries
     * <p>
     * Converts one or more JQL queries with user identifiers (username or user key) to equivalent JQL queries with account IDs.
     * You may wish to use this operation if your system stores JQL queries and you want to make them GDPR-compliant. For more information about GDPR-related changes, see the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/).
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * Authentication - Required Scopes: [read:jira-user]
     * @param jqLPersonalDataMigrationRequest  (required)
     */
    @RequestLine("POST /rest/api/2/jql/pdcleaner")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    ConvertedJQLQueries migrateQueries(@NotNull JQLPersonalDataMigrationRequest jqLPersonalDataMigrationRequest);

    /**
     * Bulk update entity properties
     * <p>
     * Updates the values of multiple entity properties for an object, up to 50 updates per request. This operation is for use by Connect apps during app migration.
     *
     * @param atlassianTransferId  The app migration transfer ID. (required)
     * @param entityType           The type indicating the object that contains the entity properties. (required)
     * @param entityPropertyDetails  (required)
     */
    @RequestLine("PUT /rest/atlassian-connect/1/migration/properties/{entityType}")
    @Headers({
        "Atlassian-Transfer-Id: {atlassianTransferId}", 
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    void migrationResourceUpdateEntityPropertiesValuePut(@Param("atlassianTransferId") @NotNull UUID atlassianTransferId, @Param("entityType") @NotNull String entityType, @NotNull List<EntityPropertyDetails> entityPropertyDetails);

    /**
     * Get workflow transition rule configurations
     * <p>
     * Returns configurations for workflow transition rules migrated from server to cloud and owned by the calling Connect app.
     *
     * @param atlassianTransferId  The app migration transfer ID. (required)
     * @param workflowRulesSearch   (required)
     */
    @RequestLine("POST /rest/atlassian-connect/1/migration/workflow/rule/search")
    @Headers({
        "Atlassian-Transfer-Id: {atlassianTransferId}", 
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    WorkflowRulesSearchDetails migrationResourceWorkflowRuleSearchPost(@Param("atlassianTransferId") @NotNull UUID atlassianTransferId, @NotNull WorkflowRulesSearch workflowRulesSearch);

    /**
     * Move priorities
     * <p>
     * Changes the order of issue priorities.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param reorderIssuePriorities  (required)
     */
    @RequestLine("PUT /rest/api/2/priority/move")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object movePriorities(@NotNull ReorderIssuePriorities reorderIssuePriorities);

    /**
     * Move resolutions
     * <p>
     * Changes the order of issue resolutions.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param reorderIssueResolutionsRequest  (required)
     */
    @RequestLine("PUT /rest/api/2/resolution/move")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object moveResolutions(@NotNull ReorderIssueResolutionsRequest reorderIssueResolutionsRequest);

    /**
     * Move screen tab
     * <p>
     * Moves a screen tab.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param screenId             The ID of the screen. (required)
     * @param tabId                The ID of the screen tab. (required)
     * @param pos                  The position of tab. The base index is 0. (required)
     */
    @RequestLine("POST /rest/api/2/screens/{screenId}/tabs/{tabId}/move/{pos}")
    @Headers({
        "Accept: application/json"
    })
    Object moveScreenTab(@Param("screenId") @NotNull Long screenId, @Param("tabId") @NotNull Long tabId, @Param("pos") @NotNull Integer pos);

    /**
     * Move screen tab field
     * <p>
     * Moves a screen tab field.
     * If {@code after} and {@code position} are provided in the request, {@code position} is ignored.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param screenId             The ID of the screen. (required)
     * @param tabId                The ID of the screen tab. (required)
     * @param id                   The ID of the field. (required)
     * @param moveFieldBean         (required)
     */
    @RequestLine("POST /rest/api/2/screens/{screenId}/tabs/{tabId}/fields/{id}/move")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object moveScreenTabField(@Param("screenId") @NotNull Long screenId, @Param("tabId") @NotNull Long tabId, @Param("id") @NotNull String id, @NotNull MoveFieldBean moveFieldBean);

    /**
     * Move version
     * <p>
     * Modifies the version's sequence within the project, which affects the display order of the versions in Jira.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Browse projects* project permission for the project that contains the version.
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param id                   The ID of the version to be moved. (required)
     * @param versionMoveBean       (required)
     */
    @RequestLine("POST /rest/api/2/version/{id}/move")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Version moveVersion(@Param("id") @NotNull String id, @NotNull VersionMoveBean versionMoveBean);

    /**
     * Send notification for issue
     * <p>
     * Creates an email notification for an issue and adds it to the mail queue.
     * **[Permissions](#permissions) required:**
     *  *
     * *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.
     * *
     * If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param issueIdOrKey         ID or key of the issue that the notification is sent for. (required)
     * @param notification         The request object for the notification and recipients. (required)
     */
    @RequestLine("POST /rest/api/2/issue/{issueIdOrKey}/notify")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object notify(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @NotNull Notification notification);

    /**
     * Parse JQL query
     * <p>
     * Parses and validates JQL queries.
     * Validation is performed in context of the current user.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** None.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param jqlQueriesToParse     (required)
     * @param validation           How to validate the JQL query and treat the validation results. Validation options include:   *  {@code strict} Returns all errors. If validation fails, the query structure is not returned.  *  {@code warn} Returns all errors. If validation fails but the JQL query is correctly formed, the query structure is returned.  *  {@code none} No validation is performed. If JQL query is correctly formed, the query structure is returned. (optional, defaults to strict)
     */
    @RequestLine("POST /rest/api/2/jql/parse?validation={validation}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    ParsedJqlQueries parseJqlQueries(@NotNull JqlQueriesToParse jqlQueriesToParse, @Param("validation") @Nullable String validation);

    /**
     * Partial update project role
     * <p>
     * Updates either the project role's name or its description.
     * You cannot update both the name and description at the same time using this operation. If you send a request with a name and a description only the name is updated.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the project role. Use [Get all project roles](#api-rest-api-2-role-get) to get a list of project role IDs. (required)
     * @param createUpdateRoleRequestBean  (required)
     */
    @RequestLine("POST /rest/api/2/role/{id}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    ProjectRole partialUpdateProjectRole(@Param("id") @NotNull Long id, @NotNull CreateUpdateRoleRequestBean createUpdateRoleRequestBean);

    /**
     * Publish draft workflow scheme
     * <p>
     * Publishes a draft workflow scheme.
     * Where the draft workflow includes new workflow statuses for an issue type, mappings are provided to update issues with the original workflow status to the new workflow status.
     * This operation is [asynchronous](#async). Follow the {@code location} link in the response to determine the status of the task and use [Get task](#api-rest-api-2-task-taskId-get) to obtain updates.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the workflow scheme that the draft belongs to. (required)
     * @param publishDraftWorkflowScheme Details of the status mappings. (required)
     * @param validateOnly         Whether the request only performs a validation. (optional, defaults to false)
     */
    @RequestLine("POST /rest/api/2/workflowscheme/{id}/draft/publish?validateOnly={validateOnly}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    void publishDraftWorkflowScheme(@Param("id") @NotNull Long id, @NotNull PublishDraftWorkflowScheme publishDraftWorkflowScheme, @Param("validateOnly") @Nullable Boolean validateOnly);

    /**
     * Bulk get workflow schemes
     * <p>
     * Returns a list of workflow schemes by providing workflow scheme IDs or project IDs.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* global permission to access all, including project-scoped, workflow schemes
     * *
     * *Administer projects* project permissions to access project-scoped workflow schemes
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param workflowSchemeReadRequest  (required)
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code workflows.usages} Returns the project and issue types that each workflow in the workflow scheme is associated with. (optional)
     */
    @RequestLine("POST /rest/api/2/workflowscheme/read?expand={expand}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    List<WorkflowSchemeReadResponse> readWorkflowSchemes(@NotNull WorkflowSchemeReadRequest workflowSchemeReadRequest, @Param("expand") @Nullable String expand);

    /**
     * Bulk get workflows
     * <p>
     * Returns a list of workflows and related statuses by providing workflow names, workflow IDs, or project and issue types.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* global permission to access all, including project-scoped, workflows
     * *
     * At least one of the *Administer projects* and *View (read-only) workflow* project permissions to access project-scoped workflows
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param workflowReadRequest   (required)
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code workflows.usages} Returns the project and issue types that each workflow is associated with.  *  {@code statuses.usages} Returns the project and issue types that each status is associated with. (optional)
     */
    @RequestLine("POST /rest/api/2/workflows?expand={expand}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    WorkflowReadResponse readWorkflows(@NotNull WorkflowReadRequest workflowReadRequest, @Param("expand") @Nullable String expand);

    /**
     * Extend webhook life
     * <p>
     * Extends the life of webhook. Webhooks registered through the REST API expire after 30 days. Call this operation to keep them alive.
     * Unrecognized webhook IDs (those that are not found or belong to other apps) are ignored.
     * **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/#connect-apps) and [OAuth 2.0](https://developer.atlassian.com/cloud/jira/platform/oauth-2-3lo-apps) apps can use this operation.
     *
     * Authentication - Required Scopes: [read:jira-work, manage:jira-webhook]
     * @param containerForWebhookIDs  (required)
     */
    @RequestLine("PUT /rest/api/2/webhook/refresh")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    WebhooksExpirationDate refreshWebhooks(@NotNull ContainerForWebhookIDs containerForWebhookIDs);

    /**
     * Register dynamic webhooks
     * <p>
     * Registers webhooks.
     * **NOTE:** for non-public OAuth apps, webhooks are delivered only if there is a match between the app owner and the user who registered a dynamic webhook.
     * **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/#connect-apps) and [OAuth 2.0](https://developer.atlassian.com/cloud/jira/platform/oauth-2-3lo-apps) apps can use this operation.
     *
     * Authentication - Required Scopes: [read:jira-work, manage:jira-webhook]
     * @param webhookRegistrationDetails  (required)
     */
    @RequestLine("POST /rest/api/2/webhook")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    ContainerForRegisteredWebhooks registerDynamicWebhooks(@NotNull WebhookRegistrationDetails webhookRegistrationDetails);

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
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param id                   The ID of the attachment. (required)
     */
    @RequestLine("DELETE /rest/api/2/attachment/{id}")
    @Headers({
        "Accept: application/json"
    })
    void removeAttachment(@Param("id") @NotNull String id);

    /**
     * Remove custom field context from projects
     * <p>
     * Removes a custom field context from projects.
     * A custom field context without any projects applies to all projects. Removing all projects from a custom field context would result in it applying to all projects.
     * If any project in the request is not assigned to the context, or the operation would result in two global contexts for the field, the operation fails.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param fieldId              The ID of the custom field. (required)
     * @param contextId            The ID of the context. (required)
     * @param projectIds            (required)
     */
    @RequestLine("POST /rest/api/2/field/{fieldId}/context/{contextId}/project/remove")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object removeCustomFieldContextFromProjects(@Param("fieldId") @NotNull String fieldId, @Param("contextId") @NotNull Long contextId, @NotNull ProjectIds projectIds);

    /**
     * Remove gadget from dashboard
     * <p>
     * Removes a dashboard gadget from a dashboard.
     * When a gadget is removed from a dashboard, other gadgets in the same column are moved up to fill the emptied position.
     * **[Permissions](#permissions) required:** None.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param dashboardId          The ID of the dashboard. (required)
     * @param gadgetId             The ID of the gadget. (required)
     */
    @RequestLine("DELETE /rest/api/2/dashboard/{dashboardId}/gadget/{gadgetId}")
    @Headers({
        "Accept: application/json"
    })
    Object removeGadget(@Param("dashboardId") @NotNull Long dashboardId, @Param("gadgetId") @NotNull Long gadgetId);

    /**
     * Remove group
     * <p>
     * Deletes a group.
     * **[Permissions](#permissions) required:** Site administration (that is, member of the *site-admin* strategic [group](https://confluence.atlassian.com/x/24xjL)).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param groupname             (optional)
     * @param groupId              The ID of the group. This parameter cannot be used with the {@code groupname} parameter. (optional)
     * @param swapGroup            As a group's name can change, use of {@code swapGroupId} is recommended to identify a group.   The group to transfer restrictions to. Only comments and worklogs are transferred. If restrictions are not transferred, comments and worklogs are inaccessible after the deletion. This parameter cannot be used with the {@code swapGroupId} parameter. (optional)
     * @param swapGroupId          The ID of the group to transfer restrictions to. Only comments and worklogs are transferred. If restrictions are not transferred, comments and worklogs are inaccessible after the deletion. This parameter cannot be used with the {@code swapGroup} parameter. (optional)
     */
    @RequestLine("DELETE /rest/api/2/group?groupname={groupname}&groupId={groupId}&swapGroup={swapGroup}&swapGroupId={swapGroupId}")
    @Headers({
        "Accept: application/json"
    })
    void removeGroup(@Param("groupname") @Nullable String groupname, @Param("groupId") @Nullable String groupId, @Param("swapGroup") @Nullable String swapGroup, @Param("swapGroupId") @Nullable String swapGroupId);

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
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param issueTypeSchemeId    The ID of the issue type scheme. (required)
     * @param issueTypeId          The ID of the issue type. (required)
     */
    @RequestLine("DELETE /rest/api/2/issuetypescheme/{issueTypeSchemeId}/issuetype/{issueTypeId}")
    @Headers({
        "Accept: application/json"
    })
    Object removeIssueTypeFromIssueTypeScheme(@Param("issueTypeSchemeId") @NotNull Long issueTypeSchemeId, @Param("issueTypeId") @NotNull Long issueTypeId);

    /**
     * Remove issue types from context
     * <p>
     * Removes issue types from a custom field context.
     * A custom field context without any issue types applies to all issue types.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param fieldId              The ID of the custom field. (required)
     * @param contextId            The ID of the context. (required)
     * @param issueTypeIds          (required)
     */
    @RequestLine("POST /rest/api/2/field/{fieldId}/context/{contextId}/issuetype/remove")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object removeIssueTypesFromContext(@Param("fieldId") @NotNull String fieldId, @Param("contextId") @NotNull Long contextId, @NotNull IssueTypeIds issueTypeIds);

    /**
     * Remove issue types from field configuration scheme
     * <p>
     * Removes issue types from the field configuration scheme.
     * This operation can only modify field configuration schemes used in company-managed (classic) projects.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the field configuration scheme. (required)
     * @param issueTypeIdsToRemove The issue type IDs to remove. (required)
     */
    @RequestLine("POST /rest/api/2/fieldconfigurationscheme/{id}/mapping/delete")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object removeIssueTypesFromGlobalFieldConfigurationScheme(@Param("id") @NotNull Long id, @NotNull IssueTypeIdsToRemove issueTypeIdsToRemove);

    /**
     * Remove issue security level
     * <p>
     * Deletes an issue security level.
     * This operation is [asynchronous](#async). Follow the {@code location} link in the response to determine the status of the task and use [Get task](#api-rest-api-2-task-taskId-get) to obtain subsequent updates.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param schemeId             The ID of the issue security scheme. (required)
     * @param levelId              The ID of the issue security level to remove. (required)
     * @param replaceWith          The ID of the issue security level that will replace the currently selected level. (optional)
     */
    @RequestLine("DELETE /rest/api/2/issuesecurityschemes/{schemeId}/level/{levelId}?replaceWith={replaceWith}")
    @Headers({
        "Accept: application/json"
    })
    void removeLevel(@Param("schemeId") @NotNull String schemeId, @Param("levelId") @NotNull String levelId, @Param("replaceWith") @Nullable String replaceWith);

    /**
     * Remove mappings from issue type screen scheme
     * <p>
     * Removes issue type to screen scheme mappings from an issue type screen scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param issueTypeScreenSchemeId The ID of the issue type screen scheme. (required)
     * @param issueTypeIds          (required)
     */
    @RequestLine("POST /rest/api/2/issuetypescreenscheme/{issueTypeScreenSchemeId}/mapping/remove")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object removeMappingsFromIssueTypeScreenScheme(@Param("issueTypeScreenSchemeId") @NotNull String issueTypeScreenSchemeId, @NotNull IssueTypeIds issueTypeIds);

    /**
     * Remove member from issue security level
     * <p>
     * Removes an issue security level member from an issue security scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param schemeId             The ID of the issue security scheme. (required)
     * @param levelId              The ID of the issue security level. (required)
     * @param memberId             The ID of the issue security level member to be removed. (required)
     */
    @RequestLine("DELETE /rest/api/2/issuesecurityschemes/{schemeId}/level/{levelId}/member/{memberId}")
    @Headers({
        "Accept: application/json"
    })
    Object removeMemberFromSecurityLevel(@Param("schemeId") @NotNull String schemeId, @Param("levelId") @NotNull String levelId, @Param("memberId") @NotNull String memberId);

    /**
     * Remove notification from notification scheme
     * <p>
     * Removes a notification from a notification scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param notificationSchemeId The ID of the notification scheme. (required)
     * @param notificationId       The ID of the notification. (required)
     */
    @RequestLine("DELETE /rest/api/2/notificationscheme/{notificationSchemeId}/notification/{notificationId}")
    @Headers({
        "Accept: application/json"
    })
    Object removeNotificationFromNotificationScheme(@Param("notificationSchemeId") @NotNull String notificationSchemeId, @Param("notificationId") @NotNull String notificationId);

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
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param key                  The key of the preference. (required)
     */
    @RequestLine("DELETE /rest/api/2/mypreferences?key={key}")
    @Headers({
        "Accept: application/json"
    })
    void removePreference(@Param("key") @NotNull String key);

    /**
     * Delete project category
     * <p>
     * Deletes a project category.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param id                   ID of the project category to delete. (required)
     */
    @RequestLine("DELETE /rest/api/2/projectCategory/{id}")
    @Headers({
        "Accept: application/json"
    })
    void removeProjectCategory(@Param("id") @NotNull Long id);

    /**
     * Remove screen tab field
     * <p>
     * Removes a field from a screen tab.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param screenId             The ID of the screen. (required)
     * @param tabId                The ID of the screen tab. (required)
     * @param id                   The ID of the field. (required)
     */
    @RequestLine("DELETE /rest/api/2/screens/{screenId}/tabs/{tabId}/fields/{id}")
    @Headers({
        "Accept: application/json"
    })
    void removeScreenTabField(@Param("screenId") @NotNull Long screenId, @Param("tabId") @NotNull Long tabId, @Param("id") @NotNull String id);

    /**
     * Delete user
     * <p>
     * Deletes a user. If the operation completes successfully then the user is removed from Jira's user base. This operation does not delete the user's Atlassian account.
     * **[Permissions](#permissions) required:** Site administration (that is, membership of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)).
     *
     * @param accountId            The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. (required)
     * @param username             This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param key                  This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     */
    @RequestLine("DELETE /rest/api/2/user?accountId={accountId}&username={username}&key={key}")
    @Headers({
        "Accept: application/json"
    })
    void removeUser(@Param("accountId") @NotNull String accountId, @Param("username") @Nullable String username, @Param("key") @Nullable String key);

    /**
     * Remove user from group
     * <p>
     * Removes a user from a group.
     * **[Permissions](#permissions) required:** Site administration (that is, member of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param accountId            The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. (required)
     * @param groupname            As a group's name can change, use of {@code groupId} is recommended to identify a group.   The name of the group. This parameter cannot be used with the {@code groupId} parameter. (optional)
     * @param groupId              The ID of the group. This parameter cannot be used with the {@code groupName} parameter. (optional)
     * @param username             This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     */
    @RequestLine("DELETE /rest/api/2/group/user?groupname={groupname}&groupId={groupId}&username={username}&accountId={accountId}")
    @Headers({
        "Accept: application/json"
    })
    void removeUserFromGroup(@Param("accountId") @NotNull String accountId, @Param("groupname") @Nullable String groupname, @Param("groupId") @Nullable String groupId, @Param("username") @Nullable String username);

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
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     */
    @RequestLine("DELETE /rest/api/2/issue/{issueIdOrKey}/votes")
    @Headers({
        "Accept: application/json"
    })
    void removeVote(@Param("issueIdOrKey") @NotNull String issueIdOrKey);

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
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     * @param username             This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param accountId            The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required. (optional)
     */
    @RequestLine("DELETE /rest/api/2/issue/{issueIdOrKey}/watchers?username={username}&accountId={accountId}")
    @Headers({
        "Accept: application/json"
    })
    void removeWatcher(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @Param("username") @Nullable String username, @Param("accountId") @Nullable String accountId);

    /**
     * Update screen tab
     * <p>
     * Updates the name of a screen tab.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param screenId             The ID of the screen. (required)
     * @param tabId                The ID of the screen tab. (required)
     * @param screenableTab         (required)
     */
    @RequestLine("PUT /rest/api/2/screens/{screenId}/tabs/{tabId}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    ScreenableTab renameScreenTab(@Param("screenId") @NotNull Long screenId, @Param("tabId") @NotNull Long tabId, @NotNull ScreenableTab screenableTab);

    /**
     * Reorder custom field options (context)
     * <p>
     * Changes the order of custom field options or cascading options in a context.
     * This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param fieldId              The ID of the custom field. (required)
     * @param contextId            The ID of the context. (required)
     * @param orderOfCustomFieldOptions  (required)
     */
    @RequestLine("PUT /rest/api/2/field/{fieldId}/context/{contextId}/option/move")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object reorderCustomFieldOptions(@Param("fieldId") @NotNull String fieldId, @Param("contextId") @NotNull Long contextId, @NotNull OrderOfCustomFieldOptions orderOfCustomFieldOptions);

    /**
     * Change order of issue types
     * <p>
     * Changes the order of issue types in an issue type scheme.
     * The request body parameters must meet the following requirements:
     *  *
     * all of the issue types must belong to the issue type scheme.
     * *
     * either {@code after} or {@code position} must be provided.
     * *
     * the issue type in {@code after} must not be in the issue type list.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param issueTypeSchemeId    The ID of the issue type scheme. (required)
     * @param orderOfIssueTypes     (required)
     */
    @RequestLine("PUT /rest/api/2/issuetypescheme/{issueTypeSchemeId}/issuetype/move")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object reorderIssueTypesInIssueTypeScheme(@Param("issueTypeSchemeId") @NotNull Long issueTypeSchemeId, @NotNull OrderOfIssueTypes orderOfIssueTypes);

    /**
     * Replace issue field option
     * <p>
     * Deselects an issue-field select-list option from all issues where it is selected. A different option can be selected to replace the deselected option. The update can also be limited to a smaller set of issues by using a JQL query.
     * Connect and Forge app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) can override the screen security configuration using {@code overrideScreenSecurity} and {@code overrideEditableFlag}.
     * This is an [asynchronous operation](#async). The response object contains a link to the long-running task.
     * Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param fieldKey             The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the {@code fieldKey} value, do one of the following:   *  open the app's plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the {@code jiraIssueFields} module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-2-field-get) and in the field details the value is returned in {@code key}. For example, {@code "key": "teams-add-on__team-issue-field"} (required)
     * @param optionId             The ID of the option to be deselected. (required)
     * @param replaceWith          The ID of the option that will replace the currently selected option. (optional)
     * @param jql                  A JQL query that specifies the issues to be updated. For example, *project=10000*. (optional)
     * @param overrideScreenSecurity Whether screen security is overridden to enable hidden fields to be edited. Available to Connect and Forge app users with admin permission. (optional, defaults to false)
     * @param overrideEditableFlag Whether screen security is overridden to enable uneditable fields to be edited. Available to Connect and Forge app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). (optional, defaults to false)
     */
    @RequestLine("DELETE /rest/api/2/field/{fieldKey}/option/{optionId}/issue?replaceWith={replaceWith}&jql={jql}&overrideScreenSecurity={overrideScreenSecurity}&overrideEditableFlag={overrideEditableFlag}")
    @Headers({
        "Accept: application/json"
    })
    void replaceIssueFieldOption(@Param("fieldKey") @NotNull String fieldKey, @Param("optionId") @NotNull Long optionId, @Param("replaceWith") @Nullable Long replaceWith, @Param("jql") @Nullable String jql, @Param("overrideScreenSecurity") @Nullable Boolean overrideScreenSecurity, @Param("overrideEditableFlag") @Nullable Boolean overrideEditableFlag);

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
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param id                   The ID of the filter. (required)
     */
    @RequestLine("DELETE /rest/api/2/filter/{id}/columns")
    @Headers({
        "Accept: application/json"
    })
    void resetColumns(@Param("id") @NotNull Long id);

    /**
     * Reset user default columns
     * <p>
     * Resets the default [ issue table columns](https://confluence.atlassian.com/x/XYdKLg) for the user to the system default. If {@code accountId} is not passed, the calling user's default columns are reset.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to set the columns on any user.
     * *
     * Permission to access Jira, to set the calling user's columns.
     *
     * @param accountId            The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. (optional)
     * @param username             This parameter is no longer available. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     */
    @RequestLine("DELETE /rest/api/2/user/columns?accountId={accountId}&username={username}")
    @Headers({
        "Accept: application/json"
    })
    void resetUserColumns(@Param("accountId") @Nullable String accountId, @Param("username") @Nullable String username);

    /**
     * Restore deleted or archived project
     * <p>
     * Restores a project that has been archived or placed in the Jira recycle bin.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg)for Company managed projects.
     * *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project for Team managed projects.
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param projectIdOrKey       The project ID or project key (case sensitive). (required)
     */
    @RequestLine("POST /rest/api/2/project/{projectIdOrKey}/restore")
    @Headers({
        "Accept: application/json"
    })
    Project restore(@Param("projectIdOrKey") @NotNull String projectIdOrKey);

    /**
     * Restore custom field from trash
     * <p>
     * Restores a custom field from trash. See [Edit or delete a custom field](https://confluence.atlassian.com/x/Z44fOw) for more information on trashing and deleting custom fields.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of a custom field. (required)
     */
    @RequestLine("POST /rest/api/2/field/{id}/restore")
    @Headers({
        "Accept: application/json"
    })
    Object restoreCustomField(@Param("id") @NotNull String id);

    /**
     * Sanitize JQL queries
     * <p>
     * Sanitizes one or more JQL queries by converting readable details into IDs where a user doesn't have permission to view the entity.
     * For example, if the query contains the clause *project = 'Secret project'*, and a user does not have browse permission for the project "Secret project", the sanitized query replaces the clause with *project = 12345"* (where 12345 is the ID of the project). If a user has the required permission, the clause is not sanitized. If the account ID is null, sanitizing is performed for an anonymous user.
     * Note that sanitization doesn't make the queries GDPR-compliant, because it doesn't remove user identifiers (username or user key). If you need to make queries GDPR-compliant, use [Convert user identifiers to account IDs in JQL queries](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-jql/#api-rest-api-3-jql-sanitize-post).
     * Before sanitization each JQL query is parsed. The queries are returned in the same order that they were passed.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param jqlQueriesToSanitize  (required)
     */
    @RequestLine("POST /rest/api/2/jql/sanitize")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    SanitizedJqlQueries sanitiseJqlQueries(@NotNull JqlQueriesToSanitize jqlQueriesToSanitize);

    /**
     * Search statuses paginated
     * <p>
     * Returns a [paginated](https://developer.atlassian.com/cloud/jira/platform/rest/v3/intro/#pagination) list of statuses that match a search on name or project.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)
     * *
     * *Administer Jira* [project permission.](https://confluence.atlassian.com/x/yodKLg)
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code usages} Returns the project and issue types that use the status in their workflow.  *  {@code workflowUsages} Returns the workflows that use the status. (optional)
     * @param projectId            The project the status is part of or null for global statuses. (optional)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 200)
     * @param searchString         Term to match status names against or null to search for all statuses in the search scope. (optional)
     * @param statusCategory       Category of the status to filter by. The supported values are: {@code TODO}, {@code IN_PROGRESS}, and {@code DONE}. (optional)
     */
    @RequestLine("GET /rest/api/2/statuses/search?expand={expand}&projectId={projectId}&startAt={startAt}&maxResults={maxResults}&searchString={searchString}&statusCategory={statusCategory}")
    @Headers({
        "Accept: application/json"
    })
    PageOfStatuses search(@Param("expand") @Nullable String expand, @Param("projectId") @Nullable String projectId, @Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("searchString") @Nullable String searchString, @Param("statusCategory") @Nullable String statusCategory);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param jql                  The [JQL](https://confluence.atlassian.com/x/egORLQ) that defines the search. Note:   *  If no JQL expression is provided, all issues are returned.  *  {@code username} and {@code userkey} cannot be used as search terms due to privacy reasons. Use {@code accountId} instead.  *  If a user has hidden their email address in their user profile, partial matches of the email address will not find the user. An exact match is required. (optional)
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. To manage page size, Jira may return fewer items per page where a large number of fields are requested. The greatest number of items returned per page is achieved when requesting {@code id} or {@code key} only. (optional, defaults to 50)
     * @param validateQuery        Determines how to validate the JQL query and treat the validation results. Supported values are:   *  {@code strict} Returns a 400 response code if any errors are found, along with a list of all errors (and warnings).  *  {@code warn} Returns all errors as warnings.  *  {@code none} No validation is performed.  *  {@code true} *Deprecated* A legacy synonym for {@code strict}.  *  {@code false} *Deprecated* A legacy synonym for {@code warn}.  Note: If the JQL is not correctly formed a 400 response code is returned, regardless of the {@code validateQuery} value. (optional, defaults to strict)
     * @param fields               A list of fields to return for each issue, use it to retrieve a subset of fields. This parameter accepts a comma-separated list. Expand options include:   *  {@code *all} Returns all fields.  *  {@code *navigable} Returns navigable fields.  *  Any issue field, prefixed with a minus to exclude.  Examples:   *  {@code summary,comment} Returns only the summary and comments fields.  *  {@code -description} Returns all navigable (default) fields except description.  *  {@code *all,-comment} Returns all fields except comments.  This parameter may be specified multiple times. For example, {@code fields=field1,field2&amp;fields=field3}.  Note: All navigable fields are returned by default. This differs from [GET issue](#api-rest-api-2-issue-issueIdOrKey-get) where the default is all fields. (optional)
     * @param expand               Use [expand](#expansion) to include additional information about issues in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code renderedFields} Returns field values rendered in HTML format.  *  {@code names} Returns the display name of each field.  *  {@code schema} Returns the schema describing a field type.  *  {@code transitions} Returns all possible transitions for the issue.  *  {@code operations} Returns all possible operations for the issue.  *  {@code editmeta} Returns information about how each field can be edited.  *  {@code changelog} Returns a list of recent updates to an issue, sorted by date, starting from the most recent.  *  {@code versionedRepresentations} Instead of {@code fields}, returns {@code versionedRepresentations} a JSON array containing each version of a field's value, with the highest numbered item representing the most recent version. (optional)
     * @param properties           A list of issue property keys for issue properties to include in the results. This parameter accepts a comma-separated list. Multiple properties can also be provided using an ampersand separated list. For example, {@code properties=prop1,prop2&amp;properties=prop3}. A maximum of 5 issue property keys can be specified. (optional)
     * @param fieldsByKeys         Reference fields by their key (rather than ID). (optional, defaults to false)
     */
    @RequestLine("GET /rest/api/2/search?jql={jql}&startAt={startAt}&maxResults={maxResults}&validateQuery={validateQuery}&fields={fields}&expand={expand}&properties={properties}&fieldsByKeys={fieldsByKeys}")
    @Headers({
        "Accept: application/json"
    })
    SearchResults searchForIssuesUsingJql(@Param("jql") @Nullable String jql, @Param("startAt") @Nullable Integer startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("validateQuery") @Nullable String validateQuery, @Param("fields") @Nullable List<String> fields, @Param("expand") @Nullable String expand, @Param("properties") @Nullable List<String> properties, @Param("fieldsByKeys") @Nullable Boolean fieldsByKeys);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param searchRequestBean    A JSON object containing the search request. (required)
     */
    @RequestLine("POST /rest/api/2/search")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    SearchResults searchForIssuesUsingJqlPost(@NotNull SearchRequestBean searchRequestBean);

    /**
     * Search priorities
     * <p>
     * Returns a [paginated](#pagination) list of priorities. The list can contain all priorities or a subset determined by any combination of these criteria:
     *  *
     * a list of priority IDs. Any invalid priority IDs are ignored.
     * *
     * a list of project IDs. Only priorities that are available in these projects will be returned. Any invalid project IDs are ignored.
     * *
     * whether the field configuration is a default. This returns priorities from company-managed (classic) projects only, as there is no concept of default priorities in team-managed projects.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     * @param id                   The list of priority IDs. To include multiple IDs, provide an ampersand-separated list. For example, {@code id=2&amp;id=3}. (optional)
     * @param projectId            The list of projects IDs. To include multiple IDs, provide an ampersand-separated list. For example, {@code projectId=10010&amp;projectId=10111}. (optional)
     * @param onlyDefault          Whether only the default priority is returned. (optional, defaults to false)
     */
    @RequestLine("GET /rest/api/2/priority/search?startAt={startAt}&maxResults={maxResults}&id={id}&projectId={projectId}&onlyDefault={onlyDefault}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanPriority searchPriorities(@Param("startAt") @Nullable String startAt, @Param("maxResults") @Nullable String maxResults, @Param("id") @Nullable List<String> id, @Param("projectId") @Nullable List<String> projectId, @Param("onlyDefault") @Nullable Boolean onlyDefault);

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
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     * @param orderBy              [Order](#ordering) the results by a field.   *  {@code category} Sorts by project category. A complete list of category IDs is found using [Get all project categories](#api-rest-api-2-projectCategory-get).  *  {@code issueCount} Sorts by the total number of issues in each project.  *  {@code key} Sorts by project key.  *  {@code lastIssueUpdatedTime} Sorts by the last issue update time.  *  {@code name} Sorts by project name.  *  {@code owner} Sorts by project lead.  *  {@code archivedDate} EXPERIMENTAL. Sorts by project archived date.  *  {@code deletedDate} EXPERIMENTAL. Sorts by project deleted date. (optional, defaults to key)
     * @param id                   The project IDs to filter the results by. To include multiple IDs, provide an ampersand-separated list. For example, {@code id=10000&amp;id=10001}. Up to 50 project IDs can be provided. (optional)
     * @param keys                 The project keys to filter the results by. To include multiple keys, provide an ampersand-separated list. For example, {@code keys=PA&amp;keys=PB}. Up to 50 project keys can be provided. (optional)
     * @param query                Filter the results using a literal string. Projects with a matching {@code key} or {@code name} are returned (case insensitive). (optional)
     * @param typeKey              Orders results by the [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes). This parameter accepts a comma-separated list. Valid values are {@code business}, {@code service_desk}, and {@code software}. (optional)
     * @param categoryId           The ID of the project's category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-2-projectCategory-get) operation. (optional)
     * @param action               Filter results by projects for which the user can:   *  {@code view} the project, meaning that they have one of the following permissions:           *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.      *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.      *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  {@code browse} the project, meaning that they have the *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  {@code edit} the project, meaning that they have one of the following permissions:           *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.      *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  {@code create} the project, meaning that they have the *Create issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project in which the issue is created. (optional, defaults to view)
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expanded options include:   *  {@code description} Returns the project description.  *  {@code projectKeys} Returns all project keys associated with a project.  *  {@code lead} Returns information about the project lead.  *  {@code issueTypes} Returns all issue types associated with the project.  *  {@code url} Returns the URL associated with the project.  *  {@code insight} EXPERIMENTAL. Returns the insight details of total issue count and last issue update time for the project. (optional)
     * @param status               EXPERIMENTAL. Filter results by project status:   *  {@code live} Search live projects.  *  {@code archived} Search archived projects.  *  {@code deleted} Search deleted projects, those in the recycle bin. (optional)
     * @param properties           EXPERIMENTAL. A list of project properties to return for the project. This parameter accepts a comma-separated list. (optional)
     * @param propertyQuery        EXPERIMENTAL. A query string used to search properties. The query string cannot be specified using a JSON object. For example, to search for the value of {@code nested} from {@code {"something":{"nested":1,"other":2}}} use {@code [thepropertykey].something.nested=1}. Note that the propertyQuery key is enclosed in square brackets to enable searching where the propertyQuery key includes dot (.) or equals (=) characters. Note that {@code thepropertykey} is only returned when included in {@code properties}. (optional)
     */
    @RequestLine("GET /rest/api/2/project/search?startAt={startAt}&maxResults={maxResults}&orderBy={orderBy}&id={id}&keys={keys}&query={query}&typeKey={typeKey}&categoryId={categoryId}&action={action}&expand={expand}&status={status}&properties={properties}&propertyQuery={propertyQuery}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanProject searchProjects(@Param("startAt") @Nullable Long startAt, @Param("maxResults") @Nullable Integer maxResults, @Param("orderBy") @Nullable String orderBy, @Param("id") @Nullable Set<Long> id, @Param("keys") @Nullable Set<String> keys, @Param("query") @Nullable String query, @Param("typeKey") @Nullable String typeKey, @Param("categoryId") @Nullable Long categoryId, @Param("action") @Nullable String action, @Param("expand") @Nullable String expand, @Param("status") @Nullable List<String> status, @Param("properties") @Nullable List<Object> properties, @Param("propertyQuery") @Nullable String propertyQuery);

    /**
     * Get projects using issue security schemes
     * <p>
     * Returns a [paginated](#pagination) mapping of projects that are using security schemes. You can provide either one or multiple security scheme IDs or project IDs to filter by. If you don't provide any, this will return a list of all mappings. Only issue security schemes in the context of classic projects are supported. **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     * @param issueSecuritySchemeId The list of security scheme IDs to be filtered out. (optional)
     * @param projectId            The list of project IDs to be filtered out. (optional)
     */
    @RequestLine("GET /rest/api/2/issuesecurityschemes/project?startAt={startAt}&maxResults={maxResults}&issueSecuritySchemeId={issueSecuritySchemeId}&projectId={projectId}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanIssueSecuritySchemeToProjectMapping searchProjectsUsingSecuritySchemes(@Param("startAt") @Nullable String startAt, @Param("maxResults") @Nullable String maxResults, @Param("issueSecuritySchemeId") @Nullable Set<String> issueSecuritySchemeId, @Param("projectId") @Nullable Set<String> projectId);

    /**
     * Search resolutions
     * <p>
     * Returns a [paginated](#pagination) list of resolutions. The list can contain all resolutions or a subset determined by any combination of these criteria:
     *  *
     * a list of resolutions IDs.
     * *
     * whether the field configuration is a default. This returns resolutions from company-managed (classic) projects only, as there is no concept of default resolutions in team-managed projects.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     * @param id                   The list of resolutions IDs to be filtered out (optional)
     * @param onlyDefault          When set to true, return default only, when IDs provided, if none of them is default, return empty page. Default value is false (optional, defaults to false)
     */
    @RequestLine("GET /rest/api/2/resolution/search?startAt={startAt}&maxResults={maxResults}&id={id}&onlyDefault={onlyDefault}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanResolutionJsonBean searchResolutions(@Param("startAt") @Nullable String startAt, @Param("maxResults") @Nullable String maxResults, @Param("id") @Nullable List<String> id, @Param("onlyDefault") @Nullable Boolean onlyDefault);

    /**
     * Search issue security schemes
     * <p>
     * Returns a paginated list of issue security schemes.
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param startAt              The index of the first item to return in a page of results (page offset). (optional, defaults to 0)
     * @param maxResults           The maximum number of items to return per page. (optional, defaults to 50)
     * @param id                   The list of issue security scheme IDs. To include multiple issue security scheme IDs, separate IDs with an ampersand: {@code id=10000&amp;id=10001}. (optional)
     * @param projectId            The list of project IDs. To include multiple project IDs, separate IDs with an ampersand: {@code projectId=10000&amp;projectId=10001}. (optional)
     */
    @RequestLine("GET /rest/api/2/issuesecurityschemes/search?startAt={startAt}&maxResults={maxResults}&id={id}&projectId={projectId}")
    @Headers({
        "Accept: application/json"
    })
    PageBeanSecuritySchemeWithProjects searchSecuritySchemes(@Param("startAt") @Nullable String startAt, @Param("maxResults") @Nullable String maxResults, @Param("id") @Nullable Set<String> id, @Param("projectId") @Nullable Set<String> projectId);

    /**
     * Select time tracking provider
     * <p>
     * Selects a time tracking provider.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param timeTrackingProvider  (required)
     */
    @RequestLine("PUT /rest/api/2/configuration/timetracking")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object selectTimeTrackingImplementation(@NotNull TimeTrackingProvider timeTrackingProvider);

    /**
     * Set actors for project role
     * <p>
     * Sets the actors for a project role for a project, replacing all existing actors.
     * To add actors to the project without overwriting the existing list, use [Add actors to project role](#api-rest-api-2-project-projectIdOrKey-role-id-post).
     * **[Permissions](#permissions) required:** *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param projectIdOrKey       The project ID or project key (case sensitive). (required)
     * @param id                   The ID of the project role. Use [Get all project roles](#api-rest-api-2-role-get) to get a list of project role IDs. (required)
     * @param projectRoleActorsUpdateBean The groups or users to associate with the project role for this project. Provide the user account ID, group name, or group ID. As a group's name can change, use of group ID is recommended. (required)
     */
    @RequestLine("PUT /rest/api/2/project/{projectIdOrKey}/role/{id}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    ProjectRole setActors(@Param("projectIdOrKey") @NotNull String projectIdOrKey, @Param("id") @NotNull Long id, @NotNull ProjectRoleActorsUpdateBean projectRoleActorsUpdateBean);

    /**
     * Set application property
     * <p>
     * Changes the value of an application property. For example, you can change the value of the {@code jira.clone.prefix} from its default value of *CLONE -* to *Clone -* if you prefer sentence case capitalization. Editable properties are described below along with their default values.
     * #### Advanced settings ####
     * The advanced settings below are also accessible in [Jira](https://confluence.atlassian.com/x/vYXKM).
     * | Key | Description | Default value |
     *  | -- | -- | -- |
     *  | {@code jira.clone.prefix} | The string of text prefixed to the title of a cloned issue. | {@code CLONE -} |
     *  | {@code jira.date.picker.java.format} | The date format for the Java (server-side) generated dates. This must be the same as the {@code jira.date.picker.javascript.format} format setting. | {@code d/MMM/yy} |
     *  | {@code jira.date.picker.javascript.format} | The date format for the JavaScript (client-side) generated dates. This must be the same as the {@code jira.date.picker.java.format} format setting. | {@code %e/%b/%y} |
     *  | {@code jira.date.time.picker.java.format} | The date format for the Java (server-side) generated date times. This must be the same as the {@code jira.date.time.picker.javascript.format} format setting. | {@code dd/MMM/yy h:mm a} |
     *  | {@code jira.date.time.picker.javascript.format} | The date format for the JavaScript (client-side) generated date times. This must be the same as the {@code jira.date.time.picker.java.format} format setting. | {@code %e/%b/%y %I:%M %p} |
     *  | {@code jira.issue.actions.order} | The default order of actions (such as *Comments* or *Change history*) displayed on the issue view. | {@code asc} |
     *  | {@code jira.view.issue.links.sort.order} | The sort order of the list of issue links on the issue view. | {@code type, status, priority} |
     *  | {@code jira.comment.collapsing.minimum.hidden} | The minimum number of comments required for comment collapsing to occur. A value of {@code 0} disables comment collapsing. | {@code 4} |
     *  | {@code jira.newsletter.tip.delay.days} | The number of days before a prompt to sign up to the Jira Insiders newsletter is shown. A value of {@code -1} disables this feature. | {@code 7} |
     * 
     *  #### Look and feel ####
     * The settings listed below adjust the [look and feel](https://confluence.atlassian.com/x/VwCLLg).
     * | Key | Description | Default value |
     *  | -- | -- | -- |
     *  | {@code jira.lf.date.time} | The [ time format](https://docs.oracle.com/javase/6/docs/api/index.html?java/text/SimpleDateFormat.html). | {@code h:mm a} |
     *  | {@code jira.lf.date.day} | The [ day format](https://docs.oracle.com/javase/6/docs/api/index.html?java/text/SimpleDateFormat.html). | {@code EEEE h:mm a} |
     *  | {@code jira.lf.date.complete} | The [ date and time format](https://docs.oracle.com/javase/6/docs/api/index.html?java/text/SimpleDateFormat.html). | {@code dd/MMM/yy h:mm a} |
     *  | {@code jira.lf.date.dmy} | The [ date format](https://docs.oracle.com/javase/6/docs/api/index.html?java/text/SimpleDateFormat.html). | {@code dd/MMM/yy} |
     *  | {@code jira.date.time.picker.use.iso8061} | When enabled, sets Monday as the first day of the week in the date picker, as specified by the ISO8601 standard. | {@code false} |
     *  | {@code jira.lf.logo.url} | The URL of the logo image file. | {@code /images/icon-jira-logo.png} |
     *  | {@code jira.lf.logo.show.application.title} | Controls the visibility of the application title on the sidebar. | {@code false} |
     *  | {@code jira.lf.favicon.url} | The URL of the favicon. | {@code /favicon.ico} |
     *  | {@code jira.lf.favicon.hires.url} | The URL of the high-resolution favicon. | {@code /images/64jira.png} |
     *  | {@code jira.lf.navigation.bgcolour} | The background color of the sidebar. | {@code #0747A6} |
     *  | {@code jira.lf.navigation.highlightcolour} | The color of the text and logo of the sidebar. | {@code #DEEBFF} |
     *  | {@code jira.lf.hero.button.base.bg.colour} | The background color of the hero button. | {@code #3b7fc4} |
     *  | {@code jira.title} | The text for the application title. The application title can also be set in *General settings*. | {@code Jira} |
     *  | {@code jira.option.globalsharing} | Whether filters and dashboards can be shared with anyone signed into Jira. | {@code true} |
     *  | {@code xflow.product.suggestions.enabled} | Whether to expose product suggestions for other Atlassian products within Jira. | {@code true} |
     * 
     *  #### Other settings ####
     * | Key | Description | Default value |
     *  | -- | -- | -- |
     *  | {@code jira.issuenav.criteria.autoupdate} | Whether instant updates to search criteria is active. | {@code true} |
     * 
     *  *Note: Be careful when changing [application properties and advanced settings](https://confluence.atlassian.com/x/vYXKM).*
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The key of the application property to update. (required)
     * @param simpleApplicationPropertyBean  (required)
     */
    @RequestLine("PUT /rest/api/2/application-properties/{id}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    ApplicationProperty setApplicationProperty(@Param("id") @NotNull String id, @NotNull SimpleApplicationPropertyBean simpleApplicationPropertyBean);

    /**
     * Update announcement banner configuration
     * <p>
     * Updates the announcement banner configuration.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param announcementBannerConfigurationUpdate  (required)
     */
    @RequestLine("PUT /rest/api/2/announcementBanner")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object setBanner(@NotNull AnnouncementBannerConfigurationUpdate announcementBannerConfigurationUpdate);

    /**
     * Set columns
     * <p>
     * Sets the columns for a filter. Only navigable fields can be set as columns. Use [Get fields](#api-rest-api-2-field-get) to get the list fields in Jira. A navigable field has {@code navigable} set to {@code true}.
     * The parameters for this resource are expressed as HTML form data. For example, in curl:
     * {@code curl -X PUT -d columns=summary -d columns=description https://your-domain.atlassian.net/rest/api/2/filter/10000/columns}
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
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param id                   The ID of the filter. (required)
     * @param requestBody          The IDs of the fields to set as columns. In the form data, specify each field as {@code columns=id}, where {@code id} is the *id* of a field (as seen in the response for [Get fields](#api-rest-api-&amp;lt;ver&amp;gt;-field-get)). For example, {@code columns=summary}. (optional)
     */
    @RequestLine("PUT /rest/api/2/filter/{id}/columns")
    @Headers({
        "Content-Type: */*", 
        "Accept: application/json"
    })
    Object setColumns(@Param("id") @NotNull Long id, @Nullable List<String> requestBody);

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
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param commentId            The ID of the comment. (required)
     * @param propertyKey          The key of the property. The maximum length is 255 characters. (required)
     * @param body                  (required)
     */
    @RequestLine("PUT /rest/api/2/comment/{commentId}/properties/{propertyKey}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object setCommentProperty(@Param("commentId") @NotNull String commentId, @Param("propertyKey") @NotNull String propertyKey, @NotNull Object body);

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
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param dashboardId          The ID of the dashboard. (required)
     * @param itemId               The ID of the dashboard item. (required)
     * @param propertyKey          The key of the dashboard item property. The maximum length is 255 characters. For dashboard items with a spec URI and no complete module key, if the provided propertyKey is equal to "config", the request body's JSON must be an object with all keys and values as strings. (required)
     * @param body                  (required)
     */
    @RequestLine("PUT /rest/api/2/dashboard/{dashboardId}/items/{itemId}/properties/{propertyKey}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object setDashboardItemProperty(@Param("dashboardId") @NotNull String dashboardId, @Param("itemId") @NotNull String itemId, @Param("propertyKey") @NotNull String propertyKey, @NotNull Object body);

    /**
     * Set default issue security levels
     * <p>
     * Sets default issue security levels for schemes.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param setDefaultLevelsRequest  (required)
     */
    @RequestLine("PUT /rest/api/2/issuesecurityschemes/level/default")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object setDefaultLevels(@NotNull SetDefaultLevelsRequest setDefaultLevelsRequest);

    /**
     * Set default priority
     * <p>
     * Sets default issue priority.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param setDefaultPriorityRequest  (required)
     */
    @RequestLine("PUT /rest/api/2/priority/default")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object setDefaultPriority(@NotNull SetDefaultPriorityRequest setDefaultPriorityRequest);

    /**
     * Set default resolution
     * <p>
     * Sets default issue resolution.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param setDefaultResolutionRequest  (required)
     */
    @RequestLine("PUT /rest/api/2/resolution/default")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object setDefaultResolution(@NotNull SetDefaultResolutionRequest setDefaultResolutionRequest);

    /**
     * Set default share scope
     * <p>
     * Sets the default sharing for new filters and dashboards for a user.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param defaultShareScope     (required)
     */
    @RequestLine("PUT /rest/api/2/filter/defaultShareScope")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    DefaultShareScope setDefaultShareScope(@NotNull DefaultShareScope defaultShareScope);

    /**
     * Set custom field contexts default values
     * <p>
     * Sets default for contexts of a custom field. Default are defined using these objects:
     *  *
     * {@code CustomFieldContextDefaultValueDate} (type {@code datepicker}) for date fields.
     * *
     * {@code CustomFieldContextDefaultValueDateTime} (type {@code datetimepicker}) for date-time fields.
     * *
     * {@code CustomFieldContextDefaultValueSingleOption} (type {@code option.single}) for single choice select lists and radio buttons.
     * *
     * {@code CustomFieldContextDefaultValueMultipleOption} (type {@code option.multiple}) for multiple choice select lists and checkboxes.
     * *
     * {@code CustomFieldContextDefaultValueCascadingOption} (type {@code option.cascading}) for cascading select lists.
     * *
     * {@code CustomFieldContextSingleUserPickerDefaults} (type {@code single.user.select}) for single users.
     * *
     * {@code CustomFieldContextDefaultValueMultiUserPicker} (type {@code multi.user.select}) for user lists.
     * *
     * {@code CustomFieldContextDefaultValueSingleGroupPicker} (type {@code grouppicker.single}) for single choice group pickers.
     * *
     * {@code CustomFieldContextDefaultValueMultipleGroupPicker} (type {@code grouppicker.multiple}) for multiple choice group pickers.
     * *
     * {@code CustomFieldContextDefaultValueURL} (type {@code url}) for URLs.
     * *
     * {@code CustomFieldContextDefaultValueProject} (type {@code project}) for project pickers.
     * *
     * {@code CustomFieldContextDefaultValueFloat} (type {@code float}) for floats (floating-point numbers).
     * *
     * {@code CustomFieldContextDefaultValueLabels} (type {@code labels}) for labels.
     * *
     * {@code CustomFieldContextDefaultValueTextField} (type {@code textfield}) for text fields.
     * *
     * {@code CustomFieldContextDefaultValueTextArea} (type {@code textarea}) for text area fields.
     * *
     * {@code CustomFieldContextDefaultValueReadOnly} (type {@code readonly}) for read only (text) fields.
     * *
     * {@code CustomFieldContextDefaultValueMultipleVersion} (type {@code version.multiple}) for single choice version pickers.
     * *
     * {@code CustomFieldContextDefaultValueSingleVersion} (type {@code version.single}) for multiple choice version pickers.
     * Forge custom fields [types](https://developer.atlassian.com/platform/forge/manifest-reference/modules/jira-custom-field-type/#data-types) are also supported, returning:
     *  *
     * {@code CustomFieldContextDefaultValueForgeStringFieldBean} (type {@code forge.string}) for Forge string fields.
     * *
     * {@code CustomFieldContextDefaultValueForgeMultiStringFieldBean} (type {@code forge.string.list}) for Forge string collection fields.
     * *
     * {@code CustomFieldContextDefaultValueForgeObjectFieldBean} (type {@code forge.object}) for Forge object fields.
     * *
     * {@code CustomFieldContextDefaultValueForgeDateTimeFieldBean} (type {@code forge.datetime}) for Forge date-time fields.
     * *
     * {@code CustomFieldContextDefaultValueForgeGroupFieldBean} (type {@code forge.group}) for Forge group fields.
     * *
     * {@code CustomFieldContextDefaultValueForgeMultiGroupFieldBean} (type {@code forge.group.list}) for Forge group collection fields.
     * *
     * {@code CustomFieldContextDefaultValueForgeNumberFieldBean} (type {@code forge.number}) for Forge number fields.
     * *
     * {@code CustomFieldContextDefaultValueForgeUserFieldBean} (type {@code forge.user}) for Forge user fields.
     * *
     * {@code CustomFieldContextDefaultValueForgeMultiUserFieldBean} (type {@code forge.user.list}) for Forge user collection fields.
     * Only one type of default object can be included in a request. To remove a default for a context, set the default parameter to {@code null}.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param fieldId              The ID of the custom field. (required)
     * @param customFieldContextDefaultValueUpdate  (required)
     */
    @RequestLine("PUT /rest/api/2/field/{fieldId}/context/defaultValue")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object setDefaultValues(@Param("fieldId") @NotNull String fieldId, @NotNull CustomFieldContextDefaultValueUpdate customFieldContextDefaultValueUpdate);

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
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param id                   The ID of the filter. (required)
     * @param expand               Use [expand](#expansion) to include additional information about filter in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code sharedUsers} Returns the users that the filter is shared with. This includes users that can browse projects that the filter is shared with. If you don't specify {@code sharedUsers}, then the {@code sharedUsers} object is returned but it doesn't list any users. The list of users returned is limited to 1000, to access additional users append {@code [start-index:end-index]} to the expand request. For example, to access the next 1000 users, use {@code ?expand=sharedUsers[1001:2000]}.  *  {@code subscriptions} Returns the users that are subscribed to the filter. If you don't specify {@code subscriptions}, the {@code subscriptions} object is returned but it doesn't list any subscriptions. The list of subscriptions returned is limited to 1000, to access additional subscriptions append {@code [start-index:end-index]} to the expand request. For example, to access the next 1000 subscriptions, use {@code ?expand=subscriptions[1001:2000]}. (optional)
     */
    @RequestLine("PUT /rest/api/2/filter/{id}/favourite?expand={expand}")
    @Headers({
        "Accept: application/json"
    })
    Filter setFavouriteForFilter(@Param("id") @NotNull Long id, @Param("expand") @Nullable String expand);

    /**
     * Assign issue types to field configurations
     * <p>
     * Assigns issue types to field configurations on field configuration scheme.
     * This operation can only modify field configuration schemes used in company-managed (classic) projects.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the field configuration scheme. (required)
     * @param associateFieldConfigurationsWithIssueTypesRequest  (required)
     */
    @RequestLine("PUT /rest/api/2/fieldconfigurationscheme/{id}/mapping")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object setFieldConfigurationSchemeMapping(@Param("id") @NotNull Long id, @NotNull AssociateFieldConfigurationsWithIssueTypesRequest associateFieldConfigurationsWithIssueTypesRequest);

    /**
     * Set issue navigator default columns
     * <p>
     * Sets the default issue navigator columns.
     * The {@code columns} parameter accepts a navigable field value and is expressed as HTML form data. To specify multiple columns, pass multiple {@code columns} parameters. For example, in curl:
     * {@code curl -X PUT -d columns=summary -d columns=description https://your-domain.atlassian.net/rest/api/2/settings/columns}
     * If no column details are sent, then all default columns are removed.
     * A navigable field is one that can be used as a column on the issue navigator. Find details of navigable issue columns using [Get fields](#api-rest-api-2-field-get).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @param requestBody          A navigable field value. (optional)
     */
    @RequestLine("PUT /rest/api/2/settings/columns")
    @Headers({
        "Content-Type: */*", 
        "Accept: application/json"
    })
    Object setIssueNavigatorDefaultColumns(@Nullable List<String> requestBody);

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
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     * @param propertyKey          The key of the issue property. The maximum length is 255 characters. (required)
     * @param body                  (required)
     */
    @RequestLine("PUT /rest/api/2/issue/{issueIdOrKey}/properties/{propertyKey}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object setIssueProperty(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @Param("propertyKey") @NotNull String propertyKey, @NotNull Object body);

    /**
     * Set issue type property
     * <p>
     * Creates or updates the value of the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties). Use this resource to store and update data against an issue type.
     * The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param issueTypeId          The ID of the issue type. (required)
     * @param propertyKey          The key of the issue type property. The maximum length is 255 characters. (required)
     * @param body                  (required)
     */
    @RequestLine("PUT /rest/api/2/issuetype/{issueTypeId}/properties/{propertyKey}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object setIssueTypeProperty(@Param("issueTypeId") @NotNull String issueTypeId, @Param("propertyKey") @NotNull String propertyKey, @NotNull Object body);

    /**
     * Set locale
     * <p>
     * Deprecated, use [ Update a user profile](https://developer.atlassian.com/cloud/admin/user-management/rest/#api-users-account-id-manage-profile-patch) from the user management REST API instead.
     * Sets the locale of the user. The locale must be one supported by the instance of Jira.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @param locale               The locale defined in a LocaleBean. (required)
     * @deprecated
     */
    @Deprecated
    @RequestLine("PUT /rest/api/2/mypreferences/locale")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object setLocale(@NotNull Locale locale);

    /**
     * Set preference
     * <p>
     * Creates a preference for the user or updates a preference's value by sending a plain text string. For example, {@code false}. An arbitrary preference can be created with the value containing up to 255 characters. In addition, the following keys define system preferences that can be set or created:
     *  *
     * *user.notifications.mimetype* The mime type used in notifications sent to the user. Defaults to {@code html}.
     * *
     * *user.notify.own.changes* Whether the user gets notified of their own changes. Defaults to {@code false}.
     * *
     * *user.default.share.private* Whether new [ filters](https://confluence.atlassian.com/x/eQiiLQ) are set to private. Defaults to {@code true}.
     * *
     * *user.keyboard.shortcuts.disabled* Whether keyboard shortcuts are disabled. Defaults to {@code false}.
     * *
     * *user.autowatch.disabled* Whether the user automatically watches issues they create or add a comment to. By default, not set: the user takes the instance autowatch setting.
     * Note that these keys are deprecated:
     *  *
     * *jira.user.locale* The locale of the user. By default, not set. The user takes the instance locale.
     * *
     * *jira.user.timezone* The time zone of the user. By default, not set. The user takes the instance timezone.
     * Use [ Update a user profile](https://developer.atlassian.com/cloud/admin/user-management/rest/#api-users-account-id-manage-profile-patch) from the user management REST API to manage timezone and locale instead.
     * **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param key                  The key of the preference. The maximum length is 255 characters. (required)
     * @param body                 The value of the preference as a plain text string. The maximum length is 255 characters. (required)
     */
    @RequestLine("PUT /rest/api/2/mypreferences?key={key}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object setPreference(@Param("key") @NotNull String key, @NotNull String body);

    /**
     * Set project property
     * <p>
     * Sets the value of the [project property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties). You can use project properties to store custom data against the project.
     * The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project in which the property is created.
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param projectIdOrKey       The project ID or project key (case sensitive). (required)
     * @param propertyKey          The key of the project property. The maximum length is 255 characters. (required)
     * @param body                  (required)
     */
    @RequestLine("PUT /rest/api/2/project/{projectIdOrKey}/properties/{propertyKey}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object setProjectProperty(@Param("projectIdOrKey") @NotNull String projectIdOrKey, @Param("propertyKey") @NotNull String propertyKey, @NotNull Object body);

    /**
     * Set time tracking settings
     * <p>
     * Sets the time tracking settings.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param timeTrackingConfiguration  (required)
     */
    @RequestLine("PUT /rest/api/2/configuration/timetracking/options")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    TimeTrackingConfiguration setSharedTimeTrackingConfiguration(@NotNull TimeTrackingConfiguration timeTrackingConfiguration);

    /**
     * Set user default columns
     * <p>
     * Sets the default [ issue table columns](https://confluence.atlassian.com/x/XYdKLg) for the user. If an account ID is not passed, the calling user's default columns are set. If no column details are sent, then all default columns are removed.
     * The parameters for this resource are expressed as HTML form data. For example, in curl:
     * {@code curl -X PUT -d columns=summary -d columns=description https://your-domain.atlassian.net/rest/api/2/user/columns?accountId=5b10ac8d82e05b22cc7d4ef5'}
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg), to set the columns on any user.
     * *
     * Permission to access Jira, to set the calling user's columns.
     *
     * @param accountId            The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. (optional)
     * @param requestBody          The ID of a column to set. To set multiple columns, send multiple {@code columns} parameters. (optional)
     */
    @RequestLine("PUT /rest/api/2/user/columns?accountId={accountId}")
    @Headers({
        "Content-Type: */*", 
        "Accept: application/json"
    })
    Object setUserColumns(@Param("accountId") @Nullable String accountId, @Nullable List<String> requestBody);

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
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param propertyKey          The key of the user's property. The maximum length is 255 characters. (required)
     * @param body                  (required)
     * @param accountId            The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. (optional)
     * @param userKey              This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     * @param username             This parameter is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. (optional)
     */
    @RequestLine("PUT /rest/api/2/user/properties/{propertyKey}?accountId={accountId}&userKey={userKey}&username={username}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object setUserProperty(@Param("propertyKey") @NotNull String propertyKey, @NotNull Object body, @Param("accountId") @Nullable String accountId, @Param("userKey") @Nullable String userKey, @Param("username") @Nullable String username);

    /**
     * Set workflow for issue type in draft workflow scheme
     * <p>
     * Sets the workflow for an issue type in a workflow scheme's draft.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the workflow scheme that the draft belongs to. (required)
     * @param issueType            The ID of the issue type. (required)
     * @param issueTypeWorkflowMapping The issue type-project mapping. (required)
     */
    @RequestLine("PUT /rest/api/2/workflowscheme/{id}/draft/issuetype/{issueType}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    WorkflowScheme setWorkflowSchemeDraftIssueType(@Param("id") @NotNull Long id, @Param("issueType") @NotNull String issueType, @NotNull IssueTypeWorkflowMapping issueTypeWorkflowMapping);

    /**
     * Set workflow for issue type in workflow scheme
     * <p>
     * Sets the workflow for an issue type in a workflow scheme.
     * Note that active workflow schemes cannot be edited. If the workflow scheme is active, set {@code updateDraftIfNeeded} to {@code true} in the request body and a draft workflow scheme is created or updated with the new issue type-workflow mapping. The draft workflow scheme can be published in Jira.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the workflow scheme. (required)
     * @param issueType            The ID of the issue type. (required)
     * @param issueTypeWorkflowMapping The issue type-project mapping. (required)
     */
    @RequestLine("PUT /rest/api/2/workflowscheme/{id}/issuetype/{issueType}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    WorkflowScheme setWorkflowSchemeIssueType(@Param("id") @NotNull Long id, @Param("issueType") @NotNull String issueType, @NotNull IssueTypeWorkflowMapping issueTypeWorkflowMapping);

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
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     * @param worklogId            The ID of the worklog. (required)
     * @param propertyKey          The key of the issue property. The maximum length is 255 characters. (required)
     * @param body                  (required)
     */
    @RequestLine("PUT /rest/api/2/issue/{issueIdOrKey}/worklog/{worklogId}/properties/{propertyKey}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object setWorklogProperty(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @Param("worklogId") @NotNull String worklogId, @Param("propertyKey") @NotNull String propertyKey, @NotNull Object body);

    /**
     * Load avatar
     * <p>
     * Loads a custom avatar for a project or issue type.
     * Specify the avatar's local file location in the body of the request. Also, include the following headers:
     *  *
     * {@code X-Atlassian-Token: no-check} To prevent XSRF protection blocking the request, for more information see [Special Headers](#special-request-headers).
     * *
     * {@code Content-Type: image/image type} Valid image types are JPEG, GIF, or PNG.
     * For example:
     *  {@code curl --request POST }
     * {@code --user email@example.com:&amp;lt;api_token&amp;gt; }
     * {@code --header 'X-Atlassian-Token: no-check' }
     * {@code --header 'Content-Type: image/&amp;lt; image_type&amp;gt;' }
     * {@code --data-binary "&amp;lt;@/path/to/file/with/your/avatar&amp;gt;" }
     * {@code --url 'https://your-domain.atlassian.net/rest/api/2/universal_avatar/type/{type}/owner/{entityId}'}
     * The avatar is cropped to a square. If no crop parameters are specified, the square originates at the top left of the image. The length of the square's sides is set to the smaller of the height or width of the image.
     * The cropped image is then used to create avatars of 16x16, 24x24, 32x32, and 48x48 in size.
     * After creating the avatar use:
     *  *
     * [Update issue type](#api-rest-api-2-issuetype-id-put) to set it as the issue type's displayed avatar.
     * *
     * [Set project avatar](#api-rest-api-2-project-projectIdOrKey-avatar-put) to set it as the project's displayed avatar.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param type                 The avatar type. (required)
     * @param entityId             The ID of the item the avatar is associated with. (required)
     * @param size                 The length of each side of the crop region. (required)
     * @param body                  (required)
     * @param x                    The X coordinate of the top-left corner of the crop region. (optional, defaults to 0)
     * @param y                    The Y coordinate of the top-left corner of the crop region. (optional, defaults to 0)
     */
    @RequestLine("POST /rest/api/2/universal_avatar/type/{type}/owner/{entityId}?x={x}&y={y}&size={size}")
    @Headers({
        "Content-Type: */*", 
        "Accept: application/json"
    })
    Avatar storeAvatar(@Param("type") @NotNull String type, @Param("entityId") @NotNull String entityId, @Param("size") @NotNull Integer size, @NotNull Object body, @Param("x") @Nullable Integer x, @Param("y") @Nullable Integer y);

    /**
     * Set project feature state
     * <p>
     * Sets the state of a project feature.
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param projectIdOrKey       The ID or (case-sensitive) key of the project. (required)
     * @param featureKey           The key of the feature. (required)
     * @param projectFeatureState  Details of the feature state change. (required)
     */
    @RequestLine("PUT /rest/api/2/project/{projectIdOrKey}/features/{featureKey}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    ContainerForProjectFeatures toggleFeatureForProject(@Param("projectIdOrKey") @NotNull String projectIdOrKey, @Param("featureKey") @NotNull String featureKey, @NotNull ProjectFeatureState projectFeatureState);

    /**
     * Move custom field to trash
     * <p>
     * Moves a custom field to trash. See [Edit or delete a custom field](https://confluence.atlassian.com/x/Z44fOw) for more information on trashing and deleting custom fields.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of a custom field. (required)
     */
    @RequestLine("POST /rest/api/2/field/{id}/trash")
    @Headers({
        "Accept: application/json"
    })
    Object trashCustomField(@Param("id") @NotNull String id);

    /**
     * Unarchive issue(s) by issue keys/ID
     * <p>
     * Enables admins to unarchive up to 1000 issues in a single request using issue ID/key, returning details of the issue(s) unarchived in the process and the errors encountered, if any.
     * **Note that:**
     *  *
     * you can't unarchive subtasks directly, only through their parent issues
     * *
     * you can only unarchive issues from software, service management, and business projects
     * **[Permissions](#permissions) required:** Jira admin or site admin: [global permission](https://confluence.atlassian.com/x/x4dKLg)
     * **License required:** Premium or Enterprise
     * **Signed-in users only:** This API can't be accessed anonymously.
     * 
     *  
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param issueArchivalSyncRequest Contains a list of issue keys or IDs to be unarchived. (required)
     */
    @RequestLine("PUT /rest/api/2/issue/unarchive")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    IssueArchivalSyncResponse unarchiveIssues(@NotNull IssueArchivalSyncRequest issueArchivalSyncRequest);

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
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     * @param id                   The ID of the comment. (required)
     * @param comment               (required)
     * @param notifyUsers          Whether users are notified when a comment is updated. (optional, defaults to true)
     * @param overrideEditableFlag Whether screen security is overridden to enable uneditable fields to be edited. Available to Connect app users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) and Forge apps acting on behalf of users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). (optional, defaults to false)
     * @param expand               Use [expand](#expansion) to include additional information about comments in the response. This parameter accepts {@code renderedBody}, which returns the comment body rendered in HTML. (optional)
     */
    @RequestLine("PUT /rest/api/2/issue/{issueIdOrKey}/comment/{id}?notifyUsers={notifyUsers}&overrideEditableFlag={overrideEditableFlag}&expand={expand}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Comment updateComment(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @Param("id") @NotNull String id, @NotNull Comment comment, @Param("notifyUsers") @Nullable Boolean notifyUsers, @Param("overrideEditableFlag") @Nullable Boolean overrideEditableFlag, @Param("expand") @Nullable String expand);

    /**
     * Update component
     * <p>
     * Updates a component. Any fields included in the request are overwritten. If {@code leadAccountId} is an empty string ("") the component lead is removed.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the component or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param id                   The ID of the component. (required)
     * @param projectComponent      (required)
     */
    @RequestLine("PUT /rest/api/2/component/{id}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    ProjectComponent updateComponent(@Param("id") @NotNull String id, @NotNull ProjectComponent projectComponent);

    /**
     * Update custom field
     * <p>
     * Updates a custom field.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param fieldId              The ID of the custom field. (required)
     * @param updateCustomFieldDetails The custom field update details. (required)
     */
    @RequestLine("PUT /rest/api/2/field/{fieldId}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object updateCustomField(@Param("fieldId") @NotNull String fieldId, @NotNull UpdateCustomFieldDetails updateCustomFieldDetails);

    /**
     * Update custom field configurations
     * <p>
     * Update the configuration for contexts of a custom field created by a [Forge app](https://developer.atlassian.com/platform/forge/).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the Forge app that created the custom field.
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param fieldIdOrKey         The ID or key of the custom field, for example {@code customfield_10000}. (required)
     * @param customFieldConfigurations  (required)
     */
    @RequestLine("PUT /rest/api/2/app/field/{fieldIdOrKey}/context/configuration")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object updateCustomFieldConfiguration(@Param("fieldIdOrKey") @NotNull String fieldIdOrKey, @NotNull CustomFieldConfigurations customFieldConfigurations);

    /**
     * Update custom field context
     * <p>
     * Updates a [ custom field context](https://confluence.atlassian.com/adminjiracloud/what-are-custom-field-contexts-991923859.html).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param fieldId              The ID of the custom field. (required)
     * @param contextId            The ID of the context. (required)
     * @param customFieldContextUpdateDetails  (required)
     */
    @RequestLine("PUT /rest/api/2/field/{fieldId}/context/{contextId}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object updateCustomFieldContext(@Param("fieldId") @NotNull String fieldId, @Param("contextId") @NotNull Long contextId, @NotNull CustomFieldContextUpdateDetails customFieldContextUpdateDetails);

    /**
     * Update custom field options (context)
     * <p>
     * Updates the options of a custom field.
     * If any of the options are not found, no options are updated. Options where the values in the request match the current values aren't updated and aren't reported in the response.
     * Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect apps.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param fieldId              The ID of the custom field. (required)
     * @param contextId            The ID of the context. (required)
     * @param bulkCustomFieldOptionUpdateRequest  (required)
     */
    @RequestLine("PUT /rest/api/2/field/{fieldId}/context/{contextId}/option")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    CustomFieldUpdatedContextOptionsList updateCustomFieldOption(@Param("fieldId") @NotNull String fieldId, @Param("contextId") @NotNull Long contextId, @NotNull BulkCustomFieldOptionUpdateRequest bulkCustomFieldOptionUpdateRequest);

    /**
     * Update custom field value
     * <p>
     * Updates the value of a custom field on one or more issues. Custom fields can only be updated by the Forge app that created them.
     * **[Permissions](#permissions) required:** Only the app that created the custom field can update its values with this operation.
     *
     * @param fieldIdOrKey         The ID or key of the custom field. For example, {@code customfield_10010}. (required)
     * @param customFieldValueUpdateDetails  (required)
     * @param generateChangelog    Whether to generate a changelog for this update. (optional, defaults to true)
     */
    @RequestLine("PUT /rest/api/2/app/field/{fieldIdOrKey}/value?generateChangelog={generateChangelog}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object updateCustomFieldValue(@Param("fieldIdOrKey") @NotNull String fieldIdOrKey, @NotNull CustomFieldValueUpdateDetails customFieldValueUpdateDetails, @Param("generateChangelog") @Nullable Boolean generateChangelog);

    /**
     * Update dashboard
     * <p>
     * Updates a dashboard, replacing all the dashboard details with those provided.
     * **[Permissions](#permissions) required:** None
     * The dashboard to be updated must be owned by the user.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param id                   The ID of the dashboard to update. (required)
     * @param dashboardDetails     Replacement dashboard details. (required)
     */
    @RequestLine("PUT /rest/api/2/dashboard/{id}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Dashboard updateDashboard(@Param("id") @NotNull String id, @NotNull DashboardDetails dashboardDetails);

    /**
     * Update issue type screen scheme default screen scheme
     * <p>
     * Updates the default screen scheme of an issue type screen scheme. The default screen scheme is used for all unmapped issue types.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param issueTypeScreenSchemeId The ID of the issue type screen scheme. (required)
     * @param updateDefaultScreenScheme  (required)
     */
    @RequestLine("PUT /rest/api/2/issuetypescreenscheme/{issueTypeScreenSchemeId}/mapping/default")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object updateDefaultScreenScheme(@Param("issueTypeScreenSchemeId") @NotNull String issueTypeScreenSchemeId, @NotNull UpdateDefaultScreenScheme updateDefaultScreenScheme);

    /**
     * Update default workflow
     * <p>
     * Sets the default workflow for a workflow scheme.
     * Note that active workflow schemes cannot be edited. If the workflow scheme is active, set {@code updateDraftIfNeeded} to {@code true} in the request object and a draft workflow scheme is created or updated with the new default workflow. The draft workflow scheme can be published in Jira.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the workflow scheme. (required)
     * @param defaultWorkflow      The new default workflow. (required)
     */
    @RequestLine("PUT /rest/api/2/workflowscheme/{id}/default")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    WorkflowScheme updateDefaultWorkflow(@Param("id") @NotNull Long id, @NotNull DefaultWorkflow defaultWorkflow);

    /**
     * Update draft default workflow
     * <p>
     * Sets the default workflow for a workflow scheme's draft.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the workflow scheme that the draft belongs to. (required)
     * @param defaultWorkflow      The object for the new default workflow. (required)
     */
    @RequestLine("PUT /rest/api/2/workflowscheme/{id}/draft/default")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    WorkflowScheme updateDraftDefaultWorkflow(@Param("id") @NotNull Long id, @NotNull DefaultWorkflow defaultWorkflow);

    /**
     * Set issue types for workflow in workflow scheme
     * <p>
     * Sets the issue types for a workflow in a workflow scheme's draft. The workflow can also be set as the default workflow for the draft workflow scheme. Unmapped issues types are mapped to the default workflow.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the workflow scheme that the draft belongs to. (required)
     * @param workflowName         The name of the workflow. (required)
     * @param issueTypesWorkflowMapping  (required)
     */
    @RequestLine("PUT /rest/api/2/workflowscheme/{id}/draft/workflow?workflowName={workflowName}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    WorkflowScheme updateDraftWorkflowMapping(@Param("id") @NotNull Long id, @Param("workflowName") @NotNull String workflowName, @NotNull IssueTypesWorkflowMapping issueTypesWorkflowMapping);

    /**
     * Update field configuration
     * <p>
     * Updates a field configuration. The name and the description provided in the request override the existing values.
     * This operation can only update configurations used in company-managed (classic) projects.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the field configuration. (required)
     * @param fieldConfigurationDetails  (required)
     */
    @RequestLine("PUT /rest/api/2/fieldconfiguration/{id}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object updateFieldConfiguration(@Param("id") @NotNull Long id, @NotNull FieldConfigurationDetails fieldConfigurationDetails);

    /**
     * Update field configuration items
     * <p>
     * Updates fields in a field configuration. The properties of the field configuration fields provided override the existing values.
     * This operation can only update field configurations used in company-managed (classic) projects.
     * The operation can set the renderer for text fields to the default text renderer ({@code text-renderer}) or wiki style renderer ({@code wiki-renderer}). However, the renderer cannot be updated for fields using the autocomplete renderer ({@code autocomplete-renderer}).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the field configuration. (required)
     * @param fieldConfigurationItemsDetails  (required)
     */
    @RequestLine("PUT /rest/api/2/fieldconfiguration/{id}/fields")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object updateFieldConfigurationItems(@Param("id") @NotNull Long id, @NotNull FieldConfigurationItemsDetails fieldConfigurationItemsDetails);

    /**
     * Update field configuration scheme
     * <p>
     * Updates a field configuration scheme.
     * This operation can only update field configuration schemes used in company-managed (classic) projects.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the field configuration scheme. (required)
     * @param updateFieldConfigurationSchemeDetails The details of the field configuration scheme. (required)
     */
    @RequestLine("PUT /rest/api/2/fieldconfigurationscheme/{id}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object updateFieldConfigurationScheme(@Param("id") @NotNull Long id, @NotNull UpdateFieldConfigurationSchemeDetails updateFieldConfigurationSchemeDetails);

    /**
     * Update filter
     * <p>
     * Updates a filter. Use this operation to update a filter's name, description, JQL, or sharing.
     * **[Permissions](#permissions) required:** Permission to access Jira, however the user must own the filter.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param id                   The ID of the filter to update. (required)
     * @param filter               The filter to update. (required)
     * @param expand               Use [expand](#expansion) to include additional information about filter in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code sharedUsers} Returns the users that the filter is shared with. This includes users that can browse projects that the filter is shared with. If you don't specify {@code sharedUsers}, then the {@code sharedUsers} object is returned but it doesn't list any users. The list of users returned is limited to 1000, to access additional users append {@code [start-index:end-index]} to the expand request. For example, to access the next 1000 users, use {@code ?expand=sharedUsers[1001:2000]}.  *  {@code subscriptions} Returns the users that are subscribed to the filter. If you don't specify {@code subscriptions}, the {@code subscriptions} object is returned but it doesn't list any subscriptions. The list of subscriptions returned is limited to 1000, to access additional subscriptions append {@code [start-index:end-index]} to the expand request. For example, to access the next 1000 subscriptions, use {@code ?expand=subscriptions[1001:2000]}. (optional)
     * @param overrideSharePermissions EXPERIMENTAL: Whether share permissions are overridden to enable the addition of any share permissions to filters. Available to users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). (optional, defaults to false)
     */
    @RequestLine("PUT /rest/api/2/filter/{id}?expand={expand}&overrideSharePermissions={overrideSharePermissions}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Filter updateFilter(@Param("id") @NotNull Long id, @NotNull Filter filter, @Param("expand") @Nullable String expand, @Param("overrideSharePermissions") @Nullable Boolean overrideSharePermissions);

    /**
     * Update gadget on dashboard
     * <p>
     * Changes the title, position, and color of the gadget on a dashboard.
     * **[Permissions](#permissions) required:** None.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param dashboardId          The ID of the dashboard. (required)
     * @param gadgetId             The ID of the gadget. (required)
     * @param dashboardGadgetUpdateRequest  (required)
     */
    @RequestLine("PUT /rest/api/2/dashboard/{dashboardId}/gadget/{gadgetId}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object updateGadget(@Param("dashboardId") @NotNull Long dashboardId, @Param("gadgetId") @NotNull Long gadgetId, @NotNull DashboardGadgetUpdateRequest dashboardGadgetUpdateRequest);

    /**
     * Update issue field option
     * <p>
     * Updates or creates an option for a select list issue field. This operation requires that the option ID is provided when creating an option, therefore, the option ID needs to be specified as a path and body parameter. The option ID provided in the path and body must be identical.
     * Note that this operation **only works for issue field select list options added by Connect apps**, it cannot be used with issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the app providing the field.
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param fieldKey             The field key is specified in the following format: **$(app-key)\\_\\_$(field-key)**. For example, *example-add-on\\_\\_example-issue-field*. To determine the {@code fieldKey} value, do one of the following:   *  open the app's plugin descriptor, then **app-key** is the key at the top and **field-key** is the key in the {@code jiraIssueFields} module. **app-key** can also be found in the app listing in the Atlassian Universal Plugin Manager.  *  run [Get fields](#api-rest-api-2-field-get) and in the field details the value is returned in {@code key}. For example, {@code "key": "teams-add-on__team-issue-field"} (required)
     * @param optionId             The ID of the option to be updated. (required)
     * @param issueFieldOption      (required)
     */
    @RequestLine("PUT /rest/api/2/field/{fieldKey}/option/{optionId}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    IssueFieldOption updateIssueFieldOption(@Param("fieldKey") @NotNull String fieldKey, @Param("optionId") @NotNull Long optionId, @NotNull IssueFieldOption issueFieldOption);

    /**
     * Update issue link type
     * <p>
     * Updates an issue link type.
     * To use this operation, the site must have [issue linking](https://confluence.atlassian.com/x/yoXKM) enabled.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param issueLinkTypeId      The ID of the issue link type. (required)
     * @param issueLinkType         (required)
     */
    @RequestLine("PUT /rest/api/2/issueLinkType/{issueLinkTypeId}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    IssueLinkType updateIssueLinkType(@Param("issueLinkTypeId") @NotNull String issueLinkTypeId, @NotNull IssueLinkType issueLinkType);

    /**
     * Update issue security scheme
     * <p>
     * Updates the issue security scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the issue security scheme. (required)
     * @param updateIssueSecuritySchemeRequestBean  (required)
     */
    @RequestLine("PUT /rest/api/2/issuesecurityschemes/{id}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object updateIssueSecurityScheme(@Param("id") @NotNull String id, @NotNull UpdateIssueSecuritySchemeRequestBean updateIssueSecuritySchemeRequestBean);

    /**
     * Update issue type
     * <p>
     * Updates the issue type.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the issue type. (required)
     * @param issueTypeUpdateBean   (required)
     */
    @RequestLine("PUT /rest/api/2/issuetype/{id}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    IssueTypeDetails updateIssueType(@Param("id") @NotNull String id, @NotNull IssueTypeUpdateBean issueTypeUpdateBean);

    /**
     * Update issue type scheme
     * <p>
     * Updates an issue type scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param issueTypeSchemeId    The ID of the issue type scheme. (required)
     * @param issueTypeSchemeUpdateDetails  (required)
     */
    @RequestLine("PUT /rest/api/2/issuetypescheme/{issueTypeSchemeId}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object updateIssueTypeScheme(@Param("issueTypeSchemeId") @NotNull Long issueTypeSchemeId, @NotNull IssueTypeSchemeUpdateDetails issueTypeSchemeUpdateDetails);

    /**
     * Update issue type screen scheme
     * <p>
     * Updates an issue type screen scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param issueTypeScreenSchemeId The ID of the issue type screen scheme. (required)
     * @param issueTypeScreenSchemeUpdateDetails The issue type screen scheme update details. (required)
     */
    @RequestLine("PUT /rest/api/2/issuetypescreenscheme/{issueTypeScreenSchemeId}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object updateIssueTypeScreenScheme(@Param("issueTypeScreenSchemeId") @NotNull String issueTypeScreenSchemeId, @NotNull IssueTypeScreenSchemeUpdateDetails issueTypeScreenSchemeUpdateDetails);

    /**
     * Update custom fields
     * <p>
     * Updates the value of one or more custom fields on one or more issues. Combinations of custom field and issue should be unique within the request. Custom fields can only be updated by the Forge app that created them.
     * **[Permissions](#permissions) required:** Only the app that created the custom field can update its values with this operation.
     *
     * @param multipleCustomFieldValuesUpdateDetails  (required)
     * @param generateChangelog    Whether to generate a changelog for this update. (optional, defaults to true)
     */
    @RequestLine("POST /rest/api/2/app/field/value?generateChangelog={generateChangelog}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object updateMultipleCustomFieldValues(@NotNull MultipleCustomFieldValuesUpdateDetails multipleCustomFieldValuesUpdateDetails, @Param("generateChangelog") @Nullable Boolean generateChangelog);

    /**
     * Update notification scheme
     * <p>
     * Updates a notification scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the notification scheme. (required)
     * @param updateNotificationSchemeDetails  (required)
     */
    @RequestLine("PUT /rest/api/2/notificationscheme/{id}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object updateNotificationScheme(@Param("id") @NotNull String id, @NotNull UpdateNotificationSchemeDetails updateNotificationSchemeDetails);

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
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param schemeId             The ID of the permission scheme to update. (required)
     * @param permissionScheme      (required)
     * @param expand               Use expand to include additional information in the response. This parameter accepts a comma-separated list. Note that permissions are always included when you specify any value. Expand options include:   *  {@code all} Returns all expandable information.  *  {@code field} Returns information about the custom field granted the permission.  *  {@code group} Returns information about the group that is granted the permission.  *  {@code permissions} Returns all permission grants for each permission scheme.  *  {@code projectRole} Returns information about the project role granted the permission.  *  {@code user} Returns information about the user who is granted the permission. (optional)
     */
    @RequestLine("PUT /rest/api/2/permissionscheme/{schemeId}?expand={expand}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    PermissionScheme updatePermissionScheme(@Param("schemeId") @NotNull Long schemeId, @NotNull PermissionScheme permissionScheme, @Param("expand") @Nullable String expand);

    /**
     * Update precomputations (apps)
     * <p>
     * Update the precomputation value of a function created by a Forge/Connect app.
     * **[Permissions](#permissions) required:** An API for apps to update their own precomputations.
     *
     * @param jqlFunctionPrecomputationUpdateRequestBean  (required)
     */
    @RequestLine("POST /rest/api/2/jql/function/computation")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object updatePrecomputations(@NotNull JqlFunctionPrecomputationUpdateRequestBean jqlFunctionPrecomputationUpdateRequestBean);

    /**
     * Update priority
     * <p>
     * Updates an issue priority.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the issue priority. (required)
     * @param updatePriorityDetails  (required)
     */
    @RequestLine("PUT /rest/api/2/priority/{id}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object updatePriority(@Param("id") @NotNull String id, @NotNull UpdatePriorityDetails updatePriorityDetails);

    /**
     * Update project
     * <p>
     * Updates the [project details](https://confluence.atlassian.com/x/ahLpNw) of a project.
     * All parameters are optional in the body of the request. Schemes will only be updated if they are included in the request, any omitted schemes will be left unchanged.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). is only needed when changing the schemes or project key. Otherwise you will only need *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg)
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param projectIdOrKey       The project ID or project key (case sensitive). (required)
     * @param updateProjectDetails The project details to be updated. (required)
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Note that the project description, issue types, and project lead are included in all responses by default. Expand options include:   *  {@code description} The project description.  *  {@code issueTypes} The issue types associated with the project.  *  {@code lead} The project lead.  *  {@code projectKeys} All project keys associated with the project. (optional)
     */
    @RequestLine("PUT /rest/api/2/project/{projectIdOrKey}?expand={expand}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Project updateProject(@Param("projectIdOrKey") @NotNull String projectIdOrKey, @NotNull UpdateProjectDetails updateProjectDetails, @Param("expand") @Nullable String expand);

    /**
     * Set project avatar
     * <p>
     * Sets the avatar displayed for a project.
     * Use [Load project avatar](#api-rest-api-2-project-projectIdOrKey-avatar2-post) to store avatars against the project, before using this operation to set the displayed avatar.
     * **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param projectIdOrKey       The ID or (case-sensitive) key of the project. (required)
     * @param avatar                (required)
     */
    @RequestLine("PUT /rest/api/2/project/{projectIdOrKey}/avatar")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object updateProjectAvatar(@Param("projectIdOrKey") @NotNull String projectIdOrKey, @NotNull Avatar avatar);

    /**
     * Update project category
     * <p>
     * Updates a project category.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param id                    (required)
     * @param projectCategory       (required)
     */
    @RequestLine("PUT /rest/api/2/projectCategory/{id}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    UpdatedProjectCategory updateProjectCategory(@Param("id") @NotNull Long id, @NotNull ProjectCategory projectCategory);

    /**
     * Set project's sender email
     * <p>
     * Sets the [project's sender email address](https://confluence.atlassian.com/x/dolKLg).
     * If {@code emailAddress} is an empty string, the default email address is restored.
     * **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param projectId            The project ID. (required)
     * @param projectEmailAddress  The project's sender email address to be set. (required)
     */
    @RequestLine("PUT /rest/api/2/project/{projectId}/email")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object updateProjectEmail(@Param("projectId") @NotNull Long projectId, @NotNull ProjectEmailAddress projectEmailAddress);

    /**
     * Update related work
     * <p>
     * Updates the given related work. You can only update generic link related works via Rest APIs. Any archived version related works can't be edited.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Resolve issues:* and *Edit issues* [Managing project permissions](https://confluence.atlassian.com/adminjiraserver/managing-project-permissions-938847145.html) for the project that contains the version.
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param id                   The ID of the version to update the related work on. For the related work id, pass it to the input JSON. (required)
     * @param versionRelatedWork    (required)
     */
    @RequestLine("PUT /rest/api/2/version/{id}/relatedwork")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    VersionRelatedWork updateRelatedWork(@Param("id") @NotNull String id, @NotNull VersionRelatedWork versionRelatedWork);

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
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param issueIdOrKey         The ID or key of the issue. (required)
     * @param linkId               The ID of the remote issue link. (required)
     * @param remoteIssueLinkRequest  (required)
     */
    @RequestLine("PUT /rest/api/2/issue/{issueIdOrKey}/remotelink/{linkId}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object updateRemoteIssueLink(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @Param("linkId") @NotNull String linkId, @NotNull RemoteIssueLinkRequest remoteIssueLinkRequest);

    /**
     * Update resolution
     * <p>
     * Updates an issue resolution.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the issue resolution. (required)
     * @param updateResolutionDetails  (required)
     */
    @RequestLine("PUT /rest/api/2/resolution/{id}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object updateResolution(@Param("id") @NotNull String id, @NotNull UpdateResolutionDetails updateResolutionDetails);

    /**
     * Update workflow scheme
     * <p>
     * Updates company-managed and team-managed project workflow schemes. This API doesn't have a concept of draft, so any changes made to a workflow scheme are immediately available. When changing the available statuses for issue types, an [asynchronous task](#async) migrates the issues as defined in the provided mappings.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* project permission to update all, including global-scoped, workflow schemes.
     * *
     * *Administer projects* project permission to update project-scoped workflow schemes.
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param workflowSchemeUpdateRequest  (required)
     */
    @RequestLine("POST /rest/api/2/workflowscheme/update")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object updateSchemes(@NotNull WorkflowSchemeUpdateRequest workflowSchemeUpdateRequest);

    /**
     * Update screen
     * <p>
     * Updates a screen. Only screens used in classic projects can be updated.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param screenId             The ID of the screen. (required)
     * @param updateScreenDetails   (required)
     */
    @RequestLine("PUT /rest/api/2/screens/{screenId}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Screen updateScreen(@Param("screenId") @NotNull Long screenId, @NotNull UpdateScreenDetails updateScreenDetails);

    /**
     * Update screen scheme
     * <p>
     * Updates a screen scheme. Only screen schemes used in classic projects can be updated.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param screenSchemeId       The ID of the screen scheme. (required)
     * @param updateScreenSchemeDetails The screen scheme update details. (required)
     */
    @RequestLine("PUT /rest/api/2/screenscheme/{screenSchemeId}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object updateScreenScheme(@Param("screenSchemeId") @NotNull String screenSchemeId, @NotNull UpdateScreenSchemeDetails updateScreenSchemeDetails);

    /**
     * Update issue security level
     * <p>
     * Updates the issue security level.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param schemeId             The ID of the issue security scheme level belongs to. (required)
     * @param levelId              The ID of the issue security level to update. (required)
     * @param updateIssueSecurityLevelDetails  (required)
     */
    @RequestLine("PUT /rest/api/2/issuesecurityschemes/{schemeId}/level/{levelId}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object updateSecurityLevel(@Param("schemeId") @NotNull String schemeId, @Param("levelId") @NotNull String levelId, @NotNull UpdateIssueSecurityLevelDetails updateIssueSecurityLevelDetails);

    /**
     * Bulk update statuses
     * <p>
     * Updates statuses by ID.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)
     * *
     * *Administer Jira* [project permission.](https://confluence.atlassian.com/x/yodKLg)
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param statusUpdateRequest  The list of statuses that will be updated. (required)
     */
    @RequestLine("PUT /rest/api/2/statuses")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object updateStatuses(@NotNull StatusUpdateRequest statusUpdateRequest);

    /**
     * Update UI modification
     * <p>
     * Updates a UI modification. UI modification can only be updated by Forge apps.
     * Each UI modification can define up to 1000 contexts. The same context can be assigned to maximum 100 UI modifications.
     * **[Permissions](#permissions) required:**
     *  *
     * *None* if the UI modification is created without contexts.
     * *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for one or more projects, if the UI modification is created with contexts.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param uiModificationId     The ID of the UI modification. (required)
     * @param updateUiModificationDetails Details of the UI modification. (required)
     */
    @RequestLine("PUT /rest/api/2/uiModifications/{uiModificationId}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Object updateUiModification(@Param("uiModificationId") @NotNull String uiModificationId, @NotNull UpdateUiModificationDetails updateUiModificationDetails);

    /**
     * Update version
     * <p>
     * Updates a project version.
     * This operation can be accessed anonymously.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that contains the version.
     *
     * Authentication - Required Scopes: [manage:jira-project]
     * @param id                   The ID of the version. (required)
     * @param version               (required)
     */
    @RequestLine("PUT /rest/api/2/version/{id}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Version updateVersion(@Param("id") @NotNull String id, @NotNull Version version);

    /**
     * Set issue types for workflow in workflow scheme
     * <p>
     * Sets the issue types for a workflow in a workflow scheme. The workflow can also be set as the default workflow for the workflow scheme. Unmapped issues types are mapped to the default workflow.
     * Note that active workflow schemes cannot be edited. If the workflow scheme is active, set {@code updateDraftIfNeeded} to {@code true} in the request body and a draft workflow scheme is created or updated with the new workflow-issue types mappings. The draft workflow scheme can be published in Jira.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the workflow scheme. (required)
     * @param workflowName         The name of the workflow. (required)
     * @param issueTypesWorkflowMapping  (required)
     */
    @RequestLine("PUT /rest/api/2/workflowscheme/{id}/workflow?workflowName={workflowName}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    WorkflowScheme updateWorkflowMapping(@Param("id") @NotNull Long id, @Param("workflowName") @NotNull String workflowName, @NotNull IssueTypesWorkflowMapping issueTypesWorkflowMapping);

    /**
     * Classic update workflow scheme
     * <p>
     * Updates a company-manged project workflow scheme, including the name, default workflow, issue type to project mappings, and more. If the workflow scheme is active (that is, being used by at least one project), then a draft workflow scheme is created or updated instead, provided that {@code updateDraftIfNeeded} is set to {@code true}.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the workflow scheme. Find this ID by editing the desired workflow scheme in Jira. The ID is shown in the URL as {@code schemeId}. For example, *schemeId=10301*. (required)
     * @param workflowScheme        (required)
     */
    @RequestLine("PUT /rest/api/2/workflowscheme/{id}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    WorkflowScheme updateWorkflowScheme(@Param("id") @NotNull Long id, @NotNull WorkflowScheme workflowScheme);

    /**
     * Update draft workflow scheme
     * <p>
     * Updates a draft workflow scheme. If a draft workflow scheme does not exist for the active workflow scheme, then a draft is created. Note that an active workflow scheme can only have one draft workflow scheme.
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param id                   The ID of the active workflow scheme that the draft was created from. (required)
     * @param workflowScheme        (required)
     */
    @RequestLine("PUT /rest/api/2/workflowscheme/{id}/draft")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    WorkflowScheme updateWorkflowSchemeDraft(@Param("id") @NotNull Long id, @NotNull WorkflowScheme workflowScheme);

    /**
     * Get required status mappings for workflow scheme update
     * <p>
     * Gets the required status mappings for the desired changes to a workflow scheme. The results are provided per issue type and workflow. When updating a workflow scheme, status mappings can be provided per issue type, per workflow, or both.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* permission to update all, including global-scoped, workflow schemes.
     * *
     * *Administer projects* project permission to update project-scoped workflow schemes.
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param workflowSchemeUpdateRequiredMappingsRequest  (required)
     */
    @RequestLine("POST /rest/api/2/workflowscheme/update/mappings")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    WorkflowSchemeUpdateRequiredMappingsResponse updateWorkflowSchemeMappings(@NotNull WorkflowSchemeUpdateRequiredMappingsRequest workflowSchemeUpdateRequiredMappingsRequest);

    /**
     * Update workflow transition property
     * <p>
     * Updates a workflow transition by changing the property value. Trying to update a property that does not exist results in a new property being added to the transition. Transition properties are used to change the behavior of a transition. For more information, see [Transition properties](https://confluence.atlassian.com/x/zIhKLg#Advancedworkflowconfiguration-transitionproperties) and [Workflow properties](https://confluence.atlassian.com/x/JYlKLg).
     * **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param transitionId         The ID of the transition. To get the ID, view the workflow in text mode in the Jira admin settings. The ID is shown next to the transition. (required)
     * @param key                  The key of the property being updated, also known as the name of the property. Set this to the same value as the {@code key} defined in the request body. (required)
     * @param workflowName         The name of the workflow that the transition belongs to. (required)
     * @param workflowTransitionProperty  (required)
     * @param workflowMode         The workflow status. Set to {@code live} for inactive workflows or {@code draft} for draft workflows. Active workflows cannot be edited. (optional)
     */
    @RequestLine("PUT /rest/api/2/workflow/transitions/{transitionId}/properties?key={key}&workflowName={workflowName}&workflowMode={workflowMode}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    WorkflowTransitionProperty updateWorkflowTransitionProperty(@Param("transitionId") @NotNull Long transitionId, @Param("key") @NotNull String key, @Param("workflowName") @NotNull String workflowName, @NotNull WorkflowTransitionProperty workflowTransitionProperty, @Param("workflowMode") @Nullable String workflowMode);

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
     * Only rules created by the calling [Connect](https://developer.atlassian.com/cloud/jira/platform/index/#connect-apps) or [Forge](https://developer.atlassian.com/cloud/jira/platform/index/#forge-apps) app can be updated.
     * To assist with app migration, this operation can be used to:
     *  *
     * Disable a rule.
     * *
     * Add a {@code tag}. Use this to filter rules in the [Get workflow transition rule configurations](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-workflow-transition-rules/#api-rest-api-3-workflow-rule-config-get).
     * Rules are enabled if the {@code disabled} parameter is not provided.
     * **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/index/#connect-apps) or [Forge](https://developer.atlassian.com/cloud/jira/platform/index/#forge-apps) apps can use this operation.
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param workflowTransitionRulesUpdate  (required)
     */
    @RequestLine("PUT /rest/api/2/workflow/rule/config")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    WorkflowTransitionRulesUpdateErrors updateWorkflowTransitionRuleConfigurations(@NotNull WorkflowTransitionRulesUpdate workflowTransitionRulesUpdate);

    /**
     * Bulk update workflows
     * <p>
     * Update workflows and related statuses.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* project permission to create all, including global-scoped, workflows
     * *
     * *Administer projects* project permissions to create project-scoped workflows
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param workflowUpdateRequest  (required)
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  {@code workflows.usages} Returns the project and issue types that each workflow is associated with.  *  {@code statuses.usages} Returns the project and issue types that each status is associated with. (optional)
     */
    @RequestLine("POST /rest/api/2/workflows/update?expand={expand}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    WorkflowUpdateResponse updateWorkflows(@NotNull WorkflowUpdateRequest workflowUpdateRequest, @Param("expand") @Nullable String expand);

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
     *
     * Authentication - Required Scopes: [write:jira-work]
     * @param issueIdOrKey         The ID or key the issue. (required)
     * @param id                   The ID of the worklog. (required)
     * @param worklog               (required)
     * @param notifyUsers          Whether users watching the issue are notified by email. (optional, defaults to true)
     * @param adjustEstimate       Defines how to update the issue's time estimate, the options are:   *  {@code new} Sets the estimate to a specific value, defined in {@code newEstimate}.  *  {@code leave} Leaves the estimate unchanged.  *  {@code auto} Updates the estimate by the difference between the original and updated value of {@code timeSpent} or {@code timeSpentSeconds}. (optional, defaults to auto)
     * @param newEstimate          The value to set as the issue's remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when {@code adjustEstimate} is {@code new}. (optional)
     * @param expand               Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts {@code properties}, which returns worklog properties. (optional)
     * @param overrideEditableFlag Whether the worklog should be added to the issue even if the issue is not editable. For example, because the issue is closed. Connect and Forge app users with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) can use this flag. (optional, defaults to false)
     */
    @RequestLine("PUT /rest/api/2/issue/{issueIdOrKey}/worklog/{id}?notifyUsers={notifyUsers}&adjustEstimate={adjustEstimate}&newEstimate={newEstimate}&expand={expand}&overrideEditableFlag={overrideEditableFlag}")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    Worklog updateWorklog(@Param("issueIdOrKey") @NotNull String issueIdOrKey, @Param("id") @NotNull String id, @NotNull Worklog worklog, @Param("notifyUsers") @Nullable Boolean notifyUsers, @Param("adjustEstimate") @Nullable String adjustEstimate, @Param("newEstimate") @Nullable String newEstimate, @Param("expand") @Nullable String expand, @Param("overrideEditableFlag") @Nullable Boolean overrideEditableFlag);

    /**
     * Validate create workflows
     * <p>
     * Validate the payload for bulk create workflows.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* project permission to create all, including global-scoped, workflows
     * *
     * *Administer projects* project permissions to create project-scoped workflows
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param workflowCreateValidateRequest  (required)
     */
    @RequestLine("POST /rest/api/2/workflows/create/validation")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    WorkflowValidationErrorList validateCreateWorkflows(@NotNull WorkflowCreateValidateRequest workflowCreateValidateRequest);

    /**
     * Validate project key
     * <p>
     * Validates a project key by confirming the key is a valid string and not in use.
     * **[Permissions](#permissions) required:** None.
     *
     * Authentication - Required Scopes: [read:jira-work]
     * @param key                  The project key. (optional)
     */
    @RequestLine("GET /rest/api/2/projectvalidate/key?key={key}")
    @Headers({
        "Accept: application/json"
    })
    ErrorCollection validateProjectKey(@Param("key") @Nullable String key);

    /**
     * Validate update workflows
     * <p>
     * Validate the payload for bulk update workflows.
     * **[Permissions](#permissions) required:**
     *  *
     * *Administer Jira* project permission to create all, including global-scoped, workflows
     * *
     * *Administer projects* project permissions to create project-scoped workflows
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param workflowUpdateValidateRequestBean  (required)
     */
    @RequestLine("POST /rest/api/2/workflows/update/validation")
    @Headers({
        "Content-Type: application/json", 
        "Accept: application/json"
    })
    WorkflowValidationErrorList validateUpdateWorkflows(@NotNull WorkflowUpdateValidateRequestBean workflowUpdateValidateRequestBean);

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
     * {@code permissionKey} The permission required to perform the transition. Allowed values: [built-in Jira permissions](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-permission-schemes/#built-in-permissions).
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
     * {@code blocker} currently only supports {@code PARENT}.
     * *
     * {@code statusIds} a comma-separated list of status IDs.
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
     * {@code previousStatusIds} a comma-separated list of status IDs, currently only support one ID.
     * *
     * {@code mostRecentStatusOnly} when {@code true} only considers the most recent status for the condition evaluation. Allowed values: {@code true}, {@code false}.
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
     * {@code fieldsRequired} the ID of the field that is required. For a custom field, it would look like {@code customfield_123}.
     * *
     * {@code ignoreContext} controls the impact of context settings on field validation. When set to {@code true}, the validator doesn't check a required field if its context isn't configured for the current issue. When set to {@code false}, the validator requires a field even if its context is invalid. Allowed values: {@code true}, {@code false}.
     * *
     * {@code errorMessage} is the error message to display if the user does not provide a value during the transition. A default error message will be shown if you don't provide one (Optional).
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
     * {@code groupsExemptFromValidation} a comma-separated list of group IDs to be exempt from the validation.
     * *
     * {@code fieldKey} the ID of the field that has changed. For a custom field, it would look like {@code customfield_123}.
     * *
     * {@code errorMessage} the error message to display if the user does not provide a value during the transition. A default error message will be shown if you don't provide one (Optional).
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
     * {@code fieldKey} the ID of the field to validate. For a custom field, it would look like {@code customfield_123}.
     * *
     * {@code excludeSubtasks} Option to exclude values copied from sub-tasks. Allowed values: {@code true}, {@code false}.
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
     * {@code regexp} the regular expression used to validate the field’s content.
     * *
     * {@code fieldKey} the ID of the field to validate. For a custom field, it would look like {@code customfield_123}.
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
     * {@code date1FieldKey} the ID of the first field to compare. For a custom field, it would look like {@code customfield_123}.
     * *
     * {@code date2FieldKey} the ID of the second field to compare. For a custom field, it would look like {@code customfield_123}.
     * *
     * {@code includeTime} if {@code true}, compares both date and time. Allowed values: {@code true}, {@code false}.
     * *
     * {@code conditionSelected} the condition to compare with. Allowed values: {@code &amp;gt;}, {@code &amp;gt;=}, {@code =}, {@code &amp;lt;=}, {@code &amp;lt;}, {@code !=}.
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
     * {@code date1FieldKey} the ID of the first field to compare. For a custom field, it would look like {@code customfield_123}.
     * *
     * {@code date2FieldKey} the ID of the second field to compare. For a custom field, it would look like {@code customfield_123}.
     * *
     * {@code numberOfDays} maximum number of days past the reference date ({@code date2FieldKey}) to pass validation.
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
     * {@code fieldId} The ID of the field to check the value of. For non-system fields, it will look like {@code customfield_123}. Note: {@code fieldId} is used interchangeably with the idea of {@code fieldKey} here, they refer to the same field.
     * *
     * {@code fieldValue} the list of values to check against the field’s value.
     * *
     * {@code comparator} The comparison logic. Allowed values: {@code &amp;gt;}, {@code &amp;gt;=}, {@code =}, {@code &amp;lt;=}, {@code &amp;lt;}, {@code !=}.
     * *
     * {@code comparisonType} The type of data being compared. Allowed values: {@code STRING}, {@code NUMBER}, {@code DATE}, {@code DATE_WITHOUT_TIME}, {@code OPTIONID}.
     * ##### Restrict issue transition #####
     * This rule ensures that issue transitions are restricted based on user accounts, roles, group memberships, and permissions, maintaining control over who can transition an issue. This condition evaluates as {@code true} if any of the following criteria is met.
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
     * {@code accountIds} a comma-separated list of the user account IDs. It also allows generic values like: {@code allow-assignee}, {@code allow-reporter}, and {@code accountIds} Note: This is only supported in team-managed projects
     * *
     * {@code roleIds} a comma-separated list of role IDs.
     * *
     * {@code groupIds} a comma-separated list of group IDs.
     * *
     * {@code permissionKeys} a comma-separated list of permission keys. Allowed values: [built-in Jira permissions](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-permission-schemes/#built-in-permissions).
     * *
     * {@code groupCustomFields} a comma-separated list of group custom field IDs.
     * *
     * {@code allowUserCustomFields} a comma-separated list of user custom field IDs to allow for issue transition.
     * *
     * {@code denyUserCustomFields} a comma-separated list of user custom field IDs to deny for issue transition.
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
     * {@code previousStatusIds} a comma-separated list of status IDs, current only support one ID.
     * *
     * {@code not} indicates if the condition should be reversed. When {@code true} it checks that the issue has not been in the selected statuses. Allowed values: {@code true}, {@code false}.
     * *
     * {@code mostRecentStatusOnly} when true only considers the most recent status for the condition evaluation. Allowed values: {@code true}, {@code false}.
     * *
     * {@code includeCurrentStatus} includes the current status when evaluating if the issue has been through the selected statuses. Allowed values: {@code true}, {@code false}.
     * *
     * {@code ignoreLoopTransitions} ignore loop transitions. Allowed values: {@code true}, {@code false}.
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
     * {@code blocker} currently only supports {@code CHILD}.
     * *
     * {@code statusIds} a comma-separated list of status IDs.
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
     * {@code fromStatusId} represents the status ID from which the issue is transitioning. It ensures that the user performing the current transition has not performed any actions when the issue was in the specified status.
     * *
     * {@code toStatusId} represents the status ID to which the issue is transitioning. It ensures that the user performing the current transition is not the same user who has previously transitioned the issue.
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
     * {@code restrictMode} restricts the issue transition including/excluding APIs. Allowed values: {@code "users"}, {@code "usersAndAPI"}.
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
     * {@code approvalConfigurationJson} a stringified JSON holding the Jira Service Management approval configuration.
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
     * {@code approvalConfigurationJson} a stringified JSON holding the Jira Service Management approval configuration.
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
     * {@code type} the parameter used to determine the new assignee. Allowed values: {@code to-selected-user}, {@code to-unassigned}, {@code to-current-user}, {@code to-current-user}, {@code to-default-user}, {@code to-default-user}
     * *
     * {@code accountId} the account ID of the user to assign the issue to. This parameter is required only when the type is {@code "to-selected-user"}.
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
     * {@code sourceFieldKey} the field key to copy from. For a custom field, it would look like {@code customfield_123}
     * *
     * {@code targetFieldKey} the field key to copy to. For a custom field, it would look like {@code customfield_123}
     * *
     * {@code issueSource} {@code SAME} or {@code PARENT}. Defaults to {@code SAME} if no value is provided.
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
     * {@code field} the ID of the field to update. For a custom field, it would look like {@code customfield_123}
     * *
     * {@code value} the value to update the field with.
     * *
     * {@code mode} {@code append} or {@code replace}. Determines if a value will be appended to the current value, or if the current value will be replaced.
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
     * {@code webhookId} the ID of the webhook.
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
     * {@code remindingFieldIds} a comma-separated list of field IDs. Note: {@code fieldId} is used interchangeably with the idea of {@code fieldKey} here, they refer to the same field.
     * *
     * {@code remindingMessage} the message to display when prompting the users to update the fields.
     * *
     * {@code remindingAlwaysAsk} always remind to update fields. Allowed values: {@code true}, {@code false}.
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
     * {@code screenId} the ID of the screen.
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
     * {@code ruleKey} Validator: {@code connect:expression-validator}, Condition: {@code connect:expression-condition}, and Post function: {@code connect:remote-workflow-function}
     * *
     * {@code appKey} the reference to the Connect app
     * *
     * {@code config} a JSON payload string describing the configuration
     * *
     * {@code id} the ID of the rule
     * *
     * {@code disabled} determine if the Connect app is disabled. Allowed values: {@code true}, {@code false}.
     * *
     * {@code tag} additional tags for the Connect app
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
     * {@code ruleKey} Validator: {@code forge:expression-validator}, Condition: {@code forge:expression-condition}, and Post function: {@code forge:workflow-post-function}
     * *
     * {@code key} the identifier for the Forge app
     * *
     * {@code config} the persistent stringified JSON configuration for the Forge rule
     * *
     * {@code id} the ID of the Forge rule
     *
     * Authentication - Required Scopes: [manage:jira-configuration]
     * @param workflowId            (optional)
     * @param projectId             (optional)
     * @param issueTypeId           (optional)
     */
    @RequestLine("GET /rest/api/2/workflows/capabilities?workflowId={workflowId}&projectId={projectId}&issueTypeId={issueTypeId}")
    @Headers({
        "Accept: application/json"
    })
    WorkflowCapabilities workflowCapabilities(@Param("workflowId") @Nullable String workflowId, @Param("projectId") @Nullable String projectId, @Param("issueTypeId") @Nullable String issueTypeId);

}
