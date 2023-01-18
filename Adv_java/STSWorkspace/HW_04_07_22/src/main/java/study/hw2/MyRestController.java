package study.hw2;

import java.util.List;

import javax.management.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*2.  Write a class Book with properties  String bookName, String author, double cost , getters and setters
	Write a REST CONTROLLER  having controller levelmapping  /book

	GET  /book/getAll      show JSON array of all books in the DB table book
       GET   /book/get/{bookname}      show JSON array of all books having name given by bookName
        GET  /book/allAuthors     show coma separated list of all the authors in the db table 

        POST  /book/add     Pass the book Info as RequestBody and  INSERT row in DB

	PUT    /book/changename/{oldbookName}/{newbookName}    update oldbookName to new name in DB
       PUT    /book/changecost/{bookName/bookCost}    update bookCost for all books with book name  in DB

        DELETE   /book/deletebyname/{bookName}    delete all books with given name from the DB */

@RestController
@RequestMapping(path = "/book")
public class MyRestController {

	@Autowired
	private JdbcTemplate template ;

	@PostMapping("/add")
	public String addBook(@RequestBody Book bk)
	{
		int num = template.update("insert into book value(default,?,?,?)",bk.getBookName(),bk.getAutherName(),bk.getCost());

		return " Updated record "+num;
	}

	@GetMapping("/byName")
	public List<Book> getAll()
	{
		String sql="select * from book";

		return template.query(sql, (rs,rowNum)->new Book(rs.getString(2),rs.getString(3),rs.getInt(4)));

	}

	@PutMapping("/updateName/{oldbookName}/{newbookName}")
	public String updateName(@PathVariable String oldbookName,@PathVariable String newbookName)
	{
		template.update("update book set bookName = ? where bookName = ?",newbookName,oldbookName);
		return "Successfully updated..";
	}

	@DeleteMapping("/deleteName/{bookName}")
	public String deleteName(@PathVariable String bookName)
	{
		template.update("delete from book where bookName=?",bookName);
		return "Deleted Successfully";
	}
/*	
	@GetMapping("/allAuthors")
	public String getAuthors() {
		String str="";

		
		List<Book> list=template.query("select * from books ", (rs,rownum)->{
			return new Book(rs.getString(2),rs.getString(3),rs.getDouble(4));
		});
		
		for(Book bk:list) {
			str=str+bk.getAuthor()+",";
		}
		return str;
	}*/
	
}
