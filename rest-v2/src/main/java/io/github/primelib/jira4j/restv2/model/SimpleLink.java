package io.github.primelib.jira4j.restv2.model;

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
 * SimpleLink
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "href",
    "iconClass",
    "id",
    "label",
    "styleClass",
    "title",
    "weight"
})
@JsonTypeName("SimpleLink")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SimpleLink {

    /**
     * Constructs a validated implementation of {@link SimpleLink}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SimpleLink(Consumer<SimpleLink> spec) {
        spec.accept(this);
    }

    @JsonProperty("href")
    protected String href;

    @JsonProperty("iconClass")
    protected String iconClass;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("label")
    protected String label;

    @JsonProperty("styleClass")
    protected String styleClass;

    @JsonProperty("title")
    protected String title;

    @JsonProperty("weight")
    protected Integer weight;


}
