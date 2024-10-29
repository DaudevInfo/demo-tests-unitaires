package fr.diginamic.utils;

import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;

import static fr.diginamic.utils.StringUtils.levenshteinDistance;
import static org.junit.Assert.assertEquals;

public class StringUtilsTest {


    @Test
    public void test1(){
            assertEquals(0,levenshteinDistance("aa", "aa"));
    }

    @Test
    public void testvide(){
        assertEquals(0,levenshteinDistance("", ""));
    }

    @Test
    public void testEgal(){
        assertEquals(0,levenshteinDistance("awsxs", "awsxs"));
    }

    @Test
    public void testAjout(){
        assertEquals(0,levenshteinDistance("awsxs", "awsxs"));
    }
    @Test
    public void testRetrait(){
        assertEquals(1,levenshteinDistance("chat", "chats"));
    }
    @Test
    public void testMajuscule(){
        assertEquals(1,levenshteinDistance("Awsxs", "awsxs"));
    }
    @Test
    public void testToutDifferent(){
        assertEquals(8,levenshteinDistance("aaaaaaaa", "mmmmmmmm"));
    }

    @Test
    public void testToutDifferent2(){
        assertEquals(8,levenshteinDistance("aaaaaaaa", ""));
    }

}
