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
 * SetDefaultPriorityRequest
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
    "id"
})
@JsonTypeName("SetDefaultPriorityRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SetDefaultPriorityRequest {

    /**
     * The ID of the new default issue priority. Must be an existing ID or null. Setting this to null erases the default priority setting.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Constructs a validated instance of {@link SetDefaultPriorityRequest}.
     *
     * @param spec the specification to process
     */
    public SetDefaultPriorityRequest(Consumer<SetDefaultPriorityRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SetDefaultPriorityRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SetDefaultPriorityRequest(Consumer)} instead.
     * @param id The ID of the new default issue priority. Must be an existing ID or null. Setting this to null erases the default priority setting.
     */
    @ApiStatus.Internal
    public SetDefaultPriorityRequest(String id) {
        this.id = id;
    }

}
