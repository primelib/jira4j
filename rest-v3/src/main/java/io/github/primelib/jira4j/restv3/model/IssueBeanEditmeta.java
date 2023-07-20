package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueBeanEditmeta
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "fields"
})
@JsonTypeName("IssueBean_editmeta")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueBeanEditmeta {

    /**
     * Constructs a validated implementation of {@link IssueBeanEditmeta}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueBeanEditmeta(Consumer<IssueBeanEditmeta> spec) {
        spec.accept(this);
    }

    @JsonProperty("fields")
    protected Map<String, FieldMetadata> fields = new HashMap<>();


}
