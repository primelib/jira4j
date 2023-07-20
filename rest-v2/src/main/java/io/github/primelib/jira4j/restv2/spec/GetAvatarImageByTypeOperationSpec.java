package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Avatar;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetAvatarImageByTypeSpec
 * <p>
 * Specification for the GetAvatarImageByType operation.
 * <p>
 * Get avatar image by type
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAvatarImageByTypeOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The icon type of the avatar.
     */
    @NotNull 
    private String type;

    /**
     * The size of the avatar image. If not provided the default size is returned.
     */
    @Nullable 
    private String size;

    /**
     * The format to return the avatar image in. If not provided the original content format is returned.
     */
    @Nullable 
    private String format;

    /**
     * Constructs a validated implementation of {@link GetAvatarImageByTypeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAvatarImageByTypeOperationSpec(Consumer<GetAvatarImageByTypeOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(type, "type is a required parameter!");
    }

}
