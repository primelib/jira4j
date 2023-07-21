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
 * UnrestrictedUserEmail
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
    "email"
})
@JsonTypeName("UnrestrictedUserEmail")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UnrestrictedUserEmail {

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

    /**
     * Constructs a validated instance of {@link UnrestrictedUserEmail}.
     *
     * @param spec the specification to process
     */
    public UnrestrictedUserEmail(Consumer<UnrestrictedUserEmail> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UnrestrictedUserEmail}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UnrestrictedUserEmail(Consumer)} instead.
     * @param accountId The accountId of the user
     * @param email The email of the user
     */
    @ApiStatus.Internal
    public UnrestrictedUserEmail(String accountId, String email) {
        this.accountId = accountId;
        this.email = email;
    }

}
