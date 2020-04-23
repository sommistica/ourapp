package nl.codeforall.hackaton.controller;

import nl.codeforall.hackaton.dto.ChallengeDto;
import nl.codeforall.hackaton.dto.ChallengeDtoConverter;
import nl.codeforall.hackaton.model.Challenge;
import nl.codeforall.hackaton.service.ChallengeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/challenge")
public class ChallengeController {

    private ChallengeService challengeService;
    private ChallengeDtoConverter dtoConverter;

    @Autowired
    public void setChallengeService(ChallengeService challengeService) {
        this.challengeService = challengeService;
    }

    @Autowired
    public void setChallengeDtoConverter(ChallengeDtoConverter dtoConverter) {
        this.dtoConverter = dtoConverter;
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/", ""})
    public ResponseEntity<ChallengeDto> addChallenge(@Valid @RequestBody ChallengeDto challengeDto, BindingResult bindingResult, UriComponentsBuilder uriComponentsBuilder){

        if(bindingResult.hasErrors() || challengeDto.getId() != null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Challenge savedChallenge = challengeService.save(dtoConverter.convertToChallenge(challengeDto));

        UriComponents uriComponents = uriComponentsBuilder.path("/api/challenge/" + savedChallenge.getId()).build();

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uriComponents.toUri());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<ChallengeDto> showChallenge(@PathVariable Integer id){

        Challenge challenge = challengeService.get(id);

        if(challenge == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(dtoConverter.convertToDto(challenge), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/list")
    public ResponseEntity<List<ChallengeDto>> showList(){

        List<ChallengeDto> challenges = dtoConverter.convertToDtoList(challengeService.getList());
        return new ResponseEntity<>(challenges, HttpStatus.OK);
    }
}
