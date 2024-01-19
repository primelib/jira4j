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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * MoveFieldBean
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
@JsonTypeName("MoveFieldBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MoveFieldBean {

    /**
     * The ID of the screen tab field after which to place the moved screen tab field. Required if {@code position} isn't provided.
     */
    @JsonProperty("after")
    protected URI after;

    /**
     * The named position to which the screen tab field should be moved. Required if {@code after} isn't provided.
     */
    @JsonProperty("position")
    protected PositionEnum position;

    /**
     * Constructs a validated instance of {@link MoveFieldBean}.
     *
     * @param spec the specification to process
     */
    public MoveFieldBean(Consumer<MoveFieldBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MoveFieldBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MoveFieldBean(Consumer)} instead.
     * @param after The ID of the screen tab field after which to place the moved screen tab field. Required if {@code position} isn't provided.
     * @param position The named position to which the screen tab field should be moved. Required if {@code after} isn't provided.
     */
    @ApiStatus.Internal
    public MoveFieldBean(URI after, PositionEnum position) {
        this.after = after;
        this.position = position;
    }

    /**
     * The named position to which the screen tab field should be moved. Required if {@code after} isn't provided.
     */
    @AllArgsConstructor
    public enum PositionEnum {
        EARLIER("Earlier"),
        LATER("Later"),
        FIRST("First"),
        LAST("Last");

        private static final PositionEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static PositionEnum of(String input) {
            if (input != null) {
                for (PositionEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
