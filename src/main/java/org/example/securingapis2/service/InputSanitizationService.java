package org.example.securingapis2.service;

import org.owasp.encoder.Encode;
import org.springframework.stereotype.Service;

@Service
public class InputSanitizationService {

    // Method to sanitize inputs to prevent XSS attacks
    public String sanitizeInput(String input) {
        return Encode.forHtml(input);
    }
}

