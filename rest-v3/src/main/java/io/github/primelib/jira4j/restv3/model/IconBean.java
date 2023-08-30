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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IconBean
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
    "link",
    "title",
    "url16x16"
})
@JsonTypeName("IconBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IconBean {

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

    /**
     * Constructs a validated instance of {@link IconBean}.
     *
     * @param spec the specification to process
     */
    public IconBean(Consumer<IconBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IconBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IconBean(Consumer)} instead.
     * @param link The URL of the tooltip, used only for a status icon.
     * @param title The title of the icon, for use as a tooltip on the icon.
     * @param url16x16 The URL of a 16x16 pixel icon.
     */
    @ApiStatus.Internal
    public IconBean(String link, String title, String url16x16) {
        this.link = link;
        this.title = title;
        this.url16x16 = url16x16;
    }

}
