package com.cpconnect.api.jobIntegracao.controllers;

import com.cpconnect.api.jobIntegracao.models.ResNotification;
import com.cpconnect.api.jobIntegracao.services.ResNotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
@SuppressWarnings("unused")
public class ResNotificationController {
    private final ResNotificationService resNotificationService;

    public ResNotificationController(ResNotificationService resNotificationService) {
        this.resNotificationService = resNotificationService;
    }

    @GetMapping(value = "/get_res")
    public List<ResNotification> getReservas(){
        return resNotificationService.getReservaList();
    }
    @PostMapping(value = "/insert_res")
    public ResponseEntity<CustomResponse> createRes(@RequestBody ResNotification request) {
        ResNotification reserva = new ResNotification(request.getMessageId(),request.getData());
        int indice = resNotificationService.createReserva(reserva);
        CustomResponse response = new CustomResponse(indice);
        return ResponseEntity.ok(response);
    }
    class CustomResponse {
        private final int returnId;


        public CustomResponse(int returnId) {
            this.returnId = returnId;

        }

        public int getReturnId() {
            return returnId;
        }
    }

}
