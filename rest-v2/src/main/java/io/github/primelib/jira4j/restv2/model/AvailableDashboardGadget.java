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
 * AvailableDashboardGadget
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
    "moduleKey",
    "title",
    "uri"
})
@JsonTypeName("AvailableDashboardGadget")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AvailableDashboardGadget {

    /**
     * The module key of the gadget type.
     */
    @JsonProperty("moduleKey")
    protected String moduleKey;

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
     * Constructs a validated instance of {@link AvailableDashboardGadget}.
     *
     * @param spec the specification to process
     */
    public AvailableDashboardGadget(Consumer<AvailableDashboardGadget> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AvailableDashboardGadget}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AvailableDashboardGadget(Consumer)} instead.
     * @param moduleKey The module key of the gadget type.
     * @param title The title of the gadget.
     * @param uri The URI of the gadget type.
     */
    @ApiStatus.Internal
    public AvailableDashboardGadget(String moduleKey, String title, String uri) {
        this.moduleKey = moduleKey;
        this.title = title;
        this.uri = uri;
    }

}
