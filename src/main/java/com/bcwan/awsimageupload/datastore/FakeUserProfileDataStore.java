package com.bcwan.awsimageupload.datastore;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.bcwan.awsimageupload.profile.UserProfile;

import org.springframework.stereotype.Repository;

@Repository
public class FakeUserProfileDataStore {
  
  private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

  // adds these rows on run-time
  static {
    USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "brianwan", null));
    USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "chengxiao", null));
  }

  public List<UserProfile> getUserProfiles() {
    return USER_PROFILES;
  }


}
