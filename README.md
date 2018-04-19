# dms
Device Management Service

How it works now:
* Gradle task:
    * `$ ./gradlew build && ./gradlew :dms-runner:bootRun`
* Runnable jar:
    * `$ ./gradlew build && java -jar ./dms-runner/build/libs/dms-runner-1.0-SNAPSHOT.jar`

* Use REST API:
    * Add device:
        * `$ curl -H "Content-Type: application/json" -X POST -d '{"uri":"xyz","token":"xyz"}' http://localhost:8080/m/add`
    * Update device:
        * `$ curl -H "Content-Type: application/json" -X POST -d '{"uri":"edited_xyz","token":"edited_xyz"}' http://localhost:8080/m/1`
    * Get device:
        * `$ curl -H "Content-Type: application/json" -X GET http://localhost:8080/m/1`
    * Remove device:
        * `$ curl -H "Content-Type: application/json" -X DELETE http://localhost:8080/m/1`
    * Run command on device (no device proxy nor command interface implemented yet therefore empty object goes as argument):
        * `$ curl -H "Content-Type: application/json" -X POST -d '{}' http://localhost:8080/c/1`
    * Poll device state:
        * `$ curl -H "Content-Type: application/json" -X GET http://localhost:8080/c/1`

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
    * make physical device lazy proxy with abstract "device IO" (protocol + client) injected
* validation
* authorization
* persistent DB
* noSql DB
* cache
* unit tests
* end2end tests
* javadocs
* logging
* ...
