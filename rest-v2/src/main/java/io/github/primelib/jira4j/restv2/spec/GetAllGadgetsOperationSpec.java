package io.github.primelib.jira4j.restv2.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.net.URI;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * GetAllGadgetsSpec
 * <p>
 * Specification for the GetAllGadgets operation.
 * <p>
 * Get gadgets
 */
@Data
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAllGadgetsOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the dashboard.
     */
    @NotNull 
    private Long dashboardId;

    /**
     * The list of gadgets module keys. To include multiple module keys, separate module keys with ampersand: `moduleKey=key:one&amp;moduleKey=key:two`.
     */
    @Nullable 
    private List<String> moduleKey;

    /**
     * The list of gadgets URIs. To include multiple URIs, separate URIs with ampersand: `uri=/rest/example/uri/1&amp;uri=/rest/example/uri/2`.
     */
    @Nullable 
    private List<String> uri;

    /**
     * The list of gadgets IDs. To include multiple IDs, separate IDs with ampersand: `gadgetId=10000&amp;gadgetId=10001`.
     */
    @Nullable 
    private List<Long> gadgetId;

    /**
     * Constructs a validated implementation of {@link GetAllGadgetsOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GetAllGadgetsOperationSpec(Consumer<GetAllGadgetsOperationSpec> spec) {
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
        Objects.requireNonNull(dashboardId, "dashboardId is a required parameter!");
    }

}
