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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * JsonNode
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
    protected Boolean object;

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

    /**
     * Constructs a validated instance of {@link JsonNode}.
     *
     * @param spec the specification to process
     */
    public JsonNode(Consumer<JsonNode> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JsonNode}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JsonNode(Consumer)} instead.
     * @param array array
     * @param bigDecimal bigDecimal
     * @param bigInteger bigInteger
     * @param bigIntegerValue bigIntegerValue
     * @param binary binary
     * @param binaryValue binaryValue
     * @param _boolean _boolean
     * @param booleanValue booleanValue
     * @param containerNode containerNode
     * @param decimalValue decimalValue
     * @param _double _double
     * @param doubleValue doubleValue
     * @param elements elements
     * @param fieldNames fieldNames
     * @param fields fields
     * @param floatingPointNumber floatingPointNumber
     * @param _int _int
     * @param intValue intValue
     * @param integralNumber integralNumber
     * @param _long _long
     * @param longValue longValue
     * @param missingNode missingNode
     * @param _null _null
     * @param number number
     * @param numberType numberType
     * @param numberValue numberValue
     * @param object object
     * @param pojo pojo
     * @param textValue textValue
     * @param textual textual
     * @param valueAsBoolean valueAsBoolean
     * @param valueAsDouble valueAsDouble
     * @param valueAsInt valueAsInt
     * @param valueAsLong valueAsLong
     * @param valueAsText valueAsText
     * @param valueNode valueNode
     */
    @ApiStatus.Internal
    public JsonNode(Boolean array, Boolean bigDecimal, Boolean bigInteger, Integer bigIntegerValue, Boolean binary, List<byte[]> binaryValue, Boolean _boolean, Boolean booleanValue, Boolean containerNode, BigDecimal decimalValue, Boolean _double, Double doubleValue, Object elements, Object fieldNames, Object fields, Boolean floatingPointNumber, Boolean _int, Integer intValue, Boolean integralNumber, Boolean _long, Long longValue, Boolean missingNode, Boolean _null, Boolean number, NumberTypeEnum numberType, BigDecimal numberValue, Boolean object, Boolean pojo, String textValue, Boolean textual, Boolean valueAsBoolean, Double valueAsDouble, Integer valueAsInt, Long valueAsLong, String valueAsText, Boolean valueNode) {
        this.array = array;
        this.bigDecimal = bigDecimal;
        this.bigInteger = bigInteger;
        this.bigIntegerValue = bigIntegerValue;
        this.binary = binary;
        this.binaryValue = binaryValue;
        this._boolean = _boolean;
        this.booleanValue = booleanValue;
        this.containerNode = containerNode;
        this.decimalValue = decimalValue;
        this._double = _double;
        this.doubleValue = doubleValue;
        this.elements = elements;
        this.fieldNames = fieldNames;
        this.fields = fields;
        this.floatingPointNumber = floatingPointNumber;
        this._int = _int;
        this.intValue = intValue;
        this.integralNumber = integralNumber;
        this._long = _long;
        this.longValue = longValue;
        this.missingNode = missingNode;
        this._null = _null;
        this.number = number;
        this.numberType = numberType;
        this.numberValue = numberValue;
        this.object = object;
        this.pojo = pojo;
        this.textValue = textValue;
        this.textual = textual;
        this.valueAsBoolean = valueAsBoolean;
        this.valueAsDouble = valueAsDouble;
        this.valueAsInt = valueAsInt;
        this.valueAsLong = valueAsLong;
        this.valueAsText = valueAsText;
        this.valueNode = valueNode;
    }

    @AllArgsConstructor
    public enum NumberTypeEnum {
        INT("INT"),
        LONG("LONG"),
        BIG_INTEGER("BIG_INTEGER"),
        FLOAT("FLOAT"),
        DOUBLE("DOUBLE"),
        BIG_DECIMAL("BIG_DECIMAL");

        private static final NumberTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static NumberTypeEnum of(String input) {
            if (input != null) {
                for (NumberTypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
