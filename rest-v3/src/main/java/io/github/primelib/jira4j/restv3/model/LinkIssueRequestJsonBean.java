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
 * LinkIssueRequestJsonBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "comment",
    "inwardIssue",
    "outwardIssue",
    "type"
})
@JsonTypeName("LinkIssueRequestJsonBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LinkIssueRequestJsonBean {

    /**
     * Constructs a validated implementation of {@link LinkIssueRequestJsonBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public LinkIssueRequestJsonBean(Consumer<LinkIssueRequestJsonBean> spec) {
        spec.accept(this);
    }

    @JsonProperty("comment")
    protected Comment comment;

    @JsonProperty("inwardIssue")
    protected LinkedIssue inwardIssue;

    @JsonProperty("outwardIssue")
    protected LinkedIssue outwardIssue;

    @JsonProperty("type")
    protected IssueLinkType type;


}
