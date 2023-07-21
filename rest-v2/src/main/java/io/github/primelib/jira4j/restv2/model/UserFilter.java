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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserFilter
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
    "enabled",
    "groups",
    "roleIds"
})
@JsonTypeName("UserFilter")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UserFilter {

    /**
     * Whether the filter is enabled.
     */
    @JsonProperty("enabled")
    protected Boolean enabled;

    /**
     * User groups autocomplete suggestion users must belong to. If not provided, the default values are used. A maximum of 10 groups can be provided.
     */
    @JsonProperty("groups")
    protected Set<String> groups;

    /**
     * Roles that autocomplete suggestion users must belong to. If not provided, the default values are used. A maximum of 10 roles can be provided.
     */
    @JsonProperty("roleIds")
    protected Set<Long> roleIds;

    /**
     * Constructs a validated instance of {@link UserFilter}.
     *
     * @param spec the specification to process
     */
    public UserFilter(Consumer<UserFilter> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UserFilter}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UserFilter(Consumer)} instead.
     * @param enabled Whether the filter is enabled.
     * @param groups User groups autocomplete suggestion users must belong to. If not provided, the default values are used. A maximum of 10 groups can be provided.
     * @param roleIds Roles that autocomplete suggestion users must belong to. If not provided, the default values are used. A maximum of 10 roles can be provided.
     */
    @ApiStatus.Internal
    public UserFilter(Boolean enabled, Set<String> groups, Set<Long> roleIds) {
        this.enabled = enabled;
        this.groups = groups;
        this.roleIds = roleIds;
    }

}
