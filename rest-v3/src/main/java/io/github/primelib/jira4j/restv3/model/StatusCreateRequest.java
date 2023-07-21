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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StatusCreateRequest
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
    "scope",
    "statuses"
})
@JsonTypeName("StatusCreateRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusCreateRequest {

    @JsonProperty("scope")
    protected StatusScope scope;

    /**
     * Details of the statuses being created.
     */
    @JsonProperty("statuses")
    protected List<StatusCreate> statuses;

    /**
     * Constructs a validated instance of {@link StatusCreateRequest}.
     *
     * @param spec the specification to process
     */
    public StatusCreateRequest(Consumer<StatusCreateRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StatusCreateRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StatusCreateRequest(Consumer)} instead.
     * @param scope var.name
     * @param statuses Details of the statuses being created.
     */
    @ApiStatus.Internal
    public StatusCreateRequest(StatusScope scope, List<StatusCreate> statuses) {
        this.scope = scope;
        this.statuses = statuses;
    }

}
