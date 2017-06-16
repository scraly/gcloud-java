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

import static com.google.cloud.logging.v2.PagedResponseWrappers.ListLogEntriesPagedResponse;
import static com.google.cloud.logging.v2.PagedResponseWrappers.ListLogsPagedResponse;
import static com.google.cloud.logging.v2.PagedResponseWrappers.ListMonitoredResourceDescriptorsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.grpc.GrpcCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.gax.rpc.UnaryCallableImpl;
import com.google.cloud.logging.v2.LoggingSettings;
import com.google.logging.v2.DeleteLogRequest;
import com.google.logging.v2.ListLogEntriesRequest;
import com.google.logging.v2.ListLogEntriesResponse;
import com.google.logging.v2.ListLogsRequest;
import com.google.logging.v2.ListLogsResponse;
import com.google.logging.v2.ListMonitoredResourceDescriptorsRequest;
import com.google.logging.v2.ListMonitoredResourceDescriptorsResponse;
import com.google.logging.v2.WriteLogEntriesRequest;
import com.google.logging.v2.WriteLogEntriesResponse;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@Generated("by GAPIC v0.0.5")
@BetaApi
public class GrpcLoggingStub extends LoggingStub {
  private static final UnaryCallableImpl<DeleteLogRequest, Empty> directDeleteLogCallable =
      GrpcCallableFactory.createDirectCallable(
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.logging.v2.LoggingServiceV2/DeleteLog",
              io.grpc.protobuf.ProtoUtils.marshaller(DeleteLogRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(Empty.getDefaultInstance())));
  private static final UnaryCallableImpl<WriteLogEntriesRequest, WriteLogEntriesResponse>
      directWriteLogEntriesCallable =
          GrpcCallableFactory.createDirectCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.UNARY,
                  "google.logging.v2.LoggingServiceV2/WriteLogEntries",
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      WriteLogEntriesRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      WriteLogEntriesResponse.getDefaultInstance())));
  private static final UnaryCallableImpl<ListLogEntriesRequest, ListLogEntriesResponse>
      directListLogEntriesCallable =
          GrpcCallableFactory.createDirectCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.UNARY,
                  "google.logging.v2.LoggingServiceV2/ListLogEntries",
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      ListLogEntriesRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      ListLogEntriesResponse.getDefaultInstance())));
  private static final UnaryCallableImpl<
          ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse>
      directListMonitoredResourceDescriptorsCallable =
          GrpcCallableFactory.createDirectCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.UNARY,
                  "google.logging.v2.LoggingServiceV2/ListMonitoredResourceDescriptors",
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      ListMonitoredResourceDescriptorsRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      ListMonitoredResourceDescriptorsResponse.getDefaultInstance())));
  private static final UnaryCallableImpl<ListLogsRequest, ListLogsResponse> directListLogsCallable =
      GrpcCallableFactory.createDirectCallable(
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.logging.v2.LoggingServiceV2/ListLogs",
              io.grpc.protobuf.ProtoUtils.marshaller(ListLogsRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(ListLogsResponse.getDefaultInstance())));
  private final List<AutoCloseable> closeables = new ArrayList<>();

  private final UnaryCallable<DeleteLogRequest, Empty> deleteLogCallable;
  private final UnaryCallable<WriteLogEntriesRequest, WriteLogEntriesResponse>
      writeLogEntriesCallable;
  private final UnaryCallable<ListLogEntriesRequest, ListLogEntriesResponse> listLogEntriesCallable;
  private final UnaryCallable<ListLogEntriesRequest, ListLogEntriesPagedResponse>
      listLogEntriesPagedCallable;
  private final UnaryCallable<
          ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse>
      listMonitoredResourceDescriptorsCallable;
  private final UnaryCallable<
          ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsPagedResponse>
      listMonitoredResourceDescriptorsPagedCallable;
  private final UnaryCallable<ListLogsRequest, ListLogsResponse> listLogsCallable;
  private final UnaryCallable<ListLogsRequest, ListLogsPagedResponse> listLogsPagedCallable;

  public static final GrpcLoggingStub create(LoggingSettings settings) throws IOException {
    return new GrpcLoggingStub(settings);
  }

  /**
   * Constructs an instance of GrpcLoggingStub, using the given settings. This is protected so that
   * it easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected GrpcLoggingStub(LoggingSettings settings) throws IOException {
    ClientContext clientContext = ClientContext.create(settings);

    this.deleteLogCallable =
        GrpcCallableFactory.create(
            directDeleteLogCallable, settings.deleteLogSettings(), clientContext);
    this.writeLogEntriesCallable =
        GrpcCallableFactory.create(
            directWriteLogEntriesCallable, settings.writeLogEntriesSettings(), clientContext);
    this.listLogEntriesCallable =
        GrpcCallableFactory.create(
            directListLogEntriesCallable, settings.listLogEntriesSettings(), clientContext);
    this.listLogEntriesPagedCallable =
        GrpcCallableFactory.createPagedVariant(
            directListLogEntriesCallable, settings.listLogEntriesSettings(), clientContext);
    this.listMonitoredResourceDescriptorsCallable =
        GrpcCallableFactory.create(
            directListMonitoredResourceDescriptorsCallable,
            settings.listMonitoredResourceDescriptorsSettings(),
            clientContext);
    this.listMonitoredResourceDescriptorsPagedCallable =
        GrpcCallableFactory.createPagedVariant(
            directListMonitoredResourceDescriptorsCallable,
            settings.listMonitoredResourceDescriptorsSettings(),
            clientContext);
    this.listLogsCallable =
        GrpcCallableFactory.create(
            directListLogsCallable, settings.listLogsSettings(), clientContext);
    this.listLogsPagedCallable =
        GrpcCallableFactory.createPagedVariant(
            directListLogsCallable, settings.listLogsSettings(), clientContext);

    closeables.addAll(clientContext.getCloseables());
  }

  public final UnaryCallable<DeleteLogRequest, Empty> deleteLogCallable() {
    return deleteLogCallable;
  }

  public final UnaryCallable<WriteLogEntriesRequest, WriteLogEntriesResponse>
      writeLogEntriesCallable() {
    return writeLogEntriesCallable;
  }

  public final UnaryCallable<ListLogEntriesRequest, ListLogEntriesPagedResponse>
      listLogEntriesPagedCallable() {
    return listLogEntriesPagedCallable;
  }

  public final UnaryCallable<ListLogEntriesRequest, ListLogEntriesResponse>
      listLogEntriesCallable() {
    return listLogEntriesCallable;
  }

  public final UnaryCallable<
          ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsPagedResponse>
      listMonitoredResourceDescriptorsPagedCallable() {
    return listMonitoredResourceDescriptorsPagedCallable;
  }

  public final UnaryCallable<
          ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse>
      listMonitoredResourceDescriptorsCallable() {
    return listMonitoredResourceDescriptorsCallable;
  }

  public final UnaryCallable<ListLogsRequest, ListLogsPagedResponse> listLogsPagedCallable() {
    return listLogsPagedCallable;
  }

  public final UnaryCallable<ListLogsRequest, ListLogsResponse> listLogsCallable() {
    return listLogsCallable;
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
