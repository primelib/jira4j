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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomFieldContextDefaultValueMultipleOption
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
    "optionIds",
    "type"
})
@JsonTypeName("CustomFieldContextDefaultValueMultipleOption")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValueMultipleOption {

    /**
     * The ID of the context.
     */
    @JsonProperty("contextId")
    protected String contextId;

    /**
     * The list of IDs of the default options.
     */
    @JsonProperty("optionIds")
    protected List<String> optionIds;

    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueMultipleOption}.
     *
     * @param spec the specification to process
     */
    public CustomFieldContextDefaultValueMultipleOption(Consumer<CustomFieldContextDefaultValueMultipleOption> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueMultipleOption}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldContextDefaultValueMultipleOption(Consumer)} instead.
     * @param contextId The ID of the context.
     * @param optionIds The list of IDs of the default options.
     * @param type type
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValueMultipleOption(String contextId, List<String> optionIds, String type) {
        this.contextId = contextId;
        this.optionIds = optionIds;
        this.type = type;
    }

}
