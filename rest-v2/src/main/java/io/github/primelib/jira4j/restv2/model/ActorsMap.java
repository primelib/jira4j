package io.github.primelib.jira4j.restv2.model;

import java.util.Map;
import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ActorsMap
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "group",
    "groupId",
    "user"
})
@JsonTypeName("ActorsMap")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ActorsMap {

    /**
     * Constructs a validated implementation of {@link ActorsMap}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ActorsMap(Consumer<ActorsMap> spec) {
        spec.accept(this);
    }

    /**
     * The name of the group to add. This parameter cannot be used with the `groupId` parameter. As a group's name can change, use of `groupId` is recommended.
     */
    @JsonProperty("group")
    protected List<String> group;

    /**
     * The ID of the group to add. This parameter cannot be used with the `group` parameter.
     */
    @JsonProperty("groupId")
    protected List<String> groupId;

    /**
     * The user account ID of the user to add.
     */
    @JsonProperty("user")
    protected List<String> user;


}
