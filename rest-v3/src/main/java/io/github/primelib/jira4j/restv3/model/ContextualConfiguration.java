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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContextualConfiguration
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
    "configuration",
    "fieldContextId",
    "id",
    "schema"
})
@JsonTypeName("ContextualConfiguration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ContextualConfiguration {

    /**
     * The field configuration.
     */
    @JsonProperty("configuration")
    protected Object configuration;

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
    protected Object schema;

    /**
     * Constructs a validated instance of {@link ContextualConfiguration}.
     *
     * @param spec the specification to process
     */
    public ContextualConfiguration(Consumer<ContextualConfiguration> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ContextualConfiguration}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ContextualConfiguration(Consumer)} instead.
     * @param configuration The field configuration.
     * @param fieldContextId The ID of the field context the configuration is associated with.
     * @param id The ID of the configuration.
     * @param schema The field value schema.
     */
    @ApiStatus.Internal
    public ContextualConfiguration(Object configuration, String fieldContextId, String id, Object schema) {
        this.configuration = configuration;
        this.fieldContextId = fieldContextId;
        this.id = id;
        this.schema = schema;
    }

}
