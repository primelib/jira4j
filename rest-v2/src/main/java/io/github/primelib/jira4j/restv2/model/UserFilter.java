package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserFilter
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "enabled",
    "groups",
    "roleIds"
})
@JsonTypeName("UserFilter")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UserFilter {

    /**
     * Constructs a validated implementation of {@link UserFilter}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UserFilter(Consumer<UserFilter> spec) {
        spec.accept(this);
    }

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


}
