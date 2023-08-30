package io.github.primelib.jira4j.restv2.model;

import java.util.Map;
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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ActorsMap
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
    "group",
    "groupId",
    "user"
})
@JsonTypeName("ActorsMap")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ActorsMap {

    /**
     * The name of the group to add. This parameter cannot be used with the {@code groupId} parameter. As a group's name can change, use of {@code groupId} is recommended.
     */
    @JsonProperty("group")
    protected List<String> group;

    /**
     * The ID of the group to add. This parameter cannot be used with the {@code group} parameter.
     */
    @JsonProperty("groupId")
    protected List<String> groupId;

    /**
     * The user account ID of the user to add.
     */
    @JsonProperty("user")
    protected List<String> user;

    /**
     * Constructs a validated instance of {@link ActorsMap}.
     *
     * @param spec the specification to process
     */
    public ActorsMap(Consumer<ActorsMap> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ActorsMap}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ActorsMap(Consumer)} instead.
     * @param group The name of the group to add. This parameter cannot be used with the {@code groupId} parameter. As a group's name can change, use of {@code groupId} is recommended.
     * @param groupId The ID of the group to add. This parameter cannot be used with the {@code group} parameter.
     * @param user The user account ID of the user to add.
     */
    @ApiStatus.Internal
    public ActorsMap(List<String> group, List<String> groupId, List<String> user) {
        this.group = group;
        this.groupId = groupId;
        this.user = user;
    }

}
