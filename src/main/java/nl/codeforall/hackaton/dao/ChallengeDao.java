package nl.codeforall.hackaton.dao;

import nl.codeforall.hackaton.model.Challenge;
import org.springframework.stereotype.Repository;

@Repository
public class ChallengeDao extends GenericDao<Challenge> {

    public ChallengeDao(){
        super(Challenge.class);
    }
}
