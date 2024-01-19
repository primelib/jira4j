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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProjectType
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

    /**
     * Constructs a validated instance of {@link ProjectType}.
     *
     * @param spec the specification to process
     */
    public ProjectType(Consumer<ProjectType> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ProjectType}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ProjectType(Consumer)} instead.
     * @param color The color of the project type.
     * @param descriptionI18nKey The key of the project type's description.
     * @param formattedKey The formatted key of the project type.
     * @param icon The icon of the project type.
     * @param key The key of the project type.
     */
    @ApiStatus.Internal
    public ProjectType(String color, String descriptionI18nKey, String formattedKey, String icon, String key) {
        this.color = color;
        this.descriptionI18nKey = descriptionI18nKey;
        this.formattedKey = formattedKey;
        this.icon = icon;
        this.key = key;
    }

}
