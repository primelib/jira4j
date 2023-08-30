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
 * IssueSecurityLevelMember
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
    "holder",
    "id",
    "issueSecurityLevelId"
})
@JsonTypeName("IssueSecurityLevelMember")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueSecurityLevelMember {

    @JsonProperty("holder")
    protected PermissionHolder holder;

    /**
     * The ID of the issue security level member.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The ID of the issue security level.
     */
    @JsonProperty("issueSecurityLevelId")
    protected Long issueSecurityLevelId;

    /**
     * Constructs a validated instance of {@link IssueSecurityLevelMember}.
     *
     * @param spec the specification to process
     */
    public IssueSecurityLevelMember(Consumer<IssueSecurityLevelMember> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueSecurityLevelMember}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueSecurityLevelMember(Consumer)} instead.
     * @param holder holder
     * @param id The ID of the issue security level member.
     * @param issueSecurityLevelId The ID of the issue security level.
     */
    @ApiStatus.Internal
    public IssueSecurityLevelMember(PermissionHolder holder, Long id, Long issueSecurityLevelId) {
        this.holder = holder;
        this.id = id;
        this.issueSecurityLevelId = issueSecurityLevelId;
    }

}
