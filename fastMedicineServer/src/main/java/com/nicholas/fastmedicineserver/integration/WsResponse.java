package com.nicholas.fastmedicineserver.integration;



public class WsResponse<T>
{
	public String getResCode()
	{
		return resCode;
	}

	public void setResCode(String resCode)
	{
		this.resCode = resCode;
	}

	public String getResMsg()
	{
		return resMsg;
	}

	public void setResMsg(String resMsg)
	{
		this.resMsg = resMsg;
	}

	public T getContent()
	{
		return content;
	}

	public void setContent(T content)
	{
		this.content = content;
	}

	
	
	private String resCode;
	private String resMsg;
	private T content;

	public WsResponse(String rescode, String resmsg)
	{
		super();
		this.setResCode(rescode);
		this.setResMsg(resmsg);
	}

	public WsResponse(String rescode, String resmsg, T content)
	{
		super();
		this.setResCode(rescode);
		this.setResMsg(resmsg);
		this.setContent(content);
	}
	
	public static <T> WsResponse<T> response(String status, String msg)
	{
		return new WsResponse<T>(status, msg);
	}

	public static <T> WsResponse<T> response(String status, String msg, T data)
	{
		return new WsResponse<T>(status, msg, data);
	}
	
	
	public static <T> WsResponse<T> successResponse(T data) {
		return new WsResponse<T>("0","success",data);
	}
	
	public static <T> WsResponse<T> successResponse() {
		return new WsResponse<T>("0","success");
	}
	

}
