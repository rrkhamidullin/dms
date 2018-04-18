# dms
Device Management Service

How it works now:
    Gradle task:
    $ ./gradlew build && ./gradlew :dms-runner:bootRun
    Runnable jar:
    $ ./gradlew build && java -jar ./dms-runner/build/libs/dms-runner-0.1.0.jar

TODO
- build configuration
    - optimize build configuration
- transactions management
    - analyse
- validation
    - do it
- exception handling/ error response
    - analyse
- authorization
    - do it