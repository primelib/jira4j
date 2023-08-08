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
 * DashboardGadgetSettings
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
    "ignoreUriAndModuleKeyValidation",
    "moduleKey",
    "position",
    "title",
    "uri"
})
@JsonTypeName("DashboardGadgetSettings")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DashboardGadgetSettings {

    /**
     * The color of the gadget. Should be one of {@code blue}, {@code red}, {@code yellow}, {@code green}, {@code cyan}, {@code purple}, {@code gray}, or {@code white}.
     */
    @JsonProperty("color")
    protected String color;

    /**
     * Whether to ignore the validation of module key and URI. For example, when a gadget is created that is a part of an application that isn't installed.
     */
    @JsonProperty("ignoreUriAndModuleKeyValidation")
    protected Boolean ignoreUriAndModuleKeyValidation;

    /**
     * The module key of the gadget type. Can't be provided with {@code uri}.
     */
    @JsonProperty("moduleKey")
    protected String moduleKey;

    @JsonProperty("position")
    protected DashboardGadgetSettingsPosition position;

    /**
     * The title of the gadget.
     */
    @JsonProperty("title")
    protected String title;

    /**
     * The URI of the gadget type. Can't be provided with {@code moduleKey}.
     */
    @JsonProperty("uri")
    protected String uri;

    /**
     * Constructs a validated instance of {@link DashboardGadgetSettings}.
     *
     * @param spec the specification to process
     */
    public DashboardGadgetSettings(Consumer<DashboardGadgetSettings> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link DashboardGadgetSettings}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #DashboardGadgetSettings(Consumer)} instead.
     * @param color The color of the gadget. Should be one of {@code blue}, {@code red}, {@code yellow}, {@code green}, {@code cyan}, {@code purple}, {@code gray}, or {@code white}.
     * @param ignoreUriAndModuleKeyValidation Whether to ignore the validation of module key and URI. For example, when a gadget is created that is a part of an application that isn't installed.
     * @param moduleKey The module key of the gadget type. Can't be provided with {@code uri}.
     * @param position position
     * @param title The title of the gadget.
     * @param uri The URI of the gadget type. Can't be provided with {@code moduleKey}.
     */
    @ApiStatus.Internal
    public DashboardGadgetSettings(String color, Boolean ignoreUriAndModuleKeyValidation, String moduleKey, DashboardGadgetSettingsPosition position, String title, String uri) {
        this.color = color;
        this.ignoreUriAndModuleKeyValidation = ignoreUriAndModuleKeyValidation;
        this.moduleKey = moduleKey;
        this.position = position;
        this.title = title;
        this.uri = uri;
    }

}
