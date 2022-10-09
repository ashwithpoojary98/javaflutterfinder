package com.ashwith.flutter.finders;

import com.ashwith.flutter.FlutterElement;

import java.util.regex.Pattern;

/**
 * To identify the element using SemanticsLabel
 * @author ashwith
 * @version 0.0.1
 */
public interface BySemanticsLabel {

    FlutterElement bySemanticsLabel(String label);

    FlutterElement bySemanticsLabel(Pattern label);
}
