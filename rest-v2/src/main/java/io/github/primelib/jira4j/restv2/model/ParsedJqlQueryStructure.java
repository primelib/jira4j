package io.github.primelib.jira4j.restv2.model;

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
 * ParsedJqlQueryStructure
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
@JsonTypeName("ParsedJqlQuery_structure")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ParsedJqlQueryStructure {

    /**
     * Constructs a validated implementation of {@link ParsedJqlQueryStructure}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ParsedJqlQueryStructure(Consumer<ParsedJqlQueryStructure> spec) {
        spec.accept(this);
    }

    @JsonProperty("orderBy")
    protected JqlQueryOrderByClause orderBy;

    @JsonProperty("where")
    protected JqlQueryClause where;


}
