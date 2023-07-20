package io.github.primelib.jira4j.restv2.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IssueLinkType
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "id",
    "inward",
    "name",
    "outward",
    "self"
})
@JsonTypeName("IssueLink_type")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IssueLinkType {

    /**
     * Constructs a validated implementation of {@link IssueLinkType}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IssueLinkType(Consumer<IssueLinkType> spec) {
        spec.accept(this);
    }

    /**
     * The ID of the issue link type and is used as follows:
     *  *
     * In the [ issueLink](#api-rest-api-2-issueLink-post) resource it is the type of issue link. Required on create when `name` isn't provided. Otherwise, read only.
     * *
     * In the [ issueLinkType](#api-rest-api-2-issueLinkType-post) resource it is read only.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * The description of the issue link type inward link and is used as follows:
     *  *
     * In the [ issueLink](#api-rest-api-2-issueLink-post) resource it is read only.
     * *
     * In the [ issueLinkType](#api-rest-api-2-issueLinkType-post) resource it is required on create and optional on update. Otherwise, read only.
     */
    @JsonProperty("inward")
    protected String inward;

    /**
     * The name of the issue link type and is used as follows:
     *  *
     * In the [ issueLink](#api-rest-api-2-issueLink-post) resource it is the type of issue link. Required on create when `id` isn't provided. Otherwise, read only.
     * *
     * In the [ issueLinkType](#api-rest-api-2-issueLinkType-post) resource it is required on create and optional on update. Otherwise, read only.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The description of the issue link type outward link and is used as follows:
     *  *
     * In the [ issueLink](#api-rest-api-2-issueLink-post) resource it is read only.
     * *
     * In the [ issueLinkType](#api-rest-api-2-issueLinkType-post) resource it is required on create and optional on update. Otherwise, read only.
     */
    @JsonProperty("outward")
    protected String outward;

    /**
     * The URL of the issue link type. Read only.
     */
    @JsonProperty("self")
    protected URI self;


}
