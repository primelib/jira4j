package io.github.primelib.jira4j.restv3.model;

import java.util.List;
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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueCommentListRequestBean
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
    "ids"
})
@JsonTypeName("IssueCommentListRequestBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueCommentListRequestBean {

    /**
     * The list of comment IDs. A maximum of 1000 IDs can be specified.
     */
    @JsonProperty("ids")
    protected Set<Long> ids;

    /**
     * Constructs a validated instance of {@link IssueCommentListRequestBean}.
     *
     * @param spec the specification to process
     */
    public IssueCommentListRequestBean(Consumer<IssueCommentListRequestBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueCommentListRequestBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueCommentListRequestBean(Consumer)} instead.
     * @param ids The list of comment IDs. A maximum of 1000 IDs can be specified.
     */
    @ApiStatus.Internal
    public IssueCommentListRequestBean(Set<Long> ids) {
        this.ids = ids;
    }

}
