package com.sacral.test_4133.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sacral.test_4133.repository.ForgotPasswordResetRepository;

@Service
public class ForgotPasswordResetService {

    @Autowired
    private ForgotPasswordResetRepository forgotPasswordResetRepository;
    
    public ForgotPasswordReset findByUserId(String userId) {
        return forgotPasswordResetRepository.findByUserId(userId);
    }
    
    @Transactional
    public void updatePassword(String userId, String password) {
        forgotPasswordResetRepository.updatePassword(userId, password);
    }
    
    @Transactional
    public void updateConfirmPassword(String userId, String confirmPassword) {
        forgotPasswordResetRepository.updateConfirmPassword(userId, confirmPassword);
    }
}