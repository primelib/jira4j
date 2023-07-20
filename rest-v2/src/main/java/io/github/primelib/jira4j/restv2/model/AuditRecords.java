package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AuditRecords
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link AuditRecords}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AuditRecords(Consumer<AuditRecords> spec) {
        spec.accept(this);
    }

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


}
