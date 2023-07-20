package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetIssueTypePropertySpec
 * <p>
 * Specification for the GetIssueTypeProperty operation.
 * <p>
 * Get issue type property
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetIssueTypePropertyOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the issue type.
     */
    @NotNull 
    private String issueTypeId;

    /**
     * The key of the property. Use [Get issue type property keys](#api-rest-api-2-issuetype-issueTypeId-properties-get) to get a list of all issue type property keys.
     */
    @NotNull 
    private String propertyKey;

    /**
     * Constructs a validated implementation of {@link GetIssueTypePropertyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetIssueTypePropertyOperationSpec(Consumer<GetIssueTypePropertyOperationSpec> spec) {
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
        Objects.requireNonNull(issueTypeId, "issueTypeId is a required parameter!");
        Objects.requireNonNull(propertyKey, "propertyKey is a required parameter!");
    }

}
