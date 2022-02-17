package com.progrmming.genius.sdet;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {



    @GetMapping
    public String getUsers(@RequestParam(value = "page") int pageno,@RequestParam(value = "limit") int limitno) {
        return "get request method triggered "+pageno+" and limit is:"+limitno;
    }
    @GetMapping(path = "/{userID}")
    public String getUserByPath(@PathVariable String userID){
        return "get request for the user "+userID+" has been called, example for path param";
    }

    @PutMapping
    public String editUser(){
        return "http post request was sent";
    }

    @PostMapping
    public String createUser(){
        return "http put request was sent";
    }
}
