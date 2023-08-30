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
 * DashboardGadgetResponse
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
@JsonTypeName("DashboardGadgetResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DashboardGadgetResponse {

    /**
     * The list of gadgets.
     */
    @JsonProperty("gadgets")
    protected List<DashboardGadget> gadgets;

    /**
     * Constructs a validated instance of {@link DashboardGadgetResponse}.
     *
     * @param spec the specification to process
     */
    public DashboardGadgetResponse(Consumer<DashboardGadgetResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link DashboardGadgetResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #DashboardGadgetResponse(Consumer)} instead.
     * @param gadgets The list of gadgets.
     */
    @ApiStatus.Internal
    public DashboardGadgetResponse(List<DashboardGadget> gadgets) {
        this.gadgets = gadgets;
    }

}
