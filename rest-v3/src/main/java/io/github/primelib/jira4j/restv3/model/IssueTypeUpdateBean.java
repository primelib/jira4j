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
 * IssueTypeUpdateBean
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
    "description",
    "name"
})
@JsonTypeName("IssueTypeUpdateBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeUpdateBean {

    /**
     * The ID of an issue type avatar.
     */
    @JsonProperty("avatarId")
    protected Long avatarId;

    /**
     * The description of the issue type.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The unique name for the issue type. The maximum length is 60 characters.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Constructs a validated instance of {@link IssueTypeUpdateBean}.
     *
     * @param spec the specification to process
     */
    public IssueTypeUpdateBean(Consumer<IssueTypeUpdateBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueTypeUpdateBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueTypeUpdateBean(Consumer)} instead.
     * @param avatarId The ID of an issue type avatar.
     * @param description The description of the issue type.
     * @param name The unique name for the issue type. The maximum length is 60 characters.
     */
    @ApiStatus.Internal
    public IssueTypeUpdateBean(Long avatarId, String description, String name) {
        this.avatarId = avatarId;
        this.description = description;
        this.name = name;
    }

}
