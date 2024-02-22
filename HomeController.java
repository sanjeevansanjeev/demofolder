package com.sanjeev.crudoperation.Dbpgm;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/homepage")
public class HomeController {
    @GetMapping("/getinfo")
    public String getuserinfo(){
        return "Hii welcome to springboot application";
    }
    @GetMapping("/GetUserName/{name}")
    public String getUserName(@PathVariable(value="name") String n)
    {
        return "hai"+ n;
    }
    @GetMapping("/GetUserName/{name}/{address}")
    public String getUserName(@PathVariable(value="name")String n,@PathVariable(value="address")String a){

        return "hii"+ n +"from" + a + "welcome to spring boot application";
    }


}
