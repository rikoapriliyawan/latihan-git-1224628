public class StudentGrade {

    public String getGrade(int nilai) {
        if (nilai < 0 || nilai > 100) {
            throw new IllegalArgumentException("Nilai harus 0-100");
        }

        if (nilai >= 85) {
            return "A";
        } else if (nilai >= 75) {
            return "B";
        } else if (nilai >= 60) {
            return "C";
        } else if (nilai >= 50) {
            return "D";
        } else {
            return "E";
        }
    }
}