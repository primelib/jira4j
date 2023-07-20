package io.github.primelib.jira4j.restv3.model;

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
 * IssueTypeSchemeUpdateDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "defaultIssueTypeId",
    "description",
    "name"
})
@JsonTypeName("IssueTypeSchemeUpdateDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeSchemeUpdateDetails {

    /**
     * Constructs a validated implementation of {@link IssueTypeSchemeUpdateDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueTypeSchemeUpdateDetails(Consumer<IssueTypeSchemeUpdateDetails> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the default issue type of the issue type scheme.
     */
    @JsonProperty("defaultIssueTypeId")
    protected String defaultIssueTypeId;

    /**
     * The description of the issue type scheme. The maximum length is 4000 characters.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The name of the issue type scheme. The name must be unique. The maximum length is 255 characters.
     */
    @JsonProperty("name")
    protected String name;


}
