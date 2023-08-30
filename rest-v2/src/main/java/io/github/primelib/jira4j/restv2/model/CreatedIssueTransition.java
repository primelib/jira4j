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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreatedIssueTransition
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
    "errorCollection",
    "status",
    "warningCollection"
})
@JsonTypeName("CreatedIssue_transition")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreatedIssueTransition {

    @JsonProperty("errorCollection")
    protected ErrorCollection errorCollection;

    @JsonProperty("status")
    protected Integer status;

    @JsonProperty("warningCollection")
    protected WarningCollection warningCollection;

    /**
     * Constructs a validated instance of {@link CreatedIssueTransition}.
     *
     * @param spec the specification to process
     */
    public CreatedIssueTransition(Consumer<CreatedIssueTransition> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreatedIssueTransition}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreatedIssueTransition(Consumer)} instead.
     * @param errorCollection errorCollection
     * @param status status
     * @param warningCollection warningCollection
     */
    @ApiStatus.Internal
    public CreatedIssueTransition(ErrorCollection errorCollection, Integer status, WarningCollection warningCollection) {
        this.errorCollection = errorCollection;
        this.status = status;
        this.warningCollection = warningCollection;
    }

}
