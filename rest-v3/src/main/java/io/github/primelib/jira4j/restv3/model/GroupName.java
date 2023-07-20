package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GroupName
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "groupId",
    "name",
    "self"
})
@JsonTypeName("GroupName")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GroupName {

    /**
     * Constructs a validated implementation of {@link GroupName}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GroupName(Consumer<GroupName> spec) {
        spec.accept(this);
    }

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


}
