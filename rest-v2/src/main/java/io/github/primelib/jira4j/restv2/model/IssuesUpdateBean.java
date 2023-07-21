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
 * IssuesUpdateBean
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
    "issueUpdates"
})
@JsonTypeName("IssuesUpdateBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssuesUpdateBean {

    @JsonProperty("issueUpdates")
    protected List<IssueUpdateDetails> issueUpdates;

    /**
     * Constructs a validated instance of {@link IssuesUpdateBean}.
     *
     * @param spec the specification to process
     */
    public IssuesUpdateBean(Consumer<IssuesUpdateBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssuesUpdateBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssuesUpdateBean(Consumer)} instead.
     * @param issueUpdates var.name
     */
    @ApiStatus.Internal
    public IssuesUpdateBean(List<IssueUpdateDetails> issueUpdates) {
        this.issueUpdates = issueUpdates;
    }

}
