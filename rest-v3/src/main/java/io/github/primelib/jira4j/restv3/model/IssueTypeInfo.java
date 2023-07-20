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
 * IssueTypeInfo
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "avatarId",
    "id",
    "name"
})
@JsonTypeName("IssueTypeInfo")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeInfo {

    /**
     * Constructs a validated implementation of {@link IssueTypeInfo}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueTypeInfo(Consumer<IssueTypeInfo> spec) {
        spec.accept(this);
    }

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


}
