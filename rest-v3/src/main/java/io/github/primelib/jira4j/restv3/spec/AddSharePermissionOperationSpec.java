package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import java.util.Set;
import io.github.primelib.jira4j.restv3.model.SharePermission;
import io.github.primelib.jira4j.restv3.model.SharePermissionInputBean;
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
 * AddSharePermissionSpec
 * <p>
 * Specification for the AddSharePermission operation.
 * <p>
 * Add share permission
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AddSharePermissionOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the filter.
     */
    @NotNull 
    private Long id;

    /**
     */
    @NotNull 
    private SharePermissionInputBean sharePermissionInputBean;

    /**
     * Constructs a validated instance of {@link AddSharePermissionOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AddSharePermissionOperationSpec(Consumer<AddSharePermissionOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link AddSharePermissionOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the filter.
     * @param sharePermissionInputBean 
     */
    @ApiStatus.Internal
    public AddSharePermissionOperationSpec(Long id, SharePermissionInputBean sharePermissionInputBean) {
        this.id = id;
        this.sharePermissionInputBean = sharePermissionInputBean;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(id, "id is a required parameter!");
        Objects.requireNonNull(sharePermissionInputBean, "sharePermissionInputBean is a required parameter!");
    }
}
