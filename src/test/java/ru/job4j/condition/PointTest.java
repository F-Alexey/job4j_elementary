package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        Point first = new Point(0, 0);
        Point second = new Point(2, 0);
        double out = first.distance(second);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11to55then5and65() {
        double expected = 5.65;
        Point first = new Point(1, 1);
        Point second = new Point(5, 5);
        double out = first.distance(second);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when10to24then4and12() {
        double expected = 4.12;
        Point first = new Point(1, 0);
        Point second = new Point(2, 4);
        double out = first.distance(second);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when22to48then6and32() {
        double expected = 6.32;
        Point first = new Point(2, 2);
        Point second = new Point(4, 8);
        double out = first.distance(second);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when000to222then3and46() {
        double expected = 3.46;
        Point first = new Point(0, 0, 0);
        Point second = new Point(2, 2, 2);
        double out = first.distance3d(second);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when000to202then2and82() {
        double expected = 2.82;
        Point first = new Point(0, 0, 0);
        Point second = new Point(2, 0, 2);
        double out = first.distance3d(second);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}