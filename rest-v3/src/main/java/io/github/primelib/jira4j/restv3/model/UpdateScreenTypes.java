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
 * UpdateScreenTypes
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
@JsonTypeName("UpdateScreenTypes")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateScreenTypes {

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

    /**
     * Constructs a validated instance of {@link UpdateScreenTypes}.
     *
     * @param spec the specification to process
     */
    public UpdateScreenTypes(Consumer<UpdateScreenTypes> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateScreenTypes}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateScreenTypes(Consumer)} instead.
     * @param create The ID of the create screen. To remove the screen association, pass a null.
     * @param _default The ID of the default screen. When specified, must include a screen ID as a default screen is required.
     * @param edit The ID of the edit screen. To remove the screen association, pass a null.
     * @param view The ID of the view screen. To remove the screen association, pass a null.
     */
    @ApiStatus.Internal
    public UpdateScreenTypes(String create, String _default, String edit, String view) {
        this.create = create;
        this._default = _default;
        this.edit = edit;
        this.view = view;
    }

}
