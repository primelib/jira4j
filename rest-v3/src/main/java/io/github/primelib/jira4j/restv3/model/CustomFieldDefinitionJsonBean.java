package io.github.primelib.jira4j.restv3.model;

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
 * CustomFieldDefinitionJsonBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "name",
    "searcherKey",
    "type"
})
@JsonTypeName("CustomFieldDefinitionJsonBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldDefinitionJsonBean {

    /**
     * Constructs a validated implementation of {@link CustomFieldDefinitionJsonBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomFieldDefinitionJsonBean(Consumer<CustomFieldDefinitionJsonBean> spec) {
        spec.accept(this);
    }

    /**
     * The description of the custom field, which is displayed in Jira.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The name of the custom field, which is displayed in Jira. This is not the unique identifier.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The searcher defines the way the field is searched in Jira. For example, *com.atlassian.jira.plugin.system.customfieldtypes:grouppickersearcher*.
     *  The search UI (basic search and JQL search) will display different operations and values for the field, based on the field searcher. You must specify a searcher that is valid for the field type, as listed below (abbreviated values shown):
     *  *
     * `cascadingselect`: `cascadingselectsearcher`
     * *
     * `datepicker`: `daterange`
     * *
     * `datetime`: `datetimerange`
     * *
     * `float`: `exactnumber` or `numberrange`
     * *
     * `grouppicker`: `grouppickersearcher`
     * *
     * `importid`: `exactnumber` or `numberrange`
     * *
     * `labels`: `labelsearcher`
     * *
     * `multicheckboxes`: `multiselectsearcher`
     * *
     * `multigrouppicker`: `multiselectsearcher`
     * *
     * `multiselect`: `multiselectsearcher`
     * *
     * `multiuserpicker`: `userpickergroupsearcher`
     * *
     * `multiversion`: `versionsearcher`
     * *
     * `project`: `projectsearcher`
     * *
     * `radiobuttons`: `multiselectsearcher`
     * *
     * `readonlyfield`: `textsearcher`
     * *
     * `select`: `multiselectsearcher`
     * *
     * `textarea`: `textsearcher`
     * *
     * `textfield`: `textsearcher`
     * *
     * `url`: `exacttextsearcher`
     * *
     * `userpicker`: `userpickergroupsearcher`
     * *
     * `version`: `versionsearcher`
     * If no searcher is provided, the field isn't searchable. However, [Forge custom fields](https://developer.atlassian.com/platform/forge/manifest-reference/modules/#jira-custom-field-type--beta-) have a searcher set automatically, so are always searchable.
     */
    @JsonProperty("searcherKey")
    protected SearcherKeyEnum searcherKey;

    /**
     * The type of the custom field. These built-in custom field types are available:
     *  *
     * `cascadingselect`: Enables values to be selected from two levels of select lists (value: `com.atlassian.jira.plugin.system.customfieldtypes:cascadingselect`)
     * *
     * `datepicker`: Stores a date using a picker control (value: `com.atlassian.jira.plugin.system.customfieldtypes:datepicker`)
     * *
     * `datetime`: Stores a date with a time component (value: `com.atlassian.jira.plugin.system.customfieldtypes:datetime`)
     * *
     * `float`: Stores and validates a numeric (floating point) input (value: `com.atlassian.jira.plugin.system.customfieldtypes:float`)
     * *
     * `grouppicker`: Stores a user group using a picker control (value: `com.atlassian.jira.plugin.system.customfieldtypes:grouppicker`)
     * *
     * `importid`: A read-only field that stores the ID the issue had in the system it was imported from (value: `com.atlassian.jira.plugin.system.customfieldtypes:importid`)
     * *
     * `labels`: Stores labels (value: `com.atlassian.jira.plugin.system.customfieldtypes:labels`)
     * *
     * `multicheckboxes`: Stores multiple values using checkboxes (value: ``)
     * *
     * `multigrouppicker`: Stores multiple user groups using a picker control (value: ``)
     * *
     * `multiselect`: Stores multiple values using a select list (value: `com.atlassian.jira.plugin.system.customfieldtypes:multicheckboxes`)
     * *
     * `multiuserpicker`: Stores multiple users using a picker control (value: `com.atlassian.jira.plugin.system.customfieldtypes:multigrouppicker`)
     * *
     * `multiversion`: Stores multiple versions from the versions available in a project using a picker control (value: `com.atlassian.jira.plugin.system.customfieldtypes:multiversion`)
     * *
     * `project`: Stores a project from a list of projects that the user is permitted to view (value: `com.atlassian.jira.plugin.system.customfieldtypes:project`)
     * *
     * `radiobuttons`: Stores a value using radio buttons (value: `com.atlassian.jira.plugin.system.customfieldtypes:radiobuttons`)
     * *
     * `readonlyfield`: Stores a read-only text value, which can only be populated via the API (value: `com.atlassian.jira.plugin.system.customfieldtypes:readonlyfield`)
     * *
     * `select`: Stores a value from a configurable list of options (value: `com.atlassian.jira.plugin.system.customfieldtypes:select`)
     * *
     * `textarea`: Stores a long text string using a multiline text area (value: `com.atlassian.jira.plugin.system.customfieldtypes:textarea`)
     * *
     * `textfield`: Stores a text string using a single-line text box (value: `com.atlassian.jira.plugin.system.customfieldtypes:textfield`)
     * *
     * `url`: Stores a URL (value: `com.atlassian.jira.plugin.system.customfieldtypes:url`)
     * *
     * `userpicker`: Stores a user using a picker control (value: `com.atlassian.jira.plugin.system.customfieldtypes:userpicker`)
     * *
     * `version`: Stores a version using a picker control (value: `com.atlassian.jira.plugin.system.customfieldtypes:version`)
     * To create a field based on a [Forge custom field type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/#jira-custom-field-type--beta-), use the ID of the Forge custom field type as the value. For example, `ari:cloud:ecosystem::extension/e62f20a2-4b61-4dbe-bfb9-9a88b5e3ac84/548c5df1-24aa-4f7c-bbbb-3038d947cb05/static/my-cf-type-key`.
     */
    @JsonProperty("type")
    protected String type;


    /**
     * The searcher defines the way the field is searched in Jira. For example, *com.atlassian.jira.plugin.system.customfieldtypes:grouppickersearcher*.
     *  The search UI (basic search and JQL search) will display different operations and values for the field, based on the field searcher. You must specify a searcher that is valid for the field type, as listed below (abbreviated values shown):
     *  *
     * `cascadingselect`: `cascadingselectsearcher`
     * *
     * `datepicker`: `daterange`
     * *
     * `datetime`: `datetimerange`
     * *
     * `float`: `exactnumber` or `numberrange`
     * *
     * `grouppicker`: `grouppickersearcher`
     * *
     * `importid`: `exactnumber` or `numberrange`
     * *
     * `labels`: `labelsearcher`
     * *
     * `multicheckboxes`: `multiselectsearcher`
     * *
     * `multigrouppicker`: `multiselectsearcher`
     * *
     * `multiselect`: `multiselectsearcher`
     * *
     * `multiuserpicker`: `userpickergroupsearcher`
     * *
     * `multiversion`: `versionsearcher`
     * *
     * `project`: `projectsearcher`
     * *
     * `radiobuttons`: `multiselectsearcher`
     * *
     * `readonlyfield`: `textsearcher`
     * *
     * `select`: `multiselectsearcher`
     * *
     * `textarea`: `textsearcher`
     * *
     * `textfield`: `textsearcher`
     * *
     * `url`: `exacttextsearcher`
     * *
     * `userpicker`: `userpickergroupsearcher`
     * *
     * `version`: `versionsearcher`
     * If no searcher is provided, the field isn't searchable. However, [Forge custom fields](https://developer.atlassian.com/platform/forge/manifest-reference/modules/#jira-custom-field-type--beta-) have a searcher set automatically, so are always searchable.
     */
    @AllArgsConstructor
    public enum SearcherKeyEnum {
        CASCADINGSELECTSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:cascadingselectsearcher"),
        DATERANGE("com.atlassian.jira.plugin.system.customfieldtypes:daterange"),
        DATETIMERANGE("com.atlassian.jira.plugin.system.customfieldtypes:datetimerange"),
        EXACTNUMBER("com.atlassian.jira.plugin.system.customfieldtypes:exactnumber"),
        EXACTTEXTSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:exacttextsearcher"),
        GROUPPICKERSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:grouppickersearcher"),
        LABELSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:labelsearcher"),
        MULTISELECTSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:multiselectsearcher"),
        NUMBERRANGE("com.atlassian.jira.plugin.system.customfieldtypes:numberrange"),
        PROJECTSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:projectsearcher"),
        TEXTSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:textsearcher"),
        USERPICKERGROUPSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:userpickergroupsearcher"),
        VERSIONSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:versionsearcher");

        private final String value;
    }

}
