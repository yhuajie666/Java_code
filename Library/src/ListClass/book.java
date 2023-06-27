package ListClass;

import java.sql.Date;

public class book {
	private int id;
	private String title;
	private String writer;
	private String press;
	private Date date;
	private String state;
	
	public book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public book(int id, String title, String writer, String press, Date date, String state) {
		super();
		this.id = id;
		this.title = title;
		this.writer = writer;
		this.press = press;
		this.date = date;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "book [id=" + id + ",title=" + title + ",writer=" + writer + ",press=" + press + ",date=" + date
				+ ",state=" + state + "]";
	}
	
	
}

	
