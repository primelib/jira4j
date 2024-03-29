package io.github.primelib.jira4j.restv3.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv3.model.ColumnRequestBody;
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
 * SetIssueNavigatorDefaultColumnsSpec
 * <p>
 * Specification for the SetIssueNavigatorDefaultColumns operation.
 * <p>
 * Set issue navigator default columns
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
    @NotNull 
    private ColumnRequestBody columnRequestBody;

    /**
     * Constructs a validated instance of {@link SetIssueNavigatorDefaultColumnsOperationSpec}.
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
     * Constructs a validated instance of {@link SetIssueNavigatorDefaultColumnsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param columnRequestBody    A navigable field value.
     */
    @ApiStatus.Internal
    public SetIssueNavigatorDefaultColumnsOperationSpec(ColumnRequestBody columnRequestBody) {
        this.columnRequestBody = columnRequestBody;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(columnRequestBody, "columnRequestBody is a required parameter!");
    }
}
