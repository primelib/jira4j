package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Screen;
import io.github.primelib.jira4j.restv3.model.ScreenSchemeId;
import java.util.Set;
import io.github.primelib.jira4j.restv3.model.UpdateDefaultScreenScheme;
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
 * UpdateDefaultScreenSchemeSpec
 * <p>
 * Specification for the UpdateDefaultScreenScheme operation.
 * <p>
 * Update issue type screen scheme default screen scheme
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateDefaultScreenSchemeOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the issue type screen scheme.
     */
    @NotNull 
    private String issueTypeScreenSchemeId;

    /**
     */
    @NotNull 
    private UpdateDefaultScreenScheme updateDefaultScreenScheme;

    /**
     * Constructs a validated instance of {@link UpdateDefaultScreenSchemeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UpdateDefaultScreenSchemeOperationSpec(Consumer<UpdateDefaultScreenSchemeOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link UpdateDefaultScreenSchemeOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param issueTypeScreenSchemeId The ID of the issue type screen scheme.
     * @param updateDefaultScreenScheme 
     */
    @ApiStatus.Internal
    public UpdateDefaultScreenSchemeOperationSpec(String issueTypeScreenSchemeId, UpdateDefaultScreenScheme updateDefaultScreenScheme) {
        this.issueTypeScreenSchemeId = issueTypeScreenSchemeId;
        this.updateDefaultScreenScheme = updateDefaultScreenScheme;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(issueTypeScreenSchemeId, "issueTypeScreenSchemeId is a required parameter!");
        Objects.requireNonNull(updateDefaultScreenScheme, "updateDefaultScreenScheme is a required parameter!");
    }
}
