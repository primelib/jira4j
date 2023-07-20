package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.Avatar;
import io.github.primelib.jira4j.restv3.model.Avatars;
import io.github.primelib.jira4j.restv3.model.SystemAvatars;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetAllSystemAvatarsSpec
 * <p>
 * Specification for the GetAllSystemAvatars operation.
 * <p>
 * Get system avatars by type
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAllSystemAvatarsOperationSpec {
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
     * Constructs a validated implementation of {@link GetAllSystemAvatarsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAllSystemAvatarsOperationSpec(Consumer<GetAllSystemAvatarsOperationSpec> spec) {
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
