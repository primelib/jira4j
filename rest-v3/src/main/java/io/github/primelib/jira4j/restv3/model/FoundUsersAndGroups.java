package io.github.primelib.jira4j.restv3.model;

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
 * FoundUsersAndGroups
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "groups",
    "users"
})
@JsonTypeName("FoundUsersAndGroups")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FoundUsersAndGroups {

    /**
     * Constructs a validated implementation of {@link FoundUsersAndGroups}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FoundUsersAndGroups(Consumer<FoundUsersAndGroups> spec) {
        spec.accept(this);
    }

    @JsonProperty("groups")
    protected FoundGroups groups;

    @JsonProperty("users")
    protected FoundUsers users;


}
