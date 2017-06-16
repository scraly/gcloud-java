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

import com.google.api.core.BetaApi;
import com.google.api.gax.grpc.GrpcCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.gax.rpc.UnaryCallableImpl;
import com.google.cloud.errorreporting.v1beta1.ErrorGroupServiceSettings;
import com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup;
import com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest;
import com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@Generated("by GAPIC v0.0.5")
@BetaApi
public class GrpcErrorGroupServiceStub extends ErrorGroupServiceStub {
  private static final UnaryCallableImpl<GetGroupRequest, ErrorGroup> directGetGroupCallable =
      GrpcCallableFactory.createDirectCallable(
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.devtools.clouderrorreporting.v1beta1.ErrorGroupService/GetGroup",
              io.grpc.protobuf.ProtoUtils.marshaller(GetGroupRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(ErrorGroup.getDefaultInstance())));
  private static final UnaryCallableImpl<UpdateGroupRequest, ErrorGroup> directUpdateGroupCallable =
      GrpcCallableFactory.createDirectCallable(
          io.grpc.MethodDescriptor.create(
              io.grpc.MethodDescriptor.MethodType.UNARY,
              "google.devtools.clouderrorreporting.v1beta1.ErrorGroupService/UpdateGroup",
              io.grpc.protobuf.ProtoUtils.marshaller(UpdateGroupRequest.getDefaultInstance()),
              io.grpc.protobuf.ProtoUtils.marshaller(ErrorGroup.getDefaultInstance())));
  private final List<AutoCloseable> closeables = new ArrayList<>();

  private final UnaryCallable<GetGroupRequest, ErrorGroup> getGroupCallable;
  private final UnaryCallable<UpdateGroupRequest, ErrorGroup> updateGroupCallable;

  public static final GrpcErrorGroupServiceStub create(ErrorGroupServiceSettings settings)
      throws IOException {
    return new GrpcErrorGroupServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcErrorGroupServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcErrorGroupServiceStub(
        ErrorGroupServiceSettings.defaultBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of GrpcErrorGroupServiceStub, using the given settings. This is
   * protected so that it easy to make a subclass, but otherwise, the static factory methods should
   * be preferred.
   */
  protected GrpcErrorGroupServiceStub(
      ErrorGroupServiceSettings settings, ClientContext clientContext) throws IOException {

    this.getGroupCallable =
        GrpcCallableFactory.create(
            directGetGroupCallable, settings.getGroupSettings(), clientContext);
    this.updateGroupCallable =
        GrpcCallableFactory.create(
            directUpdateGroupCallable, settings.updateGroupSettings(), clientContext);

    closeables.addAll(clientContext.getCloseables());
  }

  public UnaryCallable<GetGroupRequest, ErrorGroup> getGroupCallable() {
    return getGroupCallable;
  }

  public UnaryCallable<UpdateGroupRequest, ErrorGroup> updateGroupCallable() {
    return updateGroupCallable;
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
