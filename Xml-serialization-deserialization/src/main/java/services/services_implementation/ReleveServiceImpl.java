package services.services_implementation;

import model.Releve;
import repository.ReleveRepository;
import repository.dao_implementation.ReleveRepositoryImpl;
import services.ReleveService;

public class ReleveServiceImpl implements ReleveService {
    private ReleveRepository releveRepository = new ReleveRepositoryImpl();//à remplacer par l'injection de dépendences
    /**
     * @return
     */
    @Override
    public Releve getReleve() {
        return releveRepository.getReleve();
    }
}
