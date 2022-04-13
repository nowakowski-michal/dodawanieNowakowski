package com.example.dodawanienowakowski;

import org.junit.Test;

import static org.junit.Assert.*;

public class DodawanieNowakowskiApplicationTest {

    @Test
    public void added() {
        DodawanieNowakowskiApplication dodawanieNowakowskiApplication=new DodawanieNowakowskiApplication();
        assertEquals(10,dodawanieNowakowskiApplication.added(5,5));
    }
}