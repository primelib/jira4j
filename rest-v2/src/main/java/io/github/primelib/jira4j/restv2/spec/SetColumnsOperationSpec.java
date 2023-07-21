package io.github.primelib.jira4j.restv2.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
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
 * SetColumnsSpec
 * <p>
 * Specification for the SetColumns operation.
 * <p>
 * Set columns
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SetColumnsOperationSpec {
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
     * The IDs of the fields to set as columns. In the form data, specify each field as {@code columns=id}, where {@code id} is the *id* of a field (as seen in the response for [Get fields](#api-rest-api-&amp;lt;ver&amp;gt;-field-get)). For example, {@code columns=summary}.
     */
    @Nullable 
    private List<String> requestBody;

    /**
     * Constructs a validated instance of {@link SetColumnsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SetColumnsOperationSpec(Consumer<SetColumnsOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link SetColumnsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param id                   The ID of the filter.
     * @param requestBody          The IDs of the fields to set as columns. In the form data, specify each field as {@code columns=id}, where {@code id} is the *id* of a field (as seen in the response for [Get fields](#api-rest-api-&amp;lt;ver&amp;gt;-field-get)). For example, {@code columns=summary}.
     */
    @ApiStatus.Internal
    public SetColumnsOperationSpec(Long id, List<String> requestBody) {
        this.id = id;
        this.requestBody = requestBody;

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
