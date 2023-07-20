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
 * ColumnItem
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "label",
    "value"
})
@JsonTypeName("ColumnItem")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ColumnItem {

    /**
     * Constructs a validated implementation of {@link ColumnItem}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ColumnItem(Consumer<ColumnItem> spec) {
        spec.accept(this);
    }

    /**
     * The issue navigator column label.
     */
    @JsonProperty("label")
    protected String label;

    /**
     * The issue navigator column value.
     */
    @JsonProperty("value")
    protected String value;


}
