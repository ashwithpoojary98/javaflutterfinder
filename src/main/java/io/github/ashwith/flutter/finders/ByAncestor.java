package io.github.ashwith.flutter.finders;

import io.github.ashwith.flutter.FlutterElement;

/**
 * To identify the element using Ancestor
 *
 * @author ashwith
 * @version 0.0.1
 */
public interface ByAncestor {

    FlutterElement byAncestor(FlutterElement of, FlutterElement matching, boolean matchRoot, boolean firstMatchOnly);
}
