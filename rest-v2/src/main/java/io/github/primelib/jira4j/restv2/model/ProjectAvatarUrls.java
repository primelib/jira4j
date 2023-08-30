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

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProjectAvatarUrls
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
    "16x16",
    "24x24",
    "32x32",
    "48x48"
})
@JsonTypeName("Project_avatarUrls")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ProjectAvatarUrls {

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

    /**
     * Constructs a validated instance of {@link ProjectAvatarUrls}.
     *
     * @param spec the specification to process
     */
    public ProjectAvatarUrls(Consumer<ProjectAvatarUrls> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ProjectAvatarUrls}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ProjectAvatarUrls(Consumer)} instead.
     * @param _16x16 The URL of the item's 16x16 pixel avatar.
     * @param _24x24 The URL of the item's 24x24 pixel avatar.
     * @param _32x32 The URL of the item's 32x32 pixel avatar.
     * @param _48x48 The URL of the item's 48x48 pixel avatar.
     */
    @ApiStatus.Internal
    public ProjectAvatarUrls(URI _16x16, URI _24x24, URI _32x32, URI _48x48) {
        this._16x16 = _16x16;
        this._24x24 = _24x24;
        this._32x32 = _32x32;
        this._48x48 = _48x48;
    }

}
