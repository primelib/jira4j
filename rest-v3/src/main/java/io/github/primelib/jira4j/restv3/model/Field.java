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
 * Field
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
    "contextsCount",
    "description",
    "id",
    "isLocked",
    "isUnscreenable",
    "key",
    "lastUsed",
    "name",
    "projectsCount",
    "schema",
    "screensCount",
    "searcherKey"
})
@JsonTypeName("Field")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Field {

    /**
     * Number of contexts where the field is used.
     */
    @JsonProperty("contextsCount")
    protected Long contextsCount;

    /**
     * The description of the field.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The ID of the field.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Whether the field is locked.
     */
    @JsonProperty("isLocked")
    protected Boolean isLocked;

    /**
     * Whether the field is shown on screen or not.
     */
    @JsonProperty("isUnscreenable")
    protected Boolean isUnscreenable;

    /**
     * The key of the field.
     */
    @JsonProperty("key")
    protected String key;

    @JsonProperty("lastUsed")
    protected FieldLastUsed lastUsed;

    /**
     * The name of the field.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Number of projects where the field is used.
     */
    @JsonProperty("projectsCount")
    protected Long projectsCount;

    @JsonProperty("schema")
    protected JsonTypeBean schema;

    /**
     * Number of screens where the field is used.
     */
    @JsonProperty("screensCount")
    protected Long screensCount;

    /**
     * The searcher key of the field. Returned for custom fields.
     */
    @JsonProperty("searcherKey")
    protected String searcherKey;

    /**
     * Constructs a validated instance of {@link Field}.
     *
     * @param spec the specification to process
     */
    public Field(Consumer<Field> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Field}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Field(Consumer)} instead.
     * @param contextsCount Number of contexts where the field is used.
     * @param description The description of the field.
     * @param id The ID of the field.
     * @param isLocked Whether the field is locked.
     * @param isUnscreenable Whether the field is shown on screen or not.
     * @param key The key of the field.
     * @param lastUsed lastUsed
     * @param name The name of the field.
     * @param projectsCount Number of projects where the field is used.
     * @param schema schema
     * @param screensCount Number of screens where the field is used.
     * @param searcherKey The searcher key of the field. Returned for custom fields.
     */
    @ApiStatus.Internal
    public Field(Long contextsCount, String description, String id, Boolean isLocked, Boolean isUnscreenable, String key, FieldLastUsed lastUsed, String name, Long projectsCount, JsonTypeBean schema, Long screensCount, String searcherKey) {
        this.contextsCount = contextsCount;
        this.description = description;
        this.id = id;
        this.isLocked = isLocked;
        this.isUnscreenable = isUnscreenable;
        this.key = key;
        this.lastUsed = lastUsed;
        this.name = name;
        this.projectsCount = projectsCount;
        this.schema = schema;
        this.screensCount = screensCount;
        this.searcherKey = searcherKey;
    }

}
