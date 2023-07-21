package io.github.primelib.jira4j.restv2.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.util.Set;
import java.net.URI;
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
 * GetAllGadgetsSpec
 * <p>
 * Specification for the GetAllGadgets operation.
 * <p>
 * Get gadgets
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
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
     * The list of gadgets module keys. To include multiple module keys, separate module keys with ampersand: {@code moduleKey=key:one&amp;moduleKey=key:two}.
     */
    @Nullable 
    private List<String> moduleKey;

    /**
     * The list of gadgets URIs. To include multiple URIs, separate URIs with ampersand: {@code uri=/rest/example/uri/1&amp;uri=/rest/example/uri/2}.
     */
    @Nullable 
    private List<String> uri;

    /**
     * The list of gadgets IDs. To include multiple IDs, separate IDs with ampersand: {@code gadgetId=10000&amp;gadgetId=10001}.
     */
    @Nullable 
    private List<Long> gadgetId;

    /**
     * Constructs a validated instance of {@link GetAllGadgetsOperationSpec}.
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
     * Constructs a validated instance of {@link GetAllGadgetsOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param dashboardId          The ID of the dashboard.
     * @param moduleKey            The list of gadgets module keys. To include multiple module keys, separate module keys with ampersand: {@code moduleKey=key:one&amp;moduleKey=key:two}.
     * @param uri                  The list of gadgets URIs. To include multiple URIs, separate URIs with ampersand: {@code uri=/rest/example/uri/1&amp;uri=/rest/example/uri/2}.
     * @param gadgetId             The list of gadgets IDs. To include multiple IDs, separate IDs with ampersand: {@code gadgetId=10000&amp;gadgetId=10001}.
     */
    @ApiStatus.Internal
    public GetAllGadgetsOperationSpec(Long dashboardId, List<String> moduleKey, List<String> uri, List<Long> gadgetId) {
        this.dashboardId = dashboardId;
        this.moduleKey = moduleKey;
        this.uri = uri;
        this.gadgetId = gadgetId;

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
