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
 * IconBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "link",
    "title",
    "url16x16"
})
@JsonTypeName("IconBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IconBean {

    /**
     * Constructs a validated implementation of {@link IconBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IconBean(Consumer<IconBean> spec) {
        spec.accept(this);
    }

    /**
     * The URL of the tooltip, used only for a status icon.
     */
    @JsonProperty("link")
    protected String link;

    /**
     * The title of the icon, for use as a tooltip on the icon.
     */
    @JsonProperty("title")
    protected String title;

    /**
     * The URL of a 16x16 pixel icon.
     */
    @JsonProperty("url16x16")
    protected String url16x16;


}
