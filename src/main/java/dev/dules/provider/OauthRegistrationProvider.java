package dev.dules.provider;

import java.util.List;
import java.util.Map;

import org.keycloak.models.GroupModel;
import org.keycloak.models.RealmModel;
import org.keycloak.models.UserModel;
import org.keycloak.storage.UserStorageProvider;
import org.keycloak.storage.user.UserQueryProvider;
import org.keycloak.storage.user.UserRegistrationProvider;

public class OauthRegistrationProvider implements UserStorageProvider, UserRegistrationProvider, UserQueryProvider {

    @Override
    public void close() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int getUsersCount(RealmModel realm) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<UserModel> getUsers(RealmModel realm) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<UserModel> getUsers(RealmModel realm, int firstResult, int maxResults) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<UserModel> searchForUser(String search, RealmModel realm) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<UserModel> searchForUser(String search, RealmModel realm, int firstResult, int maxResults) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<UserModel> searchForUser(Map<String, String> params, RealmModel realm) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<UserModel> searchForUser(Map<String, String> params, RealmModel realm, int firstResult,
            int maxResults) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<UserModel> getGroupMembers(RealmModel realm, GroupModel group, int firstResult, int maxResults) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<UserModel> getGroupMembers(RealmModel realm, GroupModel group) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<UserModel> searchForUserByUserAttribute(String attrName, String attrValue, RealmModel realm) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserModel addUser(RealmModel realm, String username) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean removeUser(RealmModel realm, UserModel user) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
