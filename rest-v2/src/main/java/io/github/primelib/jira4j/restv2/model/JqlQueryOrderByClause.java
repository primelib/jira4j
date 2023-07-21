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
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JqlQueryOrderByClause
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
    "fields"
})
@JsonTypeName("JqlQueryOrderByClause")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JqlQueryOrderByClause {

    /**
     * The list of order-by clause fields and their ordering directives.
     */
    @JsonProperty("fields")
    protected List<JqlQueryOrderByClauseElement> fields;

    /**
     * Constructs a validated instance of {@link JqlQueryOrderByClause}.
     *
     * @param spec the specification to process
     */
    public JqlQueryOrderByClause(Consumer<JqlQueryOrderByClause> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JqlQueryOrderByClause}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JqlQueryOrderByClause(Consumer)} instead.
     * @param fields The list of order-by clause fields and their ordering directives.
     */
    @ApiStatus.Internal
    public JqlQueryOrderByClause(List<JqlQueryOrderByClauseElement> fields) {
        this.fields = fields;
    }

}
