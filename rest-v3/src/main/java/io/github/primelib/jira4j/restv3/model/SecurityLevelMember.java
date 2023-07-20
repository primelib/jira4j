package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SecurityLevelMember
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "holder",
    "id",
    "issueSecurityLevelId",
    "issueSecuritySchemeId"
})
@JsonTypeName("SecurityLevelMember")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SecurityLevelMember extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link SecurityLevelMember}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SecurityLevelMember(Consumer<SecurityLevelMember> spec) {
        spec.accept(this);
    }

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


}
