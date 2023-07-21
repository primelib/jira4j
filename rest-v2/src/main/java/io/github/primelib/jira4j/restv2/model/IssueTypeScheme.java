package io.github.primelib.jira4j.restv2.model;

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
 * IssueTypeScheme
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
    "id",
    "isDefault",
    "name"
})
@JsonTypeName("IssueTypeScheme")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeScheme {

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

    /**
     * Constructs a validated instance of {@link IssueTypeScheme}.
     *
     * @param spec the specification to process
     */
    public IssueTypeScheme(Consumer<IssueTypeScheme> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueTypeScheme}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueTypeScheme(Consumer)} instead.
     * @param defaultIssueTypeId The ID of the default issue type of the issue type scheme.
     * @param description The description of the issue type scheme.
     * @param id The ID of the issue type scheme.
     * @param isDefault Whether the issue type scheme is the default.
     * @param name The name of the issue type scheme.
     */
    @ApiStatus.Internal
    public IssueTypeScheme(String defaultIssueTypeId, String description, String id, Boolean isDefault, String name) {
        this.defaultIssueTypeId = defaultIssueTypeId;
        this.description = description;
        this.id = id;
        this.isDefault = isDefault;
        this.name = name;
    }

}
