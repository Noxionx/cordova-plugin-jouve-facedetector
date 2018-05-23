var PLUGIN_NAME = 'FaceDetector';

var running = false;

var FaceDetector = function() {};

FaceDetector.start = function(success, fail) {
    exec(success, fail, PLUGIN_NAME, "start", []);
};

FaceDetector.stop = function(success, fail) {
    exec(success, fail, PLUGIN_NAME, "stop", []);
};

module.exports = FaceDetector;