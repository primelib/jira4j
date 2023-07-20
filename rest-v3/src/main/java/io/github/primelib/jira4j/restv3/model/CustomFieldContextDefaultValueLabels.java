package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomFieldContextDefaultValueLabels
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "labels",
    "type"
})
@JsonTypeName("CustomFieldContextDefaultValueLabels")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValueLabels {

    /**
     * Constructs a validated implementation of {@link CustomFieldContextDefaultValueLabels}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValueLabels(Consumer<CustomFieldContextDefaultValueLabels> spec) {
        spec.accept(this);
    }

    /**
     * The default labels value.
     */
    @JsonProperty("labels")
    protected List<String> labels = new ArrayList<>();

    @JsonProperty("type")
    protected String type;


}
