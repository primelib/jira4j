package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JsonNode
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "array",
    "bigDecimal",
    "bigInteger",
    "bigIntegerValue",
    "binary",
    "binaryValue",
    "boolean",
    "booleanValue",
    "containerNode",
    "decimalValue",
    "double",
    "doubleValue",
    "elements",
    "fieldNames",
    "fields",
    "floatingPointNumber",
    "int",
    "intValue",
    "integralNumber",
    "long",
    "longValue",
    "missingNode",
    "null",
    "number",
    "numberType",
    "numberValue",
    "object",
    "pojo",
    "textValue",
    "textual",
    "valueAsBoolean",
    "valueAsDouble",
    "valueAsInt",
    "valueAsLong",
    "valueAsText",
    "valueNode"
})
@JsonTypeName("JsonNode")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JsonNode {

    /**
     * Constructs a validated implementation of {@link JsonNode}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JsonNode(Consumer<JsonNode> spec) {
        spec.accept(this);
    }

    @JsonProperty("array")
    protected Boolean array;

    @JsonProperty("bigDecimal")
    protected Boolean bigDecimal;

    @JsonProperty("bigInteger")
    protected Boolean bigInteger;

    @JsonProperty("bigIntegerValue")
    protected Integer bigIntegerValue;

    @JsonProperty("binary")
    protected Boolean binary;

    @JsonProperty("binaryValue")
    protected List<byte[]> binaryValue;

    @JsonProperty("boolean")
    protected Boolean _boolean;

    @JsonProperty("booleanValue")
    protected Boolean booleanValue;

    @JsonProperty("containerNode")
    protected Boolean containerNode;

    @JsonProperty("decimalValue")
    protected BigDecimal decimalValue;

    @JsonProperty("double")
    protected Boolean _double;

    @JsonProperty("doubleValue")
    protected Double doubleValue;

    @JsonProperty("elements")
    protected Object elements;

    @JsonProperty("fieldNames")
    protected Object fieldNames;

    @JsonProperty("fields")
    protected Object fields;

    @JsonProperty("floatingPointNumber")
    protected Boolean floatingPointNumber;

    @JsonProperty("int")
    protected Boolean _int;

    @JsonProperty("intValue")
    protected Integer intValue;

    @JsonProperty("integralNumber")
    protected Boolean integralNumber;

    @JsonProperty("long")
    protected Boolean _long;

    @JsonProperty("longValue")
    protected Long longValue;

    @JsonProperty("missingNode")
    protected Boolean missingNode;

    @JsonProperty("null")
    protected Boolean _null;

    @JsonProperty("number")
    protected Boolean number;

    @JsonProperty("numberType")
    protected NumberTypeEnum numberType;

    @JsonProperty("numberValue")
    protected BigDecimal numberValue;

    @JsonProperty("object")
    protected Boolean _object;

    @JsonProperty("pojo")
    protected Boolean pojo;

    @JsonProperty("textValue")
    protected String textValue;

    @JsonProperty("textual")
    protected Boolean textual;

    @JsonProperty("valueAsBoolean")
    protected Boolean valueAsBoolean;

    @JsonProperty("valueAsDouble")
    protected Double valueAsDouble;

    @JsonProperty("valueAsInt")
    protected Integer valueAsInt;

    @JsonProperty("valueAsLong")
    protected Long valueAsLong;

    @JsonProperty("valueAsText")
    protected String valueAsText;

    @JsonProperty("valueNode")
    protected Boolean valueNode;


    @AllArgsConstructor
    public enum NumberTypeEnum {
        INT("INT"),
        LONG("LONG"),
        BIG_INTEGER("BIG_INTEGER"),
        FLOAT("FLOAT"),
        DOUBLE("DOUBLE"),
        BIG_DECIMAL("BIG_DECIMAL");

        private final String value;
    }

}
