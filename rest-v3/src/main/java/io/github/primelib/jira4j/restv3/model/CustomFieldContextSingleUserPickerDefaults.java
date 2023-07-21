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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomFieldContextSingleUserPickerDefaults
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
    "accountId",
    "contextId",
    "type",
    "userFilter"
})
@JsonTypeName("CustomFieldContextSingleUserPickerDefaults")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextSingleUserPickerDefaults {

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

    /**
     * Constructs a validated instance of {@link CustomFieldContextSingleUserPickerDefaults}.
     *
     * @param spec the specification to process
     */
    public CustomFieldContextSingleUserPickerDefaults(Consumer<CustomFieldContextSingleUserPickerDefaults> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldContextSingleUserPickerDefaults}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldContextSingleUserPickerDefaults(Consumer)} instead.
     * @param accountId The ID of the default user.
     * @param contextId The ID of the context.
     * @param type var.name
     * @param userFilter var.name
     */
    @ApiStatus.Internal
    public CustomFieldContextSingleUserPickerDefaults(String accountId, String contextId, String type, UserFilter userFilter) {
        this.accountId = accountId;
        this.contextId = contextId;
        this.type = type;
        this.userFilter = userFilter;
    }

}
