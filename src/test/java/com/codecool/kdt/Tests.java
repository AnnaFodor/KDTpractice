package com.codecool.kdt;


import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Tests {

    private Keywords keywords = new Keywords();

    @BeforeEach
    void openThePage() {
        keywords.openTheBaseUrl();
    }

    @AfterEach
    void closeThePage() {
        keywords.closeDriver();
    }

    @Test
    void testNavigation() {
        keywords.navigation();
        Assert.assertTrue(keywords.validateNavigation());
    }
}
