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
package com.google.cloud.logging.v2.stub;

import static com.google.cloud.logging.v2.PagedResponseWrappers.ListSinksPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.grpc.GrpcCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.gax.rpc.UnaryCallableImpl;
import com.google.cloud.logging.v2.ConfigSettings;
import com.google.logging.v2.CreateSinkRequest;
import com.google.logging.v2.DeleteSinkRequest;
import com.google.logging.v2.GetSinkRequest;
import com.google.logging.v2.ListSinksRequest;
import com.google.logging.v2.ListSinksResponse;
import com.google.logging.v2.LogSink;
import com.google.logging.v2.UpdateSinkRequest;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@Generated("by GAPIC v0.0.5")
@BetaApi
public class GrpcConfigStub extends ConfigStub {
  private static final UnaryCallableImpl<ListSinksRequest, ListSinksResponse>
      directListSinksCallable =
          GrpcCallableFactory.createDirectCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.UNARY,
                  "google.logging.v2.ConfigServiceV2/ListSinks",
                  io.grpc.protobuf.ProtoUtils.marshaller(ListSinksRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(ListSinksResponse.getDefaultInstance())));
  private static final UnaryCallableImpl<GetSinkRequest, LogSink> directGetSinkCallable =
      GrpcCallableFactory.createDirectCallable(
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.logging.v2.ConfigServiceV2/GetSink",
              io.grpc.protobuf.ProtoUtils.marshaller(GetSinkRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(LogSink.getDefaultInstance())));
  private static final UnaryCallableImpl<CreateSinkRequest, LogSink> directCreateSinkCallable =
      GrpcCallableFactory.createDirectCallable(
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.logging.v2.ConfigServiceV2/CreateSink",
              io.grpc.protobuf.ProtoUtils.marshaller(CreateSinkRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(LogSink.getDefaultInstance())));
  private static final UnaryCallableImpl<UpdateSinkRequest, LogSink> directUpdateSinkCallable =
      GrpcCallableFactory.createDirectCallable(
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.logging.v2.ConfigServiceV2/UpdateSink",
              io.grpc.protobuf.ProtoUtils.marshaller(UpdateSinkRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(LogSink.getDefaultInstance())));
  private static final UnaryCallableImpl<DeleteSinkRequest, Empty> directDeleteSinkCallable =
      GrpcCallableFactory.createDirectCallable(
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.logging.v2.ConfigServiceV2/DeleteSink",
              io.grpc.protobuf.ProtoUtils.marshaller(DeleteSinkRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(Empty.getDefaultInstance())));
  private final List<AutoCloseable> closeables = new ArrayList<>();

  private final UnaryCallable<ListSinksRequest, ListSinksResponse> listSinksCallable;
  private final UnaryCallable<ListSinksRequest, ListSinksPagedResponse> listSinksPagedCallable;
  private final UnaryCallable<GetSinkRequest, LogSink> getSinkCallable;
  private final UnaryCallable<CreateSinkRequest, LogSink> createSinkCallable;
  private final UnaryCallable<UpdateSinkRequest, LogSink> updateSinkCallable;
  private final UnaryCallable<DeleteSinkRequest, Empty> deleteSinkCallable;

  public static final GrpcConfigStub create(ConfigSettings settings) throws IOException {
    return new GrpcConfigStub(settings);
  }

  /**
   * Constructs an instance of GrpcConfigStub, using the given settings. This is protected so that
   * it easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected GrpcConfigStub(ConfigSettings settings) throws IOException {
    ClientContext clientContext = ClientContext.create(settings);

    this.listSinksCallable =
        GrpcCallableFactory.create(
            directListSinksCallable, settings.listSinksSettings(), clientContext);
    this.listSinksPagedCallable =
        GrpcCallableFactory.createPagedVariant(
            directListSinksCallable, settings.listSinksSettings(), clientContext);
    this.getSinkCallable =
        GrpcCallableFactory.create(
            directGetSinkCallable, settings.getSinkSettings(), clientContext);
    this.createSinkCallable =
        GrpcCallableFactory.create(
            directCreateSinkCallable, settings.createSinkSettings(), clientContext);
    this.updateSinkCallable =
        GrpcCallableFactory.create(
            directUpdateSinkCallable, settings.updateSinkSettings(), clientContext);
    this.deleteSinkCallable =
        GrpcCallableFactory.create(
            directDeleteSinkCallable, settings.deleteSinkSettings(), clientContext);

    closeables.addAll(clientContext.getCloseables());
  }

  public final UnaryCallable<ListSinksRequest, ListSinksPagedResponse> listSinksPagedCallable() {
    return listSinksPagedCallable;
  }

  public final UnaryCallable<ListSinksRequest, ListSinksResponse> listSinksCallable() {
    return listSinksCallable;
  }

  public final UnaryCallable<GetSinkRequest, LogSink> getSinkCallable() {
    return getSinkCallable;
  }

  public final UnaryCallable<CreateSinkRequest, LogSink> createSinkCallable() {
    return createSinkCallable;
  }

  public final UnaryCallable<UpdateSinkRequest, LogSink> updateSinkCallable() {
    return updateSinkCallable;
  }

  public final UnaryCallable<DeleteSinkRequest, Empty> deleteSinkCallable() {
    return deleteSinkCallable;
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
