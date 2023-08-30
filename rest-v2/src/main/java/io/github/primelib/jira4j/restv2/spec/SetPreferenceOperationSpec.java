package io.github.primelib.jira4j.restv2.spec;

import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
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
 * SetPreferenceSpec
 * <p>
 * Specification for the SetPreference operation.
 * <p>
 * Set preference
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SetPreferenceOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The key of the preference. The maximum length is 255 characters.
     */
    @NotNull 
    private String key;

    /**
     * The value of the preference as a plain text string. The maximum length is 255 characters.
     */
    @NotNull 
    private String body;

    /**
     * Constructs a validated instance of {@link SetPreferenceOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SetPreferenceOperationSpec(Consumer<SetPreferenceOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link SetPreferenceOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param key                  The key of the preference. The maximum length is 255 characters.
     * @param body                 The value of the preference as a plain text string. The maximum length is 255 characters.
     */
    @ApiStatus.Internal
    public SetPreferenceOperationSpec(String key, String body) {
        this.key = key;
        this.body = body;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(key, "key is a required parameter!");
        Objects.requireNonNull(body, "body is a required parameter!");
    }
}
