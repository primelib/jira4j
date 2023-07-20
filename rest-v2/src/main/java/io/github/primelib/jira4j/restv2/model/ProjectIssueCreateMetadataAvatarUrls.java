package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProjectIssueCreateMetadataAvatarUrls
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "16x16",
    "24x24",
    "32x32",
    "48x48"
})
@JsonTypeName("ProjectIssueCreateMetadata_avatarUrls")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectIssueCreateMetadataAvatarUrls {

    /**
     * Constructs a validated implementation of {@link ProjectIssueCreateMetadataAvatarUrls}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public ProjectIssueCreateMetadataAvatarUrls(Consumer<ProjectIssueCreateMetadataAvatarUrls> spec) {
        spec.accept(this);
    }

    /**
     * The URL of the item's 16x16 pixel avatar.
     */
    @JsonProperty("16x16")
    protected URI _16x16;

    /**
     * The URL of the item's 24x24 pixel avatar.
     */
    @JsonProperty("24x24")
    protected URI _24x24;

    /**
     * The URL of the item's 32x32 pixel avatar.
     */
    @JsonProperty("32x32")
    protected URI _32x32;

    /**
     * The URL of the item's 48x48 pixel avatar.
     */
    @JsonProperty("48x48")
    protected URI _48x48;


}
