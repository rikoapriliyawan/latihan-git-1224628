import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentGradeTest {

    private final StudentGrade studentGrade = new StudentGrade();

    @Test
    void nilai90MendapatGradeA() {
        assertEquals("A", studentGrade.calculateGrade(90));
    }

    @Test
    void nilai80MendapatGradeB() {
        assertEquals("B", studentGrade.calculateGrade(80));
    }

    @Test
    void nilai65MendapatGradeC() {
        assertEquals("C", studentGrade.calculateGrade(65));
    }

    @Test
    void nilai55MendapatGradeD() {
        assertEquals("D", studentGrade.calculateGrade(55));
    }

    @Test
    void nilai40MendapatGradeE() {
        assertEquals("E", studentGrade.calculateGrade(40));
    }

    @Test
    void nilaiDiBawahNolMenghasilkanError() {
        assertThrows(
                IllegalArgumentException.class,
                () -> studentGrade.calculateGrade(-1));
    }

    @Test
    void nilaiDiAtasSeratusMenghasilkanError() {
        assertThrows(
                IllegalArgumentException.class,
                () -> studentGrade.calculateGrade(101));
    }
}