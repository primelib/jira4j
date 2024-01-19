package io.github.primelib.jira4j.restv2.spec;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import javax.annotation.processing.Generated;

import java.util.Set;
import io.github.primelib.jira4j.restv2.model.User;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.util.function.Consumer;

/**
 * FindUsersSpec
 * <p>
 * Specification for the FindUsers operation.
 * <p>
 * Find users
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FindUsersOperationSpec {
    /**
     * allows to disable validation of the spec, use with care!
     */
    @ApiStatus.Experimental
    public static Boolean VALIDATION_ENABLED = true;

    /**
     * A query string that is matched against user attributes ( {@code displayName}, and {@code emailAddress}) to find relevant users. The string can match the prefix of the attribute's value. For example, *query=john* matches a user with a {@code displayName} of *John Smith* and a user with an {@code emailAddress} of *johnson@example.com*. Required, unless {@code accountId} or {@code property} is specified.
     */
    @Nullable 
    private String query;

    /**
     */
    @Nullable 
    private String username;

    /**
     * A query string that is matched exactly against a user {@code accountId}. Required, unless {@code query} or {@code property} is specified.
     */
    @Nullable 
    private String accountId;

    /**
     * The index of the first item to return in a page of filtered results (page offset).
     */
    @Nullable 
    private Integer startAt;

    /**
     * The maximum number of items to return per page.
     */
    @Nullable 
    private Integer maxResults;

    /**
     * A query string used to search properties. Property keys are specified by path, so property keys containing dot (.) or equals (=) characters cannot be used. The query string cannot be specified using a JSON object. Example: To search for the value of {@code nested} from {@code {"something":{"nested":1,"other":2}}} use {@code thepropertykey.something.nested=1}. Required, unless {@code accountId} or {@code query} is specified.
     */
    @Nullable 
    private String property;

    /**
     * Constructs a validated instance of {@link FindUsersOperationSpec}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FindUsersOperationSpec(Consumer<FindUsersOperationSpec> spec) {
        spec.accept(this);
        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Constructs a validated instance of {@link FindUsersOperationSpec}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the operation is updated.
     * @param query                A query string that is matched against user attributes ( {@code displayName}, and {@code emailAddress}) to find relevant users. The string can match the prefix of the attribute's value. For example, *query=john* matches a user with a {@code displayName} of *John Smith* and a user with an {@code emailAddress} of *johnson@example.com*. Required, unless {@code accountId} or {@code property} is specified.
     * @param username             
     * @param accountId            A query string that is matched exactly against a user {@code accountId}. Required, unless {@code query} or {@code property} is specified.
     * @param startAt              The index of the first item to return in a page of filtered results (page offset).
     * @param maxResults           The maximum number of items to return per page.
     * @param property             A query string used to search properties. Property keys are specified by path, so property keys containing dot (.) or equals (=) characters cannot be used. The query string cannot be specified using a JSON object. Example: To search for the value of {@code nested} from {@code {"something":{"nested":1,"other":2}}} use {@code thepropertykey.something.nested=1}. Required, unless {@code accountId} or {@code query} is specified.
     */
    @ApiStatus.Internal
    public FindUsersOperationSpec(String query, String username, String accountId, Integer startAt, Integer maxResults, String property) {
        this.query = query;
        this.username = username;
        this.accountId = accountId;
        this.startAt = startAt;
        this.maxResults = maxResults;
        this.property = property;

        if (VALIDATION_ENABLED)
            validate();
    }

    /**
     * Validates the Spec, will throw a exception if required parameters are missing
     *
     * @throws NullPointerException
     */
    public void validate() {
    }
}
