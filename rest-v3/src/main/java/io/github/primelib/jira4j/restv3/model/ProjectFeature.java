package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProjectFeature
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "feature",
    "imageUri",
    "localisedDescription",
    "localisedName",
    "prerequisites",
    "projectId",
    "state",
    "toggleLocked"
})
@JsonTypeName("ProjectFeature")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectFeature {

    /**
     * Constructs a validated implementation of {@link ProjectFeature}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ProjectFeature(Consumer<ProjectFeature> spec) {
        spec.accept(this);
    }

    /**
     * The key of the feature.
     */
    @JsonProperty("feature")
    protected String feature;

    /**
     * URI for the image representing the feature.
     */
    @JsonProperty("imageUri")
    protected String imageUri;

    /**
     * Localized display description for the feature.
     */
    @JsonProperty("localisedDescription")
    protected String localisedDescription;

    /**
     * Localized display name for the feature.
     */
    @JsonProperty("localisedName")
    protected String localisedName;

    /**
     * List of keys of the features required to enable the feature.
     */
    @JsonProperty("prerequisites")
    protected List<String> prerequisites;

    /**
     * The ID of the project.
     */
    @JsonProperty("projectId")
    protected Long projectId;

    /**
     * The state of the feature. When updating the state of a feature, only ENABLED and DISABLED are supported. Responses can contain all values
     */
    @JsonProperty("state")
    protected StateEnum state;

    /**
     * Whether the state of the feature can be updated.
     */
    @JsonProperty("toggleLocked")
    protected Boolean toggleLocked;


    /**
     * The state of the feature. When updating the state of a feature, only ENABLED and DISABLED are supported. Responses can contain all values
     */
    @AllArgsConstructor
    public enum StateEnum {
        ENABLED("ENABLED"),
        DISABLED("DISABLED"),
        COMING_SOON("COMING_SOON");

        private final String value;
    }

}
