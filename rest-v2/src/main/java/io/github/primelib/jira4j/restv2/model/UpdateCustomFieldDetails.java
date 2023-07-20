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
 * UpdateCustomFieldDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "name",
    "searcherKey"
})
@JsonTypeName("UpdateCustomFieldDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateCustomFieldDetails {

    /**
     * Constructs a validated implementation of {@link UpdateCustomFieldDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateCustomFieldDetails(Consumer<UpdateCustomFieldDetails> spec) {
        spec.accept(this);
    }

    /**
     * The description of the custom field. The maximum length is 40000 characters.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The name of the custom field. It doesn't have to be unique. The maximum length is 255 characters.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The searcher that defines the way the field is searched in Jira. It can be set to `null`, otherwise you must specify the valid searcher for the field type, as listed below (abbreviated values shown):
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
     */
    @JsonProperty("searcherKey")
    protected SearcherKeyEnum searcherKey;


    /**
     * The searcher that defines the way the field is searched in Jira. It can be set to `null`, otherwise you must specify the valid searcher for the field type, as listed below (abbreviated values shown):
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
