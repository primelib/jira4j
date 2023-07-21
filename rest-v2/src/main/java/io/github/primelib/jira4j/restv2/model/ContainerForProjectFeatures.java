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
 * ContainerForProjectFeatures
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
    "features"
})
@JsonTypeName("ContainerForProjectFeatures")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContainerForProjectFeatures {

    /**
     * The project features.
     */
    @JsonProperty("features")
    protected List<ProjectFeature> features;

    /**
     * Constructs a validated instance of {@link ContainerForProjectFeatures}.
     *
     * @param spec the specification to process
     */
    public ContainerForProjectFeatures(Consumer<ContainerForProjectFeatures> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContainerForProjectFeatures}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContainerForProjectFeatures(Consumer)} instead.
     * @param features The project features.
     */
    @ApiStatus.Internal
    public ContainerForProjectFeatures(List<ProjectFeature> features) {
        this.features = features;
    }

}
