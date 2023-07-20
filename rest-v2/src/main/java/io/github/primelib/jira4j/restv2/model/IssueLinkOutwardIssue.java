package io.github.primelib.jira4j.restv2.model;

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
 * IssueLinkOutwardIssue
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "fields",
    "id",
    "key",
    "self"
})
@JsonTypeName("IssueLink_outwardIssue")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueLinkOutwardIssue {

    /**
     * Constructs a validated implementation of {@link IssueLinkOutwardIssue}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueLinkOutwardIssue(Consumer<IssueLinkOutwardIssue> spec) {
        spec.accept(this);
    }

    @JsonProperty("fields")
    protected LinkedIssueFields fields;

    /**
     * The ID of an issue. Required if `key` isn't provided.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The key of an issue. Required if `id` isn't provided.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * The URL of the issue.
     */
    @JsonProperty("self")
    protected URI self;


}
