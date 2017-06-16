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
package com.google.cloud.speech.v1beta1.stub;

import com.google.api.core.BetaApi;
import com.google.api.gax.grpc.GrpcCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.StreamingCallable;
import com.google.api.gax.rpc.StreamingCallableImpl;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.gax.rpc.UnaryCallableImpl;
import com.google.cloud.speech.v1beta1.AsyncRecognizeRequest;
import com.google.cloud.speech.v1beta1.AsyncRecognizeResponse;
import com.google.cloud.speech.v1beta1.SpeechSettings;
import com.google.cloud.speech.v1beta1.StreamingRecognizeRequest;
import com.google.cloud.speech.v1beta1.StreamingRecognizeResponse;
import com.google.cloud.speech.v1beta1.SyncRecognizeRequest;
import com.google.cloud.speech.v1beta1.SyncRecognizeResponse;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.GrpcOperationsStub;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@Generated("by GAPIC v0.0.5")
@BetaApi
public class GrpcSpeechStub extends SpeechStub {
  private static final UnaryCallableImpl<SyncRecognizeRequest, SyncRecognizeResponse>
      directSyncRecognizeCallable =
          GrpcCallableFactory.createDirectCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.UNARY,
                  "google.cloud.speech.v1beta1.Speech/SyncRecognize",
                  io.grpc.protobuf.ProtoUtils.marshaller(SyncRecognizeRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      SyncRecognizeResponse.getDefaultInstance())));
  private static final UnaryCallableImpl<AsyncRecognizeRequest, Operation>
      directAsyncRecognizeCallable =
          GrpcCallableFactory.createDirectCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.UNARY,
                  "google.cloud.speech.v1beta1.Speech/AsyncRecognize",
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      AsyncRecognizeRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(Operation.getDefaultInstance())));
  private static final StreamingCallableImpl<StreamingRecognizeRequest, StreamingRecognizeResponse>
      directStreamingRecognizeCallable =
          GrpcCallableFactory.createDirectStreamingCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING,
                  "google.cloud.speech.v1beta1.Speech/StreamingRecognize",
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      StreamingRecognizeRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      StreamingRecognizeResponse.getDefaultInstance())));
  private final List<AutoCloseable> closeables = new ArrayList<>();
  private final GrpcOperationsStub operationsStub;

  private final UnaryCallable<SyncRecognizeRequest, SyncRecognizeResponse> syncRecognizeCallable;
  private final UnaryCallable<AsyncRecognizeRequest, Operation> asyncRecognizeCallable;
  private final OperationCallable<AsyncRecognizeRequest, AsyncRecognizeResponse, Operation>
      asyncRecognizeOperationCallable;
  private final StreamingCallable<StreamingRecognizeRequest, StreamingRecognizeResponse>
      streamingRecognizeCallable;

  public static final GrpcSpeechStub create(SpeechSettings settings) throws IOException {
    return new GrpcSpeechStub(settings, ClientContext.create(settings));
  }

  public static final GrpcSpeechStub create(ClientContext clientContext) throws IOException {
    return new GrpcSpeechStub(SpeechSettings.defaultBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of GrpcSpeechStub, using the given settings. This is protected so that
   * it easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected GrpcSpeechStub(SpeechSettings settings, ClientContext clientContext)
      throws IOException {
    this.operationsStub = GrpcOperationsStub.create(clientContext);

    this.syncRecognizeCallable =
        GrpcCallableFactory.create(
            directSyncRecognizeCallable, settings.syncRecognizeSettings(), clientContext);
    this.asyncRecognizeCallable =
        GrpcCallableFactory.create(
            directAsyncRecognizeCallable,
            settings.asyncRecognizeSettings().getInitialCallSettings(),
            clientContext);
    this.asyncRecognizeOperationCallable =
        GrpcCallableFactory.create(
            directAsyncRecognizeCallable,
            settings.asyncRecognizeSettings(),
            clientContext,
            this.operationsStub);
    this.streamingRecognizeCallable =
        GrpcCallableFactory.create(
            directStreamingRecognizeCallable, settings.streamingRecognizeSettings(), clientContext);

    closeables.addAll(clientContext.getCloseables());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  public UnaryCallable<SyncRecognizeRequest, SyncRecognizeResponse> syncRecognizeCallable() {
    return syncRecognizeCallable;
  }

  public OperationCallable<AsyncRecognizeRequest, AsyncRecognizeResponse, Operation>
      asyncRecognizeOperationCallable() {
    return asyncRecognizeOperationCallable;
  }

  public UnaryCallable<AsyncRecognizeRequest, Operation> asyncRecognizeCallable() {
    return asyncRecognizeCallable;
  }

  public StreamingCallable<StreamingRecognizeRequest, StreamingRecognizeResponse>
      streamingRecognizeCallable() {
    return streamingRecognizeCallable;
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
