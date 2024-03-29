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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueBeanEditmeta
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
    "fields"
})
@JsonTypeName("IssueBean_editmeta")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueBeanEditmeta {

    @JsonProperty("fields")
    protected Map<String, FieldMetadata> fields;

    /**
     * Constructs a validated instance of {@link IssueBeanEditmeta}.
     *
     * @param spec the specification to process
     */
    public IssueBeanEditmeta(Consumer<IssueBeanEditmeta> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueBeanEditmeta}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueBeanEditmeta(Consumer)} instead.
     * @param fields fields
     */
    @ApiStatus.Internal
    public IssueBeanEditmeta(Map<String, FieldMetadata> fields) {
        this.fields = fields;
    }

}
