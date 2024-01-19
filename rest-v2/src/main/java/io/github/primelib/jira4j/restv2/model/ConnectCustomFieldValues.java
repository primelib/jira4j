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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConnectCustomFieldValues
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
    "updateValueList"
})
@JsonTypeName("ConnectCustomFieldValues")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ConnectCustomFieldValues {

    /**
     * The list of custom field update details.
     */
    @JsonProperty("updateValueList")
    protected List<ConnectCustomFieldValue> updateValueList;

    /**
     * Constructs a validated instance of {@link ConnectCustomFieldValues}.
     *
     * @param spec the specification to process
     */
    public ConnectCustomFieldValues(Consumer<ConnectCustomFieldValues> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ConnectCustomFieldValues}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ConnectCustomFieldValues(Consumer)} instead.
     * @param updateValueList The list of custom field update details.
     */
    @ApiStatus.Internal
    public ConnectCustomFieldValues(List<ConnectCustomFieldValue> updateValueList) {
        this.updateValueList = updateValueList;
    }

}
