package io.github.primelib.jira4j.restv3.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * NewUserDetails
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "applicationKeys",
    "displayName",
    "emailAddress",
    "key",
    "name",
    "password",
    "products",
    "self"
})
@JsonTypeName("NewUserDetails")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class NewUserDetails extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link NewUserDetails}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public NewUserDetails(Consumer<NewUserDetails> spec) {
        spec.accept(this);
    }

    /**
     * Deprecated, do not use.
     */
    @JsonProperty("applicationKeys")
    protected List<String> applicationKeys;

    /**
     * This property is no longer available. If the user has an Atlassian account, their display name is not changed. If the user does not have an Atlassian account, they are sent an email asking them set up an account.
     */
    @JsonProperty("displayName")
    protected String displayName;

    /**
     * The email address for the user.
     */
    @JsonProperty("emailAddress")
    protected String emailAddress;

    /**
     * This property is no longer available. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @JsonProperty("key")
    protected String key;

    /**
     * This property is no longer available. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * This property is no longer available. If the user has an Atlassian account, their password is not changed. If the user does not have an Atlassian account, they are sent an email asking them set up an account.
     */
    @JsonProperty("password")
    protected String password;

    /**
     * Products the new user has access to. Valid products are: jira-core, jira-servicedesk, jira-product-discovery, jira-software. If left empty, the user will get default product access. To create a user without product access, set this field to be an empty array.
     */
    @JsonProperty("products")
    protected Set<String> products;

    /**
     * The URL of the user.
     */
    @JsonProperty("self")
    protected String self;


}
