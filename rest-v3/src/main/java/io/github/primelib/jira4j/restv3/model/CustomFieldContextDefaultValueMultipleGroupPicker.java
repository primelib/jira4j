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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomFieldContextDefaultValueMultipleGroupPicker
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
    "groupIds",
    "type"
})
@JsonTypeName("CustomFieldContextDefaultValueMultipleGroupPicker")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValueMultipleGroupPicker {

    /**
     * The ID of the context.
     */
    @JsonProperty("contextId")
    protected String contextId;

    /**
     * The IDs of the default groups.
     */
    @JsonProperty("groupIds")
    protected Set<String> groupIds;

    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueMultipleGroupPicker}.
     *
     * @param spec the specification to process
     */
    public CustomFieldContextDefaultValueMultipleGroupPicker(Consumer<CustomFieldContextDefaultValueMultipleGroupPicker> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueMultipleGroupPicker}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldContextDefaultValueMultipleGroupPicker(Consumer)} instead.
     * @param contextId The ID of the context.
     * @param groupIds The IDs of the default groups.
     * @param type type
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValueMultipleGroupPicker(String contextId, Set<String> groupIds, String type) {
        this.contextId = contextId;
        this.groupIds = groupIds;
        this.type = type;
    }

}
