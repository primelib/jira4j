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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StatusMigration
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "newStatusReference",
    "oldStatusReference"
})
@JsonTypeName("StatusMigration")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusMigration extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link StatusMigration}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public StatusMigration(Consumer<StatusMigration> spec) {
        spec.accept(this);
    }

    /**
     * The new status ID.
     */
    @JsonProperty("newStatusReference")
    protected String newStatusReference;

    /**
     * The old status ID.
     */
    @JsonProperty("oldStatusReference")
    protected String oldStatusReference;


}
