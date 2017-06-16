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
package com.google.cloud.vision.v1.stub;

import com.google.api.core.BetaApi;
import com.google.api.gax.grpc.GrpcCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.gax.rpc.UnaryCallableImpl;
import com.google.cloud.vision.v1.BatchAnnotateImagesRequest;
import com.google.cloud.vision.v1.BatchAnnotateImagesResponse;
import com.google.cloud.vision.v1.ImageAnnotatorSettings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@Generated("by GAPIC v0.0.5")
@BetaApi
public class GrpcImageAnnotatorStub extends ImageAnnotatorStub {
  private static final UnaryCallableImpl<BatchAnnotateImagesRequest, BatchAnnotateImagesResponse>
      directBatchAnnotateImagesCallable =
          GrpcCallableFactory.createDirectCallable(
              io.grpc.MethodDescriptor.create(
                  io.grpc.MethodDescriptor.MethodType.UNARY,
                  "google.cloud.vision.v1.ImageAnnotator/BatchAnnotateImages",
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      BatchAnnotateImagesRequest.getDefaultInstance()),
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      BatchAnnotateImagesResponse.getDefaultInstance())));
  private final List<AutoCloseable> closeables = new ArrayList<>();

  private final UnaryCallable<BatchAnnotateImagesRequest, BatchAnnotateImagesResponse>
      batchAnnotateImagesCallable;

  public static final GrpcImageAnnotatorStub create(ImageAnnotatorSettings settings)
      throws IOException {
    return new GrpcImageAnnotatorStub(settings, ClientContext.create(settings));
  }

  public static final GrpcImageAnnotatorStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcImageAnnotatorStub(
        ImageAnnotatorSettings.defaultBuilder().build(), clientContext);
  }

  /**
   * Constructs an instance of GrpcImageAnnotatorStub, using the given settings. This is protected
   * so that it easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected GrpcImageAnnotatorStub(ImageAnnotatorSettings settings, ClientContext clientContext)
      throws IOException {

    this.batchAnnotateImagesCallable =
        GrpcCallableFactory.create(
            directBatchAnnotateImagesCallable,
            settings.batchAnnotateImagesSettings(),
            clientContext);

    closeables.addAll(clientContext.getCloseables());
  }

  public UnaryCallable<BatchAnnotateImagesRequest, BatchAnnotateImagesResponse>
      batchAnnotateImagesCallable() {
    return batchAnnotateImagesCallable;
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
