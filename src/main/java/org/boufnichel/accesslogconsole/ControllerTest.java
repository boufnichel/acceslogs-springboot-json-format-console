package org.boufnichel.accesslogconsole;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ControllerTest {

  @GetMapping("/test-get")
  public void testGet(){
    log.info("test get received");
  }
}
