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
 * IssueLink
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link IssueLink}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueLink(Consumer<IssueLink> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the issue link.
     */
    @JsonProperty("id")
    protected String id;

    @JsonProperty("inwardIssue")
    protected IssueLinkInwardIssue inwardIssue;

    @JsonProperty("outwardIssue")
    protected IssueLinkOutwardIssue outwardIssue;

    /**
     * The URL of the issue link.
     */
    @JsonProperty("self")
    protected URI self;

    @JsonProperty("type")
    protected IssueLinkType type;


}
