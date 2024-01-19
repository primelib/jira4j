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
 * UserContextVariable
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
    "type"
})
@JsonTypeName("UserContextVariable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UserContextVariable {

    /**
     * The account ID of the user.
     */
    @JsonProperty("accountId")
    protected String accountId;

    /**
     * Type of custom context variable.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link UserContextVariable}.
     *
     * @param spec the specification to process
     */
    public UserContextVariable(Consumer<UserContextVariable> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UserContextVariable}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UserContextVariable(Consumer)} instead.
     * @param accountId The account ID of the user.
     * @param type Type of custom context variable.
     */
    @ApiStatus.Internal
    public UserContextVariable(String accountId, String type) {
        this.accountId = accountId;
        this.type = type;
    }

}
