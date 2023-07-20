package io.github.primelib.jira4j.restv2.model;

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
 * FoundGroup
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "groupId",
    "html",
    "labels",
    "name"
})
@JsonTypeName("FoundGroup")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FoundGroup {

    /**
     * Constructs a validated implementation of {@link FoundGroup}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FoundGroup(Consumer<FoundGroup> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the group, which uniquely identifies the group across all Atlassian products. For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*.
     */
    @JsonProperty("groupId")
    protected String groupId;

    /**
     * The group name with the matched query string highlighted with the HTML bold tag.
     */
    @JsonProperty("html")
    protected String html;

    @JsonProperty("labels")
    protected List<GroupLabel> labels;

    /**
     * The name of the group. The name of a group is mutable, to reliably identify a group use ``groupId`.`
     */
    @JsonProperty("name")
    protected String name;


}
