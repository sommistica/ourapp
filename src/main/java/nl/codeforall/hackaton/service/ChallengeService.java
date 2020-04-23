package nl.codeforall.hackaton.service;

import nl.codeforall.hackaton.model.Challenge;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ChallengeService extends GenericService<Challenge> {

    @Transactional
    public void incrementViewers(Integer id){

        Challenge challenge = dao.findById(id);
        challenge.incrementViewers();
        dao.saveOrUpdate(challenge);
    }

    @Transactional
    public void decrementViewers(Integer id){

        Challenge challenge = dao.findById(id);
        challenge.decrementViewers();
        dao.saveOrUpdate(challenge);
    }
}
