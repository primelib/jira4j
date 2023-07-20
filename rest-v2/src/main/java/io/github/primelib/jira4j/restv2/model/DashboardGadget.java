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
 * DashboardGadget
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "color",
    "id",
    "moduleKey",
    "position",
    "title",
    "uri"
})
@JsonTypeName("DashboardGadget")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DashboardGadget {

    /**
     * Constructs a validated implementation of {@link DashboardGadget}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DashboardGadget(Consumer<DashboardGadget> spec) {
        spec.accept(this);
    }

    /**
     * The color of the gadget. Should be one of `blue`, `red`, `yellow`, `green`, `cyan`, `purple`, `gray`, or `white`.
     */
    @JsonProperty("color")
    protected ColorEnum color;

    /**
     * The ID of the gadget instance.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The module key of the gadget type.
     */
    @JsonProperty("moduleKey")
    protected String moduleKey;

    @JsonProperty("position")
    protected DashboardGadgetPosition position;

    /**
     * The title of the gadget.
     */
    @JsonProperty("title")
    protected String title;

    /**
     * The URI of the gadget type.
     */
    @JsonProperty("uri")
    protected String uri;


    /**
     * The color of the gadget. Should be one of `blue`, `red`, `yellow`, `green`, `cyan`, `purple`, `gray`, or `white`.
     */
    @AllArgsConstructor
    public enum ColorEnum {
        BLUE("blue"),
        RED("red"),
        YELLOW("yellow"),
        GREEN("green"),
        CYAN("cyan"),
        PURPLE("purple"),
        GRAY("gray"),
        WHITE("white");

        private final String value;
    }

}
