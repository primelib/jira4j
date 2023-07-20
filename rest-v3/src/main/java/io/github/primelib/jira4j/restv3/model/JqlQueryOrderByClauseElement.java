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
 * JqlQueryOrderByClauseElement
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "direction",
    "field"
})
@JsonTypeName("JqlQueryOrderByClauseElement")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JqlQueryOrderByClauseElement {

    /**
     * Constructs a validated implementation of {@link JqlQueryOrderByClauseElement}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JqlQueryOrderByClauseElement(Consumer<JqlQueryOrderByClauseElement> spec) {
        spec.accept(this);
    }

    /**
     * The direction in which to order the results.
     */
    @JsonProperty("direction")
    protected DirectionEnum direction;

    @JsonProperty("field")
    protected JqlQueryField field;


    /**
     * The direction in which to order the results.
     */
    @AllArgsConstructor
    public enum DirectionEnum {
        ASC("asc"),
        DESC("desc");

        private final String value;
    }

}
