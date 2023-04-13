package com.sacral.test_4133.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ForgotPasswordResetRepository extends JpaRepository<ForgotPasswordReset, Long> {
    
    @Query("SELECT fp FROM ForgotPasswordReset fp WHERE fp.userId = :userId")
    public ForgotPasswordReset findByUserId(@Param("userId") String userId);
    
    @Modifying
    @Query("UPDATE ForgotPasswordReset fp SET fp.password = :password WHERE fp.userId = :userId")
    public void updatePassword(@Param("userId") String userId, @Param("password") String password);
    
    @Modifying
    @Query("UPDATE ForgotPasswordReset fp SET fp.confirmPassword = :confirmPassword WHERE fp.userId = :userId")
    public void updateConfirmPassword(@Param("userId") String userId, @Param("confirmPassword") String confirmPassword);
}