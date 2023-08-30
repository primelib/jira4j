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
 * UiModificationContextDetails
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
     * The view type of the context. Only {@code GIC} (Global Issue Create) is supported.
     */
    @JsonProperty("viewType")
    protected String viewType;

    /**
     * Constructs a validated instance of {@link UiModificationContextDetails}.
     *
     * @param spec the specification to process
     */
    public UiModificationContextDetails(Consumer<UiModificationContextDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UiModificationContextDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UiModificationContextDetails(Consumer)} instead.
     * @param id The ID of the UI modification context.
     * @param isAvailable Whether a context is available. For example, when a project is deleted the context becomes unavailable.
     * @param issueTypeId The issue type ID of the context.
     * @param projectId The project ID of the context.
     * @param viewType The view type of the context. Only {@code GIC} (Global Issue Create) is supported.
     */
    @ApiStatus.Internal
    public UiModificationContextDetails(String id, Boolean isAvailable, String issueTypeId, String projectId, String viewType) {
        this.id = id;
        this.isAvailable = isAvailable;
        this.issueTypeId = issueTypeId;
        this.projectId = projectId;
        this.viewType = viewType;
    }

}
