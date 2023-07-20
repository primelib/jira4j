package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ComponentIssuesCount
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "issueCount",
    "self"
})
@JsonTypeName("ComponentIssuesCount")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ComponentIssuesCount {

    /**
     * Constructs a validated implementation of {@link ComponentIssuesCount}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ComponentIssuesCount(Consumer<ComponentIssuesCount> spec) {
        spec.accept(this);
    }

    /**
     * The count of issues assigned to a component.
     */
    @JsonProperty("issueCount")
    protected Long issueCount;

    /**
     * The URL for this count of issues for a component.
     */
    @JsonProperty("self")
    protected URI self;


}
