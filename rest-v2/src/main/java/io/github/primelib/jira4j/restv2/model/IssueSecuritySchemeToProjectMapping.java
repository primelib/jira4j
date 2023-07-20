package io.github.primelib.jira4j.restv2.model;

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
 * IssueSecuritySchemeToProjectMapping
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "issueSecuritySchemeId",
    "projectId"
})
@JsonTypeName("IssueSecuritySchemeToProjectMapping")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueSecuritySchemeToProjectMapping extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link IssueSecuritySchemeToProjectMapping}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueSecuritySchemeToProjectMapping(Consumer<IssueSecuritySchemeToProjectMapping> spec) {
        spec.accept(this);
    }

    @JsonProperty("issueSecuritySchemeId")
    protected String issueSecuritySchemeId;

    @JsonProperty("projectId")
    protected String projectId;


}
