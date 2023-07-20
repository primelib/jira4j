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
 * IssueTypeScheme
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "defaultIssueTypeId",
    "description",
    "id",
    "isDefault",
    "name"
})
@JsonTypeName("IssueTypeScheme")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeScheme {

    /**
     * Constructs a validated implementation of {@link IssueTypeScheme}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueTypeScheme(Consumer<IssueTypeScheme> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the default issue type of the issue type scheme.
     */
    @JsonProperty("defaultIssueTypeId")
    protected String defaultIssueTypeId;

    /**
     * The description of the issue type scheme.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of the issue type scheme.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Whether the issue type scheme is the default.
     */
    @JsonProperty("isDefault")
    protected Boolean isDefault;

    /**
     * The name of the issue type scheme.
     */
    @JsonProperty("name")
    protected String name;


}
