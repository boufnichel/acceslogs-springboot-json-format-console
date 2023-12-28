
### Demo project to display access logs
The goal of this project is to demonstrate how to display tomcat access log in the console
using json format under a spring boot application

```json
{"@timestamp":"2023-12-28T23:00:26.035+01:00","@version":"1","message":"Initializing Spring embedded WebApplicationContext","logger_name":"org.apache.catalina.core.ContainerBase.[Tomcat].[localhost].[/]","thread_name":"main","level":"INFO","level_value":20000}
{"@timestamp":"2023-12-28T23:00:26.036+01:00","@version":"1","message":"Root WebApplicationContext: initialization completed in 347 ms","logger_name":"org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext","thread_name":"main","level":"INFO","level_value":20000}
{"@timestamp":"2023-12-28T23:00:26.167+01:00","@version":"1","message":"Starting ProtocolHandler [\"http-nio-8080\"]","logger_name":"org.apache.coyote.http11.Http11NioProtocol","thread_name":"main","level":"INFO","level_value":20000}
{"@timestamp":"2023-12-28T23:00:26.173+01:00","@version":"1","message":"Tomcat started on port 8080 (http) with context path ''","logger_name":"org.springframework.boot.web.embedded.tomcat.TomcatWebServer","thread_name":"main","level":"INFO","level_value":20000}
{"@timestamp":"2023-12-28T23:00:26.177+01:00","@version":"1","message":"Started AccesslogConsoleApplication in 0.744 seconds (process running for 1.074)","logger_name":"org.boufnichel.accesslogconsole.AccesslogConsoleApplication","thread_name":"main","level":"INFO","level_value":20000}
{"@timestamp":"2023-12-28T23:04:37.772+01:00","@version":"1","message":"Initializing Spring DispatcherServlet 'dispatcherServlet'","logger_name":"org.apache.catalina.core.ContainerBase.[Tomcat].[localhost].[/]","thread_name":"http-nio-8080-exec-1","level":"INFO","level_value":20000}
{"@timestamp":"2023-12-28T23:04:37.772+01:00","@version":"1","message":"Initializing Servlet 'dispatcherServlet'","logger_name":"org.springframework.web.servlet.DispatcherServlet","thread_name":"http-nio-8080-exec-1","level":"INFO","level_value":20000}
{"@timestamp":"2023-12-28T23:04:37.773+01:00","@version":"1","message":"Completed initialization in 1 ms","logger_name":"org.springframework.web.servlet.DispatcherServlet","thread_name":"http-nio-8080-exec-1","level":"INFO","level_value":20000}
{"@timestamp":"2023-12-28T23:04:37.783+01:00","@version":"1","message":"test get received","logger_name":"org.boufnichel.accesslogconsole.ControllerTest","thread_name":"http-nio-8080-exec-1","level":"INFO","level_value":20000}
{"@timestamp":"2023-12-28T23:04:37.790+01:00","@version":"1","@type":"access","client-host":"127.0.0.1","remote-user":"-","request-message":"GET","request-url":"GET /test-get HTTP/1.1","request-uri":"/test-get","status-code":200,"bytes-sent":null,"elapsed-time":28,"message":"GET /test-get HTTP/1.1 200"}
```
both access log and application logs are displayed in json format
