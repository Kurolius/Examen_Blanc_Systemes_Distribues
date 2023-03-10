package me.majbar.immatriculationqueryservice.services;


import me.majbar.immatriculationqueryservice.entities.Vehicle;
import me.majbar.immatriculationqueryservice.entities.VehicleOwner;
import me.majbar.immatriculationqueryservice.repositories.VehicleOwnerRepository;
import me.majbar.immatriculationqueryservice.repositories.VehicleRepository;
import coreapi.GetAllOwners;
import coreapi.GetAllVehiclesQuery;
import coreapi.GetVehicleByRegistrationNumber;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Slf4j
@Transactional
public class VehicleRegistrationQueryHandler {
    private VehicleRepository vehicleRepository;
    private VehicleOwnerRepository vehicleOwnerRepository;

    public VehicleRegistrationQueryHandler(VehicleRepository vehicleRepository, VehicleOwnerRepository vehicleOwnerRepository) {
        this.vehicleRepository = vehicleRepository;
        this.vehicleOwnerRepository = vehicleOwnerRepository;
    }
    @QueryHandler
    public List<Vehicle> vehicles(GetAllVehiclesQuery query){
        return vehicleRepository.findAll();
    }

    @QueryHandler
    public List<VehicleOwner> owners(GetAllOwners query){
        return vehicleOwnerRepository.findAll();
    }
    @QueryHandler
    public Vehicle vehicleByReNumber(GetVehicleByRegistrationNumber query){
        return vehicleRepository.findById(query.getRegistrationNumber())
                .orElseThrow(()->new RuntimeException("Vehicle Registration Number does not exist"));
    }

}
