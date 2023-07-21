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
 * IssueTypeScreenSchemeItem
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
    "issueTypeScreenSchemeId",
    "screenSchemeId"
})
@JsonTypeName("IssueTypeScreenSchemeItem")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeScreenSchemeItem {

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

    /**
     * Constructs a validated instance of {@link IssueTypeScreenSchemeItem}.
     *
     * @param spec the specification to process
     */
    public IssueTypeScreenSchemeItem(Consumer<IssueTypeScreenSchemeItem> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueTypeScreenSchemeItem}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueTypeScreenSchemeItem(Consumer)} instead.
     * @param issueTypeId The ID of the issue type or *default*. Only issue types used in classic projects are accepted. When creating an issue screen scheme, an entry for *default* must be provided and defines the mapping for all issue types without a screen scheme. Otherwise, a *default* entry can't be provided.
     * @param issueTypeScreenSchemeId The ID of the issue type screen scheme.
     * @param screenSchemeId The ID of the screen scheme.
     */
    @ApiStatus.Internal
    public IssueTypeScreenSchemeItem(String issueTypeId, String issueTypeScreenSchemeId, String screenSchemeId) {
        this.issueTypeId = issueTypeId;
        this.issueTypeScreenSchemeId = issueTypeScreenSchemeId;
        this.screenSchemeId = screenSchemeId;
    }

}
