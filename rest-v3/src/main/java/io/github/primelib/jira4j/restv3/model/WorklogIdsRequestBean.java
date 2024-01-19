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

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorklogIdsRequestBean
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
    "ids"
})
@JsonTypeName("WorklogIdsRequestBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorklogIdsRequestBean {

    /**
     * A list of worklog IDs.
     */
    @JsonProperty("ids")
    protected Set<Long> ids;

    /**
     * Constructs a validated instance of {@link WorklogIdsRequestBean}.
     *
     * @param spec the specification to process
     */
    public WorklogIdsRequestBean(Consumer<WorklogIdsRequestBean> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link WorklogIdsRequestBean}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #WorklogIdsRequestBean(Consumer)} instead.
     * @param ids A list of worklog IDs.
     */
    @ApiStatus.Internal
    public WorklogIdsRequestBean(Set<Long> ids) {
        this.ids = ids;
    }

}
