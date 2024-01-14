package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceRegistry
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@JsonPropertyOrder({
    "description",
    "id",
    "name",
    "organizationId",
    "revision",
    "serviceTier"
})
@JsonTypeName("ServiceRegistry")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceRegistry {

    /**
     * service description
     */
    @JsonProperty("description")
    protected String description;

    /**
     * service ID
     */
    @JsonProperty("id")
    protected UUID id;

    /**
     * service name
     */
    @JsonProperty("name")
    protected String name;

    /**
     * organization ID
     */
    @JsonProperty("organizationId")
    protected String organizationId;

    /**
     * service revision
     */
    @JsonProperty("revision")
    protected String revision;

    @JsonProperty("serviceTier")
    protected ServiceRegistryTier serviceTier;

    /**
     * Constructs a validated instance of {@link ServiceRegistry}.
     *
     * @param spec the specification to process
     */
    public ServiceRegistry(Consumer<ServiceRegistry> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceRegistry}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceRegistry(Consumer)} instead.
     * @param description service description
     * @param id service ID
     * @param name service name
     * @param organizationId organization ID
     * @param revision service revision
     * @param serviceTier serviceTier
     */
    @ApiStatus.Internal
    public ServiceRegistry(String description, UUID id, String name, String organizationId, String revision, ServiceRegistryTier serviceTier) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.organizationId = organizationId;
        this.revision = revision;
        this.serviceTier = serviceTier;
    }

}
