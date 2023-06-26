package com.sikshya.joblisting.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "job_post")
 public class Post {
    private String profile;
    private String desc;
    private int exp;
    private String[] techs;
}
