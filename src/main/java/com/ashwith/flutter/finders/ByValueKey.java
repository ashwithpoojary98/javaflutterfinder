package com.ashwith.flutter.finders;

import com.ashwith.flutter.FlutterElement;

/**
 * To identify the element using Value key
 *
 * @author ashwith
 * @version 0.0.1
 */
public interface ByValueKey {


    FlutterElement byValueKey(String key);

    FlutterElement byValueKey(int key);
}