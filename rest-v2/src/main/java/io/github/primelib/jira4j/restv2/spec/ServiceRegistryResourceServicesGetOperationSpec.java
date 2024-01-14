package io.github.primelib.jira4j.restv2.spec;

import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import javax.annotation.processing.Generated;

import io.github.primelib.jira4j.restv2.model.ServiceRegistry;
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
 * ServiceRegistryResourceServicesGetSpec
 * <p>
 * Specification for the ServiceRegistryResourceServicesGet operation.
 * <p>
 * Retrieve the attributes of service registries
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceRegistryResourceServicesGetOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * The ID of the services (the strings starting with "b:" need to be decoded in Base64).
     */
    @NotNull 
    private List<String> serviceIds;

    /**
     * Constructs a validated instance of {@link ServiceRegistryResourceServicesGetOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ServiceRegistryResourceServicesGetOperationSpec(Consumer<ServiceRegistryResourceServicesGetOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link ServiceRegistryResourceServicesGetOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param serviceIds           The ID of the services (the strings starting with "b:" need to be decoded in Base64).
     */
    @ApiStatus.Internal
    public ServiceRegistryResourceServicesGetOperationSpec(List<String> serviceIds) {
        this.serviceIds = serviceIds;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
        Objects.requireNonNull(serviceIds, "serviceIds is a required parameter!");
    }
}
