var exec = require('cordova/exec'),
    argscheck = require('cordova/argscheck'),
    utils = require('cordova/utils');

PLUGIN_NAME = 'FaceDetector';

module.exports = (function() {
    var running = false;

    var _facedetector = {};

    _facedetector.isRunning = function() { return running; };

    _facedetector.start = function(successCallback,errorCallback) {
        var onSuccess = function(faces) {
            running = true;
            if (successCallback) {
                  successCallback(faces);
            }
        };
                  
        exec(onSuccess,
             errorCallback,
             PLUGIN_NAME,
             "start",
             [window.innerWidth, window.innerHeight]);
    }
               
     _facedetector.stop = function(successCallback,errorCallback) {

        var onSuccess = function() {
            running = false;
            if (successCallback) {
                  successCallback();
            }
        };

        exec(onSuccess,
             errorCallback,
             PLUGIN_NAME,
             "stop",
             []);

    }
    
    function update() {
        setTimeout(
            function() {
                exec(null,
                    null,
                    PLUGIN_NAME,
                    "update",
                    [window.innerWidth, window.innerHeight]);
            },1500);
    }
    
    window.addEventListener('orientationchange',update);

    
    return _facedetector;
    
}());
