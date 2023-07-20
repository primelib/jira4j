package io.github.primelib.jira4j.restv2.model;

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
 * IssueTypeSchemeID
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "issueTypeSchemeId"
})
@JsonTypeName("IssueTypeSchemeID")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeSchemeID {

    /**
     * Constructs a validated implementation of {@link IssueTypeSchemeID}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueTypeSchemeID(Consumer<IssueTypeSchemeID> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the issue type scheme.
     */
    @JsonProperty("issueTypeSchemeId")
    protected String issueTypeSchemeId;


}
