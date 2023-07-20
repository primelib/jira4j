package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IncludedFields
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "actuallyIncluded",
    "excluded",
    "included"
})
@JsonTypeName("IncludedFields")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IncludedFields {

    /**
     * Constructs a validated implementation of {@link IncludedFields}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IncludedFields(Consumer<IncludedFields> spec) {
        spec.accept(this);
    }

    @JsonProperty("actuallyIncluded")
    protected Set<String> actuallyIncluded;

    @JsonProperty("excluded")
    protected Set<String> excluded;

    @JsonProperty("included")
    protected Set<String> included;


}
