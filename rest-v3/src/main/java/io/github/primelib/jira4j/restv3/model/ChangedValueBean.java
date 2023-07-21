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
 * ChangedValueBean
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
    "changedFrom",
    "changedTo",
    "fieldName"
})
@JsonTypeName("ChangedValueBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ChangedValueBean {

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

    /**
     * Constructs a validated instance of {@link ChangedValueBean}.
     *
     * @param spec the specification to process
     */
    public ChangedValueBean(Consumer<ChangedValueBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ChangedValueBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ChangedValueBean(Consumer)} instead.
     * @param changedFrom The value of the field before the change.
     * @param changedTo The value of the field after the change.
     * @param fieldName The name of the field changed.
     */
    @ApiStatus.Internal
    public ChangedValueBean(String changedFrom, String changedTo, String fieldName) {
        this.changedFrom = changedFrom;
        this.changedTo = changedTo;
        this.fieldName = fieldName;
    }

}
