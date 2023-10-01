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

import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JqlFunctionPrecomputationBean
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
    "arguments",
    "created",
    "error",
    "field",
    "functionKey",
    "functionName",
    "id",
    "operator",
    "updated",
    "used",
    "value"
})
@JsonTypeName("JqlFunctionPrecomputationBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JqlFunctionPrecomputationBean {

    /**
     * The list of arguments function was invoked with.
     */
    @JsonProperty("arguments")
    protected List<String> arguments;

    /**
     * The timestamp of the precomputation creation.
     */
    @JsonProperty("created")
    protected OffsetDateTime created;

    /**
     * The error message to be displayed to the user.
     */
    @JsonProperty("error")
    protected String error;

    /**
     * The field the function was executed against.
     */
    @JsonProperty("field")
    protected String field;

    /**
     * The function key.
     */
    @JsonProperty("functionKey")
    protected String functionKey;

    /**
     * The name of the function.
     */
    @JsonProperty("functionName")
    protected String functionName;

    /**
     * The id of the precomputation.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The operator in context of which function was executed.
     */
    @JsonProperty("operator")
    protected String operator;

    /**
     * The timestamp of the precomputation last update.
     */
    @JsonProperty("updated")
    protected OffsetDateTime updated;

    /**
     * The timestamp of the precomputation last usage.
     */
    @JsonProperty("used")
    protected OffsetDateTime used;

    /**
     * The JQL fragment stored as the precomputation.
     */
    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link JqlFunctionPrecomputationBean}.
     *
     * @param spec the specification to process
     */
    public JqlFunctionPrecomputationBean(Consumer<JqlFunctionPrecomputationBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JqlFunctionPrecomputationBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JqlFunctionPrecomputationBean(Consumer)} instead.
     * @param arguments The list of arguments function was invoked with.
     * @param created The timestamp of the precomputation creation.
     * @param error The error message to be displayed to the user.
     * @param field The field the function was executed against.
     * @param functionKey The function key.
     * @param functionName The name of the function.
     * @param id The id of the precomputation.
     * @param operator The operator in context of which function was executed.
     * @param updated The timestamp of the precomputation last update.
     * @param used The timestamp of the precomputation last usage.
     * @param value The JQL fragment stored as the precomputation.
     */
    @ApiStatus.Internal
    public JqlFunctionPrecomputationBean(List<String> arguments, OffsetDateTime created, String error, String field, String functionKey, String functionName, String id, String operator, OffsetDateTime updated, OffsetDateTime used, String value) {
        this.arguments = arguments;
        this.created = created;
        this.error = error;
        this.field = field;
        this.functionKey = functionKey;
        this.functionName = functionName;
        this.id = id;
        this.operator = operator;
        this.updated = updated;
        this.used = used;
        this.value = value;
    }

}
