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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

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
     * The issue type ID of the context. Null is treated as a wildcard, meaning the UI modification will be applied to all issue types. Each UI modification context can have a maximum of one wildcard.
     */
    @JsonProperty("issueTypeId")
    protected String issueTypeId;

    /**
     * The project ID of the context. Null is treated as a wildcard, meaning the UI modification will be applied to all projects. Each UI modification context can have a maximum of one wildcard.
     */
    @JsonProperty("projectId")
    protected String projectId;

    /**
     * The view type of the context. Only {@code GIC}(Global Issue Create) and {@code IssueView} are supported. Null is treated as a wildcard, meaning the UI modification will be applied to all view types. Each UI modification context can have a maximum of one wildcard.
     */
    @JsonProperty("viewType")
    protected ViewTypeEnum viewType;

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
     * @param issueTypeId The issue type ID of the context. Null is treated as a wildcard, meaning the UI modification will be applied to all issue types. Each UI modification context can have a maximum of one wildcard.
     * @param projectId The project ID of the context. Null is treated as a wildcard, meaning the UI modification will be applied to all projects. Each UI modification context can have a maximum of one wildcard.
     * @param viewType The view type of the context. Only {@code GIC}(Global Issue Create) and {@code IssueView} are supported. Null is treated as a wildcard, meaning the UI modification will be applied to all view types. Each UI modification context can have a maximum of one wildcard.
     */
    @ApiStatus.Internal
    public UiModificationContextDetails(String id, Boolean isAvailable, String issueTypeId, String projectId, ViewTypeEnum viewType) {
        this.id = id;
        this.isAvailable = isAvailable;
        this.issueTypeId = issueTypeId;
        this.projectId = projectId;
        this.viewType = viewType;
    }

    /**
     * The view type of the context. Only {@code GIC}(Global Issue Create) and {@code IssueView} are supported. Null is treated as a wildcard, meaning the UI modification will be applied to all view types. Each UI modification context can have a maximum of one wildcard.
     */
    @AllArgsConstructor
    public enum ViewTypeEnum {
        GIC("GIC"),
        ISSUEVIEW("IssueView");

        private static final ViewTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ViewTypeEnum of(String input) {
            if (input != null) {
                for (ViewTypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
