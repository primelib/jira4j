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
 * WorkManagementNavigationInfo
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
    "boardName"
})
@JsonTypeName("WorkManagementNavigationInfo")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorkManagementNavigationInfo {

    @JsonProperty("boardName")
    protected String boardName;

    /**
     * Constructs a validated instance of {@link WorkManagementNavigationInfo}.
     *
     * @param spec the specification to process
     */
    public WorkManagementNavigationInfo(Consumer<WorkManagementNavigationInfo> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorkManagementNavigationInfo}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorkManagementNavigationInfo(Consumer)} instead.
     * @param boardName boardName
     */
    @ApiStatus.Internal
    public WorkManagementNavigationInfo(String boardName) {
        this.boardName = boardName;
    }

}
