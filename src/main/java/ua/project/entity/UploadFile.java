package ua.project.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="upload_file") 
public class UploadFile extends BaseEntity{

	@Column(name="file_name")
	private String fileName;
	
	@Lob
	@Column(name="file_data", length = 1000000)
	private byte[] fileData;
	
	public UploadFile() {
		
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public byte[] getFileData() {
		return fileData;
	}

	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
	}

	@Override
	public String toString() {
		return "UploadFile [fileName=" + fileName + ", fileData=" + Arrays.toString(fileData) + ", getId()=" + getId()
				+ "]";
	}
	
	

}

