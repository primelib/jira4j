package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomFieldContextDefaultValueMultipleGroupPicker
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "contextId",
    "groupIds",
    "type"
})
@JsonTypeName("CustomFieldContextDefaultValueMultipleGroupPicker")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValueMultipleGroupPicker {

    /**
     * Constructs a validated implementation of {@link CustomFieldContextDefaultValueMultipleGroupPicker}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValueMultipleGroupPicker(Consumer<CustomFieldContextDefaultValueMultipleGroupPicker> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the context.
     */
    @JsonProperty("contextId")
    protected String contextId;

    /**
     * The IDs of the default groups.
     */
    @JsonProperty("groupIds")
    protected Set<String> groupIds = new LinkedHashSet<>();

    @JsonProperty("type")
    protected String type;


}
