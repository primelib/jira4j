package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UnrestrictedUserEmail
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "accountId",
    "email"
})
@JsonTypeName("UnrestrictedUserEmail")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UnrestrictedUserEmail extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link UnrestrictedUserEmail}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UnrestrictedUserEmail(Consumer<UnrestrictedUserEmail> spec) {
        spec.accept(this);
    }

    /**
     * The accountId of the user
     */
    @JsonProperty("accountId")
    protected String accountId;

    /**
     * The email of the user
     */
    @JsonProperty("email")
    protected String email;


}
