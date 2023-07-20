package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Application
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "name",
    "type"
})
@JsonTypeName("Application")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Application extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link Application}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Application(Consumer<Application> spec) {
        spec.accept(this);
    }

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


}
