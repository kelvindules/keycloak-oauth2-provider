package dev.dules.provider;

import java.util.Set;

import org.keycloak.credential.CredentialInput;
import org.keycloak.credential.CredentialInputUpdater;
import org.keycloak.credential.CredentialInputValidator;
import org.keycloak.credential.CredentialProvider;
import org.keycloak.models.RealmModel;
import org.keycloak.models.UserModel;

public class OauthCredentialProvider implements CredentialProvider, CredentialInputValidator, CredentialInputUpdater {

    @Override
    public boolean updateCredential(RealmModel realm, UserModel user, CredentialInput input) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void disableCredentialType(RealmModel realm, UserModel user, String credentialType) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Set<String> getDisableableCredentialTypes(RealmModel realm, UserModel user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean supportsCredentialType(String credentialType) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isConfiguredFor(RealmModel realm, UserModel user, String credentialType) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isValid(RealmModel realm, UserModel user, CredentialInput input) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
