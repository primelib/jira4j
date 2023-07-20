package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WorklogIdsRequestBean
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "ids"
})
@JsonTypeName("WorklogIdsRequestBean")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WorklogIdsRequestBean {

    /**
     * Constructs a validated implementation of {@link WorklogIdsRequestBean}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WorklogIdsRequestBean(Consumer<WorklogIdsRequestBean> spec) {
        spec.accept(this);
    }

    /**
     * A list of worklog IDs.
     */
    @JsonProperty("ids")
    protected Set<Long> ids = new LinkedHashSet<>();


}
