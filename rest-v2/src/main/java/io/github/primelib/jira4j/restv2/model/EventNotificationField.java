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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EventNotificationField
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
    "clauseNames",
    "custom",
    "id",
    "key",
    "name",
    "navigable",
    "orderable",
    "schema",
    "scope",
    "searchable"
})
@JsonTypeName("EventNotification_field")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EventNotificationField {

    /**
     * The names that can be used to reference the field in an advanced search. For more information, see [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ).
     */
    @JsonProperty("clauseNames")
    protected Set<String> clauseNames;

    /**
     * Whether the field is a custom field.
     */
    @JsonProperty("custom")
    protected Boolean custom;

    /**
     * The ID of the field.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The key of the field.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * The name of the field.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Whether the field can be used as a column on the issue navigator.
     */
    @JsonProperty("navigable")
    protected Boolean navigable;

    /**
     * Whether the content of the field can be used to order lists.
     */
    @JsonProperty("orderable")
    protected Boolean orderable;

    @JsonProperty("schema")
    protected FieldDetailsSchema schema;

    @JsonProperty("scope")
    protected FieldDetailsScope scope;

    /**
     * Whether the content of the field can be searched.
     */
    @JsonProperty("searchable")
    protected Boolean searchable;

    /**
     * Constructs a validated instance of {@link EventNotificationField}.
     *
     * @param spec the specification to process
     */
    public EventNotificationField(Consumer<EventNotificationField> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link EventNotificationField}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #EventNotificationField(Consumer)} instead.
     * @param clauseNames The names that can be used to reference the field in an advanced search. For more information, see [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ).
     * @param custom Whether the field is a custom field.
     * @param id The ID of the field.
     * @param key The key of the field.
     * @param name The name of the field.
     * @param navigable Whether the field can be used as a column on the issue navigator.
     * @param orderable Whether the content of the field can be used to order lists.
     * @param schema schema
     * @param scope scope
     * @param searchable Whether the content of the field can be searched.
     */
    @ApiStatus.Internal
    public EventNotificationField(Set<String> clauseNames, Boolean custom, String id, String key, String name, Boolean navigable, Boolean orderable, FieldDetailsSchema schema, FieldDetailsScope scope, Boolean searchable) {
        this.clauseNames = clauseNames;
        this.custom = custom;
        this.id = id;
        this.key = key;
        this.name = name;
        this.navigable = navigable;
        this.orderable = orderable;
        this.schema = schema;
        this.scope = scope;
        this.searchable = searchable;
    }

}
