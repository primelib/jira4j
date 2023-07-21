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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VersionMoveBean
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
    "after",
    "position"
})
@JsonTypeName("VersionMoveBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class VersionMoveBean {

    /**
     * The URL (self link) of the version after which to place the moved version. Cannot be used with {@code position}.
     */
    @JsonProperty("after")
    protected URI after;

    /**
     * An absolute position in which to place the moved version. Cannot be used with {@code after}.
     */
    @JsonProperty("position")
    protected PositionEnum position;

    /**
     * Constructs a validated instance of {@link VersionMoveBean}.
     *
     * @param spec the specification to process
     */
    public VersionMoveBean(Consumer<VersionMoveBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link VersionMoveBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #VersionMoveBean(Consumer)} instead.
     * @param after The URL (self link) of the version after which to place the moved version. Cannot be used with {@code position}.
     * @param position An absolute position in which to place the moved version. Cannot be used with {@code after}.
     */
    @ApiStatus.Internal
    public VersionMoveBean(URI after, PositionEnum position) {
        this.after = after;
        this.position = position;
    }

    /**
     * An absolute position in which to place the moved version. Cannot be used with {@code after}.
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
