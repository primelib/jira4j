package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Screen;
import io.github.primelib.jira4j.restv3.model.ScreenSchemeDetails;
import java.util.Set;
import io.github.primelib.jira4j.restv3.model.UpdateScreenSchemeDetails;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * UpdateScreenSchemeSpec
 * <p>
 * Specification for the UpdateScreenScheme operation.
 * <p>
 * Update screen scheme
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateScreenSchemeOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the screen scheme.
     */
    @NotNull 
    private String screenSchemeId;

    /**
     * The screen scheme update details.
     */
    @NotNull 
    private UpdateScreenSchemeDetails updateScreenSchemeDetails;

    /**
     * Constructs a validated instance of {@link UpdateScreenSchemeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateScreenSchemeOperationSpec(Consumer<UpdateScreenSchemeOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateScreenSchemeOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param screenSchemeId       The ID of the screen scheme.
     * @param updateScreenSchemeDetails The screen scheme update details.
     */
    @ApiStatus.Internal
    public UpdateScreenSchemeOperationSpec(String screenSchemeId, UpdateScreenSchemeDetails updateScreenSchemeDetails) {
        this.screenSchemeId = screenSchemeId;
        this.updateScreenSchemeDetails = updateScreenSchemeDetails;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(screenSchemeId, "screenSchemeId is a required parameter!");
        Objects.requireNonNull(updateScreenSchemeDetails, "updateScreenSchemeDetails is a required parameter!");
    }
}
