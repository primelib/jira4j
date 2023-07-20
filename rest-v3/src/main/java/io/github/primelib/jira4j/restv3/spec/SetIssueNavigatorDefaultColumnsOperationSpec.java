package io.github.primelib.jira4j.restv3.spec;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.util.Set;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * SetIssueNavigatorDefaultColumnsSpec
 * <p>
 * Specification for the SetIssueNavigatorDefaultColumns operation.
 * <p>
 * Set issue navigator default columns
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SetIssueNavigatorDefaultColumnsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * A navigable field value.
     */
    @Nullable 
    private List<String> requestBody;

    /**
     * Constructs a validated implementation of {@link SetIssueNavigatorDefaultColumnsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SetIssueNavigatorDefaultColumnsOperationSpec(Consumer<SetIssueNavigatorDefaultColumnsOperationSpec> spec) {
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
    }

}
