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
 * IssueTypeSchemeID
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
    "issueTypeSchemeId"
})
@JsonTypeName("IssueTypeSchemeID")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeSchemeID {

    /**
     * The ID of the issue type scheme.
     */
    @JsonProperty("issueTypeSchemeId")
    protected String issueTypeSchemeId;

    /**
     * Constructs a validated instance of {@link IssueTypeSchemeID}.
     *
     * @param spec the specification to process
     */
    public IssueTypeSchemeID(Consumer<IssueTypeSchemeID> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueTypeSchemeID}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueTypeSchemeID(Consumer)} instead.
     * @param issueTypeSchemeId The ID of the issue type scheme.
     */
    @ApiStatus.Internal
    public IssueTypeSchemeID(String issueTypeSchemeId) {
        this.issueTypeSchemeId = issueTypeSchemeId;
    }

}
