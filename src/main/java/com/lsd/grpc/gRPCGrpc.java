package com.lsd.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: keyPress.proto")
public final class gRPCGrpc {

  private gRPCGrpc() {}

  public static final String SERVICE_NAME = "gRPC";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<KeyPress.KeyRequest,
      KeyPress.KeyReply> getKeyPressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "com.lsd.grpc.KeyPress",
      requestType = KeyPress.KeyRequest.class,
      responseType = KeyPress.KeyReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<KeyPress.KeyRequest,
      KeyPress.KeyReply> getKeyPressMethod() {
    io.grpc.MethodDescriptor<KeyPress.KeyRequest, KeyPress.KeyReply> getKeyPressMethod;
    if ((getKeyPressMethod = gRPCGrpc.getKeyPressMethod) == null) {
      synchronized (gRPCGrpc.class) {
        if ((getKeyPressMethod = gRPCGrpc.getKeyPressMethod) == null) {
          gRPCGrpc.getKeyPressMethod = getKeyPressMethod = 
              io.grpc.MethodDescriptor.<KeyPress.KeyRequest, KeyPress.KeyReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gRPC", "com.lsd.grpc.KeyPress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  KeyPress.KeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  KeyPress.KeyReply.getDefaultInstance()))
                  .setSchemaDescriptor(new gRPCMethodDescriptorSupplier("com.lsd.grpc.KeyPress"))
                  .build();
          }
        }
     }
     return getKeyPressMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static gRPCStub newStub(io.grpc.Channel channel) {
    return new gRPCStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static gRPCBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new gRPCBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static gRPCFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new gRPCFutureStub(channel);
  }

  /**
   */
  public static abstract class gRPCImplBase implements io.grpc.BindableService {

    /**
     */
    public void keyPress(KeyPress.KeyRequest request,
        io.grpc.stub.StreamObserver<KeyPress.KeyReply> responseObserver) {
      asyncUnimplementedUnaryCall(getKeyPressMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getKeyPressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                KeyPress.KeyRequest,
                KeyPress.KeyReply>(
                  this, METHODID_KEY_PRESS)))
          .build();
    }
  }

  /**
   */
  public static final class gRPCStub extends io.grpc.stub.AbstractStub<gRPCStub> {
    private gRPCStub(io.grpc.Channel channel) {
      super(channel);
    }

    private gRPCStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected gRPCStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new gRPCStub(channel, callOptions);
    }

    /**
     */
    public void keyPress(KeyPress.KeyRequest request,
        io.grpc.stub.StreamObserver<KeyPress.KeyReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getKeyPressMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class gRPCBlockingStub extends io.grpc.stub.AbstractStub<gRPCBlockingStub> {
    private gRPCBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private gRPCBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected gRPCBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new gRPCBlockingStub(channel, callOptions);
    }

    /**
     */
    public KeyPress.KeyReply keyPress(KeyPress.KeyRequest request) {
      return blockingUnaryCall(
          getChannel(), getKeyPressMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class gRPCFutureStub extends io.grpc.stub.AbstractStub<gRPCFutureStub> {
    private gRPCFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private gRPCFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected gRPCFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new gRPCFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<KeyPress.KeyReply> keyPress(
        KeyPress.KeyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getKeyPressMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_KEY_PRESS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final gRPCImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(gRPCImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_KEY_PRESS:
          serviceImpl.keyPress((KeyPress.KeyRequest) request,
              (io.grpc.stub.StreamObserver<KeyPress.KeyReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class gRPCBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    gRPCBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return KeyPress.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("gRPC");
    }
  }

  private static final class gRPCFileDescriptorSupplier
      extends gRPCBaseDescriptorSupplier {
    gRPCFileDescriptorSupplier() {}
  }

  private static final class gRPCMethodDescriptorSupplier
      extends gRPCBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    gRPCMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (gRPCGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new gRPCFileDescriptorSupplier())
              .addMethod(getKeyPressMethod())
              .build();
        }
      }
    }
    return result;
  }
}
