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
 * ColumnItem
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
    "label",
    "value"
})
@JsonTypeName("ColumnItem")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ColumnItem {

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

    /**
     * Constructs a validated instance of {@link ColumnItem}.
     *
     * @param spec the specification to process
     */
    public ColumnItem(Consumer<ColumnItem> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ColumnItem}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ColumnItem(Consumer)} instead.
     * @param label The issue navigator column label.
     * @param value The issue navigator column value.
     */
    @ApiStatus.Internal
    public ColumnItem(String label, String value) {
        this.label = label;
        this.value = value;
    }

}
