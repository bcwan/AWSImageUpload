package com.bcwan.awsimageupload.profile;

import java.util.UUID;

public class UserProfile {

  private final UUID userProfileId;
  private final String username;
  private String userProfileImageLink; // for S3 key

  public UserProfile(UUID userProfileId, String username, String userProfileImageLink) {
    this.userProfileId = userProfileId;
    this.username = username;
    this.setUserProfileImageLink(userProfileImageLink);
  }

  public UUID getUserProfileId() {
    return userProfileId;
  }

  public String getUsername() {
    return username;
  }

  public String getUserProfileImageLink() {
    return userProfileImageLink;
  }

  public void setUserProfileImageLink(String userProfileImageLink) {
    this.userProfileImageLink = userProfileImageLink;
  }
  
}
