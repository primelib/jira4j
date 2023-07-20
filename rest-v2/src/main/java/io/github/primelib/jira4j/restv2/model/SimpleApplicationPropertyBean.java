package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SimpleApplicationPropertyBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "value"
})
@JsonTypeName("SimpleApplicationPropertyBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SimpleApplicationPropertyBean {

    /**
     * Constructs a validated implementation of {@link SimpleApplicationPropertyBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SimpleApplicationPropertyBean(Consumer<SimpleApplicationPropertyBean> spec) {
        spec.accept(this);
    }

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


}
