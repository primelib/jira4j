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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * JqlQueryOrderByClauseElement
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
    "direction",
    "field"
})
@JsonTypeName("JqlQueryOrderByClauseElement")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JqlQueryOrderByClauseElement {

    /**
     * The direction in which to order the results.
     */
    @JsonProperty("direction")
    protected DirectionEnum direction;

    @JsonProperty("field")
    protected JqlQueryField field;

    /**
     * Constructs a validated instance of {@link JqlQueryOrderByClauseElement}.
     *
     * @param spec the specification to process
     */
    public JqlQueryOrderByClauseElement(Consumer<JqlQueryOrderByClauseElement> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JqlQueryOrderByClauseElement}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JqlQueryOrderByClauseElement(Consumer)} instead.
     * @param direction The direction in which to order the results.
     * @param field field
     */
    @ApiStatus.Internal
    public JqlQueryOrderByClauseElement(DirectionEnum direction, JqlQueryField field) {
        this.direction = direction;
        this.field = field;
    }

    /**
     * The direction in which to order the results.
     */
    @AllArgsConstructor
    public enum DirectionEnum {
        ASC("asc"),
        DESC("desc");

        private static final DirectionEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static DirectionEnum of(String input) {
            if (input != null) {
                for (DirectionEnum v : VALUES) {
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
