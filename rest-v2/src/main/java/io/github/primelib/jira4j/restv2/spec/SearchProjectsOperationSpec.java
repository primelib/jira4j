package io.github.primelib.jira4j.restv2.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Filter;
import io.github.primelib.jira4j.restv2.model.Project;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * SearchProjectsSpec
 * <p>
 * Specification for the SearchProjects operation.
 * <p>
 * Get projects paginated
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SearchProjectsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The index of the first item to return in a page of results (page offset).
     */
    @Nullable 
    private Long startAt = 0L;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults = 50;

    /**
     * [Order](#ordering) the results by a field.
     *  *
     * `category` Sorts by project category. A complete list of category IDs is found using [Get all project categories](#api-rest-api-2-projectCategory-get).
     * *
     * `issueCount` Sorts by the total number of issues in each project.
     * *
     * `key` Sorts by project key.
     * *
     * `lastIssueUpdatedTime` Sorts by the last issue update time.
     * *
     * `name` Sorts by project name.
     * *
     * `owner` Sorts by project lead.
     * *
     * `archivedDate` EXPERIMENTAL. Sorts by project archived date.
     * *
     * `deletedDate` EXPERIMENTAL. Sorts by project deleted date.
     */
    @Nullable 
    private String orderBy = "key";

    /**
     * The project IDs to filter the results by. To include multiple IDs, provide an ampersand-separated list. For example, `id=10000&amp;id=10001`. Up to 50 project IDs can be provided.
     */
    @Nullable 
    private Set<Long> id;

    /**
     * The project keys to filter the results by. To include multiple keys, provide an ampersand-separated list. For example, `keys=PA&amp;keys=PB`. Up to 50 project keys can be provided.
     */
    @Nullable 
    private Set<String> keys;

    /**
     * Filter the results using a literal string. Projects with a matching `key` or `name` are returned (case insensitive).
     */
    @Nullable 
    private String query;

    /**
     * Orders results by the [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes). This parameter accepts a comma-separated list. Valid values are `business`, `service_desk`, and `software`.
     */
    @Nullable 
    private String typeKey;

    /**
     * The ID of the project's category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-2-projectCategory-get) operation.
     */
    @Nullable 
    private Long categoryId;

    /**
     * Filter results by projects for which the user can:
     *  *
     * `view` the project, meaning that they have one of the following permissions:
     * 
     * 
     * 
     * 
     *  *
     * *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * 
     * 
     * *
     * *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * 
     * 
     * *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * *
     * `browse` the project, meaning that they have the *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * *
     * `edit` the project, meaning that they have one of the following permissions:
     * 
     * 
     * 
     * 
     *  *
     * *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * 
     * 
     * *
     * *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     */
    @Nullable 
    private String action = "view";

    /**
     * Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expanded options include:
     *  *
     * `description` Returns the project description.
     * *
     * `projectKeys` Returns all project keys associated with a project.
     * *
     * `lead` Returns information about the project lead.
     * *
     * `issueTypes` Returns all issue types associated with the project.
     * *
     * `url` Returns the URL associated with the project.
     * *
     * `insight` EXPERIMENTAL. Returns the insight details of total issue count and last issue update time for the project.
     */
    @Nullable 
    private String expand;

    /**
     * EXPERIMENTAL. Filter results by project status:
     *  *
     * `live` Search live projects.
     * *
     * `archived` Search archived projects.
     * *
     * `deleted` Search deleted projects, those in the recycle bin.
     */
    @Nullable 
    private List<String> status;

    /**
     * EXPERIMENTAL. A list of project properties to return for the project. This parameter accepts a comma-separated list.
     */
    @Nullable 
    private List<Object> properties;

    /**
     * EXPERIMENTAL. A query string used to search properties. The query string cannot be specified using a JSON object. For example, to search for the value of `nested` from `{"something":{"nested":1,"other":2}}` use `[thepropertykey].something.nested=1`. Note that the propertyQuery key is enclosed in square brackets to enable searching where the propertyQuery key includes dot (.) or equals (=) characters. Note that `thepropertykey` is only returned when included in `properties`.
     */
    @Nullable 
    private String propertyQuery;

    /**
     * Constructs a validated implementation of {@link SearchProjectsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SearchProjectsOperationSpec(Consumer<SearchProjectsOperationSpec> spec) {
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
    }

}
