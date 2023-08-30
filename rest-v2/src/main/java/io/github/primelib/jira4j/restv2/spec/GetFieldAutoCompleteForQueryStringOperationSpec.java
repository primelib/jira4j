package io.github.primelib.jira4j.restv2.spec;

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
 * GetFieldAutoCompleteForQueryStringSpec
 * <p>
 * Specification for the GetFieldAutoCompleteForQueryString operation.
 * <p>
 * Get field auto complete suggestions
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetFieldAutoCompleteForQueryStringOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The name of the field.
     */
    @Nullable 
    private String fieldName;

    /**
     * The partial field item name entered by the user.
     */
    @Nullable 
    private String fieldValue;

    /**
     * The name of the [ CHANGED operator predicate](https://confluence.atlassian.com/x/hQORLQ#Advancedsearching-operatorsreference-CHANGEDCHANGED) for which the suggestions are generated. The valid predicate operators are *by*, *from*, and *to*.
     */
    @Nullable 
    private String predicateName;

    /**
     * The partial predicate item name entered by the user.
     */
    @Nullable 
    private String predicateValue;

    /**
     * Constructs a validated instance of {@link GetFieldAutoCompleteForQueryStringOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetFieldAutoCompleteForQueryStringOperationSpec(Consumer<GetFieldAutoCompleteForQueryStringOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetFieldAutoCompleteForQueryStringOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param fieldName            The name of the field.
     * @param fieldValue           The partial field item name entered by the user.
     * @param predicateName        The name of the [ CHANGED operator predicate](https://confluence.atlassian.com/x/hQORLQ#Advancedsearching-operatorsreference-CHANGEDCHANGED) for which the suggestions are generated. The valid predicate operators are *by*, *from*, and *to*.
     * @param predicateValue       The partial predicate item name entered by the user.
     */
    @ApiStatus.Internal
    public GetFieldAutoCompleteForQueryStringOperationSpec(String fieldName, String fieldValue, String predicateName, String predicateValue) {
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
        this.predicateName = predicateName;
        this.predicateValue = predicateValue;

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
