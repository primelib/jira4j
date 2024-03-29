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

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueUpdateMetadata
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
    "fields"
})
@JsonTypeName("IssueUpdateMetadata")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueUpdateMetadata {

    @JsonProperty("fields")
    protected Map<String, FieldMetadata> fields;

    /**
     * Constructs a validated instance of {@link IssueUpdateMetadata}.
     *
     * @param spec the specification to process
     */
    public IssueUpdateMetadata(Consumer<IssueUpdateMetadata> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IssueUpdateMetadata}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IssueUpdateMetadata(Consumer)} instead.
     * @param fields fields
     */
    @ApiStatus.Internal
    public IssueUpdateMetadata(Map<String, FieldMetadata> fields) {
        this.fields = fields;
    }

}
