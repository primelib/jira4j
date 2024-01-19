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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomFieldContextDefaultValueURL
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
    "type",
    "url"
})
@JsonTypeName("CustomFieldContextDefaultValueURL")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValueURL {

    /**
     * The ID of the context.
     */
    @JsonProperty("contextId")
    protected String contextId;

    @JsonProperty("type")
    protected String type;

    /**
     * The default URL.
     */
    @JsonProperty("url")
    protected String url;

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueURL}.
     *
     * @param spec the specification to process
     */
    public CustomFieldContextDefaultValueURL(Consumer<CustomFieldContextDefaultValueURL> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueURL}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldContextDefaultValueURL(Consumer)} instead.
     * @param contextId The ID of the context.
     * @param type type
     * @param url The default URL.
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValueURL(String contextId, String type, String url) {
        this.contextId = contextId;
        this.type = type;
        this.url = url;
    }

}
