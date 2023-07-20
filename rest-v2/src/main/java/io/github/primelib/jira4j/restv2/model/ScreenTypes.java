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
 * ScreenTypes
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
@JsonTypeName("ScreenTypes")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ScreenTypes {

    /**
     * Constructs a validated implementation of {@link ScreenTypes}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ScreenTypes(Consumer<ScreenTypes> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the create screen.
     */
    @JsonProperty("create")
    protected Long create;

    /**
     * The ID of the default screen. Required when creating a screen scheme.
     */
    @JsonProperty("default")
    protected Long _default;

    /**
     * The ID of the edit screen.
     */
    @JsonProperty("edit")
    protected Long edit;

    /**
     * The ID of the view screen.
     */
    @JsonProperty("view")
    protected Long view;


}
