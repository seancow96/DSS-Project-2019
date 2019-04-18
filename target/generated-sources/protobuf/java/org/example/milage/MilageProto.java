// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: milage.proto

package org.example.milage;

public final class MilageProto {
  private MilageProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_milage_TirePressureResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_milage_TirePressureResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_milage_FuelLevelResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_milage_FuelLevelResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_milage_Welcome_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_milage_Welcome_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_milage_WelcomeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_milage_WelcomeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_milage_WelcomeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_milage_WelcomeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_milage_DaysRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_milage_DaysRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_milage_AverageMilesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_milage_AverageMilesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_milage_TotalResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_milage_TotalResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_milage_MaxMileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_milage_MaxMileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_milage_MaxMileResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_milage_MaxMileResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_milage_CostResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_milage_CostResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014milage.proto\022\006milage\032\033google/protobuf/" +
      "empty.proto\"/\n\024TirePressureResponse\022\027\n\017c" +
      "urrentpressure\030\001 \001(\005\"-\n\021FuelLevelRespons" +
      "e\022\030\n\020currentfuellevel\030\001 \001(\001\"\034\n\007Welcome\022\021" +
      "\n\tgreetuser\030\001 \001(\t\"2\n\016WelcomeRequest\022 \n\007w" +
      "elcome\030\001 \001(\0132\017.milage.Welcome\"&\n\017Welcome" +
      "Response\022\023\n\013greeteduser\030\001 \001(\t\"\241\001\n\013DaysRe" +
      "quest\022\016\n\006monday\030\001 \001(\001\022\017\n\007tuesday\030\002 \001(\001\022\021" +
      "\n\twednesday\030\003 \001(\001\022\020\n\010thursday\030\004 \001(\001\022\016\n\006f" +
      "riday\030\005 \001(\001\022\020\n\010saturday\030\006 \001(\001\022\016\n\006sunday\030" +
      "\007 \001(\001\022\013\n\003mpg\030\010 \001(\005\022\r\n\005price\030\t \001(\001\"\'\n\024Ave" +
      "rageMilesResponse\022\017\n\007average\030\001 \001(\001\"\037\n\rTo" +
      "talResponse\022\016\n\006result\030\001 \001(\001\" \n\016MaxMileRe" +
      "quest\022\016\n\006number\030\001 \001(\005\"#\n\017MaxMileResponse" +
      "\022\020\n\010maxmiles\030\001 \001(\005\"\034\n\014CostResponse\022\014\n\004co" +
      "st\030\001 \001(\0012\362\003\n\rMilageService\022<\n\007Welcome\022\026." +
      "milage.WelcomeRequest\032\027.milage.WelcomeRe" +
      "sponse\"\000\022:\n\nTotalMiles\022\023.milage.DaysRequ" +
      "est\032\025.milage.TotalResponse\"\000\022E\n\014AverageM" +
      "iles\022\023.milage.DaysRequest\032\034.milage.Avera" +
      "geMilesResponse\"\000(\001\022N\n\025FindMaxMilesTrave" +
      "lled\022\026.milage.MaxMileRequest\032\027.milage.Ma" +
      "xMileResponse\"\000(\0010\001\022<\n\rCalculateCost\022\023.m" +
      "ilage.DaysRequest\032\024.milage.CostResponse\"" +
      "\000\022K\n\021CheckTirePressure\022\026.google.protobuf" +
      ".Empty\032\034.milage.TirePressureResponse\"\000\022E" +
      "\n\016CheckFuelLevel\022\026.google.protobuf.Empty" +
      "\032\031.milage.FuelLevelResponse\"\000B#\n\022org.exa" +
      "mple.milageB\013MilageProtoP\001b\006proto3"
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
          com.google.protobuf.EmptyProto.getDescriptor(),
        }, assigner);
    internal_static_milage_TirePressureResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_milage_TirePressureResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_milage_TirePressureResponse_descriptor,
        new java.lang.String[] { "Currentpressure", });
    internal_static_milage_FuelLevelResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_milage_FuelLevelResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_milage_FuelLevelResponse_descriptor,
        new java.lang.String[] { "Currentfuellevel", });
    internal_static_milage_Welcome_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_milage_Welcome_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_milage_Welcome_descriptor,
        new java.lang.String[] { "Greetuser", });
    internal_static_milage_WelcomeRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_milage_WelcomeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_milage_WelcomeRequest_descriptor,
        new java.lang.String[] { "Welcome", });
    internal_static_milage_WelcomeResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_milage_WelcomeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_milage_WelcomeResponse_descriptor,
        new java.lang.String[] { "Greeteduser", });
    internal_static_milage_DaysRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_milage_DaysRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_milage_DaysRequest_descriptor,
        new java.lang.String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Mpg", "Price", });
    internal_static_milage_AverageMilesResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_milage_AverageMilesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_milage_AverageMilesResponse_descriptor,
        new java.lang.String[] { "Average", });
    internal_static_milage_TotalResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_milage_TotalResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_milage_TotalResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_milage_MaxMileRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_milage_MaxMileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_milage_MaxMileRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_milage_MaxMileResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_milage_MaxMileResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_milage_MaxMileResponse_descriptor,
        new java.lang.String[] { "Maxmiles", });
    internal_static_milage_CostResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_milage_CostResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_milage_CostResponse_descriptor,
        new java.lang.String[] { "Cost", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
