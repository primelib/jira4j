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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomFieldContextDefaultValueDate
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
    "date",
    "type",
    "useCurrent"
})
@JsonTypeName("CustomFieldContextDefaultValueDate")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CustomFieldContextDefaultValueDate {

    /**
     * The default date in ISO format. Ignored if {@code useCurrent} is true.
     */
    @JsonProperty("date")
    protected String date;

    @JsonProperty("type")
    protected String type;

    /**
     * Whether to use the current date.
     */
    @JsonProperty("useCurrent")
    protected Boolean useCurrent;

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueDate}.
     *
     * @param spec the specification to process
     */
    public CustomFieldContextDefaultValueDate(Consumer<CustomFieldContextDefaultValueDate> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CustomFieldContextDefaultValueDate}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CustomFieldContextDefaultValueDate(Consumer)} instead.
     * @param date The default date in ISO format. Ignored if {@code useCurrent} is true.
     * @param type var.name
     * @param useCurrent Whether to use the current date.
     */
    @ApiStatus.Internal
    public CustomFieldContextDefaultValueDate(String date, String type, Boolean useCurrent) {
        this.date = date;
        this.type = type;
        this.useCurrent = useCurrent;
    }

}
