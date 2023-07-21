package io.github.primelib.jira4j.restv3.model;

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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FunctionReferenceData
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
    "displayName",
    "isList",
    "types",
    "value"
})
@JsonTypeName("FunctionReferenceData")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FunctionReferenceData {

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
     * Constructs a validated instance of {@link FunctionReferenceData}.
     *
     * @param spec the specification to process
     */
    public FunctionReferenceData(Consumer<FunctionReferenceData> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FunctionReferenceData}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FunctionReferenceData(Consumer)} instead.
     * @param displayName The display name of the function.
     * @param isList Whether the function can take a list of arguments.
     * @param types The data types returned by the function.
     * @param value The function identifier.
     */
    @ApiStatus.Internal
    public FunctionReferenceData(String displayName, IsListEnum isList, List<String> types, String value) {
        this.displayName = displayName;
        this.isList = isList;
        this.types = types;
        this.value = value;
    }

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
