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
 * UpdateCustomFieldDetails
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
    "searcherKey"
})
@JsonTypeName("UpdateCustomFieldDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateCustomFieldDetails {

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
     * The searcher that defines the way the field is searched in Jira. It can be set to {@code null}, otherwise you must specify the valid searcher for the field type, as listed below (abbreviated values shown):
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
     */
    @JsonProperty("searcherKey")
    protected SearcherKeyEnum searcherKey;

    /**
     * Constructs a validated instance of {@link UpdateCustomFieldDetails}.
     *
     * @param spec the specification to process
     */
    public UpdateCustomFieldDetails(Consumer<UpdateCustomFieldDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateCustomFieldDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateCustomFieldDetails(Consumer)} instead.
     * @param description The description of the custom field. The maximum length is 40000 characters.
     * @param name The name of the custom field. It doesn't have to be unique. The maximum length is 255 characters.
     * @param searcherKey The searcher that defines the way the field is searched in Jira. It can be set to {@code null}, otherwise you must specify the valid searcher for the field type, as listed below (abbreviated values shown):   *  {@code cascadingselect}: {@code cascadingselectsearcher}  *  {@code datepicker}: {@code daterange}  *  {@code datetime}: {@code datetimerange}  *  {@code float}: {@code exactnumber} or {@code numberrange}  *  {@code grouppicker}: {@code grouppickersearcher}  *  {@code importid}: {@code exactnumber} or {@code numberrange}  *  {@code labels}: {@code labelsearcher}  *  {@code multicheckboxes}: {@code multiselectsearcher}  *  {@code multigrouppicker}: {@code multiselectsearcher}  *  {@code multiselect}: {@code multiselectsearcher}  *  {@code multiuserpicker}: {@code userpickergroupsearcher}  *  {@code multiversion}: {@code versionsearcher}  *  {@code project}: {@code projectsearcher}  *  {@code radiobuttons}: {@code multiselectsearcher}  *  {@code readonlyfield}: {@code textsearcher}  *  {@code select}: {@code multiselectsearcher}  *  {@code textarea}: {@code textsearcher}  *  {@code textfield}: {@code textsearcher}  *  {@code url}: {@code exacttextsearcher}  *  {@code userpicker}: {@code userpickergroupsearcher}  *  {@code version}: {@code versionsearcher}
     */
    @ApiStatus.Internal
    public UpdateCustomFieldDetails(String description, String name, SearcherKeyEnum searcherKey) {
        this.description = description;
        this.name = name;
        this.searcherKey = searcherKey;
    }

    /**
     * The searcher that defines the way the field is searched in Jira. It can be set to {@code null}, otherwise you must specify the valid searcher for the field type, as listed below (abbreviated values shown):
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
