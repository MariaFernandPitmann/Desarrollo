package pe.pitman.edu.ejercicio_p.dto;

import java.util.Date;

public record CarCreateDto(String make,
                           String model,
                           Integer year,
                           String vin,
                           String licensePlate,
                           String ownerName,
                           String ownerContact,
                           Date purchaseDate,
                           Integer mileage,
                           String color,
                           Date serviceDueDate,
                           String insurancePolicyNumber) {
}
