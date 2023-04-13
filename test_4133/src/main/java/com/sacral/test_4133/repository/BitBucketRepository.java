package com.sacral.test_4133.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sacral.test_4133.model.BitBucket;

public interface BitBucketRepository extends JpaRepository<BitBucket, Long> {

    BitBucket findByUsername(String username);
    void deleteByUsername(String username);
    BitBucket findByPassword(String password);
    void deleteByPassword(String password);
    BitBucket findByUrlAndRepositoryName(String url, String repositoryName);
    void deleteByUrlAndRepositoryName(String url, String repositoryName);
    BitBucket findByTitleAndUsernameAndUrl(String title, String username, String url);
    void deleteByTitleAndUsernameAndUrl(String title, String username, String url);
}