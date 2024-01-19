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
 * WarningCollection
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
    "warnings"
})
@JsonTypeName("WarningCollection")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WarningCollection {

    @JsonProperty("warnings")
    protected List<String> warnings;

    /**
     * Constructs a validated instance of {@link WarningCollection}.
     *
     * @param spec the specification to process
     */
    public WarningCollection(Consumer<WarningCollection> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WarningCollection}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WarningCollection(Consumer)} instead.
     * @param warnings warnings
     */
    @ApiStatus.Internal
    public WarningCollection(List<String> warnings) {
        this.warnings = warnings;
    }

}
