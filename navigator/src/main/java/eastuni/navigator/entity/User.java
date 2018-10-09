package eastuni.navigator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {

	private final String defaultPortrait = "/img/portrait/default.jpg";
	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String username;

	@Column(nullable = false)
	private String realname;

	@Column(nullable = false)
	private String phone;

	@Column
	private String email;

	@Column(nullable = false)
	private String portrait;

	@Column(nullable = false)
	private Boolean delete;

	public User() {
	}

	public User(String username, String realname, String phone) {
		this.username = username;
		this.realname = realname;
		this.phone = phone;
		this.portrait = defaultPortrait;
		this.delete = false;
	}
}
