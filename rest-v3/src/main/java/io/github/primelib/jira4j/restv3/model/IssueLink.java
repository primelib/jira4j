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

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueLink
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
    "inwardIssue",
    "outwardIssue",
    "self",
    "type"
})
@JsonTypeName("IssueLink")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueLink {

    /**
     * The ID of the issue link.
     */
    @JsonProperty("id")
    protected String id;

    @JsonProperty("inwardIssue")
    protected LinkedIssue inwardIssue;

    @JsonProperty("outwardIssue")
    protected LinkedIssue outwardIssue;

    /**
     * The URL of the issue link.
     */
    @JsonProperty("self")
    protected URI self;

    @JsonProperty("type")
    protected IssueLinkType type;

    /**
     * Constructs a validated instance of {@link IssueLink}.
     *
     * @param spec the specification to process
     */
    public IssueLink(Consumer<IssueLink> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueLink}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueLink(Consumer)} instead.
     * @param id The ID of the issue link.
     * @param inwardIssue inwardIssue
     * @param outwardIssue outwardIssue
     * @param self The URL of the issue link.
     * @param type type
     */
    @ApiStatus.Internal
    public IssueLink(String id, LinkedIssue inwardIssue, LinkedIssue outwardIssue, URI self, IssueLinkType type) {
        this.id = id;
        this.inwardIssue = inwardIssue;
        this.outwardIssue = outwardIssue;
        this.self = self;
        this.type = type;
    }

}
