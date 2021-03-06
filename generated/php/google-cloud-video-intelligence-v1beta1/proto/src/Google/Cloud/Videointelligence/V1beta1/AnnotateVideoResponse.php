<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/videointelligence/v1beta1/video_intelligence.proto

namespace Google\Cloud\Videointelligence\V1beta1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Video annotation response. Included in the `response`
 * field of the `Operation` returned by the `GetOperation`
 * call of the `google::longrunning::Operations` service.
 *
 * Generated from protobuf message <code>google.cloud.videointelligence.v1beta1.AnnotateVideoResponse</code>
 */
class AnnotateVideoResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * Annotation results for all videos specified in `AnnotateVideoRequest`.
     *
     * Generated from protobuf field <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationResults annotation_results = 1;</code>
     */
    private $annotation_results;

    public function __construct() {
        \GPBMetadata\Google\Cloud\Videointelligence\V1Beta1\VideoIntelligence::initOnce();
        parent::__construct();
    }

    /**
     * Annotation results for all videos specified in `AnnotateVideoRequest`.
     *
     * Generated from protobuf field <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationResults annotation_results = 1;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getAnnotationResults()
    {
        return $this->annotation_results;
    }

    /**
     * Annotation results for all videos specified in `AnnotateVideoRequest`.
     *
     * Generated from protobuf field <code>repeated .google.cloud.videointelligence.v1beta1.VideoAnnotationResults annotation_results = 1;</code>
     * @param \Google\Cloud\Videointelligence\V1beta1\VideoAnnotationResults[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setAnnotationResults($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Google\Cloud\Videointelligence\V1beta1\VideoAnnotationResults::class);
        $this->annotation_results = $arr;

        return $this;
    }

}

