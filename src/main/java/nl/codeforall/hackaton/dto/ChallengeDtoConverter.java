package nl.codeforall.hackaton.dto;

import nl.codeforall.hackaton.model.Challenge;
import nl.codeforall.hackaton.service.ChallengeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ChallengeDtoConverter {

    private ChallengeService challengeService;

    @Autowired
    public void setChallengeService(ChallengeService challengeService) {
        this.challengeService = challengeService;
    }

    public Challenge convertToChallenge(ChallengeDto challengeDto){

        Challenge challenge = (challengeDto.getId() != null ? challengeService.get(challengeDto.getId()) : new Challenge());

        challenge.setTitle(challengeDto.getTitle());
        challenge.setDescription(challengeDto.getDescription());
        challenge.setDate(challengeDto.getDate());

        return challenge;
    }

    public ChallengeDto convertToDto(Challenge challenge){

        ChallengeDto challengeDto = new ChallengeDto();

        challengeDto.setId(challenge.getId());
        challengeDto.setTitle(challenge.getTitle());
        challengeDto.setDescription(challenge.getDescription());
        challengeDto.setDate(challenge.getDate());

        return challengeDto;
    }

    public List<ChallengeDto> convertToDtoList(List<Challenge> challenges){

        List<ChallengeDto> challengeDtos = new ArrayList<>();

        for(Challenge challenge : challenges){
            ChallengeDto challengeDto = convertToDto(challenge);
            challengeDtos.add(challengeDto);
        }

        return challengeDtos;
    }
}
