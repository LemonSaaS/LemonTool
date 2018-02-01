package com.lemonsaas.lemontool.io.resource;

import java.io.File;

import com.lemonsaas.lemontool.io.FileUtil;
import com.lemonsaas.lemontool.util.URLUtil;

/**
 * 文件资源访问对象
 * 
 * @author looly
 *
 */
public class FileResource extends UrlResource{

	// ----------------------------------------------------------------------- Constructor start
	/**
	 * 构造
	 * 
	 * @param file 文件
	 */
	public FileResource(File file) {
		super(URLUtil.getURL(file));
	}
	
	/**
	 * 构造
	 * 
	 * @param path 文件绝对路径或相对ClassPath路径，但是这个路径不能指向一个jar包中的文件
	 */
	public FileResource(String path) {
		this(FileUtil.file(path));
	}
	// ----------------------------------------------------------------------- Constructor end

}
