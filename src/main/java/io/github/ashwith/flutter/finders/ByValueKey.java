package io.github.ashwith.flutter.finders;

import io.github.ashwith.flutter.FlutterElement;

/**
 * To identify the element using Value key
 *
 * @author ashwith
 * @version 1.0.0
 */
public interface ByValueKey {


    FlutterElement byValueKey(String key);

    FlutterElement byValueKey(int key);
}