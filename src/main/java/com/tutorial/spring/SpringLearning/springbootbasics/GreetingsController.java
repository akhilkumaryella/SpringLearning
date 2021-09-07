package com.tutorial.spring.SpringLearning.springbootbasics;

import com.tutorial.spring.SpringLearning.exception.InvalidRequestException;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;

@RestController
@RequestMapping("/sample")
public class GreetingsController {

    @GetMapping(value = "/welcome")
    public String greet(){

        return "Hello";
    }


    // with QueryParameters
    @GetMapping(value = "/greetingwithname")
    public String greetWithCustomName(@RequestParam(required = true) String username) throws Exception {

        throw new InvalidRequestException();
        //return "Hello " + username;
    }


    // with path variable
    @GetMapping(value = {"/greetingwithnamepath/{id}/name", "/greetingwithnamepath/name"})
    public String greetWithCustomNamePath(@PathVariable(required = false)Map<String, String> map) throws Exception {


        return "Hello " + map.get("id");
    }

    @GetMapping(value = "/getfile", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<InputStreamResource> getFile() throws FileNotFoundException {

        File f = ResourceUtils.getFile("classpath:dummy.txt");

        InputStreamResource resource = new InputStreamResource(new FileInputStream(f));

        return ResponseEntity.ok()
                .contentType(MediaType.TEXT_PLAIN)
                .contentLength(f.length())
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + f.getName())
                .body(resource);

    }
}
