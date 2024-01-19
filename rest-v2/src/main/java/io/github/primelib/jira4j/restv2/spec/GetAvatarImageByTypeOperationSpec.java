package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.Avatar;
import java.util.Set;
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
 * GetAvatarImageByTypeSpec
 * <p>
 * Specification for the GetAvatarImageByType operation.
 * <p>
 * Get avatar image by type
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * Constructs a validated instance of {@link GetAvatarImageByTypeOperationSpec}.
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
     * Constructs a validated instance of {@link GetAvatarImageByTypeOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param type                 The icon type of the avatar.
     * @param size                 The size of the avatar image. If not provided the default size is returned.
     * @param format               The format to return the avatar image in. If not provided the original content format is returned.
     */
    @ApiStatus.Internal
    public GetAvatarImageByTypeOperationSpec(String type, String size, String format) {
        this.type = type;
        this.size = size;
        this.format = format;

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
