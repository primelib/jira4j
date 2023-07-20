package io.github.primelib.jira4j.restv2.model;

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
 * IssueEvent
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "name"
})
@JsonTypeName("IssueEvent")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueEvent {

    /**
     * Constructs a validated implementation of {@link IssueEvent}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueEvent(Consumer<IssueEvent> spec) {
        spec.accept(this);
    }

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


}
