package io.github.primelib.jira4j.restv2.model;

import java.util.Map;
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
 * StatusMappingDTO
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
    "issueTypeId",
    "projectId",
    "statusMigrations"
})
@JsonTypeName("StatusMappingDTO")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusMappingDTO {

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
    protected List<StatusMigration> statusMigrations;

    /**
     * Constructs a validated instance of {@link StatusMappingDTO}.
     *
     * @param spec the specification to process
     */
    public StatusMappingDTO(Consumer<StatusMappingDTO> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StatusMappingDTO}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StatusMappingDTO(Consumer)} instead.
     * @param issueTypeId The issue type for the status mapping.
     * @param projectId The project for the status mapping.
     * @param statusMigrations The list of old and new status ID mappings for the specified project and issue type.
     */
    @ApiStatus.Internal
    public StatusMappingDTO(String issueTypeId, String projectId, List<StatusMigration> statusMigrations) {
        this.issueTypeId = issueTypeId;
        this.projectId = projectId;
        this.statusMigrations = statusMigrations;
    }

}
