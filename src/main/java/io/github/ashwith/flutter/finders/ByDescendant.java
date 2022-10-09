package io.github.ashwith.flutter.finders;

import io.github.ashwith.flutter.FlutterElement;

/**
 * To identify the element using Descendant
 *
 * @author ashwith
 * @version 0.0.1
 */
public interface ByDescendant {

    FlutterElement byDescendant(FlutterElement of, FlutterElement matching, boolean matchRoot, boolean firstMatchOnly);

}