// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speaker.proto

package org.example.speaker;

public final class SpeakerProto {
  private SpeakerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speaker_Speaker_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speaker_Speaker_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speaker_SpeakerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speaker_SpeakerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speaker_SpeakerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speaker_SpeakerResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speaker_DeviceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speaker_DeviceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speaker_DeviceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speaker_DeviceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speaker_AverageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speaker_AverageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speaker_AverageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speaker_AverageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speaker_FindMaximumRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speaker_FindMaximumRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_speaker_FindMaximumResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_speaker_FindMaximumResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rspeaker.proto\022\007speaker\"P\n\007Speaker\022\025\n\rt" +
      "urnspeakeron\030\001 \001(\t\022\026\n\016turnspeakeroff\030\002 \001" +
      "(\t\022\026\n\016connectspeaker\030\003 \001(\t\"3\n\016SpeakerReq" +
      "uest\022!\n\007speaker\030\001 \001(\0132\020.speaker.Speaker\"" +
      "\'\n\017SpeakerResponse\022\024\n\014speakerstate\030\001 \001(\t" +
      "\"2\n\rDeviceRequest\022!\n\007speaker\030\001 \001(\0132\020.spe" +
      "aker.Speaker\"#\n\016DeviceResponse\022\021\n\tconnec" +
      "ted\030\001 \001(\t\"M\n\016AverageRequest\022\022\n\nfirst_son" +
      "g\030\001 \001(\005\022\023\n\013second_song\030\002 \001(\005\022\022\n\nthird_so" +
      "ng\030\003 \001(\005\"\"\n\017AverageResponse\022\017\n\007average\030\001" +
      " \001(\001\"$\n\022FindMaximumRequest\022\016\n\006number\030\001 \001" +
      "(\005\"&\n\023FindMaximumResponse\022\017\n\007maximum\030\001 \001" +
      "(\0052\367\002\n\016SpeakerService\022@\n\tSpeakerOn\022\027.spe" +
      "aker.SpeakerRequest\032\030.speaker.SpeakerRes" +
      "ponse\"\000\022A\n\nSpeakerOff\022\027.speaker.SpeakerR" +
      "equest\032\030.speaker.SpeakerResponse\"\000\022D\n\rCo" +
      "nnectDevice\022\026.speaker.DeviceRequest\032\027.sp" +
      "eaker.DeviceResponse\"\000(\001\022E\n\014AverageViews" +
      "\022\027.speaker.AverageRequest\032\030.speaker.Aver" +
      "ageResponse\"\000(\001\022S\n\020FindMaximumViews\022\033.sp" +
      "eaker.FindMaximumRequest\032\034.speaker.FindM" +
      "aximumResponse\"\000(\0010\001B%\n\023org.example.spea" +
      "kerB\014SpeakerProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_speaker_Speaker_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_speaker_Speaker_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speaker_Speaker_descriptor,
        new java.lang.String[] { "Turnspeakeron", "Turnspeakeroff", "Connectspeaker", });
    internal_static_speaker_SpeakerRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_speaker_SpeakerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speaker_SpeakerRequest_descriptor,
        new java.lang.String[] { "Speaker", });
    internal_static_speaker_SpeakerResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_speaker_SpeakerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speaker_SpeakerResponse_descriptor,
        new java.lang.String[] { "Speakerstate", });
    internal_static_speaker_DeviceRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_speaker_DeviceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speaker_DeviceRequest_descriptor,
        new java.lang.String[] { "Speaker", });
    internal_static_speaker_DeviceResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_speaker_DeviceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speaker_DeviceResponse_descriptor,
        new java.lang.String[] { "Connected", });
    internal_static_speaker_AverageRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_speaker_AverageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speaker_AverageRequest_descriptor,
        new java.lang.String[] { "FirstSong", "SecondSong", "ThirdSong", });
    internal_static_speaker_AverageResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_speaker_AverageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speaker_AverageResponse_descriptor,
        new java.lang.String[] { "Average", });
    internal_static_speaker_FindMaximumRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_speaker_FindMaximumRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speaker_FindMaximumRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_speaker_FindMaximumResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_speaker_FindMaximumResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_speaker_FindMaximumResponse_descriptor,
        new java.lang.String[] { "Maximum", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
