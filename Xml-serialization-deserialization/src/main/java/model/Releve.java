package model;

import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Releve {

    private Date dateReleve;
    private double solde;
    @XmlAttribute(name = "RIB")
    private String rib;

    private Operations operations = new Operations(new Date(), new Date(), new ArrayList<>());

    public void addOperation(Operation op){
        this.operations.getOperations().add(op);
        this.solde += op.getType() == TypeOperation.CREDIT ? op.getMontant() : -op.getMontant();
    }
}
