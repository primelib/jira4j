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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomFieldContextDefaultValueMultiUserPicker
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
@JsonTypeName("CustomFieldContextDefaultValueMultiUserPicker")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValueMultiUserPicker {

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
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueMultiUserPicker}.
     *
     * @param spec the specification to process
     */
    public CustomFieldContextDefaultValueMultiUserPicker(Consumer<CustomFieldContextDefaultValueMultiUserPicker> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueMultiUserPicker}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldContextDefaultValueMultiUserPicker(Consumer)} instead.
     * @param accountIds The IDs of the default users.
     * @param contextId The ID of the context.
     * @param type type
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValueMultiUserPicker(List<String> accountIds, String contextId, String type) {
        this.accountIds = accountIds;
        this.contextId = contextId;
        this.type = type;
    }

}
