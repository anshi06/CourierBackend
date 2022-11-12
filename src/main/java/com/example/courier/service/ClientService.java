package com.example.courier.service;/*
 * @author gauravverma
 */


import com.example.courier.model.ClientInfo;
import com.example.courier.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public ClientInfo saveClientInfo(ClientInfo clientInfo){

        int distance = clientInfo.getDistance();
        int weight = clientInfo.getWeight();

        if(weight == 0){
            clientInfo.setPrice(0);
        }else if(weight <= 10 && weight > 0){
            clientInfo.setPrice(distance*1);
        }else if(weight > 10 && weight <= 20){
            clientInfo.setPrice(distance*2);
        }else{
            clientInfo.setPrice(distance*5);
        }
        return clientRepository.save(clientInfo);
    }

    public List<ClientInfo> getData(){
        return clientRepository.findAll();
    }

    public void deleteClientInfo(int clientId) {
        clientRepository.deleteById(clientId);
    }

    public ClientInfo updateClientInfo(ClientInfo clientInfo) {
        int distance = clientInfo.getDistance();
        int weight = clientInfo.getWeight();

        if(weight == 0){
            clientInfo.setPrice(0);
        }else if(weight <= 10 && weight > 0){
            clientInfo.setPrice(distance*1);
        }else if(weight > 10 && weight <= 20){
            clientInfo.setPrice(distance*2);
        }else{
            clientInfo.setPrice(distance*5);
        }
        return clientRepository.save(clientInfo);
    }
}
