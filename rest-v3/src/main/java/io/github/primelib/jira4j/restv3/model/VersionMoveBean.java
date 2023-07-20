package io.github.primelib.jira4j.restv3.model;

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
 * VersionMoveBean
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
@JsonTypeName("VersionMoveBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class VersionMoveBean {

    /**
     * Constructs a validated implementation of {@link VersionMoveBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public VersionMoveBean(Consumer<VersionMoveBean> spec) {
        spec.accept(this);
    }

    /**
     * The URL (self link) of the version after which to place the moved version. Cannot be used with `position`.
     */
    @JsonProperty("after")
    protected URI after;

    /**
     * An absolute position in which to place the moved version. Cannot be used with `after`.
     */
    @JsonProperty("position")
    protected PositionEnum position;


    /**
     * An absolute position in which to place the moved version. Cannot be used with `after`.
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
