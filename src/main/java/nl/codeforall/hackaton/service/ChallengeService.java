package nl.codeforall.hackaton.service;

import nl.codeforall.hackaton.model.Challenge;
import org.springframework.stereotype.Service;

@Service
public class ChallengeService extends GenericService<Challenge> {

    public void incrementViewers(Integer id){

        Challenge challenge = dao.findById(id);
        challenge.incrementViewers();
        dao.saveOrUpdate(challenge);
    }

    public void decrementViewers(Integer id){

        Challenge challenge = dao.findById(id);
        challenge.decrementViewers();
        dao.saveOrUpdate(challenge);
    }
}
