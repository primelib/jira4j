package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Avatar;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * StoreAvatarSpec
 * <p>
 * Specification for the StoreAvatar operation.
 * <p>
 * Load avatar
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StoreAvatarOperationSpec {
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
    private String entityId;

    /**
     * The length of each side of the crop region.
     */
    @NotNull 
    private Integer size;

    /**
     */
    @NotNull 
    private Object body;

    /**
     * The X coordinate of the top-left corner of the crop region.
     */
    @Nullable 
    private Integer x = 0;

    /**
     * The Y coordinate of the top-left corner of the crop region.
     */
    @Nullable 
    private Integer y = 0;

    /**
     * Constructs a validated implementation of {@link StoreAvatarOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public StoreAvatarOperationSpec(Consumer<StoreAvatarOperationSpec> spec) {
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
        Objects.requireNonNull(entityId, "entityId is a required parameter!");
        Objects.requireNonNull(size, "size is a required parameter!");
        Objects.requireNonNull(body, "body is a required parameter!");
    }

}
