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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProjectLandingPageInfo
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
    "attributes",
    "boardId",
    "boardName",
    "projectKey",
    "projectType",
    "queueCategory",
    "queueId",
    "queueName",
    "simpleBoard",
    "simplified",
    "url"
})
@JsonTypeName("Project_landingPageInfo")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectLandingPageInfo {

    @JsonProperty("attributes")
    protected Map<String, String> attributes;

    @JsonProperty("boardId")
    protected Long boardId;

    @JsonProperty("boardName")
    protected String boardName;

    @JsonProperty("projectKey")
    protected String projectKey;

    @JsonProperty("projectType")
    protected String projectType;

    @JsonProperty("queueCategory")
    protected String queueCategory;

    @JsonProperty("queueId")
    protected Long queueId;

    @JsonProperty("queueName")
    protected String queueName;

    @JsonProperty("simpleBoard")
    protected Boolean simpleBoard;

    @JsonProperty("simplified")
    protected Boolean simplified;

    @JsonProperty("url")
    protected String url;

    /**
     * Constructs a validated instance of {@link ProjectLandingPageInfo}.
     *
     * @param spec the specification to process
     */
    public ProjectLandingPageInfo(Consumer<ProjectLandingPageInfo> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ProjectLandingPageInfo}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ProjectLandingPageInfo(Consumer)} instead.
     * @param attributes attributes
     * @param boardId boardId
     * @param boardName boardName
     * @param projectKey projectKey
     * @param projectType projectType
     * @param queueCategory queueCategory
     * @param queueId queueId
     * @param queueName queueName
     * @param simpleBoard simpleBoard
     * @param simplified simplified
     * @param url url
     */
    @ApiStatus.Internal
    public ProjectLandingPageInfo(Map<String, String> attributes, Long boardId, String boardName, String projectKey, String projectType, String queueCategory, Long queueId, String queueName, Boolean simpleBoard, Boolean simplified, String url) {
        this.attributes = attributes;
        this.boardId = boardId;
        this.boardName = boardName;
        this.projectKey = projectKey;
        this.projectType = projectType;
        this.queueCategory = queueCategory;
        this.queueId = queueId;
        this.queueName = queueName;
        this.simpleBoard = simpleBoard;
        this.simplified = simplified;
        this.url = url;
    }

}
