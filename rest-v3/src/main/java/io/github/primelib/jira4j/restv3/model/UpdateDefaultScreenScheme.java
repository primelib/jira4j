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
 * UpdateDefaultScreenScheme
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
    "screenSchemeId"
})
@JsonTypeName("UpdateDefaultScreenScheme")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateDefaultScreenScheme {

    /**
     * The ID of the screen scheme.
     */
    @JsonProperty("screenSchemeId")
    protected String screenSchemeId;

    /**
     * Constructs a validated instance of {@link UpdateDefaultScreenScheme}.
     *
     * @param spec the specification to process
     */
    public UpdateDefaultScreenScheme(Consumer<UpdateDefaultScreenScheme> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateDefaultScreenScheme}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateDefaultScreenScheme(Consumer)} instead.
     * @param screenSchemeId The ID of the screen scheme.
     */
    @ApiStatus.Internal
    public UpdateDefaultScreenScheme(String screenSchemeId) {
        this.screenSchemeId = screenSchemeId;
    }

}
