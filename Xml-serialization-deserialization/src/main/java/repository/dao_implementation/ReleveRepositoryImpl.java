package repository.dao_implementation;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import model.Releve;

import java.io.File;

public class ReleveRepositoryImpl implements repository.ReleveRepository {
    private JAXBContext jaxbContext;

    public ReleveRepositoryImpl() {
        //à rempalcer par l'injection de dépendences
        try {
            jaxbContext = JAXBContext.newInstance(Releve.class);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @return
     */
    @Override
    public Releve getReleve() {
        Releve releve;
        try {
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            releve = (Releve) unmarshaller.unmarshal(new File("releve.xml"));
            return releve;
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
