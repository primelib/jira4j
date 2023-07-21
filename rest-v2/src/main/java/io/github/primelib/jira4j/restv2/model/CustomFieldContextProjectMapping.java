package io.github.primelib.jira4j.restv2.model;

import java.util.Map;
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
 * CustomFieldContextProjectMapping
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
    "contextId",
    "isGlobalContext",
    "projectId"
})
@JsonTypeName("CustomFieldContextProjectMapping")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextProjectMapping {

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

    /**
     * Constructs a validated instance of {@link CustomFieldContextProjectMapping}.
     *
     * @param spec the specification to process
     */
    public CustomFieldContextProjectMapping(Consumer<CustomFieldContextProjectMapping> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldContextProjectMapping}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldContextProjectMapping(Consumer)} instead.
     * @param contextId The ID of the context.
     * @param isGlobalContext Whether context is global.
     * @param projectId The ID of the project.
     */
    @ApiStatus.Internal
    public CustomFieldContextProjectMapping(String contextId, Boolean isGlobalContext, String projectId) {
        this.contextId = contextId;
        this.isGlobalContext = isGlobalContext;
        this.projectId = projectId;
    }

}
