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
 * IssueTypeScreenSchemeItem
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "issueTypeId",
    "issueTypeScreenSchemeId",
    "screenSchemeId"
})
@JsonTypeName("IssueTypeScreenSchemeItem")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeScreenSchemeItem {

    /**
     * Constructs a validated implementation of {@link IssueTypeScreenSchemeItem}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueTypeScreenSchemeItem(Consumer<IssueTypeScreenSchemeItem> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the issue type or *default*. Only issue types used in classic projects are accepted. When creating an issue screen scheme, an entry for *default* must be provided and defines the mapping for all issue types without a screen scheme. Otherwise, a *default* entry can't be provided.
     */
    @JsonProperty("issueTypeId")
    protected String issueTypeId;

    /**
     * The ID of the issue type screen scheme.
     */
    @JsonProperty("issueTypeScreenSchemeId")
    protected String issueTypeScreenSchemeId;

    /**
     * The ID of the screen scheme.
     */
    @JsonProperty("screenSchemeId")
    protected String screenSchemeId;


}
