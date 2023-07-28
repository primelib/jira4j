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
 * DashboardGadget
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
     * The color of the gadget. Should be one of {@code blue}, {@code red}, {@code yellow}, {@code green}, {@code cyan}, {@code purple}, {@code gray}, or {@code white}.
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
     * Constructs a validated instance of {@link DashboardGadget}.
     *
     * @param spec the specification to process
     */
    public DashboardGadget(Consumer<DashboardGadget> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link DashboardGadget}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #DashboardGadget(Consumer)} instead.
     * @param color The color of the gadget. Should be one of {@code blue}, {@code red}, {@code yellow}, {@code green}, {@code cyan}, {@code purple}, {@code gray}, or {@code white}.
     * @param id The ID of the gadget instance.
     * @param moduleKey The module key of the gadget type.
     * @param position var.name
     * @param title The title of the gadget.
     * @param uri The URI of the gadget type.
     */
    @ApiStatus.Internal
    public DashboardGadget(ColorEnum color, Long id, String moduleKey, DashboardGadgetPosition position, String title, String uri) {
        this.color = color;
        this.id = id;
        this.moduleKey = moduleKey;
        this.position = position;
        this.title = title;
        this.uri = uri;
    }

    /**
     * The color of the gadget. Should be one of {@code blue}, {@code red}, {@code yellow}, {@code green}, {@code cyan}, {@code purple}, {@code gray}, or {@code white}.
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

        private static final ColorEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ColorEnum of(String input) {
            if (input != null) {
                for (ColorEnum v : VALUES) {
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
