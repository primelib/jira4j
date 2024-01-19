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
 * IssueTypeInfo
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
    "avatarId",
    "id",
    "name"
})
@JsonTypeName("IssueTypeInfo")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeInfo {

    /**
     * The avatar of the issue type.
     */
    @JsonProperty("avatarId")
    protected Long avatarId;

    /**
     * The ID of the issue type.
     */
    @JsonProperty("id")
    protected Long id;

    /**
     * The name of the issue type.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link IssueTypeInfo}.
     *
     * @param spec the specification to process
     */
    public IssueTypeInfo(Consumer<IssueTypeInfo> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueTypeInfo}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueTypeInfo(Consumer)} instead.
     * @param avatarId The avatar of the issue type.
     * @param id The ID of the issue type.
     * @param name The name of the issue type.
     */
    @ApiStatus.Internal
    public IssueTypeInfo(Long avatarId, Long id, String name) {
        this.avatarId = avatarId;
        this.id = id;
        this.name = name;
    }

}
