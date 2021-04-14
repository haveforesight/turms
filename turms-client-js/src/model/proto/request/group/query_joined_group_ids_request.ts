/* eslint-disable */
import Long from "long";
import _m0 from "protobufjs/minimal";

export const protobufPackage = "im.turms.proto";

export interface QueryJoinedGroupIdsRequest {
  lastUpdatedDate?: string | undefined;
}

const baseQueryJoinedGroupIdsRequest: object = {};

export const QueryJoinedGroupIdsRequest = {
  encode(
    message: QueryJoinedGroupIdsRequest,
    writer: _m0.Writer = _m0.Writer.create()
  ): _m0.Writer {
    if (message.lastUpdatedDate !== undefined) {
      writer.uint32(8).int64(message.lastUpdatedDate);
    }
    return writer;
  },

  decode(
    input: _m0.Reader | Uint8Array,
    length?: number
  ): QueryJoinedGroupIdsRequest {
    const reader = input instanceof Uint8Array ? new _m0.Reader(input) : input;
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseQueryJoinedGroupIdsRequest,
    } as QueryJoinedGroupIdsRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.lastUpdatedDate = longToString(reader.int64() as Long);
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },
};

function longToString(long: Long) {
  return long.toString();
}

if (_m0.util.Long !== Long) {
  _m0.util.Long = Long as any;
  _m0.configure();
}