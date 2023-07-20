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
 * ChangedValueBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "changedFrom",
    "changedTo",
    "fieldName"
})
@JsonTypeName("ChangedValueBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ChangedValueBean {

    /**
     * Constructs a validated implementation of {@link ChangedValueBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ChangedValueBean(Consumer<ChangedValueBean> spec) {
        spec.accept(this);
    }

    /**
     * The value of the field before the change.
     */
    @JsonProperty("changedFrom")
    protected String changedFrom;

    /**
     * The value of the field after the change.
     */
    @JsonProperty("changedTo")
    protected String changedTo;

    /**
     * The name of the field changed.
     */
    @JsonProperty("fieldName")
    protected String fieldName;


}
