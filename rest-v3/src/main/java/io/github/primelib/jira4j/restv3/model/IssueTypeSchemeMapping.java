package io.github.primelib.jira4j.restv3.model;

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
 * IssueTypeSchemeMapping
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
    "issueTypeId",
    "issueTypeSchemeId"
})
@JsonTypeName("IssueTypeSchemeMapping")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeSchemeMapping {

    /**
     * The ID of the issue type.
     */
    @JsonProperty("issueTypeId")
    protected String issueTypeId;

    /**
     * The ID of the issue type scheme.
     */
    @JsonProperty("issueTypeSchemeId")
    protected String issueTypeSchemeId;

    /**
     * Constructs a validated instance of {@link IssueTypeSchemeMapping}.
     *
     * @param spec the specification to process
     */
    public IssueTypeSchemeMapping(Consumer<IssueTypeSchemeMapping> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueTypeSchemeMapping}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueTypeSchemeMapping(Consumer)} instead.
     * @param issueTypeId The ID of the issue type.
     * @param issueTypeSchemeId The ID of the issue type scheme.
     */
    @ApiStatus.Internal
    public IssueTypeSchemeMapping(String issueTypeId, String issueTypeSchemeId) {
        this.issueTypeId = issueTypeId;
        this.issueTypeSchemeId = issueTypeSchemeId;
    }

}
