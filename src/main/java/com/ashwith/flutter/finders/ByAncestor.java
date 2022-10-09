package com.ashwith.flutter.finders;

import com.ashwith.flutter.FlutterElement;

/**
 * To identify the element using Ancestor
 *
 * @author ashwith
 * @version 0.0.1
 */
public interface ByAncestor {

    FlutterElement byAncestor(FlutterElement of, FlutterElement matching, boolean matchRoot, boolean firstMatchOnly);
}
