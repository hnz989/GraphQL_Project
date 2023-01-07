package com.example.request;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateSubjectRequest {

    private String subjectName;
    private Double marksObtained;
}
