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
 * JQLPersonalDataMigrationRequest
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "queryStrings"
})
@JsonTypeName("JQLPersonalDataMigrationRequest")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class JQLPersonalDataMigrationRequest {

    /**
     * Constructs a validated implementation of {@link JQLPersonalDataMigrationRequest}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public JQLPersonalDataMigrationRequest(Consumer<JQLPersonalDataMigrationRequest> spec) {
        spec.accept(this);
    }

    /**
     * A list of queries with user identifiers. Maximum of 100 queries.
     */
    @JsonProperty("queryStrings")
    protected List<String> queryStrings;


}
