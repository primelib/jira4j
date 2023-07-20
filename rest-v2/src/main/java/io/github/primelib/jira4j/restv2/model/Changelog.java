package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Changelog
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "author",
    "created",
    "historyMetadata",
    "id",
    "items"
})
@JsonTypeName("Changelog")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Changelog {

    /**
     * Constructs a validated implementation of {@link Changelog}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Changelog(Consumer<Changelog> spec) {
        spec.accept(this);
    }

    @JsonProperty("author")
    protected ChangelogAuthor author;

    /**
     * The date on which the change took place.
     */
    @JsonProperty("created")
    protected OffsetDateTime created;

    @JsonProperty("historyMetadata")
    protected ChangelogHistoryMetadata historyMetadata;

    /**
     * The ID of the changelog.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The list of items changed.
     */
    @JsonProperty("items")
    protected List<ChangeDetails> items;


}
