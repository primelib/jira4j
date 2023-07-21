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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ParsedJqlQueryStructure
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
    "orderBy",
    "where"
})
@JsonTypeName("ParsedJqlQuery_structure")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ParsedJqlQueryStructure {

    @JsonProperty("orderBy")
    protected JqlQueryOrderByClause orderBy;

    @JsonProperty("where")
    protected JqlQueryClause where;

    /**
     * Constructs a validated instance of {@link ParsedJqlQueryStructure}.
     *
     * @param spec the specification to process
     */
    public ParsedJqlQueryStructure(Consumer<ParsedJqlQueryStructure> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ParsedJqlQueryStructure}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ParsedJqlQueryStructure(Consumer)} instead.
     * @param orderBy var.name
     * @param where var.name
     */
    @ApiStatus.Internal
    public ParsedJqlQueryStructure(JqlQueryOrderByClause orderBy, JqlQueryClause where) {
        this.orderBy = orderBy;
        this.where = where;
    }

}
