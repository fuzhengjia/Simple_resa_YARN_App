/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.test.thrift;


public enum RequestType implements org.apache.thrift.TEnum {
  Say_hello(0),
  Query_time(1);

  private final int value;

  private RequestType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static RequestType findByValue(int value) { 
    switch (value) {
      case 0:
        return Say_hello;
      case 1:
        return Query_time;
      default:
        return null;
    }
  }
}