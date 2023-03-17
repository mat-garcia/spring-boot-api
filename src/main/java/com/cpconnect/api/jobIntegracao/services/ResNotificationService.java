package com.cpconnect.api.jobIntegracao.services;

import com.cpconnect.api.jobIntegracao.models.ResNotification;

import java.util.ArrayList;
import java.util.List;

public class ResNotificationService {
    private final List<ResNotification> reservas = new ArrayList<>();

    public int createReserva(ResNotification reserva) {
        reservas.add(reserva);

        int indice = reservas.indexOf(reserva);

        return indice;
    }

    public List<ResNotification> getReservaList() {
        return reservas;
    }
}
