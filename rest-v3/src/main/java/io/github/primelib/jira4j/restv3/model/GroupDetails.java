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
 * GroupDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "groupId",
    "name"
})
@JsonTypeName("GroupDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GroupDetails {

    /**
     * Constructs a validated implementation of {@link GroupDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public GroupDetails(Consumer<GroupDetails> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the group, which uniquely identifies the group across all Atlassian products. For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*.
     */
    @JsonProperty("groupId")
    protected String groupId;

    /**
     * The name of the group.
     */
    @JsonProperty("name")
    protected String name;


}
