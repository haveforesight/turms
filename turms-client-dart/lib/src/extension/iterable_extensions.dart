import 'dart:core';

import '../../turms_client.dart';

extension IterableExtensions<T> on Iterable<T> {
  bool get areAllNull {
    for (final item in this) {
      if (item != null) {
        return false;
      }
    }
    return true;
  }

  Map<String, String> toMap() {
    if (length % 2 != 0) {
      throw ResponseException(
          code: ResponseStatusCode.illegalArgument,
          reason: 'The number of elements must be even');
    }
    final map = <String, String>{};
    for (var i = 0; i < length; i += 2) {
      map[elementAt(i) as String] = elementAt(i + 1) as String;
    }
    return map;
  }
}
