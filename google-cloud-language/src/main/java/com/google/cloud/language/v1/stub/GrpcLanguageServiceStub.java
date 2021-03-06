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
package com.google.cloud.language.v1.stub;

import com.google.api.core.BetaApi;
import com.google.api.gax.grpc.GrpcCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.gax.rpc.UnaryCallableImpl;
import com.google.cloud.language.v1.AnalyzeEntitiesRequest;
import com.google.cloud.language.v1.AnalyzeEntitiesResponse;
import com.google.cloud.language.v1.AnalyzeSentimentRequest;
import com.google.cloud.language.v1.AnalyzeSentimentResponse;
import com.google.cloud.language.v1.AnalyzeSyntaxRequest;
import com.google.cloud.language.v1.AnalyzeSyntaxResponse;
import com.google.cloud.language.v1.AnnotateTextRequest;
import com.google.cloud.language.v1.AnnotateTextResponse;
import com.google.cloud.language.v1.LanguageServiceSettings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@Generated("by GAPIC v0.0.5")
@BetaApi
public class GrpcLanguageServiceStub extends LanguageServiceStub {
  private static final UnaryCallableImpl<AnalyzeSentimentRequest, AnalyzeSentimentResponse>
      directAnalyzeSentimentCallable =
          GrpcCallableFactory.createDirectCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.UNARY,
                  "google.cloud.language.v1.LanguageService/AnalyzeSentiment",
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      AnalyzeSentimentRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      AnalyzeSentimentResponse.getDefaultInstance())));
  private static final UnaryCallableImpl<AnalyzeEntitiesRequest, AnalyzeEntitiesResponse>
      directAnalyzeEntitiesCallable =
          GrpcCallableFactory.createDirectCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.UNARY,
                  "google.cloud.language.v1.LanguageService/AnalyzeEntities",
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      AnalyzeEntitiesRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      AnalyzeEntitiesResponse.getDefaultInstance())));
  private static final UnaryCallableImpl<AnalyzeSyntaxRequest, AnalyzeSyntaxResponse>
      directAnalyzeSyntaxCallable =
          GrpcCallableFactory.createDirectCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.UNARY,
                  "google.cloud.language.v1.LanguageService/AnalyzeSyntax",
                  io.grpc.protobuf.ProtoUtils.marshaller(AnalyzeSyntaxRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      AnalyzeSyntaxResponse.getDefaultInstance())));
  private static final UnaryCallableImpl<AnnotateTextRequest, AnnotateTextResponse>
      directAnnotateTextCallable =
          GrpcCallableFactory.createDirectCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.UNARY,
                  "google.cloud.language.v1.LanguageService/AnnotateText",
                  io.grpc.protobuf.ProtoUtils.marshaller(AnnotateTextRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      AnnotateTextResponse.getDefaultInstance())));
  private final List<AutoCloseable> closeables = new ArrayList<>();

  private final UnaryCallable<AnalyzeSentimentRequest, AnalyzeSentimentResponse>
      analyzeSentimentCallable;
  private final UnaryCallable<AnalyzeEntitiesRequest, AnalyzeEntitiesResponse>
      analyzeEntitiesCallable;
  private final UnaryCallable<AnalyzeSyntaxRequest, AnalyzeSyntaxResponse> analyzeSyntaxCallable;
  private final UnaryCallable<AnnotateTextRequest, AnnotateTextResponse> annotateTextCallable;

  public static final GrpcLanguageServiceStub create(LanguageServiceSettings settings)
      throws IOException {
    return new GrpcLanguageServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcLanguageServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcLanguageServiceStub(
        LanguageServiceSettings.defaultBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of GrpcLanguageServiceStub, using the given settings. This is protected
   * so that it easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcLanguageServiceStub(LanguageServiceSettings settings, ClientContext clientContext)
      throws IOException {

    this.analyzeSentimentCallable =
        GrpcCallableFactory.create(
            directAnalyzeSentimentCallable, settings.analyzeSentimentSettings(), clientContext);
    this.analyzeEntitiesCallable =
        GrpcCallableFactory.create(
            directAnalyzeEntitiesCallable, settings.analyzeEntitiesSettings(), clientContext);
    this.analyzeSyntaxCallable =
        GrpcCallableFactory.create(
            directAnalyzeSyntaxCallable, settings.analyzeSyntaxSettings(), clientContext);
    this.annotateTextCallable =
        GrpcCallableFactory.create(
            directAnnotateTextCallable, settings.annotateTextSettings(), clientContext);

    closeables.addAll(clientContext.getCloseables());
  }

  public UnaryCallable<AnalyzeSentimentRequest, AnalyzeSentimentResponse>
      analyzeSentimentCallable() {
    return analyzeSentimentCallable;
  }

  public UnaryCallable<AnalyzeEntitiesRequest, AnalyzeEntitiesResponse> analyzeEntitiesCallable() {
    return analyzeEntitiesCallable;
  }

  public UnaryCallable<AnalyzeSyntaxRequest, AnalyzeSyntaxResponse> analyzeSyntaxCallable() {
    return analyzeSyntaxCallable;
  }

  public UnaryCallable<AnnotateTextRequest, AnnotateTextResponse> annotateTextCallable() {
    return annotateTextCallable;
  }

  /**
   * Initiates an orderly shutdown in which preexisting calls continue but new calls are immediately
   * cancelled.
   */
  @Override
  public final void close() throws Exception {
    for (AutoCloseable closeable : closeables) {
      closeable.close();
    }
  }
}
