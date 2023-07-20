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
 * ScreenScheme
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "id",
    "issueTypeScreenSchemes",
    "name",
    "screens"
})
@JsonTypeName("ScreenScheme")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ScreenScheme {

    /**
     * Constructs a validated implementation of {@link ScreenScheme}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ScreenScheme(Consumer<ScreenScheme> spec) {
        spec.accept(this);
    }

    /**
     * The description of the screen scheme.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of the screen scheme.
     */
    @JsonProperty("id")
    protected Long id;

    @JsonProperty("issueTypeScreenSchemes")
    protected ScreenSchemeIssueTypeScreenSchemes issueTypeScreenSchemes;

    /**
     * The name of the screen scheme.
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("screens")
    protected ScreenSchemeScreens screens;


}
