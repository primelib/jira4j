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

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Group
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
    "expand",
    "groupId",
    "name",
    "self",
    "users"
})
@JsonTypeName("Group")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Group {

    /**
     * Expand options that include additional group details in the response.
     */
    @JsonProperty("expand")
    protected String expand;

    /**
     * The ID of the group, which uniquely identifies the group across all Atlassian products. For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*.
     */
    @JsonProperty("groupId")
    protected String groupId;

    /**
     * The name of group.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The URL for these group details.
     */
    @JsonProperty("self")
    protected URI self;

    @JsonProperty("users")
    protected GroupUsers users;

    /**
     * Constructs a validated instance of {@link Group}.
     *
     * @param spec the specification to process
     */
    public Group(Consumer<Group> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Group}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Group(Consumer)} instead.
     * @param expand Expand options that include additional group details in the response.
     * @param groupId The ID of the group, which uniquely identifies the group across all Atlassian products. For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*.
     * @param name The name of group.
     * @param self The URL for these group details.
     * @param users var.name
     */
    @ApiStatus.Internal
    public Group(String expand, String groupId, String name, URI self, GroupUsers users) {
        this.expand = expand;
        this.groupId = groupId;
        this.name = name;
        this.self = self;
        this.users = users;
    }

}
