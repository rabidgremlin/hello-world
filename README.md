# hello-world
Simple project to test Maven publication

Set up to allow devs to build and install locally without any PGP or Sonatype credentials or the ability to upload required artifacts if dev has credentials.

To build:
~~~
gradlew build
~~~ 

To install into local Maven repo:
~~~
gradlew install
~~~

To upload to Maven central:
~~~
gradlew uploadArchives
~~~
If `version` (defined in gradle.properties) ends on `-SNAPSHOT` then artifacts will be uploaded to snapshot repository. Otherwise it will be uploaded and staged into main repo. See http://central.sonatype.org/pages/releasing-the-deployment.html for more info.

To upload you will need a sonatype/OSSRH account with access to the right namespace and PGP keys. See http://central.sonatype.org/pages/producers.html

You will also need a `gradle.properties` file in your gradle home folder holding your PGP key details and sonatype/OSSRH credentials. See http://central.sonatype.org/pages/gradle.html#credentials 


