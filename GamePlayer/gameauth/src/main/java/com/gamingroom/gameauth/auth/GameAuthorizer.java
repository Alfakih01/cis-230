package com.gamingroom.gameauth.auth;

import io.dropwizard.auth.Authorizer;

public class GameAuthorizer implements Authorizer<GameUser> 
{
    @Override
    public boolean authorize(GameUser user, String role) {

        GameUser user = new GameUser(credentials.getUsername());
        user.setRoles(VALID_USERS.get(credentials.getUsername()));
        return Optional.of(user);
    	
    }
}