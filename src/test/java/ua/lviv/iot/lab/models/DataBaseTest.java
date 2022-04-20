package ua.lviv.iot.lab.models;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DataBaseTest {

    @Test
    void testDataBaseGetMembersMethod() {
        assertEquals(13,DataBase.getMembers().size());
    }
}