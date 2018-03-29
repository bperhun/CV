package ua.project.domain;

import org.springframework.web.multipart.MultipartFile;




public class ImageRequest {

	
	private MultipartFile file;
	
	public ImageRequest() {
		
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return "ImageRequest [file=" + file + ", getClass()=" + getClass() + "]";
	}


	
	
	
}