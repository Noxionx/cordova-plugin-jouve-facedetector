#import <Cordova/CDVPlugin.h>


@interface CDVJouveFaceDetector : CDVPlugin

- (void) start:(CDVInvokedUrlCommand*)command;
- (void) stop:(CDVInvokedUrlCommand*)command;
- (void) update:(CDVInvokedUrlCommand*)command;

@end



