package com.community.lcommunity.controller;

import com.community.lcommunity.dto.AccessTokenDTO;
import com.community.lcommunity.dto.GithubUser;
import com.community.lcommunity.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthorizeController {

    @Autowired
    private GithubProvider githubProvider;

    @GetMapping("/callback")
    public String callback(@RequestParam(name = "code") String code,
                           @RequestParam(name = "state") String state) {
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setCode(code);
        accessTokenDTO.setClient_id("Iv1.ddc6e032a0e3d900");
        accessTokenDTO.setRedirect_uri("http://localhost:8087/callback");
        accessTokenDTO.setClient_secret("e59204893fc37dd19dc56a6e93eb47d5e399afa8");
        accessTokenDTO.setState("1");
        String accessToken = githubProvider.getAccessToken(accessTokenDTO);
        GithubUser user = githubProvider.getUser(accessToken);
        return "index";
    }
}
