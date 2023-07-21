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
 * RemoteIssueLinkApplication
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
    "name",
    "type"
})
@JsonTypeName("RemoteIssueLink_application")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoteIssueLinkApplication {

    /**
     * The name of the application. Used in conjunction with the (remote) object icon title to display a tooltip for the link's icon. The tooltip takes the format "\\[application name\\] icon title". Blank items are excluded from the tooltip title. If both items are blank, the icon tooltop displays as "Web Link". Grouping and sorting of links may place links without an application name last.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The name-spaced type of the application, used by registered rendering apps.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link RemoteIssueLinkApplication}.
     *
     * @param spec the specification to process
     */
    public RemoteIssueLinkApplication(Consumer<RemoteIssueLinkApplication> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RemoteIssueLinkApplication}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RemoteIssueLinkApplication(Consumer)} instead.
     * @param name The name of the application. Used in conjunction with the (remote) object icon title to display a tooltip for the link's icon. The tooltip takes the format "\\[application name\\] icon title". Blank items are excluded from the tooltip title. If both items are blank, the icon tooltop displays as "Web Link". Grouping and sorting of links may place links without an application name last.
     * @param type The name-spaced type of the application, used by registered rendering apps.
     */
    @ApiStatus.Internal
    public RemoteIssueLinkApplication(String name, String type) {
        this.name = name;
        this.type = type;
    }

}
