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
 * ProjectDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "avatarUrls",
    "id",
    "key",
    "name",
    "projectCategory",
    "projectTypeKey",
    "self",
    "simplified"
})
@JsonTypeName("ProjectDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectDetails {

    /**
     * Constructs a validated implementation of {@link ProjectDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ProjectDetails(Consumer<ProjectDetails> spec) {
        spec.accept(this);
    }

    @JsonProperty("avatarUrls")
    protected ProjectAvatarUrls avatarUrls;

    /**
     * The ID of the project.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The key of the project.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * The name of the project.
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("projectCategory")
    protected ProjectDetailsProjectCategory projectCategory;

    /**
     * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.
     */
    @JsonProperty("projectTypeKey")
    protected ProjectTypeKeyEnum projectTypeKey;

    /**
     * The URL of the project details.
     */
    @JsonProperty("self")
    protected String self;

    /**
     * Whether or not the project is simplified.
     */
    @JsonProperty("simplified")
    protected Boolean simplified;


    /**
     * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.
     */
    @AllArgsConstructor
    public enum ProjectTypeKeyEnum {
        SOFTWARE("software"),
        SERVICE_DESK("service_desk"),
        BUSINESS("business");

        private final String value;
    }

}
