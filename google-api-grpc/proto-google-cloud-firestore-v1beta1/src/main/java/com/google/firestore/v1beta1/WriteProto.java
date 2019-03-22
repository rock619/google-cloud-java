// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1beta1/write.proto

package com.google.firestore.v1beta1;

public final class WriteProto {
  private WriteProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1beta1_Write_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_Write_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1beta1_DocumentTransform_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_DocumentTransform_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1beta1_DocumentTransform_FieldTransform_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_DocumentTransform_FieldTransform_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1beta1_WriteResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_WriteResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1beta1_DocumentChange_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_DocumentChange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1beta1_DocumentDelete_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_DocumentDelete_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1beta1_DocumentRemove_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_DocumentRemove_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_firestore_v1beta1_ExistenceFilter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_firestore_v1beta1_ExistenceFilter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n$google/firestore/v1beta1/write.proto\022\030"
          + "google.firestore.v1beta1\032%google/firesto"
          + "re/v1beta1/common.proto\032\'google/firestor"
          + "e/v1beta1/document.proto\032\037google/protobu"
          + "f/timestamp.proto\032\034google/api/annotation"
          + "s.proto\"\235\002\n\005Write\0224\n\006update\030\001 \001(\0132\".goog"
          + "le.firestore.v1beta1.DocumentH\000\022\020\n\006delet"
          + "e\030\002 \001(\tH\000\022@\n\ttransform\030\006 \001(\0132+.google.fi"
          + "restore.v1beta1.DocumentTransformH\000\022;\n\013u"
          + "pdate_mask\030\003 \001(\0132&.google.firestore.v1be"
          + "ta1.DocumentMask\022@\n\020current_document\030\004 \001"
          + "(\0132&.google.firestore.v1beta1.Preconditi"
          + "onB\013\n\toperation\"\210\005\n\021DocumentTransform\022\020\n"
          + "\010document\030\001 \001(\t\022T\n\020field_transforms\030\002 \003("
          + "\0132:.google.firestore.v1beta1.DocumentTra"
          + "nsform.FieldTransform\032\212\004\n\016FieldTransform"
          + "\022\022\n\nfield_path\030\001 \001(\t\022e\n\023set_to_server_va"
          + "lue\030\002 \001(\0162F.google.firestore.v1beta1.Doc"
          + "umentTransform.FieldTransform.ServerValu"
          + "eH\000\0224\n\tincrement\030\003 \001(\0132\037.google.firestor"
          + "e.v1beta1.ValueH\000\0222\n\007maximum\030\004 \001(\0132\037.goo"
          + "gle.firestore.v1beta1.ValueH\000\0222\n\007minimum"
          + "\030\005 \001(\0132\037.google.firestore.v1beta1.ValueH"
          + "\000\022G\n\027append_missing_elements\030\006 \001(\0132$.goo"
          + "gle.firestore.v1beta1.ArrayValueH\000\022E\n\025re"
          + "move_all_from_array\030\007 \001(\0132$.google.fires"
          + "tore.v1beta1.ArrayValueH\000\"=\n\013ServerValue"
          + "\022\034\n\030SERVER_VALUE_UNSPECIFIED\020\000\022\020\n\014REQUES"
          + "T_TIME\020\001B\020\n\016transform_type\"z\n\013WriteResul"
          + "t\022/\n\013update_time\030\001 \001(\0132\032.google.protobuf"
          + ".Timestamp\022:\n\021transform_results\030\002 \003(\0132\037."
          + "google.firestore.v1beta1.Value\"v\n\016Docume"
          + "ntChange\0224\n\010document\030\001 \001(\0132\".google.fire"
          + "store.v1beta1.Document\022\022\n\ntarget_ids\030\005 \003"
          + "(\005\022\032\n\022removed_target_ids\030\006 \003(\005\"m\n\016Docume"
          + "ntDelete\022\020\n\010document\030\001 \001(\t\022\032\n\022removed_ta"
          + "rget_ids\030\006 \003(\005\022-\n\tread_time\030\004 \001(\0132\032.goog"
          + "le.protobuf.Timestamp\"m\n\016DocumentRemove\022"
          + "\020\n\010document\030\001 \001(\t\022\032\n\022removed_target_ids\030"
          + "\002 \003(\005\022-\n\tread_time\030\004 \001(\0132\032.google.protob"
          + "uf.Timestamp\"3\n\017ExistenceFilter\022\021\n\ttarge"
          + "t_id\030\001 \001(\005\022\r\n\005count\030\002 \001(\005B\270\001\n\034com.google"
          + ".firestore.v1beta1B\nWriteProtoP\001ZAgoogle"
          + ".golang.org/genproto/googleapis/firestor"
          + "e/v1beta1;firestore\242\002\004GCFS\252\002\036Google.Clou"
          + "d.Firestore.V1Beta1\312\002\036Google\\Cloud\\Fires"
          + "tore\\V1beta1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.firestore.v1beta1.CommonProto.getDescriptor(),
          com.google.firestore.v1beta1.DocumentProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        },
        assigner);
    internal_static_google_firestore_v1beta1_Write_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_firestore_v1beta1_Write_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1beta1_Write_descriptor,
            new java.lang.String[] {
              "Update", "Delete", "Transform", "UpdateMask", "CurrentDocument", "Operation",
            });
    internal_static_google_firestore_v1beta1_DocumentTransform_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_firestore_v1beta1_DocumentTransform_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1beta1_DocumentTransform_descriptor,
            new java.lang.String[] {
              "Document", "FieldTransforms",
            });
    internal_static_google_firestore_v1beta1_DocumentTransform_FieldTransform_descriptor =
        internal_static_google_firestore_v1beta1_DocumentTransform_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_firestore_v1beta1_DocumentTransform_FieldTransform_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1beta1_DocumentTransform_FieldTransform_descriptor,
            new java.lang.String[] {
              "FieldPath",
              "SetToServerValue",
              "Increment",
              "Maximum",
              "Minimum",
              "AppendMissingElements",
              "RemoveAllFromArray",
              "TransformType",
            });
    internal_static_google_firestore_v1beta1_WriteResult_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_firestore_v1beta1_WriteResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1beta1_WriteResult_descriptor,
            new java.lang.String[] {
              "UpdateTime", "TransformResults",
            });
    internal_static_google_firestore_v1beta1_DocumentChange_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_firestore_v1beta1_DocumentChange_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1beta1_DocumentChange_descriptor,
            new java.lang.String[] {
              "Document", "TargetIds", "RemovedTargetIds",
            });
    internal_static_google_firestore_v1beta1_DocumentDelete_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_firestore_v1beta1_DocumentDelete_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1beta1_DocumentDelete_descriptor,
            new java.lang.String[] {
              "Document", "RemovedTargetIds", "ReadTime",
            });
    internal_static_google_firestore_v1beta1_DocumentRemove_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_firestore_v1beta1_DocumentRemove_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1beta1_DocumentRemove_descriptor,
            new java.lang.String[] {
              "Document", "RemovedTargetIds", "ReadTime",
            });
    internal_static_google_firestore_v1beta1_ExistenceFilter_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_firestore_v1beta1_ExistenceFilter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_firestore_v1beta1_ExistenceFilter_descriptor,
            new java.lang.String[] {
              "TargetId", "Count",
            });
    com.google.firestore.v1beta1.CommonProto.getDescriptor();
    com.google.firestore.v1beta1.DocumentProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
