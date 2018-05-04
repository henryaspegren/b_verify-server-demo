// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/api.proto

package io.grpc.bverify;

public interface ReceiptOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.Receipt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string warehouse_id = 1;</code>
   */
  java.lang.String getWarehouseId();
  /**
   * <code>string warehouse_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getWarehouseIdBytes();

  /**
   * <code>string depositor_id = 2;</code>
   */
  java.lang.String getDepositorId();
  /**
   * <code>string depositor_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getDepositorIdBytes();

  /**
   * <code>string accountant = 3;</code>
   */
  java.lang.String getAccountant();
  /**
   * <code>string accountant = 3;</code>
   */
  com.google.protobuf.ByteString
      getAccountantBytes();

  /**
   * <code>string category = 4;</code>
   */
  java.lang.String getCategory();
  /**
   * <code>string category = 4;</code>
   */
  com.google.protobuf.ByteString
      getCategoryBytes();

  /**
   * <code>string date = 5;</code>
   */
  java.lang.String getDate();
  /**
   * <code>string date = 5;</code>
   */
  com.google.protobuf.ByteString
      getDateBytes();

  /**
   * <code>string insurance = 6;</code>
   */
  java.lang.String getInsurance();
  /**
   * <code>string insurance = 6;</code>
   */
  com.google.protobuf.ByteString
      getInsuranceBytes();

  /**
   * <code>double weight = 7;</code>
   */
  double getWeight();

  /**
   * <code>double volume = 8;</code>
   */
  double getVolume();

  /**
   * <code>double humidity = 9;</code>
   */
  double getHumidity();

  /**
   * <code>double price = 10;</code>
   */
  double getPrice();

  /**
   * <code>string details = 11;</code>
   */
  java.lang.String getDetails();
  /**
   * <code>string details = 11;</code>
   */
  com.google.protobuf.ByteString
      getDetailsBytes();
}
