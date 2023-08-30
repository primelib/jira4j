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
 * UpdateScreenDetails
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
    "description",
    "name"
})
@JsonTypeName("UpdateScreenDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateScreenDetails {

    /**
     * The description of the screen. The maximum length is 255 characters.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The name of the screen. The name must be unique. The maximum length is 255 characters.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link UpdateScreenDetails}.
     *
     * @param spec the specification to process
     */
    public UpdateScreenDetails(Consumer<UpdateScreenDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateScreenDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateScreenDetails(Consumer)} instead.
     * @param description The description of the screen. The maximum length is 255 characters.
     * @param name The name of the screen. The name must be unique. The maximum length is 255 characters.
     */
    @ApiStatus.Internal
    public UpdateScreenDetails(String description, String name) {
        this.description = description;
        this.name = name;
    }

}
