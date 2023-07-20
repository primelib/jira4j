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
 * FunctionReferenceData
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "displayName",
    "isList",
    "types",
    "value"
})
@JsonTypeName("FunctionReferenceData")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FunctionReferenceData {

    /**
     * Constructs a validated implementation of {@link FunctionReferenceData}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FunctionReferenceData(Consumer<FunctionReferenceData> spec) {
        spec.accept(this);
    }

    /**
     * The display name of the function.
     */
    @JsonProperty("displayName")
    protected String displayName;

    /**
     * Whether the function can take a list of arguments.
     */
    @JsonProperty("isList")
    protected IsListEnum isList;

    /**
     * The data types returned by the function.
     */
    @JsonProperty("types")
    protected List<String> types;

    /**
     * The function identifier.
     */
    @JsonProperty("value")
    protected String value;


    /**
     * Whether the function can take a list of arguments.
     */
    @AllArgsConstructor
    public enum IsListEnum {
        TRUE("true"),
        FALSE("false");

        private final String value;
    }

}
