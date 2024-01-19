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
 * ChangeFilterOwner
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
    "accountId"
})
@JsonTypeName("ChangeFilterOwner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ChangeFilterOwner {

    /**
     * The account ID of the new owner.
     */
    @JsonProperty("accountId")
    protected String accountId;

    /**
     * Constructs a validated instance of {@link ChangeFilterOwner}.
     *
     * @param spec the specification to process
     */
    public ChangeFilterOwner(Consumer<ChangeFilterOwner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ChangeFilterOwner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ChangeFilterOwner(Consumer)} instead.
     * @param accountId The account ID of the new owner.
     */
    @ApiStatus.Internal
    public ChangeFilterOwner(String accountId) {
        this.accountId = accountId;
    }

}
