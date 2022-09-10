package com.example.unit_test_lab;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    private static int[] A;

    @Rule
    public TestRule rule = new InstantTaskExecutorRule();

    @BeforeClass
    public static void setUp(){
        A = new int[10];
        for(int i = 0; i<A.length; i++){
            A[i] = i+1;
        }
        //Log.d("Unit", "SOMEBODY IM HERE");
    }


    @Test
    public void Min_isCorrect(){
        MainActivity m = new MainActivity();
        assertEquals(1, m.Min(A));
    }


    @Test
    public void Min_isLess_Max(){
        MainActivity m = new MainActivity();
        assertTrue(m.Min(A)<=m.Max(A));
    }


    @Test
    public void Max_isCorrect(){
        MainActivity m = new MainActivity();
        assertEquals(10, m.Max(A));
    }


    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
}