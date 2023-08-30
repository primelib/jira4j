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
 * StatusDetailsStatusCategory
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

    /**
     * Constructs a validated instance of {@link StatusDetailsStatusCategory}.
     *
     * @param spec the specification to process
     */
    public StatusDetailsStatusCategory(Consumer<StatusDetailsStatusCategory> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StatusDetailsStatusCategory}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StatusDetailsStatusCategory(Consumer)} instead.
     * @param colorName The name of the color used to represent the status category.
     * @param id The ID of the status category.
     * @param key The key of the status category.
     * @param name The name of the status category.
     * @param self The URL of the status category.
     */
    @ApiStatus.Internal
    public StatusDetailsStatusCategory(String colorName, Long id, String key, String name, String self) {
        this.colorName = colorName;
        this.id = id;
        this.key = key;
        this.name = name;
        this.self = self;
    }

}
