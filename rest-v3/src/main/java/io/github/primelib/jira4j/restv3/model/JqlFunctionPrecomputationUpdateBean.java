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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JqlFunctionPrecomputationUpdateBean
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
    "error",
    "id",
    "value"
})
@JsonTypeName("JqlFunctionPrecomputationUpdateBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JqlFunctionPrecomputationUpdateBean {

    @JsonProperty("error")
    protected String error;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link JqlFunctionPrecomputationUpdateBean}.
     *
     * @param spec the specification to process
     */
    public JqlFunctionPrecomputationUpdateBean(Consumer<JqlFunctionPrecomputationUpdateBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link JqlFunctionPrecomputationUpdateBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #JqlFunctionPrecomputationUpdateBean(Consumer)} instead.
     * @param error error
     * @param id id
     * @param value value
     */
    @ApiStatus.Internal
    public JqlFunctionPrecomputationUpdateBean(String error, String id, String value) {
        this.error = error;
        this.id = id;
        this.value = value;
    }

}
