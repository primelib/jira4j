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
 * IssueTypeScreenScheme
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
    "description",
    "id",
    "name"
})
@JsonTypeName("IssueTypeScreenScheme")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueTypeScreenScheme {

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

    /**
     * Constructs a validated instance of {@link IssueTypeScreenScheme}.
     *
     * @param spec the specification to process
     */
    public IssueTypeScreenScheme(Consumer<IssueTypeScreenScheme> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueTypeScreenScheme}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueTypeScreenScheme(Consumer)} instead.
     * @param description The description of the issue type screen scheme.
     * @param id The ID of the issue type screen scheme.
     * @param name The name of the issue type screen scheme.
     */
    @ApiStatus.Internal
    public IssueTypeScreenScheme(String description, String id, String name) {
        this.description = description;
        this.id = id;
        this.name = name;
    }

}
