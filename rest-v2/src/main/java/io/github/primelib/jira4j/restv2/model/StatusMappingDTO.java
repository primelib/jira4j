package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StatusMappingDTO
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@EqualsAndHashCode(callSuper = true)
@JsonPropertyOrder({
    "issueTypeId",
    "projectId",
    "statusMigrations"
})
@JsonTypeName("StatusMappingDTO")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusMappingDTO extends HashMap<String, Object> {

    /**
     * Constructs a validated implementation of {@link StatusMappingDTO}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public StatusMappingDTO(Consumer<StatusMappingDTO> spec) {
        spec.accept(this);
    }

    /**
     * The issue type for the status mapping.
     */
    @JsonProperty("issueTypeId")
    protected String issueTypeId;

    /**
     * The project for the status mapping.
     */
    @JsonProperty("projectId")
    protected String projectId;

    /**
     * The list of old and new status ID mappings for the specified project and issue type.
     */
    @JsonProperty("statusMigrations")
    protected List<StatusMigration> statusMigrations = new ArrayList<>();


}
