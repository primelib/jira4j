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
 * JqlQuery
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
@JsonTypeName("JqlQuery")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JqlQuery {

    @JsonProperty("orderBy")
    protected JqlQueryOrderByClause orderBy;

    @JsonProperty("where")
    protected JqlQueryClause where;

    /**
     * Constructs a validated instance of {@link JqlQuery}.
     *
     * @param spec the specification to process
     */
    public JqlQuery(Consumer<JqlQuery> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JqlQuery}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JqlQuery(Consumer)} instead.
     * @param orderBy orderBy
     * @param where where
     */
    @ApiStatus.Internal
    public JqlQuery(JqlQueryOrderByClause orderBy, JqlQueryClause where) {
        this.orderBy = orderBy;
        this.where = where;
    }

}
