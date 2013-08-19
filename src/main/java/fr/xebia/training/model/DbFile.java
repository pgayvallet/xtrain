package fr.xebia.training.model;

import fr.xebia.training.core.BaseEntity;

import javax.persistence.*;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;

@Entity
@Table(name = "XT_DB_FILE")
public class DbFile extends BaseEntity {

    @Column(nullable = false)
    private String	fileName;

    @Column(nullable = false)
    private String fileExtension;

    @Column(nullable = false)
    private String	contentType;

    @Column(nullable = false)
    private	Long fileSize;

    @Column
    @Lob
    private Blob content;

    @Transient
    public InputStream getFileStream() throws SQLException {
        if (getContent() == null) {
            return null;
        }
        return getContent().getBinaryStream();
    }

    // get / set

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public Blob getContent() {
        return content;
    }

    public void setContent(Blob content) {
        this.content = content;
    }
}
