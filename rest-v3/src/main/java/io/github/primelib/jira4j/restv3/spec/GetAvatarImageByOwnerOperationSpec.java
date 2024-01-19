package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Avatar;
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
 * GetAvatarImageByOwnerSpec
 * <p>
 * Specification for the GetAvatarImageByOwner operation.
 * <p>
 * Get avatar image by owner
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAvatarImageByOwnerOperationSpec {
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
     * The ID of the project or issue type the avatar belongs to.
     */
    @NotNull 
    private String entityId;

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
     * Constructs a validated instance of {@link GetAvatarImageByOwnerOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAvatarImageByOwnerOperationSpec(Consumer<GetAvatarImageByOwnerOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetAvatarImageByOwnerOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param type                 The icon type of the avatar.
     * @param entityId             The ID of the project or issue type the avatar belongs to.
     * @param size                 The size of the avatar image. If not provided the default size is returned.
     * @param format               The format to return the avatar image in. If not provided the original content format is returned.
     */
    @ApiStatus.Internal
    public GetAvatarImageByOwnerOperationSpec(String type, String entityId, String size, String format) {
        this.type = type;
        this.entityId = entityId;
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
        Objects.requireNonNull(entityId, "entityId is a required parameter!");
    }
}
