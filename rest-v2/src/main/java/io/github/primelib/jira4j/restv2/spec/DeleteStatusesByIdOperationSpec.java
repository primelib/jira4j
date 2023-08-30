package io.github.primelib.jira4j.restv2.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

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
 * DeleteStatusesByIdSpec
 * <p>
 * Specification for the DeleteStatusesById operation.
 * <p>
 * Bulk delete Statuses
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DeleteStatusesByIdOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The list of status IDs. To include multiple IDs, provide an ampersand-separated list. For example, id=10000&amp;id=10001.
     * Min items {@code 1}, Max items {@code 50}
     */
    @Nullable 
    private List<String> id;

    /**
     * Constructs a validated instance of {@link DeleteStatusesByIdOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DeleteStatusesByIdOperationSpec(Consumer<DeleteStatusesByIdOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link DeleteStatusesByIdOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The list of status IDs. To include multiple IDs, provide an ampersand-separated list. For example, id=10000&amp;id=10001.  Min items {@code 1}, Max items {@code 50}
     */
    @ApiStatus.Internal
    public DeleteStatusesByIdOperationSpec(List<String> id) {
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
    }
}