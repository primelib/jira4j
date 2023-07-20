package io.github.primelib.jira4j.restv3.spec;

import java.util.Map;
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
 * NotifySpec
 * <p>
 * Specification for the Notify operation.
 * <p>
 * Send notification for issue
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NotifyOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * ID or key of the issue that the notification is sent for.
     */
    @NotNull 
    private String issueIdOrKey;

    /**
     * The request object for the notification and recipients.
     */
    @NotNull 
    private Map<String, Object> requestBody;

    /**
     * Constructs a validated implementation of {@link NotifyOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public NotifyOperationSpec(Consumer<NotifyOperationSpec> spec) {
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
        Objects.requireNonNull(issueIdOrKey, "issueIdOrKey is a required parameter!");
        Objects.requireNonNull(requestBody, "requestBody is a required parameter!");
    }

}
