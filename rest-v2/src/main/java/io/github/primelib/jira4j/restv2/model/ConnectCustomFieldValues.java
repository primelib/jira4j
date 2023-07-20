package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConnectCustomFieldValues
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "updateValueList"
})
@JsonTypeName("ConnectCustomFieldValues")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ConnectCustomFieldValues {

    /**
     * Constructs a validated implementation of {@link ConnectCustomFieldValues}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ConnectCustomFieldValues(Consumer<ConnectCustomFieldValues> spec) {
        spec.accept(this);
    }

    /**
     * The list of custom field update details.
     */
    @JsonProperty("updateValueList")
    protected List<ConnectCustomFieldValue> updateValueList;


}
