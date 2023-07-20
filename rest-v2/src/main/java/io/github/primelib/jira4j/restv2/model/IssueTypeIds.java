package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueTypeIds
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "issueTypeIds"
})
@JsonTypeName("IssueTypeIds")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeIds {

    /**
     * Constructs a validated implementation of {@link IssueTypeIds}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueTypeIds(Consumer<IssueTypeIds> spec) {
        spec.accept(this);
    }

    /**
     * The list of issue type IDs.
     */
    @JsonProperty("issueTypeIds")
    protected List<String> issueTypeIds = new ArrayList<>();


}
