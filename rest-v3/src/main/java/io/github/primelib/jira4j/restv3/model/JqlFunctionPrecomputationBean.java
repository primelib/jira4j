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

    @JsonProperty("arguments")
    protected List<String> arguments;

    @JsonProperty("created")
    protected OffsetDateTime created;

    @JsonProperty("error")
    protected String error;

    @JsonProperty("field")
    protected String field;

    @JsonProperty("functionKey")
    protected String functionKey;

    @JsonProperty("functionName")
    protected String functionName;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("operator")
    protected String operator;

    @JsonProperty("updated")
    protected OffsetDateTime updated;

    @JsonProperty("used")
    protected OffsetDateTime used;

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
     * @param arguments arguments
     * @param created created
     * @param error error
     * @param field field
     * @param functionKey functionKey
     * @param functionName functionName
     * @param id id
     * @param operator operator
     * @param updated updated
     * @param used used
     * @param value value
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
