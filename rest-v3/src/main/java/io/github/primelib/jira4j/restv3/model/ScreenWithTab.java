package io.github.primelib.jira4j.restv3.model;

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
 * ScreenWithTab
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "id",
    "name",
    "scope",
    "tab"
})
@JsonTypeName("ScreenWithTab")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ScreenWithTab {

    /**
     * Constructs a validated implementation of {@link ScreenWithTab}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ScreenWithTab(Consumer<ScreenWithTab> spec) {
        spec.accept(this);
    }

    /**
     * The description of the screen.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of the screen.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The name of the screen.
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("scope")
    protected ScreenScope scope;

    @JsonProperty("tab")
    protected ScreenWithTabTab tab;


}
