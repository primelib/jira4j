package io.github.primelib.jira4j.restv3.model;

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
 * AuditRecordBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link AuditRecordBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AuditRecordBean(Consumer<AuditRecordBean> spec) {
        spec.accept(this);
    }

    /**
     * The list of items associated with the changed record.
     */
    @JsonProperty("associatedItems")
    protected List<AssociatedItemBean> associatedItems;

    /**
     * Deprecated, use `authorAccountId` instead. The key of the user who created the audit record.
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


}
