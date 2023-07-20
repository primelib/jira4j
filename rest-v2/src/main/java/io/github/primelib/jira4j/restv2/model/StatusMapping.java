package io.github.primelib.jira4j.restv2.model;

import java.util.Map;
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
 * StatusMapping
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "issueTypeId",
    "newStatusId",
    "statusId"
})
@JsonTypeName("StatusMapping")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusMapping {

    /**
     * Constructs a validated implementation of {@link StatusMapping}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public StatusMapping(Consumer<StatusMapping> spec) {
        spec.accept(this);
    }

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


}
