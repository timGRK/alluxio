// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/journal_master.proto

package alluxio.grpc;

public interface RemoveQuorumServerPRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.journal.RemoveQuorumServerPRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .alluxio.grpc.journal.RemoveQuorumServerPOptions options = 1;</code>
   * @return Whether the options field is set.
   */
  boolean hasOptions();
  /**
   * <code>optional .alluxio.grpc.journal.RemoveQuorumServerPOptions options = 1;</code>
   * @return The options.
   */
  alluxio.grpc.RemoveQuorumServerPOptions getOptions();
  /**
   * <code>optional .alluxio.grpc.journal.RemoveQuorumServerPOptions options = 1;</code>
   */
  alluxio.grpc.RemoveQuorumServerPOptionsOrBuilder getOptionsOrBuilder();

  /**
   * <code>optional .alluxio.grpc.NetAddress serverAddress = 2;</code>
   * @return Whether the serverAddress field is set.
   */
  boolean hasServerAddress();
  /**
   * <code>optional .alluxio.grpc.NetAddress serverAddress = 2;</code>
   * @return The serverAddress.
   */
  alluxio.grpc.NetAddress getServerAddress();
  /**
   * <code>optional .alluxio.grpc.NetAddress serverAddress = 2;</code>
   */
  alluxio.grpc.NetAddressOrBuilder getServerAddressOrBuilder();
}