package io.github.primelib.jira4j.restv2.model;

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
 * CustomFieldContextDefaultValueDateTime
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "dateTime",
    "type",
    "useCurrent"
})
@JsonTypeName("CustomFieldContextDefaultValueDateTime")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValueDateTime {

    /**
     * Constructs a validated implementation of {@link CustomFieldContextDefaultValueDateTime}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValueDateTime(Consumer<CustomFieldContextDefaultValueDateTime> spec) {
        spec.accept(this);
    }

    /**
     * The default date-time in ISO format. Ignored if `useCurrent` is true.
     */
    @JsonProperty("dateTime")
    protected String dateTime;

    @JsonProperty("type")
    protected String type;

    /**
     * Whether to use the current date.
     */
    @JsonProperty("useCurrent")
    protected Boolean useCurrent = false;


}
