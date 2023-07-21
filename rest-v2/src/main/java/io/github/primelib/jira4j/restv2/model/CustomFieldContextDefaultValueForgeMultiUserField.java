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
 * CustomFieldContextDefaultValueForgeMultiUserField
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
    "accountIds",
    "contextId",
    "type"
})
@JsonTypeName("CustomFieldContextDefaultValueForgeMultiUserField")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValueForgeMultiUserField {

    /**
     * The IDs of the default users.
     */
    @JsonProperty("accountIds")
    protected List<String> accountIds;

    /**
     * The ID of the context.
     */
    @JsonProperty("contextId")
    protected String contextId;

    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueForgeMultiUserField}.
     *
     * @param spec the specification to process
     */
    public CustomFieldContextDefaultValueForgeMultiUserField(Consumer<CustomFieldContextDefaultValueForgeMultiUserField> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueForgeMultiUserField}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldContextDefaultValueForgeMultiUserField(Consumer)} instead.
     * @param accountIds The IDs of the default users.
     * @param contextId The ID of the context.
     * @param type var.name
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValueForgeMultiUserField(List<String> accountIds, String contextId, String type) {
        this.accountIds = accountIds;
        this.contextId = contextId;
        this.type = type;
    }

}
