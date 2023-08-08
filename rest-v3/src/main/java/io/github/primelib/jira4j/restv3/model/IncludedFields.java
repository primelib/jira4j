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
 * IncludedFields
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
    "actuallyIncluded",
    "excluded",
    "included"
})
@JsonTypeName("IncludedFields")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncludedFields {

    @JsonProperty("actuallyIncluded")
    protected Set<String> actuallyIncluded;

    @JsonProperty("excluded")
    protected Set<String> excluded;

    @JsonProperty("included")
    protected Set<String> included;

    /**
     * Constructs a validated instance of {@link IncludedFields}.
     *
     * @param spec the specification to process
     */
    public IncludedFields(Consumer<IncludedFields> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IncludedFields}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IncludedFields(Consumer)} instead.
     * @param actuallyIncluded actuallyIncluded
     * @param excluded excluded
     * @param included included
     */
    @ApiStatus.Internal
    public IncludedFields(Set<String> actuallyIncluded, Set<String> excluded, Set<String> included) {
        this.actuallyIncluded = actuallyIncluded;
        this.excluded = excluded;
        this.included = included;
    }

}
