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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StatusLayoutUpdate
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
    "layout",
    "properties",
    "statusReference"
})
@JsonTypeName("StatusLayoutUpdate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusLayoutUpdate {

    @JsonProperty("layout")
    protected WorkflowLayout layout;

    /**
     * The properties for this status layout.
     */
    @JsonProperty("properties")
    protected Map<String, String> properties;

    /**
     * A unique ID which the status will use to refer to this layout configuration.
     */
    @JsonProperty("statusReference")
    protected String statusReference;

    /**
     * Constructs a validated instance of {@link StatusLayoutUpdate}.
     *
     * @param spec the specification to process
     */
    public StatusLayoutUpdate(Consumer<StatusLayoutUpdate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StatusLayoutUpdate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StatusLayoutUpdate(Consumer)} instead.
     * @param layout layout
     * @param properties The properties for this status layout.
     * @param statusReference A unique ID which the status will use to refer to this layout configuration.
     */
    @ApiStatus.Internal
    public StatusLayoutUpdate(WorkflowLayout layout, Map<String, String> properties, String statusReference) {
        this.layout = layout;
        this.properties = properties;
        this.statusReference = statusReference;
    }

}
