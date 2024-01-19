package io.github.primelib.jira4j.restv2.model;

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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SimpleLink
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

    /**
     * Constructs a validated instance of {@link SimpleLink}.
     *
     * @param spec the specification to process
     */
    public SimpleLink(Consumer<SimpleLink> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SimpleLink}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SimpleLink(Consumer)} instead.
     * @param href href
     * @param iconClass iconClass
     * @param id id
     * @param label label
     * @param styleClass styleClass
     * @param title title
     * @param weight weight
     */
    @ApiStatus.Internal
    public SimpleLink(String href, String iconClass, String id, String label, String styleClass, String title, Integer weight) {
        this.href = href;
        this.iconClass = iconClass;
        this.id = id;
        this.label = label;
        this.styleClass = styleClass;
        this.title = title;
        this.weight = weight;
    }

}
