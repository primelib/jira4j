package io.github.primelib.jira4j.restv2.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.ApplicationProperty;
import io.github.primelib.jira4j.restv2.model.Filter;
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
 * GetApplicationPropertySpec
 * <p>
 * Specification for the GetApplicationProperty operation.
 * <p>
 * Get application property
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * When a {@code key} isn't provided, this filters the list of results by the application property {@code key} using a regular expression. For example, using {@code jira.lf.*} will return all application properties with keys that start with *jira.lf.*.
     */
    @Nullable 
    private String keyFilter;

    /**
     * Constructs a validated instance of {@link GetApplicationPropertyOperationSpec}.
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
     * Constructs a validated instance of {@link GetApplicationPropertyOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param key                  The key of the application property.
     * @param permissionLevel      The permission level of all items being returned in the list.
     * @param keyFilter            When a {@code key} isn't provided, this filters the list of results by the application property {@code key} using a regular expression. For example, using {@code jira.lf.*} will return all application properties with keys that start with *jira.lf.*.
     */
    @ApiStatus.Internal
    public GetApplicationPropertyOperationSpec(String key, String permissionLevel, String keyFilter) {
        this.key = key;
        this.permissionLevel = permissionLevel;
        this.keyFilter = keyFilter;

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
