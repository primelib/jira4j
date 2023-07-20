package io.github.primelib.jira4j.restv2.model;

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
 * UiModificationContextDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "isAvailable",
    "issueTypeId",
    "projectId",
    "viewType"
})
@JsonTypeName("UiModificationContextDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UiModificationContextDetails {

    /**
     * Constructs a validated implementation of {@link UiModificationContextDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public UiModificationContextDetails(Consumer<UiModificationContextDetails> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the UI modification context.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Whether a context is available. For example, when a project is deleted the context becomes unavailable.
     */
    @JsonProperty("isAvailable")
    protected Boolean isAvailable;

    /**
     * The issue type ID of the context.
     */
    @JsonProperty("issueTypeId")
    protected String issueTypeId;

    /**
     * The project ID of the context.
     */
    @JsonProperty("projectId")
    protected String projectId;

    /**
     * The view type of the context. Only `GIC` (Global Issue Create) is supported.
     */
    @JsonProperty("viewType")
    protected String viewType;


}
