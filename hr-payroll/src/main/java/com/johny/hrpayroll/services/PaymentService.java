package com.johny.hrpayroll.services;

import com.johny.hrpayroll.entities.Payment;
import com.johny.hrpayroll.entities.Worker;
import com.johny.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

//    @Value("${hr-worker.host}")
//    private String workerHost;

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(long workerId, int days){
//TODO: Chamada do REST TEMPLATE
//        Map<String, String>  uriVariables = new HashMap<>();
//        uriVariables.put("id", ""+workerId);
//        Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);

        Worker worker = workerFeignClient.findById(workerId).getBody();

        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }


}
