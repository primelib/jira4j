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
 * MultipleCustomFieldValuesUpdateDetails
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
    "updates"
})
@JsonTypeName("MultipleCustomFieldValuesUpdateDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class MultipleCustomFieldValuesUpdateDetails {

    @JsonProperty("updates")
    protected List<MultipleCustomFieldValuesUpdate> updates;

    /**
     * Constructs a validated instance of {@link MultipleCustomFieldValuesUpdateDetails}.
     *
     * @param spec the specification to process
     */
    public MultipleCustomFieldValuesUpdateDetails(Consumer<MultipleCustomFieldValuesUpdateDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link MultipleCustomFieldValuesUpdateDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #MultipleCustomFieldValuesUpdateDetails(Consumer)} instead.
     * @param updates updates
     */
    @ApiStatus.Internal
    public MultipleCustomFieldValuesUpdateDetails(List<MultipleCustomFieldValuesUpdate> updates) {
        this.updates = updates;
    }

}
