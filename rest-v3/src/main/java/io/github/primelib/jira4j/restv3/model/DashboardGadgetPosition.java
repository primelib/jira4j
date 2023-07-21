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
 * DashboardGadgetPosition
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
    "The column position of the gadget.",
    "The row position of the gadget."
})
@JsonTypeName("DashboardGadget_position")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DashboardGadgetPosition {

    @JsonProperty("The column position of the gadget.")
    protected Integer theColumnPositionOfTheGadget;

    @JsonProperty("The row position of the gadget.")
    protected Integer theRowPositionOfTheGadget;

    /**
     * Constructs a validated instance of {@link DashboardGadgetPosition}.
     *
     * @param spec the specification to process
     */
    public DashboardGadgetPosition(Consumer<DashboardGadgetPosition> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link DashboardGadgetPosition}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #DashboardGadgetPosition(Consumer)} instead.
     * @param theColumnPositionOfTheGadget var.name
     * @param theRowPositionOfTheGadget var.name
     */
    @ApiStatus.Internal
    public DashboardGadgetPosition(Integer theColumnPositionOfTheGadget, Integer theRowPositionOfTheGadget) {
        this.theColumnPositionOfTheGadget = theColumnPositionOfTheGadget;
        this.theRowPositionOfTheGadget = theRowPositionOfTheGadget;
    }

}
