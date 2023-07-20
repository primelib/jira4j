package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueEntityPropertiesForMultiUpdate
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "issueID",
    "properties"
})
@JsonTypeName("IssueEntityPropertiesForMultiUpdate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueEntityPropertiesForMultiUpdate {

    /**
     * Constructs a validated implementation of {@link IssueEntityPropertiesForMultiUpdate}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueEntityPropertiesForMultiUpdate(Consumer<IssueEntityPropertiesForMultiUpdate> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the issue.
     */
    @JsonProperty("issueID")
    protected Long issueID;

    /**
     * Entity properties to set on the issue. The maximum length of an issue property value is 32768 characters.
     */
    @JsonProperty("properties")
    protected Map<String, JsonNode> properties = new HashMap<>();


}
