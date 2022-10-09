package com.ashwith.flutter.finders;

import com.ashwith.flutter.FlutterElement;

/**
 * To identify the element using Descendant
 *
 * @author ashwith
 * @version 0.0.1
 */
public interface ByDescendant {

    FlutterElement byDescendant(FlutterElement of, FlutterElement matching, boolean matchRoot, boolean firstMatchOnly);

}