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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * License
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
    "applications"
})
@JsonTypeName("License")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class License {

    /**
     * The applications under this license.
     */
    @JsonProperty("applications")
    protected List<LicensedApplication> applications;

    /**
     * Constructs a validated instance of {@link License}.
     *
     * @param spec the specification to process
     */
    public License(Consumer<License> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link License}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #License(Consumer)} instead.
     * @param applications The applications under this license.
     */
    @ApiStatus.Internal
    public License(List<LicensedApplication> applications) {
        this.applications = applications;
    }

}
