package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StatusLayoutUpdate
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "layout",
    "properties",
    "statusReference"
})
@JsonTypeName("StatusLayoutUpdate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusLayoutUpdate extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link StatusLayoutUpdate}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public StatusLayoutUpdate(Consumer<StatusLayoutUpdate> spec) {
        spec.accept(this);
    }

    @JsonProperty("layout")
    protected WorkflowLayout layout;

    /**
     * The properties for this status layout.
     */
    @JsonProperty("properties")
    protected Map<String, String> properties = new HashMap<>();

    /**
     * A unique ID which the status will use to refer to this layout configuration.
     */
    @JsonProperty("statusReference")
    protected String statusReference;


}
