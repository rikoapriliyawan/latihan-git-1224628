import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentGradeTest {

    private final StudentGrade studentGrade = new StudentGrade();

    @Test
    void nilai90MendapatGradeA() {
        assertEquals("A", studentGrade.getGrade(90));
    }

    @Test
    void nilai80MendapatGradeB() {
        assertEquals("B", studentGrade.getGrade(80));
    }

    @Test
    void nilai65MendapatGradeC() {
        assertEquals("C", studentGrade.getGrade(65));
    }

    @Test
    void nilai55MendapatGradeD() {
        assertEquals("D", studentGrade.getGrade(55));
    }

    @Test
    void nilai40MendapatGradeE() {
        assertEquals("E", studentGrade.getGrade(40));
    }

    @Test
    void nilaiDiBawahNolMenghasilkanError() {
        assertThrows(
                IllegalArgumentException.class,
                () -> studentGrade.getGrade(-1));
    }

    @Test
    void nilaiDiAtasSeratusMenghasilkanError() {
        assertThrows(
                IllegalArgumentException.class,
                () -> studentGrade.getGrade(101));
    }
}