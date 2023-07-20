package io.github.primelib.jira4j.restv2.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.ApplicationProperty;
import io.github.primelib.jira4j.restv2.model.Filter;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetApplicationPropertySpec
 * <p>
 * Specification for the GetApplicationProperty operation.
 * <p>
 * Get application property
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetApplicationPropertyOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The key of the application property.
     */
    @Nullable 
    private String key;

    /**
     * The permission level of all items being returned in the list.
     */
    @Nullable 
    private String permissionLevel;

    /**
     * When a `key` isn't provided, this filters the list of results by the application property `key` using a regular expression. For example, using `jira.lf.*` will return all application properties with keys that start with *jira.lf.*.
     */
    @Nullable 
    private String keyFilter;

    /**
     * Constructs a validated implementation of {@link GetApplicationPropertyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetApplicationPropertyOperationSpec(Consumer<GetApplicationPropertyOperationSpec> spec) {
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
