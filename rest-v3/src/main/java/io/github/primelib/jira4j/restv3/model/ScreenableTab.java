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
 * ScreenableTab
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
    "id",
    "name"
})
@JsonTypeName("ScreenableTab")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ScreenableTab {

    /**
     * The ID of the screen tab.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The name of the screen tab. The maximum length is 255 characters.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link ScreenableTab}.
     *
     * @param spec the specification to process
     */
    public ScreenableTab(Consumer<ScreenableTab> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ScreenableTab}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ScreenableTab(Consumer)} instead.
     * @param id The ID of the screen tab.
     * @param name The name of the screen tab. The maximum length is 255 characters.
     */
    @ApiStatus.Internal
    public ScreenableTab(Long id, String name) {
        this.id = id;
        this.name = name;
    }

}
