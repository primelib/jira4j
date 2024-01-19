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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConnectModules
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
    "modules"
})
@JsonTypeName("ConnectModules")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ConnectModules {

    /**
     * A list of app modules in the same format as the {@code modules} property in the [app descriptor](https://developer.atlassian.com/cloud/jira/platform/app-descriptor/).
     */
    @JsonProperty("modules")
    protected List<Object> modules;

    /**
     * Constructs a validated instance of {@link ConnectModules}.
     *
     * @param spec the specification to process
     */
    public ConnectModules(Consumer<ConnectModules> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ConnectModules}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ConnectModules(Consumer)} instead.
     * @param modules A list of app modules in the same format as the {@code modules} property in the [app descriptor](https://developer.atlassian.com/cloud/jira/platform/app-descriptor/).
     */
    @ApiStatus.Internal
    public ConnectModules(List<Object> modules) {
        this.modules = modules;
    }

}
