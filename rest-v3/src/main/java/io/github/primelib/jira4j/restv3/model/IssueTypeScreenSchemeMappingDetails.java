package io.github.primelib.jira4j.restv3.model;

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
 * IssueTypeScreenSchemeMappingDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "issueTypeMappings"
})
@JsonTypeName("IssueTypeScreenSchemeMappingDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeScreenSchemeMappingDetails {

    /**
     * Constructs a validated implementation of {@link IssueTypeScreenSchemeMappingDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueTypeScreenSchemeMappingDetails(Consumer<IssueTypeScreenSchemeMappingDetails> spec) {
        spec.accept(this);
    }

    /**
     * The list of issue type to screen scheme mappings. A *default* entry cannot be specified because a default entry is added when an issue type screen scheme is created.
     */
    @JsonProperty("issueTypeMappings")
    protected List<IssueTypeScreenSchemeMapping> issueTypeMappings = new ArrayList<>();


}
