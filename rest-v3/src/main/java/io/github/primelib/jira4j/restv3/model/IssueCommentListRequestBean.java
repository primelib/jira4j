package io.github.primelib.jira4j.restv3.model;

import java.util.List;
import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueCommentListRequestBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "ids"
})
@JsonTypeName("IssueCommentListRequestBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueCommentListRequestBean {

    /**
     * Constructs a validated implementation of {@link IssueCommentListRequestBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueCommentListRequestBean(Consumer<IssueCommentListRequestBean> spec) {
        spec.accept(this);
    }

    /**
     * The list of comment IDs. A maximum of 1000 IDs can be specified.
     */
    @JsonProperty("ids")
    protected Set<Long> ids = new LinkedHashSet<>();


}
