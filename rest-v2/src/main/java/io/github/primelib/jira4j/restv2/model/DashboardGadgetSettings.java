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
 * DashboardGadgetSettings
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link DashboardGadgetSettings}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DashboardGadgetSettings(Consumer<DashboardGadgetSettings> spec) {
        spec.accept(this);
    }

    /**
     * The color of the gadget. Should be one of `blue`, `red`, `yellow`, `green`, `cyan`, `purple`, `gray`, or `white`.
     */
    @JsonProperty("color")
    protected String color;

    /**
     * Whether to ignore the validation of module key and URI. For example, when a gadget is created that is a part of an application that isn't installed.
     */
    @JsonProperty("ignoreUriAndModuleKeyValidation")
    protected Boolean ignoreUriAndModuleKeyValidation;

    /**
     * The module key of the gadget type. Can't be provided with `uri`.
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
     * The URI of the gadget type. Can't be provided with `moduleKey`.
     */
    @JsonProperty("uri")
    protected String uri;


}
