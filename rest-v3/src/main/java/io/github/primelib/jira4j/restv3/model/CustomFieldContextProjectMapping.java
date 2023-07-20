package io.github.primelib.jira4j.restv3.model;

import java.util.Map;
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
 * CustomFieldContextProjectMapping
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "contextId",
    "isGlobalContext",
    "projectId"
})
@JsonTypeName("CustomFieldContextProjectMapping")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextProjectMapping {

    /**
     * Constructs a validated implementation of {@link CustomFieldContextProjectMapping}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomFieldContextProjectMapping(Consumer<CustomFieldContextProjectMapping> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the context.
     */
    @JsonProperty("contextId")
    protected String contextId;

    /**
     * Whether context is global.
     */
    @JsonProperty("isGlobalContext")
    protected Boolean isGlobalContext;

    /**
     * The ID of the project.
     */
    @JsonProperty("projectId")
    protected String projectId;


}
