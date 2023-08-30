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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AuditRecords
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
    "limit",
    "offset",
    "records",
    "total"
})
@JsonTypeName("AuditRecords")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AuditRecords {

    /**
     * The requested or default limit on the number of audit items to be returned.
     */
    @JsonProperty("limit")
    protected Integer limit;

    /**
     * The number of audit items skipped before the first item in this list.
     */
    @JsonProperty("offset")
    protected Integer offset;

    /**
     * The list of audit items.
     */
    @JsonProperty("records")
    protected List<AuditRecordBean> records;

    /**
     * The total number of audit items returned.
     */
    @JsonProperty("total")
    protected Long total;

    /**
     * Constructs a validated instance of {@link AuditRecords}.
     *
     * @param spec the specification to process
     */
    public AuditRecords(Consumer<AuditRecords> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AuditRecords}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AuditRecords(Consumer)} instead.
     * @param limit The requested or default limit on the number of audit items to be returned.
     * @param offset The number of audit items skipped before the first item in this list.
     * @param records The list of audit items.
     * @param total The total number of audit items returned.
     */
    @ApiStatus.Internal
    public AuditRecords(Integer limit, Integer offset, List<AuditRecordBean> records, Long total) {
        this.limit = limit;
        this.offset = offset;
        this.records = records;
        this.total = total;
    }

}
