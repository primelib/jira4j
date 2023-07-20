package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContainerForProjectFeatures
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "features"
})
@JsonTypeName("ContainerForProjectFeatures")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContainerForProjectFeatures {

    /**
     * Constructs a validated implementation of {@link ContainerForProjectFeatures}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ContainerForProjectFeatures(Consumer<ContainerForProjectFeatures> spec) {
        spec.accept(this);
    }

    /**
     * The project features.
     */
    @JsonProperty("features")
    protected List<ProjectFeature> features;


}
