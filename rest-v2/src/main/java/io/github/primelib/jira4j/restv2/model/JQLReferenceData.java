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
 * JQLReferenceData
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
    "jqlReservedWords",
    "visibleFieldNames",
    "visibleFunctionNames"
})
@JsonTypeName("JQLReferenceData")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JQLReferenceData {

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

    /**
     * Constructs a validated instance of {@link JQLReferenceData}.
     *
     * @param spec the specification to process
     */
    public JQLReferenceData(Consumer<JQLReferenceData> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JQLReferenceData}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JQLReferenceData(Consumer)} instead.
     * @param jqlReservedWords List of JQL query reserved words.
     * @param visibleFieldNames List of fields usable in JQL queries.
     * @param visibleFunctionNames List of functions usable in JQL queries.
     */
    @ApiStatus.Internal
    public JQLReferenceData(List<String> jqlReservedWords, List<FieldReferenceData> visibleFieldNames, List<FunctionReferenceData> visibleFunctionNames) {
        this.jqlReservedWords = jqlReservedWords;
        this.visibleFieldNames = visibleFieldNames;
        this.visibleFunctionNames = visibleFunctionNames;
    }

}
