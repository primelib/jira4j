package io.github.primelib.jira4j.restv3.model;

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
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueEntityProperties
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
    "entitiesIds",
    "properties"
})
@JsonTypeName("IssueEntityProperties")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueEntityProperties {

    /**
     * A list of entity property IDs.
     */
    @JsonProperty("entitiesIds")
    protected Set<Long> entitiesIds;

    /**
     * A list of entity property keys and values.
     */
    @JsonProperty("properties")
    protected Map<String, JsonNode> properties;

    /**
     * Constructs a validated instance of {@link IssueEntityProperties}.
     *
     * @param spec the specification to process
     */
    public IssueEntityProperties(Consumer<IssueEntityProperties> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueEntityProperties}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueEntityProperties(Consumer)} instead.
     * @param entitiesIds A list of entity property IDs.
     * @param properties A list of entity property keys and values.
     */
    @ApiStatus.Internal
    public IssueEntityProperties(Set<Long> entitiesIds, Map<String, JsonNode> properties) {
        this.entitiesIds = entitiesIds;
        this.properties = properties;
    }

}
