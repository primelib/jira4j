package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Avatar
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
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
public class Avatar extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link Avatar}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public Avatar(Consumer<Avatar> spec) {
        spec.accept(this);
    }

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
    protected Map<String, URI> urls = new HashMap<>();


}
