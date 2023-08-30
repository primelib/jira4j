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
 * LinkIssueRequestJsonBean
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
    "comment",
    "inwardIssue",
    "outwardIssue",
    "type"
})
@JsonTypeName("LinkIssueRequestJsonBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LinkIssueRequestJsonBean {

    @JsonProperty("comment")
    protected Comment comment;

    @JsonProperty("inwardIssue")
    protected LinkedIssue inwardIssue;

    @JsonProperty("outwardIssue")
    protected LinkedIssue outwardIssue;

    @JsonProperty("type")
    protected IssueLinkType type;

    /**
     * Constructs a validated instance of {@link LinkIssueRequestJsonBean}.
     *
     * @param spec the specification to process
     */
    public LinkIssueRequestJsonBean(Consumer<LinkIssueRequestJsonBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link LinkIssueRequestJsonBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #LinkIssueRequestJsonBean(Consumer)} instead.
     * @param comment comment
     * @param inwardIssue inwardIssue
     * @param outwardIssue outwardIssue
     * @param type type
     */
    @ApiStatus.Internal
    public LinkIssueRequestJsonBean(Comment comment, LinkedIssue inwardIssue, LinkedIssue outwardIssue, IssueLinkType type) {
        this.comment = comment;
        this.inwardIssue = inwardIssue;
        this.outwardIssue = outwardIssue;
        this.type = type;
    }

}
