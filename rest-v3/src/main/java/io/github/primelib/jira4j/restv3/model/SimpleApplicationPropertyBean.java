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
 * SimpleApplicationPropertyBean
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
    "id",
    "value"
})
@JsonTypeName("SimpleApplicationPropertyBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SimpleApplicationPropertyBean {

    /**
     * The ID of the application property.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The new value.
     */
    @JsonProperty("value")
    protected String value;

    /**
     * Constructs a validated instance of {@link SimpleApplicationPropertyBean}.
     *
     * @param spec the specification to process
     */
    public SimpleApplicationPropertyBean(Consumer<SimpleApplicationPropertyBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SimpleApplicationPropertyBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SimpleApplicationPropertyBean(Consumer)} instead.
     * @param id The ID of the application property.
     * @param value The new value.
     */
    @ApiStatus.Internal
    public SimpleApplicationPropertyBean(String id, String value) {
        this.id = id;
        this.value = value;
    }

}
