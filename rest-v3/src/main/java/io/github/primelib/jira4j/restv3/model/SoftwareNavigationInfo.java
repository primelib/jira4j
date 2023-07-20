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
 * SoftwareNavigationInfo
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "boardId",
    "boardName",
    "simpleBoard",
    "totalBoardsInProject"
})
@JsonTypeName("SoftwareNavigationInfo")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class SoftwareNavigationInfo {

    /**
     * Constructs a validated implementation of {@link SoftwareNavigationInfo}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public SoftwareNavigationInfo(Consumer<SoftwareNavigationInfo> spec) {
        spec.accept(this);
    }

    @JsonProperty("boardId")
    protected Long boardId;

    @JsonProperty("boardName")
    protected String boardName;

    @JsonProperty("simpleBoard")
    protected Boolean simpleBoard;

    @JsonProperty("totalBoardsInProject")
    protected Long totalBoardsInProject;


}
