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
 * CreatedIssueWatchers
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
@JsonTypeName("CreatedIssue_watchers")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreatedIssueWatchers {

    @JsonProperty("errorCollection")
    protected ErrorCollection errorCollection;

    @JsonProperty("status")
    protected Integer status;

    @JsonProperty("warningCollection")
    protected WarningCollection warningCollection;

    /**
     * Constructs a validated instance of {@link CreatedIssueWatchers}.
     *
     * @param spec the specification to process
     */
    public CreatedIssueWatchers(Consumer<CreatedIssueWatchers> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreatedIssueWatchers}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreatedIssueWatchers(Consumer)} instead.
     * @param errorCollection var.name
     * @param status var.name
     * @param warningCollection var.name
     */
    @ApiStatus.Internal
    public CreatedIssueWatchers(ErrorCollection errorCollection, Integer status, WarningCollection warningCollection) {
        this.errorCollection = errorCollection;
        this.status = status;
        this.warningCollection = warningCollection;
    }

}
