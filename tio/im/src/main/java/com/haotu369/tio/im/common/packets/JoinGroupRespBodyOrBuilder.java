// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package com.haotu369.tio.im.common.packets;

public interface JoinGroupRespBodyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:JoinGroupRespBody)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.JoinGroupResult result = 1;</code>
   */
  int getResultValue();
  /**
   * <code>.JoinGroupResult result = 1;</code>
   */
  com.haotu369.tio.im.common.packets.JoinGroupResult getResult();

  /**
   * <code>string group = 2;</code>
   */
  java.lang.String getGroup();
  /**
   * <code>string group = 2;</code>
   */
  com.google.protobuf.ByteString
      getGroupBytes();
}