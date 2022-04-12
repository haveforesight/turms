/* eslint-disable */
import Long from "long";
import * as _m0 from "protobufjs/minimal";

export const protobufPackage = "im.turms.proto";

export enum ContentType {
  PROFILE = 0,
  GROUP_PROFILE = 1,
  /** ATTACHMENT - STORAGE = 2; */
  ATTACHMENT = 2,
  UNRECOGNIZED = -1,
}

if (_m0.util.Long !== Long) {
  _m0.util.Long = Long as any;
  _m0.configure();
}
