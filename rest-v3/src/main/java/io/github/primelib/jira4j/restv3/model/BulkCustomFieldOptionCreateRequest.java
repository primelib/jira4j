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
 * BulkCustomFieldOptionCreateRequest
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
    "options"
})
@JsonTypeName("BulkCustomFieldOptionCreateRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BulkCustomFieldOptionCreateRequest {

    /**
     * Details of options to create.
     */
    @JsonProperty("options")
    protected List<CustomFieldOptionCreate> options;

    /**
     * Constructs a validated instance of {@link BulkCustomFieldOptionCreateRequest}.
     *
     * @param spec the specification to process
     */
    public BulkCustomFieldOptionCreateRequest(Consumer<BulkCustomFieldOptionCreateRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link BulkCustomFieldOptionCreateRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #BulkCustomFieldOptionCreateRequest(Consumer)} instead.
     * @param options Details of options to create.
     */
    @ApiStatus.Internal
    public BulkCustomFieldOptionCreateRequest(List<CustomFieldOptionCreate> options) {
        this.options = options;
    }

}
