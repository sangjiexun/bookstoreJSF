package demo;

/**
 * Created by 155130E on 12/12/2016.
 */
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name="bookBean")
@ViewScoped
public class BookBean {
    Book book;
    @PostConstruct
    public void init() {
        BookDAO dao = new BookDAO();
        book = dao.getBook();
    }
    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }
}
