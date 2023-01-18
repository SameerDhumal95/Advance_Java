package study.jpa;
/*In the SAME application add an entity User mapped to user table 
	uname, password 
    
	Write a RestController
	1.  POST  /login   in the request body pass uname and password
					check if the database has matching row
					if yes return statuscode 200
					else return statuscode 404
				( return type is ResponseEntity  )

	2.   GET  /allUsers  = show list of all usernames only
	3.   PUT  /changepwd/{uname}/{oldpwd}/{newpwd}
			change password only if oldpwd is correct
       4.   DELETE   /removeuser/{uname}/{pwdForadmin}
			remove given uname if the pwdForadmin user is correct*/

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="user")
public class UserEntity {

	
	    @Id
		@Column(name = "User_Name")
		private String uname;

		@Column(name = "User_Password")
		private String pass;

		public UserEntity()
		{
			
		}

		public String getUname() {
			return uname;
		}

		public void setUname(String uname) {
			this.uname = uname;
		}

		public String getPass() {
			return pass;
		}

		public void setPass(String pass) {
			this.pass = pass;
		}

		@Override
		public String toString() {
			return "UserEntity [uname=" + uname + ", pass=" + pass + "]";
		}

		
		
}
