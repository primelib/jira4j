package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomFieldContextDefaultValue
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "cascadingOptionId",
    "contextId",
    "optionId",
    "type",
    "optionIds",
    "accountId",
    "userFilter",
    "accountIds",
    "groupId",
    "groupIds",
    "date",
    "useCurrent",
    "dateTime",
    "url",
    "projectId",
    "number",
    "labels",
    "text",
    "versionId",
    "versionOrder",
    "versionIds",
    "values",
    "object"
})
@JsonTypeName("CustomFieldContextDefaultValue")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValue {

    /**
     * Constructs a validated implementation of {@link CustomFieldContextDefaultValue}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValue(Consumer<CustomFieldContextDefaultValue> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the default cascading option.
     */
    @JsonProperty("cascadingOptionId")
    protected String cascadingOptionId;

    /**
     * The ID of the context.
     */
    @JsonProperty("contextId")
    protected String contextId;

    /**
     * The ID of the default option.
     */
    @JsonProperty("optionId")
    protected String optionId;

    @JsonProperty("type")
    protected String type;

    /**
     * The list of IDs of the default options.
     */
    @JsonProperty("optionIds")
    protected List<String> optionIds = new ArrayList<>();

    /**
     * The ID of the default user.
     */
    @JsonProperty("accountId")
    protected String accountId;

    @JsonProperty("userFilter")
    protected UserFilter userFilter;

    /**
     * The IDs of the default users.
     */
    @JsonProperty("accountIds")
    protected List<String> accountIds = new ArrayList<>();

    /**
     * The ID of the the default group.
     */
    @JsonProperty("groupId")
    protected String groupId;

    /**
     * The IDs of the default groups.
     */
    @JsonProperty("groupIds")
    protected Set<String> groupIds = new LinkedHashSet<>();

    /**
     * The default date in ISO format. Ignored if `useCurrent` is true.
     */
    @JsonProperty("date")
    protected String date;

    /**
     * Whether to use the current date.
     */
    @JsonProperty("useCurrent")
    protected Boolean useCurrent = false;

    /**
     * The default date-time in ISO format. Ignored if `useCurrent` is true.
     */
    @JsonProperty("dateTime")
    protected String dateTime;

    /**
     * The default URL.
     */
    @JsonProperty("url")
    protected String url;

    /**
     * The ID of the default project.
     */
    @JsonProperty("projectId")
    protected String projectId;

    /**
     * The default floating-point number.
     */
    @JsonProperty("number")
    protected Double number;

    /**
     * The default labels value.
     */
    @JsonProperty("labels")
    protected List<String> labels = new ArrayList<>();

    /**
     * The default text. The maximum length is 254 characters.
     */
    @JsonProperty("text")
    protected String text;

    /**
     * The ID of the default version.
     */
    @JsonProperty("versionId")
    protected String versionId;

    /**
     * The order the pickable versions are displayed in. If not provided, the released-first order is used. Available version orders are `"releasedFirst"` and `"unreleasedFirst"`.
     */
    @JsonProperty("versionOrder")
    protected String versionOrder;

    /**
     * The IDs of the default versions.
     */
    @JsonProperty("versionIds")
    protected Set<String> versionIds = new LinkedHashSet<>();

    /**
     * List of string values. The maximum length for a value is 254 characters.
     */
    @JsonProperty("values")
    protected List<String> values;

    /**
     * The default JSON object.
     */
    @JsonProperty("object")
    protected Object _object;


}
