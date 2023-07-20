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
 * DashboardGadgetPosition
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "The column position of the gadget.",
    "The row position of the gadget."
})
@JsonTypeName("DashboardGadget_position")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DashboardGadgetPosition {

    /**
     * Constructs a validated implementation of {@link DashboardGadgetPosition}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DashboardGadgetPosition(Consumer<DashboardGadgetPosition> spec) {
        spec.accept(this);
    }

    @JsonProperty("The column position of the gadget.")
    protected Integer theColumnPositionOfTheGadget;

    @JsonProperty("The row position of the gadget.")
    protected Integer theRowPositionOfTheGadget;


}
