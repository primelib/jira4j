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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueEntityPropertiesForMultiUpdate
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
    "issueID",
    "properties"
})
@JsonTypeName("IssueEntityPropertiesForMultiUpdate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueEntityPropertiesForMultiUpdate {

    /**
     * The ID of the issue.
     */
    @JsonProperty("issueID")
    protected Long issueID;

    /**
     * Entity properties to set on the issue. The maximum length of an issue property value is 32768 characters.
     */
    @JsonProperty("properties")
    protected Map<String, JsonNode> properties;

    /**
     * Constructs a validated instance of {@link IssueEntityPropertiesForMultiUpdate}.
     *
     * @param spec the specification to process
     */
    public IssueEntityPropertiesForMultiUpdate(Consumer<IssueEntityPropertiesForMultiUpdate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueEntityPropertiesForMultiUpdate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueEntityPropertiesForMultiUpdate(Consumer)} instead.
     * @param issueID The ID of the issue.
     * @param properties Entity properties to set on the issue. The maximum length of an issue property value is 32768 characters.
     */
    @ApiStatus.Internal
    public IssueEntityPropertiesForMultiUpdate(Long issueID, Map<String, JsonNode> properties) {
        this.issueID = issueID;
        this.properties = properties;
    }

}
