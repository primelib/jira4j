package io.github.primelib.jira4j.restv3.model;

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
 * ContextualConfiguration
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "configuration",
    "fieldContextId",
    "id",
    "schema"
})
@JsonTypeName("ContextualConfiguration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContextualConfiguration {

    /**
     * Constructs a validated implementation of {@link ContextualConfiguration}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ContextualConfiguration(Consumer<ContextualConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * The field configuration.
     */
    @JsonProperty("configuration")
    protected Object _configuration = null;

    /**
     * The ID of the field context the configuration is associated with.
     */
    @JsonProperty("fieldContextId")
    protected String fieldContextId;

    /**
     * The ID of the configuration.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The field value schema.
     */
    @JsonProperty("schema")
    protected Object schema = null;


}
