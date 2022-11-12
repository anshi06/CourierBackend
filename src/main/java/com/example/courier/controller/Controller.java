package com.example.courier.controller;

import com.example.courier.model.ClientInfo;
import com.example.courier.model.LoginEntity;
import com.example.courier.service.ClientService;
import com.example.courier.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class Controller {

    @Autowired
    private LoginService loginService;

    @Autowired
    private ClientService clientService;

    @GetMapping("/getdata")
    public List<ClientInfo> getClientData(){
        return clientService.getData();
    }

    @PostMapping("/login")
    public LoginEntity login(@RequestBody LoginEntity loginDetails){
        return loginService.login(loginDetails);
    }

    @PostMapping("/register")
    public ResponseEntity<LoginEntity> register(@RequestBody LoginEntity signUpDetails){
        return ResponseEntity.ok(loginService.signUp(signUpDetails));
    }

    @PostMapping("/addclient")
    public ClientInfo addClientData(@RequestBody ClientInfo clientInfo){
         return clientService.saveClientInfo(clientInfo);
    }

    @DeleteMapping("/deleteclient/{clientId}")
    public void deleteData(@PathVariable int clientId){
         clientService.deleteClientInfo(clientId);
    }

    @PutMapping("/updateclient")
    public ClientInfo updateClient(@RequestBody ClientInfo clientInfo){
        return clientService.updateClientInfo(clientInfo);
    }

}
