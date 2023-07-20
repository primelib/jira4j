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
 * ScreenableTab
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "name"
})
@JsonTypeName("ScreenableTab")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ScreenableTab {

    /**
     * Constructs a validated implementation of {@link ScreenableTab}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ScreenableTab(Consumer<ScreenableTab> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the screen tab.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The name of the screen tab. The maximum length is 255 characters.
     */
    @JsonProperty("name")
    protected String name;


}
