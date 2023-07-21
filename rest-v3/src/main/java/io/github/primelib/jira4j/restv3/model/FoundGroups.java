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
 * FoundGroups
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
    "groups",
    "header",
    "total"
})
@JsonTypeName("FoundGroups")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class FoundGroups {

    @JsonProperty("groups")
    protected List<FoundGroup> groups;

    /**
     * Header text indicating the number of groups in the response and the total number of groups found in the search.
     */
    @JsonProperty("header")
    protected String header;

    /**
     * The total number of groups found in the search.
     */
    @JsonProperty("total")
    protected Integer total;

    /**
     * Constructs a validated instance of {@link FoundGroups}.
     *
     * @param spec the specification to process
     */
    public FoundGroups(Consumer<FoundGroups> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link FoundGroups}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #FoundGroups(Consumer)} instead.
     * @param groups var.name
     * @param header Header text indicating the number of groups in the response and the total number of groups found in the search.
     * @param total The total number of groups found in the search.
     */
    @ApiStatus.Internal
    public FoundGroups(List<FoundGroup> groups, String header, Integer total) {
        this.groups = groups;
        this.header = header;
        this.total = total;
    }

}
