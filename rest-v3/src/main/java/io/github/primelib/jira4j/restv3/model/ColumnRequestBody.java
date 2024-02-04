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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ColumnRequestBody
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
    "columns"
})
@JsonTypeName("ColumnRequestBody")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ColumnRequestBody {

    @JsonProperty("columns")
    protected List<String> columns;

    /**
     * Constructs a validated instance of {@link ColumnRequestBody}.
     *
     * @param spec the specification to process
     */
    public ColumnRequestBody(Consumer<ColumnRequestBody> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ColumnRequestBody}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ColumnRequestBody(Consumer)} instead.
     * @param columns columns
     */
    @ApiStatus.Internal
    public ColumnRequestBody(List<String> columns) {
        this.columns = columns;
    }

}
