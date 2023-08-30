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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueTypeScreenSchemeDetails
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
    "description",
    "issueTypeMappings",
    "name"
})
@JsonTypeName("IssueTypeScreenSchemeDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeScreenSchemeDetails {

    /**
     * The description of the issue type screen scheme. The maximum length is 255 characters.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The IDs of the screen schemes for the issue type IDs and *default*. A *default* entry is required to create an issue type screen scheme, it defines the mapping for all issue types without a screen scheme.
     */
    @JsonProperty("issueTypeMappings")
    protected List<IssueTypeScreenSchemeMapping> issueTypeMappings;

    /**
     * The name of the issue type screen scheme. The name must be unique. The maximum length is 255 characters.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link IssueTypeScreenSchemeDetails}.
     *
     * @param spec the specification to process
     */
    public IssueTypeScreenSchemeDetails(Consumer<IssueTypeScreenSchemeDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueTypeScreenSchemeDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueTypeScreenSchemeDetails(Consumer)} instead.
     * @param description The description of the issue type screen scheme. The maximum length is 255 characters.
     * @param issueTypeMappings The IDs of the screen schemes for the issue type IDs and *default*. A *default* entry is required to create an issue type screen scheme, it defines the mapping for all issue types without a screen scheme.
     * @param name The name of the issue type screen scheme. The name must be unique. The maximum length is 255 characters.
     */
    @ApiStatus.Internal
    public IssueTypeScreenSchemeDetails(String description, List<IssueTypeScreenSchemeMapping> issueTypeMappings, String name) {
        this.description = description;
        this.issueTypeMappings = issueTypeMappings;
        this.name = name;
    }

}
