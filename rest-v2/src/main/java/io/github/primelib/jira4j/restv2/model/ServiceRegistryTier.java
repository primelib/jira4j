package io.github.primelib.jira4j.restv2.model;

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
 * ServiceRegistryTier
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
    "level",
    "name",
    "nameKey"
})
@JsonTypeName("ServiceRegistryTier")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ServiceRegistryTier {

    /**
     * tier description
     */
    @JsonProperty("description")
    protected String description;

    /**
     * tier ID
     */
    @JsonProperty("id")
    protected UUID id;

    /**
     * tier level
     */
    @JsonProperty("level")
    protected Integer level;

    /**
     * tier name
     */
    @JsonProperty("name")
    protected String name;

    /**
     * name key of the tier
     */
    @JsonProperty("nameKey")
    protected String nameKey;

    /**
     * Constructs a validated instance of {@link ServiceRegistryTier}.
     *
     * @param spec the specification to process
     */
    public ServiceRegistryTier(Consumer<ServiceRegistryTier> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ServiceRegistryTier}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ServiceRegistryTier(Consumer)} instead.
     * @param description tier description
     * @param id tier ID
     * @param level tier level
     * @param name tier name
     * @param nameKey name key of the tier
     */
    @ApiStatus.Internal
    public ServiceRegistryTier(String description, UUID id, Integer level, String name, String nameKey) {
        this.description = description;
        this.id = id;
        this.level = level;
        this.name = name;
        this.nameKey = nameKey;
    }

}
