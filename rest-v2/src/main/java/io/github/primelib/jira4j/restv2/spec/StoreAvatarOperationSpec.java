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
 * StoreAvatarSpec
 * <p>
 * Specification for the StoreAvatar operation.
 * <p>
 * Load avatar
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
    private Integer x;

    /**
     * The Y coordinate of the top-left corner of the crop region.
     */
    @Nullable 
    private Integer y;

    /**
     * Constructs a validated instance of {@link StoreAvatarOperationSpec}.
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
     * Constructs a validated instance of {@link StoreAvatarOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param type                 The avatar type.
     * @param entityId             The ID of the item the avatar is associated with.
     * @param size                 The length of each side of the crop region.
     * @param body                 
     * @param x                    The X coordinate of the top-left corner of the crop region.
     * @param y                    The Y coordinate of the top-left corner of the crop region.
     */
    @ApiStatus.Internal
    public StoreAvatarOperationSpec(String type, String entityId, Integer size, Object body, Integer x, Integer y) {
        this.type = type;
        this.entityId = entityId;
        this.size = size;
        this.body = body;
        this.x = x;
        this.y = y;

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
