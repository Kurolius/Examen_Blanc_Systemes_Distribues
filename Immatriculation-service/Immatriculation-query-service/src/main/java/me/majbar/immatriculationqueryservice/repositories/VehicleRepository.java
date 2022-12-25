package me.majbar.immatriculationqueryservice.repositories;

import me.majbar.immatriculationqueryservice.entities.Vehicle;
import me.majbar.immatriculationqueryservice.entities.VehicleOwner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, String> {
    Vehicle findVehicleByOwner(VehicleOwner vehicleOwner);
}
