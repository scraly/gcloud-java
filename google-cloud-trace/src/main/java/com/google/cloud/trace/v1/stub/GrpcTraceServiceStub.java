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
package com.google.cloud.trace.v1.stub;

import static com.google.cloud.trace.v1.PagedResponseWrappers.ListTracesPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.grpc.GrpcCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.gax.rpc.UnaryCallableImpl;
import com.google.cloud.trace.v1.TraceServiceSettings;
import com.google.devtools.cloudtrace.v1.GetTraceRequest;
import com.google.devtools.cloudtrace.v1.ListTracesRequest;
import com.google.devtools.cloudtrace.v1.ListTracesResponse;
import com.google.devtools.cloudtrace.v1.PatchTracesRequest;
import com.google.devtools.cloudtrace.v1.Trace;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@Generated("by GAPIC v0.0.5")
@BetaApi
public class GrpcTraceServiceStub extends TraceServiceStub {
  private static final UnaryCallableImpl<PatchTracesRequest, Empty> directPatchTracesCallable =
      GrpcCallableFactory.createDirectCallable(
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.devtools.cloudtrace.v1.TraceService/PatchTraces",
              io.grpc.protobuf.ProtoUtils.marshaller(PatchTracesRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(Empty.getDefaultInstance())));
  private static final UnaryCallableImpl<GetTraceRequest, Trace> directGetTraceCallable =
      GrpcCallableFactory.createDirectCallable(
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.devtools.cloudtrace.v1.TraceService/GetTrace",
              io.grpc.protobuf.ProtoUtils.marshaller(GetTraceRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(Trace.getDefaultInstance())));
  private static final UnaryCallableImpl<ListTracesRequest, ListTracesResponse>
      directListTracesCallable =
          GrpcCallableFactory.createDirectCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.UNARY,
                  "google.devtools.cloudtrace.v1.TraceService/ListTraces",
                  io.grpc.protobuf.ProtoUtils.marshaller(ListTracesRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(ListTracesResponse.getDefaultInstance())));
  private final List<AutoCloseable> closeables = new ArrayList<>();

  private final UnaryCallable<PatchTracesRequest, Empty> patchTracesCallable;
  private final UnaryCallable<GetTraceRequest, Trace> getTraceCallable;
  private final UnaryCallable<ListTracesRequest, ListTracesResponse> listTracesCallable;
  private final UnaryCallable<ListTracesRequest, ListTracesPagedResponse> listTracesPagedCallable;

  public static final GrpcTraceServiceStub create(TraceServiceSettings settings)
      throws IOException {
    return new GrpcTraceServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcTraceServiceStub create(ClientContext clientContext) throws IOException {
    return new GrpcTraceServiceStub(TraceServiceSettings.defaultBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of GrpcTraceServiceStub, using the given settings. This is protected so
   * that it easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected GrpcTraceServiceStub(TraceServiceSettings settings, ClientContext clientContext)
      throws IOException {

    this.patchTracesCallable =
        GrpcCallableFactory.create(
            directPatchTracesCallable, settings.patchTracesSettings(), clientContext);
    this.getTraceCallable =
        GrpcCallableFactory.create(
            directGetTraceCallable, settings.getTraceSettings(), clientContext);
    this.listTracesCallable =
        GrpcCallableFactory.create(
            directListTracesCallable, settings.listTracesSettings(), clientContext);
    this.listTracesPagedCallable =
        GrpcCallableFactory.createPagedVariant(
            directListTracesCallable, settings.listTracesSettings(), clientContext);

    closeables.addAll(clientContext.getCloseables());
  }

  public UnaryCallable<PatchTracesRequest, Empty> patchTracesCallable() {
    return patchTracesCallable;
  }

  public UnaryCallable<GetTraceRequest, Trace> getTraceCallable() {
    return getTraceCallable;
  }

  public UnaryCallable<ListTracesRequest, ListTracesPagedResponse> listTracesPagedCallable() {
    return listTracesPagedCallable;
  }

  public UnaryCallable<ListTracesRequest, ListTracesResponse> listTracesCallable() {
    return listTracesCallable;
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
