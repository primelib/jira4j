package io.github.primelib.jira4j.restv3.model;

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
 * StatusDetailsStatusCategory
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "colorName",
    "id",
    "key",
    "name",
    "self"
})
@JsonTypeName("StatusDetails_statusCategory")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusDetailsStatusCategory {

    /**
     * Constructs a validated implementation of {@link StatusDetailsStatusCategory}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public StatusDetailsStatusCategory(Consumer<StatusDetailsStatusCategory> spec) {
        spec.accept(this);
    }

    /**
     * The name of the color used to represent the status category.
     */
    @JsonProperty("colorName")
    protected String colorName;

    /**
     * The ID of the status category.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The key of the status category.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * The name of the status category.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The URL of the status category.
     */
    @JsonProperty("self")
    protected String self;


}
