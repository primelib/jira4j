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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueEvent
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
    "id",
    "name"
})
@JsonTypeName("IssueEvent")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueEvent {

    /**
     * The ID of the event.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The name of the event.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link IssueEvent}.
     *
     * @param spec the specification to process
     */
    public IssueEvent(Consumer<IssueEvent> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueEvent}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueEvent(Consumer)} instead.
     * @param id The ID of the event.
     * @param name The name of the event.
     */
    @ApiStatus.Internal
    public IssueEvent(Long id, String name) {
        this.id = id;
        this.name = name;
    }

}
