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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomFieldConfigurations
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
    "configurations"
})
@JsonTypeName("CustomFieldConfigurations")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldConfigurations {

    /**
     * The list of custom field configuration details.
     */
    @JsonProperty("configurations")
    protected Set<ContextualConfiguration> configurations;

    /**
     * Constructs a validated instance of {@link CustomFieldConfigurations}.
     *
     * @param spec the specification to process
     */
    public CustomFieldConfigurations(Consumer<CustomFieldConfigurations> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldConfigurations}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldConfigurations(Consumer)} instead.
     * @param configurations The list of custom field configuration details.
     */
    @ApiStatus.Internal
    public CustomFieldConfigurations(Set<ContextualConfiguration> configurations) {
        this.configurations = configurations;
    }

}
