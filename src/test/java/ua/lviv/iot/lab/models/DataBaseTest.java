package ua.lviv.iot.lab.models;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class DataBaseTest {

    @Test
    void testDataBaseGetMembersMethod() {
        assertEquals(26,DataBase.getMembers().size());
    }
}