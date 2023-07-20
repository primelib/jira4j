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
 * UpdateScreenSchemeDetailsScreens
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "create",
    "default",
    "edit",
    "view"
})
@JsonTypeName("UpdateScreenSchemeDetails_screens")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateScreenSchemeDetailsScreens {

    /**
     * Constructs a validated implementation of {@link UpdateScreenSchemeDetailsScreens}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateScreenSchemeDetailsScreens(Consumer<UpdateScreenSchemeDetailsScreens> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the create screen. To remove the screen association, pass a null.
     */
    @JsonProperty("create")
    protected String create;

    /**
     * The ID of the default screen. When specified, must include a screen ID as a default screen is required.
     */
    @JsonProperty("default")
    protected String _default;

    /**
     * The ID of the edit screen. To remove the screen association, pass a null.
     */
    @JsonProperty("edit")
    protected String edit;

    /**
     * The ID of the view screen. To remove the screen association, pass a null.
     */
    @JsonProperty("view")
    protected String view;


}
