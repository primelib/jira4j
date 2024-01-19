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
 * Errors
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
    "issueIsSubtask",
    "issuesInArchivedProjects",
    "issuesInUnlicensedProjects",
    "issuesNotFound"
})
@JsonTypeName("Errors")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Errors {

    @JsonProperty("issueIsSubtask")
    protected Error issueIsSubtask;

    @JsonProperty("issuesInArchivedProjects")
    protected Error issuesInArchivedProjects;

    @JsonProperty("issuesInUnlicensedProjects")
    protected Error issuesInUnlicensedProjects;

    @JsonProperty("issuesNotFound")
    protected Error issuesNotFound;

    /**
     * Constructs a validated instance of {@link Errors}.
     *
     * @param spec the specification to process
     */
    public Errors(Consumer<Errors> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Errors}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Errors(Consumer)} instead.
     * @param issueIsSubtask issueIsSubtask
     * @param issuesInArchivedProjects issuesInArchivedProjects
     * @param issuesInUnlicensedProjects issuesInUnlicensedProjects
     * @param issuesNotFound issuesNotFound
     */
    @ApiStatus.Internal
    public Errors(Error issueIsSubtask, Error issuesInArchivedProjects, Error issuesInUnlicensedProjects, Error issuesNotFound) {
        this.issueIsSubtask = issueIsSubtask;
        this.issuesInArchivedProjects = issuesInArchivedProjects;
        this.issuesInUnlicensedProjects = issuesInUnlicensedProjects;
        this.issuesNotFound = issuesNotFound;
    }

}
