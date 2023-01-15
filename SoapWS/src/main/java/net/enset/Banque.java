package net.enset;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.List;

@WebService(serviceName = "banqueWS")
public class Banque {
    List<Compte> comptes = new ArrayList<>();

    @WebMethod(operationName = "comptes")
    public List<Compte> getComptes(){
        return comptes;
    }

    @WebMethod
    public String createCompte(Compte c){
        this.comptes.add(c);
        return "The account has been created succesfully";
    }
}
