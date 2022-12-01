package kr.or.ddit.vo;

import java.util.Date;

public class AttachVO {
	private Date regdate;
	private String attachName;
	private String attachType;
	private String filename;
	private String tid;
	private String userNo;
	private int attachSize;
	private int filesize;
	private int seq;
	
	public AttachVO() {
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public String getAttachName() {
		return attachName;
	}
	public void setAttachName(String attachName) {
		this.attachName = attachName;
	}
	public String getAttachType() {
		return attachType;
	}
	public void setAttachType(String attachType) {
		this.attachType = attachType;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public int getAttachSize() {
		return attachSize;
	}
	public void setAttachSize(int attachSize) {
		this.attachSize = attachSize;
	}
	public int getFilesize() {
		return filesize;
	}
	public void setFilesize(int filesize) {
		this.filesize = filesize;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	@Override
	public String toString() {
		return "AttachVO [regdate=" + regdate + ", attachName=" + attachName + ", attachType=" + attachType
				+ ", filename=" + filename + ", tid=" + tid + ", userNo=" + userNo + ", attachSize=" + attachSize
				+ ", filesize=" + filesize + ", seq=" + seq + "]";
	}
	
	
}
