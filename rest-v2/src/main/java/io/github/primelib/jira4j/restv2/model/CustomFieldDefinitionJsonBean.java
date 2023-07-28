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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CustomFieldDefinitionJsonBean
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
    "description",
    "name",
    "searcherKey",
    "type"
})
@JsonTypeName("CustomFieldDefinitionJsonBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldDefinitionJsonBean {

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
     * {@code cascadingselect}: {@code cascadingselectsearcher}
     * *
     * {@code datepicker}: {@code daterange}
     * *
     * {@code datetime}: {@code datetimerange}
     * *
     * {@code float}: {@code exactnumber} or {@code numberrange}
     * *
     * {@code grouppicker}: {@code grouppickersearcher}
     * *
     * {@code importid}: {@code exactnumber} or {@code numberrange}
     * *
     * {@code labels}: {@code labelsearcher}
     * *
     * {@code multicheckboxes}: {@code multiselectsearcher}
     * *
     * {@code multigrouppicker}: {@code multiselectsearcher}
     * *
     * {@code multiselect}: {@code multiselectsearcher}
     * *
     * {@code multiuserpicker}: {@code userpickergroupsearcher}
     * *
     * {@code multiversion}: {@code versionsearcher}
     * *
     * {@code project}: {@code projectsearcher}
     * *
     * {@code radiobuttons}: {@code multiselectsearcher}
     * *
     * {@code readonlyfield}: {@code textsearcher}
     * *
     * {@code select}: {@code multiselectsearcher}
     * *
     * {@code textarea}: {@code textsearcher}
     * *
     * {@code textfield}: {@code textsearcher}
     * *
     * {@code url}: {@code exacttextsearcher}
     * *
     * {@code userpicker}: {@code userpickergroupsearcher}
     * *
     * {@code version}: {@code versionsearcher}
     * If no searcher is provided, the field isn't searchable. However, [Forge custom fields](https://developer.atlassian.com/platform/forge/manifest-reference/modules/#jira-custom-field-type--beta-) have a searcher set automatically, so are always searchable.
     */
    @JsonProperty("searcherKey")
    protected SearcherKeyEnum searcherKey;

    /**
     * The type of the custom field. These built-in custom field types are available:
     *  *
     * {@code cascadingselect}: Enables values to be selected from two levels of select lists (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:cascadingselect})
     * *
     * {@code datepicker}: Stores a date using a picker control (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:datepicker})
     * *
     * {@code datetime}: Stores a date with a time component (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:datetime})
     * *
     * {@code float}: Stores and validates a numeric (floating point) input (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:float})
     * *
     * {@code grouppicker}: Stores a user group using a picker control (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:grouppicker})
     * *
     * {@code importid}: A read-only field that stores the ID the issue had in the system it was imported from (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:importid})
     * *
     * {@code labels}: Stores labels (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:labels})
     * *
     * {@code multicheckboxes}: Stores multiple values using checkboxes (value: {@code })
     * *
     * {@code multigrouppicker}: Stores multiple user groups using a picker control (value: {@code })
     * *
     * {@code multiselect}: Stores multiple values using a select list (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:multicheckboxes})
     * *
     * {@code multiuserpicker}: Stores multiple users using a picker control (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:multigrouppicker})
     * *
     * {@code multiversion}: Stores multiple versions from the versions available in a project using a picker control (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:multiversion})
     * *
     * {@code project}: Stores a project from a list of projects that the user is permitted to view (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:project})
     * *
     * {@code radiobuttons}: Stores a value using radio buttons (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:radiobuttons})
     * *
     * {@code readonlyfield}: Stores a read-only text value, which can only be populated via the API (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:readonlyfield})
     * *
     * {@code select}: Stores a value from a configurable list of options (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:select})
     * *
     * {@code textarea}: Stores a long text string using a multiline text area (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:textarea})
     * *
     * {@code textfield}: Stores a text string using a single-line text box (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:textfield})
     * *
     * {@code url}: Stores a URL (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:url})
     * *
     * {@code userpicker}: Stores a user using a picker control (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:userpicker})
     * *
     * {@code version}: Stores a version using a picker control (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:version})
     * To create a field based on a [Forge custom field type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/#jira-custom-field-type--beta-), use the ID of the Forge custom field type as the value. For example, {@code ari:cloud:ecosystem::extension/e62f20a2-4b61-4dbe-bfb9-9a88b5e3ac84/548c5df1-24aa-4f7c-bbbb-3038d947cb05/static/my-cf-type-key}.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link CustomFieldDefinitionJsonBean}.
     *
     * @param spec the specification to process
     */
    public CustomFieldDefinitionJsonBean(Consumer<CustomFieldDefinitionJsonBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldDefinitionJsonBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldDefinitionJsonBean(Consumer)} instead.
     * @param description The description of the custom field, which is displayed in Jira.
     * @param name The name of the custom field, which is displayed in Jira. This is not the unique identifier.
     * @param searcherKey The searcher defines the way the field is searched in Jira. For example, *com.atlassian.jira.plugin.system.customfieldtypes:grouppickersearcher*.   The search UI (basic search and JQL search) will display different operations and values for the field, based on the field searcher. You must specify a searcher that is valid for the field type, as listed below (abbreviated values shown):   *  {@code cascadingselect}: {@code cascadingselectsearcher}  *  {@code datepicker}: {@code daterange}  *  {@code datetime}: {@code datetimerange}  *  {@code float}: {@code exactnumber} or {@code numberrange}  *  {@code grouppicker}: {@code grouppickersearcher}  *  {@code importid}: {@code exactnumber} or {@code numberrange}  *  {@code labels}: {@code labelsearcher}  *  {@code multicheckboxes}: {@code multiselectsearcher}  *  {@code multigrouppicker}: {@code multiselectsearcher}  *  {@code multiselect}: {@code multiselectsearcher}  *  {@code multiuserpicker}: {@code userpickergroupsearcher}  *  {@code multiversion}: {@code versionsearcher}  *  {@code project}: {@code projectsearcher}  *  {@code radiobuttons}: {@code multiselectsearcher}  *  {@code readonlyfield}: {@code textsearcher}  *  {@code select}: {@code multiselectsearcher}  *  {@code textarea}: {@code textsearcher}  *  {@code textfield}: {@code textsearcher}  *  {@code url}: {@code exacttextsearcher}  *  {@code userpicker}: {@code userpickergroupsearcher}  *  {@code version}: {@code versionsearcher}  If no searcher is provided, the field isn't searchable. However, [Forge custom fields](https://developer.atlassian.com/platform/forge/manifest-reference/modules/#jira-custom-field-type--beta-) have a searcher set automatically, so are always searchable.
     * @param type The type of the custom field. These built-in custom field types are available:   *  {@code cascadingselect}: Enables values to be selected from two levels of select lists (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:cascadingselect})  *  {@code datepicker}: Stores a date using a picker control (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:datepicker})  *  {@code datetime}: Stores a date with a time component (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:datetime})  *  {@code float}: Stores and validates a numeric (floating point) input (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:float})  *  {@code grouppicker}: Stores a user group using a picker control (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:grouppicker})  *  {@code importid}: A read-only field that stores the ID the issue had in the system it was imported from (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:importid})  *  {@code labels}: Stores labels (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:labels})  *  {@code multicheckboxes}: Stores multiple values using checkboxes (value: {@code })  *  {@code multigrouppicker}: Stores multiple user groups using a picker control (value: {@code })  *  {@code multiselect}: Stores multiple values using a select list (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:multicheckboxes})  *  {@code multiuserpicker}: Stores multiple users using a picker control (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:multigrouppicker})  *  {@code multiversion}: Stores multiple versions from the versions available in a project using a picker control (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:multiversion})  *  {@code project}: Stores a project from a list of projects that the user is permitted to view (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:project})  *  {@code radiobuttons}: Stores a value using radio buttons (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:radiobuttons})  *  {@code readonlyfield}: Stores a read-only text value, which can only be populated via the API (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:readonlyfield})  *  {@code select}: Stores a value from a configurable list of options (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:select})  *  {@code textarea}: Stores a long text string using a multiline text area (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:textarea})  *  {@code textfield}: Stores a text string using a single-line text box (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:textfield})  *  {@code url}: Stores a URL (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:url})  *  {@code userpicker}: Stores a user using a picker control (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:userpicker})  *  {@code version}: Stores a version using a picker control (value: {@code com.atlassian.jira.plugin.system.customfieldtypes:version})  To create a field based on a [Forge custom field type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/#jira-custom-field-type--beta-), use the ID of the Forge custom field type as the value. For example, {@code ari:cloud:ecosystem::extension/e62f20a2-4b61-4dbe-bfb9-9a88b5e3ac84/548c5df1-24aa-4f7c-bbbb-3038d947cb05/static/my-cf-type-key}.
     */
    @ApiStatus.Internal
    public CustomFieldDefinitionJsonBean(String description, String name, SearcherKeyEnum searcherKey, String type) {
        this.description = description;
        this.name = name;
        this.searcherKey = searcherKey;
        this.type = type;
    }

    /**
     * The searcher defines the way the field is searched in Jira. For example, *com.atlassian.jira.plugin.system.customfieldtypes:grouppickersearcher*.
     *  The search UI (basic search and JQL search) will display different operations and values for the field, based on the field searcher. You must specify a searcher that is valid for the field type, as listed below (abbreviated values shown):
     *  *
     * {@code cascadingselect}: {@code cascadingselectsearcher}
     * *
     * {@code datepicker}: {@code daterange}
     * *
     * {@code datetime}: {@code datetimerange}
     * *
     * {@code float}: {@code exactnumber} or {@code numberrange}
     * *
     * {@code grouppicker}: {@code grouppickersearcher}
     * *
     * {@code importid}: {@code exactnumber} or {@code numberrange}
     * *
     * {@code labels}: {@code labelsearcher}
     * *
     * {@code multicheckboxes}: {@code multiselectsearcher}
     * *
     * {@code multigrouppicker}: {@code multiselectsearcher}
     * *
     * {@code multiselect}: {@code multiselectsearcher}
     * *
     * {@code multiuserpicker}: {@code userpickergroupsearcher}
     * *
     * {@code multiversion}: {@code versionsearcher}
     * *
     * {@code project}: {@code projectsearcher}
     * *
     * {@code radiobuttons}: {@code multiselectsearcher}
     * *
     * {@code readonlyfield}: {@code textsearcher}
     * *
     * {@code select}: {@code multiselectsearcher}
     * *
     * {@code textarea}: {@code textsearcher}
     * *
     * {@code textfield}: {@code textsearcher}
     * *
     * {@code url}: {@code exacttextsearcher}
     * *
     * {@code userpicker}: {@code userpickergroupsearcher}
     * *
     * {@code version}: {@code versionsearcher}
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

        private static final SearcherKeyEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static SearcherKeyEnum of(String input) {
            if (input != null) {
                for (SearcherKeyEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
