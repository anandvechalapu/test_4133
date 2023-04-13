package com.sacral.test_4133.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.test_4133.model.ForgotPasswordReset;
import com.sacral.test_4133.model.BitBucket;
import com.sacral.test_4133.service.ForgotPasswordResetService;
import com.sacral.test_4133.service.BitBucketService;

@RestController
@RequestMapping("/test_4133")
public class Test4133Controller {
    
    @Autowired
    private ForgotPasswordResetService forgotPasswordResetService;
    
    @Autowired
    private BitBucketService bitBucketService;
    
    @GetMapping("/forgot-password-reset/userId")
    public ForgotPasswordReset getForgotPasswordResetByUserId(String userId) {
        return forgotPasswordResetService.findByUserId(userId);
    }
    
    @PostMapping("/forgot-password-reset/password")
    public void updatePassword(@RequestBody ForgotPasswordReset forgotPasswordReset) {
        forgotPasswordResetService.updatePassword(forgotPasswordReset.getUserId(), forgotPasswordReset.getPassword());
    }
    
    @PostMapping("/forgot-password-reset/confirm-password")
    public void updateConfirmPassword(@RequestBody ForgotPasswordReset forgotPasswordReset) {
        forgotPasswordResetService.updateConfirmPassword(forgotPasswordReset.getUserId(), forgotPasswordReset.getConfirmPassword());
    }
    
    @GetMapping("/bitbucket/username")
    public BitBucket getBitBucketByUsername(String username) {
        return bitBucketService.findByUsername(username);
    }
    
    @PostMapping("/bitbucket/username")
    public void deleteByUsername(@RequestBody BitBucket bitBucket) {
        bitBucketService.deleteByUsername(bitBucket.getUsername());
    }
    
    @GetMapping("/bitbucket/password")
    public BitBucket getBitBucketByPassword(String password) {
        return bitBucketService.findByPassword(password);
    }
    
    @PostMapping("/bitbucket/password")
    public void deleteByPassword(@RequestBody BitBucket bitBucket) {
        bitBucketService.deleteByPassword(bitBucket.getPassword());
    }
    
    @GetMapping("/bitbucket/url-repository-name")
    public BitBucket getBitBucketByUrlAndRepositoryName(String url, String repositoryName) {
        return bitBucketService.findByUrlAndRepositoryName(url, repositoryName);
    }
    
    @PostMapping("/bitbucket/url-repository-name")
    public void deleteByUrlAndRepositoryName(@RequestBody BitBucket bitBucket) {
        bitBucketService.deleteByUrlAndRepositoryName(bitBucket.getUrl(), bitBucket.getRepositoryName());
    }
    
    @GetMapping("/bitbucket/title-username-url")
    public BitBucket getBitBucketByTitleAndUsernameAndUrl(String title, String username, String url) {
        return bitBucketService.findByTitleAndUsernameAndUrl(title, username, url);
    }
    
    @PostMapping("/bitbucket/title-username-url")
    public void deleteByTitleAndUsernameAndUrl(@RequestBody BitBucket bitBucket) {
        bitBucketService.deleteByTitleAndUsernameAndUrl(bitBucket.getTitle(), bitBucket.getUsername(), bitBucket.getUrl());
    }
}