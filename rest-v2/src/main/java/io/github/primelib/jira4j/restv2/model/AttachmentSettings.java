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
 * AttachmentSettings
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
    "enabled",
    "uploadLimit"
})
@JsonTypeName("AttachmentSettings")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AttachmentSettings {

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

    /**
     * Constructs a validated instance of {@link AttachmentSettings}.
     *
     * @param spec the specification to process
     */
    public AttachmentSettings(Consumer<AttachmentSettings> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AttachmentSettings}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AttachmentSettings(Consumer)} instead.
     * @param enabled Whether the ability to add attachments is enabled.
     * @param uploadLimit The maximum size of attachments permitted, in bytes.
     */
    @ApiStatus.Internal
    public AttachmentSettings(Boolean enabled, Long uploadLimit) {
        this.enabled = enabled;
        this.uploadLimit = uploadLimit;
    }

}
