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
 * FoundGroup
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
    "groupId",
    "html",
    "labels",
    "name"
})
@JsonTypeName("FoundGroup")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FoundGroup {

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
     * The name of the group. The name of a group is mutable, to reliably identify a group use {@code }groupId{@code .}
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link FoundGroup}.
     *
     * @param spec the specification to process
     */
    public FoundGroup(Consumer<FoundGroup> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FoundGroup}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FoundGroup(Consumer)} instead.
     * @param groupId The ID of the group, which uniquely identifies the group across all Atlassian products. For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*.
     * @param html The group name with the matched query string highlighted with the HTML bold tag.
     * @param labels var.name
     * @param name The name of the group. The name of a group is mutable, to reliably identify a group use {@code }groupId{@code .}
     */
    @ApiStatus.Internal
    public FoundGroup(String groupId, String html, List<GroupLabel> labels, String name) {
        this.groupId = groupId;
        this.html = html;
        this.labels = labels;
        this.name = name;
    }

}
