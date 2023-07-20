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
 * Field
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link Field}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Field(Consumer<Field> spec) {
        spec.accept(this);
    }

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


}
