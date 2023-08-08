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

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueLinkOutwardIssue
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
    "fields",
    "id",
    "key",
    "self"
})
@JsonTypeName("IssueLink_outwardIssue")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueLinkOutwardIssue {

    @JsonProperty("fields")
    protected LinkedIssueFields fields;

    /**
     * The ID of an issue. Required if {@code key} isn't provided.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The key of an issue. Required if {@code id} isn't provided.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * The URL of the issue.
     */
    @JsonProperty("self")
    protected URI self;

    /**
     * Constructs a validated instance of {@link IssueLinkOutwardIssue}.
     *
     * @param spec the specification to process
     */
    public IssueLinkOutwardIssue(Consumer<IssueLinkOutwardIssue> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueLinkOutwardIssue}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueLinkOutwardIssue(Consumer)} instead.
     * @param fields fields
     * @param id The ID of an issue. Required if {@code key} isn't provided.
     * @param key The key of an issue. Required if {@code id} isn't provided.
     * @param self The URL of the issue.
     */
    @ApiStatus.Internal
    public IssueLinkOutwardIssue(LinkedIssueFields fields, String id, String key, URI self) {
        this.fields = fields;
        this.id = id;
        this.key = key;
        this.self = self;
    }

}
