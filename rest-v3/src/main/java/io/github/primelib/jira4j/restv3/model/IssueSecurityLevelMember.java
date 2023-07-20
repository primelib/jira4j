package io.github.primelib.jira4j.restv3.model;

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
 * IssueSecurityLevelMember
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "holder",
    "id",
    "issueSecurityLevelId"
})
@JsonTypeName("IssueSecurityLevelMember")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueSecurityLevelMember {

    /**
     * Constructs a validated implementation of {@link IssueSecurityLevelMember}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueSecurityLevelMember(Consumer<IssueSecurityLevelMember> spec) {
        spec.accept(this);
    }

    @JsonProperty("holder")
    protected IssueSecurityLevelMemberHolder holder;

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


}
