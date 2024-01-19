package io.github.primelib.jira4j.restv2.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Filter;
import io.github.primelib.jira4j.restv2.model.Project;
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
 * SearchProjectsSpec
 * <p>
 * Specification for the SearchProjects operation.
 * <p>
 * Get projects paginated
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
    private Long startAt;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults;

    /**
     * [Order](#ordering) the results by a field.
     *  *
     * {@code category} Sorts by project category. A complete list of category IDs is found using [Get all project categories](#api-rest-api-2-projectCategory-get).
     * *
     * {@code issueCount} Sorts by the total number of issues in each project.
     * *
     * {@code key} Sorts by project key.
     * *
     * {@code lastIssueUpdatedTime} Sorts by the last issue update time.
     * *
     * {@code name} Sorts by project name.
     * *
     * {@code owner} Sorts by project lead.
     * *
     * {@code archivedDate} EXPERIMENTAL. Sorts by project archived date.
     * *
     * {@code deletedDate} EXPERIMENTAL. Sorts by project deleted date.
     */
    @Nullable 
    private String orderBy;

    /**
     * The project IDs to filter the results by. To include multiple IDs, provide an ampersand-separated list. For example, {@code id=10000&amp;id=10001}. Up to 50 project IDs can be provided.
     */
    @Nullable 
    private Set<Long> id;

    /**
     * The project keys to filter the results by. To include multiple keys, provide an ampersand-separated list. For example, {@code keys=PA&amp;keys=PB}. Up to 50 project keys can be provided.
     */
    @Nullable 
    private Set<String> keys;

    /**
     * Filter the results using a literal string. Projects with a matching {@code key} or {@code name} are returned (case insensitive).
     */
    @Nullable 
    private String query;

    /**
     * Orders results by the [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes). This parameter accepts a comma-separated list. Valid values are {@code business}, {@code service_desk}, and {@code software}.
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
     * {@code view} the project, meaning that they have one of the following permissions:
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
     * {@code browse} the project, meaning that they have the *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * *
     * {@code edit} the project, meaning that they have one of the following permissions:
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
     * *
     * {@code create} the project, meaning that they have the *Create issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project in which the issue is created.
     */
    @Nullable 
    private String action;

    /**
     * Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expanded options include:
     *  *
     * {@code description} Returns the project description.
     * *
     * {@code projectKeys} Returns all project keys associated with a project.
     * *
     * {@code lead} Returns information about the project lead.
     * *
     * {@code issueTypes} Returns all issue types associated with the project.
     * *
     * {@code url} Returns the URL associated with the project.
     * *
     * {@code insight} EXPERIMENTAL. Returns the insight details of total issue count and last issue update time for the project.
     */
    @Nullable 
    private String expand;

    /**
     * EXPERIMENTAL. Filter results by project status:
     *  *
     * {@code live} Search live projects.
     * *
     * {@code archived} Search archived projects.
     * *
     * {@code deleted} Search deleted projects, those in the recycle bin.
     */
    @Nullable 
    private List<String> status;

    /**
     * EXPERIMENTAL. A list of project properties to return for the project. This parameter accepts a comma-separated list.
     */
    @Nullable 
    private List<Object> properties;

    /**
     * EXPERIMENTAL. A query string used to search properties. The query string cannot be specified using a JSON object. For example, to search for the value of {@code nested} from {@code {"something":{"nested":1,"other":2}}} use {@code [thepropertykey].something.nested=1}. Note that the propertyQuery key is enclosed in square brackets to enable searching where the propertyQuery key includes dot (.) or equals (=) characters. Note that {@code thepropertykey} is only returned when included in {@code properties}.
     */
    @Nullable 
    private String propertyQuery;

    /**
     * Constructs a validated instance of {@link SearchProjectsOperationSpec}.
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
     * Constructs a validated instance of {@link SearchProjectsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param startAt              The index of the first item to return in a page of results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     * @param orderBy              [Order](#ordering) the results by a field.   *  {@code category} Sorts by project category. A complete list of category IDs is found using [Get all project categories](#api-rest-api-2-projectCategory-get).  *  {@code issueCount} Sorts by the total number of issues in each project.  *  {@code key} Sorts by project key.  *  {@code lastIssueUpdatedTime} Sorts by the last issue update time.  *  {@code name} Sorts by project name.  *  {@code owner} Sorts by project lead.  *  {@code archivedDate} EXPERIMENTAL. Sorts by project archived date.  *  {@code deletedDate} EXPERIMENTAL. Sorts by project deleted date.
     * @param id                   The project IDs to filter the results by. To include multiple IDs, provide an ampersand-separated list. For example, {@code id=10000&amp;id=10001}. Up to 50 project IDs can be provided.
     * @param keys                 The project keys to filter the results by. To include multiple keys, provide an ampersand-separated list. For example, {@code keys=PA&amp;keys=PB}. Up to 50 project keys can be provided.
     * @param query                Filter the results using a literal string. Projects with a matching {@code key} or {@code name} are returned (case insensitive).
     * @param typeKey              Orders results by the [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes). This parameter accepts a comma-separated list. Valid values are {@code business}, {@code service_desk}, and {@code software}.
     * @param categoryId           The ID of the project's category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-2-projectCategory-get) operation.
     * @param action               Filter results by projects for which the user can:   *  {@code view} the project, meaning that they have one of the following permissions:           *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.      *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.      *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  {@code browse} the project, meaning that they have the *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  {@code edit} the project, meaning that they have one of the following permissions:           *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.      *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  {@code create} the project, meaning that they have the *Create issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project in which the issue is created.
     * @param expand               Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expanded options include:   *  {@code description} Returns the project description.  *  {@code projectKeys} Returns all project keys associated with a project.  *  {@code lead} Returns information about the project lead.  *  {@code issueTypes} Returns all issue types associated with the project.  *  {@code url} Returns the URL associated with the project.  *  {@code insight} EXPERIMENTAL. Returns the insight details of total issue count and last issue update time for the project.
     * @param status               EXPERIMENTAL. Filter results by project status:   *  {@code live} Search live projects.  *  {@code archived} Search archived projects.  *  {@code deleted} Search deleted projects, those in the recycle bin.
     * @param properties           EXPERIMENTAL. A list of project properties to return for the project. This parameter accepts a comma-separated list.
     * @param propertyQuery        EXPERIMENTAL. A query string used to search properties. The query string cannot be specified using a JSON object. For example, to search for the value of {@code nested} from {@code {"something":{"nested":1,"other":2}}} use {@code [thepropertykey].something.nested=1}. Note that the propertyQuery key is enclosed in square brackets to enable searching where the propertyQuery key includes dot (.) or equals (=) characters. Note that {@code thepropertykey} is only returned when included in {@code properties}.
     */
    @ApiStatus.Internal
    public SearchProjectsOperationSpec(Long startAt, Integer maxResults, String orderBy, Set<Long> id, Set<String> keys, String query, String typeKey, Long categoryId, String action, String expand, List<String> status, List<Object> properties, String propertyQuery) {
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.orderBy = orderBy;
        this.id = id;
        this.keys = keys;
        this.query = query;
        this.typeKey = typeKey;
        this.categoryId = categoryId;
        this.action = action;
        this.expand = expand;
        this.status = status;
        this.properties = properties;
        this.propertyQuery = propertyQuery;

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
