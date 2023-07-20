package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssuesUpdateBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "issueUpdates"
})
@JsonTypeName("IssuesUpdateBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssuesUpdateBean extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link IssuesUpdateBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssuesUpdateBean(Consumer<IssuesUpdateBean> spec) {
        spec.accept(this);
    }

    @JsonProperty("issueUpdates")
    protected List<IssueUpdateDetails> issueUpdates;


}
