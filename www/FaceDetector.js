var PLUGIN_NAME = 'FaceDetector';

var FaceDetector = function() {};

FaceDetector.start = function(success, fail) {
    cordova.exec(success, fail, PLUGIN_NAME, "start", []);
};

FaceDetector.stop = function(success, fail) {
    cordova.exec(success, fail, PLUGIN_NAME, "stop", []);
};

module.exports = FaceDetector;