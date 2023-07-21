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

import java.net.URI;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Avatar
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
    "fileName",
    "id",
    "isDeletable",
    "isSelected",
    "isSystemAvatar",
    "owner",
    "urls"
})
@JsonTypeName("Avatar")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class Avatar {

    /**
     * The file name of the avatar icon. Returned for system avatars.
     */
    @JsonProperty("fileName")
    protected String fileName;

    /**
     * The ID of the avatar.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * Whether the avatar can be deleted.
     */
    @JsonProperty("isDeletable")
    protected Boolean isDeletable;

    /**
     * Whether the avatar is used in Jira. For example, shown as a project's avatar.
     */
    @JsonProperty("isSelected")
    protected Boolean isSelected;

    /**
     * Whether the avatar is a system avatar.
     */
    @JsonProperty("isSystemAvatar")
    protected Boolean isSystemAvatar;

    /**
     * The owner of the avatar. For a system avatar the owner is null (and nothing is returned). For non-system avatars this is the appropriate identifier, such as the ID for a project or the account ID for a user.
     */
    @JsonProperty("owner")
    protected String owner;

    /**
     * The list of avatar icon URLs.
     */
    @JsonProperty("urls")
    protected Map<String, URI> urls;

    /**
     * Constructs a validated instance of {@link Avatar}.
     *
     * @param spec the specification to process
     */
    public Avatar(Consumer<Avatar> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link Avatar}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #Avatar(Consumer)} instead.
     * @param fileName The file name of the avatar icon. Returned for system avatars.
     * @param id The ID of the avatar.
     * @param isDeletable Whether the avatar can be deleted.
     * @param isSelected Whether the avatar is used in Jira. For example, shown as a project's avatar.
     * @param isSystemAvatar Whether the avatar is a system avatar.
     * @param owner The owner of the avatar. For a system avatar the owner is null (and nothing is returned). For non-system avatars this is the appropriate identifier, such as the ID for a project or the account ID for a user.
     * @param urls The list of avatar icon URLs.
     */
    @ApiStatus.Internal
    public Avatar(String fileName, String id, Boolean isDeletable, Boolean isSelected, Boolean isSystemAvatar, String owner, Map<String, URI> urls) {
        this.fileName = fileName;
        this.id = id;
        this.isDeletable = isDeletable;
        this.isSelected = isSelected;
        this.isSystemAvatar = isSystemAvatar;
        this.owner = owner;
        this.urls = urls;
    }

}
