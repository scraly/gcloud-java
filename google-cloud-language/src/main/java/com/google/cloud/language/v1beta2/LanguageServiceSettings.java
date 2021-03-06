/*
 * Copyright 2017, Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.language.v1beta2;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.core.ExecutorProvider;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.core.PropertiesProvider;
import com.google.api.gax.grpc.GrpcFailureCode;
import com.google.api.gax.grpc.GrpcTransportContext;
import com.google.api.gax.grpc.GrpcTransportSettings;
import com.google.api.gax.grpc.InstantiatingChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.FailureCode;
import com.google.api.gax.rpc.SimpleCallSettings;
import com.google.api.gax.rpc.TransportSettings;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.language.v1beta2.stub.GrpcLanguageServiceStub;
import com.google.cloud.language.v1beta2.stub.LanguageServiceStub;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import io.grpc.Status;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link LanguageServiceClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (language.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object. For
 * example, to set the total timeout of analyzeSentiment to 30 seconds:
 *
 * <pre>
 * <code>
 * LanguageServiceSettings.Builder languageServiceSettingsBuilder =
 *     LanguageServiceSettings.defaultBuilder();
 * languageServiceSettingsBuilder.analyzeSentimentSettings().getRetrySettingsBuilder()
 *     .setTotalTimeout(Duration.ofSeconds(30));
 * LanguageServiceSettings languageServiceSettings = languageServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by GAPIC v0.0.5")
@BetaApi
public class LanguageServiceSettings extends ClientSettings {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private static final String DEFAULT_GAPIC_NAME = "gapic";
  private static final String DEFAULT_GAPIC_VERSION = "";

  private static final String PROPERTIES_FILE = "/com/google/cloud/language/project.properties";
  private static final String META_VERSION_KEY = "artifact.version";

  private static String gapicVersion;

  private final SimpleCallSettings<AnalyzeSentimentRequest, AnalyzeSentimentResponse>
      analyzeSentimentSettings;
  private final SimpleCallSettings<AnalyzeEntitiesRequest, AnalyzeEntitiesResponse>
      analyzeEntitiesSettings;
  private final SimpleCallSettings<AnalyzeEntitySentimentRequest, AnalyzeEntitySentimentResponse>
      analyzeEntitySentimentSettings;
  private final SimpleCallSettings<AnalyzeSyntaxRequest, AnalyzeSyntaxResponse>
      analyzeSyntaxSettings;
  private final SimpleCallSettings<AnnotateTextRequest, AnnotateTextResponse> annotateTextSettings;

  /** Returns the object with the settings used for calls to analyzeSentiment. */
  public SimpleCallSettings<AnalyzeSentimentRequest, AnalyzeSentimentResponse>
      analyzeSentimentSettings() {
    return analyzeSentimentSettings;
  }

  /** Returns the object with the settings used for calls to analyzeEntities. */
  public SimpleCallSettings<AnalyzeEntitiesRequest, AnalyzeEntitiesResponse>
      analyzeEntitiesSettings() {
    return analyzeEntitiesSettings;
  }

  /** Returns the object with the settings used for calls to analyzeEntitySentiment. */
  public SimpleCallSettings<AnalyzeEntitySentimentRequest, AnalyzeEntitySentimentResponse>
      analyzeEntitySentimentSettings() {
    return analyzeEntitySentimentSettings;
  }

  /** Returns the object with the settings used for calls to analyzeSyntax. */
  public SimpleCallSettings<AnalyzeSyntaxRequest, AnalyzeSyntaxResponse> analyzeSyntaxSettings() {
    return analyzeSyntaxSettings;
  }

  /** Returns the object with the settings used for calls to annotateText. */
  public SimpleCallSettings<AnnotateTextRequest, AnnotateTextResponse> annotateTextSettings() {
    return annotateTextSettings;
  }

  public LanguageServiceStub createStub() throws IOException {
    if (getTransportSettings()
        .getTransportName()
        .equals(GrpcTransportContext.getGrpcTransportName())) {
      return GrpcLanguageServiceStub.create(this);
    } else {
      throw new UnsupportedOperationException(
          "Transport not supported: " + getTransportSettings().getTransportName());
    }
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "language.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingChannelProvider.Builder defaultGrpcChannelProviderBuilder() {
    return InstantiatingChannelProvider.newBuilder()
        .setEndpoint(getDefaultEndpoint())
        .setGeneratorHeader(DEFAULT_GAPIC_NAME, getGapicVersion());
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static GrpcTransportSettings.Builder defaultGrpcTransportSettingsBuilder() {
    return GrpcTransportSettings.newBuilder()
        .setChannelProvider(defaultGrpcChannelProviderBuilder().build());
  }

  public static TransportSettings defaultTransportSettings() {
    return defaultGrpcTransportSettingsBuilder().build();
  }

  private static String getGapicVersion() {
    if (gapicVersion == null) {
      gapicVersion =
          PropertiesProvider.loadProperty(
              LanguageServiceSettings.class, PROPERTIES_FILE, META_VERSION_KEY);
      gapicVersion = gapicVersion == null ? DEFAULT_GAPIC_VERSION : gapicVersion;
    }
    return gapicVersion;
  }

  /** Returns a builder for this class with recommended defaults. */
  public static Builder defaultBuilder() {
    return Builder.createDefault();
  }

  /**
   * Returns a builder for this class with recommened defaults for API methods, and the given
   * ClientContext used for executor/transport/credentials.
   */
  public static Builder defaultBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return new Builder();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  private LanguageServiceSettings(Builder settingsBuilder) throws IOException {
    super(
        settingsBuilder.getExecutorProvider(),
        settingsBuilder.getTransportSettings(),
        settingsBuilder.getCredentialsProvider(),
        settingsBuilder.getClock());

    analyzeSentimentSettings = settingsBuilder.analyzeSentimentSettings().build();
    analyzeEntitiesSettings = settingsBuilder.analyzeEntitiesSettings().build();
    analyzeEntitySentimentSettings = settingsBuilder.analyzeEntitySentimentSettings().build();
    analyzeSyntaxSettings = settingsBuilder.analyzeSyntaxSettings().build();
    annotateTextSettings = settingsBuilder.annotateTextSettings().build();
  }

  /** Builder for LanguageServiceSettings. */
  public static class Builder extends ClientSettings.Builder {
    private final ImmutableList<UnaryCallSettings.Builder> unaryMethodSettingsBuilders;

    private final SimpleCallSettings.Builder<AnalyzeSentimentRequest, AnalyzeSentimentResponse>
        analyzeSentimentSettings;
    private final SimpleCallSettings.Builder<AnalyzeEntitiesRequest, AnalyzeEntitiesResponse>
        analyzeEntitiesSettings;
    private final SimpleCallSettings.Builder<
            AnalyzeEntitySentimentRequest, AnalyzeEntitySentimentResponse>
        analyzeEntitySentimentSettings;
    private final SimpleCallSettings.Builder<AnalyzeSyntaxRequest, AnalyzeSyntaxResponse>
        analyzeSyntaxSettings;
    private final SimpleCallSettings.Builder<AnnotateTextRequest, AnnotateTextResponse>
        annotateTextSettings;

    private static final ImmutableMap<String, ImmutableSet<FailureCode>> RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<FailureCode>> definitions = ImmutableMap.builder();
      definitions.put(
          "idempotent",
          ImmutableSet.copyOf(
              Lists.<FailureCode>newArrayList(
                  GrpcFailureCode.of(Status.Code.DEADLINE_EXCEEDED),
                  GrpcFailureCode.of(Status.Code.UNAVAILABLE))));
      definitions.put("non_idempotent", ImmutableSet.copyOf(Lists.<FailureCode>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(60000L))
              .setTotalTimeout(Duration.ofMillis(600000L))
              .build();
      definitions.put("default", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    private Builder() {
      this((ClientContext) null);
    }

    private Builder(ClientContext clientContext) {
      super(clientContext);

      analyzeSentimentSettings = SimpleCallSettings.newBuilder();

      analyzeEntitiesSettings = SimpleCallSettings.newBuilder();

      analyzeEntitySentimentSettings = SimpleCallSettings.newBuilder();

      analyzeSyntaxSettings = SimpleCallSettings.newBuilder();

      annotateTextSettings = SimpleCallSettings.newBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder>of(
              analyzeSentimentSettings,
              analyzeEntitiesSettings,
              analyzeEntitySentimentSettings,
              analyzeSyntaxSettings,
              annotateTextSettings);

      initDefaults(this);
    }

    private static Builder createDefault() {
      Builder builder = new Builder((ClientContext) null);
      builder.setTransportSettings(defaultTransportSettings());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {

      builder
          .analyzeSentimentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .analyzeEntitiesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .analyzeEntitySentimentSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .analyzeSyntaxSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .annotateTextSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      return builder;
    }

    private Builder(LanguageServiceSettings settings) {
      super(settings);

      analyzeSentimentSettings = settings.analyzeSentimentSettings.toBuilder();
      analyzeEntitiesSettings = settings.analyzeEntitiesSettings.toBuilder();
      analyzeEntitySentimentSettings = settings.analyzeEntitySentimentSettings.toBuilder();
      analyzeSyntaxSettings = settings.analyzeSyntaxSettings.toBuilder();
      annotateTextSettings = settings.annotateTextSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder>of(
              analyzeSentimentSettings,
              analyzeEntitiesSettings,
              analyzeEntitySentimentSettings,
              analyzeSyntaxSettings,
              annotateTextSettings);
    }

    @Override
    public Builder setExecutorProvider(ExecutorProvider executorProvider) {
      super.setExecutorProvider(executorProvider);
      return this;
    }

    @Override
    public Builder setTransportSettings(TransportSettings transportSettings) {
      super.setTransportSettings(transportSettings);
      return this;
    }

    @Override
    public Builder setCredentialsProvider(CredentialsProvider credentialsProvider) {
      super.setCredentialsProvider(credentialsProvider);
      return this;
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to analyzeSentiment. */
    public SimpleCallSettings.Builder<AnalyzeSentimentRequest, AnalyzeSentimentResponse>
        analyzeSentimentSettings() {
      return analyzeSentimentSettings;
    }

    /** Returns the builder for the settings used for calls to analyzeEntities. */
    public SimpleCallSettings.Builder<AnalyzeEntitiesRequest, AnalyzeEntitiesResponse>
        analyzeEntitiesSettings() {
      return analyzeEntitiesSettings;
    }

    /** Returns the builder for the settings used for calls to analyzeEntitySentiment. */
    public SimpleCallSettings.Builder<AnalyzeEntitySentimentRequest, AnalyzeEntitySentimentResponse>
        analyzeEntitySentimentSettings() {
      return analyzeEntitySentimentSettings;
    }

    /** Returns the builder for the settings used for calls to analyzeSyntax. */
    public SimpleCallSettings.Builder<AnalyzeSyntaxRequest, AnalyzeSyntaxResponse>
        analyzeSyntaxSettings() {
      return analyzeSyntaxSettings;
    }

    /** Returns the builder for the settings used for calls to annotateText. */
    public SimpleCallSettings.Builder<AnnotateTextRequest, AnnotateTextResponse>
        annotateTextSettings() {
      return annotateTextSettings;
    }

    @Override
    public LanguageServiceSettings build() throws IOException {
      return new LanguageServiceSettings(this);
    }
  }
}
