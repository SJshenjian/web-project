// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package online.shenjian.tio.im.common.packets;

public interface LoginRespBodyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:LoginRespBody)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *用于免密码的token，登录成功才有
   * </pre>
   *
   * <code>string token = 1;</code>
   */
  java.lang.String getToken();
  /**
   * <pre>
   *用于免密码的token，登录成功才有
   * </pre>
   *
   * <code>string token = 1;</code>
   */
  com.google.protobuf.ByteString
      getTokenBytes();

  /**
   * <pre>
   *登录成功才有
   * </pre>
   *
   * <code>.User user = 2;</code>
   */
  boolean hasUser();
  /**
   * <pre>
   *登录成功才有
   * </pre>
   *
   * <code>.User user = 2;</code>
   */
  User getUser();
  /**
   * <pre>
   *登录成功才有
   * </pre>
   *
   * <code>.User user = 2;</code>
   */
  UserOrBuilder getUserOrBuilder();
}