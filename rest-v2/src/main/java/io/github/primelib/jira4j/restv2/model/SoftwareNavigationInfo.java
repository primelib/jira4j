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
 * SoftwareNavigationInfo
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
    "boardId",
    "boardName",
    "simpleBoard",
    "totalBoardsInProject"
})
@JsonTypeName("SoftwareNavigationInfo")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SoftwareNavigationInfo {

    @JsonProperty("boardId")
    protected Long boardId;

    @JsonProperty("boardName")
    protected String boardName;

    @JsonProperty("simpleBoard")
    protected Boolean simpleBoard;

    @JsonProperty("totalBoardsInProject")
    protected Long totalBoardsInProject;

    /**
     * Constructs a validated instance of {@link SoftwareNavigationInfo}.
     *
     * @param spec the specification to process
     */
    public SoftwareNavigationInfo(Consumer<SoftwareNavigationInfo> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link SoftwareNavigationInfo}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #SoftwareNavigationInfo(Consumer)} instead.
     * @param boardId var.name
     * @param boardName var.name
     * @param simpleBoard var.name
     * @param totalBoardsInProject var.name
     */
    @ApiStatus.Internal
    public SoftwareNavigationInfo(Long boardId, String boardName, Boolean simpleBoard, Long totalBoardsInProject) {
        this.boardId = boardId;
        this.boardName = boardName;
        this.simpleBoard = simpleBoard;
        this.totalBoardsInProject = totalBoardsInProject;
    }

}
