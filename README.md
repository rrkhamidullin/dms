# dms
Device Management Service

How it works now:
* Gradle task:
`$ ./gradlew build && ./gradlew :dms-runner:bootRun`
* Runnable jar:
`$ ./gradlew build && java -jar ./dms-runner/build/libs/dms-runner-0.1.0.jar`

TODO:
* build configuration
    * optimize build configuration
    * make BOM
    * publishing to local .m2
* transactions management
    * analyse
* exception handling/ error response
    * analyse
* dms-device
    * imagine physical device api interface
    * make physical device lazy proxy with "device IO" (protocol + client) injected
* validation
* authorization
* persistent DB
* npe hunting
* caching
* unit tests
* end2end tests
* javadocs
* logging