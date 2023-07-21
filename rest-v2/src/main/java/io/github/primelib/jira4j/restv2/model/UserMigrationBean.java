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
 * UserMigrationBean
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
    "key",
    "username"
})
@JsonTypeName("UserMigrationBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UserMigrationBean {

    @JsonProperty("accountId")
    protected String accountId;

    @JsonProperty("key")
    protected String key;

    @JsonProperty("username")
    protected String username;

    /**
     * Constructs a validated instance of {@link UserMigrationBean}.
     *
     * @param spec the specification to process
     */
    public UserMigrationBean(Consumer<UserMigrationBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UserMigrationBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UserMigrationBean(Consumer)} instead.
     * @param accountId var.name
     * @param key var.name
     * @param username var.name
     */
    @ApiStatus.Internal
    public UserMigrationBean(String accountId, String key, String username) {
        this.accountId = accountId;
        this.key = key;
        this.username = username;
    }

}
