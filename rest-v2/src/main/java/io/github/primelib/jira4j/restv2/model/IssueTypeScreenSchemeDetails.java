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

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueTypeScreenSchemeDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "issueTypeMappings",
    "name"
})
@JsonTypeName("IssueTypeScreenSchemeDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeScreenSchemeDetails {

    /**
     * Constructs a validated implementation of {@link IssueTypeScreenSchemeDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueTypeScreenSchemeDetails(Consumer<IssueTypeScreenSchemeDetails> spec) {
        spec.accept(this);
    }

    /**
     * The description of the issue type screen scheme. The maximum length is 255 characters.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The IDs of the screen schemes for the issue type IDs and *default*. A *default* entry is required to create an issue type screen scheme, it defines the mapping for all issue types without a screen scheme.
     */
    @JsonProperty("issueTypeMappings")
    protected List<IssueTypeScreenSchemeMapping> issueTypeMappings = new ArrayList<>();

    /**
     * The name of the issue type screen scheme. The name must be unique. The maximum length is 255 characters.
     */
    @JsonProperty("name")
    protected String name;


}
