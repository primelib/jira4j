package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.SecurityScheme;
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
 * GetIssueSecuritySchemeSpec
 * <p>
 * Specification for the GetIssueSecurityScheme operation.
 * <p>
 * Get issue security scheme
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetIssueSecuritySchemeOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the issue security scheme. Use the [Get issue security schemes](#api-rest-api-2-issuesecurityschemes-get) operation to get a list of issue security scheme IDs.
     */
    @NotNull 
    private Long id;

    /**
     * Constructs a validated instance of {@link GetIssueSecuritySchemeOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetIssueSecuritySchemeOperationSpec(Consumer<GetIssueSecuritySchemeOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link GetIssueSecuritySchemeOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the issue security scheme. Use the [Get issue security schemes](#api-rest-api-2-issuesecurityschemes-get) operation to get a list of issue security scheme IDs.
     */
    @ApiStatus.Internal
    public GetIssueSecuritySchemeOperationSpec(Long id) {
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
        Objects.requireNonNull(id, "id is a required parameter!");
    }
}
