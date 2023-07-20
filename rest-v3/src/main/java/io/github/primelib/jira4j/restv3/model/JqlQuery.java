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
 * JqlQuery
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "orderBy",
    "where"
})
@JsonTypeName("JqlQuery")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JqlQuery {

    /**
     * Constructs a validated implementation of {@link JqlQuery}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JqlQuery(Consumer<JqlQuery> spec) {
        spec.accept(this);
    }

    @JsonProperty("orderBy")
    protected JqlQueryOrderByClause orderBy;

    @JsonProperty("where")
    protected JqlQueryClause where;


}
