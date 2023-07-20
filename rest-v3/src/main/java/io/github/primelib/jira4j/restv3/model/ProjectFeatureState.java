package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProjectFeatureState
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "state"
})
@JsonTypeName("ProjectFeatureState")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectFeatureState {

    /**
     * Constructs a validated implementation of {@link ProjectFeatureState}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ProjectFeatureState(Consumer<ProjectFeatureState> spec) {
        spec.accept(this);
    }

    /**
     * The feature state.
     */
    @JsonProperty("state")
    protected StateEnum state;


    /**
     * The feature state.
     */
    @AllArgsConstructor
    public enum StateEnum {
        ENABLED("ENABLED"),
        DISABLED("DISABLED"),
        COMING_SOON("COMING_SOON");

        private final String value;
    }

}
