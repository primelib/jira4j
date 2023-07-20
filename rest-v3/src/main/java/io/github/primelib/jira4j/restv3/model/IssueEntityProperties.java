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
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueEntityProperties
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "entitiesIds",
    "properties"
})
@JsonTypeName("IssueEntityProperties")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueEntityProperties {

    /**
     * Constructs a validated implementation of {@link IssueEntityProperties}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueEntityProperties(Consumer<IssueEntityProperties> spec) {
        spec.accept(this);
    }

    /**
     * A list of entity property IDs.
     */
    @JsonProperty("entitiesIds")
    protected Set<Long> entitiesIds;

    /**
     * A list of entity property keys and values.
     */
    @JsonProperty("properties")
    protected Map<String, JsonNode> properties = new HashMap<>();


}
