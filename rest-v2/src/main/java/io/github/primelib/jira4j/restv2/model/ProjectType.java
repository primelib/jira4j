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
 * ProjectType
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "color",
    "descriptionI18nKey",
    "formattedKey",
    "icon",
    "key"
})
@JsonTypeName("ProjectType")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectType {

    /**
     * Constructs a validated implementation of {@link ProjectType}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ProjectType(Consumer<ProjectType> spec) {
        spec.accept(this);
    }

    /**
     * The color of the project type.
     */
    @JsonProperty("color")
    protected String color;

    /**
     * The key of the project type's description.
     */
    @JsonProperty("descriptionI18nKey")
    protected String descriptionI18nKey;

    /**
     * The formatted key of the project type.
     */
    @JsonProperty("formattedKey")
    protected String formattedKey;

    /**
     * The icon of the project type.
     */
    @JsonProperty("icon")
    protected String icon;

    /**
     * The key of the project type.
     */
    @JsonProperty("key")
    protected String key;


}
