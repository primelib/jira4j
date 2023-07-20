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
 * LinkGroup
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "groups",
    "header",
    "id",
    "links",
    "styleClass",
    "weight"
})
@JsonTypeName("LinkGroup")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class LinkGroup {

    /**
     * Constructs a validated implementation of {@link LinkGroup}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public LinkGroup(Consumer<LinkGroup> spec) {
        spec.accept(this);
    }

    @JsonProperty("groups")
    protected List<LinkGroup> groups;

    @JsonProperty("header")
    protected SimpleLink header;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("links")
    protected List<SimpleLink> links;

    @JsonProperty("styleClass")
    protected String styleClass;

    @JsonProperty("weight")
    protected Integer weight;


}
