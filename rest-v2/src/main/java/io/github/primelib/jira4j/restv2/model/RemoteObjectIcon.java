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
 * RemoteObjectIcon
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
@JsonTypeName("RemoteObject_icon")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoteObjectIcon {

    /**
     * Constructs a validated implementation of {@link RemoteObjectIcon}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RemoteObjectIcon(Consumer<RemoteObjectIcon> spec) {
        spec.accept(this);
    }

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


}
