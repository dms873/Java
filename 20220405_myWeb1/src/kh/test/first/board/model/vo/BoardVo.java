package kh.test.first.board.model.vo;

import java.sql.Timestamp;
import java.util.ArrayList;

public class BoardVo {
//	B_NO         NOT NULL NUMBER         
//	B_TITLE      NOT NULL VARCHAR2(300)  
//	B_CONTENT    NOT NULL VARCHAR2(3000) 
//	B_COUNT      NOT NULL NUMBER         
//	B_WRITE_DATE NOT NULL TIMESTAMP(6)   
//	B_WRITER     NOT NULL VARCHAR2(60)   
//	M_ID         NOT NULL VARCHAR2(20)   
	
	// 이름짓기 중요 !!!! b_no, bNo 
	// 첫글자대문자 NO!!!  절대말아야할것!!!!
//	private int b_no;   
	private int bNo;
	private String bTitle;
	private String bContent;
	private int bCount;
	private Timestamp bWriteDate;
	private String bWriter;
	private String mId;
	private int reCommentCnt;
	// 게시글 1개에 댓글이 여러개
	private ArrayList<ReCommentVo> reVolist;  // 생성자시 초기값 설정하지 않음
	
	
	// 생성자
	public BoardVo() {}
	public BoardVo(String bTitle, String bContent) {
		this.bTitle = bTitle;
		this.bContent = bContent;
	}
	public BoardVo(int bNo, String bTitle, String bContent, int bCount, Timestamp bWriteDate, String bWriter,
			String mId, int reCommentCnt) {
		super();
		this.bNo = bNo;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bCount = bCount;
		this.bWriteDate = bWriteDate;
		this.bWriter = bWriter;
		this.mId = mId;
		this.reCommentCnt = reCommentCnt;
		
	}
	
	@Override
	public String toString() {
		return "BoardVo [bNo=" + bNo + ", bTitle=" + bTitle + ", bContent=" + bContent + ", bCount=" + bCount
				+ ", bWriteDate=" + bWriteDate + ", bWriter=" + bWriter + ", mId=" + mId + ", reCommentCnt="
				+ reCommentCnt + ", reVolist=" + reVolist + "]";
	}
	public int getbNo() {
		return bNo;
	}
	public void setbNo(int bNo) {
		this.bNo = bNo;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public String getbContent() {
		return bContent;
	}
	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	public int getbCount() {
		return bCount;
	}
	public void setbCount(int bCount) {
		this.bCount = bCount;
	}
	public Timestamp getbWriteDate() {
		return bWriteDate;
	}
	public void setbWriteDate(Timestamp bWriteDate) {
		this.bWriteDate = bWriteDate;
	}
	public String getbWriter() {
		return bWriter;
	}
	public void setbWriter(String bWriter) {
		this.bWriter = bWriter;
	}
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public int getReCommentCnt() {
		return reCommentCnt;
	}
	public void setReCommentCnt(int reCommentCnt) {
		this.reCommentCnt = reCommentCnt;
	}
	public ArrayList<ReCommentVo> getReVolist() {
		return reVolist;
	}
	public void setReVolist(ArrayList<ReCommentVo> reVolist) {
		this.reVolist = reVolist;
	}
	


}
