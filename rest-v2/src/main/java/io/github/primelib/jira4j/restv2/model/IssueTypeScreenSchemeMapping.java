package io.github.primelib.jira4j.restv2.model;

import java.util.Map;
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
 * IssueTypeScreenSchemeMapping
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "issueTypeId",
    "screenSchemeId"
})
@JsonTypeName("IssueTypeScreenSchemeMapping")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeScreenSchemeMapping {

    /**
     * Constructs a validated implementation of {@link IssueTypeScreenSchemeMapping}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueTypeScreenSchemeMapping(Consumer<IssueTypeScreenSchemeMapping> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the issue type or *default*. Only issue types used in classic projects are accepted. An entry for *default* must be provided and defines the mapping for all issue types without a screen scheme.
     */
    @JsonProperty("issueTypeId")
    protected String issueTypeId;

    /**
     * The ID of the screen scheme. Only screen schemes used in classic projects are accepted.
     */
    @JsonProperty("screenSchemeId")
    protected String screenSchemeId;


}
