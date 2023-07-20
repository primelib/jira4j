package io.github.primelib.jira4j.restv2.model;

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
 * UserContextVariable
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "accountId",
    "type"
})
@JsonTypeName("UserContextVariable")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UserContextVariable {

    /**
     * Constructs a validated implementation of {@link UserContextVariable}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UserContextVariable(Consumer<UserContextVariable> spec) {
        spec.accept(this);
    }

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


}
