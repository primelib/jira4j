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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FieldLastUsed
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
    "type",
    "value"
})
@JsonTypeName("FieldLastUsed")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldLastUsed {

    /**
     * Last used value type:
     *  *
     * *TRACKED*: field is tracked and a last used date is available.
     * *
     * *NOT\\_TRACKED*: field is not tracked, last used date is not available.
     * *
     * *NO\\_INFORMATION*: field is tracked, but no last used date is available.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * The date when the value of the field last changed.
     */
    @JsonProperty("value")
    protected OffsetDateTime value;

    /**
     * Constructs a validated instance of {@link FieldLastUsed}.
     *
     * @param spec the specification to process
     */
    public FieldLastUsed(Consumer<FieldLastUsed> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FieldLastUsed}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FieldLastUsed(Consumer)} instead.
     * @param type Last used value type:   *  *TRACKED*: field is tracked and a last used date is available.  *  *NOT\\_TRACKED*: field is not tracked, last used date is not available.  *  *NO\\_INFORMATION*: field is tracked, but no last used date is available.
     * @param value The date when the value of the field last changed.
     */
    @ApiStatus.Internal
    public FieldLastUsed(TypeEnum type, OffsetDateTime value) {
        this.type = type;
        this.value = value;
    }

    /**
     * Last used value type:
     *  *
     * *TRACKED*: field is tracked and a last used date is available.
     * *
     * *NOT\\_TRACKED*: field is not tracked, last used date is not available.
     * *
     * *NO\\_INFORMATION*: field is tracked, but no last used date is available.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        TRACKED("TRACKED"),
        NOT_TRACKED("NOT_TRACKED"),
        NO_INFORMATION("NO_INFORMATION");

        private final String value;
    }

}
