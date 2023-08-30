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
 * IssueTypeSchemeUpdateDetails
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
    "defaultIssueTypeId",
    "description",
    "name"
})
@JsonTypeName("IssueTypeSchemeUpdateDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeSchemeUpdateDetails {

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

    /**
     * Constructs a validated instance of {@link IssueTypeSchemeUpdateDetails}.
     *
     * @param spec the specification to process
     */
    public IssueTypeSchemeUpdateDetails(Consumer<IssueTypeSchemeUpdateDetails> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueTypeSchemeUpdateDetails}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueTypeSchemeUpdateDetails(Consumer)} instead.
     * @param defaultIssueTypeId The ID of the default issue type of the issue type scheme.
     * @param description The description of the issue type scheme. The maximum length is 4000 characters.
     * @param name The name of the issue type scheme. The name must be unique. The maximum length is 255 characters.
     */
    @ApiStatus.Internal
    public IssueTypeSchemeUpdateDetails(String defaultIssueTypeId, String description, String name) {
        this.defaultIssueTypeId = defaultIssueTypeId;
        this.description = description;
        this.name = name;
    }

}
