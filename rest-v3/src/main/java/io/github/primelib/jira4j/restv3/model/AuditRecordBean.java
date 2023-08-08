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

import java.time.OffsetDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AuditRecordBean
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
    "associatedItems",
    "authorKey",
    "category",
    "changedValues",
    "created",
    "description",
    "eventSource",
    "id",
    "objectItem",
    "remoteAddress",
    "summary"
})
@JsonTypeName("AuditRecordBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AuditRecordBean {

    /**
     * The list of items associated with the changed record.
     */
    @JsonProperty("associatedItems")
    protected List<AssociatedItemBean> associatedItems;

    /**
     * Deprecated, use {@code authorAccountId} instead. The key of the user who created the audit record.
     */
    @JsonProperty("authorKey")
    protected String authorKey;

    /**
     * The category of the audit record. For a list of these categories, see the help article [Auditing in Jira applications](https://confluence.atlassian.com/x/noXKM).
     */
    @JsonProperty("category")
    protected String category;

    /**
     * The list of values changed in the record event.
     */
    @JsonProperty("changedValues")
    protected List<ChangedValueBean> changedValues;

    /**
     * The date and time on which the audit record was created.
     */
    @JsonProperty("created")
    protected OffsetDateTime created;

    /**
     * The description of the audit record.
     */
    @JsonProperty("description")
    protected String description;

    /**
     * The event the audit record originated from.
     */
    @JsonProperty("eventSource")
    protected String eventSource;

    /**
     * The ID of the audit record.
     */
    @JsonProperty("id")
    protected Long id;

    @JsonProperty("objectItem")
    protected AssociatedItemBean objectItem;

    /**
     * The URL of the computer where the creation of the audit record was initiated.
     */
    @JsonProperty("remoteAddress")
    protected String remoteAddress;

    /**
     * The summary of the audit record.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * Constructs a validated instance of {@link AuditRecordBean}.
     *
     * @param spec the specification to process
     */
    public AuditRecordBean(Consumer<AuditRecordBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AuditRecordBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AuditRecordBean(Consumer)} instead.
     * @param associatedItems The list of items associated with the changed record.
     * @param authorKey Deprecated, use {@code authorAccountId} instead. The key of the user who created the audit record.
     * @param category The category of the audit record. For a list of these categories, see the help article [Auditing in Jira applications](https://confluence.atlassian.com/x/noXKM).
     * @param changedValues The list of values changed in the record event.
     * @param created The date and time on which the audit record was created.
     * @param description The description of the audit record.
     * @param eventSource The event the audit record originated from.
     * @param id The ID of the audit record.
     * @param objectItem objectItem
     * @param remoteAddress The URL of the computer where the creation of the audit record was initiated.
     * @param summary The summary of the audit record.
     */
    @ApiStatus.Internal
    public AuditRecordBean(List<AssociatedItemBean> associatedItems, String authorKey, String category, List<ChangedValueBean> changedValues, OffsetDateTime created, String description, String eventSource, Long id, AssociatedItemBean objectItem, String remoteAddress, String summary) {
        this.associatedItems = associatedItems;
        this.authorKey = authorKey;
        this.category = category;
        this.changedValues = changedValues;
        this.created = created;
        this.description = description;
        this.eventSource = eventSource;
        this.id = id;
        this.objectItem = objectItem;
        this.remoteAddress = remoteAddress;
        this.summary = summary;
    }

}
