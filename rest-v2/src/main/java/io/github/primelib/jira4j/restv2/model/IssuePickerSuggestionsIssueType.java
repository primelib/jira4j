package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssuePickerSuggestionsIssueType
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "issues",
    "label",
    "msg",
    "sub"
})
@JsonTypeName("IssuePickerSuggestionsIssueType")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssuePickerSuggestionsIssueType {

    /**
     * Constructs a validated implementation of {@link IssuePickerSuggestionsIssueType}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssuePickerSuggestionsIssueType(Consumer<IssuePickerSuggestionsIssueType> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the type of issues suggested for use in auto-completion.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * A list of issues suggested for use in auto-completion.
     */
    @JsonProperty("issues")
    protected List<SuggestedIssue> issues;

    /**
     * The label of the type of issues suggested for use in auto-completion.
     */
    @JsonProperty("label")
    protected String label;

    /**
     * If no issue suggestions are found, returns a message indicating no suggestions were found,
     */
    @JsonProperty("msg")
    protected String msg;

    /**
     * If issue suggestions are found, returns a message indicating the number of issues suggestions found and returned.
     */
    @JsonProperty("sub")
    protected String sub;


}
