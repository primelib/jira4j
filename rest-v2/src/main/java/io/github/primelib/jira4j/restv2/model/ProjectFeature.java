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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ProjectFeature
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
     * Constructs a validated instance of {@link ProjectFeature}.
     *
     * @param spec the specification to process
     */
    public ProjectFeature(Consumer<ProjectFeature> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ProjectFeature}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ProjectFeature(Consumer)} instead.
     * @param feature The key of the feature.
     * @param imageUri URI for the image representing the feature.
     * @param localisedDescription Localized display description for the feature.
     * @param localisedName Localized display name for the feature.
     * @param prerequisites List of keys of the features required to enable the feature.
     * @param projectId The ID of the project.
     * @param state The state of the feature. When updating the state of a feature, only ENABLED and DISABLED are supported. Responses can contain all values
     * @param toggleLocked Whether the state of the feature can be updated.
     */
    @ApiStatus.Internal
    public ProjectFeature(String feature, String imageUri, String localisedDescription, String localisedName, List<String> prerequisites, Long projectId, StateEnum state, Boolean toggleLocked) {
        this.feature = feature;
        this.imageUri = imageUri;
        this.localisedDescription = localisedDescription;
        this.localisedName = localisedName;
        this.prerequisites = prerequisites;
        this.projectId = projectId;
        this.state = state;
        this.toggleLocked = toggleLocked;
    }

    /**
     * The state of the feature. When updating the state of a feature, only ENABLED and DISABLED are supported. Responses can contain all values
     */
    @AllArgsConstructor
    public enum StateEnum {
        ENABLED("ENABLED"),
        DISABLED("DISABLED"),
        COMING_SOON("COMING_SOON");

        private static final StateEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static StateEnum of(String input) {
            if (input != null) {
                for (StateEnum v : VALUES) {
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
