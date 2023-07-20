package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JqlQueriesToParse
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "queries"
})
@JsonTypeName("JqlQueriesToParse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JqlQueriesToParse {

    /**
     * Constructs a validated implementation of {@link JqlQueriesToParse}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JqlQueriesToParse(Consumer<JqlQueriesToParse> spec) {
        spec.accept(this);
    }

    /**
     * A list of queries to parse.
     */
    @JsonProperty("queries")
    protected List<String> queries = new ArrayList<>();


}
