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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DocumentVersion
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
    "id",
    "versionNumber"
})
@JsonTypeName("DocumentVersion")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DocumentVersion {

    /**
     * The version UUID.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The version number.
     */
    @JsonProperty("versionNumber")
    protected Long versionNumber;

    /**
     * Constructs a validated instance of {@link DocumentVersion}.
     *
     * @param spec the specification to process
     */
    public DocumentVersion(Consumer<DocumentVersion> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link DocumentVersion}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #DocumentVersion(Consumer)} instead.
     * @param id The version UUID.
     * @param versionNumber The version number.
     */
    @ApiStatus.Internal
    public DocumentVersion(String id, Long versionNumber) {
        this.id = id;
        this.versionNumber = versionNumber;
    }

}
