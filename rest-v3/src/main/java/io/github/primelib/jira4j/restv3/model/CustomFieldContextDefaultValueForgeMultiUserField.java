package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomFieldContextDefaultValueForgeMultiUserField
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "accountIds",
    "contextId",
    "type"
})
@JsonTypeName("CustomFieldContextDefaultValueForgeMultiUserField")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValueForgeMultiUserField {

    /**
     * Constructs a validated implementation of {@link CustomFieldContextDefaultValueForgeMultiUserField}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValueForgeMultiUserField(Consumer<CustomFieldContextDefaultValueForgeMultiUserField> spec) {
        spec.accept(this);
    }

    /**
     * The IDs of the default users.
     */
    @JsonProperty("accountIds")
    protected List<String> accountIds = new ArrayList<>();

    /**
     * The ID of the context.
     */
    @JsonProperty("contextId")
    protected String contextId;

    @JsonProperty("type")
    protected String type;


}
