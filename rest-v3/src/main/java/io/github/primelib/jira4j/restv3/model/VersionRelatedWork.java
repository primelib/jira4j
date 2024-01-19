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

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VersionRelatedWork
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
    "category",
    "issueId",
    "relatedWorkId",
    "title",
    "url"
})
@JsonTypeName("VersionRelatedWork")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class VersionRelatedWork {

    /**
     * The category of the related work
     */
    @JsonProperty("category")
    protected String category;

    /**
     * The title of the related work
     */
    @JsonProperty("issueId")
    protected Long issueId;

    /**
     * The id of the related work. For the native release note related work item, this will be null, and Rest API does not support updating it.
     */
    @JsonProperty("relatedWorkId")
    protected String relatedWorkId;

    /**
     * The title of the related work
     */
    @JsonProperty("title")
    protected String title;

    /**
     * The URL of the related work
     */
    @JsonProperty("url")
    protected URI url;

    /**
     * Constructs a validated instance of {@link VersionRelatedWork}.
     *
     * @param spec the specification to process
     */
    public VersionRelatedWork(Consumer<VersionRelatedWork> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link VersionRelatedWork}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #VersionRelatedWork(Consumer)} instead.
     * @param category The category of the related work
     * @param issueId The title of the related work
     * @param relatedWorkId The id of the related work. For the native release note related work item, this will be null, and Rest API does not support updating it.
     * @param title The title of the related work
     * @param url The URL of the related work
     */
    @ApiStatus.Internal
    public VersionRelatedWork(String category, Long issueId, String relatedWorkId, String title, URI url) {
        this.category = category;
        this.issueId = issueId;
        this.relatedWorkId = relatedWorkId;
        this.title = title;
        this.url = url;
    }

}
