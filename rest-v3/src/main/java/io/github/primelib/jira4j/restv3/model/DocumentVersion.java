package io.github.primelib.jira4j.restv3.model;

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
 * DocumentVersion
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "versionNumber"
})
@JsonTypeName("DocumentVersion")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class DocumentVersion {

    /**
     * Constructs a validated implementation of {@link DocumentVersion}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public DocumentVersion(Consumer<DocumentVersion> spec) {
        spec.accept(this);
    }

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


}
