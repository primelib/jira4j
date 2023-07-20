package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JQLReferenceData
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "jqlReservedWords",
    "visibleFieldNames",
    "visibleFunctionNames"
})
@JsonTypeName("JQLReferenceData")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JQLReferenceData {

    /**
     * Constructs a validated implementation of {@link JQLReferenceData}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JQLReferenceData(Consumer<JQLReferenceData> spec) {
        spec.accept(this);
    }

    /**
     * List of JQL query reserved words.
     */
    @JsonProperty("jqlReservedWords")
    protected List<String> jqlReservedWords;

    /**
     * List of fields usable in JQL queries.
     */
    @JsonProperty("visibleFieldNames")
    protected List<FieldReferenceData> visibleFieldNames;

    /**
     * List of functions usable in JQL queries.
     */
    @JsonProperty("visibleFunctionNames")
    protected List<FunctionReferenceData> visibleFunctionNames;


}
