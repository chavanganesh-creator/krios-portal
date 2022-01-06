package com.kriosportal.service;
import java.util.List;
import java.util.Optional;

import org.springframework.web.multipart.MultipartFile;

import com.kriosportal.bean.DocsBean;
import com.kriosportal.entity.Docs;
import com.kriosportal.entity.User;

/*
 * Service class for Documents
 * author Deepak
 * date 22/11/2021
 */

public interface DocumentsService {

	public List<Docs> getDocsByuserIdFk(int userId);
	
	public Optional<Docs> getFile(Integer fileId);

	public List<Docs> getFiles();

	public boolean saveFile(MultipartFile file ,DocsBean docsBean , User user);
	
	public boolean deleteDocs(int docId);
}
