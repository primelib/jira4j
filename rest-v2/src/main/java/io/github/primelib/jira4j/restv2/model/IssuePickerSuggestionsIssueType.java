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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssuePickerSuggestionsIssueType
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
    "issues",
    "label",
    "msg",
    "sub"
})
@JsonTypeName("IssuePickerSuggestionsIssueType")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssuePickerSuggestionsIssueType {

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

    /**
     * Constructs a validated instance of {@link IssuePickerSuggestionsIssueType}.
     *
     * @param spec the specification to process
     */
    public IssuePickerSuggestionsIssueType(Consumer<IssuePickerSuggestionsIssueType> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssuePickerSuggestionsIssueType}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssuePickerSuggestionsIssueType(Consumer)} instead.
     * @param id The ID of the type of issues suggested for use in auto-completion.
     * @param issues A list of issues suggested for use in auto-completion.
     * @param label The label of the type of issues suggested for use in auto-completion.
     * @param msg If no issue suggestions are found, returns a message indicating no suggestions were found,
     * @param sub If issue suggestions are found, returns a message indicating the number of issues suggestions found and returned.
     */
    @ApiStatus.Internal
    public IssuePickerSuggestionsIssueType(String id, List<SuggestedIssue> issues, String label, String msg, String sub) {
        this.id = id;
        this.issues = issues;
        this.label = label;
        this.msg = msg;
        this.sub = sub;
    }

}
