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
 * IssueTypeCreateBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "hierarchyLevel",
    "name",
    "type"
})
@JsonTypeName("IssueTypeCreateBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeCreateBean {

    /**
     * Constructs a validated implementation of {@link IssueTypeCreateBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueTypeCreateBean(Consumer<IssueTypeCreateBean> spec) {
        spec.accept(this);
    }

    /**
     * The description of the issue type.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The hierarchy level of the issue type. Use:
     *  *
     * `-1` for Subtask.
     * *
     * `0` for Base.
     * Defaults to `0`.
     */
    @JsonProperty("hierarchyLevel")
    protected Integer hierarchyLevel;

    /**
     * The unique name for the issue type. The maximum length is 60 characters.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Deprecated. Use `hierarchyLevel` instead. See the [deprecation notice](https://community.developer.atlassian.com/t/deprecation-of-the-epic-link-parent-link-and-other-related-fields-in-rest-apis-and-webhooks/54048) for details.
     * Whether the issue type is `subtype` or `standard`. Defaults to `standard`.
     */
    @JsonProperty("type")
    protected TypeEnum type;


    /**
     * Deprecated. Use `hierarchyLevel` instead. See the [deprecation notice](https://community.developer.atlassian.com/t/deprecation-of-the-epic-link-parent-link-and-other-related-fields-in-rest-apis-and-webhooks/54048) for details.
     * Whether the issue type is `subtype` or `standard`. Defaults to `standard`.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        SUBTASK("subtask"),
        STANDARD("standard");

        private final String value;
    }

}
