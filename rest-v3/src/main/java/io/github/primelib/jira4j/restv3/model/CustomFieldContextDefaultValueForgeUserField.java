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
 * CustomFieldContextDefaultValueForgeUserField
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "accountId",
    "contextId",
    "type",
    "userFilter"
})
@JsonTypeName("CustomFieldContextDefaultValueForgeUserField")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValueForgeUserField {

    /**
     * Constructs a validated implementation of {@link CustomFieldContextDefaultValueForgeUserField}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValueForgeUserField(Consumer<CustomFieldContextDefaultValueForgeUserField> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the default user.
     */
    @JsonProperty("accountId")
    protected String accountId;

    /**
     * The ID of the context.
     */
    @JsonProperty("contextId")
    protected String contextId;

    @JsonProperty("type")
    protected String type;

    @JsonProperty("userFilter")
    protected UserFilter userFilter;


}
