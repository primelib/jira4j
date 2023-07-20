package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FoundUsers
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "header",
    "total",
    "users"
})
@JsonTypeName("FoundUsers")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FoundUsers {

    /**
     * Constructs a validated implementation of {@link FoundUsers}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public FoundUsers(Consumer<FoundUsers> spec) {
        spec.accept(this);
    }

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


}
