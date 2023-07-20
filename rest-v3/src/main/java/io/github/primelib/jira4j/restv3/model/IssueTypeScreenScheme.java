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
 * IssueTypeScreenScheme
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "description",
    "id",
    "name"
})
@JsonTypeName("IssueTypeScreenScheme")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeScreenScheme {

    /**
     * Constructs a validated implementation of {@link IssueTypeScreenScheme}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueTypeScreenScheme(Consumer<IssueTypeScreenScheme> spec) {
        spec.accept(this);
    }

    /**
     * The description of the issue type screen scheme.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of the issue type screen scheme.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The name of the issue type screen scheme.
     */
    @JsonProperty("name")
    protected String name;


}
