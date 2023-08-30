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
 * CustomFieldContextDefaultValueSingleGroupPicker
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
    "groupId",
    "type"
})
@JsonTypeName("CustomFieldContextDefaultValueSingleGroupPicker")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValueSingleGroupPicker {

    /**
     * The ID of the context.
     */
    @JsonProperty("contextId")
    protected String contextId;

    /**
     * The ID of the the default group.
     */
    @JsonProperty("groupId")
    protected String groupId;

    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueSingleGroupPicker}.
     *
     * @param spec the specification to process
     */
    public CustomFieldContextDefaultValueSingleGroupPicker(Consumer<CustomFieldContextDefaultValueSingleGroupPicker> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueSingleGroupPicker}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldContextDefaultValueSingleGroupPicker(Consumer)} instead.
     * @param contextId The ID of the context.
     * @param groupId The ID of the the default group.
     * @param type type
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValueSingleGroupPicker(String contextId, String groupId, String type) {
        this.contextId = contextId;
        this.groupId = groupId;
        this.type = type;
    }

}
