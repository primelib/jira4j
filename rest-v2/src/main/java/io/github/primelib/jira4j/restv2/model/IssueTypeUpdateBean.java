package io.github.primelib.jira4j.restv2.model;

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
 * IssueTypeUpdateBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "avatarId",
    "description",
    "name"
})
@JsonTypeName("IssueTypeUpdateBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeUpdateBean {

    /**
     * Constructs a validated implementation of {@link IssueTypeUpdateBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueTypeUpdateBean(Consumer<IssueTypeUpdateBean> spec) {
        spec.accept(this);
    }

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


}
