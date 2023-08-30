package io.github.primelib.jira4j.restv3.model;

import java.util.Map;
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
 * StatusMapping
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
    "issueTypeId",
    "newStatusId",
    "statusId"
})
@JsonTypeName("StatusMapping")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusMapping {

    /**
     * The ID of the issue type.
     */
    @JsonProperty("issueTypeId")
    protected String issueTypeId;

    /**
     * The ID of the new status.
     */
    @JsonProperty("newStatusId")
    protected String newStatusId;

    /**
     * The ID of the status.
     */
    @JsonProperty("statusId")
    protected String statusId;

    /**
     * Constructs a validated instance of {@link StatusMapping}.
     *
     * @param spec the specification to process
     */
    public StatusMapping(Consumer<StatusMapping> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StatusMapping}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StatusMapping(Consumer)} instead.
     * @param issueTypeId The ID of the issue type.
     * @param newStatusId The ID of the new status.
     * @param statusId The ID of the status.
     */
    @ApiStatus.Internal
    public StatusMapping(String issueTypeId, String newStatusId, String statusId) {
        this.issueTypeId = issueTypeId;
        this.newStatusId = newStatusId;
        this.statusId = statusId;
    }

}
