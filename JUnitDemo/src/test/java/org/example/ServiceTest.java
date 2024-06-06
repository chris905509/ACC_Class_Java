package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    @Test
   public void add() {
        Service obj=new Service();
       int z= obj.add(5,3);

        Assertions.assertEquals(8,z);


    }
    @Test
    public void add2() {
        Service obj=new Service();
        int z= obj.add(-5,5);

        Assertions.assertEquals(0,z);


    }





}