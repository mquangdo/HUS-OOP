package lastterm.year2223.de2.studentmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        testOriginalData();
        testFilterStudentsHigherThanAverageGrade();
        testFilterStudentsHighestAverageGrade();
        testFilterStudentsHighestMathsGrade();
        testFilterStudentsLowerThanAverageGrade();
        testFilterStudentsLowestAverageGrade();
        testFilterStudentsLowestMathsGrade();
        testSortAverageGradeDecreasing();
        testSortAverageGradeIncreasing();
        testSortYearOfBirthDecreasing();
        testSortYearOfBirthIncreasing();



        /*
        TODO

        - Viết code để test cho tất cả các hàm bên dưới.
        - Thực hiện chạy từng hàm test, lưu kết quả chạy chương trình và file text được đặt tên
        là <TenSinhVien_MaSinhVien_StudentManager>.txt (Ví dụ, NguyenVanA_123456_StudentManager.txt).
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
        <TenSinhVien_MaSinhVien_StudentManager>.zip (Ví dụ, NguyenVanA_123456_StudentManager.zip),
        nộp lên classroom.
         */
    }

    public static void init() {
        String filePath = "src/lastterm/year2223/de2/data/students.csv";
        readListData(filePath);
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 7) {
                    continue;
                }

                if (dataList.get(0).equals("id")) {
                    continue;
                }

                /*
                TODO

                Đọc được dữ liệu, tạo ra các đối tượng sinh viên ở đây, và cho vào StudentManager để quản lý.
                */
                Student student = new Student.StudentBuilder(dataList.get(0))
                        .withLastname(dataList.get(1))
                        .withFirstname(dataList.get(2))
                        .withYearOfBirth(Integer.parseInt(dataList.get(3)))
                        .withMathsGrade(Double.parseDouble(dataList.get(4)))
                        .withPhysicsGrade(Double.parseDouble(dataList.get(5)))
                        .withChemistryGrade(Double.parseDouble(dataList.get(6)))
                        .build();

                StudentManager.getInstance().append(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void testOriginalData() {
        System.out.println("\ntestOriginalData:");
        init();
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().getStudentList());
        System.out.print(studentIds);
        System.out.println();
    }

    public static void testSortYearOfBirthIncreasing() {
        System.out.println("\ntestSortYearOfBirthIncreasing:");
        List<Student> students = StudentManager.getInstance().sortYearOfBirthIncreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
        System.out.println();
    }

    public static void testSortYearOfBirthDecreasing() {
        System.out.println("\ntestSortYearOfBirthDecreasing");
        List<Student> students = StudentManager.getInstance().sortYearOfBirthDecreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
        System.out.println();
    }

    public static void testSortAverageGradeIncreasing() {
        /* TODO */
        System.out.println("\ntestSortAverageGradeIncreasing:");
        List<Student> students = StudentManager.getInstance().sortAverageGradeIncreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
        System.out.println();
    }

    public static void testSortAverageGradeDecreasing() {
        /* TODO */
        System.out.println("\ntestSortAverageGradeDecreasing:");
        List<Student> students = StudentManager.getInstance().sortAverageGradeDecreasing();
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(students);
        System.out.print(studentIdsString);
        System.out.println();
    }

    public static void testFilterStudentsHighestMathsGrade() {
        System.out.println("\ntestFilterStudentsHighestMathsGrade:");
        List<Student> students = StudentManager.getInstance().sortMathsGradeDecreasing();
        List<Student> nHighestMathsGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nHighestMathsGradeStudents.add(students.get(i));
        }
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nHighestMathsGradeStudents);
        System.out.print(studentIdsString);
        System.out.println();
    }

    public static void testFilterStudentsLowestMathsGrade() {
        System.out.println("\ntestFilterStudentsLowestMathsGrade:");
        List<Student> students = StudentManager.getInstance().sortMathsGradeIncreasing();
        List<Student> nLowestMathsGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nLowestMathsGradeStudents.add(students.get(i));
        }

        String codeString = StudentManager.getInstance().idOfStudentsToString(nLowestMathsGradeStudents);
        System.out.print(codeString);
        System.out.println();
    }

    public static void testFilterStudentsHighestAverageGrade() {
        /* TODO */
        System.out.println("\ntestFilterStudentsHighestAverageGrade:");
        List<Student> students = StudentManager.getInstance().sortAverageGradeDecreasing();
        List<Student> nHighestAverageGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nHighestAverageGradeStudents.add(students.get(i));
        }
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nHighestAverageGradeStudents);
        System.out.print(studentIdsString);
        System.out.println();
    }

    public static void testFilterStudentsLowestAverageGrade() {
        /* TODO */
        System.out.println("\ntestFilterStudentsLowestAverageGrade:");
        List<Student> students = StudentManager.getInstance().sortAverageGradeIncreasing();
        List<Student> nLowestAverageGradeStudents = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            nLowestAverageGradeStudents.add(students.get(i));
        }
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nLowestAverageGradeStudents);
        System.out.print(studentIdsString);
        System.out.println();
    }

    public static void testFilterStudentsHigherThanAverageGrade() {
        /* TODO */
        System.out.println("\ntestFilterStudentsHigherThanAverageGrade:");
        List<Student> students = StudentManager.getInstance().filterStudentsHigherThanAverageGrade(7);
        List<Student> nHigherAverage = new LinkedList<>();
        int minLength = Math.min(5, students.size());
        for (int i = 0; i < minLength; i++){
            nHigherAverage.add(students.get(i));
        }
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nHigherAverage);
        System.out.println(studentIdsString);
        System.out.println();
    }

    public static void testFilterStudentsLowerThanAverageGrade() {
        /* TODO */
        System.out.println("\ntestFilterStudentsLowerThanAverageGrade");
        List<Student> students = StudentManager.getInstance().filterStudentsLowerThanAverageGrade(5);
        List<Student> nLowerAverage = new LinkedList<>();
        int minLength = Math.min(5, students.size());
        for (int i = 0; i < minLength; i++){
            nLowerAverage.add(students.get(i));
        }
        String studentIdsString = StudentManager.getInstance().idOfStudentsToString(nLowerAverage);
        System.out.println(studentIdsString);
        System.out.println();
    }
}
