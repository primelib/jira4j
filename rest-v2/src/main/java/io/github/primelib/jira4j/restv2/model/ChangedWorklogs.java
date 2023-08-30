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
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ChangedWorklogs
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
    "lastPage",
    "nextPage",
    "self",
    "since",
    "until",
    "values"
})
@JsonTypeName("ChangedWorklogs")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ChangedWorklogs {

    @JsonProperty("lastPage")
    protected Boolean lastPage;

    /**
     * The URL of the next list of changed worklogs.
     */
    @JsonProperty("nextPage")
    protected URI nextPage;

    /**
     * The URL of this changed worklogs list.
     */
    @JsonProperty("self")
    protected URI self;

    /**
     * The datetime of the first worklog item in the list.
     */
    @JsonProperty("since")
    protected Long since;

    /**
     * The datetime of the last worklog item in the list.
     */
    @JsonProperty("until")
    protected Long until;

    /**
     * Changed worklog list.
     */
    @JsonProperty("values")
    protected List<ChangedWorklog> values;

    /**
     * Constructs a validated instance of {@link ChangedWorklogs}.
     *
     * @param spec the specification to process
     */
    public ChangedWorklogs(Consumer<ChangedWorklogs> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ChangedWorklogs}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ChangedWorklogs(Consumer)} instead.
     * @param lastPage lastPage
     * @param nextPage The URL of the next list of changed worklogs.
     * @param self The URL of this changed worklogs list.
     * @param since The datetime of the first worklog item in the list.
     * @param until The datetime of the last worklog item in the list.
     * @param values Changed worklog list.
     */
    @ApiStatus.Internal
    public ChangedWorklogs(Boolean lastPage, URI nextPage, URI self, Long since, Long until, List<ChangedWorklog> values) {
        this.lastPage = lastPage;
        this.nextPage = nextPage;
        this.self = self;
        this.since = since;
        this.until = until;
        this.values = values;
    }

}
