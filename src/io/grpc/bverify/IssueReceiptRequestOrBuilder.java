// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/api.proto

package io.grpc.bverify;

public interface IssueReceiptRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.IssueReceiptRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.api.Receipt receipt = 1;</code>
   */
  boolean hasReceipt();
  /**
   * <code>.api.Receipt receipt = 1;</code>
   */
  io.grpc.bverify.Receipt getReceipt();
  /**
   * <code>.api.Receipt receipt = 1;</code>
   */
  io.grpc.bverify.ReceiptOrBuilder getReceiptOrBuilder();

  /**
   * <code>bytes signature_warehouse = 2;</code>
   */
  com.google.protobuf.ByteString getSignatureWarehouse();

  /**
   * <code>bytes signature_depositor = 3;</code>
   */
  com.google.protobuf.ByteString getSignatureDepositor();
}
