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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FoundUsers
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
    "header",
    "total",
    "users"
})
@JsonTypeName("FoundUsers")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FoundUsers {

    /**
     * Header text indicating the number of users in the response and the total number of users found in the search.
     */
    @JsonProperty("header")
    protected String header;

    /**
     * The total number of users found in the search.
     */
    @JsonProperty("total")
    protected Integer total;

    @JsonProperty("users")
    protected List<UserPickerUser> users;

    /**
     * Constructs a validated instance of {@link FoundUsers}.
     *
     * @param spec the specification to process
     */
    public FoundUsers(Consumer<FoundUsers> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FoundUsers}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FoundUsers(Consumer)} instead.
     * @param header Header text indicating the number of users in the response and the total number of users found in the search.
     * @param total The total number of users found in the search.
     * @param users users
     */
    @ApiStatus.Internal
    public FoundUsers(String header, Integer total, List<UserPickerUser> users) {
        this.header = header;
        this.total = total;
        this.users = users;
    }

}
