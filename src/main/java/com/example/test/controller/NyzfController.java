 package com.example.test.controller;

 import com.example.test.entity.Comment;
 import com.example.test.entity.Nyzf;
 import com.example.test.service.ICommentService;
 import com.example.test.service.INyzfService;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.*;

 import java.util.List;

 @RestController
 @RequestMapping(value = "/Nyzf")
 public class NyzfController {
     @Autowired
     private INyzfService iNyzfService;

     @RequestMapping(value = "/add",method = RequestMethod.POST)
     private void add(@RequestBody Nyzf nyzf) {
         iNyzfService.add(nyzf.getId(),nyzf.getzName(),nyzf.getzUser(),nyzf.getzLocation(),nyzf.getzTime(),nyzf.getzImages());
     }

     @RequestMapping(value = "/listById",method = RequestMethod.GET)
     private List<Nyzf> listById() {
         return iNyzfService.listById();
     }

 }
