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
 * CreatedIssueTransition
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "errorCollection",
    "status",
    "warningCollection"
})
@JsonTypeName("CreatedIssue_transition")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreatedIssueTransition {

    /**
     * Constructs a validated implementation of {@link CreatedIssueTransition}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreatedIssueTransition(Consumer<CreatedIssueTransition> spec) {
        spec.accept(this);
    }

    @JsonProperty("errorCollection")
    protected ErrorCollection errorCollection;

    @JsonProperty("status")
    protected Integer status;

    @JsonProperty("warningCollection")
    protected WarningCollection warningCollection;


}
