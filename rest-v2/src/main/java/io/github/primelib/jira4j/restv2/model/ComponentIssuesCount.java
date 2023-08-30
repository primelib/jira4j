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

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ComponentIssuesCount
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
    "issueCount",
    "self"
})
@JsonTypeName("ComponentIssuesCount")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ComponentIssuesCount {

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

    /**
     * Constructs a validated instance of {@link ComponentIssuesCount}.
     *
     * @param spec the specification to process
     */
    public ComponentIssuesCount(Consumer<ComponentIssuesCount> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ComponentIssuesCount}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ComponentIssuesCount(Consumer)} instead.
     * @param issueCount The count of issues assigned to a component.
     * @param self The URL for this count of issues for a component.
     */
    @ApiStatus.Internal
    public ComponentIssuesCount(Long issueCount, URI self) {
        this.issueCount = issueCount;
        this.self = self;
    }

}
