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
 * CustomContextVariable
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
    "type",
    "accountId",
    "id",
    "key",
    "value"
})
@JsonTypeName("CustomContextVariable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomContextVariable {

    /**
     * Type of custom context variable.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * The account ID of the user.
     */
    @JsonProperty("accountId")
    protected String accountId;

    /**
     * The issue ID.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The issue key.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * A JSON object containing custom content.
     */
    @JsonProperty("value")
    protected Object value;

    /**
     * Constructs a validated instance of {@link CustomContextVariable}.
     *
     * @param spec the specification to process
     */
    public CustomContextVariable(Consumer<CustomContextVariable> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomContextVariable}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomContextVariable(Consumer)} instead.
     * @param type Type of custom context variable.
     * @param accountId The account ID of the user.
     * @param id The issue ID.
     * @param key The issue key.
     * @param value A JSON object containing custom content.
     */
    @ApiStatus.Internal
    public CustomContextVariable(String type, String accountId, Long id, String key, Object value) {
        this.type = type;
        this.accountId = accountId;
        this.id = id;
        this.key = key;
        this.value = value;
    }

}
