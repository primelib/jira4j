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
 * ScreenTypes
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
    "create",
    "default",
    "edit",
    "view"
})
@JsonTypeName("ScreenTypes")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ScreenTypes {

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

    /**
     * Constructs a validated instance of {@link ScreenTypes}.
     *
     * @param spec the specification to process
     */
    public ScreenTypes(Consumer<ScreenTypes> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ScreenTypes}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ScreenTypes(Consumer)} instead.
     * @param create The ID of the create screen.
     * @param _default The ID of the default screen. Required when creating a screen scheme.
     * @param edit The ID of the edit screen.
     * @param view The ID of the view screen.
     */
    @ApiStatus.Internal
    public ScreenTypes(Long create, Long _default, Long edit, Long view) {
        this.create = create;
        this._default = _default;
        this.edit = edit;
        this.view = view;
    }

}
