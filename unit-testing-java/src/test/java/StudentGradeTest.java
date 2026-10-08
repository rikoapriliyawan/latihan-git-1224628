import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class StudentGradeTest {

    private final StudentGrade studentGrade = new StudentGrade();

    // Test calculateGrade()

    @Test
    void testCalculateGradeBelowZero() {
        assertThrows(IllegalArgumentException.class,
                () -> studentGrade.calculateGrade(-1));
    }

    @Test
    void testCalculateGradeAbove100() {
        assertThrows(IllegalArgumentException.class,
                () -> studentGrade.calculateGrade(101));
    }

    @Test
    void testCalculateGradeA() {
        assertEquals("A", studentGrade.calculateGrade(80));
    }

    @Test
    void testCalculateGradeB() {
        assertEquals("B", studentGrade.calculateGrade(70));
    }

    @Test
    void testCalculateGradeC() {
        assertEquals("C", studentGrade.calculateGrade(60));
    }

    @Test
    void testCalculateGradeD() {
        assertEquals("D", studentGrade.calculateGrade(50));
    }

    @Test
    void testCalculateGradeE() {
        assertEquals("E", studentGrade.calculateGrade(49));
    }

    // Test isPassed()

    @Test
    void testIsPassedTrue() {
        assertTrue(studentGrade.isPassed(60));
    }

    @Test
    void testIsPassedFalse() {
        assertFalse(studentGrade.isPassed(59));
    }

    @Test
    void testIsPassedBelowZero() {
        assertThrows(IllegalArgumentException.class,
                () -> studentGrade.isPassed(-1));
    }

    @Test
    void testIsPassedAbove100() {
        assertThrows(IllegalArgumentException.class,
                () -> studentGrade.isPassed(101));
    }
}