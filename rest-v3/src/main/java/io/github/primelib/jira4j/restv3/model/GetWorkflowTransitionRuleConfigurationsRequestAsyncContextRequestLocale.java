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
 * GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestLocale
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
    "country",
    "displayCountry",
    "displayLanguage",
    "displayName",
    "displayScript",
    "displayVariant",
    "extensionKeys",
    "iso3Country",
    "iso3Language",
    "language",
    "script",
    "unicodeLocaleAttributes",
    "unicodeLocaleKeys",
    "variant"
})
@JsonTypeName("getWorkflowTransitionRuleConfigurations_request_asyncContext_request_locale")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestLocale {

    @JsonProperty("country")
    protected String country;

    @JsonProperty("displayCountry")
    protected String displayCountry;

    @JsonProperty("displayLanguage")
    protected String displayLanguage;

    @JsonProperty("displayName")
    protected String displayName;

    @JsonProperty("displayScript")
    protected String displayScript;

    @JsonProperty("displayVariant")
    protected String displayVariant;

    @JsonProperty("extensionKeys")
    protected Set<String> extensionKeys;

    @JsonProperty("iso3Country")
    protected String iso3Country;

    @JsonProperty("iso3Language")
    protected String iso3Language;

    @JsonProperty("language")
    protected String language;

    @JsonProperty("script")
    protected String script;

    @JsonProperty("unicodeLocaleAttributes")
    protected Set<String> unicodeLocaleAttributes;

    @JsonProperty("unicodeLocaleKeys")
    protected Set<String> unicodeLocaleKeys;

    @JsonProperty("variant")
    protected String variant;

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestLocale}.
     *
     * @param spec the specification to process
     */
    public GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestLocale(Consumer<GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestLocale> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestLocale}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestLocale(Consumer)} instead.
     * @param country country
     * @param displayCountry displayCountry
     * @param displayLanguage displayLanguage
     * @param displayName displayName
     * @param displayScript displayScript
     * @param displayVariant displayVariant
     * @param extensionKeys extensionKeys
     * @param iso3Country iso3Country
     * @param iso3Language iso3Language
     * @param language language
     * @param script script
     * @param unicodeLocaleAttributes unicodeLocaleAttributes
     * @param unicodeLocaleKeys unicodeLocaleKeys
     * @param variant variant
     */
    @ApiStatus.Internal
    public GetWorkflowTransitionRuleConfigurationsRequestAsyncContextRequestLocale(String country, String displayCountry, String displayLanguage, String displayName, String displayScript, String displayVariant, Set<String> extensionKeys, String iso3Country, String iso3Language, String language, String script, Set<String> unicodeLocaleAttributes, Set<String> unicodeLocaleKeys, String variant) {
        this.country = country;
        this.displayCountry = displayCountry;
        this.displayLanguage = displayLanguage;
        this.displayName = displayName;
        this.displayScript = displayScript;
        this.displayVariant = displayVariant;
        this.extensionKeys = extensionKeys;
        this.iso3Country = iso3Country;
        this.iso3Language = iso3Language;
        this.language = language;
        this.script = script;
        this.unicodeLocaleAttributes = unicodeLocaleAttributes;
        this.unicodeLocaleKeys = unicodeLocaleKeys;
        this.variant = variant;
    }

}
