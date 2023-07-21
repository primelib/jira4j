package io.github.primelib.jira4j.restv3.model;

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
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomFieldContextDefaultValue
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
    protected List<String> optionIds;

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
    protected List<String> accountIds;

    /**
     * The ID of the the default group.
     */
    @JsonProperty("groupId")
    protected String groupId;

    /**
     * The IDs of the default groups.
     */
    @JsonProperty("groupIds")
    protected Set<String> groupIds;

    /**
     * The default date in ISO format. Ignored if {@code useCurrent} is true.
     */
    @JsonProperty("date")
    protected String date;

    /**
     * Whether to use the current date.
     */
    @JsonProperty("useCurrent")
    protected Boolean useCurrent;

    /**
     * The default date-time in ISO format. Ignored if {@code useCurrent} is true.
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
    protected List<String> labels;

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
     * The order the pickable versions are displayed in. If not provided, the released-first order is used. Available version orders are {@code "releasedFirst"} and {@code "unreleasedFirst"}.
     */
    @JsonProperty("versionOrder")
    protected String versionOrder;

    /**
     * The IDs of the default versions.
     */
    @JsonProperty("versionIds")
    protected Set<String> versionIds;

    /**
     * List of string values. The maximum length for a value is 254 characters.
     */
    @JsonProperty("values")
    protected List<String> values;

    /**
     * The default JSON object.
     */
    @JsonProperty("object")
    protected Object object;

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValue}.
     *
     * @param spec the specification to process
     */
    public CustomFieldContextDefaultValue(Consumer<CustomFieldContextDefaultValue> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValue}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldContextDefaultValue(Consumer)} instead.
     * @param cascadingOptionId The ID of the default cascading option.
     * @param contextId The ID of the context.
     * @param optionId The ID of the default option.
     * @param type var.name
     * @param optionIds The list of IDs of the default options.
     * @param accountId The ID of the default user.
     * @param userFilter var.name
     * @param accountIds The IDs of the default users.
     * @param groupId The ID of the the default group.
     * @param groupIds The IDs of the default groups.
     * @param date The default date in ISO format. Ignored if {@code useCurrent} is true.
     * @param useCurrent Whether to use the current date.
     * @param dateTime The default date-time in ISO format. Ignored if {@code useCurrent} is true.
     * @param url The default URL.
     * @param projectId The ID of the default project.
     * @param number The default floating-point number.
     * @param labels The default labels value.
     * @param text The default text. The maximum length is 254 characters.
     * @param versionId The ID of the default version.
     * @param versionOrder The order the pickable versions are displayed in. If not provided, the released-first order is used. Available version orders are {@code "releasedFirst"} and {@code "unreleasedFirst"}.
     * @param versionIds The IDs of the default versions.
     * @param values List of string values. The maximum length for a value is 254 characters.
     * @param object The default JSON object.
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValue(String cascadingOptionId, String contextId, String optionId, String type, List<String> optionIds, String accountId, UserFilter userFilter, List<String> accountIds, String groupId, Set<String> groupIds, String date, Boolean useCurrent, String dateTime, String url, String projectId, Double number, List<String> labels, String text, String versionId, String versionOrder, Set<String> versionIds, List<String> values, Object object) {
        this.cascadingOptionId = cascadingOptionId;
        this.contextId = contextId;
        this.optionId = optionId;
        this.type = type;
        this.optionIds = optionIds;
        this.accountId = accountId;
        this.userFilter = userFilter;
        this.accountIds = accountIds;
        this.groupId = groupId;
        this.groupIds = groupIds;
        this.date = date;
        this.useCurrent = useCurrent;
        this.dateTime = dateTime;
        this.url = url;
        this.projectId = projectId;
        this.number = number;
        this.labels = labels;
        this.text = text;
        this.versionId = versionId;
        this.versionOrder = versionOrder;
        this.versionIds = versionIds;
        this.values = values;
        this.object = object;
    }

}
