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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ActorInputBean
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
@JsonTypeName("ActorInputBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ActorInputBean {

    /**
     * The name of the group to add as a default actor. This parameter cannot be used with the {@code groupId} parameter. As a group's name can change,use of {@code groupId} is recommended. This parameter accepts a comma-separated list. For example, {@code "group":["project-admin", "jira-developers"]}.
     */
    @JsonProperty("group")
    protected List<String> group;

    /**
     * The ID of the group to add as a default actor. This parameter cannot be used with the {@code group} parameter This parameter accepts a comma-separated list. For example, {@code "groupId":["77f6ab39-e755-4570-a6ae-2d7a8df0bcb8", "0c011f85-69ed-49c4-a801-3b18d0f771bc"]}.
     */
    @JsonProperty("groupId")
    protected List<String> groupId;

    /**
     * The account IDs of the users to add as default actors. This parameter accepts a comma-separated list. For example, {@code "user":["5b10a2844c20165700ede21g", "5b109f2e9729b51b54dc274d"]}.
     */
    @JsonProperty("user")
    protected List<String> user;

    /**
     * Constructs a validated instance of {@link ActorInputBean}.
     *
     * @param spec the specification to process
     */
    public ActorInputBean(Consumer<ActorInputBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ActorInputBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ActorInputBean(Consumer)} instead.
     * @param group The name of the group to add as a default actor. This parameter cannot be used with the {@code groupId} parameter. As a group's name can change,use of {@code groupId} is recommended. This parameter accepts a comma-separated list. For example, {@code "group":["project-admin", "jira-developers"]}.
     * @param groupId The ID of the group to add as a default actor. This parameter cannot be used with the {@code group} parameter This parameter accepts a comma-separated list. For example, {@code "groupId":["77f6ab39-e755-4570-a6ae-2d7a8df0bcb8", "0c011f85-69ed-49c4-a801-3b18d0f771bc"]}.
     * @param user The account IDs of the users to add as default actors. This parameter accepts a comma-separated list. For example, {@code "user":["5b10a2844c20165700ede21g", "5b109f2e9729b51b54dc274d"]}.
     */
    @ApiStatus.Internal
    public ActorInputBean(List<String> group, List<String> groupId, List<String> user) {
        this.group = group;
        this.groupId = groupId;
        this.user = user;
    }

}
