/* eslint-disable */
import Long from "long";
import * as _m0 from "protobufjs/minimal";
import { UserRelationshipGroup } from "../../model/user/user_relationship_group";

export const protobufPackage = "im.turms.proto";

export interface UserRelationshipGroupsWithVersion {
  userRelationshipGroups: UserRelationshipGroup[];
  lastUpdatedDate?: string | undefined;
}

function createBaseUserRelationshipGroupsWithVersion(): UserRelationshipGroupsWithVersion {
  return { userRelationshipGroups: [], lastUpdatedDate: undefined };
}

export const UserRelationshipGroupsWithVersion = {
  encode(
    message: UserRelationshipGroupsWithVersion,
    writer: _m0.Writer = _m0.Writer.create()
  ): _m0.Writer {
    for (const v of message.userRelationshipGroups) {
      UserRelationshipGroup.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    if (message.lastUpdatedDate !== undefined) {
      writer.uint32(16).int64(message.lastUpdatedDate);
    }
    return writer;
  },

  decode(
    input: _m0.Reader | Uint8Array,
    length?: number
  ): UserRelationshipGroupsWithVersion {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseUserRelationshipGroupsWithVersion();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userRelationshipGroups.push(
            UserRelationshipGroup.decode(reader, reader.uint32())
          );
          break;
        case 2:
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
