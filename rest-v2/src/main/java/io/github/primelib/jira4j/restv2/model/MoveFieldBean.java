package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MoveFieldBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "after",
    "position"
})
@JsonTypeName("MoveFieldBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MoveFieldBean {

    /**
     * Constructs a validated implementation of {@link MoveFieldBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public MoveFieldBean(Consumer<MoveFieldBean> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the screen tab field after which to place the moved screen tab field. Required if `position` isn't provided.
     */
    @JsonProperty("after")
    protected URI after;

    /**
     * The named position to which the screen tab field should be moved. Required if `after` isn't provided.
     */
    @JsonProperty("position")
    protected PositionEnum position;


    /**
     * The named position to which the screen tab field should be moved. Required if `after` isn't provided.
     */
    @AllArgsConstructor
    public enum PositionEnum {
        EARLIER("Earlier"),
        LATER("Later"),
        FIRST("First"),
        LAST("Last");

        private final String value;
    }

}
