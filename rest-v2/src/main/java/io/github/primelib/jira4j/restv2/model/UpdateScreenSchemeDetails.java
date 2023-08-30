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
 * UpdateScreenSchemeDetails
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
    "name",
    "screens"
})
@JsonTypeName("UpdateScreenSchemeDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateScreenSchemeDetails {

    /**
     * The description of the screen scheme. The maximum length is 255 characters.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The name of the screen scheme. The name must be unique. The maximum length is 255 characters.
     */
    @JsonProperty("name")
    protected String name;

    @JsonProperty("screens")
    protected UpdateScreenTypes screens;

    /**
     * Constructs a validated instance of {@link UpdateScreenSchemeDetails}.
     *
     * @param spec the specification to process
     */
    public UpdateScreenSchemeDetails(Consumer<UpdateScreenSchemeDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateScreenSchemeDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateScreenSchemeDetails(Consumer)} instead.
     * @param description The description of the screen scheme. The maximum length is 255 characters.
     * @param name The name of the screen scheme. The name must be unique. The maximum length is 255 characters.
     * @param screens screens
     */
    @ApiStatus.Internal
    public UpdateScreenSchemeDetails(String description, String name, UpdateScreenTypes screens) {
        this.description = description;
        this.name = name;
        this.screens = screens;
    }

}
