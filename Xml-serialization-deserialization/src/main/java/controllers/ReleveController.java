package controllers;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import model.Releve;
import services.ReleveService;
import services.services_implementation.ReleveServiceImpl;

import java.util.List;

@WebService(serviceName = "releve-ws")
public class ReleveController {
    ReleveService releveService = new ReleveServiceImpl();//à remplacer par l'injection du dépendences

    @WebMethod(operationName = "releves")
    public Releve getReleve(){
        return this.releveService.getReleve();
    }
}
