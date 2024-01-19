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

import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Changelog
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
    "author",
    "created",
    "historyMetadata",
    "id",
    "items"
})
@JsonTypeName("Changelog")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Changelog {

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

    /**
     * Constructs a validated instance of {@link Changelog}.
     *
     * @param spec the specification to process
     */
    public Changelog(Consumer<Changelog> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Changelog}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Changelog(Consumer)} instead.
     * @param author author
     * @param created The date on which the change took place.
     * @param historyMetadata historyMetadata
     * @param id The ID of the changelog.
     * @param items The list of items changed.
     */
    @ApiStatus.Internal
    public Changelog(ChangelogAuthor author, OffsetDateTime created, ChangelogHistoryMetadata historyMetadata, String id, List<ChangeDetails> items) {
        this.author = author;
        this.created = created;
        this.historyMetadata = historyMetadata;
        this.id = id;
        this.items = items;
    }

}
