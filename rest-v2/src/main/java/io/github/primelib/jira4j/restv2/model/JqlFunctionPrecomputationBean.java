package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
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
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "arguments",
    "created",
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
     * Constructs a validated implementation of {@link JqlFunctionPrecomputationBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JqlFunctionPrecomputationBean(Consumer<JqlFunctionPrecomputationBean> spec) {
        spec.accept(this);
    }

    @JsonProperty("arguments")
    protected List<String> arguments;

    @JsonProperty("created")
    protected OffsetDateTime created;

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


}
