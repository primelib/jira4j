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
 * SecurityLevelMember
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
    "issueSecurityLevelId",
    "issueSecuritySchemeId"
})
@JsonTypeName("SecurityLevelMember")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SecurityLevelMember {

    @JsonProperty("holder")
    protected SecurityLevelMemberHolder holder;

    /**
     * The ID of the issue security level member.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The ID of the issue security level.
     */
    @JsonProperty("issueSecurityLevelId")
    protected String issueSecurityLevelId;

    /**
     * The ID of the issue security scheme.
     */
    @JsonProperty("issueSecuritySchemeId")
    protected String issueSecuritySchemeId;

    /**
     * Constructs a validated instance of {@link SecurityLevelMember}.
     *
     * @param spec the specification to process
     */
    public SecurityLevelMember(Consumer<SecurityLevelMember> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SecurityLevelMember}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SecurityLevelMember(Consumer)} instead.
     * @param holder holder
     * @param id The ID of the issue security level member.
     * @param issueSecurityLevelId The ID of the issue security level.
     * @param issueSecuritySchemeId The ID of the issue security scheme.
     */
    @ApiStatus.Internal
    public SecurityLevelMember(SecurityLevelMemberHolder holder, String id, String issueSecurityLevelId, String issueSecuritySchemeId) {
        this.holder = holder;
        this.id = id;
        this.issueSecurityLevelId = issueSecurityLevelId;
        this.issueSecuritySchemeId = issueSecuritySchemeId;
    }

}
