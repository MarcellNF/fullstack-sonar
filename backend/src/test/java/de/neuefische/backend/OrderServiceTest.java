package de.neuefische.backend;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    @Test
    void isOrderValid() {
        assertFalse(new OrderService().isOrderValid());
    }
}