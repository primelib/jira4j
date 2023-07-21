package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
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
 * DeleteAvatarSpec
 * <p>
 * Specification for the DeleteAvatar operation.
 * <p>
 * Delete avatar
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteAvatarOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The avatar type.
     */
    @NotNull 
    private String type;

    /**
     * The ID of the item the avatar is associated with.
     */
    @NotNull 
    private String owningObjectId;

    /**
     * The ID of the avatar.
     */
    @NotNull 
    private Long id;

    /**
     * Constructs a validated instance of {@link DeleteAvatarOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteAvatarOperationSpec(Consumer<DeleteAvatarOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link DeleteAvatarOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param type                 The avatar type.
     * @param owningObjectId       The ID of the item the avatar is associated with.
     * @param id                   The ID of the avatar.
     */
    @ApiStatus.Internal
    public DeleteAvatarOperationSpec(String type, String owningObjectId, Long id) {
        this.type = type;
        this.owningObjectId = owningObjectId;
        this.id = id;

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
        Objects.requireNonNull(owningObjectId, "owningObjectId is a required parameter!");
        Objects.requireNonNull(id, "id is a required parameter!");
    }
}
