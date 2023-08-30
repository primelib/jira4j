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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueTypeScreenSchemeMappingDetails
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
    "issueTypeMappings"
})
@JsonTypeName("IssueTypeScreenSchemeMappingDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeScreenSchemeMappingDetails {

    /**
     * The list of issue type to screen scheme mappings. A *default* entry cannot be specified because a default entry is added when an issue type screen scheme is created.
     */
    @JsonProperty("issueTypeMappings")
    protected List<IssueTypeScreenSchemeMapping> issueTypeMappings;

    /**
     * Constructs a validated instance of {@link IssueTypeScreenSchemeMappingDetails}.
     *
     * @param spec the specification to process
     */
    public IssueTypeScreenSchemeMappingDetails(Consumer<IssueTypeScreenSchemeMappingDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueTypeScreenSchemeMappingDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueTypeScreenSchemeMappingDetails(Consumer)} instead.
     * @param issueTypeMappings The list of issue type to screen scheme mappings. A *default* entry cannot be specified because a default entry is added when an issue type screen scheme is created.
     */
    @ApiStatus.Internal
    public IssueTypeScreenSchemeMappingDetails(List<IssueTypeScreenSchemeMapping> issueTypeMappings) {
        this.issueTypeMappings = issueTypeMappings;
    }

}
