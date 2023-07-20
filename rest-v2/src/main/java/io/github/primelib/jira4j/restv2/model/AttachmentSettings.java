package io.github.primelib.jira4j.restv2.model;

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
 * AttachmentSettings
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "enabled",
    "uploadLimit"
})
@JsonTypeName("AttachmentSettings")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AttachmentSettings {

    /**
     * Constructs a validated implementation of {@link AttachmentSettings}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AttachmentSettings(Consumer<AttachmentSettings> spec) {
        spec.accept(this);
    }

    /**
     * Whether the ability to add attachments is enabled.
     */
    @JsonProperty("enabled")
    protected Boolean enabled;

    /**
     * The maximum size of attachments permitted, in bytes.
     */
    @JsonProperty("uploadLimit")
    protected Long uploadLimit;


}
