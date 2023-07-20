package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConnectModules
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "modules"
})
@JsonTypeName("ConnectModules")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ConnectModules {

    /**
     * Constructs a validated implementation of {@link ConnectModules}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ConnectModules(Consumer<ConnectModules> spec) {
        spec.accept(this);
    }

    /**
     * A list of app modules in the same format as the `modules` property in the [app descriptor](https://developer.atlassian.com/cloud/jira/platform/app-descriptor/).
     */
    @JsonProperty("modules")
    protected List<Object> modules = new ArrayList<>();


}
