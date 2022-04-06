package uz.pdp.appfileuploaddownload.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String fileOriginalName; // pdp.jpg, inn.pdf

    private long size; //   2048000

    private String contentType;  // application,pdf || image,png

    // Bu file system ga saqlqganda kerak bo`ladi
    private String name;  // Papkani ichidan topish uchun
}
