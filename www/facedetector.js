var PLUGIN_NAME = 'FaceDetector';

var running = false;

var FaceDetector = function() {};

FaceDetector.prototype.start = function(success, fail) {
    exec(success, fail, PLUGIN_NAME, "start", []);
};

FaceDetector.prototype.stop = function(success, fail) {
    exec(success, fail, PLUGIN_NAME, "stop", []);
};

if (!window.plugins) {
    window.plugins = {};
}
if (!window.plugins.faceDetector) {
    window.plugins.facedetector = new FaceDetector();
}

if (module.exports) {
    module.exports = FaceDetector;
}