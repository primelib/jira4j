package io.github.primelib.jira4j.restv3.model;

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
 * BulkCustomFieldOptionCreateRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "options"
})
@JsonTypeName("BulkCustomFieldOptionCreateRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class BulkCustomFieldOptionCreateRequest {

    /**
     * Constructs a validated implementation of {@link BulkCustomFieldOptionCreateRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public BulkCustomFieldOptionCreateRequest(Consumer<BulkCustomFieldOptionCreateRequest> spec) {
        spec.accept(this);
    }

    /**
     * Details of options to create.
     */
    @JsonProperty("options")
    protected List<CustomFieldOptionCreate> options;


}
