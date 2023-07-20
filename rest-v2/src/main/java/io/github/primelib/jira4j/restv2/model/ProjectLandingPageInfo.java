package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProjectLandingPageInfo
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link ProjectLandingPageInfo}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ProjectLandingPageInfo(Consumer<ProjectLandingPageInfo> spec) {
        spec.accept(this);
    }

    @JsonProperty("attributes")
    protected Map<String, String> attributes = new HashMap<>();

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


}
