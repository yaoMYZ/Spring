package edu.scut.pojo;

import java.util.Date;
import org.apache.ibatis.type.Alias;
import lombok.Data;

@Data
@Alias("Blog")
public class Blog {
	private int id;
	private String author;
	private String title;
	private Date createTime;
	private int views;
}
