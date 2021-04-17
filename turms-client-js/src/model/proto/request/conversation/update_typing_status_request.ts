/* eslint-disable */
import Long from "long";
import _m0 from "protobufjs/minimal";

export const protobufPackage = "im.turms.proto";

export interface UpdateTypingStatusRequest {
  isGroupMessage: boolean;
  toId: string;
}

const baseUpdateTypingStatusRequest: object = {
  isGroupMessage: false,
  toId: "0",
};

export const UpdateTypingStatusRequest = {
  encode(
    message: UpdateTypingStatusRequest,
    writer: _m0.Writer = _m0.Writer.create()
  ): _m0.Writer {
    if (message.isGroupMessage === true) {
      writer.uint32(8).bool(message.isGroupMessage);
    }
    if (message.toId !== "0") {
      writer.uint32(16).int64(message.toId);
    }
    return writer;
  },

  decode(
    input: _m0.Reader | Uint8Array,
    length?: number
  ): UpdateTypingStatusRequest {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = {
      ...baseUpdateTypingStatusRequest,
    } as UpdateTypingStatusRequest;
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.isGroupMessage = reader.bool();
          break;
        case 2:
          message.toId = longToString(reader.int64() as Long);
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
