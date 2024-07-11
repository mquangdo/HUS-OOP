package lastterm.year2223.de2.candidatemanager;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        testOriginalData();
        testSortMathsGradeIncreasing();
        testSortMathsGradeDecreasing();
        testSortAverageGradeIncreasing();
        testSortAverageGradeDecreasing();
        testFilterStudentsHighestMathsGrade();
        testFilterStudentsLowestMathsGrade();
        testFilterStudentsHighestAverageGrade();
        testFilterStudentsLowestAverageGrade();

        /*
        TODO

        - Viết code để test cho tất cả các hàm bên dưới.
        - Thực hiện chạy từng hàm test, lưu kết quả chạy chương trình và file text được đặt tên
        là <TenSinhVien_MaSinhVien_CandidateManager>.txt (Ví dụ, NguyenVanA_123456_CandidateManager.txt).
        - Nén các file source code và file text kết quả chạy chương trình vào file zip có tên
        <TenSinhVien_MaSinhVien_CandidateManager>.zip (Ví dụ, NguyenVanA_123456_CandidateManager.zip),
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
                Student student = new Student.StudentBuilder(dataList.get(0))
                        .withLastname(dataList.get(1))
                        .withFirstname(dataList.get(2))
                        .withYearOfBirth(Integer.parseInt(dataList.get(3)))
                        .withMathsGrade(Double.parseDouble(dataList.get(4)))
                        .withPhysicsGrade(Double.parseDouble(dataList.get(5)))
                        .withChemistryGrade(Double.parseDouble(dataList.get(6)))
                        .build();

                StudentManager.getInstance().append(student);


                /*
                TODO

                Đọc được dữ liệu, tạo ra các đối tượng sinh viên ở đây, và cho vào StudentManager để quản lý.
                */
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
        init();
        System.out.println("testOriginalData:");
        String studentIds = StudentManager.getInstance().idOfStudentsToString(StudentManager.getInstance().getStudentList());
        System.out.print(studentIds);
        System.out.println();
    }

    public static void testSortMathsGradeIncreasing() {
        /* TODO */
        System.out.println("\ntestSortMathsGradeIncreasing:");
        MyList student = StudentManager.getInstance().sortMathsGradeIncreasing();
        String id = StudentManager.getInstance().idOfStudentsToString(student);
        System.out.println(id);
        System.out.println();
    }

    public static void testSortMathsGradeDecreasing() {
        /* TODO */
        System.out.println("\ntestSortMathsGradeDecreasing:");
        MyList student = StudentManager.getInstance().sortMathsGradeDecreasing();
        String id = StudentManager.getInstance().idOfStudentsToString(student);
        System.out.println(id);
        System.out.println();
    }

    public static void testSortAverageGradeIncreasing() {
        /* TODO */
        System.out.println("\ntestSortAverageGradeIncreasing:");
        MyList student = StudentManager.getInstance().sortAverageGradeIncreasing();
        String id = StudentManager.getInstance().idOfStudentsToString(student);
        System.out.println(id);
        System.out.println();
    }

    public static void testSortAverageGradeDecreasing() {
        /* TODO */
        System.out.println("\ntestSortAverageGradeDecreasing:");
        MyList student = StudentManager.getInstance().sortAverageGradeDecreasing();
        String id = StudentManager.getInstance().idOfStudentsToString(student);
        System.out.println(id);
        System.out.println();
    }

    public static void testFilterStudentsHighestMathsGrade() {
        /* TODO */
        System.out.println("\ntestFilterStudentsHighestMathsGrade:");
        MyList student = StudentManager.getInstance().filterStudentsHighestMathsGrade(7);
        String id = StudentManager.getInstance().idOfStudentsToString(student);
        System.out.println(id);
        System.out.println();
    }

    public static void testFilterStudentsLowestMathsGrade() {
        /* TODO */
        System.out.println("\ntestFilterStudentsLowestMathsGrade:");
        MyList student = StudentManager.getInstance().filterStudentsLowestMathsGrade(5);
        String id = StudentManager.getInstance().idOfStudentsToString(student);
        System.out.println(id);
        System.out.println();
    }

    public static void testFilterStudentsHighestAverageGrade() {
        /* TODO */
        System.out.println("\ntestFilterStudentsHighestAverageGrade:");
        MyList student = StudentManager.getInstance().filterStudentsHighestAverageGrade(5);
        String id = StudentManager.getInstance().idOfStudentsToString(student);
        System.out.println(id);
        System.out.println();
    }

    public static void testFilterStudentsLowestAverageGrade() {
        /* TODO */
        System.out.println("\ntestFilterStudentsLowestAverageGrade:");
        MyList student = StudentManager.getInstance().filterStudentsLowestAverageGrade(5);
        String id = StudentManager.getInstance().idOfStudentsToString(student);
        System.out.println(id);
        System.out.println();
    }


}
