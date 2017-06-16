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
package com.google.cloud.errorreporting.v1beta1.stub;

import static com.google.cloud.errorreporting.v1beta1.PagedResponseWrappers.ListEventsPagedResponse;
import static com.google.cloud.errorreporting.v1beta1.PagedResponseWrappers.ListGroupStatsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.grpc.GrpcCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.gax.rpc.UnaryCallableImpl;
import com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceSettings;
import com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest;
import com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsResponse;
import com.google.devtools.clouderrorreporting.v1beta1.ListEventsRequest;
import com.google.devtools.clouderrorreporting.v1beta1.ListEventsResponse;
import com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsRequest;
import com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@Generated("by GAPIC v0.0.5")
@BetaApi
public class GrpcErrorStatsServiceStub extends ErrorStatsServiceStub {
  private static final UnaryCallableImpl<ListGroupStatsRequest, ListGroupStatsResponse>
      directListGroupStatsCallable =
          GrpcCallableFactory.createDirectCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.UNARY,
                  "google.devtools.clouderrorreporting.v1beta1.ErrorStatsService/ListGroupStats",
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      ListGroupStatsRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      ListGroupStatsResponse.getDefaultInstance())));
  private static final UnaryCallableImpl<ListEventsRequest, ListEventsResponse>
      directListEventsCallable =
          GrpcCallableFactory.createDirectCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.UNARY,
                  "google.devtools.clouderrorreporting.v1beta1.ErrorStatsService/ListEvents",
                  io.grpc.protobuf.ProtoUtils.marshaller(ListEventsRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(ListEventsResponse.getDefaultInstance())));
  private static final UnaryCallableImpl<DeleteEventsRequest, DeleteEventsResponse>
      directDeleteEventsCallable =
          GrpcCallableFactory.createDirectCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.UNARY,
                  "google.devtools.clouderrorreporting.v1beta1.ErrorStatsService/DeleteEvents",
                  io.grpc.protobuf.ProtoUtils.marshaller(DeleteEventsRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      DeleteEventsResponse.getDefaultInstance())));
  private final List<AutoCloseable> closeables = new ArrayList<>();

  private final UnaryCallable<ListGroupStatsRequest, ListGroupStatsResponse> listGroupStatsCallable;
  private final UnaryCallable<ListGroupStatsRequest, ListGroupStatsPagedResponse>
      listGroupStatsPagedCallable;
  private final UnaryCallable<ListEventsRequest, ListEventsResponse> listEventsCallable;
  private final UnaryCallable<ListEventsRequest, ListEventsPagedResponse> listEventsPagedCallable;
  private final UnaryCallable<DeleteEventsRequest, DeleteEventsResponse> deleteEventsCallable;

  public static final GrpcErrorStatsServiceStub create(ErrorStatsServiceSettings settings)
      throws IOException {
    return new GrpcErrorStatsServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcErrorStatsServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcErrorStatsServiceStub(
        ErrorStatsServiceSettings.defaultBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of GrpcErrorStatsServiceStub, using the given settings. This is
   * protected so that it easy to make a subclass, but otherwise, the static factory methods should
   * be preferred.
   */
  protected GrpcErrorStatsServiceStub(
      ErrorStatsServiceSettings settings, ClientContext clientContext) throws IOException {

    this.listGroupStatsCallable =
        GrpcCallableFactory.create(
            directListGroupStatsCallable, settings.listGroupStatsSettings(), clientContext);
    this.listGroupStatsPagedCallable =
        GrpcCallableFactory.createPagedVariant(
            directListGroupStatsCallable, settings.listGroupStatsSettings(), clientContext);
    this.listEventsCallable =
        GrpcCallableFactory.create(
            directListEventsCallable, settings.listEventsSettings(), clientContext);
    this.listEventsPagedCallable =
        GrpcCallableFactory.createPagedVariant(
            directListEventsCallable, settings.listEventsSettings(), clientContext);
    this.deleteEventsCallable =
        GrpcCallableFactory.create(
            directDeleteEventsCallable, settings.deleteEventsSettings(), clientContext);

    closeables.addAll(clientContext.getCloseables());
  }

  public UnaryCallable<ListGroupStatsRequest, ListGroupStatsPagedResponse>
      listGroupStatsPagedCallable() {
    return listGroupStatsPagedCallable;
  }

  public UnaryCallable<ListGroupStatsRequest, ListGroupStatsResponse> listGroupStatsCallable() {
    return listGroupStatsCallable;
  }

  public UnaryCallable<ListEventsRequest, ListEventsPagedResponse> listEventsPagedCallable() {
    return listEventsPagedCallable;
  }

  public UnaryCallable<ListEventsRequest, ListEventsResponse> listEventsCallable() {
    return listEventsCallable;
  }

  public UnaryCallable<DeleteEventsRequest, DeleteEventsResponse> deleteEventsCallable() {
    return deleteEventsCallable;
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
