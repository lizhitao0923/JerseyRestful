package com.drawthink.iguyuan.exceptions;

public class ExceptionKeys {
	  // 所有的异常key字符串开头都加了E标识，在后面的解析过程中会截取掉E字符，取E字符后面的编号  
    // 如下：“E11110”，变成“11110”，才能与messages_zh_CN.properties中的key一一对应  
    public final static String AUTH_FAILE = "10001";  
    public final static String FILE_UPLOAD_FAILE = "10002";
	public static final String IMAGE_FILE_NOT_FOUND = "10003";  
}
