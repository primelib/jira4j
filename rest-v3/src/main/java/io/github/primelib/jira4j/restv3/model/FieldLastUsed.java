package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FieldLastUsed
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "type",
    "value"
})
@JsonTypeName("FieldLastUsed")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FieldLastUsed {

    /**
     * Constructs a validated implementation of {@link FieldLastUsed}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FieldLastUsed(Consumer<FieldLastUsed> spec) {
        spec.accept(this);
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
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * The date when the value of the field last changed.
     */
    @JsonProperty("value")
    protected OffsetDateTime value;


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
