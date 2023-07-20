package io.github.primelib.jira4j.restv3.model;

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
 * ActorInputBean
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
@JsonTypeName("ActorInputBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ActorInputBean {

    /**
     * Constructs a validated implementation of {@link ActorInputBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ActorInputBean(Consumer<ActorInputBean> spec) {
        spec.accept(this);
    }

    /**
     * The name of the group to add as a default actor. This parameter cannot be used with the `groupId` parameter. As a group's name can change,use of `groupId` is recommended. This parameter accepts a comma-separated list. For example, `"group":["project-admin", "jira-developers"]`.
     */
    @JsonProperty("group")
    protected List<String> group;

    /**
     * The ID of the group to add as a default actor. This parameter cannot be used with the `group` parameter This parameter accepts a comma-separated list. For example, `"groupId":["77f6ab39-e755-4570-a6ae-2d7a8df0bcb8", "0c011f85-69ed-49c4-a801-3b18d0f771bc"]`.
     */
    @JsonProperty("groupId")
    protected List<String> groupId;

    /**
     * The account IDs of the users to add as default actors. This parameter accepts a comma-separated list. For example, `"user":["5b10a2844c20165700ede21g", "5b109f2e9729b51b54dc274d"]`.
     */
    @JsonProperty("user")
    protected List<String> user;


}
