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
 * SuggestedIssue
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "img",
    "key",
    "keyHtml",
    "summary",
    "summaryText"
})
@JsonTypeName("SuggestedIssue")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SuggestedIssue {

    /**
     * Constructs a validated implementation of {@link SuggestedIssue}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SuggestedIssue(Consumer<SuggestedIssue> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the issue.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The URL of the issue type's avatar.
     */
    @JsonProperty("img")
    protected String img;

    /**
     * The key of the issue.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * The key of the issue in HTML format.
     */
    @JsonProperty("keyHtml")
    protected String keyHtml;

    /**
     * The phrase containing the query string in HTML format, with the string highlighted with HTML bold tags.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * The phrase containing the query string, as plain text.
     */
    @JsonProperty("summaryText")
    protected String summaryText;


}
