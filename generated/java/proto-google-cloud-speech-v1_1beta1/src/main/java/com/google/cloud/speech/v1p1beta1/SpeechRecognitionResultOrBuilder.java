// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1_1beta1/cloud_speech.proto

package com.google.cloud.speech.v1p1beta1;

public interface SpeechRecognitionResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1p1beta1.SpeechRecognitionResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * *Output-only* May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  java.util.List<com.google.cloud.speech.v1p1beta1.SpeechRecognitionAlternative> 
      getAlternativesList();
  /**
   * <pre>
   * *Output-only* May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  com.google.cloud.speech.v1p1beta1.SpeechRecognitionAlternative getAlternatives(int index);
  /**
   * <pre>
   * *Output-only* May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  int getAlternativesCount();
  /**
   * <pre>
   * *Output-only* May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  java.util.List<? extends com.google.cloud.speech.v1p1beta1.SpeechRecognitionAlternativeOrBuilder> 
      getAlternativesOrBuilderList();
  /**
   * <pre>
   * *Output-only* May contain one or more recognition hypotheses (up to the
   * maximum specified in `max_alternatives`).
   * These alternatives are ordered in terms of accuracy, with the top (first)
   * alternative being the most probable, as ranked by the recognizer.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1p1beta1.SpeechRecognitionAlternative alternatives = 1;</code>
   */
  com.google.cloud.speech.v1p1beta1.SpeechRecognitionAlternativeOrBuilder getAlternativesOrBuilder(
      int index);
}
