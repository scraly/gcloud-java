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
package com.google.cloud.speech.v1.stub;

import com.google.api.core.BetaApi;
import com.google.api.gax.grpc.GrpcCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.StreamingCallable;
import com.google.api.gax.rpc.StreamingCallableImpl;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.gax.rpc.UnaryCallableImpl;
import com.google.cloud.speech.v1.LongRunningRecognizeRequest;
import com.google.cloud.speech.v1.LongRunningRecognizeResponse;
import com.google.cloud.speech.v1.RecognizeRequest;
import com.google.cloud.speech.v1.RecognizeResponse;
import com.google.cloud.speech.v1.SpeechSettings;
import com.google.cloud.speech.v1.StreamingRecognizeRequest;
import com.google.cloud.speech.v1.StreamingRecognizeResponse;
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
  private static final UnaryCallableImpl<RecognizeRequest, RecognizeResponse>
      directRecognizeCallable =
          GrpcCallableFactory.createDirectCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.UNARY,
                  "google.cloud.speech.v1.Speech/Recognize",
                  io.grpc.protobuf.ProtoUtils.marshaller(RecognizeRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(RecognizeResponse.getDefaultInstance())));
  private static final UnaryCallableImpl<LongRunningRecognizeRequest, Operation>
      directLongRunningRecognizeCallable =
          GrpcCallableFactory.createDirectCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.UNARY,
                  "google.cloud.speech.v1.Speech/LongRunningRecognize",
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      LongRunningRecognizeRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(Operation.getDefaultInstance())));
  private static final StreamingCallableImpl<StreamingRecognizeRequest, StreamingRecognizeResponse>
      directStreamingRecognizeCallable =
          GrpcCallableFactory.createDirectStreamingCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING,
                  "google.cloud.speech.v1.Speech/StreamingRecognize",
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      StreamingRecognizeRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      StreamingRecognizeResponse.getDefaultInstance())));
  private final List<AutoCloseable> closeables = new ArrayList<>();
  private final GrpcOperationsStub operationsStub;

  private final UnaryCallable<RecognizeRequest, RecognizeResponse> recognizeCallable;
  private final UnaryCallable<LongRunningRecognizeRequest, Operation> longRunningRecognizeCallable;
  private final OperationCallable<
          LongRunningRecognizeRequest, LongRunningRecognizeResponse, Operation>
      longRunningRecognizeOperationCallable;
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

    this.recognizeCallable =
        GrpcCallableFactory.create(
            directRecognizeCallable, settings.recognizeSettings(), clientContext);
    this.longRunningRecognizeCallable =
        GrpcCallableFactory.create(
            directLongRunningRecognizeCallable,
            settings.longRunningRecognizeSettings().getInitialCallSettings(),
            clientContext);
    this.longRunningRecognizeOperationCallable =
        GrpcCallableFactory.create(
            directLongRunningRecognizeCallable,
            settings.longRunningRecognizeSettings(),
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

  public UnaryCallable<RecognizeRequest, RecognizeResponse> recognizeCallable() {
    return recognizeCallable;
  }

  public OperationCallable<LongRunningRecognizeRequest, LongRunningRecognizeResponse, Operation>
      longRunningRecognizeOperationCallable() {
    return longRunningRecognizeOperationCallable;
  }

  public UnaryCallable<LongRunningRecognizeRequest, Operation> longRunningRecognizeCallable() {
    return longRunningRecognizeCallable;
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
