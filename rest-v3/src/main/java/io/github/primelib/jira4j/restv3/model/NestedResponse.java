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
 * NestedResponse
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
    "errorCollection",
    "status",
    "warningCollection"
})
@JsonTypeName("NestedResponse")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NestedResponse {

    @JsonProperty("errorCollection")
    protected ErrorCollection errorCollection;

    @JsonProperty("status")
    protected Integer status;

    @JsonProperty("warningCollection")
    protected WarningCollection warningCollection;

    /**
     * Constructs a validated instance of {@link NestedResponse}.
     *
     * @param spec the specification to process
     */
    public NestedResponse(Consumer<NestedResponse> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link NestedResponse}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #NestedResponse(Consumer)} instead.
     * @param errorCollection var.name
     * @param status var.name
     * @param warningCollection var.name
     */
    @ApiStatus.Internal
    public NestedResponse(ErrorCollection errorCollection, Integer status, WarningCollection warningCollection) {
        this.errorCollection = errorCollection;
        this.status = status;
        this.warningCollection = warningCollection;
    }

}
