package io.github.primelib.jira4j.restv3.model;

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
 * DashboardGadgetUpdateRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "color",
    "position",
    "title"
})
@JsonTypeName("DashboardGadgetUpdateRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DashboardGadgetUpdateRequest {

    /**
     * Constructs a validated implementation of {@link DashboardGadgetUpdateRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DashboardGadgetUpdateRequest(Consumer<DashboardGadgetUpdateRequest> spec) {
        spec.accept(this);
    }

    /**
     * The color of the gadget. Should be one of `blue`, `red`, `yellow`, `green`, `cyan`, `purple`, `gray`, or `white`.
     */
    @JsonProperty("color")
    protected String color;

    @JsonProperty("position")
    protected DashboardGadgetUpdateRequestPosition position;

    /**
     * The title of the gadget.
     */
    @JsonProperty("title")
    protected String title;


}
