package com.sacral.test_4133.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sacral.test_4133.model.BitBucket;
import com.sacral.test_4133.repository.BitBucketRepository;

@Service
public class BitBucketService {

    @Autowired
    private BitBucketRepository bitBucketRepository;

    public BitBucket findByUsername(String username) {
        return bitBucketRepository.findByUsername(username);
    }

    public void deleteByUsername(String username) {
        bitBucketRepository.deleteByUsername(username);
    }

    public BitBucket findByPassword(String password) {
        return bitBucketRepository.findByPassword(password);
    }

    public void deleteByPassword(String password) {
        bitBucketRepository.deleteByPassword(password);
    }

    public BitBucket findByUrlAndRepositoryName(String url, String repositoryName) {
        return bitBucketRepository.findByUrlAndRepositoryName(url, repositoryName);
    }

    public void deleteByUrlAndRepositoryName(String url, String repositoryName) {
        bitBucketRepository.deleteByUrlAndRepositoryName(url, repositoryName);
    }

    public BitBucket findByTitleAndUsernameAndUrl(String title, String username, String url) {
        return bitBucketRepository.findByTitleAndUsernameAndUrl(title, username, url);
    }

    public void deleteByTitleAndUsernameAndUrl(String title, String username, String url) {
        bitBucketRepository.deleteByTitleAndUsernameAndUrl(title, username, url);
    }
}