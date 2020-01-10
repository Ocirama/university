package lt.sdacademy.university.model.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

    @Getter
    @Setter
    @AllArgsConstructor
    public class University {

        /*private String title;*/
        private String title;
        private List<String> studyPrograms;
        /*private List<String> lecturers;*/
}
