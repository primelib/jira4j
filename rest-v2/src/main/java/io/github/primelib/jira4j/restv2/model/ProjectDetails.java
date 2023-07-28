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
 * ProjectDetails
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
     * Constructs a validated instance of {@link ProjectDetails}.
     *
     * @param spec the specification to process
     */
    public ProjectDetails(Consumer<ProjectDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ProjectDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ProjectDetails(Consumer)} instead.
     * @param avatarUrls var.name
     * @param id The ID of the project.
     * @param key The key of the project.
     * @param name The name of the project.
     * @param projectCategory var.name
     * @param projectTypeKey The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.
     * @param self The URL of the project details.
     * @param simplified Whether or not the project is simplified.
     */
    @ApiStatus.Internal
    public ProjectDetails(ProjectAvatarUrls avatarUrls, String id, String key, String name, ProjectDetailsProjectCategory projectCategory, ProjectTypeKeyEnum projectTypeKey, String self, Boolean simplified) {
        this.avatarUrls = avatarUrls;
        this.id = id;
        this.key = key;
        this.name = name;
        this.projectCategory = projectCategory;
        this.projectTypeKey = projectTypeKey;
        this.self = self;
        this.simplified = simplified;
    }

    /**
     * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.
     */
    @AllArgsConstructor
    public enum ProjectTypeKeyEnum {
        SOFTWARE("software"),
        SERVICE_DESK("service_desk"),
        BUSINESS("business");

        private static final ProjectTypeKeyEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ProjectTypeKeyEnum of(String input) {
            if (input != null) {
                for (ProjectTypeKeyEnum v : VALUES) {
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
