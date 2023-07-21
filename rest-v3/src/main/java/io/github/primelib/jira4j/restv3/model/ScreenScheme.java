package io.github.primelib.jira4j.restv3.model;

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
 * ScreenScheme
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

    /**
     * Constructs a validated instance of {@link ScreenScheme}.
     *
     * @param spec the specification to process
     */
    public ScreenScheme(Consumer<ScreenScheme> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ScreenScheme}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ScreenScheme(Consumer)} instead.
     * @param description The description of the screen scheme.
     * @param id The ID of the screen scheme.
     * @param issueTypeScreenSchemes var.name
     * @param name The name of the screen scheme.
     * @param screens var.name
     */
    @ApiStatus.Internal
    public ScreenScheme(String description, Long id, ScreenSchemeIssueTypeScreenSchemes issueTypeScreenSchemes, String name, ScreenSchemeScreens screens) {
        this.description = description;
        this.id = id;
        this.issueTypeScreenSchemes = issueTypeScreenSchemes;
        this.name = name;
        this.screens = screens;
    }

}
