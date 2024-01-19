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
 * VersionApprover
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
    "accountId",
    "declineReason",
    "description",
    "status"
})
@JsonTypeName("VersionApprover")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class VersionApprover {

    /**
     * The Atlassian account ID of the approver.
     */
    @JsonProperty("accountId")
    protected String accountId;

    /**
     * A description of why the user is declining the approval.
     */
    @JsonProperty("declineReason")
    protected String declineReason;

    /**
     * A description of what the user is approving within the specified version.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The status of the approval, which can be *PENDING*, *APPROVED*, or *DECLINED*
     */
    @JsonProperty("status")
    protected String status;

    /**
     * Constructs a validated instance of {@link VersionApprover}.
     *
     * @param spec the specification to process
     */
    public VersionApprover(Consumer<VersionApprover> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link VersionApprover}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #VersionApprover(Consumer)} instead.
     * @param accountId The Atlassian account ID of the approver.
     * @param declineReason A description of why the user is declining the approval.
     * @param description A description of what the user is approving within the specified version.
     * @param status The status of the approval, which can be *PENDING*, *APPROVED*, or *DECLINED*
     */
    @ApiStatus.Internal
    public VersionApprover(String accountId, String declineReason, String description, String status) {
        this.accountId = accountId;
        this.declineReason = declineReason;
        this.description = description;
        this.status = status;
    }

}
