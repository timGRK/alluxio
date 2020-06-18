// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/table/table_master.proto

package alluxio.grpc.table;

public interface GetPartitionColumnStatisticsPRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.table.GetPartitionColumnStatisticsPRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string db_name = 1;</code>
   * @return Whether the dbName field is set.
   */
  boolean hasDbName();
  /**
   * <code>optional string db_name = 1;</code>
   * @return The dbName.
   */
  java.lang.String getDbName();
  /**
   * <code>optional string db_name = 1;</code>
   * @return The bytes for dbName.
   */
  com.google.protobuf.ByteString
      getDbNameBytes();

  /**
   * <code>optional string table_name = 2;</code>
   * @return Whether the tableName field is set.
   */
  boolean hasTableName();
  /**
   * <code>optional string table_name = 2;</code>
   * @return The tableName.
   */
  java.lang.String getTableName();
  /**
   * <code>optional string table_name = 2;</code>
   * @return The bytes for tableName.
   */
  com.google.protobuf.ByteString
      getTableNameBytes();

  /**
   * <code>repeated string col_names = 3;</code>
   * @return A list containing the colNames.
   */
  java.util.List<java.lang.String>
      getColNamesList();
  /**
   * <code>repeated string col_names = 3;</code>
   * @return The count of colNames.
   */
  int getColNamesCount();
  /**
   * <code>repeated string col_names = 3;</code>
   * @param index The index of the element to return.
   * @return The colNames at the given index.
   */
  java.lang.String getColNames(int index);
  /**
   * <code>repeated string col_names = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the colNames at the given index.
   */
  com.google.protobuf.ByteString
      getColNamesBytes(int index);

  /**
   * <code>repeated string part_names = 4;</code>
   * @return A list containing the partNames.
   */
  java.util.List<java.lang.String>
      getPartNamesList();
  /**
   * <code>repeated string part_names = 4;</code>
   * @return The count of partNames.
   */
  int getPartNamesCount();
  /**
   * <code>repeated string part_names = 4;</code>
   * @param index The index of the element to return.
   * @return The partNames at the given index.
   */
  java.lang.String getPartNames(int index);
  /**
   * <code>repeated string part_names = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the partNames at the given index.
   */
  com.google.protobuf.ByteString
      getPartNamesBytes(int index);
}