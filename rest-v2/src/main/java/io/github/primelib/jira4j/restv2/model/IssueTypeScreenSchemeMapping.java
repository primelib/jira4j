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
 * IssueTypeScreenSchemeMapping
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
    "screenSchemeId"
})
@JsonTypeName("IssueTypeScreenSchemeMapping")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeScreenSchemeMapping {

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

    /**
     * Constructs a validated instance of {@link IssueTypeScreenSchemeMapping}.
     *
     * @param spec the specification to process
     */
    public IssueTypeScreenSchemeMapping(Consumer<IssueTypeScreenSchemeMapping> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueTypeScreenSchemeMapping}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueTypeScreenSchemeMapping(Consumer)} instead.
     * @param issueTypeId The ID of the issue type or *default*. Only issue types used in classic projects are accepted. An entry for *default* must be provided and defines the mapping for all issue types without a screen scheme.
     * @param screenSchemeId The ID of the screen scheme. Only screen schemes used in classic projects are accepted.
     */
    @ApiStatus.Internal
    public IssueTypeScreenSchemeMapping(String issueTypeId, String screenSchemeId) {
        this.issueTypeId = issueTypeId;
        this.screenSchemeId = screenSchemeId;
    }

}
