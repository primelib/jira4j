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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AvailableDashboardGadgetsResponse
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
    "gadgets"
})
@JsonTypeName("AvailableDashboardGadgetsResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AvailableDashboardGadgetsResponse {

    /**
     * The list of available gadgets.
     */
    @JsonProperty("gadgets")
    protected List<AvailableDashboardGadget> gadgets;

    /**
     * Constructs a validated instance of {@link AvailableDashboardGadgetsResponse}.
     *
     * @param spec the specification to process
     */
    public AvailableDashboardGadgetsResponse(Consumer<AvailableDashboardGadgetsResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AvailableDashboardGadgetsResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AvailableDashboardGadgetsResponse(Consumer)} instead.
     * @param gadgets The list of available gadgets.
     */
    @ApiStatus.Internal
    public AvailableDashboardGadgetsResponse(List<AvailableDashboardGadget> gadgets) {
        this.gadgets = gadgets;
    }

}
