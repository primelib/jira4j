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
 * Icon
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
@JsonTypeName("Icon")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Icon {

    /**
     * The URL of the tooltip, used only for a status icon. If not set, the status icon in Jira is not clickable.
     */
    @JsonProperty("link")
    protected String link;

    /**
     * The title of the icon. This is used as follows:
     *  *
     * For a status icon it is used as a tooltip on the icon. If not set, the status icon doesn't display a tooltip in Jira.
     * *
     * For the remote object icon it is used in conjunction with the application name to display a tooltip for the link's icon. The tooltip takes the format "\\[application name\\] icon title". Blank itemsare excluded from the tooltip title. If both items are blank, the icon tooltop displays as "Web Link".
     */
    @JsonProperty("title")
    protected String title;

    /**
     * The URL of an icon that displays at 16x16 pixel in Jira.
     */
    @JsonProperty("url16x16")
    protected String url16x16;

    /**
     * Constructs a validated instance of {@link Icon}.
     *
     * @param spec the specification to process
     */
    public Icon(Consumer<Icon> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Icon}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Icon(Consumer)} instead.
     * @param link The URL of the tooltip, used only for a status icon. If not set, the status icon in Jira is not clickable.
     * @param title The title of the icon. This is used as follows:   *  For a status icon it is used as a tooltip on the icon. If not set, the status icon doesn't display a tooltip in Jira.  *  For the remote object icon it is used in conjunction with the application name to display a tooltip for the link's icon. The tooltip takes the format "\\[application name\\] icon title". Blank itemsare excluded from the tooltip title. If both items are blank, the icon tooltop displays as "Web Link".
     * @param url16x16 The URL of an icon that displays at 16x16 pixel in Jira.
     */
    @ApiStatus.Internal
    public Icon(String link, String title, String url16x16) {
        this.link = link;
        this.title = title;
        this.url16x16 = url16x16;
    }

}
