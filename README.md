jax-rs-proto
============

Import this project in Eclipse:

1. Import ... Projects from Git
2. As a general project
3. Convert the project to faceted form (by right-clicking on it). Check the Dynamic Web Module 3.0
4. Convert to maven project (by right-clicking on it).
5. Debug as maven install (by right-clicking on it).
6. Add it to a configured tomcat server (by right-clicking on server and hitting "Add/Remove"). This will copy the target folder to the working folder of tomcat.
7. Make sure the tomcat server is running.
8. Hit http://localhost:8080/jax-rs-proto/rest/hello/html from a browser.

If nothing comes out, right click on the server and do "publish" so that the target folder from this project gets copied in (usually) 
/Users/<user-name>/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/jax-rs-proto (or similar)

