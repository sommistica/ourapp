package nl.codeforall.hackaton.dao;

import nl.codeforall.hackaton.model.Challenge;

public class ChallengeDao extends GenericDao<Challenge> {

    public ChallengeDao(){
        super(Challenge.class);
    }
}
