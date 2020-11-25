package com.bcwan.awsimageupload.profile;

import java.util.List;

import com.bcwan.awsimageupload.datastore.FakeUserProfileDataStore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

// this class interacts with the database directly
@Repository
public class UserProfileDataAccessService {
  
  // you can use this class (converted as interface) and switch databases to PostgreSQL or MySQL
  private final FakeUserProfileDataStore fakeUserProfileDataStore;

  @Autowired
  public UserProfileDataAccessService(FakeUserProfileDataStore fakeUserProfileDataStore) {
    this.fakeUserProfileDataStore = fakeUserProfileDataStore;
  }

  List<UserProfile> getUserProfiles() {
    return fakeUserProfileDataStore.getUserProfiles();
  }
}
