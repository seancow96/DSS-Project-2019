package org.example.radio;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The speaker service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: radio.proto")
public final class RadioServiceGrpc {

  private RadioServiceGrpc() {}

  public static final String SERVICE_NAME = "radio.RadioService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.radio.RadioRequest,
      org.example.radio.RadioResponse> getRadioOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RadioOn",
      requestType = org.example.radio.RadioRequest.class,
      responseType = org.example.radio.RadioResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.radio.RadioRequest,
      org.example.radio.RadioResponse> getRadioOnMethod() {
    io.grpc.MethodDescriptor<org.example.radio.RadioRequest, org.example.radio.RadioResponse> getRadioOnMethod;
    if ((getRadioOnMethod = RadioServiceGrpc.getRadioOnMethod) == null) {
      synchronized (RadioServiceGrpc.class) {
        if ((getRadioOnMethod = RadioServiceGrpc.getRadioOnMethod) == null) {
          RadioServiceGrpc.getRadioOnMethod = getRadioOnMethod = 
              io.grpc.MethodDescriptor.<org.example.radio.RadioRequest, org.example.radio.RadioResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "radio.RadioService", "RadioOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.radio.RadioRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.radio.RadioResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadioServiceMethodDescriptorSupplier("RadioOn"))
                  .build();
          }
        }
     }
     return getRadioOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.radio.RadioRequest,
      org.example.radio.RadioResponse> getRadioOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RadioOff",
      requestType = org.example.radio.RadioRequest.class,
      responseType = org.example.radio.RadioResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.radio.RadioRequest,
      org.example.radio.RadioResponse> getRadioOffMethod() {
    io.grpc.MethodDescriptor<org.example.radio.RadioRequest, org.example.radio.RadioResponse> getRadioOffMethod;
    if ((getRadioOffMethod = RadioServiceGrpc.getRadioOffMethod) == null) {
      synchronized (RadioServiceGrpc.class) {
        if ((getRadioOffMethod = RadioServiceGrpc.getRadioOffMethod) == null) {
          RadioServiceGrpc.getRadioOffMethod = getRadioOffMethod = 
              io.grpc.MethodDescriptor.<org.example.radio.RadioRequest, org.example.radio.RadioResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "radio.RadioService", "RadioOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.radio.RadioRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.radio.RadioResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadioServiceMethodDescriptorSupplier("RadioOff"))
                  .build();
          }
        }
     }
     return getRadioOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.radio.VolumeRequest,
      org.example.radio.VolumeResponse> getVolumeUpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VolumeUp",
      requestType = org.example.radio.VolumeRequest.class,
      responseType = org.example.radio.VolumeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.radio.VolumeRequest,
      org.example.radio.VolumeResponse> getVolumeUpMethod() {
    io.grpc.MethodDescriptor<org.example.radio.VolumeRequest, org.example.radio.VolumeResponse> getVolumeUpMethod;
    if ((getVolumeUpMethod = RadioServiceGrpc.getVolumeUpMethod) == null) {
      synchronized (RadioServiceGrpc.class) {
        if ((getVolumeUpMethod = RadioServiceGrpc.getVolumeUpMethod) == null) {
          RadioServiceGrpc.getVolumeUpMethod = getVolumeUpMethod = 
              io.grpc.MethodDescriptor.<org.example.radio.VolumeRequest, org.example.radio.VolumeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "radio.RadioService", "VolumeUp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.radio.VolumeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.radio.VolumeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RadioServiceMethodDescriptorSupplier("VolumeUp"))
                  .build();
          }
        }
     }
     return getVolumeUpMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RadioServiceStub newStub(io.grpc.Channel channel) {
    return new RadioServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RadioServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RadioServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RadioServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RadioServiceFutureStub(channel);
  }

  /**
   * <pre>
   * The speaker service definition.
   * </pre>
   */
  public static abstract class RadioServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *uranary
     * </pre>
     */
    public void radioOn(org.example.radio.RadioRequest request,
        io.grpc.stub.StreamObserver<org.example.radio.RadioResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRadioOnMethod(), responseObserver);
    }

    /**
     */
    public void radioOff(org.example.radio.RadioRequest request,
        io.grpc.stub.StreamObserver<org.example.radio.RadioResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRadioOffMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.radio.VolumeRequest> volumeUp(
        io.grpc.stub.StreamObserver<org.example.radio.VolumeResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getVolumeUpMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRadioOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.radio.RadioRequest,
                org.example.radio.RadioResponse>(
                  this, METHODID_RADIO_ON)))
          .addMethod(
            getRadioOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.example.radio.RadioRequest,
                org.example.radio.RadioResponse>(
                  this, METHODID_RADIO_OFF)))
          .addMethod(
            getVolumeUpMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.example.radio.VolumeRequest,
                org.example.radio.VolumeResponse>(
                  this, METHODID_VOLUME_UP)))
          .build();
    }
  }

  /**
   * <pre>
   * The speaker service definition.
   * </pre>
   */
  public static final class RadioServiceStub extends io.grpc.stub.AbstractStub<RadioServiceStub> {
    private RadioServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadioServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadioServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadioServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *uranary
     * </pre>
     */
    public void radioOn(org.example.radio.RadioRequest request,
        io.grpc.stub.StreamObserver<org.example.radio.RadioResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRadioOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void radioOff(org.example.radio.RadioRequest request,
        io.grpc.stub.StreamObserver<org.example.radio.RadioResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRadioOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.example.radio.VolumeRequest> volumeUp(
        io.grpc.stub.StreamObserver<org.example.radio.VolumeResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getVolumeUpMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * The speaker service definition.
   * </pre>
   */
  public static final class RadioServiceBlockingStub extends io.grpc.stub.AbstractStub<RadioServiceBlockingStub> {
    private RadioServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadioServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadioServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadioServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *uranary
     * </pre>
     */
    public org.example.radio.RadioResponse radioOn(org.example.radio.RadioRequest request) {
      return blockingUnaryCall(
          getChannel(), getRadioOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.radio.RadioResponse radioOff(org.example.radio.RadioRequest request) {
      return blockingUnaryCall(
          getChannel(), getRadioOffMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The speaker service definition.
   * </pre>
   */
  public static final class RadioServiceFutureStub extends io.grpc.stub.AbstractStub<RadioServiceFutureStub> {
    private RadioServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RadioServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RadioServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RadioServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *uranary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.radio.RadioResponse> radioOn(
        org.example.radio.RadioRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRadioOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.radio.RadioResponse> radioOff(
        org.example.radio.RadioRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRadioOffMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RADIO_ON = 0;
  private static final int METHODID_RADIO_OFF = 1;
  private static final int METHODID_VOLUME_UP = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RadioServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RadioServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RADIO_ON:
          serviceImpl.radioOn((org.example.radio.RadioRequest) request,
              (io.grpc.stub.StreamObserver<org.example.radio.RadioResponse>) responseObserver);
          break;
        case METHODID_RADIO_OFF:
          serviceImpl.radioOff((org.example.radio.RadioRequest) request,
              (io.grpc.stub.StreamObserver<org.example.radio.RadioResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VOLUME_UP:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.volumeUp(
              (io.grpc.stub.StreamObserver<org.example.radio.VolumeResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RadioServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RadioServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.radio.RadioProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RadioService");
    }
  }

  private static final class RadioServiceFileDescriptorSupplier
      extends RadioServiceBaseDescriptorSupplier {
    RadioServiceFileDescriptorSupplier() {}
  }

  private static final class RadioServiceMethodDescriptorSupplier
      extends RadioServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RadioServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RadioServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RadioServiceFileDescriptorSupplier())
              .addMethod(getRadioOnMethod())
              .addMethod(getRadioOffMethod())
              .addMethod(getVolumeUpMethod())
              .build();
        }
      }
    }
    return result;
  }
}
