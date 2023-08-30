package io.github.primelib.jira4j.restv2.model;

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
 * IssueSecuritySchemeToProjectMapping
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
    "issueSecuritySchemeId",
    "projectId"
})
@JsonTypeName("IssueSecuritySchemeToProjectMapping")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueSecuritySchemeToProjectMapping {

    @JsonProperty("issueSecuritySchemeId")
    protected String issueSecuritySchemeId;

    @JsonProperty("projectId")
    protected String projectId;

    /**
     * Constructs a validated instance of {@link IssueSecuritySchemeToProjectMapping}.
     *
     * @param spec the specification to process
     */
    public IssueSecuritySchemeToProjectMapping(Consumer<IssueSecuritySchemeToProjectMapping> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueSecuritySchemeToProjectMapping}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueSecuritySchemeToProjectMapping(Consumer)} instead.
     * @param issueSecuritySchemeId issueSecuritySchemeId
     * @param projectId projectId
     */
    @ApiStatus.Internal
    public IssueSecuritySchemeToProjectMapping(String issueSecuritySchemeId, String projectId) {
        this.issueSecuritySchemeId = issueSecuritySchemeId;
        this.projectId = projectId;
    }

}
