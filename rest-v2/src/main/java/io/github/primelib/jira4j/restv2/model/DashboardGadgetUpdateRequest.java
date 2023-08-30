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
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DashboardGadgetUpdateRequest
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
    "position",
    "title"
})
@JsonTypeName("DashboardGadgetUpdateRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DashboardGadgetUpdateRequest {

    /**
     * The color of the gadget. Should be one of {@code blue}, {@code red}, {@code yellow}, {@code green}, {@code cyan}, {@code purple}, {@code gray}, or {@code white}.
     */
    @JsonProperty("color")
    protected String color;

    @JsonProperty("position")
    protected DashboardGadgetPosition position;

    /**
     * The title of the gadget.
     */
    @JsonProperty("title")
    protected String title;

    /**
     * Constructs a validated instance of {@link DashboardGadgetUpdateRequest}.
     *
     * @param spec the specification to process
     */
    public DashboardGadgetUpdateRequest(Consumer<DashboardGadgetUpdateRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link DashboardGadgetUpdateRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #DashboardGadgetUpdateRequest(Consumer)} instead.
     * @param color The color of the gadget. Should be one of {@code blue}, {@code red}, {@code yellow}, {@code green}, {@code cyan}, {@code purple}, {@code gray}, or {@code white}.
     * @param position position
     * @param title The title of the gadget.
     */
    @ApiStatus.Internal
    public DashboardGadgetUpdateRequest(String color, DashboardGadgetPosition position, String title) {
        this.color = color;
        this.position = position;
        this.title = title;
    }

}
